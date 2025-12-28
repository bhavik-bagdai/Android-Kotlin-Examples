# Chapter 2: Android Activity Lifecycle

This chapter contains Android application examples demonstrating Activity lifecycle concepts.

## 📱 Projects

### Activity Lifecycle Demo

A complete Android application demonstrating all Activity lifecycle methods.

**📦 Download:** [ActivityLifeCycle.zip](https://github.com/bhavik-bagdai/Android-Kotlin-Examples/archive/refs/heads/main.zip) *(Extract and navigate to `ch2/ActivityLifeCycle`)*

**Direct Project Link:** [View on GitHub](https://github.com/bhavik-bagdai/Android-Kotlin-Examples/tree/main/ch2/ActivityLifeCycle)

---

## 📋 Project Details

### ActivityLifeCycle

**Package:** `com.example.activitylifecycledemo`  
**Min SDK:** 21  
**Target SDK:** 36  
**Compile SDK:** 36

#### Features Demonstrated

✅ **Complete Activity Lifecycle Methods:**
- `onCreate()` - Activity is being created
- `onStart()` - Activity is becoming visible
- `onResume()` - Activity is ready for user interaction
- `onPause()` - Activity is losing focus
- `onStop()` - Activity is no longer visible
- `onDestroy()` - Activity is being destroyed
- `onRestart()` - Activity is being restarted after being stopped

#### Key Components

- **MainActivity.kt** - Main activity with lifecycle logging
- Uses `Log.d()` to track lifecycle state changes
- Demonstrates Edge-to-Edge UI with `enableEdgeToEdge()`

---

## 🚀 How to Run the Project

### Option 1: Download from GitHub

1. **Download the repository:**
   ```bash
   wget https://github.com/bhavik-bagdai/Android-Kotlin-Examples/archive/refs/heads/main.zip
   unzip main.zip
   cd Android-Kotlin-Examples-main/ch2/ActivityLifeCycle
   ```

2. **Open in Android Studio:**
   - File → Open → Navigate to `ActivityLifeCycle` folder
   - Let Gradle sync complete
   - Run the app on an emulator or device

### Option 2: Clone the Repository

```bash
git clone https://github.com/bhavik-bagdai/Android-Kotlin-Examples.git
cd Android-Kotlin-Examples/ch2/ActivityLifeCycle
```

Open the project in Android Studio.

### Option 3: Download Specific Folder

Use a GitHub folder downloader or:

```bash
# Using sparse checkout
git clone --no-checkout https://github.com/bhavik-bagdai/Android-Kotlin-Examples.git
cd Android-Kotlin-Examples
git sparse-checkout init --cone
git sparse-checkout set ch2/ActivityLifeCycle
git checkout main
```

---

## 🔍 Testing the Lifecycle

To observe the Activity lifecycle in action:

1. **Open Android Studio Logcat**
   - View → Tool Windows → Logcat
   - Filter by tag: `MainActivity`

2. **Perform these actions:**
   - **Launch the app** → Observe: `onCreate()` → `onStart()` → `onResume()`
   - **Press Home button** → Observe: `onPause()` → `onStop()`
   - **Return to app** → Observe: `onRestart()` → `onStart()` → `onResume()`
   - **Press Back button** → Observe: `onPause()` → `onStop()` → `onDestroy()`
   - **Rotate device** → Observe: Full lifecycle (destroy and recreate)

---

## 📖 Learning Objectives

After running this project, you will understand:

- ✅ The complete Android Activity lifecycle
- ✅ When each lifecycle method is called
- ✅ How to use logging to debug lifecycle issues
- ✅ Configuration changes and Activity recreation
- ✅ Best practices for managing resources in different lifecycle states

---

## 🛠️ Project Structure

```
ActivityLifeCycle/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/activitylifecycledemo/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   └── layout/
│   │   │   │       └── mainactivity.xml
│   │   │   └── AndroidManifest.xml
│   │   ├── androidTest/
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

---

## 📝 Additional Resources

- [Android Activity Lifecycle Documentation](https://developer.android.com/guide/components/activities/activity-lifecycle)
- [Handling Lifecycles with Lifecycle-Aware Components](https://developer.android.com/topic/libraries/architecture/lifecycle)

---

## 💡 Tips

- Always call the super implementation first in lifecycle methods
- Use lifecycle methods appropriately for resource management
- Be aware of configuration changes causing Activity recreation
- Test your app by putting it in the background and bringing it back

---

**Repository:** [Android-Kotlin-Examples](https://github.com/bhavik-bagdai/Android-Kotlin-Examples)  
**Chapter:** 2 - Android Activity Lifecycle
