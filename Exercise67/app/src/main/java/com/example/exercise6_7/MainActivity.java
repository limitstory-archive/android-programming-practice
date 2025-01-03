package com.example.exercise6_7;


import android.graphics.Color;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener{

    static ActionBar.Tab tabDog;
    static ActionBar.Tab tabCat;
    static ActionBar.Tab tabRabbit;
    static ActionBar.Tab tabHorse;
    MyTabFragment myFrags[] = new MyTabFragment[4];

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabDog = bar.newTab();
        tabDog.setIcon(R.drawable.icon_dog);
        tabDog.setTabListener(this);
        bar.addTab(tabDog);

        tabCat = bar.newTab();
        tabCat.setIcon(R.drawable.icon_cat);
        tabCat.setTabListener(this);
        bar.addTab(tabCat);

        tabRabbit = bar.newTab();
        tabRabbit.setIcon(R.drawable.icon_rabbit);
        tabRabbit.setTabListener(this);
        bar.addTab(tabRabbit);

        tabHorse = bar.newTab();
        tabHorse.setIcon(R.drawable.icon_horse);
        tabHorse.setTabListener(this);
        bar.addTab(tabHorse);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        MyTabFragment myTabFrag = null;

        if (myFrags[tab.getPosition()] == null) {

            myTabFrag = new MyTabFragment();
            Bundle data = new Bundle();
            data.putString("tabIcon", tab.getIcon().toString());

            myTabFrag.setArguments(data);
            myFrags[tab.getPosition()] = myTabFrag;
        } else
            myTabFrag = myFrags[tab.getPosition()];


        ft.replace(android.R.id.content, myTabFrag);

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    public static class MyTabFragment extends androidx.fragment.app.Fragment {
        String tabIcon;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle data = getArguments();
            tabIcon = data.getString("tabIcon");

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View myView = inflater.inflate(R.layout.activity_main ,null);
            ImageView Dog, Cat, Rabbit, Horse;

            Dog = (ImageView) myView.findViewById(R.id.dog);
            Cat = (ImageView) myView.findViewById(R.id.cat);
            Rabbit = (ImageView) myView.findViewById(R.id.rabbit);
            Horse = (ImageView) myView.findViewById(R.id.horse);

            if (tabDog.getIcon().toString().equals(tabIcon)) {
                Dog.setVisibility(View.VISIBLE);
                Cat.setVisibility(View.GONE);
                Rabbit.setVisibility(View.GONE);
                Horse.setVisibility(View.GONE);
            }
            if (tabCat.getIcon().toString().equals(tabIcon)) {
                Dog.setVisibility(View.GONE);
                Cat.setVisibility(View.VISIBLE);
                Rabbit.setVisibility(View.GONE);
                Horse.setVisibility(View.GONE);
            }
            if (tabRabbit.getIcon().toString().equals(tabIcon)) {
                Dog.setVisibility(View.GONE);
                Cat.setVisibility(View.GONE);
                Rabbit.setVisibility(View.VISIBLE);
                Horse.setVisibility(View.GONE);
            }
            if (tabHorse.getIcon().toString().equals(tabIcon)) {
                Dog.setVisibility(View.GONE);
                Cat.setVisibility(View.GONE);
                Rabbit.setVisibility(View.GONE);
                Horse.setVisibility(View.VISIBLE);
            }

            return myView;
        }

    }
}