# Chapter 2: Android Activity Lifecycle

This chapter contains Android application examples demonstrating Activity lifecycle concepts.

## 📱 Projects

### Activity Lifecycle Demo

A complete Android application demonstrating all Activity lifecycle methods.

**📦 Download Options:**

| Option | Link | Description |
|--------|------|-------------|
| **Full Repository** | [Download ZIP](https://github.com/bhavik-bagdai/Android-Kotlin-Examples/archive/refs/heads/main.zip) | Download entire repository, extract `ch2/ActivityLifeCycle` |
| **Project Only** | [Download ActivityLifeCycle](https://download-directory.github.io/?url=https://github.com/bhavik-bagdai/Android-Kotlin-Examples/tree/main/ch2/ActivityLifeCycle) | Download only the ActivityLifeCycle project folder |
| **Clone Repository** | `git clone` command below | Clone via Git and navigate to ch2/ActivityLifeCycle |

**🔗 Quick Links:**
- **[View on GitHub](https://github.com/bhavik-bagdai/Android-Kotlin-Examples/tree/main/ch2/ActivityLifeCycle)** - Browse code online
- **[Download Direct ZIP](https://minhaskamal.github.io/DownGit/#/home?url=https://github.com/bhavik-bagdai/Android-Kotlin-Examples/tree/main/ch2/ActivityLifeCycle)** - Alternative download service

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

✅ **Android Intents:**
- **Explicit Intent** - Navigate between MainActivity and SecondActivity
- **Implicit Intent** - Open external URL (Google) in browser
- **Intent with Data** - Pass string data between activities using extras

✅ **UI Components:**
- EditText for user input
- Multiple Buttons with click listeners
- TextView for displaying data
- LinearLayout for UI structure

#### Key Components

**Activities:**
- **MainActivity.kt** - Main activity with lifecycle logging and Intent demonstrations
  - Implements all 7 lifecycle methods with logging
  - Handles 3 types of button clicks (External Intent, Internal Intent, Intent with Data)
  - Uses `Log.d()` to track lifecycle state changes
  
- **SecondActivity.kt** - Secondary activity to demonstrate navigation
  - Receives and displays data from Intent extras
  - Demonstrates activity-to-activity communication

**Layouts:**
- **mainactivity.xml** - Main screen layout
  - Contains EditText for input
  - 3 Buttons: External Intent, Internal Intent, Intent with Data
  - Text labels and instructions
  
- **secondactivity.xml** - Second screen layout
  - Displays "Second Activity" header
  - TextView to show received Intent data

**AndroidManifest.xml:**
- Declares both MainActivity and SecondActivity
- MainActivity set as launcher activity
- Proper theme configuration

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

2. **Test Activity Lifecycle - Perform these actions:**
   - **Launch the app** → Observe: `onCreate()` → `onStart()` → `onResume()`
   - **Press Home button** → Observe: `onPause()` → `onStop()`
   - **Return to app** → Observe: `onRestart()` → `onStart()` → `onResume()`
   - **Press Back button** → Observe: `onPause()` → `onStop()` → `onDestroy()`
   - **Rotate device** → Observe: Full lifecycle (destroy and recreate)

3. **Test Intent Features:**
   - **External Intent Button** → Opens Google in browser (implicit intent)
   - **Internal Intent Button** → Navigates to SecondActivity (explicit intent)
   - **Intent with Data:**
     1. Enter text in the EditText field
     2. Click "Intent with Data" button
     3. Observe the text displayed in SecondActivity

---

## 📖 Learning Objectives

After running this project, you will understand:

- ✅ The complete Android Activity lifecycle and when each method is called
- ✅ How to use logging (`Log.d()`) to debug lifecycle issues
- ✅ **Explicit Intents** - Direct navigation between activities within your app
- ✅ **Implicit Intents** - Launching external apps (browser, email, etc.)
- ✅ **Passing data with Intents** - Using putExtra() and getStringExtra()
- ✅ Configuration changes and Activity recreation
- ✅ Best practices for managing resources in different lifecycle states
- ✅ Setting up multiple activities in AndroidManifest.xml

---

## 🛠️ Project Structure

```text
ActivityLifeCycle/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/activitylifecycledemo/
│   │   │   │   ├── MainActivity.kt          # Main activity with lifecycle & intents
│   │   │   │   └── SecondActivity.kt        # Second activity for navigation
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── mainactivity.xml     # Main screen UI
│   │   │   │   │   └── secondactivity.xml   # Second screen UI
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml          # String resources
│   │   │   │   │   └── themes.xml           # App themes
│   │   │   │   ├── drawable/                # Image resources
│   │   │   │   ├── mipmap-*/                # App icons
│   │   │   │   └── xml/                     # XML configs
│   │   │   └── AndroidManifest.xml          # App manifest
│   │   ├── androidTest/                     # Instrumentation tests
│   │   └── test/                            # Unit tests
│   ├── build.gradle.kts                     # App-level Gradle config
│   └── proguard-rules.pro                   # ProGuard rules
├── gradle/
│   └── libs.versions.toml                   # Dependency versions
├── build.gradle.kts                         # Project-level Gradle
├── settings.gradle.kts                      # Gradle settings
├── gradle.properties                        # Gradle properties
├── gradlew                                  # Gradle wrapper (Unix)
└── gradlew.bat                              # Gradle wrapper (Windows)
```

### Key Files Explained:

- **MainActivity.kt** (69 lines)
  - Contains all 7 lifecycle methods with logging
  - 3 button click handlers for different Intent types
  - Uses `findViewById()` to access UI elements

- **SecondActivity.kt** (21 lines)
  - Receives Intent data using `intent.getStringExtra()`
  - Displays received message in TextView

- **mainactivity.xml**
  - EditText: `R.id.etvalue` - User input field
  - Button: `R.id.btnei` - External Intent (Open URL)
  - Button: `R.id.btnii` - Internal Intent (Second Activity)
  - Button: `R.id.btnid` - Intent with Data

- **secondactivity.xml**
  - TextView: `R.id.tvintentdata` - Displays received data

---

## 📝 Additional Resources

- [Android Activity Lifecycle Documentation](https://developer.android.com/guide/components/activities/activity-lifecycle)
- [Handling Lifecycles with Lifecycle-Aware Components](https://developer.android.com/topic/libraries/architecture/lifecycle)
- [Intents and Intent Filters](https://developer.android.com/guide/components/intents-filters)
- [Activity Communication Guide](https://developer.android.com/training/basics/firstapp/starting-activity)

---

## 💡 Tips & Best Practices

**Lifecycle Methods:**
- Always call the super implementation first in lifecycle methods
- Use lifecycle methods appropriately for resource management
- Be aware of configuration changes causing Activity recreation
- Test your app by putting it in the background and bringing it back

**Intents:**
- Use explicit intents for navigation within your app (safer and faster)
- Use implicit intents for external apps (browser, maps, etc.)
- Always handle null cases when receiving Intent data
- Use `putExtra()` and `getExtra()` methods for passing data

**Debugging:**
- Use Logcat with specific tags to track lifecycle events
- Filter logs by tag name for cleaner output
- Monitor lifecycle during configuration changes (rotation)

---

## 🎯 Code Snippets

### Creating an Explicit Intent
```kotlin
val intent = Intent(this, SecondActivity::class.java)
startActivity(intent)
```

### Creating an Implicit Intent
```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)
```

### Passing Data with Intent
```kotlin
// Sending activity
val intent = Intent(this, SecondActivity::class.java)
intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
startActivity(intent)

// Receiving activity
val message = intent.getStringExtra("EXTRA_MESSAGE")
textView.text = message
```

---

**Repository:** [Android-Kotlin-Examples](https://github.com/bhavik-bagdai/Android-Kotlin-Examples)  
**Chapter:** 2 - Android Activity Lifecycle
