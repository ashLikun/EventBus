[![Release](https://jitpack.io/v/ashLikun/eventbus.svg)](https://jitpack.io/#ashLikun/eventbus)




# **AndroidEventBus**
对开源框架eventbus增加tag功能,只有订阅和发布的tag一致才会触发事件


### 1.用法
使用前，对于Android Studio的用户，可以选择添加:

```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
并且:

```gradle
dependencies {
    compile 'com.github.ashLikun:eventbus:{latest version}'
}
```


	EventBus.getDefault().post("event","tag2");

    EventBus.getDefault().post("tag1");
    @Subscribe(tag = "tag1")
    public void aaa() {
    }

    EventBus.getDefault().post("tag2");
    @Subscribe(tag = "tag2")
    public void aaa(String event) {
    }

