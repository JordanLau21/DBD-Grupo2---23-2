# CAPITULO 11
## ASIGNACIÓN DE CÓDIGOS Y REQUERIMIENTOS
### CÓDIGOS DE REQUERIMIENTO


### REQUERIMIENTOS
#### Modulo: Autenticacion de usuario
| Código | R001  |
|----------|----------|
|Nombre  |Autenticación de Usuario|
|Objetivo  |Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta|
| Descripción   | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos   |
| Actor primario    | Un administrador de RRHH o otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R002  |
|----------|----------|
|Nombre  |Olvido de contraseña|
|Objetivo  |Validar veracidad de usuario para cambiar la contraseña que el usuario ha olvidado.|
| Descripción   | El usuario ingresará sus datos personales para asi poder validar la veracidad de su persona, para que así tenga la potestad de poder cambiarla.   |
| Actor primario    | Un administrador de RRHH u otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R003 |
|----------|----------|
|Nombre  |Cambiar contraseña e iniciar sesión|
|Objetivo  |Cambiar la contraseña que el usuario ha olvidado e iniciar sesión.|
| Descripción   | Una vez verificado la veracidad del usuario, se le enviará un mensaje de texto a su celular registrado en la base de datos (el codigo será 1234) para que asi este pueda cambiar la contraseña anterior y poder iniciar sesión en su cuenta.  |
| Actor primario    | Un administrador de RRHH u otro empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |
#### Modulo: Solicitudes
| Código | R004  |
|----------|----------|
|Nombre  |Ver solicitudes (Administrador)|
|Objetivo  |Verficiar todas las solicitudes que el administrador tiene pendientes de aceptar o rechazar.|
| Descripción   | Una vez que el administrador ingrese a la parte de solicitudes, este podrá visualizar todas las solicitudes que se han hecho hasta el momento, donde tendrá acceso a verfiicar los detalles de la solicitud y tendrá la potestad de aprobar o rechazar la solicitud.   |
| Actor primario    | Un administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | Esta vista solo la puede obtener alguien con un correo de administración  |

| Código | R005  |
|----------|----------|
|Nombre  |Detalle de Solicitud|
|Objetivo  |Verificar la sustentación de la solicitud hecha por los empleados.|
| Descripción   | El administrador y los empleados podrán ver los detalles de las solicitudes hechas para así, en el caso de los administradores, poder evaluarlas y darles una respuesta o, en el caso de los empleados, poder verificar los detalles de la solciitud.   |
| Actor primario    | Un administrador de RRHH u otro empleado |
| Actor secundario    | -  |
| Precondiciones    | Los datos que ingrese el usuario deben estar en la base de datos del sistema  |

| Código | R006  |
|----------|----------|
|Nombre  |Respuesta Solicitud|
|Objetivo  |Modificar el estado de una solciitud en espera a Aceptado o Rechazado.|
| Descripción   | Una vez pasada la solicitud por el jefe del empleado y este habiendo dado su respuesta, el administrador podrá cambiar el estado de la solicitud a Aceptado o Rechazado dependiendo de los criterios que tenga el jefe del empleado y el mismo administrador   |
| Actor primario    | Un administrador de RRHH  |
| Actor secundario    | Jefe del empleado solicitante |
| Precondiciones    | Debe haber una solicitud para poder dar respuesta |

| Código | R007  |
|----------|----------|
|Nombre  |Pantalla Solicitudes (Empleado) |
|Objetivo  |Verificar el registro de solicitudes hechas por el empleado.|
| Descripción   | El usuario podrá verificar el historial de sus solicitudes anteriores hechas con detalles y estado incluidos. |
| Actor primario    | Un empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | Para ver el historial, el empleado debe haber hecho obligatoriamente una solciitud anteriormente |

| Código | R008  |
|----------|----------|
|Nombre  |Nueva Solicitud|
|Objetivo  |Generar una nueva solcitud.|
| Descripción   | El usuario podrá generar una nueva solicitud en la cual dependiendo del tipo de solicitud le apareceran 2 diferentes pantallas, una con opción de ingresar un monto (Reclamo, Aumento, Adelanto) y otra sin esa opción (Licencia, Vacaciones, Configuración de Información).   |
| Actor primario    | Un empleado de la empresa  |
| Actor secundario    | -  |
| Precondiciones    | -  |
### Modulo: Empleados
| Código | R009  |
|----------|----------|
|Nombre  |Registrar Empleado en Sistema|
|Objetivo  |Introducir los datos de un empleado con contrato vigente con la empresa al sistema de planillas.|
| Descripción   |A través de la subida de datos del empleado, este podrá visualizar sus planillas.|
| Actor primario    |Administrador|
| Actor secundario    |Empleado|
| Precondiciones    |El empleado debe tener un contrato firmado y vigente con la empresa.|


| Código | R010  |
|----------|----------|
|Nombre  |Ver usuarios vigentes o activos|
|Objetivo  |Visualizar los usuarios activos en el sistema de planillas.|
| Descripción   |El administrador podrá visualizar los usuarios cuyo estado es activo en el momento, es decir, los empleados que tienen contrato vigente con la empresa.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El usuario tiene contrato vigente con la empresa.|

| Código | R012  |
|----------|----------|
|Nombre  |Ver usuarios desvinculados o inactivos|
|Objetivo  |Desvincular a un empleado activo o visualizar a los empleados desvinculados.|
| Descripción   |El administrador podrá desvincular usuarios activos, por término de contrato, además de poder visualizar los empleados desvinculados anteriormente.|
| Actor primario    |Administrador|
| Actor secundario    |Empleados|
| Precondiciones    |El empleado no tiene contrato vigente con la empresa.|


### Modulo: Administración de la Empresa

| Código | R014 |
|----------|----------|
|Nombre  |Editar información de la empresa|
|Objetivo  |Editar información de la empresa en la plataforma|
| Descripción   | Este caso de uso permite al personal de Recursos Humanos (RRHH) editar y actualizar la información de la empresa en la plataforma. La edición de información incluye datos generales, bancos, Régimen y representantes legales de la empresa   |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Acceso a la plataforma con credenciales de usuario válidas, contar con permisos específicos para acceder y visualizar el organigrama de la empresa  |

| Código | R0015 |
|----------|----------|
|Nombre  |Editar las Variables de la Empresa|
|Objetivo  |Modificar las variables de la empresa|
| Descripción   | Este procedimiento permite a los administradores realizar ajustes en las variables de sus razones sociales, como EPS, Vida Ley, SCTR Salud, SCTR Pensión, Porcentaje de vida Ley, Porcentaje SCTR Salud, Porcentaje de SCTR Pensión y otros campos relevantes, de acuerdo con la ley del gobierno peruano |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada |

### Modulo: Organización

| Código | R0016 |
|----------|----------|
|Nombre  |Crear nuevo cargo|
|Objetivo  |Facilitar el proceso de creación y gestión de cargos en la plataforma|
| Descripción   | Este procedimiento tiene como finalidad explicar de manera detallada cómo crear cargos en la plataforma, los usuarios 
 obtendrán información sobre el proceso de creación, así como la utilización de opciones para gestionar cargos de manera eficiente, se aborda la creación individual |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada, conocimiento de la estructura organizativa |

| Código | R0017 |
|----------|----------|
|Nombre  |Crear nueva área|
|Objetivo  |Facilitar la creación de áreas en la plataforma, para establecer una estructura organizacional eficiente|
| Descripción   | Este procedimiento proporciona una guía detallada para la creación de áreas en la plataforma, permitiendo a los usuarios configurar una estructura organizacional precisa y efectiva. Se aborda la creación individual, incluyendo la personalización de
los nombres de los niveles de división |
| Actor primario    | Administrador de R.R. H.H  |
| Actor secundario    | -  |
| Precondiciones    | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada |

### Modulo: Planillas

| Código | R018  |
|----------|----------|
|Nombre  | Planillas|
|Objetivo  |Visualizar todas las planillas que están registradas en la base de datos|
| Descripción   | El administrador puede visualizar todas las planillas de los distintos periodos de trabajo  |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R019  |
|----------|----------|
|Nombre  | Empleados en una planilla|
|Objetivo  |Visualizar todos los empleados en una planilla en específica|
| Descripción   | El administrador puede visualizar todos los trabajadores en una planilla, además se brindan datos adicionales sobre la planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R020  |
|----------|----------|
|Nombre  |Crear una planilla|
|Objetivo  |Generar una nueva planilla |
| Descripción   | Se creará una nueva planilla que servirá para realizar a los trabajadores, esta planilla está delimitada por algunos parametros como el periodo y la periodicidad, además se pueden visualizar los empleados que estarán incluidos en esta nueva planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |


| Código | R021  |
|----------|----------|
|Nombre  | Planillas pagadas|
|Objetivo  |Visualizar las planillas que ya fueron pagadas |
| Descripción   | El administrador puede visualizar las planillas que ya fueron pagadas, visualizando otros datos como el monto resultante que se le pago a todos los trabajadores en esa planilla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R022  |
|----------|----------|
|Nombre  | Boletas |
|Objetivo | Visualizar los pagos a empleados y detalles de boleta |
| Descripción   | El administrador puede visualizar los montos de pago a cada empleado por planilla, además puede visualizar cada una de las boletas generadas a partir de una planilla. Se muuestra tambien los detalles de cada boleta |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |

| Código | R023  |
|----------|----------|
|Nombre  | Generar pago |
|Objetivo | Generar el pago para trabajdores en planilla |
| Descripción   | El administrador puede generar las boletas de pago por una planilla, visualizando previamente algunas variables en pantalla |
| Actor primario    | Administrador de RRHH |
| Actor secundario    | -  |
| Precondiciones    | -  |



