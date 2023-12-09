# CAPÍTULO 3: MÓDULOS
## 3.1. CÓDIGOS DE REQUERIMIENTO

<table>
	<tbody>
		<tr>
			<td>#</td>
			<td>Módulo</td>
			<td>#</td>
			<td>Caso de Uso</td>
			<td>Código</td>
		</tr>
		<tr>
			<td rowspan="3">1</td>
			<td rowspan="3">Autenticación de usuario</td>
			<td>1</td>
			<td>Autenticación de Usuario</td>
			<td>R001</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Olvido de contraseña</td>
			<td>R002</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Cambiar contraseña e iniciar sesión</td>
			<td>R003</td>
		</tr>
		<tr>
			<td rowspan="5">2</td>
			<td rowspan="5">Solicitudes</td>
			<td>4</td>
			<td>Ver solicitudes (Administrador)</td>
			<td>R004</td>
		</tr>
		<tr>
			<td>5</td>
			<td>Detalle de Solicitud</td>
			<td>R005</td>
		</tr>
		<tr>
			<td>6</td>
			<td>Respuesta Solicitud</td>
			<td>R006</td>
		</tr>
		<tr>
			<td>7</td>
			<td>Pantalla Solicitudes (Empleado)</td>
			<td>R007</td>
		</tr>
		<tr>
			<td>8</td>
			<td>Nueva Solicitud</td>
			<td>R008</td>
		</tr>
		<tr>
			<td rowspan="3">3</td>
			<td rowspan="3">Empleados</td>
			<td>9</td>
			<td>Registrar Empleado en Sistema</td>
			<td>R009</td>
		</tr>
		<tr>
			<td>10</td>
			<td>Ver usuarios vigentes o activos</td>
			<td>R010</td>
		</tr>
		<tr>
			<td>11</td>
			<td>Ver usuarios desvinculados o inactivos</td>
			<td>R011</td>
		</tr>
		<tr>
			<td rowspan="2">4</td>
			<td rowspan="2">Administración de la empresa</td>
			<td>12</td>
			<td>Editar información de la empresa</td>
			<td>R012</td>
		</tr>
		<tr>
			<td>13</td>
			<td>Editar las Variables de la Empresa</td>
			<td>R013</td>
		</tr>
		<tr>
			<td rowspan="2">5</td>
			<td rowspan="2">Organización</td>
			<td>14</td>
			<td>Crear nuevo cargo</td>
			<td>R014</td>
		</tr>
		<tr>
			<td>15</td>
			<td>Crear nueva área</td>
			<td>R015</td>
		</tr>
		<tr>
			<td rowspan="6">6</td>
			<td rowspan="6">Planillas</td>
			<td>16</td>
			<td>Planillas</td>
			<td>R016</td>
		</tr>
		<tr>
			<td>17</td>
			<td>Empleados en una planilla</td>
			<td>R017</td>
		</tr>
		<tr>
			<td>18</td>
			<td>Crear una planilla</td>
			<td>R018</td>
		</tr>
		<tr>
			<td>19</td>
			<td>Planillas pagadas</td>
			<td>R019</td>
		</tr>
		<tr>
			<td>20</td>
			<td>Boletas </td>
			<td>R020</td>
		</tr>
		<tr>
			<td>21</td>
			<td>Generar pago</td>
			<td>R021</td>
		</tr>
		<tr>
			<td rowspan="2">7</td>
			<td rowspan="2">Registro de movimientos y asistencias</td>
			<td>22</td>
			<td>Registrar movimiento de planilla</td>
			<td>R022</td>
		</tr>
		<tr>
			<td>23</td>
			<td>Registrar licencias, inasistencias y vacaciones</td>
			<td>R023</td>
		</tr>
	</tbody>
</table>

## 3.2. DESCRIPCIÓN DE MÓDULOS
### 3.2.1. Módulo Autenticación de usuario 
#### - Responsabilidades
- Gestionar el proceso de inicio de sesión de los usuarios (empleados y administradores).
- Validar la autenticidad de la información ingresada por los usuarios.
- Dar las funcionalidades respectivas al usuario dependiendo de qué datos se ingresen.
- Permitir la recuperación de contraseñas en caso de olvidos de los usuarios.
#### - Interacción con otros módulos
No tiene interacción directa con otros módulos dentro del sistema de planilla, sino como prerrequisito para acceder a ellos, ya que se debe autenticar el usuario para ingresar a la plataforma.
### 3.2.2. Módulo Solicitudes
#### - Responsabilidades
- Gestionar el proceso de solicitudes de los empleados.
- Permitir al administrador dar respuesta a las solicitudes hechos por los empleados.
- Permitir al empleado explicar el motivo de su solicitud.
- Permitir ver al empleado el estado de sus solicitudes.
#### - Interacción con otros módulos
No tiene interacción directa con otros módulos dentro del sistema de planilla.
### 3.2.3. Módulo Empleados
#### - Responsabilidades
- Crear cuenta para empleado.
- Visualizar los empleados vigentes o activos.
- Visualizar los empleados desvinculados o inactivos.
#### - Interacción con otros módulos
Interacción con el módulo Organización, ya que al crear un usuario se ingresará el cargo y área de este, los cuales deberán ser creados antes en el módulo Organización.
### 3.2.4. Módulo Administración de la empresa
#### - Responsabilidades
- Editar información de la empresa: Permite a los usuarios autorizados editar y actualizar la información de una empresa registrada en la plataforma. Esto incluye datos generales, bancos, opciones de gratificaciones, cajas de compensaciones y representantes legales.
- Modificar variables de la empresa: Permite a los clientes de Buk realizar ajustes en las variables de sus razones sociales, como mutualidad, tasas de cotización y otros campos relevantes, de acuerdo con las necesidades de su industria y procesos.
#### - Interacción con otros módulos
Tiene interacción con el Módulo Planilla, ya que en los diferentes casos, para el cálculo, generar boleta, se envían los datos de este módulo para que haya representación por parte de la empresa, como el logo, variables, nombre, etc.
### 3.2.5. Módulo Organización
#### - Responsabilidades
- Crear y Gestionar Cargos: Permite a los usuarios crear, editar y gestionar cargos en la organización. Esto incluye la definición de detalles como nombre, código, descripción, requisitos y áreas de vinculación.
- Crear y Gestionar Áreas: Facilita la creación y administración de áreas organizativas en la empresa. Los usuarios pueden personalizar los nombres de los niveles de división y crear divisiones, áreas y subáreas según sea necesario.
- Visualizar Organigrama: Permite a los usuarios, en particular al personal de Recursos Humanos (RRHH), acceder y visualizar el organigrama de la empresa. El organigrama proporciona una representación gráfica de la estructura jerárquica de la organización.
#### - Interacción con otros módulos
Con el Módulo de Empleados, ya que estas creaciones son fundamentales hacerlas primero antes de crear un Empleado, ósea hacer su contrato en la plataforma, ya que, en ese caso, al colocar los datos del trabajador, se necesitará datos como cargo, división, área, sub-área, es por ello que primero se crea este, debido a que los puestos pueden obtenerlo muchos empleados
### 3.2.6. Módulo Planillas
#### - Responsabilidades
- Gestiona el proceso de creación de planilla.
- Permitir la generación de planillas para un nuevo periodo.
- Permitir a el administrador incluir o retirar a empleados de la planilla.
- Permitir el registro de los movimientos de planilla para cada trabajador durante un periodo.
- Permitir visualizar el registro de todas las planillas, las boletas y la información referente a pagos
de cada trabajador.
#### - Interacción con otros módulos
Interacción con el Módulo Registro de movimientos y asistencias.
### 3.2.7. Módulo Registro de movimientos y asistencias
#### - Responsabilidades
- Registrar los movimientos de planilla, de cada planilla activa durante un periodo dado.
- Registrar conceptos como inasistencias, vacaciones, licencias, entre otros. Dentro de cada
planilla activa durante un periodo dado.
- Permitir a los administradores el registro de dichos datos de manera eficiente.
#### - Interacción con otros módulos
Interacción con el Módulo de Empleados y el Modulo de Planilla.


<br><br><br><br>
[índice](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/Cap%C3%ADtulo%2000%3A%20Presentaci%C3%B3n.md)
<br>
[Capítulo Anterior](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/Cap%C3%ADtulo%2002%3A%20Requerimientos.md)
<br>
[Capítulo Siguiente](https://github.com/JordanLau21/DBD-Grupo2---23-2/blob/main/MONOGRAF%C3%8DA/Cap%C3%ADtulo%2004%3A%20Prototipo.md)

