📘 README – Servicios Web (API Biblioteca)

## 📍 Descripción General
Este documento complementa el desarrollo del proyecto **Biblioteca**, explicando los **servicios web** implementados con **Spring Boot**.  
El objetivo es ofrecer una API RESTful que permita **gestionar libros**: agregarlos, listarlos y eliminarlos.  
Se implementaron buenas prácticas de validación, manejo de errores y estructura modular.

---

## ⚙️ Framework Utilizado
- **Spring Boot 3.x**
- Arquitectura REST
- Dependencias principales:
    - `spring-boot-starter-web`
    - `spring-boot-devtools`

---

## 🧩 Arquitectura del Backend
El proyecto sigue una estructura **modular**, lo que mejora la organización y el mantenimiento del código:

```
src/main/java/com/biblioteca/
├── model/
│   └── Libro.java
├── service/
│   └── LibroService.java
├── controller/
│   └── LibroController.java
└── BibliotecaApplication.java
```

- **Model:** Representa la estructura de los datos (`Libro`).
- **Service:** Contiene la lógica de negocio y validación (`LibroService`).
- **Controller:** Gestiona las solicitudes HTTP y las respuestas (`LibroController`).

---

## 🔗 Endpoints Disponibles

### 1️⃣ Obtener todos los libros
**GET** `/api/libros`

**Descripción:** Retorna la lista completa de libros registrados.

**Ejemplo de respuesta:**
```json
[
  { "id": 1, "titulo": "Cien años de soledad", "autor": "Gabriel García Márquez", "anio": 1967 },
  { "id": 2, "titulo": "Don Quijote", "autor": "Miguel de Cervantes", "anio": 1605 }
]
```

---

### 2️⃣ Agregar un nuevo libro
**POST** `/api/libros`

**Descripción:** Permite registrar un nuevo libro en el sistema.  
**Cuerpo (JSON):**
```json
{
  "titulo": "Rayuela",
  "autor": "Julio Cortázar",
  "anio": 1963
}
```

**Respuestas:**
- ✅ **200 OK:** Libro agregado exitosamente
- ❌ **400 BAD REQUEST:** Datos inválidos o campos vacíos

---

### 3️⃣ Eliminar un libro
**DELETE** `/api/libros/{id}`

**Descripción:** Elimina un libro según su ID.  
**Ejemplo:**  
`DELETE /api/libros/3`

**Respuestas:**
- ✅ **200 OK:** “Libro eliminado”
- ❌ **404 NOT FOUND:** “Libro no encontrado”

---

## 🧠 Buenas Prácticas Implementadas

| Práctica | Descripción |
|-----------|--------------|
| ✅ **Validación de datos** | Se verifica que los campos `titulo`, `autor` y `anio` sean válidos antes de registrar el libro. |
| ✅ **Manejo de errores** | Se usan `ResponseEntity` y códigos de estado HTTP adecuados. |
| ✅ **Seguridad básica (CORS)** | Se habilitó `@CrossOrigin` para permitir conexión con el frontend. |
| ✅ **Modularidad** | Separación clara entre modelo, servicio y controlador. |
| ✅ **Simplicidad** | API clara, con tres endpoints principales y lógica bien definida. |

---

## 🧪 Pruebas de la API
Puedes probar la API con herramientas como **Postman**, **Insomnia** o mediante el **frontend HTML** conectado.

### Ejemplo de prueba en Postman:
1. Crear una nueva petición:
    - Método: `POST`
    - URL: `http://localhost:8080/api/libros`
    - Body → JSON →
      ```json
      { "titulo": "El Principito", "autor": "Antoine de Saint-Exupéry", "anio": 1943 }
      ```

2. Probar luego:
    - `GET http://localhost:8080/api/libros`
    - `DELETE http://localhost:8080/api/libros/1`

---

## 📄 Conclusión
Los servicios web del proyecto **Biblioteca** permiten realizar las operaciones CRUD básicas sobre los libros, respetando la arquitectura REST, el principio de separación de capas y las buenas prácticas de validación y respuesta HTTP.
