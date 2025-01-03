# BreadApp 클래스 역할 및 특징

## 역할
-

## 특징
- Application 클래스를 상속 받음


* * *

# 변수 역할

- DISPLAY_HEIGHT_PX: 디스플레이 높이 픽셀
- HOST: ip를 가지고 있고 양방향 통신이 가능한 컴퓨터("api.loafwallet.org")
- isBackgroundChecker: 배경 확인?
- backgroundedTime: 배경시간?

- currentActivity: (private타입) 현재활동?



* * *

# 메소드 역할

## onCreate()  
- 활동의 전체 수명 주기 동안 한 번만 발생해야 하는 기본 애플리케이션 시작 로직을 실행
- [참고 설명](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ko)

- 오버라이딩(재구현함)
- (참고)크래시리틱스(Crasshlytics): 앱에서 충돌이 일어날 때 무엇이 문제인지 알아내는 것이 중요한데 크래시리틱스는 충돌을 찾아내서 어떤 코드가 문제를 일으키는지 찾아줌
- 포인트 사이즈 객체 생성
- 디스플레이 사이즈를 함수로 갖고 옴
- size.y의 값을 DISPLAY_HEIGHT_PX에 저장 




## getBreadContext()
- currentActivity(현재활동)이 NULL이면 SyncReceiver.app, NULL이 아니면 currentActivity을 리턴함.
- SyncReceiver.app: 




## setBreadContext(Activity app)
- app값을 currentActivity에 저장(currentActivity = app)




## fireListeners()
- if문(listeners가 null이면 리턴): 듣는 사람이 없으면 리턴?
- for (OnAppBackgrounded lis : listeners) lis.onBackgrounded();




## addOnBackgroundedListener(OnAppBackgrounded listener)
- listeners가 없으면 listeners = new ArrayList<>()를 생성(배열 리스트를 생성)
- listeners가 포함 안되어 있으면 listeners를 포함한다. (listeners.add(listener);)




## isAppInBackground(final Context context)
- Context클래스의 context가 null이거나(or) activityCounter.get() <= 0이면 리턴




## onStop(final BRActivity app)
-  활동이 사용자에게 더 이상 표시되지 않으면 중단됨 상태에 들어가고, 시스템은 onStop() 콜백을 호출함.
- 사용자가 멀티 윈도우 모드에서 활동을 보고 있더라도 UI 관련 작업이 계속 진행됨.
- [참고 설명](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ko)




## run() 
- onStop()내에 있음, 오버라이딩함(재구현)
- 무슨 역할을 하는지 잘모르겠음.




## OnAppBackgrounded 
- void onBackgrounded()을 실행시킴




## CrashReportingTree
- 오류 보고를 하는 클래스
- priority(우선권), 

## log(int priority, String tag, String message, Throwable throwable)
- CrashReportingTree 클래스 내에 들어있는 오버라이딩된 함수

