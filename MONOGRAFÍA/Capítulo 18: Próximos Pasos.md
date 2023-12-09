# PROXIMOS PASOS
## REQUERIMIENTOS NO ATENDIDOS
Si bien el flujo de actividades que se ha presentado en la demo de la apliación de este trabajo comprende gran parte de las funcionalidades principales de un sistema de planillas completo, aún no se ha cumplido el 100% de los requerimientos necesarios para este. Estos requerimientos pertenecen a los siguientes módulos:
### ASISTENCIA
Este es una mejora al módulo ya existente del módulo Registro de Movimientos y Asistencia de Planilla, este módulo deberá permitir en un futuro hacer todo los siguiente: permitir gestionar permisos, licencias y vacaciones de los empleados, registrar la asistencia, horas extras, horas no trabajadas, feriados laborados y ausencias de los empleados y también se contará con un calendario, que permita visualizar las fechas de vacaciones, licencias, ausencias y permisos de los empleados, de manera que facilite la coordinación en la empresa.
### DOCUMENTOS
El sistema de planillas deberá, en un futuro, permitir la subida de plantillas de documentos como por ejemplo, el Contrato tipo, Anexo tipo,  Certificado de Antigüedad, Certificado de Vacaciones, Finiquito, Carta de Aviso o Certificado de Renta Anual, entre muchos otros, pero además también se podrá hacer gestión documental, de manera que se tenga un repositorio de documentos de cada empleado de la empresa.
Otro agregado será el de firma electrónica del empleado, a los cuales se les notificará a través de la plataforma y su correo que tienen documentos pendientes de firma, para firmar digitalmente deberán ingresar a la plataforma con su usuario respectivo, ir al módulo documentos, revisar el documento, ingresar la contraseña de usuario, luego se le enviará un correo su código de confirmación, el cual luego de ser ingresado en la plataforma hará que el documento figure como firmado por el empleado.
### AMONESTACIONES
A través de este módulo se buscará que se pueda registrar amonestaciones al personal de la empresa sin muchas dificultades.
Se creará dentro de este módulo una opción "Crear amonestación", en donde se deberá elegir al empleado vigente a amonestar, luego de esto se podrá crear un reporte sobre la amonestación indicando los detalles de este.

## CAMBIOS NECESARIOS
Con el fin de salvaguardar la seguridad de la empresa y de los empleados de esta, podría considerarse aplicar una capa adicional de seguridad, como una autenticación multifactor por ejemplo, a través de códigos de verificación, además del cifrado de datos, el cual ayudará a proteger los datos sensibles de la plataforma, como los datos financieros por ejemplo, esto podría hacerse usando la extensión pgcrypto.
Además también se necesitará organizar los componentes de acuerdo a los módulos que se han establecido en este documento, de manera que se simplifique el diseño y se reduzca la complejidad para facilitar la detección de errores, lo que a su vez facilitaría su corrección.
## ROADMAP
Luego de los cambios necesarios mencionados se procederá con la fase de pruebas, la cual en caso de pasar exitosamente, se pasará a desplegar la apliación web en un servicio cloud, como pueden ser Amazon Web Services (AWS), Microsoft Azure, Google Cloud Platform (GCP) o Oracle Cloud Infrastructure (OCI). Finalmente, luego de todo esto, la aplicación web entrará en uso y se le dará un mantenimiento periódico, y actualizaciones cada que sea necesario.
![image](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/INFORME%204/Im%C3%A1genes/roadmap.PNG)

