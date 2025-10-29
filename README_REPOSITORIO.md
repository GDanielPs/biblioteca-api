# 📚 API Biblioteca

## 📖 Descripción general

Este proyecto es una **API RESTful** desarrollada en **Java Spring Boot** que permite gestionar libros dentro de una biblioteca.  
Fue creada con el objetivo de aplicar principios de desarrollo back-end, arquitectura en capas y buenas prácticas en el manejo de servicios web.

---

## 🏗️ Estructura del proyecto

La API sigue una arquitectura **en capas (MVC)** que separa la lógica de negocio, la persistencia y el control de las peticiones HTTP.
```
biblioteca-api/
│
├── src/
│ ├── main/java/com/biblioteca/
│ │ ├── controller/ # Controladores REST
│ │ ├── model/ # Clases de entidad
│ │ ├── repository/ # Interfaces para acceso a datos
│ │ └── service/ # Lógica de negocio
│ └── resources/
│ ├── static/ # Archivos HTML estáticos
│ └── application.properties # Configuración del proyecto
│
├── pom.xml # Dependencias y configuración de Maven
├── mvnw / mvnw.cmd # Wrapper de Maven
├── README.md # Documentación principal
└── README_SERVICIOS.md # Detalle de endpoints
```
---

## ⚙️ Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Maven**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database (en memoria)**
- **Postman** (para pruebas)
- **Git y GitHub** (control de versiones)

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/GDanielPs/biblioteca-api.git
2. Ingresa al directorio:

cd biblioteca-api

3. Ejecuta el proyecto:

./mvnw spring-boot:run

4. Accede desde tu navegador o Postman a:

http://localhost:8080
🧩 Endpoints principales
Los endpoints de la API se documentan de forma detallada en el archivo README_SERVICIOS.md, pero a continuación se listan los más importantes:

|  Método  | Endpoint           | Descripción                   |
| :------: | :----------------- | :---------------------------- |
|   `GET`  | `/api/libros`      | Obtener todos los libros      |
|   `GET`  | `/api/libros/{id}` | Buscar un libro por ID        |
|  `POST`  | `/api/libros`      | Agregar un nuevo libro        |
|   `PUT`  | `/api/libros/{id}` | Actualizar un libro existente |
| `DELETE` | `/api/libros/{id}` | Eliminar un libro             |


🧠 Arquitectura y buenas prácticas
Este proyecto implementa:

Diseño modular: cada componente cumple una función específica.

Separación de capas: controladores, servicios y repositorios independientes.

Inyección de dependencias: manejo limpio de objetos con @Autowired.

Uso de JPA: simplificación del acceso a datos mediante interfaces.

Respuestas JSON: formato estándar de intercambio de datos.

🧪 Pruebas
Se incluyen pruebas básicas en BibliotecaApiApplicationTests.java para verificar la correcta carga del contexto y endpoints funcionales.

Ejecuta las pruebas con:

./mvnw test
👨‍💻 Autor
Germán Daniel Patiño Sáenz
Estudiante de Ingeniería de Software
UMB

📧 danielgdps6@gmail.com
🌐 GitHub: GDanielPs

🪪 Licencia
Este proyecto es de uso académico y puede ser utilizado con fines educativos o de aprendizaje.
No se permite su distribución con fines comerciales sin autorización del autor.