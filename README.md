
# RoomDataBase
## Kotlin Room Database Sample

This repository contains a simple Android application written in Kotlin that demonstrates how to use the Room Persistence Library to perform basic CRUD (Create, Read, Update, Delete) operations with a local SQLite database.

### Prerequisites
- Android Studio
- Kotlin knowledge
- Android development basics

### Overview
The application showcases the following functionalities:
1. Writing data to the database: The user can enter the first name, last name, and roll number of a student and store this information in the database by clicking the "Write Data" button.
2. Reading data from the database: The user can enter a roll number and click the "Read Data" button to retrieve and display the student's information associated with that roll number.
3. Deleting all data from the database: The user can click the "Delete All" button to remove all student records from the database.

### How to Use
1. Clone the repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the application on an Android emulator or a physical device.

### Code Explanation
- The `MainActivity` class represents the main activity of the application.
- The `AppDatabase` class is a Room database that holds the `StudentDao`, which provides methods to interact with the student table in the database.
- The `Student` data class defines the structure of a student entity.
- The `writeData()` function takes input from the user, creates a `Student` object, and inserts it into the database using the Room database's `studentDao().insert()` method.
- The `readData()` function reads the student information from the database using the Room database's `studentDao().findByRoll()` method and displays it on the UI.
- The `displayData()` function is a suspend function that sets the student information on the UI.

### Libraries Used
- AndroidX AppCompat: androidx.appcompat:appcompat
- Kotlin Coroutines: org.jetbrains.kotlinx:kotlinx-coroutines-android
- Android Room: androidx.room:room-runtime



Feel free to use, modify, and distribute this code as per the license terms.

### Note
This project was created for educational purposes and to serve as a starting point for building applications using Kotlin, Room, and Android development best practices.

For any questions or feedback, please feel free to raise an issue or contact me.

**Happy coding!**
