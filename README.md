# Bottom Navigation Fragment App

A simple Android application built using Kotlin that demonstrates navigation between multiple fragments using a Bottom Navigation View.

## Features

- Bottom Navigation View
- Fragment Navigation
- Fragment Transactions
- Kotlin
- Material Design Components

## Tech Stack

- Kotlin
- Android Studio
- AndroidX Fragments
- Material Components

## How It Works

The app starts with `Frag_1` and allows users to switch between three fragments using the bottom navigation bar.

```kotlin
bottomNav.setOnItemSelectedListener {
    when (it.itemId) {
        R.id.Fragment_1 -> replaceScreen(Frag_1())
        R.id.Fragment_2 -> replaceScreen(Frag_2())
        R.id.Fragment_3 -> replaceScreen(Frag_3())
    }
    true
}
```

Fragment replacement is handled using:

```kotlin
fun replaceScreen(frag: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.frameLayout, frag)
        .commit()
}
```

## Installation

Download Git on your system

Clone the repository:

```bash
https://github.com/tejasjadhav0704-sketch/Fragment_Practice
```

Then:

1. Open in Android Studio  
2. Sync Gradle  
3. Run the app  

---

## 👨‍💻 Author

Tejas Jadhav  
GitHub: https://github.com/tejasjadhav0704-sketch
