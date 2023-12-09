## 2.1 REQUERIMIENTOS FUNCIONALES
#### 2.1.1 Usuarios: <br>
   - Empleado de RRHH :  Usuario que podrá ver y manejar ciertas opciones del sistema de planillas.<br>
   - Administrador de RRHH:  Usuario que realizara las diferentes gestiones y manejo principal de dicho sistema. <br>
   - Administrador del sistema:  Desarrolladores web o personal del TI que podrán acceder a la parte interna del sistema, para que puedan actualizarlo, gestionar su seguridad, gestionar el función del sistema.
#### 2.1.2 Casos de Uso:  <br>
 Caso de uso #1: Autenticación de usuario <br>
| Código | R001 | 
|----------|----------|
| Objetivo | Verificar la identidad del usuario mediante un correo y una contraseña ingresada de manera correcta.|
|Descripción | El usuario ingresará su correo y contraseña respectiva para poder acceder al sistema de planillas; dicho sistema se encargará de verificar si los datos ingresados son correctos|
|  Actor primario   | Un administrador de RRHH o otro empleado de la empresa   |
| Actor Secundario |  -  |
| Precondiciones | Los datos que ingrese el usuario deben estar en la base de datos del sistema|
|  Paso  |  Acción   |
|     1  |  El usuario ingresa al sistema de planillas     |
|  2 |  El usuario ingresa su respectivo correo y contraseña  |
|   3 |   El sistema verifica si el correo ingresado está en su base de datos      |
| 4   |         El sistema verifica si la contraseña ingresada está en su base de datos |
|    5 |     El sistema verifica el tipo de usuario (administrador u empleado)    |
| 6 |   Caso terminado   |

Caso de uso #2: Olvido de contraseña <br>
| Código | R002 | 
|----------|----------|
| Objetivo |Lograr cambiar la contraseña que el usuario ha olvidado para que así acceda a su cuenta en el sistema de planillas.|
|Descripción |El usuario ingresará sus datos personales y su correo alternativo para que así, le llegue un correo a dicho con un código de verificación, el cual tendrá que ingresar en el sistema.|
|  Actor primario   | Un administrador de RRHH u otro empleado de la empresa  |
| Actor Secundario |  -  |
| Precondiciones | El código ingresado al sistema debe ser igual al que se envió a su correo|
|  Paso  |  Acción   |
|     1  | El usuario olvida su contraseña    |
|  2 |     El sistema le da la oportunidad de recuperar su contraseña   |
|  3 |  El usuario ingresa su respectivo correo y contraseña  |
|   4 | El usuario ingresa sus nombres  |
| 5 |    El usuario ingresa su DNI |
|  6 |   El sistema verifica la autenticidad de estos datos|
| 7 |   El sistema envía un código de autenticidad al correo registrado en la base de datos (1234 por defecto) |
|  8 |   El usuario ingresa el código enviado a su correo |
| 9 |   El sistema verifica el código |
|  10 |    El usuario ingresa nueva contraseña  |
|  11 |    El usuario ingresa la nueva contraseña de nuevo  |
| 12|  El sistema reemplaza dicha contraseña ingresada por la antigua en su base de datos  |
|   13|     El sistema actualiza la información de dicho usuario    |
|  14  |  El caso termina |

 Caso de uso #3: Editar información de la empresa <br>
| Código | R003 | 
|----------|----------|
| Objetivo |Editar información de la empresa en la plataforma|
|Descripción | Este caso de uso permite al personal de Recursos Humanos (RRHH) editar y actualizar la información de la empresa en la plataforma. La edición de información incluye datos generales, bancos, Régimen y representantes legales de la empresa.|
|  Actor primario   |Administrador de R.R. H.H.  |
| Actor Secundario |  -  |
| Precondiciones | Acceso a la plataforma con credenciales de usuario válidas, contar con permisos específicos para acceder y visualizar el organigrama de la empresa. |
|  Paso  |  Acción   |
|     1  | Dirigirse al módulo de Administración de la empresa   |
|  2 |  Al visualizar el Resumen, seleccionar opción “Editar” |
|   3 |  Registrar los Datos Principales de la empresa    |
| 4   |         Registrar los Datos Principales de la empresa |
|    5 |    Presionar el botón “Guardar”    |
| 6 |   Caso terminado   |

  Caso de uso #4: Editar las Variables de la Empresa <br>
| Código | R004 | 
|----------|----------|
| Objetivo |Modificar las variables de la empresa|
|Descripción |Este procedimiento permite a los administradores realizar ajustes en las variables de sus razones sociales, como EPS, Vida Ley, SCTR Salud, SCTR Pensión, Porcentaje de vida Ley, Porcentaje SCTR Salud, Porcentaje de SCTR Pensión y otros campos relevantes, de acuerdo con las necesidades de la industria y procesos|
|  Actor primario   |Administrador de R.R. H.H.  |
| Actor Secundario |  -  |
| Precondiciones | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada. |
|  Paso  |  Acción   |
|     1  |Dirigirse al módulo de Administración de la empresa  |
|  2 |  Ingresar a la opción “Variables”|
|   3 |  Ingresar a la opción “Editar”  |
| 4   |       Editar las variables que usa la empresa |
|    5 |    Presionar el botón “Guardar”  |
| 6 |   Caso terminado   |

 Caso de uso #5: Crear nuevo cargo <br>
| Código | R005 | 
|----------|----------|
| Objetivo |Facilitar el proceso de creación y gestión de cargos en la plataforma|
|Descripción |Este procedimiento tiene como finalidad explicar de manera detallada cómo crear cargos en la plataforma Este procedimiento tiene como finalidad explicar de manera detallada cómo crear y cargos en la plataforma. Los usuarios obtendrán información sobre el proceso de creación, así como la utilización de opciones para gestionar cargos de manera eficiente. Se aborda la creación individual|
|  Actor primario   |Administrador de R.R. H.H.  |
| Actor Secundario |  -  |
| Precondiciones | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada, conocimiento de la estructura organizativa.|
|  Paso  |  Acción   |
|     1  | Dirigirse a la casilla de “Administrativo” |
|  2 |  Ingresar a “Organización” |
|   3 |  Seleccionar pestaña “Cargos” |
| 4   |       Seleccionar botón “Nuevo Cargo” |
|    5 |   Ingresar el nombre del “Nuevo Cargo” |
|  6  |  Ingresar Descripción y Requerimientos del “Nuevo Cargo”   |
| 7 |   Caso terminado   |

 Caso de uso #6: Crear nueva área <br>
| Código | R006 | 
|----------|----------|
| Objetivo |Facilitar la creación de áreas en la plataforma, para establecer una estructura organizacional eficiente.|
|  Descripción |   Este procedimiento proporciona una guía detallada para la creación de áreas en la plataforma, permitiendo a los usuarios configurar una estructura organizacional precisa y efectiva. Se aborda la creación individual, incluyendo la personalización de los nombres de los niveles de división. |
|  Actor primario   |  Administrador de R.R. H.H.  |
| Actor Secundario |  -  |
| Precondiciones | Tener acceso a una cuenta. haber iniciado sesión en la plataforma, contar con los permisos necesarios y disponer de la información actualizada, conocimiento de la estructura organizativa.|
|  Paso  |  Acción   |
|     1  | Ingresar a “Organización”  |
|  2 |     Seleccionar pestaña “Área”  |
|  3 |  Seleccionar botón “Crear Área”  |
|   4 | Insertar los datos correspondientes  |
| 5 |   Seleccionar “Guardar” |
| 6  |   Guardamos la información y visualizamos el resultado |
| 7 |   Caso terminado   |

 Caso de uso #7: Crear empleado y usuario <br>
| Código | R007 | 
|----------|----------|
| Objetivo |Introducir los datos de un empleado con contrato vigente con la empresa, de manera que se cree un usuario para este.|
|  Descripción |   A través de la subida de datos del empleado, se crea un usuario que le permitirá a este poder ver su sistema de planillas.  |
|  Actor primario   |  Administrador de R.R. H.H.  |
| Actor Secundario | Empleados |
| Precondiciones | Administrador|
|  Paso  |  Acción   |
|     1  | Dirigirse a la pestaña “Empleados”. |
|  2 |   Dar click a la casilla “Crear Empleados” |
|  3 | Ingresar los datos personales del empleado, siendo los que contienen un * de carácter obligatorio. |
|   4 | El sistema verifica que los datos de carácter obligatorio hayan sido rellenados. |
| 5 |  Ingresar los datos previsionales del empleado, siendo los que contienen un * de carácter obligatorio|
|  6 |  El sistema verifica que los datos de carácter obligatorio hayan sido rellenados.|
| 7 |  Ingresar los datos del trabajo del empleado, entre los que estará el sueldo bruto, siendo los que contienen un * de carácter obligatorio.|
|  8 |   El sistema verifica que los datos de carácter obligatorio hayan sido rellenados. |
| 9 |  Dar click en finalizar|
|  10 |   El usuario habrá sido creado exitosamente.|

 Caso de uso #8: Ver los usuarios vigentes o activos <br>
| Código | R008 | 
|----------|----------|
| Objetivo |Visualizar los usuarios activos en el sistema de planillas|
|  Descripción |  El administrador podrá visualizar los usuarios cuyo estado es activo en el momento, es decir, los empleados que tienen contrato vigente con la empresa. |
|  Actor primario   |   Empleados|
| Actor Secundario |  Administrador   |
| Precondiciones | El usuario tiene contrato vigente con la empresa.|
|  Paso  |  Acción   |
|     1  | Dirigirse a la pestaña “Empleados”. |
|  2 |  Click en la casilla “Vigentes”. |
|  3 | Se visualizará la lista de todos los usuarios vigentes en ese momento.|
|   4 | Para ver los datos del empleado al detalle, dar click en el botón del ojo. |
| 5 |  Se observarán los datos personales, previsionales y de trabajo del empleado.|

 Caso de uso #9: Renovar contrato de empleado <br>
| Código | R09 | 
|----------|----------|
| Objetivo |Renovar el contrato de un empleado|
|  Descripción | El administrador podrá renovar el contrato del empleado bajo las mismas condiciones o cambiar los datos que hayan sido modificados, como por ejemplo, el cargo, área, sueldo, etc. |
|  Actor primario   | Empleados  |
| Actor Secundario | Administrador de R.R. H.H.  |
| Precondiciones | La empresa autoriza y firma con el empleado un nuevo contrato.|
|  Paso  |  Acción   |
|     1  | Dirigirse a la pestaña “Empleados”. |
|  2 |   Click en la casilla “Vigentes”.|
|  3 | Se visualizará la lista de todos los usuarios vigentes en ese momento. |
|   4 |Dar click en el botón “Renovar” |
| 5 |  Elegir el emplado a renovar y dar click nuevamente en el botón “Renovar” que aparece en la fila del empleado.|
|  6 | Se visualizará a los datos personales del empleado con los datos anteriormente ingresados por el administrador a excepción del último ítem, el cual será sobre la fecha de inicio del nuevo contrato, además en caso de ser necesario algún cambio en otro ítem se podrá ejecutar sin problema.|
| 7 |  Dar click en “Siguiente”. |
|  8 |  Se visualizará a los datos previsionales del empleado con los datos anteriormente ingresados por el administrador, además en caso de ser necesario algún cambio en otro ítem se podrá ejecutar sin problema.|
| 9 | Dar click en “Siguiente”. |
| 10 | Se visulizará los ítems de datos de trabajo vacíos, para ser rellenados con los nuevos datos del contrato. |
| 11 |  En caso de que los datos del contrato vayan a ser los mismos que el anterior, se dará click en “Condiciones Anteriores”.|
| 12 | Una vez llenado todos los datos necesarios, dar click en “Finalizar” para terminar el proceso de renovación. |

 Caso de uso #10: Ver los usuarios desvinculados <br>
| Código | R010 | 
|----------|----------|
| Objetivo |Desvincular a un empleado activo o visualizar a los empleados desvinculados.|
|  Descripción | El administrador podrá desvincular usuarios activos, por término de contrato, además de poder visualizar los empleados desvinculados anteriormente |
|  Actor primario   | Empleados  |
| Actor Secundario | Administrador |
| Precondiciones | El empleado no tiene contrato vigente con la empresa.|
|  Paso  |  Acción   |
|     1  | Dirigirse a la pestaña “Empleados”. |
|  2 |   Click en la casilla “Desvinculados”.|
|  3 | Se visualizará la lista de todos los usuarios desvinculados en ese momento y podrá verse los datos que este registró dando click en el botón “ojo”. |
|   4 |Si se quisiera desvincular a un usuario activo, dar click en el botón “Desvincular usuario”.|
| 5 | Aparecerán todos los usuarios activos en ese momento.|
|  6 | Se elige el usuario activo a desvincular dando click al botón “Desvincular” del empleado.|
| 7 |  Se da click al botón “Confirmar” de la ventana emergente. |
|  8 |  El usuario activo elegido será desvinculado y pasará a estar desactivado.|

 Caso de uso #11: Envío de solicitudes <br>
| Código | R011 | 
|----------|----------|
| Objetivo |Los empleados realicen solicitudes que puedan ser aprobadas por sus superiores.|
|  Descripción | Medio eficiente por el cual los empleados pueden realizar solicitudes en lo que respecta a permisos o quejas. |
|  Actor primario   | Un empleado de la empresa |
| Actor Secundario | Secretaría, Personal de R.R. H.H.|
| Precondiciones | Tener usuario activo|
|  Paso  |  Acción   |
|     1  | El usuario ingresa a la opción de solicitudes|
|  2 |  El usuario ingresa a la parte de “Nuevo Solicitud”|
|  3 | El usuario elige el tipo de solicitud que hará (reclamo, adelanto, vacaciones, configuración de información, aumento o licencia) |
|   4 |Dependiendo del tipo de solicitud, le aparecerá una ventana con (adelanto, aumento o reclamo) o sin la opción de ingresar un monto|
| 5 | El usuario ingresa una descripción del por qué hace dicha solicitud|
|  6 | El usuario le da a la opción de "Enviar" para confirmar su solicitud y ser enviada al administrador para revisar su caso, caso contrario, el usuario puede darle en "Cancelar" para cancelar su solicitud y no enviar nada|
| 7 | El usuario confirma el registro de solicitud |
| 8 | Caso terminado |

 Caso de uso #12: Recepción de solicitudes <br>
| Código | R012 | 
|----------|----------|
| Objetivo |Los usuarios administradores gestionen las solicitudes de los empleados.|
|  Descripción |Medio por el cual los administrativos encargados gestionan las solicitudes emitidas por los trabajadores en el sistema. |
|  Actor primario   | Secretaría |
| Actor Secundario | Empleado |
| Precondiciones | Tener usuario activo|
|  Paso  |  Acción   |
|     1  | El administrador ingresa al módulo de solicitudes. |
|  2 |  El administrador revisa todas las solicitudes o reclamos en espera. |
|  3 | El administrador verifica los detalles de dichas solicitudes o reclamos. |
|   4 |El caso termina. |

 Caso de uso #13: Verificación del estado de las solicitudes <br>
| Código | R013 | 
|----------|----------|
| Objetivo |Los usuarios trabajadores pueden ver el estado de sus solicitudes.|
|  Descripción |Medio por el cual los trabajadores podran ver si sus solicitudes hechas fueron rechazadas, aceptadas o siguen en estado de espera. |
|  Actor primario   | Empleado |
| Actor Secundario | - |
| Precondiciones | Tener usuario activo|
|  Paso  |  Acción   |
|     1  | El usuario trabajador ingresa al módulo de solicitudes. |
|  2 |  El usuario podrá ver el estado de todas las solicitudes que haya hecho. |
|  3 | El caso termina. |

 Caso de uso #14: Aceptación o Rechazo de solicitudes <br>
| Código | R014 | 
|----------|----------|
| Objetivo |Los usuarios administradores gestionen las solicitudes de los empleados.|
|  Descripción | Medio por el cual los administrativos encargados gestionan las solicitudes emitidas por los trabajadores en el sistema. |
|  Actor primario   | Secretaría|
| Actor Secundario |  Un empleado de la empresa |
| Precondiciones | Tener usuario activo|
|  Paso  |  Acción   |
|     1  | El administrador ingresa al módulo de solicitudes|
|  2 |  El administrador revisa todas las solicitudes o reclamos en espera. |
|  3 | El administrador acepta o rechaza los reclamos o solicitudes enviadas. |
|   4 |El administrador reconfirma dicha aceptación o rechazo. |
| 5 | El caso termina |

Caso de uso #15: Registrar movimiento de planilla (por periodo de planilla) <br>
| Código | R015 | 
|----------|----------|
| Objetivo |Registrar los movimientos que modifiquen el pago habitual de los empleados.|
|  Descripción | El administrador podrá registrar los movimientos que influyan en el pago de los empleados, como por ejemplo: horas extras, descuentos por cafetería, bonificación extraordinaria, minutos de tardanza, etc, por periodo de planilla. |
|  Actor primario   |Un administrador de RRHH |
| Actor Secundario | -  |
| Precondiciones | Periodo de planilla activo e informe de los movimientos de ingresos y descuentos por parte de la empresa|
|  Paso  |  Acción   |
|     1  | El administrador requiere colocar un movimiento de algún empleado. |
|  2 |  Clickea en el menú “Registro de Planilla”. |
|  3 | Seleccionar “Movimientos de planilla”. |
|   4 | Visualizara un interfaz de usuario, listando los periodos de planillas activo. |
| 5 |  Selecciona el periodo activo. |
|  6 |Visualizara el listado de empleados de dicho periodo.|
| 7 | Selecciona el empleado dándole clic en “agregar”. |
|  8 |  Visualizara algunos datos del empleado y dos secciones de ingresos y descuentos.|
| 9 |Modifica los montos de ingresos y descuentosClickeando en Editar o Agregar y asignando los valores. |
| 10 | Presiona en el botón de guardar. |

Caso de uso #16: Registrar licencias, inasistencias y vacaciones <br>
| Código | R016 | 
|----------|----------|
| Objetivo |Registrar las licencias, inasistencias y vacaciones a partir del periodo de planilla activo.|
|  Descripción | Se podrán registrar inasistencias, licencias y otros conceptos mas de cada empleado dentro de su periodo de planilla activo. |
|  Actor primario   |Un administrador de RRHH |
| Actor Secundario | -  |
| Precondiciones | Periodo de planilla activo e informe de los movimientos de ingresos y descuentos por parte de la empresa|
|  Paso  |  Acción   |
|     1  | El administrador requiere colocar un movimiento de algún empleado. |
|  2 |  Clickea en el menú “Registro de Planilla”. |
|  3 | Selecciona “Inasistencias, licencias, etc” |
|   4 |Visualización de lista de empleados activos. |
| 5 | Selecciona empleado dándole clic a “Asignar”. |
|  6 |Visualización del código y nombre, y una lista de inasistencias y vacaciones registradas del empleado.|
| 7 | Visualización de opciones, de agregar, actualizar o eliminar un concepto. |
|  8 | Elegir entre las opciones de agregar, actualizar o eliminar.|
| 9 | Visualización de los controles de datos según la opción elegida. |
| 10 | Ingreso o modificación de datos.  |
| 11 | Presionar botón de grabar.    |
| 12 |  El sistema le mostrara un mensaje de validación de los cambios.   |

Caso de uso #17: Visualizar historial de recibos de pago <br>
| Código | R017 | 
|----------|----------|
| Objetivo |El usuario trabajador pueda revisar sus boletas de pagos de meses anteriores. |
|  Descripción | El usuario trabajador podrá revisar sus boletas de pagos de meses anteriores, y poder ver los detalles de cada boleta de pago. |
|  Actor primario   |Empleado|
| Actor Secundario | -  |
| Precondiciones | - |
|  Paso  |  Acción   |
|     1  | Dirigirse a la casilla de “Administrativo”. |
|  2 | Visualización de las boletas de pago. |
|  3 | Presionar en “Ver detalles” de la boleta de pago. |
|   4 |Visualización de un cuadro donde se mostrará más detalles de las boletas de pago. |
| 5 |Ingresar el nombre del “Nuevo Cargo”. |
|  6 |Ingresar Descripción y Requerimientos del “Nuevo Cargo”.|

Caso de uso #18: Generar nueva planilla <br>
| Código | R018 | 
|----------|----------|
| Objetivo |Generar una nueva planilla correspondiente a un nuevo periodo.|
|  Descripción | El administrador genera una nueva planilla en donde puede incluir o excluir empleados para un nuevo periodo. |
|  Actor primario   | Administrador de RRHH |
| Actor Secundario | -  |
| Precondiciones | Cuenta de Administrador activo |
|  Paso  |  Acción   |
|     1  | Dirigirse al apartado Planillas. |
|  2 |  Click en el botón “Generar planilla”. |
|  3 | Seleccionar la periodicidad. |
|   4 |Seleccionar la fecha de inicio. |
| 5 | Seleccionar la fecha de finalización. |
|  6 |Click en el botón “Editar colaboradores”.|
| 7 | Click en el botón rojo para excluir a un empleado. |
|  8 | Click en el botón “Agregar empleado” para agregar empleados.|
| 9 | Click el boton verde para agregar un empleado. |
| 10 | Click en la flecha de regreso.  |
| 11 | Click en el botón verde “Aceptar”.    |
| 12 | Click en el botón verde “Generar”.   |

Caso de uso #19: Generar boletas <br>
| Código | R019 | 
|----------|----------|
| Objetivo |Generar boletas correspondientes a una planilla.|
|  Descripción | El administrador genera las boletas correspondientes a una planilla. |
|  Actor primario   | Administrador |
| Actor Secundario | -  |
| Precondiciones | Cuenta de Administrador activo, existan planillas vigentes |
|  Paso  |  Acción   |
|     1  | Dirigirse al apartado "Boletas”. |
|  2 |  Click en el botón “Generar boletas”. |
|  3 | Click en el botón “Generar”. |

Caso de uso #20: Visualizar boletas de pago (Administrador) <br>
| Código | R020 | 
|----------|----------|
| Objetivo |Visualizar las boletas de pago por periodo.|
|  Descripción | El administrador tiene acceso y visualiza las boletas de pago de las planillas por periodo. |
|  Actor primario   | Administrador |
| Actor Secundario | Empleados |
| Precondiciones | Administrador activo |
|  Paso  |  Acción   |
|     1  | Dirigirse al apartado "Boletas”. |
|  2 |  Ubicar la planilla de interes por periodo. |
|  3 |Click en el botón verde para abrir los detalles. |
|   4 |Ubicar al empleado de interés. |
| 5 | Click en el botón verde para ver los detalles de la boleta. |
|  6 |Click en la “x” para salir.|
| 7 | Click en el botón verde de documento para generar un pdf de la boleta de pago. |

## 2.2 REQUERIMIENTOS DE ALTA CALIDAD
- Exactitud: El sistema debe calcular los salarios y las prestaciones de 
los trabajadores de manera precisa.
- Completitud: El sistema debe proporcionar toda la información 
necesaria para la gestión de la nómina.
- Eficiencia: El sistema debe ser capaz de procesar la nómina de manera 
rápida y eficiente.
- Flexibilidad: El sistema debe permitir adaptar los procesos a las 
necesidades específicas de la empresa.
- Usabilidad: El sistema debe ser fácil de usar, incluso para usuarios con 
un nivel de conocimiento básico.
- Seguridad: El sistema debe contar con las medidas de seguridad 
necesarias para proteger los datos de los trabajadores.
- Mantenibilidad: El sistema debe ser fácil de mantener y actualizar.
- Rendimiento: El sistema debe funcionar de manera estable y sin errores.
## 2.3 RESTRICCIONES
- El sistema se implementará en un sistema de gestión de base de datos llamado
PostgreSQL.
- En la parte del Backend se usará el lenguaje de programación llamado JAVA usando como 
framework React, Note y Express.
- Por otro lado, en la parte del Frontend se trabajará con HTML, CSS, Javascript y 
Bootstrap debido a que los integrantes tienen mejor conocimiento de estas herramientas.



