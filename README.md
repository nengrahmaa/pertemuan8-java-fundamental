# Java Fundamental - Pertemuan 8

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
![GitHub repo size](https://img.shields.io/github/repo-size/nengrahmaa/pertemuan8-java-fundamental?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/nengrahmaa/pertemuan8-java-fundamental?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/nengrahmaa/pertemuan8-java-fundamental?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/nengrahmaa/pertemuan8-java-fundamental?style=for-the-badge)

**Materi:** Model View Controller (MVC) Di Java

---

## Deskripsi  
Repository ini berisi latihan Pertemuan 8 Java Fundamental.
Materi berfokus pada pengenalan framework Spring dan Spring Boot, meliputi:
- Konsep dasar Spring Framework
- **Penggunaan Inversion of Control (IoC)** dan **Dependency Injection (DI)**
- Struktur proyek Spring Boot
- Menjalankan aplikasi Spring Boot sederhana
- Membuat endpoint REST menggunakan Spring Web
  
## Teknologi  
- **Bahasa**: Java  
- **JDK**: Minimal JDK 8  
- **IDE**: Bebas (Eclipse, IntelliJ IDEA, VS Code, NetBeans, dll.)  

## Struktur Program  
struktur file:  

pertemuan7-java-fundamental/  
├── pelatihan/  
│   ├── src/  
│   │   ├── main/  
│   │   │   ├── java/com/example/demo/  
│   │   │   │   ├── PelatihanApplication.java  
│   │   │   │   └── controller/  
│   │   │   │       └── ProductController.java  
│   │   │   │   └── model/  
│   │   │   │       └── Product.java  
│   │   │   │   └── service/  
│   │   │   │       └── ProductService.java  
│   │   │   └── resources/  
│   │   │       ├── application.properties  
│   │   │       └── templates/  
│   │   │   │       └── productList.html  
│   │   └── test/  
│   │       └── java/com/pertemuan7/pelatihan/  
│   │           └── MvcApplicationTests.java  
│   ├── .gitignore 
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml  
└── README.md  

**Penjelasan File:**  
- **mvc/** → Folder utama yang berisi proyek Spring Boot.
- **MvcApplication.java** → File utama yang menjalankan aplikasi Spring Boot.
- **application.properties** → File konfigurasi aplikasi.

## Cara Menjalankan  
1. Pastikan **Java** dan **Maven** sudah terpasang di komputer  
2. Clone repository ini:
   ```bash
   git clone https://github.com/nengrahmaa/pertemuan8-java-fundamental.git
   ```
3. Masuk ke folder project:
   ```bash
   cd pertemuan8-java-fundamental/mvc
   ```
4. Jalankan Aplikasi:
   ```bash
   mvn spring-boot:run
   ```
5. Buka Browser dan akses:
   ```bash
   http://localhost:8080
   ```
