# Change-Color-
Android app written in Java for Web Apps class at Brooklyn College
Requirement: Write JAVA program to change a color of a drawable object via keyboard or mouse input.

The app prompts user for a color and changes the color of specified png graphic used as a drawable android resource.

# Build gradle config detail
Required software:
Android Studio for running on emulator device or to create .apk for install on real device.

android {
    compileSdkVersion 29
    defaultConfig {
        applicationId "com.example.changecolorjava"
        minSdkVersion 15
        targetSdkVersion 29
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
