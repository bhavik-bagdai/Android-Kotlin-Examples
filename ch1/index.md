# Chapter 1: Kotlin Basics - Code Examples

This directory contains Kotlin code examples covering fundamental concepts.

## 📚 Table of Contents

- [Getting Started](#getting-started)
- [Variables and Data Types](#variables-and-data-types)
- [Operators](#operators)
- [Control Flow](#control-flow)
- [Loops](#loops)
- [Utility Classes](#utility-classes)

---

## Getting Started

### Hello World
- [helloworld.kt](helloworld.kt) - Your first Kotlin program
- [Main.kt](Main.kt) - Main entry point with utility import
- [commandlineargs.kt](commandlineargs.kt) - Working with command-line arguments

---

## Variables and Data Types

### Immutable Variables (val)
- [Variabledatatypes.kt](Variabledatatypes.kt) - Immutable variable declarations with different data types
- [explicitdeclarationex.kt](explicitdeclarationex.kt) - Explicit type declaration examples

### Mutable Variables (var)
- [MutableVariabledatetypes.kt](MutableVariabledatetypes.kt) - Mutable variable declarations and reassignment

### Constants
- [Constdemo.kt](Constdemo.kt) - Working with constants using `const`
- [Constarray.kt](Constarray.kt) - Constant arrays

### Nullable Types
- [nullabledemo.kt](nullabledemo.kt) - Nullable types and null safety

---

## Operators

### Arithmetic Operators
- [arithmeticoperator.kt](arithmeticoperator.kt) - Addition, subtraction, multiplication, division, modulus

### Assignment Operators
- [assignmentoperator.kt](assignmentoperator.kt) - Assignment and compound assignment operators

### Comparison Operators
- [comparisonoperator.kt](comparisonoperator.kt) - Equality, inequality, greater than, less than

### Logical Operators
- [logicaloperator.kt](logicaloperator.kt) - AND, OR, NOT operations

### Range Operations
- [rangeoperation.kt](rangeoperation.kt) - Working with ranges in Kotlin

---

## Control Flow

### If Statements
- [simpleif.kt](simpleif.kt) - Basic if statement
- [ifelsedemo.kt](ifelsedemo.kt) - If-else statements
- [ifelseladder.kt](ifelseladder.kt) - If-else-if ladder (multiple conditions)
- [ifasanexpression.kt](ifasanexpression.kt) - Using if as an expression

### When Expression
- [whencase.kt](whencase.kt) - When statement (similar to switch)
- [whenexpression.kt](whenexpression.kt) - When as an expression

---

## Loops

### For Loop
- [forloop.kt](forloop.kt) - For loop with ranges and collections

### While Loop
- [whileloop.kt](whileloop.kt) - While loop examples

### Do-While Loop
- [dowhileloop.kt](dowhileloop.kt) - Do-while loop examples

### Loop Control
- [loopcontrol.kt](loopcontrol.kt) - Break and continue statements

---

## Utility Classes

- [Utility.kt](Utility.kt) - Utility functions and helpers
- [utility/Utils.kt](utility/Utils.kt) - Additional utility functions

---

## 🚀 How to Run Examples

### Method 1: Using VS Code Task (Recommended)
1. Open any `.kt` file
2. Press `Ctrl+Shift+B` (or `Cmd+Shift+B` on Mac)
3. Select "Run Kotlin File"

### Method 2: Using Code Runner
1. Open any `.kt` file
2. Click the ▶️ Run button at the top right

### Method 3: Using Terminal
```bash
cd ch1
kotlinc filename.kt -include-runtime -d filename.jar && java -jar filename.jar
```

---

## 📖 Learning Path

**Recommended order for beginners:**

1. Start with **Getting Started** section
2. Learn **Variables and Data Types**
3. Understand **Operators**
4. Practice **Control Flow** statements
5. Master **Loops**
6. Explore **Utility Classes**

---

## 📝 Notes

- All examples include `main()` function and can be run independently
- Examples demonstrate best practices for Kotlin programming
- Code includes comments for better understanding

---

**Repository:** [Android-Kotlin-Examples](https://github.com/bhavik-bagdai/Android-Kotlin-Examples)  
**Chapter:** 1 - Kotlin Basics
