# file handling
# Program Overview
The File_Ex program is a Java application that demonstrates the following file-handling operations:

**File creation:** Creates two files: vedha.txt and jepa.txt.
**Writing data:** Writes an array of strings to vedha.txt.
**Reading data:** Reads the data back from vedha.txt and displays it on the console.
**File copying:** Copies the contents of vedha.txt to jepa.txt.
# Key Features
**File Creation:**

The program creates two files: vedha.txt and jepa.txt.
If the files already exist, a message indicating their existence is displayed.
**Writing Data:**

An array of strings (hi, hello, world) is written to vedha.txt using a DataOutputStream.
**Reading Data:**

The program reads the contents of vedha.txt using a DataInputStream and prints them line by line to the console.
**Copying Data:**

The program reads the data from vedha.txt and writes it to jepa.txt using FileInputStream, FileOutputStream, and DataOutputStream.
**Exception Handling:**

All operations are enclosed in a try-catch block to handle potential I/O exceptions gracefully.

# Dependencies
The program uses the following Java classes from the java.io package:

File
FileOutputStream
DataOutputStream
FileInputStream
DataInputStream
