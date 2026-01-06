<html>
<head>
  <title>Chapter 1: Kotlin Basics - Code Examples</title>
</head>
<body>

<h1>Chapter 1: Kotlin Basics - Code Examples</h1>
<p>This directory contains Kotlin code examples covering fundamental concepts.</p>

<h2>📚 Table of Contents</h2>
<ul>
  <li><a href="#getting-started">Getting Started</a></li>
  <li><a href="#variables-and-data-types">Variables and Data Types</a></li>
  <li><a href="#operators">Operators</a></li>
  <li><a href="#control-flow">Control Flow</a></li>
  <li><a href="#loops">Loops</a></li>
  <li><a href="#utility-classes">Utility Classes</a></li>
</ul>

<hr>

<h2 id="getting-started">Getting Started</h2>
<h3>Hello World</h3>
<ul>
  <li><a href="helloworld.kt">helloworld.kt</a> - Your first Kotlin program</li>
  <li><a href="Main.kt">Main.kt</a> - Main entry point with utility import</li>
  <li><a href="commandlineargs.kt">commandlineargs.kt</a> - Working with command-line arguments</li>
</ul>

<hr>

<h2 id="variables-and-data-types">Variables and Data Types</h2>

<h3>Immutable Variables (val)</h3>
<ul>
  <li><a href="Variabledatatypes.kt">Variabledatatypes.kt</a> - Immutable variable declarations with different data types</li>
  <li><a href="explicitdeclarationex.kt">explicitdeclarationex.kt</a> - Explicit type declaration examples</li>
</ul>

<h3>Mutable Variables (var)</h3>
<ul>
  <li><a href="MutableVariabledatetypes.kt">MutableVariabledatetypes.kt</a> - Mutable variable declarations and reassignment</li>
</ul>

<h3>Constants</h3>
<ul>
  <li><a href="Constdemo.kt">Constdemo.kt</a> - Working with constants using <code>const</code></li>
  <li><a href="Constarray.kt">Constarray.kt</a> - Constant arrays</li>
</ul>

<h3>Nullable Types</h3>
<ul>
  <li><a href="nullabledemo.kt">nullabledemo.kt</a> - Nullable types and null safety</li>
</ul>

<hr>

<h2 id="operators">Operators</h2>

<h3>Arithmetic Operators</h3>
<ul>
  <li><a href="arithmeticoperator.kt">arithmeticoperator.kt</a> - Addition, subtraction, multiplication, division, modulus</li>
</ul>

<h3>Assignment Operators</h3>
<ul>
  <li><a href="assignmentoperator.kt">assignmentoperator.kt</a> - Assignment and compound assignment operators</li>
</ul>

<h3>Comparison Operators</h3>
<ul>
  <li><a href="comparisonoperator.kt">comparisonoperator.kt</a> - Equality, inequality, greater than, less than</li>
</ul>

<h3>Logical Operators</h3>
<ul>
  <li><a href="logicaloperator.kt">logicaloperator.kt</a> - AND, OR, NOT operations</li>
</ul>

<h3>Range Operations</h3>
<ul>
  <li><a href="rangeoperation.kt">rangeoperation.kt</a> - Working with ranges in Kotlin</li>
</ul>

<hr>

<h2 id="control-flow">Control Flow</h2>

<h3>If Statements</h3>
<ul>
  <li><a href="simpleif.kt">simpleif.kt</a> - Basic if statement</li>
  <li><a href="ifelsedemo.kt">ifelsedemo.kt</a> - If-else statements</li>
  <li><a href="ifelseladder.kt">ifelseladder.kt</a> - If-else-if ladder (multiple conditions)</li>
  <li><a href="ifasanexpression.kt">ifasanexpression.kt</a> - Using if as an expression</li>
</ul>

<h3>When Expression</h3>
<ul>
  <li><a href="whencase.kt">whencase.kt</a> - When statement (similar to switch)</li>
  <li><a href="whenexpression.kt">whenexpression.kt</a> - When as an expression</li>
</ul>

<hr>

<h2 id="loops">Loops</h2>

<h3>For Loop</h3>
<ul>
  <li><a href="forloop.kt">forloop.kt</a> - For loop with ranges and collections</li>
</ul>

<h3>While Loop</h3>
<ul>
  <li><a href="whileloop.kt">whileloop.kt</a> - While loop examples</li>
</ul>

<h3>Do-While Loop</h3>
<ul>
  <li><a href="dowhileloop.kt">dowhileloop.kt</a> - Do-while loop examples</li>
</ul>

<h3>Loop Control</h3>
<ul>
  <li><a href="loopcontrol.kt">loopcontrol.kt</a> - Break and continue statements</li>
</ul>

<hr>

<h2 id="utility-classes">Utility Classes</h2>
<ul>
  <li><a href="Utility.kt">Utility.kt</a> - Utility functions and helpers</li>
  <li><a href="utility/Utils.kt">utility/Utils.kt</a> - Additional utility functions</li>
</ul>

<hr>

<h2>🚀 How to Run Examples</h2>

<h3>Method 1: Using VS Code Task (Recommended)</h3>
<ol>
  <li>Open any <code>.kt</code> file</li>
  <li>Press <code>Ctrl+Shift+B</code> (or <code>Cmd+Shift+B</code> on Mac)</li>
  <li>Select "Run Kotlin File"</li>
</ol>

<h3>Method 2: Using Code Runner</h3>
<ol>
  <li>Open any <code>.kt</code> file</li>
  <li>Click the ▶️ Run button at the top right</li>
</ol>

<h3>Method 3: Using Terminal</h3>
<pre><code>cd ch1
kotlinc filename.kt -include-runtime -d filename.jar && java -jar filename.jar
</code></pre>

<hr>

<h2>📖 Learning Path</h2>
<p><strong>Recommended order for beginners:</strong></p>
<ol>
  <li>Start with <strong>Getting Started</strong> section</li>
  <li>Learn <strong>Variables and Data Types</strong></li>
  <li>Understand <strong>Operators</strong></li>
  <li>Practice <strong>Control Flow</strong> statements</li>
  <li>Master <strong>Loops</strong></li>
  <li>Explore <strong>Utility Classes</strong></li>
</ol>

<hr>

<h2>📝 Notes</h2>
<ul>
  <li>All examples include <code>main()</code> function and can be run independently</li>
  <li>Examples demonstrate best practices for Kotlin programming</li>
  <li>Code includes comments for better understanding</li>
</ul>

<hr>

<p>
<strong>Repository:</strong> <a href="https://github.com/bhavik-bagdai/Android-Kotlin-Examples">Android-Kotlin-Examples</a><br>
<strong>Chapter:</strong> 1 - Kotlin Basics
</p>

</body>
</html>
