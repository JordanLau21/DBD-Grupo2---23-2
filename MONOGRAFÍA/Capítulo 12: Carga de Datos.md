# Capítulo 12: Carga de Datos

TABLA: Régimen Pensionario

```
INSERT INTO Regimen_pensionario (tipo_regimen) VALUES ('ONP');

INSERT INTO Regimen_pensionario (tipo_regimen) VALUES ('AFP');
```
TABLA: Seguro Médico
```
INSERT INTO Seguro_medico (tipo_seguro) VALUES ('EPS');

INSERT INTO Seguro_medico (tipo_seguro) VALUES ('SIS');

INSERT INTO Seguro_medico (tipo_seguro) VALUES ('EsSalud');

INSERT INTO Seguro_medico (tipo_seguro) VALUES ('Privado');
```
TABLA: Situación de Discapacidad
```
INSERT INTO Situacion_discapacidad (tipo_discapacidad) VALUES ('Ninguna');

INSERT INTO Situacion_discapacidad (tipo_discapacidad) VALUES ('Parcial');

INSERT INTO Situacion_discapacidad (tipo_discapacidad) VALUES ('Total');
```
--
```
INSERT INTO Estado_contrato (estado_contrato) VALUES ('Vigente');

INSERT INTO Estado_contrato (estado_contrato) VALUES ('Finalizado');

INSERT INTO Estado_contrato (estado_contrato) VALUES ('Rescindido');
```
--
```
INSERT INTO Tipo_contrato (tipo_contrato) VALUES ('Indefinido');

INSERT INTO Tipo_contrato (tipo_contrato) VALUES ('Plazo Definido');

INSERT INTO Tipo_contrato (tipo_contrato) VALUES ('Obra o Proyecto');
```
--
```
INSERT INTO Tipo_jornada (tipo_jornada) VALUES ('Ordinaria');

INSERT INTO Tipo_jornada (tipo_jornada) VALUES ('Parcial');

INSERT INTO Tipo_jornada (tipo_jornada) VALUES ('Excenta');
```
--
```
INSERT INTO Frecuencia_pago(frecuencia_pago) VALUES ('Mensual');

INSERT INTO Frecuencia_pago(frecuencia_pago) VALUES ('Quincenal');

INSERT INTO Frecuencia_pago(frecuencia_pago) VALUES ('Por obra o proyecto');
```
--
```
INSERT INTO Medio_pago(medio_pago,entidad_financiera,cuenta) VALUES ('Efectivo',NULL,NULL);

INSERT INTO Medio_pago(medio_pago,entidad_financiera,cuenta) VALUES ('Cheque','',NULL);

INSERT INTO Medio_pago(medio_pago,entidad_financiera,cuenta) VALUES ('Transferencia Bancaria','',0);
```
--
```
INSERT INTO Estado_solicitud (descripcion) VALUES ('Aceptado'); 

INSERT INTO Estado_solicitud (descripcion) VALUES ('En Espera'); 

INSERT INTO Estado_solicitud (descripcion) VALUES ('Rechazado');
```
--
```
INSERT INTO Tipo_solicitud (descripcion) VALUES ('Licencia'); 

INSERT INTO Tipo_solicitud (descripcion) VALUES ('Reclamo'); 

INSERT INTO Tipo_solicitud (descripcion) VALUES ('Aumento'); 

INSERT INTO Tipo_solicitud (descripcion) VALUES ('Vacaciones'); 

INSERT INTO Tipo_solicitud (descripcion) VALUES ('Configuración de Información'); 

INSERT INTO Tipo_solicitud (descripcion) VALUES ('Adelanto');
```
--
```
INSERT INTO Estado_cuenta (estado_cuenta) VALUES ('Vigente'); 

INSERT INTO Estado_cuenta (estado_cuenta) VALUES ('Desvinculado');
```
--
```
INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20123456789', 'Régimen General', 'Activa', 'Grupo Romero SAC', 'Av. Principal 123', 'Tecnología', 'Lima', 'https://empresa-a.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20567890123', 'Régimen Especial', 'Inactiva', 'Construcciones del Sur SAC', 'Calle Secundaria 456', 'Servicios', 'Arequipa', 'https://empresa-b.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20987654321', 'Régimen Simplificado', 'Activa', 'Inversiones Hidalgos EIRL', 'Jr. Importante 789', 'Manufactura', 'Trujillo', 'https://empresa-c.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20345678901', 'Régimen General', 'Activa', 'Centro Médico San Lucas SRL', 'Av. Central 456', 'Comercial', 'Piura', 'https://empresa-d.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20678901234', 'Régimen Especial', 'Inactiva', 'Innovaciones Empresariales SAC', 'Calle Innovación 789', 'Consultoría', 'Cusco', 'https://empresa-e.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20234567890', 'Régimen Simplificado', 'Activa', 'Desarrollos Tecnológicos SAC', 'Av. Progreso 567', 'Desarrollo', 'Iquitos', 'https://empresa-f.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20198765432', 'Régimen General', 'Activa', 'Ventas Express SAC', 'Jr. Modelo 234', 'Ventas', 'Chiclayo', 'https://empresa-g.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20901234567', 'Régimen Especial', 'Inactiva', 'Consultoría Total SRL', 'Av. Demo 789', 'Servicios Financieros', 'Tacna', 'https://empresa-h.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20678901234', 'Régimen Simplificado', 'Activa', 'Gestión Empresarial I EIRL', 'Calle Prueba 890', 'Consultoría', 'Huancayo', 'https://empresa-i.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20345678901', 'Régimen General', 'Activa', 'Desarrollos Web Innovadores SAC', 'Av. Ejemplo 567', 'Desarrollo Web', 'Pucallpa', 'https://empresa-j.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20901234567', 'Régimen Especial', 'Inactiva', 'Servicios Ágiles K SRL', 'Jr. ABC 123', 'Servicios', 'Ayacucho', 'https://empresa-k.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20567890123', 'Régimen Simplificado', 'Activa', 'Tecnología Innovadora L SAC', 'Av. Innovadora 890', 'Tecnología', 'Puno', 'https://empresa-l.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20123456789', 'Régimen General', 'Activa', 'Desarrollos Software M SAC', 'Calle Software 456', 'Desarrollo de Software', 'Tarapoto', 'https://empresa-m.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20987654321', 'Régimen Especial', 'Inactiva', 'Consultoría Avanzada N SRL', 'Av. Avanzada 123', 'Consultoría', 'Ica', 'https://empresa-n.com/logo.png');

INSERT INTO Empresa (ruc, regimen, estado, razon_social, direccion, giro, ciudad, logo) VALUES ('20234567890', 'Régimen Simplificado', 'Activa', 'Innovación Empresarial O SAC', 'Jr. XYZ 789', 'Innovación', 'Chimbote', 'https://empresa-o.com/logo.png');
```
--
```
INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Grupo Romero SAC','42685693','empleado',1,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Construcciones del Sur SAC','42685693','empleado',2,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Inversiones Hidalgos EIRL','42685693','empleado',3,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Centro Médico San Lucas SRL','42685693','empleado',4,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Innovaciones Empresariales SAC','42685693','empleado',5,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Desarrollos Tecnológicos SAC','42685693','empleado',6,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Ventas Express SAC','42685693','empleado',7,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Consultoría Total SRL','42685693','empresa',8,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Gestión Empresarial I EIRL','42685693','empleado',9,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Desarrollos Web Innovadores SAC','42685693','empleado',10,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Servicios Ágiles K SRL','42685693','empresa',11,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Tecnología Innovadora L SAC','42685693','empleado',12,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Desarrollos Software M SAC','42685693','empleado',13,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Consultoría Avanzada N SRL','42685693','empresa',14,1);

INSERT INTO Cuenta_empresa (usuario,contraseña,rol,id_empresa, id_estado_cuenta) VALUES ('Innovación Empresarial O SAC','42685693','empleado',15,1);
```
--
```
INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Gerente de Ventas', 'GC001', 'Responsable de supervisar el equipo de ventas.', 'Experiencia en liderazgo y ventas', 'Activo', 1);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Analista de Marketing', 'MK002', 'Encargado de análisis de mercado y estrategias de marketing.', 'Conocimientos en análisis de datos y marketing digital', 'Activo', 1);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Jefe de Recursos Humanos', 'RH001', 'Gestión del personal y desarrollo de estrategias de RRHH.', 'Experiencia en gestión de equipos y conocimientos legales', 'Inactivo', 2);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Contador Financiero', 'CF002', 'Encargado de la contabilidad y finanzas de la empresa.', 'Conocimientos en contabilidad y manejo de herramientas financieras', 'Activo', 2);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Desarrollador de Software Senior', 'DS001', 'Desarrollo de software y liderazgo de equipos de programación.', 'Experiencia en desarrollo de software y habilidades técnicas avanzadas', 'Activo', 3);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Diseñador Gráfico', 'DG002', 'Creación de diseños gráficos para campañas de marketing.', 'Habilidades en diseño gráfico y creatividad', 'Inactivo', 3);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Supervisor de Producción', 'SP001', 'Supervisión y control de la producción.', 'Experiencia en producción y habilidades de liderazgo', 'Activo', 4);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Especialista en Ventas Online', 'VO002', 'Desarrollo de estrategias de ventas en plataformas online.', 'Conocimientos en marketing digital y ventas online', 'Inactivo', 4);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Asistente de Recursos Humanos', 'ARH001', 'Apoyo en labores administrativas del área de RRHH.', 'Conocimientos básicos en gestión de personal', 'Activo', 5);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Técnico en Soporte IT', 'TI002', 'Brindar soporte técnico en sistemas y tecnologías de la información.', 'Experiencia en atención al cliente y conocimientos en IT', 'Activo', 5);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Analista de Datos', 'AD001', 'Análisis de datos para la toma de decisiones.', 'Experiencia en análisis de datos y manejo de herramientas estadísticas', 'Inactivo', 6);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Ejecutivo de Cuentas', 'EC002', 'Gestión de cuentas y relaciones con clientes.', 'Habilidades de comunicación y ventas', 'Activo', 6);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Ingeniero de Software', 'IS001', 'Desarrollo y diseño de software.', 'Experiencia en desarrollo de software y conocimientos técnicos avanzados', 'Activo', 7);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Community Manager', 'CM002', 'Gestión de redes sociales y comunidades online.', 'Conocimientos en redes sociales y habilidades de comunicación', 'Inactivo', 7);

INSERT INTO Cargo (nombre_cargo, codigo_cargo, descripcion_cargo, requerimientos, estado, id_empresa) VALUES ('Asesor Financiero', 'AF001', 'Asesoramiento en temas financieros y de inversión.', 'Experiencia en asesoramiento financiero y conocimientos en inversiones', 'Activo', 8);
```
--
```
INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Ventas', 'Área encargada de las estrategias y procesos de ventas.', 1);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Recursos Humanos', 'Área responsable de la gestión del personal y desarrollo de recursos humanos.', 1);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Finanzas', 'Área encargada de la gestión financiera y contable de la empresa.', 2);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Desarrollo de Software', 'Área dedicada al desarrollo de soluciones y productos de software.', 2);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Producción', 'Área responsable de la producción y fabricación de productos.', 3);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Marketing', 'Área encargada de las estrategias de marketing y publicidad.', 3);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Soporte Técnico', 'Área dedicada a brindar soporte técnico a clientes y sistemas.', 4);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Servicio al Cliente', 'Área centrada en la atención y satisfacción del cliente.', 4);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Logística', 'Área encargada de la gestión y optimización de la cadena de suministro.', 5);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Innovación', 'Área enfocada en la investigación y desarrollo de nuevas ideas y productos.', 5);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Calidad', 'Área responsable del control y aseguramiento de la calidad de productos y procesos.', 6);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Comunicación', 'Área encargada de la comunicación interna y externa de la empresa.', 6);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Tecnologías de la Información', 'Área dedicada a la gestión y mantenimiento de sistemas y tecnologías.', 7);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Diseño Gráfico', 'Área especializada en la creación y diseño gráfico.', 7);

INSERT INTO Area (nombre_area, descripcion_area, id_empresa) VALUES ('Consultoría', 'Área dedicada a brindar asesoramiento y consultoría a clientes.', 8);
```
--
```
INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Juan', 'González', 'Pérez', '12345678A', 'Activo', 1);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('María', 'Rodríguez', 'López', '98765432B', 'Activo', 1);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Carlos', 'Martínez', 'Gómez', '54321678C', 'Inactivo', 2);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Ana', 'Fernández', 'Díaz', '87654321D', 'Activo', 2);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Pedro', 'Sánchez', 'Ruiz', '34567891E', 'Activo', 3);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Laura', 'García', 'Hernández', '23456789F', 'Inactivo', 3);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Diego', 'Pérez', 'Gómez', '78901234G', 'Activo', 4);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Sofía', 'Díaz', 'Martínez', '65432109H', 'Inactivo', 4);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Elena', 'López', 'González', '21098765I', 'Activo', 5);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Andrés', 'Gómez', 'Fernández', '10987654J', 'Activo', 5);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Luis', 'Hernández', 'Sánchez', '87654321K', 'Inactivo', 6);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Marta', 'Ruiz', 'Pérez', '54321098L', 'Activo', 6);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Pablo', 'González', 'López', '32109876M', 'Activo', 7);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Lucía', 'Martínez', 'Díaz', '89012345N', 'Inactivo', 7);

INSERT INTO RepresentanteLegal (nombres, apellido_paterno, apellido_materno, dni, estado, id_empresa) VALUES ('Carmen', 'Sánchez', 'Gómez', '67890123O', 'Activo', 8);
```
--
```
INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('DANIEL','SIFUENTES GRADOS','1993/05/11',30,964701287,'daniel.sifuentes@harlamsyo.pe',47756342,'Soltero','Masculino',0,2,1,1,1);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('EDUARDO SAUL','ESCOBEDO VILLANUEVA','1979/04/18',44,991961400,'',40157917,'Casado','Masculino',1,2,2,1,1);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JAPHET CHARLIE JESUS','TORRES HUARINGA','1985/05/29',38,926270930,'',43044175,'Casado','Masculino',1,2,3,1,2);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JHON ERIK','CAMPO VELÁSQUEZ','1991/04/13',32,931854954,'campovelas@gmail.com',47231764,'Soltero','Masculino',0,2,3,1,4);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('KEVYN ANTHONY','PLASENCIA BLANCO','1991/04/13',28,998400448,'kevpb95@gmail.com',75363683,'Soltero','Masculino',0,1,3,1,4);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('FRANCISCO ROBERTO','GRADOS PAREDES','1987/10/04',36,918099146,'gradosparadesfrank@gmail.com',44569138,'Casado','Masculino',2,1,3,1,4);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE LUIS','HOLGUIN ALARCON','2001/06/04',22,938197568,'jorholguinalarcon@gmail.com',72756436,'Soltero','Masculino',0,2,3,2,2);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('RONALD HERBERT','PRUDENCIO ALIAGA','1994/12/12',29,920852657,'ronaldhpa12@hotmail.com',72079266,'Casado','Masculino',1,2,3,1,2);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('YESSICA ISABEL','FLORES VELARDE','1990/11/17',33,989686976,'yessicflores@gmail.com',46698999,'Casado','Femenino',0,2,3,1,2);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('OMAR ADRIAN','ANAYA AYALA','1992/01/05',31,992423368,'anayaayala@gmail.com',46850431,'Casado','Masculino',1,2,3,1,2);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('CLAUDIA JOSELIN','CAMONES ALEGRIA','1983/06/22',40,993904334,'',42201690,'Viudo','Femenino',2,2,4,2,3);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('GAYMO LUIS','PEREZ MUÑOZ','1992-05-30',31,970897522,'',71902155,'Casado','Masculino',1,2,4,1,3);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE OSWALDO','ARGUEDAS PUCUTAY','1991/08/10',31,981378149,'larguedas1010@gmail.com',71395354,'Casado','Masculino',1,1,3,1,3);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('JORGE LUIS','DIAZ LEYTON','1982/09/17',41,997935493,'leyton17_14@hotmail.com',41473747,'Divorciado','Masculino',1,2,4,1,3);

INSERT INTO Empleado (nombre,apellidos,fecha_nacimiento,edad,telefono,email,dni,estado_civil,sexo, cantidad_menores_cargo,id_regimen_pensionario,id_seguro_medico,id_situacion_discapacidad, id_empresa) VALUES ('KAREN EDITH','POMA CAMACHO DE SALAZAR','1983/07/22',40,936131832,'karenpomakp30@gmail.com',42685693,'Divorciado','Femenino',1,1,3,1,3);
```
--
```
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('DANIEL','47756342',1,'empleado',1);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('EDUARDO SAUL','40157917',1,'empresa',2);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JAPHET CHARLIE JESUS','43044175',1,'empleado',3);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JHON ERIK','47231764',1,'empleado',4);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KEVYN ANTHONY','75363683',1,'empleado',5);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('FRANCISCO ROBERTO','44569138',1,'empleado',6);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','72756436',1,'empleado',7);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('RONALD HERBERT','72079266',1,'empleado',8);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('YESSICA ISABEL','46698999',1,'empleado',9);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('OMAR ADRIAN','46850431',1,'empleado',10);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('CLAUDIA JOSELIN','42201690',2,'empleado',11);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('GAYMO LUIS','71902155',2,'empleado',12);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE OSWALDO','71395354',2,'empleado',13);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','41473747',2,'empleado',14);

INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KAREN EDITH','42685693',2,'empleado',15);
```
--
```
insert into Tipo_operacion (descripcion_operacion) values ('Ingreso');

insert into Tipo_operacion (descripcion_operacion) values ('Descuento');

insert into Tipo_operacion (descripcion_operacion) values ('Aportes');

insert into Tipo_operacion (descripcion_operacion) values ('Neutro');
```
--
```
INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('15-01-2020','01-02-2020','31-12-2023',991.9614,991.96130080387,1,2,1,1,1,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('18-02-2021','01-03-2021','31-12-2023',926.27093,926.270837372916,1,2,2,1,1,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('20-01-2020','01-02-2020','31-12-2023',931.854954,931.854860814514,2,2,3,1,1,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('01-01-2022','15-01-2022','15-06-2024',998.400448,998.400348159965,3,1,4,1,1,1,2,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('11-03-2022','15-03-2022','29-11-2023',918.099146,918.099054190095,3,1,5,1,1,1,2,1);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('05-05-2020','15-05-2020','15-01-2024',938.197568,938.197474180253,4,1,6,1,1,1,1,1);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('25-08-2021','01-09-2021','31-12-2023',920.852657,920.852564914744,4,3,7,1,2,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('30-06-2021','01-07-2021','31-12-2023',989.686976,925.836110771228,4,3,8,1,2,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('10-04-2022','15-04-2022','15-12-2023',992.423368,992.423268757673,4,2,9,1,2,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('11-03-2023','15-03-2023','15-03-2024',993.904334,993.904234609577,1,2,10,1,1,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('14-07-2022','01-08-2022','15-07-2024',970.897522,970.897424910258,1,2,11,1,1,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('18-10-2021','01-11-2021','15-10-2024',981.378149,981.378050862195,2,2,12,1,2,1,1,2);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('20-11-2021','01-12-2021','28-11-2024',997.935493,997.935393206461,2,2,13,1,2,1,1,3);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('08-11-2022','15-11-2022','15-08-2023',936.131832,905.933940374348,2,1,14,2,2,1,1,1);

INSERT INTO Contrato (fecha_firma_contrato,fecha_inicio_laboral,fecha_termino_contrato,sueldo_base,liquido_teorico, id_area,id_cargo,id_empleado,id_estado_contrato,id_tipo_contrato,id_tipo_jornada,id_frecuencia_pago,id_medio_pago) VALUES ('04-12-2022','15-12-2022','31-08-2023',982.894578,982.894479710552,3,3,15,2,1,1,2,3);
```
--
```
insert into Estado_concepto (descripcion_estado) values ('Activo');

insert into Estado_concepto (descripcion_estado) values ('Inactivo');
```
--
```
INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Dias Subsidiados Laborados', '0', '4', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Dias Vacaciones', '0', '4', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Dias No Laborados', '0', '4', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Horas ordinarias', '0', '4', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Horas Extras 25%', '0', '4', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Horas Extras 35%', '0', '4', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Sueldo Básico a pagar', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Asig.Familiar', '0.10', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Pago Horas Extras 25%', '0.25', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Pago Horas Extras 35%', '0.25', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Vacaciones', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('OTROS INGRESOS', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('DSCTOS. INASISTENCIA', '0', '2', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('GratifIcacion', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Bono Extraord. Essalud', '0', '3', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Total Gratif. Diciembre', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('ONP 13%', '0.13', '3', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('AFP Obligatorio 10%', '0', '3', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('AFP Comisión', '0', '3', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('AFP Seguro', '0', '3', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Renta 5ta.', '0', '2', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Adelanto', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('OTROS DESCUENTOS', '0', '2', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('REINTEGRO', '0', '1', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Essalud 9%', '0.09', '3', '1');

INSERT INTO Concepto_nomina ("nombre_nomina", "valor_nomina", "id_tipo_operacion", "id_estado") VALUES ('Sueldo minimo', '1025', '4', '1');
```
--
```
INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('28/03/2023',200,1,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('17/07/2021',102.5,1,8); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('04/02/2020',500,1,22); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('16/11/2021',100,1,23); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('16/12/2022',400,1,10); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('21/10/2022',100,1,12); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('09/12/2022',300,2,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('30/03/2022',102.5,2,8);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('24/11/2020',1000,2,22); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('23/10/2023',100,2,23); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('29/05/2023',400,2,10); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('09/04/2020',150,2,12); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('27/06/2022',300,3,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('01/05/2021',50,3,8); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('30/04/2023',50,3,22); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('25/02/2022',50,3,23); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('29/10/2021',50,4,10);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('14/05/2023',50,4,12); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('02/03/2020',200,4,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('19/02/2020',102.5,4,8); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('20/07/2020',500,13,22); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('26/10/2020',100,13,23); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('21/07/2022',150,5,10);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('07/06/2023',100,5,12); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('18/12/2020',400,6,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('22/06/2022',102.5,6,8);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('21/07/2021',250,6,18); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('09/04/2021',500,6,25); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('09/04/2022',500,7,10); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('07/01/2023',100,7,12);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('30/08/2023',400,7,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('04/02/2020',102.5,7,8); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('01/10/2023',500,8,25); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('23/03/2023',100,8,23); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('01/07/2023',150,8,24); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('04/06/2023',150,8,12); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('30/05/2023',200,8,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('25/11/2021',102.5,9,8); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('04/01/2021',1000,9,14);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('16/11/2021',250,9,18); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('27/08/2023',500,9,25); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('22/08/2020',100,9,12);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('10/09/2023',200,10,5); 

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('04/11/2023',102.5,10,8);

INSERT INTO Movimiento_planilla (fecha,monto,id_contrato,id_nomina) VALUES ('26/11/2022',1000,10,22);
```
--
```
INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('13/06/2022','17/06/2022','',4,1,1);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('06/03/2020','13/03/2020','',7,1,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('13/11/2020','19/11/2020','',6,1,11); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('09/05/2021','16/05/2021','',7,1,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('15/01/2020','22/01/2020','',7,2,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('16/11/2023','23/11/2023','',7,2,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('07/06/2021','13/06/2021','',6,2,11); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('25/06/2020','29/06/2020','',4,2,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('10/05/2021','17/05/2021','',7,3,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('09/05/2022','15/05/2022','',6,3,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('22/07/2023','28/07/2023','',6,3,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('04/10/2022','09/10/2022','',5,3,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('08/04/2021','13/04/2021','',5,3,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('07/06/2022','11/06/2022','',4,4,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('16/11/2020','20/11/2020','',4,4,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('01/10/2022','05/10/2022','',4,4,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('06/04/2023','12/04/2023','',6,4,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('10/06/2022','17/06/2022','',7,5,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('06/09/2023','12/09/2023','',6,5,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('02/02/2021','06/02/2021','',4,5,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('26/12/2021','31/12/2021','',5,5,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('10/02/2023','16/02/2023','',6,6,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('07/05/2021','14/05/2021','',7,6,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('17/10/2023','22/10/2023','',5,6,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('30/09/2022','06/10/2022','',6,6,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('11/11/2020','17/11/2020','',6,7,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('27/01/2021','03/02/2021','',7,7,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('25/03/2020','29/03/2020','',4,7,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('12/11/2021','19/11/2021','',7,7,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('28/09/2020','03/10/2020','',5,7,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('22/08/2021','29/08/2021','',7,8,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('29/04/2021','03/05/2021','',4,8,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('06/08/2022','13/08/2022','',7,8,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('19/05/2022','26/05/2022','',7,8,2); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('18/06/2021','25/06/2021','',7,9,11);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('03/12/2022','07/12/2022','',4,9,3); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('10/06/2022','16/06/2022','',6,9,1); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('08/09/2023','14/09/2023','',6,10,2);

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('07/12/2020','12/12/2020','',5,10,11); 

INSERT INTO Asistencia (fecha_inicio, fecha_final,comentario,valor,id_contrato,id_nomina) VALUES ('04/01/2023','08/01/2023','',4,10,3);
```
--
```
INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('11QI12023', '15', '2023-11-16', '2023-11-30', '2023-11-30', '45960.81', 'Quincenal', '2023-11-16', '03:21:22');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('11QI22023', '15', '2023-11-01', '2023-11-15', '2023-11-15', '34694.15', 'Quincenal', '2023-11-01', '08:24:14');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('11ME12023', '30', '2023-11-01', '2023-11-30', '2023-11-30', '31978.75', 'Mensual', '2023-11-01', '18:40:02');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('10QI12023', '15', '2023-10-16', '2023-10-30', '2023-10-30', '36637.94', 'Quincenal', '2023-10-16', '07:24:40');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('10QI22023', '15', '2023-10-01', '2023-10-15', '2023-10-15', '35494.47', 'Quincenal', '2023-10-01', '04:15:43');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('10ME12023', '30', '2023-10-01', '2023-10-30', '2023-10-30', '35620.13', 'Mensual', '2023-10-01', '22:31:18');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('09QI12023', '15', '2023-09-16', '2023-09-30', '2023-09-30', '38955.82', 'Quincenal', '2023-09-16', '11:39:51');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('09QI22023', '15', '2023-09-01', '2023-09-15', '2023-09-15', '47768.4', 'Quincenal', '2023-09-01', '11:15:59');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('09ME12023', '30', '2023-09-01', '2023-09-30', '2023-09-30', '49054.27', 'Mensual', '2023-09-01', '07:29:43');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('08QI12023', '15', '2023-08-16', '2023-08-30', '2023-08-30', '38095.24', 'Quincenal', '2023-08-16', '17:45:26');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('08QI22023', '15', '2023-08-01', '2023-08-15', '2023-08-15', '47359.42', 'Quincenal', '2023-08-01', '15:28:28');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('08ME12023', '30', '2023-08-01', '2023-08-30', '2023-08-30', '42634.2', 'Mensual', '2023-08-01', '19:25:35');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('07QI12023', '15', '2023-07-16', '2023-07-30', '2023-07-30', '49656.14', 'Quincenal', '2023-07-16', '23:40:18');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('07QI22023', '15', '2023-07-01', '2023-07-15', '2023-07-15', '39402.02', 'Quincenal', '2023-07-01', '19:33:00');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('07ME12023', '30', '2023-07-01', '2023-07-30', '2023-07-30', '34615.65', 'Qensual', '2023-07-01', '14:15:23');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('06QI12023', '15', '2023-06-16', '2023-06-30', '2023-06-30', '45360.12', 'Quincenal', '2023-06-16', '23:34:39');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('06QI22023', '15', '2023-06-01', '2023-06-15', '2023-06-15', '32546.03', 'Quincenal', '2023-06-01', '01:44:42');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('06ME12023', '30', '2023-06-01', '2023-06-30', '2023-06-30', '46319.14', 'Mensual', '2023-06-01', '19:02:11');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('05QI12023', '15', '2023-05-16', '2023-05-30', '2023-05-30', '40149.22', 'Quincenal', '2023-05-16', '22:24:04');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('05QI22023', '15', '2023-05-01', '2023-05-15', '2023-05-15', '35696.75', 'Quincenal', '2023-05-01', '04:27:35');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('05ME12023', '30', '2023-05-01', '2023-05-30', '2023-05-30', '46640.36', 'Mensual', '2023-05-01', '09:41:59');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('04QI12023', '15', '2023-04-16', '2023-04-30', '2023-04-30', '34413.48', 'Quincenal', '2023-04-16', '11:04:14');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('04QI22023', '15', '2023-04-01', '2023-04-15', '2023-04-15', '46689.83', 'Quincenal', '2023-04-01', '20:04:34');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('04ME12023', '30', '2023-04-01', '2023-04-30', '2023-04-30', '31874.86', 'Mensual', '2023-04-01', '08:10:03');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('03QI12023', '15', '2023-03-16', '2023-03-30', '2023-03-30', '35887.58', 'Quincenal', '2023-03-16', '16:53:32');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('03QI22023', '15', '2023-03-01', '2023-03-15', '2023-03-15', '34426.44', 'Quincenal', '2023-03-01', '18:08:32');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('03ME12023', '30', '2023-03-01', '2023-03-30', '2023-03-30', '45246.76', 'Mensual', '2023-03-01', '15:20:48');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('02QI12023', '15', '2023-02-16', '2023-02-28', '2023-02-28', '36395.75', 'Quincenal', '2023-02-16', '08:13:26');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('02QI22023', '15', '2023-02-01', '2023-02-15', '2023-02-15', '47574.82', 'Quincenal', '2023-02-01', '22:36:46');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('02ME12023', '30', '2023-02-01', '2023-02-15', '2023-02-15', '49583.03', 'Mensual', '2023-02-01', '07:15:03');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('01QI12023', '15', '2023-01-16', '2023-01-30', '2023-01-30', '41639.56', 'Quincenal', '2023-01-16', '09:28:22');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('01QI22023', '15', '2023-01-01', '2023-01-15', '2023-01-15', '31966.45', 'Quincenal', '2023-01-01', '15:29:18');

INSERT INTO planilla ("periodo", "dias_laborables", "fecha_inicio", "fecha_fin", "fecha_calculo", "monto_emitido", "periodicidad", "fecha_creacion", "hora_creacion") VALUES ('01ME12023', '30', '2023-01-01', '2023-01-30', '2023-01-30', '48559.62', 'Mensual', '2023-01-01', '20:39:00');
```
--
```
INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4084.85', '4183.79', '98.94', '864.00', '1', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3684.94', '3691.59', '6.65', '867.00', '2', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2956.4', '3076.11', '119.71', '853.00', '3', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3348.87', '3511.11', '162.24', '828.00', '4', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3653.5', '3800.5', '147', '937.00', '5', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4565.35', '4667.42', '102.07', '749.00', '6', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3051.2', '3145.81', '94.61', '615.00', '7', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4958.91', '4994.95', '36.04', '840.00', '8', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3654.91', '3681.34', '26.43', '538.00', '9', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2513.28', '2681.69', '168.41', '725.00', '10', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2630.47', '2680.85', '50.38', '865.00', '11', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2579.63', '2597.05', '17.42', '692.00', '12', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3341.53', '3379.85', '38.32', '842.00', '13', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1282.85', '1358.85', '76', '802.00', '14', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2662.18', '2823.12', '160.94', '924.00', '15', '1');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1888', '2055.44', '167.44', '552.00', '1', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3322.36', '3420.94', '98.58', '603.00', '2', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2153.88', '2327.86', '173.98', '978.00', '3', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1401.64', '1505.64', '104', '967.00', '4', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4562.26', '4643.74', '81.48', '558.00', '5', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2521.02', '2530.36', '9.34', '823.00', '6', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3576.64', '3627.81', '51.17', '954.00', '7', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4655.53', '4681.27', '25.74', '582.00', '8', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4064.94', '4095.05', '30.11', '603.00', '9', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1745.96', '1865.15', '119.19', '836.00', '10', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3181.67', '3352.87', '171.2', '595.00', '11', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2154.79', '2211.27', '56.48', '521.00', '12', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4664.44', '4863.58', '199.14', '511.00', '13', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3456.54', '3605.8', '149.26', '792.00', '14', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('3627.22', '3678.86', '51.64', '545.00', '15', '2');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1297.91', '1490.66', '192.75', '699.00', '1', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4431.14', '4567.71', '136.57', '889.00', '2', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2161.58', '2310.69', '149.11', '905.00', '3', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4771.39', '4898.13', '126.74', '991.00', '4', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4744.67', '4835.11', '90.44', '726.00', '5', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1136.96', '1317.87', '180.91', '697.00', '6', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1321.53', '1440.96', '119.43', '544.00', '7', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('4529.24', '4532.41', '3.17', '810.00', '8', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1741.09', '1894.62', '153.53', '845.00', '9', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2154.39', '2344.31', '189.92', '616.00', '10', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2180.97', '2353.83', '172.86', '778.00', '11', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2805.37', '2855.81', '50.44', '592.00', '12', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2709.14', '2883.08', '173.94', '687.00', '13', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('1979.53', '1997.37', '17.84', '928.00', '14', '3');

INSERT INTO Boleta ("totalneto", "totalingresos", "totaldescuentos", "totalaportes", "id_contrato", "id_planilla") VALUES ('2865.48', '3022.6', '157.12', '753.00', '15', '3');
```
--
```
INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Deseo ir a ver a mi abuela ya que se encuentra mal de salud, solo por 1 día','2010/05/14','14:45:14',null,1,1,1,1);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito unas vacaciones en el mes siguiente','2011/06/18','02:24:41',null,1,4,2,1);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Deseo un aumento de 1000 dolares debido a mis ultimas horas extras del mes pasado','2011/08/12','16:21:24',1000,3,3,3,2);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito cambiar mi apellido ya que está mal escrito','2012/08/20','18:47:47',null,1,5,4,4);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito una licencia para asistir al matrimonio de mi hermana','2013/11/21','22:32:35',null,1,1,5,4);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito unas vaciones por temas de salud mental','2014/02/14','12:23:41',null,1,4,6,4);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito una licencia por motivos de asistir a un congreso en provincia','2015/04/13','10:50:50',null,3,1,7,2);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('No se me ha pagado el mes pasado','2015/12/17','07:41:08',null,1,2,8,2);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito vacaciones dentro de 2 meses','2015/12/10','08:14:17',null,1,4,9,2);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Debido a mis ultimos logro en la empresa, solicito un aumento de 2000 dolares','2016/05/18','04:45:10',2000,1,3,10,2);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito vacaciones en el mes de febrero','2016,08/11','16:01:54',null,3,4,11,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito un adelanto por motivos de pagar la renta de mi casa','2016/09/10','15:17:41',500,1,6,12,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito vacaciones por motivos personales','2016/10/25','19:08:41',null,1,4,13,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito una licencia para asistir al día del padre en la escuela de mi hija','2018/04/28','17:05:16',null,3,1,14,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) 
VALUES('Solicito un adelanto de 200 dolares para pagar la matricula de mi sobrino','2020/08/27','16:14:46',200,3,6,15,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito vacaciones en el mes de noviembre','2020/10/14','18:53:31',null,1,4,12,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solcito un cambio de área de trabajo','2021/05/10','11:47:15',null,1,2,10,2);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Debido a el aumento de la pensión alimenticia de mis hijos, solicito un aumento de 1200 dolares','2022/04/12','22:42:16',1200,3,3,4,4);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Debido a el aumento de la pensión alimenticia de mis hijos, solicito un aumento de 1200 dolares','2022/04/12','22:42:16',1200,3,3,4,4);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Debido a el aumento de la pensión alimenticia de mis hijos, solicito un aumento de 1200 dolares','2022/04/12','22:42:16',1200,3,3,4,4);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito un cambio de jefe debido a que el mío me maltrata laboralmente','2023/05/14','01:41:52',null,1,2,14,3);

INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito un adelante de 1600 dolares por motivos de pagar pensión alimenticia de mis hijos','2023/08/16','16:14:16',1600,1,6,2,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('No se me han pagado los 200 dolares de mi anterior jornada', '2022/08/24','14:02:45',200,1,2,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito vacaciones por motivos de salud', '2021/04/10','16:32:41',null,3,4,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito licencia de 2 dias para visitar a mi padrino', '2021/02/28','02:36:12',null,1,1,2,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito licencia de 2 dias para visitar a mi padrino', '2021/02/28','02:36:12',null,1,1,2,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito aumento de 500 soles en mi sueldo', '2023/01/14','18:37:44',500,3,3,8,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Pido una configuración de información acerca de mi estado civil', '2022/11/26','19:14:07',null,1,5,4,4);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito un adelanto de 400 dolares por motivos de que me iré de viaje el fin de semana', '2023/10/18','16:32:41',400,1,6,7,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito un cambio de sucursal por motivos de lejanía con la empresa', '2020/10/15','10:52:11',null,1,2,5,4);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Mi hija esta mal de salud, solicito una licencia de 1 semana para cuidar de ella', '2020/12/02','17:02:19',null,1,1,5,4);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('La tarde de ayer sufrí un accidente, solicito un vacaciones por recuperación', '2021/08/24','20:18:01',null,1,4,7,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solici', '2022/10/20','14:12:45',null,3,4,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Me dio covid y necesito reposo, solicito licencia por enfermedad', '2020/04/17','16:22:31',null,1,1,8,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito que se me pague mi sueldo de la jornada pasada', '2021/07/19','16:32:41',null,3,2,2,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito un aumento de 900 dolares por motivos de reparación de civil', '2020/07/15','16:32:41',900,1,6,3,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito vacaciones por para oqleasn', '2022/05/10','12:42:41',null,3,4,11,3);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito vacaciones por motivos de salud', '2022/01/10','16:31:42',null,3,4,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('No puedo seguir en esta chamba, solicito un cambio de sueldo', '2021/04/10','16:32:41',null,3,4,12,3);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('No se me han pagado los 400 dolares de mi anterior jornada', '2021/11/16','18:02:35',400,1,2,15,3);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito vacaciones por motivos de salud', '2023/08/10','18:39:13',null,3,4,11,3);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito licencia de 4 dias para visitar a mi hijastro', '2021/02/28','02:36:12',null,3,1,5,4);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito aumento de 100 soles en mi sueldo', '2020/10/04','19:38:44',500,1,3,10,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Pido una configuración de información acerca de mi estado civil', '2020/01/28','19:20:17',null,1,5,10,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito un adelanto de 450 dolares por motivos de que me iré de viaje', '2023/10/18','14:32:41',450,3,6,5,4);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito un cambio de sucursal por motivos de lejanía con la empresa', '2021/10/20','10:32:11',null,3,2,10,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Mi hijo esta mal de salud, solicito una licencia de 1 semana', '2023/10/02','17:02:19',null,1,1,2,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('La tarde de ayer sufrí un accidente, solicito un vacaciones', '2020/11/24','20:25:01',null,1,4,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Soliciaskjnkz', '2021/02/20','18:12:45',null,3,4,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Me dio covid y necesito reposo, solicito licencia', '2020/08/18','16:22:31',null,1,1,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito que se me pague mi sueldo de la jornada pasada', '2021/04/24','16:32:41',null,3,2,2,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solicito un aumento de 124 dolares por motivos de reparación de civil', '2022/08/15','16:32:41',124,1,6,5,4);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito vacaciones psauiyor para oqleasn', '2021/08/10','12:42:41',null,3,4,1,1);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Solciito vacaciones por motivos de salud', '2020/01/10','16:31:42',null,3,4,10,2);

INSERT INTO solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES ('Si quieren que siga en esta chamba, solicito un cambio de sueldo', '2022/10/18','16:32:41',null,3,4,1,1)
```



