# Tarea de Prompts: Mi prompt profesional 
# Tarea: Mi prompt profesional

## Funcionalidad elegida
He elegido construir un **CRUD de productos** (Crear, Leer, Actualizar, Eliminar) utilizando interfaces gráficas sencillas de escritorio en Java.

## Version 1: prompt basico
```text
Hazme un codigo en Java para un CRUD de productos
```
* **Qué cambié:** Nada, es la versión inicial vaga.
* **Por qué:** Quería observar cómo responde la IA sin restricciones ni guía estructural.
* **Qué mejoró:** El resultado fue deficiente. Me dio una aplicación de consola genérica, sin interfaz visual y asumiendo atributos al azar.

## Version 2
```text
Actua como desarrollador experto en Java. Crea un sistema CRUD de productos usando Java Swing con interfaz grafica. El sistema debe permitir registrar, listar, editar y eliminar un producto que tenga id, nombre y precio. Presenta el codigo organizado y limpio.
```
* **Qué cambié:** Añadí un **Rol** (Desarrollador experto), un **Contexto** y especificaciones técnicas (Java Swing, atributos específicos id/nombre/precio).
* **Por qué:** Necesitaba una aplicación de escritorio visual y estructurada en lugar de un programa para la consola de comandos.
* **Qué mejoró:** La IA generó las ventanas de Swing con cajas de texto y botones funcionales para cada operación del CRUD de forma legible.

## Version 3: prompt final
```text
Actúa como un desarrollador experto en Java Senior. Tu tarea es diseñar un ejemplo educativo de un sistema CRUD (Crear, Leer, Actualizar, Eliminar) de productos.

Contexto: La aplicación está orientada a estudiantes de programación de interfaces de escritorio y debe ser autocontenida para facilitar su ejecución. El modelo de datos de un producto debe incluir de forma obligatoria los atributos: id (String), nombre (String) y precio (double).

Restricciones estrictas:
1. No uses librerías externas ni gestores de bases de datos (guarda la información temporalmente en memoria, por ejemplo en un ArrayList).
2. Valida obligatoriamente que el campo "precio" sea un número positivo mayor que cero antes de procesar el registro.
3. Muestra todos los mensajes de éxito o error en ventanas emergentes de diálogo mediante JOptionPane.

Ejemplo de estilo de código para la interfaz gráfica:
```java
public class FormularioProducto extends JFrame {
    private JTextField txtNombre;
    private JButton btnGuardar;
    // Inicializar componentes en el constructor...
}
```

Formato de entrega: Explica brevemente en un párrafo la lógica del almacenamiento en memoria y luego presenta el código completo estructurado de forma limpia dentro de un bloque de código Java.

* **Qué cambié:** Incorporé **Ejemplos** de estilo de diseño, delimitación clara de componentes, **Formato** estricto de salida y 3 **Restricciones** específicas (almacenamiento en memoria, validación de datos y JOptionPane).
* **Por qué:** Para evitar que la IA use bases de datos complejas (como MySQL o SQLite) y asegurar que las validaciones lógicas obligatorias no se omitan.
* **Qué mejoró:** El código entregado fue perfecto para un entorno escolar: autocontenido en un solo archivo con validaciones numéricas sólidas y alertas gráficas interactivas nativas.

## Componentes del prompt final

| Componente | Texto de mi prompt |
| :--- | :--- |
| **Rol** | Actúa como un desarrollador experto en Java Senior. |
| **Instrucción** | Diseñar un ejemplo educativo de un sistema CRUD (Crear, Leer, Actualizar, Eliminar) de productos. |
| **Contexto** | La aplicación está orientada a estudiantes de programación de interfaces de escritorio y debe ser autocontenida... El modelo de datos incluye id, nombre y precio. |
| **Ejemplos** | `public class FormularioProducto extends JFrame { private JTextField txtNombre; ... }` |
| **Formato** | Explica brevemente en un párrafo la lógica del almacenamiento en memoria y luego presenta el código completo estructurado... |

## Evaluacion del resultado

| Qué revisar | Cumple (Sí / No) |
| :--- | :--- |
| ¿Está escrito en Java y utiliza componentes de Java Swing? | Sí |
| ¿Gestiona las 4 operaciones del CRUD con id, nombre y precio? | Sí |
| ¿Cumple la restricción de almacenar datos en memoria sin librerías externas? | Sí |
| ¿Valida que el precio sea estrictamente mayor a cero utilizando JOptionPane? | Sí |

