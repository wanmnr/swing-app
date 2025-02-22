# Swing App (Plain Java Swing + MVC + JFormDesigner)

A lightweight Java Swing application following the MVC pattern, designed for production-level development.

## 🚀 Features

- **Plain Swing UI** (No unnecessary dependencies)
- **MVC Architecture** (Separates Model, View, Controller for maintainability)
- **JFormDesigner Integration** (For easy GUI design)
- **Logging with SLF4J & Logback**
- **Maven Build System**
- **Executable Packaging (JAR, DMG, EXE)**

---

## 📁 Project Structure

```
swing-app/
 ├── src/main/java/com/mycompany/swingapp/
 │    ├── model/        # Holds data models
 │    ├── view/         # Contains GUI components (Designed with JFormDesigner)
 │    ├── controller/   # Handles application logic
 │    ├── App.java      # Main application entry point
 ├── pom.xml            # Maven configuration file
 ├── README.md          # Project documentation
 ├── .gitignore         # Ignoring unnecessary files (target/, .idea/ etc.)
```

---

## 🛠 Setup & Installation

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/your-username/swing-app.git
cd swing-app
```

### 2️⃣ Build the Application

```sh
mvn clean package
```

### 3️⃣ Run the Application

```sh
mvn exec:java -Dexec.mainClass="com.mycompany.swingapp.App"
```

### 4️⃣ Generate Executable (JAR, EXE, DMG)

```sh
# Create a standalone JAR
mvn package
java -jar target/swingapp-1.0.jar

# Create a Mac DMG installer
jpackage --input target --name SwingApp --main-jar swingapp-1.0.jar --type dmg

# Create a Windows EXE installer
jpackage --input target --name SwingApp --main-jar swingapp-1.0.jar --type exe
```

---


## 📜 License

This project is licensed under the MIT License.

---

## 🛠 Contributing

Pull requests are welcome! If you find any issues, please open an issue on GitHub.

---

### 🎯 Ready to push to GitHub?

```sh
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/your-username/swing-app.git
git push -u origin main
```

🚀 **Now your Swing MVC app is GitHub-ready!** Would you like additional features like a database or theme support? Let me know! 🎯
