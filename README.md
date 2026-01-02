## Overview

This is a quiz application developed as an Android mobile application. The project is a short learning exercise that demonstrates sharing data between screens in Android applications. Users enter their details, complete a short age-based maths quiz, and receive a score passed back to the main screen.

![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Java 8](https://img.shields.io/badge/Java-8-007396?style=flat-square&logo=java&logoColor=white)
![Android SDK 33](https://img.shields.io/badge/Android%20SDK-33-3DDC84?style=flat-square&logo=android&logoColor=white)
![Gradle 8.0](https://img.shields.io/badge/Gradle-8.0-02303A?style=flat-square&logo=gradle&logoColor=white)
![Material Design 1.5.0](https://img.shields.io/badge/Material%20Design-1.5.0-757575?style=flat-square&logo=material-design&logoColor=white)

## Features

The quiz app offers the following features:

1. **Data Sharing Between Activities**

   - Passes user details to the quiz screen via Intent extras
   - Returns the quiz score to the main screen using Activity results

2. **Age-Based Questions**

   - Different question sets for users under 11
   - Simple arithmetic to suit the selected age group

3. **Score Calculation**

   - Validates three user answers
   - Displays the total score on the main screen

4. **Clean, Focused UI**

   - Separate layouts for main and quiz screens
   - Straightforward input and display components

## Technologies Used

- **Java 8**: Primary programming language for Android development
  - Source and target compatibility with Java 8 features
- **Android SDK 33**: Android development framework
  - Compile SDK: API Level 33 (Android 13)
  - Minimum SDK: API Level 30 (Android 11)
  - Target SDK: API Level 33 (Android 13)
- **Gradle 8.0**: Build automation and dependency management
  - Gradle wrapper distribution 8.0
  - Android Gradle Plugin 8.0.1
- **AndroidX Libraries**:
  - AppCompat 1.6.1: Backward compatibility support
  - Material Components 1.5.0: Material Design UI components
  - ConstraintLayout 2.1.4: Advanced layout management
- **Testing Frameworks**:
  - JUnit 4.13.2: Unit testing framework
  - AndroidX Test Ext JUnit 1.1.5: Android instrumentation testing
  - Espresso Core 3.5.1: UI testing automation

## Project Specifications

- **Platform**: Android Mobile Application
- **Programming Language**: Java
- **Minimum Android Version**: Android 11 (API 30)
- **Target Android Version**: Android 13 (API 33)
- **Application ID**: com.example.quizapp
- **Version**: 1.0 (Version Code: 1)
- **Build System**: Gradle with Android plugins

## User Interfaces

### UIs

![Quiz App UI](https://github.com/supunxiii/supunxiii/blob/7653f59dcf38771e7791a1cc0795c9d6b4cdcd3c/user-interfaces/quiz-app/quiz-app-ui-1.png)

## Getting Started

To run the quiz app locally, follow these steps:

1. **Prerequisites**:

   - Install [Android Studio](https://developer.android.com/studio) (Electric Eel or later recommended)
   - Ensure Java Development Kit (JDK) 8 or higher is installed
   - Set up an Android Virtual Device (AVD) or connect a physical Android device

2. Clone the repository:

   ```shell
   git clone https://github.com/supunxiii/quiz-app.git
   ```

3. Navigate to the project directory:

   ```shell
   cd quiz-app
   ```

4. Open the project in Android Studio:

   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned repository directory
   - Click "OK" to open the project

5. Sync the project with Gradle:

   - Android Studio should automatically prompt to sync
   - If not, click "File" → "Sync Project with Gradle Files"
   - Wait for the sync to complete

6. Run the application:

   - Select your target device (emulator or physical device)
   - Click the "Run" button (green play icon) or press `Shift + F10`
   - The application will build and install on your selected device

7. Alternative: Build from command line:

   ```shell
   # On macOS/Linux
   ./gradlew assembleDebug

   # On Windows
   gradlew.bat assembleDebug
   ```

   The APK will be generated in `app/build/outputs/apk/debug/`

## Project Structure

```
quiz-app/
├── .gradle/                                     # Gradle cache and build files
├── .idea/                                       # Android Studio IDE configurations
├── app/                                         # Main application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/quizapp/
│   │   │   │   ├── MainActivity.java            # User input and start quiz
│   │   │   │   └── QuizActivity.java            # Quiz logic and score return
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml        # Main screen layout
│   │   │   │   │   └── activity_quiz.xml        # Quiz screen layout
│   │   │   │   ├── mipmap-*/                    # App icons
│   │   │   │   ├── values/                      # Colours, strings, themes
│   │   │   │   ├── values-night/                # Night theme resources
│   │   │   │   └── xml/                         # XML configurations
│   │   │   └── AndroidManifest.xml              # App manifest
│   │   ├── androidTest/                         # Instrumented tests
│   │   └── test/                                # Unit tests
│   ├── build.gradle                             # App-level build config
│   └── proguard-rules.pro                       # ProGuard rules
├── gradle/                                      # Gradle wrapper files
│   └── wrapper/
├── build.gradle                                 # Project-level build config
├── gradle.properties                            # Gradle properties
├── gradlew                                      # Gradle wrapper script (Unix)
├── gradlew.bat                                  # Gradle wrapper script (Windows)
├── settings.gradle                              # Project settings
└── README.md                                    # This file
```

## Development Guidelines

### Building the Application

To build the project in different configurations:

```shell
# Debug build
./gradlew assembleDebug

# Release build (requires signing configuration)
./gradlew assembleRelease

# Clean and rebuild
./gradlew clean assembleDebug
```

### Running Tests

```shell
# Run unit tests
./gradlew test

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Run all tests
./gradlew testDebug connectedAndroidTest
```

## Contributors

This project was developed by:

- **Supun Wijesooriya** - Developer

## Contributing

Contributions to the quiz app are welcome! If you would like to contribute, please follow these steps:

1. Fork the repository.

2. Create a new branch:

   ```shell
   git checkout -b feature/your-feature-name
   ```

3. Make your changes and commit them:

   ```shell
   git commit -m "Add your commit message"
   ```

4. Push your changes to your forked repository:

   ```shell
   git push origin feature/your-feature-name
   ```

5. Open a pull request to the main repository, describing your changes and the purpose of the pull request.

## Important Notes

- This application requires **Android 11 (API 30) or higher** to run
- The application demonstrates passing data between activities via Intents
- Uses Activity results to return quiz scores to the main screen
- Material Design components provide consistent UI styling
- ProGuard rules are included for code optimisation in release builds

## Future Enhancements

Potential improvements for future versions:

- Add more question sets and difficulty levels
- Provide instant feedback on each answer
- Track high scores across sessions
- Improve input validation and error messages
- Add a results summary screen
- Introduce timed quizzes
- Support localisation for multiple languages

## Contact

For any inquiries or feedback, please contact the developer:

- **Supun Wijesooriya**: [GitHub Profile](https://github.com/supunxiii)
- **Project Repository**: [quiz-app](https://github.com/supunxiii/quiz-app)

---

**Note:** This is a beginner-friendly programme designed to understand Android native application development. The project covers fundamental concepts including Intent-based data transfer between activities, Activity lifecycle handling, XML-based UI design, resource management, and AndroidX library integration. This application serves as a learning resource for building multi-screen Android apps with basic input and scoring logic.
