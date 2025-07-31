# AR Placement App for Android 📱🛠️

This Android application allows users to place a **3D drill marker** (represented as a cube or cone) in augmented reality by tapping on flat surfaces detected using ARCore.

## 🧠 Technologies Used

- **ARCore** (Google’s Augmented Reality framework)
- **Sceneform** (3D rendering with ARCore)
- **Kotlin**
- **Android Studio**

## 🎯 Features

- Detects horizontal planes (e.g. floors, tables).
- On tap, places a 3D cube marker (can be changed to cone or custom model).
- User can scale/rotate/move the marker with gestures.
- Marker appears only when a valid plane is detected.

## 📷 Screenshots

| Plane Detected | Marker Placed |
|----------------|----------------|
| ![Plane]![WhatsApp Image 2025-08-01 at 02 58 42_cc2605c7](https://github.com/user-attachments/assets/d8f806fa-3501-4218-8fcd-9ff377751b69)
 | ![Cube]![WhatsApp Image 2025-08-01 at 02 57 00_9a2a1f3f](https://github.com/user-attachments/assets/8bf5d9fd-849c-4690-93f8-48aeb46f7445)
 |

## 📂 Project Structure

## ⚙️ Setup Instructions
🚀 Getting Started

1. Clone the Repository

git clone https://github.com/Shrey1029/ArDrill-.git
cd ArDrill-

2. Open in Android Studio

Open the project using Android Studio Arctic Fox or newer.

3. Add Dependencies

Make sure the following dependencies are present in your app/build.gradle:

implementation 'com.google.ar.sceneform:core:1.17.1'
implementation 'com.google.ar.sceneform.ux:sceneform-ux:1.17.1'

4. Update Manifest

In AndroidManifest.xml, ensure the following permissions and features are added:

<uses-permission android:name="android.permission.CAMERA" />
<uses-feature android:name="android.hardware.camera.ar" android:required="true" />

<meta-data
    android:name="com.google.ar.core"
    android:value="required" />

5. Build and Run

Build and run the app on a physical ARCore-supported Android device (e.g., Pixel, OnePlus, etc.). Emulator is not supported.
