# 🧑‍💼 Simple User Management Full Stack Application
📸 Screenshots
<img width="1304" height="216" alt="Screenshot 2025-10-16 021517" src="https://github.com/user-attachments/assets/a19ad97f-320f-4c61-a3c2-6b4a6b4b9b39" />
<img width="667" height="440" alt="Screenshot 2025-10-16 021509" src="https://github.com/user-attachments/assets/ef9c2743-1d10-490e-90fd-9dc15b9f8e65" />
<img width="669" height="338" alt="Screenshot 2025-10-16 021040" src="https://github.com/user-attachments/assets/7cc4e07c-74ba-4601-8649-f77eceade035" />
<img width="676" height="440" alt="Screenshot 2025-10-16 021031" src="https://github.com/user-attachments/assets/b263e1b3-61c9-40ed-a81a-575f3b2c70ea" />

A **full-stack web application** built using **React**, **Spring Boot**, and **MySQL** for managing users.  

This app allows you to **add, view, edit, and delete users** with a clean UI and a robust backend API.

---

## 🚀 Features

- ✅ View all users  
- ➕ Add new user  
- ✏️ Edit user details  
- ❌ Delete user  
- 🔍 View single user by ID  
- 🗄️ Persistent storage using MySQL  

---

## 🧱 Tech Stack

| Layer | Technology |
|-------|-------------|
| Frontend | React.js (JavaScript, Axios, React Router) |
| Backend | Spring Boot (Java, Spring Data JPA, REST APIs) |
| Database | MySQL |
| Build Tools | Maven, npm |
| IDEs | Eclipse |

---

## 💻 Setup & Run Instructions

### 🗄️ 1. Database Setup (MySQL)
Create a database:
```sql
CREATE DATABASE user_management;
Update application.properties in your Spring Boot project:

spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

⚙️ 2. Run the Backend (Spring Boot)
mvn spring-boot:run
🌐 3. Run the Frontend (React)

From your frontend folder:

npm install
npm start
🔗 4. Integration

Make sure your frontend API URLs point to:

http://localhost:8080/api/users


