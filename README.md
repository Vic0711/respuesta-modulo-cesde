# Course Manager - Cesde

## Descripción  
Esta aplicación permite gestionar los cursos ofrecidos en Cesde, incluyendo la asignación de docentes. Implementa CRUD para cursos y docentes con filtros de búsqueda.  

## Instalación y configuración  

### 1. Clonar el repositorio  
```bash
git clone <URL_DEL_REPOSITORIO>
cd course-manager
```

### 2. Configurar la base de datos  
Ejecutar el script `database.sql` en MySQL.  

### 3. Configurar `application.properties`  
Modificar `src/main/resources/application.properties` con los datos de tu base de datos.  

### 4. Ejecutar el proyecto  
```bash
mvn spring-boot:run
```

### 5. Endpoints disponibles  
- `GET /courses` → Lista todos los cursos  
- `POST /courses` → Crea un nuevo curso  
- `DELETE /courses/{id}` → Elimina un curso  
- `GET /teachers` → Lista todos los docentes  
- `POST /teachers` → Crea un nuevo docente  
- `DELETE /teachers/{id}` → Elimina un docente  

## Filtros de búsqueda añadidos

Ahora puedes filtrar los cursos utilizando los siguientes parámetros en el endpoint `GET /courses`:

1. **Filtrar por nombre** (búsqueda parcial, sin distinción de mayúsculas/minúsculas):  
   ```
   GET /courses?name=Java
   ```
2. **Filtrar por rango de precios**:  
   ```
   GET /courses?minPrice=100&maxPrice=500
   ```
3. **Filtrar por fecha de inicio después de una fecha específica**:  
   ```
   GET /courses?startDateAfter=2024-02-01T00:00:00
   ```

Estos filtros se pueden combinar para obtener resultados más específicos.
