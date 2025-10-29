Perfectooo 😎🔥 vamos con toda entonces Germán.
Aquí tienes el **`README_PRUEBAS.md`**, que complementa el punto 4 del trabajo y deja todo completico, incluyendo las pruebas del backend **y** del `index.html` que hicimos:

---

### 📘 **README_PRUEBAS.md**

# 🧪 Pruebas y verificación del funcionamiento — API Biblioteca

## 📌 Objetivo

Comprobar el correcto funcionamiento de los **endpoints** desarrollados en la API de Biblioteca y la **interacción desde la interfaz HTML** (`index.html`), asegurando que la aplicación cumpla con los requerimientos funcionales y de calidad.

---

## 🚀 1. Pruebas de los Endpoints REST (Backend)

Los endpoints fueron probados usando **Postman** y el navegador, verificando las operaciones básicas del CRUD.

### 📍 Endpoint principal: `/api/libros`

|   Método   | Descripción                          | URL de Ejemplo                       | Cuerpo (Body)                                                                                                         |
| :--------: | ------------------------------------ | ------------------------------------ | --------------------------------------------------------------------------------------------------------------------- |
|   **GET**  | Obtener todos los libros registrados | `http://localhost:8080/api/libros`   | —                                                                                                                     |
|  **POST**  | Registrar un nuevo libro             | `http://localhost:8080/api/libros`   | `json { "titulo": "Cien años de soledad", "autor": "Gabriel García Márquez", "anioPublicacion": 1967 } `              |
|   **GET**  | Obtener un libro por ID              | `http://localhost:8080/api/libros/1` | —                                                                                                                     |
|   **PUT**  | Actualizar un libro existente        | `http://localhost:8080/api/libros/1` | `json { "titulo": "El amor en los tiempos del cólera", "autor": "Gabriel García Márquez", "anioPublicacion": 1985 } ` |
| **DELETE** | Eliminar un libro por ID             | `http://localhost:8080/api/libros/1` | —                                                                                                                     |

✅ **Resultado esperado:**

* Respuestas HTTP `200 OK` o `201 Created` en operaciones exitosas.
* Respuesta HTTP `404 Not Found` cuando un libro no existe.
* Validaciones correctas en los campos requeridos.

---

## 🌐 2. Pruebas de la Interfaz Web (Frontend HTML)

El archivo `index.html` ubicado en `src/main/resources/static/` permite **interactuar directamente con la API** desde un navegador.

### 🖥️ Pasos:

1. Inicia la aplicación con **Spring Boot** (`BibliotecaApiApplication.java`).
2. Abre el navegador y entra a:

   ```
   http://localhost:8080/index.html
   ```
3. Desde la interfaz podrás:

    * Agregar libros con un formulario.
    * Visualizar la lista de libros registrados.
    * Enviar peticiones `GET` y `POST` sin usar Postman.

✅ **Resultado esperado:**
Los datos ingresados en el formulario se almacenan correctamente y la tabla se actualiza automáticamente al agregar o eliminar libros.

---

## ⚙️ 3. Manejo de errores y validaciones

* Si se intenta agregar un libro con campos vacíos, se muestra un mensaje de error.
* Si el ID no existe al intentar actualizar o eliminar, la API devuelve un mensaje adecuado (`404 Not Found`).
* La conexión entre el HTML y el backend se valida mediante mensajes en consola del navegador (F12 → pestaña “Consola”).

---

## 📚 4. Capturas sugeridas para evidenciar funcionamiento

1. Ejecución del servidor Spring Boot en IntelliJ.
2. Pruebas en Postman (`GET`, `POST`, `PUT`, `DELETE`).
3. Navegador mostrando el `index.html` en funcionamiento con la lista de libros.

---

## ✅ Conclusión

Las pruebas demuestran que:

* La **API REST** responde correctamente a las operaciones CRUD.
* La **interfaz HTML** permite interactuar con los datos de manera sencilla.
* Se aplicaron buenas prácticas de validación y manejo de errores.

El proyecto cumple con los criterios de calidad, modularidad y documentación establecidos.

---

