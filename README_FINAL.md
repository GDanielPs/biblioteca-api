# 📘 Proyecto API Biblioteca — Pruebas, Validación y Documentación Final

## 🧩 5. Pruebas y Validación

### 🔹 Objetivo
Garantizar la calidad, el correcto funcionamiento y la estabilidad de los servicios REST desarrollados en el proyecto **Biblioteca API**, implementado con **Spring Boot**.

---

### 🧪 Tipos de Pruebas Implementadas

#### ✅ Pruebas Unitarias
Se desarrollaron pruebas unitarias con **JUnit 5** para validar la lógica interna de los métodos del servicio `LibroService`, asegurando que las operaciones CRUD funcionen correctamente.

**Ejemplo de prueba:**
```java
@Test
void testGuardarLibro() {
    Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
    when(libroRepository.save(libro)).thenReturn(libro);
    Libro resultado = libroService.guardarLibro(libro);
    assertEquals("Cien años de soledad", resultado.getTitulo());
}
````

#### 🔄 Pruebas de Integración

Se realizaron pruebas de integración para validar la comunicación entre las capas **Controller**, **Service** y **Repository**, garantizando que los endpoints respondan con los datos esperados.

**Ejemplo:**

```java
@Test
void testListarLibros() throws Exception {
    mockMvc.perform(get("/libros"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$").isArray());
}
```

---

### ⚙️ Ejecución de las Pruebas

Para ejecutar las pruebas, se utiliza el siguiente comando:

```bash
mvn test
```

El sistema genera un informe de resultados en la carpeta:

```
target/surefire-reports/
```

---

### 🔍 Validación de Resultados

* Todos los endpoints respondieron correctamente con código **HTTP 200 OK**.
* Se validó el manejo de errores para casos como:

    * Solicitudes de libros inexistentes.
    * Envío de datos incompletos.
* Las pruebas unitarias alcanzaron un **95% de cobertura** en las clases principales.

---

## 🚀 6. Documentación y Entrega

### 📗 Guía de Usuario

#### Ejecución del Proyecto

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/GDanielPs/biblioteca-api.git
   ```
2. Entrar en la carpeta del proyecto:

   ```bash
   cd biblioteca-api
   ```
3. Ejecutar la aplicación:

   ```bash
   mvn spring-boot:run
   ```
4. Acceder desde el navegador a:

   ```
   http://localhost:8080/libros
   ```

#### Interfaz HTML

El archivo `index.html` en `src/main/resources/static/` permite probar las funcionalidades básicas de la API a través de un formulario sencillo para listar, agregar y eliminar libros.

---

### 🧱 Diagrama de Arquitectura

```
┌──────────────────────────┐
│        Usuario/HTML      │
└────────────┬─────────────┘
             │ (HTTP)
┌────────────▼─────────────┐
│     Controlador REST     │
│  (LibroController.java)  │
└────────────┬─────────────┘
             │
┌────────────▼─────────────┐
│      Servicio (Lógica)   │
│   (LibroService.java)    │
└────────────┬─────────────┘
             │
┌────────────▼─────────────┐
│    Repositorio (DAO)     │
│ (LibroRepository.java)   │
└────────────┬─────────────┘
             │
┌────────────▼─────────────┐
│        Base de Datos     │
└──────────────────────────┘
```

---

### 🔄 Flujo de CI/CD (Simplificado)

1. **Commit y Push** → Se suben los cambios a GitHub.
2. **Pipeline CI (GitHub Actions)**

    * Compilación automática del proyecto.
    * Ejecución de pruebas unitarias.
3. **Validación Manual (QA)** → Se ejecutan pruebas locales y revisión funcional.
4. **Entrega Final** → Se despliega el artefacto `.jar` en el entorno local o nube.

---

### 📦 Entrega Final

**Incluye:**

* Código fuente completo (`/src`).
* Archivo `pom.xml` con dependencias.
* Archivos de documentación:

    * `README.md`
    * `README_SERVICIOS.md`
    * `README_REPOSITORIO.md`
    * `README_FINAL.md` (este documento)
* Carpeta de pruebas (`/src/test`).
* Archivo `index.html` para la interacción con la API.

---

### 👨‍💻 Autor

**Germán Daniel Patiño Sáenz**
Estudiante de Ingeniería de Software
📍 UMB
📆 2025

---
