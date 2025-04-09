# 🌐 TVPlus Test Web Automation

A basic Selenium Test Automation project for the **TVPlus** website using the **Selenium WebDriver**.  
This project automates the process of checking if the homepage loads correctly by verifying the visibility of the **Sign Up** button.  

🧪 The test automatically:
- Launches **Chrome**
- Opens the **TVPlus homepage**
- Checks whether the **Sign Up** button is displayed
- 🖥️ Prints a **notification message** on the terminal

---

## 🧰 Technologies Used

-  **Java 11**
-  **Selenium WebDriver 4.29.0**
-  **TestNG 7.7.0**
-  **WebDriverManager 5.5.3**
-  **Maven**

---

## 📦 How Dependencies Are Managed

All dependencies are managed using **Maven**, and are defined in the `pom.xml` file. These libraries are fetched from the **Maven Central Repository**:

You can explore and copy Maven dependency snippets from [Maven Repository](https://mvnrepository.com).

```xml
<!-- TestNG Framework -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.0</version>
</dependency>

<!-- Selenium WebDriver -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.29.0</version>
</dependency>

<!-- WebDriverManager to auto-manage driver binaries -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.5.3</version>
</dependency>
```
---

## 🔍 How to Find HTML Element Class Names (Used in the Code)
Open https://tvplus.com.tr in Web Browser.  

Click Inspect on the Home Screen.  

The Elements tab will show the HTML source code.  

Then click this icon on the Incpect Screen.  

![Screenshot 2025-04-09 142254](https://github.com/user-attachments/assets/e7f59781-7074-4a00-8743-73df23682087)

---

Click the item you want to select for testing.  
![Screenshot 2025-04-09 142434](https://github.com/user-attachments/assets/7c9882f0-b6ca-4d1e-af97-f5ef4b16b479)

---

Then we can see the class name of that item in the in the inscpect tab.   
![Screenshot 2025-04-09 142530](https://github.com/user-attachments/assets/bfbab6bf-92cd-4ef0-b0ca-aed4c72af3e7)

---

### This is how the class name signUp was identified and used in the automation:  

```xml
private By signUp = By.className("signUp");
```

---

## ✅ Test Result Scenarios
### 🟢 When the item is found (Sign Up button is visible):
![Screenshot 2025-04-09 140348](https://github.com/user-attachments/assets/b3de4321-ffbf-4bbe-a515-6e6f107f47c2)

---

### 🔴 When the item is not found (Sign Up button is missing or page changed):
![Screenshot 2025-04-09 140520](https://github.com/user-attachments/assets/cdb26c1b-d13c-4106-a5d5-929ec1c12554)

---

##⚙️ Prerequisites
Before running the project, make sure you have:

✅ JDK 11+ installed
✅ Maven installed
✅ Chrome browser installed
✅ ChromeDriver (automatically managed by WebDriverManager)

