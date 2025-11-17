# Conversor de Monedas 💱

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


## 🙋‍♀️ Autor

Me llamo **David Manzueta** y soy un/a entusiasta de la programación en
general.  Disfruto creando proyectos que combinan teoría y práctica,
especialmente cuando involucran APIs y procesamiento de datos. 
