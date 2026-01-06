<html>
<head>
  <title>Chapter 2 – Android Activity Lifecycle</title>
</head>
<body>

<p><a href="../">← Back to Main Index</a></p>

<h1>📱 Chapter 2 – Android Activity Lifecycle</h1>
<p>Complete Android application examples demonstrating Activity lifecycle concepts and Intents.</p>

<h2>� Projects</h2>

<h3>ActivityLifeCycle</h3>
<p><b>Package:</b> <code>com.example.activitylifecycledemo</code><br>
<b>Min SDK:</b> 21 | <b>Target SDK:</b> 36 | <b>Compile SDK:</b> 36</p>

<p><b>Download Options:</b></p>
<ul>
  <li><a href="https://github.com/bhavik-bagdai/Android-Kotlin-Examples/archive/refs/heads/main.zip">Download Full Repository ZIP</a> – Extract <code>ch2/ActivityLifeCycle</code></li>
  <li><a href="https://download-directory.github.io/?url=https://github.com/bhavik-bagdai/Android-Kotlin-Examples/tree/main/ch2/ActivityLifeCycle">Download Project Only</a> – Direct project download</li>
  <li><a href="https://github.com/bhavik-bagdai/Android-Kotlin-Examples/tree/main/ch2/ActivityLifeCycle">View on GitHub</a> – Browse code online</li>
</ul>

<h2>✅ Features Demonstrated</h2>

<h3>Complete Activity Lifecycle Methods</h3>
<ul>
  <li><code>onCreate()</code> – Activity is being created</li>
  <li><code>onStart()</code> – Activity is becoming visible</li>
  <li><code>onResume()</code> – Activity is ready for user interaction</li>
  <li><code>onPause()</code> – Activity is losing focus</li>
  <li><code>onStop()</code> – Activity is no longer visible</li>
  <li><code>onDestroy()</code> – Activity is being destroyed</li>
  <li><code>onRestart()</code> – Activity is being restarted after being stopped</li>
</ul>

<h3>Android Intents</h3>
<ul>
  <li><b>Explicit Intent</b> – Navigate between MainActivity and SecondActivity</li>
  <li><b>Implicit Intent</b> – Open external URL (Google) in browser</li>
  <li><b>Intent with Data</b> – Pass string data between activities using extras</li>
</ul>

<h3>UI Components</h3>
<ul>
  <li>EditText for user input</li>
  <li>Multiple Buttons with click listeners</li>
  <li>TextView for displaying data</li>
  <li>LinearLayout for UI structure</li>
</ul>

<h2>📂 Key Components</h2>

<h3>Activities</h3>
<ul>
  <li><b>MainActivity.kt</b> – Main activity with lifecycle logging and Intent demonstrations
    <ul>
      <li>Implements all 7 lifecycle methods with logging</li>
      <li>Handles 3 types of button clicks</li>
      <li>Uses <code>Log.d()</code> to track lifecycle state changes</li>
    </ul>
  </li>
  <li><b>SecondActivity.kt</b> – Secondary activity to demonstrate navigation
    <ul>
      <li>Receives and displays data from Intent extras</li>
      <li>Demonstrates activity-to-activity communication</li>
    </ul>
  </li>
</ul>

<h3>Layouts</h3>
<ul>
  <li><b>mainactivity.xml</b> – Main screen layout
    <ul>
      <li>EditText: <code>R.id.etvalue</code> – User input field</li>
      <li>Button: <code>R.id.btnei</code> – External Intent</li>
      <li>Button: <code>R.id.btnii</code> – Internal Intent</li>
      <li>Button: <code>R.id.btnid</code> – Intent with Data</li>
    </ul>
  </li>
  <li><b>secondactivity.xml</b> – Second screen layout
    <ul>
      <li>TextView: <code>R.id.tvintentdata</code> – Displays received data</li>
    </ul>
  </li>
</ul>

<h2>🚀 How to Run</h2>

<h3>Option 1: Download and Open</h3>
<ol>
  <li>Download the repository ZIP from above</li>
  <li>Extract and navigate to <code>ch2/ActivityLifeCycle</code></li>
  <li>Open in Android Studio: File → Open → Select folder</li>
  <li>Let Gradle sync complete</li>
  <li>Run on emulator or device</li>
</ol>

<h3>Option 2: Clone Repository</h3>
<pre>git clone https://github.com/bhavik-bagdai/Android-Kotlin-Examples.git
cd Android-Kotlin-Examples/ch2/ActivityLifeCycle</pre>
<p>Open the project in Android Studio.</p>

<h2>🔍 Testing the Lifecycle</h2>

<h3>1. Open Android Studio Logcat</h3>
<ul>
  <li>View → Tool Windows → Logcat</li>
  <li>Filter by tag: <code>MainActivity</code></li>
</ul>

<h3>2. Test Activity Lifecycle</h3>
<ul>
  <li><b>Launch the app</b> → Observe: <code>onCreate()</code> → <code>onStart()</code> → <code>onResume()</code></li>
  <li><b>Press Home button</b> → Observe: <code>onPause()</code> → <code>onStop()</code></li>
  <li><b>Return to app</b> → Observe: <code>onRestart()</code> → <code>onStart()</code> → <code>onResume()</code></li>
  <li><b>Press Back button</b> → Observe: <code>onPause()</code> → <code>onStop()</code> → <code>onDestroy()</code></li>
  <li><b>Rotate device</b> → Observe: Full lifecycle (destroy and recreate)</li>
</ul>

<h3>3. Test Intent Features</h3>
<ul>
  <li><b>External Intent Button</b> → Opens Google in browser (implicit intent)</li>
  <li><b>Internal Intent Button</b> → Navigates to SecondActivity (explicit intent)</li>
  <li><b>Intent with Data</b> → Enter text, click button, see text in SecondActivity</li>
</ul>

<h2>📖 Learning Objectives</h2>
<p>After running this project, you will understand:</p>
<ul>
  <li>The complete Android Activity lifecycle and when each method is called</li>
  <li>How to use logging (<code>Log.d()</code>) to debug lifecycle issues</li>
  <li>Explicit Intents – Direct navigation between activities</li>
  <li>Implicit Intents – Launching external apps</li>
  <li>Passing data with Intents using <code>putExtra()</code> and <code>getStringExtra()</code></li>
  <li>Configuration changes and Activity recreation</li>
  <li>Best practices for managing resources in different lifecycle states</li>
  <li>Setting up multiple activities in AndroidManifest.xml</li>
</ul>

<h2>🎯 Code Snippets</h2>

<h3>Creating an Explicit Intent</h3>
<pre>val intent = Intent(this, SecondActivity::class.java)
startActivity(intent)</pre>

<h3>Creating an Implicit Intent</h3>
<pre>val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://www.google.com")
startActivity(intent)</pre>

<h3>Passing Data with Intent</h3>
<pre>// Sending activity
val intent = Intent(this, SecondActivity::class.java)
intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
startActivity(intent)

// Receiving activity
val message = intent.getStringExtra("EXTRA_MESSAGE")
textView.text = message</pre>

<h2>💡 Tips & Best Practices</h2>

<h3>Lifecycle Methods</h3>
<ul>
  <li>Always call the super implementation first in lifecycle methods</li>
  <li>Use lifecycle methods appropriately for resource management</li>
  <li>Be aware of configuration changes causing Activity recreation</li>
  <li>Test your app by putting it in the background and bringing it back</li>
</ul>

<h3>Intents</h3>
<ul>
  <li>Use explicit intents for navigation within your app (safer and faster)</li>
  <li>Use implicit intents for external apps (browser, maps, etc.)</li>
  <li>Always handle null cases when receiving Intent data</li>
  <li>Use <code>putExtra()</code> and <code>getExtra()</code> methods for passing data</li>
</ul>

<h3>Debugging</h3>
<ul>
  <li>Use Logcat with specific tags to track lifecycle events</li>
  <li>Filter logs by tag name for cleaner output</li>
  <li>Monitor lifecycle during configuration changes (rotation)</li>
</ul>

<h2>📝 Additional Resources</h2>
<ul>
  <li><a href="https://developer.android.com/guide/components/activities/activity-lifecycle">Android Activity Lifecycle Documentation</a></li>
  <li><a href="https://developer.android.com/topic/libraries/architecture/lifecycle">Handling Lifecycles with Lifecycle-Aware Components</a></li>
  <li><a href="https://developer.android.com/guide/components/intents-filters">Intents and Intent Filters</a></li>
  <li><a href="https://developer.android.com/training/basics/firstapp/starting-activity">Activity Communication Guide</a></li>
</ul>

<p>📥 <b>Download full source:</b>
<a href="https://github.com/bhavik-bagdai/Android-Kotlin-Examples">
GitHub Repository
</a>
</p>

<p><b>Repository:</b> <a href="https://github.com/bhavik-bagdai/Android-Kotlin-Examples">Android-Kotlin-Examples</a><br>
<b>Chapter:</b> 2 – Android Activity Lifecycle</p>

</body>
</html>
