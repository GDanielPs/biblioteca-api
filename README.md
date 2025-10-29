# 📚 Biblioteca API

## 🧾 Descripción
Este proyecto implementa una **API RESTful para la gestión de una biblioteca**, permitiendo registrar, consultar, actualizar y eliminar información sobre libros y usuarios.  
Su propósito es aplicar conceptos de **arquitectura back-end, desarrollo estructurado, pruebas unitarias e integración continua**, siguiendo buenas prácticas de programación.

---

## ⚙️ Tecnologías utilizadas
- **Java / Spring Boot**
- **Maven** para la gestión de dependencias
- **MySQL** como base de datos relacional
- **Postman** para pruebas de endpoints
- **Git & GitHub** para control de versiones y repositorio remoto

---

## 🏗️ Arquitectura del proyecto
El sistema se organiza siguiendo el patrón **MVC (Modelo - Vista - Controlador)**, garantizando una separación clara entre la lógica de negocio, los controladores y la persistencia de datos.

```

biblioteca-api/
│
├── src/
│   ├── main/
│   │   ├── java/com/biblioteca/
│   │   │   ├── controller/   -> Manejo de endpoints y peticiones HTTP
│   │   │   ├── model/        -> Clases del dominio (Libro, Usuario, etc.)
│   │   │   ├── service/      -> Lógica de negocio
│   │   │   └── repository/   -> Acceso a datos
│   │   └── resources/
│   │       └── application.properties
│   └── test/                 -> Pruebas unitarias
│
├── README.md
└── pom.xml

````

---

## 🚀 Ejecución del proyecto

### 🧩 Requisitos previos
- **Java 17** o superior
- **Maven**
- **MySQL** o base de datos configurada

### ▶️ Pasos para ejecutar
1. Clona el repositorio:
   ```bash
   git clone https://github.com/GDanielPs/biblioteca-api.git
````

2. Entra a la carpeta del proyecto:

   ```bash
   cd biblioteca-api
   ```
3. Compila y ejecuta el proyecto:

   ```bash
   mvn spring-boot:run
   ```
4. La API estará disponible en:

   ```
   http://localhost:8080
   ```

---

## 📍 Endpoints principales

| Método   | Endpoint           | Descripción                          |
| -------- | ------------------ | ------------------------------------ |
| `GET`    | `/api/libros`      | Lista todos los libros               |
| `GET`    | `/api/libros/{id}` | Consulta un libro por su ID          |
| `POST`   | `/api/libros`      | Agrega un nuevo libro                |
| `PUT`    | `/api/libros/{id}` | Actualiza la información de un libro |
| `DELETE` | `/api/libros/{id}` | Elimina un libro                     |

*(Los nombres pueden variar según la configuración del proyecto)*

---

## 🧪 Pruebas y validación

Se desarrollaron **pruebas unitarias y de integración** para garantizar el correcto funcionamiento de los servicios y endpoints.
Estas pruebas validan:

* La correcta creación, consulta y eliminación de libros.
* El manejo de errores y respuestas HTTP.
* La conexión con la base de datos y servicios asociados.

Las pruebas se ejecutan utilizando **JUnit** y **Spring Boot Test**, con integración en el pipeline de **GitHub Actions**.

Ejemplo:

```bash
mvn test
```

---

## 🧰 Integración continua (CI)

El proyecto implementa un flujo de CI en **GitHub Actions** para automatizar las siguientes tareas:

* Compilación del código.
* Ejecución de pruebas.
* Validación de la estructura y dependencias.

Archivo de configuración: `.github/workflows/ci.yml`

---

## 📘 Documentación y despliegue

### 📗 Guía de usuario

* Ejecutar el servidor con `mvn spring-boot:run`.
* Acceder a los endpoints mediante Postman o navegador.
* Utilizar los métodos HTTP adecuados según la operación.

### ⚙️ Guía de despliegue

1. Configura la base de datos en el archivo `application.properties`.
2. Asegúrate de que el puerto 8080 esté libre.
3. Ejecuta la aplicación y verifica los logs de inicialización.

---

## 🧩 Diagrama de arquitectura

```
[Cliente REST] ⇄ [Controlador] ⇄ [Servicio] ⇄ [Repositorio] ⇄ [Base de Datos]
```

El flujo permite gestionar la comunicación desde la petición HTTP hasta la persistencia de datos, siguiendo una arquitectura modular y escalable.

---

## 👨‍💻 Autor

**Germán Daniel Patiño Sáenz**
Estudiante de Ingeniería de Software

---

## 🏁 Estado del proyecto

✅ Completado — incluye arquitectura, pruebas, integración continua y documentación final.

---
