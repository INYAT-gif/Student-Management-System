https://inyat-gif.github.io/Student-Management-System/
# 🎓 Student Management System
## 🚀 Features

- **Student Enrollment**: Register and manage student profiles.
- **Course Management**: Create and assign courses with ease.
- **Attendance Tracking**: Monitor and maintain attendance records.
- **Grade Management**: Record and analyze student performance.
- **User Roles**: Separate portals for admins, instructors, and students.

---

## 🛠️ Technologies Used

| **Technology** | **Purpose** |
|----------------|-------------|
| **React.js**   | Frontend Development |
| **Node.js**    | Backend Development  |
| **MongoDB**    | Database Management  |
| **Express.js** | API Development      |
| **JWT**        | Secure Authentication|

---

## ⚙️ Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- **Node.js**: [Download here](https://nodejs.org/)
- **MongoDB**: [Download here](https://www.mongodb.com/try/download/community)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/INYAT-gif/Student-Management-System.git
   cd Student-Management-System
   ```

2. Install backend dependencies:

   ```bash
   cd backend
   npm install
   ```

3. Install frontend dependencies:

   ```bash
   cd ../frontend
   npm install
   ```

---

## 🛠️ Configuration

### Backend

Create a `.env` file in the `backend` directory with the following:

```env
PORT=5000
MONGO_URI=your_mongodb_connection_string
JWT_SECRET=your_jwt_secret
```

### Frontend

Create a `.env` file in the `frontend` directory with:

```env
REACT_APP_API_URL=http://localhost:5000/api
```

---

## ▶️ Running the Application

1. Start the backend server:

   ```bash
   cd backend
   npm run dev
   ```

2. Start the frontend development server:

   ```bash
   cd ../frontend
   npm start
   ```

Access the app at: [http://localhost:3000](http://localhost:3000)

---

## 📂 Folder Structure

```
Student-Management-System
├── backend
│   ├── models
│   ├── routes
│   ├── controllers
│   ├── utils
│   └── server.js
├── frontend
│   ├── src
│   │   ├── components
│   │   ├── pages
│   │   ├── redux
│   │   └── App.js
```

---

## 🤝 Contributing

We welcome contributions to make this project even better!

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/YourFeatureName`.
3. Commit your changes: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature/YourFeatureName`.
5. Open a pull request.

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## ✨ Acknowledgments

Special thanks to:

- The open-source community.
- Contributors and educators inspiring innovation in education.

---

Made with ❤️ by [Inyat Nathani](https://www.linkedin.com/in/inyat/)
