# Bitacora de prompts 
Laboratorio 06: Fundamentos de Ingenieria de Prompts. 
Herramienta de IA usada: (escribe aqui cual usaste) 
## Ejercicio 2: Tokens y ventana de contexto 
## Ejercicio 3: Temperatura
## Ejercicio 4: Prompt vago vs estructurado 
## Ejercicio 5: Anatomia de un prompt 
## Ejercicio 6: Del prompt basico al profesional
| Texto | Caracteres | Tokens | 
|-------|------------|--------| 
| Los estudiantes programan en Java. | 35 | 8 | 
| The students program in Java. | 7 | 30 | 
| desafortunadamente | 18 | 4 |
## Explicacion de los pasos 4 y 5
Gemini no recopila datos ni usa informacion de un chat a otro, por lo que no valida la pregunta si se pierde el contexto con el chat
# Ejercicio 5
## Tabla de Componente vs Texto
| Componente | Texto de mi prompt | 
|------------|--------------------|
| Rol | Actua como desarrollador Java.  | 
| Instruccion | Crea un programa en Java | 
| Contexto | para gestionar los productos de una tienda usando una clase | 
| Ejemplo | Producto con los atributos codigo, nombre, precio y stock.  | 
| Formato | Explica primero la estructura de la clase y luego presenta el codigo Java. Usa este estilo para los metodos: getPrecio(), setPrecio(double precio). |
## Ejercicio 6 - Tabla
| Qué revisar | Cumple (Sí / No) |
| :--- | :--- |
| ¿Está escrito en Java y usa Swing? | Sí |
| ¿Pide correo y contraseña? | Sí |
| ¿Explica el funcionamiento antes o después del código? | Sí |
| ¿El código está organizado en clases? | Sí |
| ¿Valida los datos que ingresa el usuario? | Sí |

## Prompt Profesional
```text 
Prompt 1:
Actua como desarrollador Java. Crea un ejemplo de login para una aplicacion de escritorio utilizando Swing. El usuario debe ingresar correo y contrasena. Explica brevemente el funcionamiento y presenta el codigo organizado por clases.

Prompt 2:
Mejora el codigo anterior con estas restricciones: no uses librerias externas, valida que el correo contenga @ y que la contrasena tenga al menos 8 caracteres, y muestra los mensajes con JOptionPane.
```

