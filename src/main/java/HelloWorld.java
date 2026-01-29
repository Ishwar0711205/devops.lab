public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Jenkins!");
    }

}
// package com.devops;

// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello from DevOps Lab!");
//         System.out.println("Jenkins Build Successful!");
//     }
// }
// ```

// 4. Click **"Commit changes"**

// ---

// ### **Step 4: Fix the "Advanced sub-modules behaviours" Issue**

// I noticed you have submodule settings enabled (because of WanderLust submodule).

// In Jenkins configuration:

// 1. In **Source Code Management** → **Additional Behaviours** section
// 2. Find **"Advanced sub-modules behaviours"**
// 3. Click **"Delete"** to remove it (for now, to simplify)

// ---

// ### **Step 5: Update Jenkins Credentials**

// Since you made the repo public:

// 1. In **Source Code Management** section
// 2. **Credentials** dropdown: Select **"- none -"**
// 3. Remove the token credential selection

// ---

// ### **Step 6: Save and Build Again**

// 1. Scroll to bottom and click **"Save"**
// 2. Go to project page
// 3. Click **"Build Now"**
// 4. Click on the new build number (e.g., #5)
// 5. Click **"Console Output"**

// ---

// ## **Expected Success Output:**
// ```
// Started by user ishwar garje
// Cloning repository https://github.com/Ishwar0711205/devops.lab
// Checking out Revision...
// Parsing POMs
// Executing Maven: clean compile package
// [INFO] Building devops-lab 1.0-SNAPSHOT
// [INFO] Compiling 1 source file to target/classes
// [INFO] Building jar: .../target/devops-lab-1.0-SNAPSHOT.jar
// [INFO] BUILD SUCCESS
// Archiving artifacts
// Finished: SUCCESS
