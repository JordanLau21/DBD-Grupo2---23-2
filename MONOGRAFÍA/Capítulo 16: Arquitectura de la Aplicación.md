# Capítulo 16: Arquitectura de la Aplicación

## ESTRUCTURA DE LA APLICACIÓN

La estructura de la aplicación se basa en el uso de una API REST (Application Programming Interface Representational State Transfer), la cual emplea el formato de intercambio de datos JSON (JavaScript Object Notation).

## TECNOLOGIA UTILIZADA

### HERRAMIENTAS
Para el desarrollo, se empleará IntelliJ IDEA como IDE principal debido a su versatilidad, compatibilidad con diversas tecnologías de desarrollo y su eficiencia en el desarrollo de software. 
Para probar la interacción con la API (Interfaz de Programación de Aplicaciones), se utilizará Postman, una herramienta de acceso libre y ampliamente reconocida en la comunidad de desarrollo por su facilidad de uso y eficacia.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/1.jpg)
### BASES DE DATOS
Para la base de datos, implementaremos el sistema de gestión de base de datos relacional orientado a objetos PostgreSQL. Además, la herramienta que emplearemos para desarrollar y administrar la base de datos será PgAdmin 4, reconocida por su interfaz gráfica intuitiva y completa para la gestión efectiva de bases de datos PostgreSQL, además de ser la que estamos estudiando en nuestro curso de Diseño de Base de Datos.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/2.jpg)

### SERVER
En la capa del Backend, se empleará el framework de aplicación Spring en conjunto con la API JDBC para establecer la conexión con la base de datos. Esta elección de Spring se debe a la capacidad para gestionar dependencias de manera eficiente a través de Spring Boot, especialmente en el desarrollo de aplicaciones Java con el patrón MVC utilizado en nuestro trabajo. Además, las anotaciones de Spring se complementarán con Lombok para configurar de manera precisa las clases y paquetes según la capa a la que pertenecen, además el uso de la API JDBC se focalizó en facilitar el uso de las funciones hechas en PostgreSQL en el desarrollo de la aplicación.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/3.JPG)

### CLIENTE
En el Frontend, se utilizará el framework Angular de JavaScript, el cual ofrece un sólido manejo gracias a TypeScript, proporcionando tipado estático para una estructura más robusta, facilitando la implementación de paradigmas orientados a objetos y funcionales. Angular permite estructurar la página mediante componentes, directivas y pipes, ofreciendo componentes reutilizables y transformación de datos antes de su presentación. Además, facilita la gestión de rutas y control de acceso a estas, así como el uso del patrón de diseño de Inyección de Dependencias, especialmente útil en la implementación de servicios.
En cuanto a los estilos, se empleará el CSS Framework Tailwind, reconocido por no generar clases predefinidas en los elementos, a diferencia de otros frameworks, lo que ofrece mayor flexibilidad y control sobre los estilos. Tailwind es ideal para el desarrollo de proyectos ligeros al permitir una personalización detallada de los estilos y una optimización del tamaño de los archivos.

![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/4.JPG)
