# AR Drill Placement App

An Android app using ARCore to detect planes and place a 3D drill marker (cube or cone) on tap. Built for an assignment project using Kotlin and Sceneform.

## 📱 Features

* Plane detection using ARCore
* Tap to place 3D marker (representing a drill)
* Support for both cube and cone markers
* Visual and pose-based feedback

## 📷 Screenshots



| Plane Detected | Marker Placed |

|----------------|----------------|

| ![Plane]![WhatsApp Image 2025-08-01 at 02 58 42_cc2605c7](https://github.com/user-attachments/assets/d8f806fa-3501-4218-8fcd-9ff377751b69)

 | ![Cube]![WhatsApp Image 2025-08-01 at 02 57 00_9a2a1f3f](https://github.com/user-attachments/assets/8bf5d9fd-849c-4690-93f8-48aeb46f7445)

 |

## 🚀 Setup Script

Follow these steps in your terminal or command line:

```bash
# 1. Clone the repository
git clone https://github.com/Shrey1029/ArDrill-.git
cd ArDrill-

# 2. Open the project in Android Studio manually (GUI step)

# 3. Add the following dependencies to your app/build.gradle
# (Inside the dependencies block)
echo "\nAdding dependencies..."
echo "implementation 'com.google.ar.sceneform:core:1.17.1'" >> app/build.gradle
echo "implementation 'com.google.ar.sceneform.ux:sceneform-ux:1.17.1'" >> app/build.gradle

# 4. Update AndroidManifest.xml with required permissions/features
# You must do this manually:
echo "\nEnsure this is in your AndroidManifest.xml:" 
echo "<uses-permission android:name=\"android.permission.CAMERA\" />"
echo "<uses-feature android:name=\"android.hardware.camera.ar\" android:required=\"true\" />"
echo "<meta-data android:name=\"com.google.ar.core\" android:value=\"required\" />"

# 5. Build and run on a physical device
# Use Android Studio's Build & Run button
```

## 📸 Screenshots

> (You can add screenshots here later)

## 📦 Folder Structure

```
ArAssignment/
├── app/
│   ├── src/main/java/com/example/arassignment/ArActivity.kt
│   ├── res/layout/activity_ar.xml
│   └── AndroidManifest.xml
├── .gitignore
└── README.md
```

## 📋 Requirements

* Android Studio Arctic Fox or later
* ARCore-supported Android phone

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first.

## 📜 License

This project is for academic purposes only. Modify and use as needed.

---

Created by [Shreyansh Singh](https://github.com/Shrey1029)
