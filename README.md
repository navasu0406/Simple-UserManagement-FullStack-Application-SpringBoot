# 🧑‍💼 Simple User Management Full Stack Application
📸 Screenshots
<img width="669" height="338" alt="Screenshot 2025-10-16 021040" src="https://github.com/user-attachments/assets/e6722155-6a05-4e45-99d0-6bbedce510c6" />
<img width="676" height="440" alt="Screenshot 2025-10-16 021031" src="https://github.com/user-attachments/assets/72f2ce1e-30e0-48bd-939f-d6963b79f90e" />
<img width="1919" height="725" alt="Screenshot 2025-10-16 021020" src="https://github.com/user-attachments/assets/43a5a42a-edb5-4b14-979c-b2564695dfad" />
<img width="1919" height="370" alt="Screenshot 2025-10-16 021007" src="https://github.com/user-attachments/assets/af2bc8fc-b18a-4020-9fe2-1533c822549c" />
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


