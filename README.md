# com.alura.conversor_monedas.calculos.Conversor de Monedas 💱

¡Bienvenido/a a mi proyecto de conversión de monedas!  Este repositorio
contiene una pequeña aplicación de consola escrita en **Java** que
permite convertir entre algunas de las principales monedas de
Latinoamérica y el dólar estadounidense.  El objetivo de este
proyecto es poner en práctica conceptos de programación orientada
objetos, consumo de APIs REST con `HttpClient` y procesamiento de
datos en formato JSON, todo ello con un enfoque divertido y
pragmático.

## ✨ Características principales

* **Menú interactivo en español:** el programa guía al usuario
  mediante un menú claro y repetitivo, permitiendo seleccionar la
  conversión deseada y la cantidad a convertir.
* **Datos actualizados:** se utilizan las tasas de cambio
  proporcionadas por la API pública de [ExchangeRate‑API](https://www.exchangerate-api.com/docs),
  por lo que siempre obtendrás valores recientes.
* **Sin dependencias externas:** para simplificar la ejecución, el
  proyecto no requiere bibliotecas adicionales como Gson; las tasas
  se extraen mediante expresiones regulares.
* **Código comentado y organizado:** todas las clases, métodos y
  variables están nombrados en español y documentados para que
  cualquier estudiante pueda entenderlos con facilidad.

## 🚀 Cómo ejecutar

Esta aplicación está diseñada para ejecutarse con **Java 17** (o
cualquier versión que soporte `HttpClient`).  No necesitas un
compilador aparte, ya que Java permite ejecutar archivos fuente
directamente.

1. **Clona o descarga** este repositorio y descomprímelo en tu
   ordenador.
2. Abre una terminal y navega hasta la carpeta `conversor_monedas`.
3. Ejecuta el programa con el siguiente comando:

   ```bash
   java com.alura.conversor_monedas.calculos.Conversor.java
   ```

   Si prefieres compilarlo explícitamente, puedes usar `javac` (si
   está disponible):

   ```bash
   javac com.alura.conversor_monedas.calculos.Conversor.java
   java com.alura.conversor_monedas.calculos.Conversor
   ```

4. Sigue las instrucciones en pantalla, elige la conversión que
   deseas y ¡listo!  El programa te mostrará el resultado en la
   moneda destino con dos decimales.

## 🗂️ Estructura de clases

Este proyecto está diseñado con una estructura simple basada en modelos y servicios para
reflejar buenas prácticas orientadas a objetos:

| Archivo/Clase          | Descripción                                                                                             |
|------------------------|----------------------------------------------------------------------------------------------------------|
| `com.alura.conversor_monedas.modelos.Moneda.java`          | Modelo que encapsula el código y nombre de cada divisa.                                                   |
| `com.alura.conversor_monedas.modelos.TasaConversion.java`  | DTO inmutable que representa el resultado de una conversión: moneda base, destino, tasa y cantidades.    |
| `com.alura.conversor_monedas.calculos.ServicioTasas.java`   | Servicio responsable de consultar las tasas de cambio desde la API y calcular tasas cruzadas.            |
| `com.alura.conversor_monedas.calculos.Conversor.java`       | Clase que delega a `com.alura.conversor_monedas.calculos.ServicioTasas` y construye objetos `com.alura.conversor_monedas.modelos.TasaConversion` a partir de una cantidad dada.     |
| `com.alura.conversor_monedas.calculos.Menu.java`            | Gestiona la interacción con el usuario mostrando el menú (como en la imagen del desafío) y solicitando datos. |
| `com.alura.conversor_monedas.principal.Principal.java`       | Punto de entrada de la aplicación; instancia el conversor y el menú para comenzar el programa.            |

## 🧠 Aprendizajes obtenidos

Durante el desarrollo de este proyecto he aprendido a:

* Configurar un proyecto Java sin IDE pesado, utilizando solo la
  consola y un editor de texto.
* Utilizar la clase `HttpClient` de Java para realizar solicitudes
  HTTP GET y manejar respuestas síncronas.
* Extraer información de una respuesta JSON sin depender de
  bibliotecas externas, mediante expresiones regulares y tipos
  primitivos.
* Estructurar un menú interactivo con la clase `Scanner` y gestionar
  entradas del usuario de forma robusta.
* Escribir documentación clara y crear un README que transmita
  entusiasmo y facilite la comprensión del proyecto.

## 📚 Recursos útiles

Para inspirarme y crear un README informativo, tomé como referencia
este artículo de Alura: [Cómo escribir un README increíble en tu
GitHub](https://www.aluracursos.com/blog/como-escribir-un-readme-increible-en-tu-github)【238424818490803†L60-L111】.  Además, la
documentación oficial de ExchangeRate‑API fue fundamental para
entender cómo construir la URL y qué campos utilizar en la
respuesta.【238424818490803†L62-L112】

## 🤝 Contribuciones

¿Tienes ideas para ampliar este conversor?  ¡Son más que bienvenidas!
Puedes crear una *fork* del repositorio, realizar tus mejoras y abrir
un **pull request**.  Algunas posibles mejoras podrían ser:

* Añadir más monedas o permitir ingresar códigos arbitrarios.
* Implementar una interfaz gráfica con JavaFX o Swing.
* Manejar errores de red de manera más elegante.
* Escribir pruebas automáticas con JUnit para garantizar la calidad
  del código.

## 📝 Licencia

Este proyecto se distribuye bajo la licencia MIT.  Siéntete libre de
utilizarlo y adaptarlo para tus propios proyectos educativos o
personales.

## 🙋‍♀️ Autor

Me llamo **[Tu Nombre]** y soy un/a entusiasta de la programación en
Java.  Disfruto creando proyectos que combinan teoría y práctica,
especialmente cuando involucran APIs y procesamiento de datos.  Si
tienes alguna duda o sugerencia, ¡no dudes en contactarme!