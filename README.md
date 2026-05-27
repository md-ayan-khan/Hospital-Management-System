# 🏥 Hospital Management System

A Java-based Hospital Management System that manages hospital operations such as patients, doctors, departments, appointments, and billing using Java and MySQL. This system helps in organizing hospital data in a structured and efficient way.

---

## 🚀 Features

- Manage patient records (add, view, update)
- Manage doctor details and specialization
- Organize hospital departments
- Schedule and manage appointments
- Generate and track bills
- Maintain relationships between patients, doctors, and appointments
- Store all data using MySQL database

---

## 🛠️ Tech Stack

- Java (Core Java)
- JDBC (Database Connectivity)
- MySQL
- Eclipse IDE

---

## 🧩 Modules / Classes

### 👤 Patient
- id  
- name  
- gender  
- age  
- phone  
- address  
- blood_group  

### 🩺 Doctor
- doctor_id  
- doctor_name  
- specialization  
- phone  
- email  
- department_id  

### 🏢 Department
- department_id  
- department_name  
- location  

### 📅 Appointment
- appointment_id  
- patient_id  
- doctor_id  
- appointment_date  
- appointment_time  
- status  
- reason  

### 💳 Bills
- bill_id  
- patient_id  
- appointment_id  
- total_amount  
- payment_status  
- bill_date  

---
## Database Schemas
<img width="1197" height="815" alt="image" src="https://github.com/user-attachments/assets/6613ca25-da9c-411a-b417-dee3140ced86" />


---

## 🗄️ Database Structure

### Suggested Tables:
- patients  
- doctors  
- departments  
- appointments  
- bills  

---

## ⚙️ Setup Instructions

1. Clone this repository  
2. Import project into IDE  
3. Create database:
---
## 👨‍💻 Author

**MO AYAN KHAN**  
📌 Java Developer | JDBC | MySQL  
```sql




