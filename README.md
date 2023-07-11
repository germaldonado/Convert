# Nombre del Proyecto 📋

"**Convert:** se enfoca en hacer intercambio de monedas, convertir unidades de peso y, próximamente, hacer traduciones. Esta aplicación es muy útil para cualquier persona que necesite hacer estas conversiones de manera rápida y eficiente. 😀

<div style="text-align: center; padding: 10px; display:flex flex-direction:column">
    <h1 style="font-size:25px; text-decoration-line: underline;">Version Escritorio 💻</h1>
    <div style="display:flex; flex-wrap: wrap; gap:5px; justify-content: center;">
    <img src="/src/img/Convert_1.png" width="300px">
    <img src="/src/img/Convert_2.png" width="300px">
    <img src="/src/img/Convert_3.png" width="300px">
    </div>    
</div>

# Link Proyecto

<div style="display: flex; flex-direction: column; align-items: center;">
    <img src="/src/img/convert.png" width="50px">
    <a style="color: blue; font-size: 20px; display: block; text-align: center;" href="https://github.com/germaldonado/Convert" target="_blank">Convert</a>
</div>

## Instalación ⚙️

1. Descarga e instala **NetBeans**: Lo primero que necesitarás es un entorno de desarrollo integrado (IDE) para Java. Puedes descargar e instalar NetBeans desde el sitio web oficial.
2. Clona el proyecto: Una vez que tengas NetBeans instalado, clona el proyecto de Java desde el repositorio de Git donde se encuentra alojado.
3. Abre el proyecto en NetBeans: Abre NetBeans y selecciona "Open Project" desde el menú "File". Navega hasta la ubicación del proyecto clonado y selecciónalo para abrirlo en NetBeans.
4. Configura las librerias: Para que el proyecto funcione correctamente, necesitarás configurar las librerias. En el archivo **nbproject/project.properties** del proyecto, encontrarás una sección que se parece a lo siguiente:

```
    javac.classpath=\
    ${libs.absolutelayout.classpath}:\
    ${libs.SwingX.classpath}:\
    ${libs.JSON.classpath}:\
    ${libs.Dotenv.classpath}
```

- ![JAR](https://img.shields.io/badge/Absolutelayout-JAR-red) <a href="https://mavenlibs.com/jar/file/org.netbeans.external/AbsoluteLayout">Absolutelayout</a>
- ![JAR](https://img.shields.io/badge/SwingX-JAR-blue) <a href="https://mavenlibs.com/jar/file/org.swinglabs/swingx">SwingX</a>
- ![JAR](https://img.shields.io/badge/JSON-JAR-orange) <a href="https://mavenlibs.com/jar/file/org.json/json">JSON</a>
- ![JAR](https://img.shields.io/badge/Dotenv-JAR-green) <a href="https://mavenlibs.com/jar/file/io.github.cdimascio/dotenv-java">Dotenv</a>

  Esto indica que el proyecto depende de las siguientes librerias: **absolutelayout, SwingX, JSON y Dotenv.** Necesitarás descargar e instalar estas librerias y agregarlas al proyecto en NetBeans.

5. Agrega las bibliotecas de **[Raven Laing](https://github.com/DJ-Raven)**: Para agregar los componentes de Raven Laing para **[Material Combobox](https://github.com/DJ-Raven/raven-project) y [Button Custom](https://github.com/DJ-Raven/java-swing-button)** en el proyecto, descarga los archivos correspondientes en su GitHub y luego agrégalos al proyecto en NetBeans.
6. Configura la integración de la API **[Exchange Rates Data API de APILayer](https://apilayer.com/marketplace/exchangerates_data-api)**: Para configurar la integración de la API Exchange Rates Data API de APILayer en el proyecto, necesitarás obtener una clave de API de APILayer y agregarla al archivo .env. Luego, en el código, utiliza la biblioteca JSON para realizar la solicitud HTTP a la API y procesar la respuesta.

7. Compila el proyecto: Una vez que hayas configurado las librerias, componentes y la integración de la API, puedes compilar el proyecto en NetBeans. Si hay errores de compilación, tendrás que solucionarlos antes de poder continuar.

8. Ejecuta el proyecto: Una vez que el proyecto se haya compilado correctamente, puedes ejecutarlo en NetBeans para asegurarte de que funciona como se espera.

### Requisitos 📄

1. Conocimientos básicos de programación: es probable que necesiten tener un conocimiento básico de programación, incluyendo conceptos como **variables, tipos de datos, condicionales y bucles**.

2. Conocimientos de Java: tenga conocimientos de **Java**, incluyendo la sintaxis básica, las estructuras de datos y el paradigma de **programación orientada a objetos**.

3. Conocimientos de Git: Si alguna persona quiere colaborar con el proyecto, necesitará tener conocimientos de **Git, GitLab ó GitHub** para poder clonar y contribuir al repositorio.

4. Conocimientos de bibliotecas y APIs: el proyecto utiliza bibliotecas externas o **APIs**, deberá tener conocimientos sobre cómo integrarlas en el proyecto y cómo interactuar con ellas.

## Uso 💪

Esta aplicación es muy útil para cualquier persona que trabaje en finanzas, negocios internacionales, o simplemente viaje con frecuencia a países con diferentes monedas y unidades de medida. Con esta App podrían hacer conversiones de manera rápida y precisa, lo que les ahorraría tiempo y esfuerzo.

## Construido con 🛠️

<div style="text-align: center; padding: 10px;">
    <img src="/src/img/java.png" width="100px">
</div>

## Deployment 🚀

El patrón de diseño de la aplicación se separa en tres componentes principales: el modelo, la vista y el controlador. El modelo es responsable de manejar los datos y la lógica de negocio de la aplicación, la vista es responsable de la presentación de la información al usuario y el controlador es responsable de manejar las solicitudes del usuario y coordinar la interacción entre el modelo y la vista.

Para el modelo podría manejar los datos de conversión, como las tasas de cambio de moneda y las relaciones de conversión de unidades de medida. La vista podría mostrar las opciones de conversión al usuario y permitirles ingresar los valores de conversión. El controlador podría manejar las solicitudes del usuario y coordinar las interacciones entre la vista y el modelo.

Este enfoque de diseño ayuda a separar las diferentes responsabilidades de la aplicación, lo que puede facilitar la comprensión y el mantenimiento del código, así como mejorar la escalabilidad de la aplicación.

## Autores ✒️

- **German Maldonado** - _Edición #2: Challenge Back End Java - Conversor_ - [germanldonado](https://gitlab.com/germaldonado)

## Expresiones de Gratitud

- Quiero expresar mi sincero agradecimiento a **AluraLatam y Oracle** por brindarme la oportunidad de aprender y desarrollar mis habilidades en programación. Gracias a su dedicación y compromiso con la educación en tecnología, he podido crecer profesionalmente y alcanzar mis metas en el campo de la programación. 🤓.
- También quiero agradecer a los **instructores de AluraLatam** por su dedicación y paciencia en ayudarme a aprender y comprender conceptos complejos. Su experiencia y conocimiento en el campo de la programación han sido invaluables para mí y han contribuido significativamente a mi crecimiento en este campo. 📢.
- Finalmente, quiero agradecer a todos aquellos que me han apoyado y motivado en el desarrollo de mi aplicación. Su confianza en mí y su apoyo han sido fundamentales para mantenerme enfocado y motivado a lo largo del proceso de desarrollo. Sin su ayuda, no habría sido posible alcanzar el éxito que he logrado hasta el momento.

¡Gracias de nuevo su confianza y apoyo han sido fundamentales para mantenerme enfocado y motivado a lo largo del proceso de desarrollo. 🌟.

---

⌨️ con ❤️ por [German Maldonado](https://gitlab.com/germaldonado) 😊

---
