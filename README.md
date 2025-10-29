
### 🧩 **README_SERVICIOS.md**

#### Proyecto: API RESTful para la gestión de una biblioteca

#### Tecnología: Spring Boot (Java)

---

## 📌 **Descripción general**

Este módulo corresponde al desarrollo de los **servicios web** del sistema de gestión de una biblioteca.
El objetivo es permitir la **gestión de libros** (registro, consulta, actualización y eliminación) mediante una **API RESTful** desarrollada con **Spring Boot**, siguiendo las buenas prácticas de calidad, seguridad y documentación.

---

## ⚙️ **Framework utilizado**

* **Spring Boot 3.x**
* **Maven** como gestor de dependencias.
* **Spring Web** para la construcción de la API.
* **Spring Validation** para validación de datos.
* **Springdoc OpenAPI (Swagger UI)** para documentación interactiva.
* **Spring Boot DevTools** para recarga automática en desarrollo.

---

## 🧱 **Estructura del proyecto**

```
src/
 ├── main/
 │   ├── java/com/biblioteca/app/
 │   │   ├── controller/       # Controladores REST
 │   │   ├── model/            # Clases de entidad (Libro)
 │   │   ├── repository/       # Interfaces de persistencia (en memoria o BD)
 │   │   └── service/          # Lógica de negocio
 │   └── resources/
 │       └── application.properties  # Configuración de la app
 └── test/                     # Pruebas unitarias (opcional)
```

---

## 📡 **Endpoints implementados**

|  Método  | Endpoint       | Descripción                           | Ejemplo de uso     |
| :------: | :------------- | :------------------------------------ | :----------------- |
|   `GET`  | `/libros`      | Obtiene todos los libros registrados. | `GET /libros`      |
|   `GET`  | `/libros/{id}` | Consulta un libro por su ID.          | `GET /libros/1`    |
|  `POST`  | `/libros`      | Registra un nuevo libro.              | `POST /libros`     |
|   `PUT`  | `/libros/{id}` | Actualiza un libro existente.         | `PUT /libros/1`    |
| `DELETE` | `/libros/{id}` | Elimina un libro del sistema.         | `DELETE /libros/1` |

---

## 🧾 **Ejemplo de JSON (para POST y PUT)**

```json
{
  "titulo": "Cien años de soledad",
  "autor": "Gabriel García Márquez",
  "anioPublicacion": 1967,
  "genero": "Realismo mágico",
  "disponible": true
}
```

---

## 🔐 **Validación de datos**

El sistema valida automáticamente los datos de entrada utilizando **anotaciones de validación** de `jakarta.validation`, tales como:

```java
@NotBlank(message = "El título es obligatorio")
@Size(max = 100, message = "El título no puede superar los 100 caracteres")
```

Esto evita que se registren libros con campos vacíos o incorrectos.

---

## 🧰 **Manejo de errores**

El proyecto incluye un controlador global de excepciones (`GlobalExceptionHandler`) que devuelve respuestas con estructura estándar.
Ejemplo:

```json
{
  "timestamp": "2025-10-27T18:00:00",
  "status": 400,
  "error": "Bad Request",
  "message": "El campo 'autor' no puede estar vacío",
  "path": "/libros"
}
```

---

## 🔑 **Autenticación básica (opcional)**

Para aumentar la seguridad, se puede habilitar autenticación básica con **Spring Security**, restringiendo las operaciones `POST`, `PUT` y `DELETE` solo a usuarios autenticados.
Esto se puede configurar fácilmente más adelante si se requiere.

---

## 📘 **Documentación de la API**

La documentación automática se genera gracias a **Springdoc OpenAPI**.
Una vez ejecutada la aplicación, puedes acceder a:

🔗 **Swagger UI:**
[`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)

Desde ahí se pueden probar todos los endpoints con ejemplos de datos.

---

## 🚀 **Ejecución del proyecto**

1. Abrir el proyecto en IntelliJ IDEA o NetBeans.
2. Ejecutar la clase principal `BibliotecaApplication.java`.
3. Verificar que el servidor se inicia en:
   👉 `http://localhost:8080`
4. Probar los endpoints desde:

    * Postman
    * Navegador
    * Swagger UI

---

## 🧩 **Buenas prácticas aplicadas**

* Separación por capas: **Controller**, **Service**, **Repository**.
* Validación de datos antes de guardar.
* Manejo global de excepciones.
* Documentación OpenAPI.
* Uso de DTOs (si se extiende el proyecto).
* Código limpio y comentado.


