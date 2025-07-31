AR Placement App for Android 📱🛠️
This Android application allows users to place a 3D drill marker (represented as a cube or cone) in augmented reality by tapping on flat surfaces detected using ARCore.

🧠 Technologies Used
ARCore (Google’s Augmented Reality framework)

Sceneform (3D rendering with ARCore)

Kotlin

Android Studio

🎯 Features
Detects horizontal planes (e.g., floors, tables).

Places a 3D marker on tap when a valid plane is detected.

Allows the user to scale, rotate, and move the marker using gestures.

Provides visual feedback to the user, indicating when a plane has been found.

📷 Screenshots
Plane Detected

Marker Placed

Image of the camera view with a detected plane highlighted.

Image of the 3D marker placed on the surface.

🚀 Getting Started
Follow these instructions to get the project up and running on your local machine and physical Android device.

Prerequisites
An ARCore-supported Android device.

Android Studio installed.

Installation Steps
Clone the repository:

git clone https://github.com/Shrey1029/ArDrill-.git
cd ArDrill-

Open the project in Android Studio:

Launch Android Studio.

Select File > Open and navigate to the cloned project directory.

Add Dependencies:

Open the app/build.gradle file.

Add the following lines inside the dependencies block:

// Sceneform
implementation 'com.google.ar.sceneform:core:1.17.1'
implementation 'com.google.ar.sceneform.ux:sceneform-ux:1.17.1'

Sync the project when prompted by Android Studio.

Update AndroidManifest.xml:

Open app/src/main/AndroidManifest.xml.

Ensure the following permissions and features are declared inside the <manifest> and <application> tags as shown:

<uses-permission android:name="android.permission.CAMERA" />
<uses-feature android:name="android.hardware.camera.ar" android:required="true" />

<application
    ...>
    <meta-data android:name="com.google.ar.core" android:value="required" />
    ...
</application>

Build and Run:

Connect your physical Android device.

Use the Build & Run button (▶️) in Android Studio to install and launch the app.
