# docker-assignment
# Dockerized Full Stack Demo Application

This project demonstrates a **Dockerized full-stack application** consisting of:

- **Backend**: Spring Boot (Java, Maven)
- **Frontend**: Static HTML, CSS, JavaScript served via Nginx
- **Containerization**: Docker & Docker Compose

---

## 📁 Project Structure
```
├── Backend
│ ├── src
│ │ ├── main
│ │ │ ├── java/com/docker/demo
│ │ │ └── resources
│ │ └── test
│ ├── pom.xml
│ ├── dockerfile
│ └── mvnw / mvnw.cmd
│
├── frontEnd
│ ├── index.html
│ ├── script.js
│ └── dockerfile
│
├── docker-compose.yml
├── .gitignore
└── README.md
