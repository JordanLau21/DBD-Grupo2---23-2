```
INSERT INTO Regimen_pensionario (tipo_regimen) VALUES ('ONP');
INSERT INTO Regimen_pensionario (tipo_regimen) VALUES ('AFP');

INSERT INTO Seguro_medico (tipo_seguro) VALUES ('EPS');
INSERT INTO Seguro_medico (tipo_seguro) VALUES ('SIS');
INSERT INTO Seguro_medico (tipo_seguro) VALUES ('EsSalud');
INSERT INTO Seguro_medico (tipo_seguro) VALUES ('Privado');

INSERT INTO Situacion_discapacidad (tipo_discapacidad) VALUES ('Ninguna');
INSERT INTO Situacion_discapacidad (tipo_discapacidad) VALUES ('Parcial');
INSERT INTO Situacion_discapacidad (tipo_discapacidad) VALUES ('Total');

INSERT INTO Estado_contrato (estado_contrato) VALUES ('Vigente');
INSERT INTO Estado_contrato (estado_contrato) VALUES ('Finalizado');
INSERT INTO Estado_contrato (estado_contrato) VALUES ('Rescindido');

INSERT INTO Tipo_contrato (tipo_contrato) VALUES ('Indefinido');
INSERT INTO Tipo_contrato (tipo_contrato) VALUES ('Plazo Definido');
INSERT INTO Tipo_contrato (tipo_contrato) VALUES ('Obra o Proyecto');

INSERT INTO Tipo_jornada (tipo_jornada) VALUES ('Ordinaria');
INSERT INTO Tipo_jornada (tipo_jornada) VALUES ('Parcial');
INSERT INTO Tipo_jornada (tipo_jornada) VALUES ('Excenta');

INSERT INTO Frecuencia_pago(frecuencia_pago) VALUES ('Mensual');
INSERT INTO Frecuencia_pago(frecuencia_pago) VALUES ('Quincenal');
INSERT INTO Frecuencia_pago(frecuencia_pago) VALUES ('Por obra o proyecto');

INSERT INTO Medio_pago(medio_pago,entidad_financiera,cuenta) VALUES ('Efectivo',NULL,NULL);
INSERT INTO Medio_pago(medio_pago,entidad_financiera,cuenta) VALUES ('Cheque','',NULL);
INSERT INTO Medio_pago(medio_pago,entidad_financiera,cuenta) VALUES ('Transferencia Bancaria','',0);

INSERT INTO Estado_solicitud (descripcion) VALUES ('Aceptado'); 
INSERT INTO Estado_solicitud (descripcion) VALUES ('En Espera'); 
INSERT INTO Estado_solicitud (descripcion) VALUES ('Rechazado');

INSERT INTO Tipo_solicitud (descripcion) VALUES ('Licencia'); 
INSERT INTO Tipo_solicitud (descripcion) VALUES ('Reclamo'); 
INSERT INTO Tipo_solicitud (descripcion) VALUES ('Aumento'); 
INSERT INTO Tipo_solicitud (descripcion) VALUES ('Vacaciones'); 
INSERT INTO Tipo_solicitud (descripcion) VALUES ('Configuración de Información'); 
INSERT INTO Tipo_solicitud (descripcion) VALUES ('Adelanto');

INSERT INTO Estado_cuenta (estado_cuenta) VALUES ('Vigente'); 
INSERT INTO Estado_cuenta (estado_cuenta) VALUES ('Desvinculado');

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
--
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
--

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
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('CLAUDIA JOSELIN','42201690',1,'empleado',11);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('GAYMO LUIS','71902155',1,'empleado',12);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE OSWALDO','71395354',1,'empleado',13);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('JORGE LUIS','41473747',1,'empleado',14);
INSERT INTO Cuenta_empleado (usuario,contraseña,id_estado_cuenta, rol,id_empleado) VALUES ('KAREN EDITH','42685693',1,'empleado',15);



insert into Tipo_operacion (descripcion_operacion) values ('Ingreso');
insert into Tipo_operacion (descripcion_operacion) values ('Descuento');
insert into Tipo_operacion (descripcion_operacion) values ('Aportes');
insert into Tipo_operacion (descripcion_operacion) values ('Neutro');

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

insert into Estado_concepto (descripcion_estado) values ('Activo');
insert into Estado_concepto (descripcion_estado) values ('Inactivo');
--
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
INSERT INTO Solicitud (detalles,fec_solicitud,hora_solicitud,monto,id_estado_solicitud,id_tipo_solicitud,id_empleado,id_empresa) VALUES('Solicito un adelanto de 200 dolares para pagar la matricula de mi sobrino','2020/08/27','16:14:46',200,3,6,15,3);
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

```
INSERT INTO empleado ("nombre", "apellidos", "fecha_nacimiento", "edad", "telefono", "email", "dni", "estado_civil", "sexo", "cantidad_menores_cargo", "id_regimen_pensionario", "id_seguro_medico", "id_situacion_discapacidad", "id_empresa") VALUES
	('Normand', 'Lavelle', '1995/05/07', '40', '975903556', 'nlavelle0@addtoany.com', '85926567', 'Casado', 'Masculino', '2', '2', '2', '1', '1'),
	('Guntar', 'Pretswell', '1994/11/16', '42', '979845909', 'gpretswell1@constantcontact.com', '98833237', 'Casado', 'Masculino', '2', '2', '2', '1', '9'),
	('Lanna', 'Bickerdicke', '2000/04/17', '39', '931604946', 'lbickerdicke2@apple.com', '19605430', 'Casado', 'Femenino', '0', '1', '4', '1', '2'),
	('Irina', 'Spinello', '1989/04/29', '29', '964569004', 'ispinello3@theguardian.com', '41382775', 'Casado', 'Femenino', '2', '1', '1', '1', '3'),
	('Freddie', 'Mandre', '1982/12/06', '35', '953714300', 'fmandre4@cyberchimps.com', '68386898', 'Soltero', 'Femenino', '0', '2', '1', '1', '14'),
	('Ludovico', 'Trinder', '1994/04/05', '36', '981501257', 'ltrinder5@marketwatch.com', '73442381', 'Casado', 'Masculino', '0', '2', '3', '1', '14'),
	('Christiane', 'Alastair', '1981/11/23', '42', '963396758', 'calastair6@g.co', '90504088', 'Casado', 'Femenino', '2', '2', '2', '1', '14'),
	('Ede', 'Carnie', '1987/11/21', '35', '912913780', 'ecarnie7@thetimes.co.uk', '57382351', 'Casado', 'Femenino', '0', '1', '4', '1', '13'),
	('Nev', 'Weatherup', '1993/10/24', '27', '959349345', 'nweatherup8@stumbleupon.com', '78976174', 'Soltero', 'Masculino', '2', '2', '3', '1', '7'),
	('Meris', 'Shills', '1987/02/18', '41', '930084444', 'mshills9@buzzfeed.com', '55876968', 'Casado', 'Femenino', '1', '1', '4', '1', '3'),
	('Kristoforo', 'Filippyev', '1985/11/23', '26', '972439556', 'kfilippyeva@live.com', '76469508', 'Soltero', 'Masculino', '1', '1', '2', '1', '15'),
	('Cozmo', 'Evenett', '1990/02/15', '27', '974821339', 'cevenettb@buzzfeed.com', '49039839', 'Casado', 'Masculino', '0', '2', '4', '1', '4'),
	('Odelinda', 'Gordon', '1982/06/01', '27', '903290996', 'ogordonc@simplemachines.org', '13040964', 'Soltero', 'Femenino', '0', '2', '1', '1', '15'),
	('Alexandre', 'Trump', '1996/09/30', '33', '933766665', 'atrumpd@columbia.edu', '76107524', 'Soltero', 'Masculino', '0', '2', '4', '1', '10'),
	('Kip', 'Hellings', '1995/06/07', '23', '997948314', 'khellingse@slideshare.net', '39359986', 'Casado', 'Masculino', '2', '2', '2', '1', '11'),
	('Delbert', 'Smeall', '1988/09/27', '35', '935033700', 'dsmeallf@arstechnica.com', '99556895', 'Casado', 'Masculino', '0', '1', '4', '1', '4'),
	('Cori', 'Isenor', '1999/09/27', '27', '905942505', 'cisenorg@cbsnews.com', '42703104', 'Casado', 'Masculino', '2', '2', '1', '1', '6'),
	('Ferdinande', 'Sams', '1992/01/02', '24', '972395466', 'fsamsh@amazon.com', '65480521', 'Soltero', 'Femenino', '2', '1', '3', '1', '1'),
	('Arv', 'Moukes', '1989/10/13', '29', '998387794', 'amoukesi@hp.com', '29210980', 'Casado', 'Masculino', '2', '1', '1', '1', '2'),
	('Doti', 'Henrichs', '1997/03/13', '38', '914311489', 'dhenrichsj@w3.org', '38563038', 'Casado', 'Femenino', '2', '2', '4', '1', '6'),
	('Addison', 'Baraclough', '1998/11/19', '24', '977741473', 'abaracloughk@apple.com', '57485422', 'Soltero', 'Masculino', '0', '1', '3', '1', '9'),
	('Collette', 'Armfirld', '1998/12/17', '43', '989489214', 'carmfirldl@wisc.edu', '19246926', 'Casado', 'Femenino', '1', '1', '1', '1', '11'),
	('Joachim', 'Kenshole', '1983/11/04', '41', '968347304', 'jkensholem@jimdo.com', '41569190', 'Soltero', 'Masculino', '1', '2', '4', '1', '11'),
	('Eda', 'Warin', '1994/03/08', '40', '977824314', 'ewarinn@smugmug.com', '30055954', 'Casado', 'Femenino', '0', '2', '3', '1', '6'),
	('Lucas', 'Ruane', '1984/04/21', '36', '984691791', 'loruaneo@google.co.jp', '46473109', 'Casado', 'Masculino', '0', '1', '1', '1', '4'),
	('Hedda', 'Willshere', '1988/11/25', '32', '967552578', 'hwillsherep@symantec.com', '23308319', 'Soltero', 'Femenino', '0', '2', '2', '1', '4'),
	('Pascal', 'Lepoidevin', '1987/02/12', '36', '932126915', 'plepoidevinq@seesaa.net', '42661298', 'Soltero', 'Masculino', '2', '2', '3', '1', '12'),
	('Andres', 'Cunnow', '2000/03/13', '27', '958757721', 'acunnowr@nps.gov', '90257679', 'Soltero', 'Masculino', '0', '2', '1', '1', '1'),
	('Missie', 'Jearum', '1987/05/28', '31', '928655050', 'mjearums@youtu.be', '96144161', 'Soltero', 'Femenino', '0', '1', '2', '1', '15'),
	('Domini', 'Schimek', '1998/06/20', '28', '981999832', 'dschimekt@huffingtonpost.com', '81723910', 'Casado', 'Femenino', '2', '2', '2', '1', '1'),
	('Katherina', 'Skey', '1987/12/18', '30', '949376644', 'kskeyu@pen.io', '90175159', 'Soltero', 'Femenino', '1', '1', '3', '1', '11'),
	('Nicoline', 'Parsonson', '1984/03/05', '26', '933960477', 'nparsonsonv@t-online.de', '60477783', 'Casado', 'Femenino', '0', '1', '4', '1', '4'),
	('Emmey', 'Siemantel', '1983/01/06', '43', '989346699', 'esiemantelw@bbc.co.uk', '81220968', 'Soltero', 'Femenino', '0', '1', '1', '1', '3'),
	('Fin', 'Muzzollo', '1987/06/07', '32', '999412706', 'fmuzzollox@google.com.au', '69214434', 'Soltero', 'Masculino', '1', '1', '1', '1', '4'),
	('Beau', 'Divina', '1999/04/07', '27', '935756234', 'bdivinay@google.es', '72585489', 'Soltero', 'Masculino', '0', '2', '4', '1', '11'),
	('Robinett', 'Handforth', '1982/05/01', '38', '953709267', 'rhandforthz@t-online.de', '61009637', 'Casado', 'Femenino', '1', '1', '2', '1', '15'),
	('Parke', 'Denning', '1995/06/09', '39', '946898593', 'pdenning10@mayoclinic.com', '66593883', 'Soltero', 'Masculino', '0', '1', '4', '1', '9'),
	('Zechariah', 'Sheldrick', '1986/02/11', '41', '992532298', 'zsheldrick11@networksolutions.com', '28489919', 'Soltero', 'Masculino', '2', '1', '1', '1', '10'),
	('Lock', 'Mieville', '1988/02/27', '25', '965749620', 'lmieville12@sfgate.com', '64474760', 'Soltero', 'Masculino', '0', '1', '3', '1', '7'),
	('Aurlie', 'Mortlock', '1992/08/25', '35', '910105441', 'amortlock13@timesonline.co.uk', '84176000', 'Soltero', 'Femenino', '2', '2', '4', '1', '1'),
	('Betteann', 'Edlyne', '1997/10/02', '25', '991649014', 'bedlyne14@bbc.co.uk', '22644095', 'Casado', 'Femenino', '1', '2', '3', '1', '7'),
	('Rickard', 'Levensky', '1987/01/26', '32', '918406236', 'rlevensky15@google.com', '47376315', 'Soltero', 'Masculino', '0', '1', '2', '1', '10'),
	('Nari', 'Zute', '1996/12/19', '27', '946086608', 'nzute16@europa.eu', '27663404', 'Casado', 'Femenino', '0', '2', '2', '1', '14'),
	('Giffer', 'Noorwood', '2000/11/13', '23', '943676299', 'gnoorwood17@booking.com', '36777088', 'Casado', 'Masculino', '2', '2', '3', '1', '5'),
	('Merline', 'Cline', '1997/06/05', '36', '907245236', 'mcline18@godaddy.com', '99575054', 'Soltero', 'Femenino', '0', '2', '4', '1', '6'),
	('Joanne', 'Wilby', '1995/10/06', '27', '996595545', 'jwilby19@bizjournals.com', '93293067', 'Casado', 'Femenino', '1', '2', '4', '1', '15'),
	('June', 'Sanney', '1989/03/07', '34', '906219296', 'jsanney1a@senate.gov', '52193655', 'Soltero', 'Femenino', '1', '2', '4', '1', '11'),
	('Marten', 'Rice', '1998/05/02', '32', '921211922', 'mrice1b@woothemes.com', '20608705', 'Soltero', 'Masculino', '2', '1', '4', '1', '12'),
	('Brodie', 'Schroder', '1985/09/27', '27', '976820000', 'bschroder1c@ow.ly', '84929489', 'Soltero', 'Masculino', '1', '1', '3', '1', '4'),
	('Dalt', 'Kovelmann', '1988/09/23', '29', '945149984', 'dkovelmann1d@tumblr.com', '93415969', 'Soltero', 'Masculino', '1', '2', '2', '1', '12'),
	('Angel', 'Trye', '1996/12/07', '23', '930871769', 'atrye1e@springer.com', '59746942', 'Soltero', 'Masculino', '1', '2', '2', '1', '13'),
	('Lucy', 'Bleasdale', '1991/10/31', '34', '939236975', 'lbleasdale1f@ning.com', '59085315', 'Casado', 'Femenino', '1', '2', '1', '1', '10'),
	('Olav', 'Manske', '1983/09/12', '34', '946243456', 'omanske1g@indiegogo.com', '62527208', 'Soltero', 'Masculino', '2', '1', '3', '1', '7'),
	('Petr', 'Martlew', '1989/04/21', '29', '923093055', 'pmartlew1h@weebly.com', '65319249', 'Casado', 'Masculino', '1', '1', '2', '1', '13'),
	('Klaus', 'Shimwall', '1996/02/20', '38', '934008565', 'kshimwall1i@army.mil', '33450462', 'Soltero', 'Masculino', '0', '2', '3', '1', '9'),
	('Karlens', 'Beig', '1981/05/04', '42', '938603437', 'kbeig1j@angelfire.com', '18566457', 'Soltero', 'Masculino', '0', '2', '4', '1', '3'),
	('Maximilianus', 'Sutton', '1993/06/26', '37', '994612626', 'msutton1k@woothemes.com', '79023719', 'Soltero', 'Masculino', '0', '1', '3', '1', '14'),
	('Philly', 'Galliard', '1991/01/19', '33', '999498298', 'pgalliard1l@jalbum.net', '35445855', 'Casado', 'Femenino', '1', '2', '4', '1', '7'),
	('Robbie', 'Finlater', '2000/07/20', '36', '975143837', 'rfinlater1m@sciencedirect.com', '95360588', 'Casado', 'Masculino', '1', '1', '1', '1', '7'),
	('Serena', 'Hiddsley', '1993/12/12', '37', '985318549', 'shiddsley1n@ow.ly', '62528782', 'Casado', 'Femenino', '0', '2', '1', '1', '1'),
	('Isadore', 'Cotgrove', '1997/01/10', '37', '997795672', 'icotgrove1o@dagondesign.com', '77954214', 'Casado', 'Masculino', '1', '1', '3', '1', '14'),
	('Tasia', 'Berkery', '1985/02/07', '32', '956412353', 'tberkery1p@nymag.com', '89352271', 'Soltero', 'Femenino', '2', '1', '4', '1', '8'),
	('Kerianne', 'Pendre', '1996/05/11', '40', '955599640', 'kpendre1q@google.co.uk', '87785386', 'Casado', 'Femenino', '0', '1', '4', '1', '1'),
	('Doralynne', 'Tidcombe', '1999/02/25', '29', '929414805', 'dtidcombe1r@webmd.com', '60601101', 'Casado', 'Femenino', '0', '2', '4', '1', '5'),
	('Cort', 'Wittering', '1982/12/13', '38', '965066581', 'cwittering1s@macromedia.com', '62186535', 'Soltero', 'Masculino', '2', '1', '1', '1', '8'),
	('Sam', 'Mayho', '1996/04/19', '29', '995318505', 'smayho1t@artisteer.com', '75262723', 'Casado', 'Masculino', '2', '2', '4', '1', '10'),
	('Matthiew', 'Furmage', '1990/11/05', '28', '986922234', 'mfurmage1u@diigo.com', '82226141', 'Soltero', 'Masculino', '0', '1', '1', '1', '2'),
	('Magdalena', 'Gainsburgh', '1985/10/09', '41', '921504048', 'mgainsburgh1v@uol.com.br', '49090574', 'Casado', 'Femenino', '0', '1', '4', '1', '5'),
	('Con', 'Foggo', '1987/07/24', '36', '972666218', 'cfoggo1w@pinterest.com', '12188860', 'Soltero', 'Femenino', '2', '2', '4', '1', '3'),
	('Fey', 'Timperley', '1995/12/16', '32', '971886346', 'ftimperley1x@meetup.com', '68746409', 'Casado', 'Femenino', '1', '2', '1', '1', '2'),
	('Vaughn', 'Greswell', '1986/04/28', '25', '931373371', 'vgreswell1y@digg.com', '15707451', 'Soltero', 'Masculino', '1', '1', '1', '1', '8'),
	('Marnie', 'McQuie', '1998/06/20', '31', '902381627', 'mmcquie1z@independent.co.uk', '45444328', 'Soltero', 'Femenino', '0', '2', '2', '1', '7'),
	('Iggie', 'Coping', '1993/10/06', '33', '944809135', 'icoping20@marriott.com', '59346651', 'Soltero', 'Masculino', '0', '1', '2', '1', '12'),
	('Bree', 'Kibard', '1989/01/08', '30', '979993282', 'bkibard21@redcross.org', '75860840', 'Soltero', 'Femenino', '1', '1', '1', '1', '13'),
	('Mersey', 'Kurth', '1993/08/12', '23', '975656861', 'mkurth22@netlog.com', '46179497', 'Casado', 'Femenino', '2', '2', '1', '1', '2'),
	('Arthur', 'Frarey', '1984/06/14', '38', '942955991', 'afrarey23@admin.ch', '32604317', 'Casado', 'Masculino', '2', '2', '3', '1', '3'),
	('Angeline', 'Graeme', '1997/12/26', '38', '919937553', 'agraeme24@si.edu', '76856324', 'Casado', 'Femenino', '2', '2', '3', '1', '3'),
	('Aldo', 'Lambotin', '1994/01/14', '34', '955881598', 'alambotin25@rambler.ru', '33620051', 'Casado', 'Masculino', '0', '1', '2', '1', '2'),
	('Nerti', 'Oakden', '1989/08/07', '30', '950353398', 'noakden26@cargocollective.com', '25231390', 'Soltero', 'Femenino', '2', '1', '4', '1', '6'),
	('Phillipe', 'Iskowitz', '1997/02/02', '25', '945236684', 'piskowitz27@tinypic.com', '15477752', 'Casado', 'Masculino', '1', '2', '3', '1', '15'),
	('Witty', 'Gymlett', '1988/10/29', '34', '995367556', 'wgymlett28@utexas.edu', '24860808', 'Soltero', 'Masculino', '1', '2', '1', '1', '13'),
	('Wilhelm', 'Van Daalen', '1995/05/28', '24', '910857577', 'wvandaalen29@ning.com', '16963447', 'Soltero', 'Masculino', '1', '2', '2', '1', '2'),
	('Trenton', 'Linkin', '1986/02/28', '29', '919140223', 'tlinkin2a@yandex.ru', '45933998', 'Casado', 'Masculino', '0', '1', '2', '1', '4'),
	('Julee', 'Whyatt', '1986/12/08', '30', '930519449', 'jwhyatt2b@biblegateway.com', '58545645', 'Soltero', 'Femenino', '1', '2', '2', '1', '5'),
	('Sydney', 'Oakwell', '1999/10/14', '32', '946051780', 'soakwell2c@youku.com', '46605796', 'Casado', 'Femenino', '2', '1', '3', '1', '9'),
	('Fedora', 'Venners', '1985/05/16', '39', '960133842', 'fvenners2d@edublogs.org', '27621881', 'Soltero', 'Femenino', '2', '2', '2', '1', '13'),
	('Swen', 'Saxby', '1983/12/22', '30', '972028267', 'ssaxby2e@ycombinator.com', '18647588', 'Soltero', 'Masculino', '2', '1', '2', '1', '2'),
	('Jaye', 'Ducket', '1986/02/22', '27', '990994478', 'jducket2f@mapquest.com', '93403766', 'Soltero', 'Masculino', '2', '1', '3', '1', '1'),
	('Una', 'Hitschke', '1980/12/28', '31', '933546456', 'uhitschke2g@virginia.edu', '23253634', 'Soltero', 'Femenino', '2', '1', '2', '1', '8'),
	('Townie', 'Biasi', '2000/10/27', '32', '943604773', 'tbiasi2h@google.nl', '24478554', 'Casado', 'Masculino', '1', '1', '1', '1', '15'),
	('Albie', 'Feild', '1999/04/16', '33', '999240656', 'afeild2i@rambler.ru', '97650984', 'Soltero', 'Masculino', '0', '1', '4', '1', '8'),
	('Boy', 'Zannolli', '1988/05/10', '23', '932996532', 'bzannolli2j@msu.edu', '46212279', 'Soltero', 'Masculino', '1', '2', '1', '1', '15'),
	('Terrance', 'Eymor', '1992/06/30', '37', '970320952', 'teymor2k@wix.com', '42279467', 'Soltero', 'Masculino', '2', '1', '3', '1', '10'),
	('Cristabel', 'Groundwater', '1988/04/24', '29', '969011135', 'cgroundwater2l@t-online.de', '79725384', 'Soltero', 'Femenino', '0', '2', '3', '1', '7'),
	('Susana', 'Dovington', '1991/04/06', '30', '988392665', 'sdovington2m@zimbio.com', '42406961', 'Casado', 'Femenino', '1', '2', '3', '1', '15'),
	('Wyn', 'Ordish', '1981/05/17', '24', '901285137', 'wordish2n@skype.com', '90667207', 'Casado', 'Masculino', '0', '2', '2', '1', '13'),
	('Bern', 'Dornin', '1994/06/08', '23', '904756717', 'bdornin2o@whitehouse.gov', '36880260', 'Soltero', 'Masculino', '2', '1', '1', '1', '12'),
	('Vinnie', 'Delgaty', '2000/06/29', '38', '916429717', 'vdelgaty2p@nyu.edu', '69301738', 'Casado', 'Femenino', '1', '2', '4', '1', '6'),
	('Jeannine', 'Crackett', '1996/12/27', '25', '913563949', 'jcrackett2q@dyndns.org', '14090172', 'Soltero', 'Femenino', '1', '2', '2', '1', '9'),
	('Barbie', 'Kohler', '1990/10/16', '36', '935468895', 'bkohler2r@nbcnews.com', '32686510', 'Soltero', 'Femenino', '1', '2', '1', '1', '9'),
	('Dannel', 'Heers', '1985/06/24', '26', '916195723', 'dheers2s@skyrock.com', '62030104', 'Casado', 'Masculino', '0', '2', '3', '1', '4'),
	('Neil', 'Ibell', '1995/07/29', '24', '971583533', 'nibell2t@joomla.org', '38846777', 'Casado', 'Masculino', '0', '1', '4', '1', '10'),
	('Caresse', 'Oller', '2000/03/16', '36', '902790871', 'coller2u@shinystat.com', '11311782', 'Casado', 'Femenino', '1', '2', '1', '1', '15'),
	('Gnni', 'Lorimer', '1983/10/19', '24', '958317247', 'glorimer2v@ifeng.com', '19585703', 'Casado', 'Femenino', '0', '1', '3', '1', '12'),
	('Torrin', 'Gavriel', '1984/10/10', '42', '943661774', 'tgavriel2w@wikia.com', '98394553', 'Casado', 'Masculino', '1', '1', '2', '1', '9'),
	('Frank', 'Shallow', '1997/05/13', '25', '974362961', 'fshallow2x@cmu.edu', '75018721', 'Casado', 'Masculino', '1', '2', '1', '1', '8'),
	('Godwin', 'Allner', '1981/12/06', '28', '959835823', 'gallner2y@samsung.com', '44133385', 'Casado', 'Masculino', '1', '1', '4', '1', '6'),
	('Betti', 'Harron', '1993/06/13', '41', '950146491', 'bharron2z@elegantthemes.com', '15472650', 'Casado', 'Femenino', '2', '2', '1', '1', '7'),
	('Drusie', 'Boynes', '1987/08/14', '36', '951624280', 'dboynes30@nyu.edu', '55364322', 'Casado', 'Femenino', '2', '2', '2', '1', '11'),
	('Elyn', 'Vallens', '1989/09/29', '25', '956267955', 'evallens31@booking.com', '49140081', 'Soltero', 'Femenino', '1', '1', '3', '1', '7'),
	('Herb', 'McGloughlin', '1985/02/25', '38', '959183734', 'hmcgloughlin32@discovery.com', '82096566', 'Soltero', 'Masculino', '1', '1', '1', '1', '12'),
	('Trenna', 'Fricker', '1998/08/18', '27', '962925027', 'tfricker33@51.la', '38358265', 'Casado', 'Femenino', '0', '2', '3', '1', '2'),
	('Lincoln', 'Brownjohn', '1986/01/10', '36', '970003403', 'lbrownjohn34@wunderground.com', '85597876', 'Soltero', 'Masculino', '1', '2', '1', '1', '3'),
	('Josee', 'Wehden', '1981/06/24', '26', '919757912', 'jwehden35@guardian.co.uk', '25070831', 'Casado', 'Femenino', '1', '2', '4', '1', '4'),
	('Meryl', 'Monger', '1996/01/07', '25', '986360235', 'mmonger36@craigslist.org', '47760000', 'Soltero', 'Femenino', '1', '2', '4', '1', '13'),
	('Angelo', 'Hext', '1981/05/05', '42', '933193193', 'ahext37@reference.com', '41625133', 'Casado', 'Masculino', '0', '2', '1', '1', '6'),
	('Fremont', 'Ivanyukov', '1983/11/30', '41', '923555992', 'fivanyukov38@examiner.com', '52936340', 'Casado', 'Masculino', '2', '1', '4', '1', '6'),
	('Deeyn', 'Cornels', '1986/08/28', '31', '920243491', 'dcornels39@mit.edu', '92600825', 'Soltero', 'Femenino', '2', '1', '4', '1', '6'),
	('Norean', 'Kindon', '1998/02/04', '33', '949714488', 'nkindon3a@netscape.com', '63758947', 'Casado', 'Femenino', '0', '2', '4', '1', '1'),
	('Ossie', 'Bale', '1983/12/25', '29', '915350561', 'obale3b@ovh.net', '12213856', 'Casado', 'Masculino', '1', '2', '3', '1', '15'),
	('Lance', 'McReynold', '1996/05/21', '38', '917881873', 'lmcreynold3c@china.com.cn', '12130880', 'Soltero', 'Masculino', '0', '2', '2', '1', '13'),
	('Jenica', 'Knowlman', '1982/12/21', '32', '945604731', 'jknowlman3d@buzzfeed.com', '60517459', 'Soltero', 'Femenino', '2', '1', '2', '1', '15'),
	('Pietrek', 'Antoniat', '1997/06/28', '23', '911427918', 'pantoniat3e@github.io', '94568092', 'Casado', 'Masculino', '2', '1', '4', '1', '13'),
	('Mikel', 'Brownbill', '1999/04/08', '33', '944012349', 'mbrownbill3f@sitemeter.com', '14940264', 'Soltero', 'Masculino', '0', '2', '2', '1', '8'),
	('Teodor', 'Jellis', '1993/02/26', '42', '962754554', 'tjellis3g@blog.com', '12971818', 'Soltero', 'Masculino', '1', '1', '1', '1', '12'),
	('Rosetta', 'Futter', '1987/02/01', '42', '938865559', 'rfutter3h@nationalgeographic.com', '37182990', 'Soltero', 'Femenino', '2', '2', '3', '1', '5'),
	('Donella', 'Olver', '1993/12/19', '43', '916796434', 'dolver3i@jalbum.net', '12209216', 'Casado', 'Femenino', '0', '2', '4', '1', '11'),
	('Cthrine', 'Wolfenden', '1989/11/29', '27', '914774753', 'cwolfenden3j@salon.com', '57151918', 'Casado', 'Femenino', '1', '1', '2', '1', '10'),
	('Cristina', 'Gawn', '1988/10/17', '26', '941453368', 'cgawn3k@php.net', '47121858', 'Soltero', 'Femenino', '0', '1', '4', '1', '7'),
	('Calvin', 'Dunnaway', '1987/08/28', '28', '945512745', 'cdunnaway3l@google.es', '95957311', 'Soltero', 'Masculino', '1', '2', '3', '1', '10'),
	('Helyn', 'Matlock', '1998/08/02', '41', '932125923', 'hmatlock3m@barnesandnoble.com', '79189946', 'Casado', 'Femenino', '0', '2', '4', '1', '6'),
	('Hyatt', 'Beincken', '1993/04/19', '27', '966490624', 'hbeincken3n@storify.com', '12763903', 'Soltero', 'Masculino', '0', '2', '4', '1', '14'),
	('Danny', 'Delap', '1993/02/12', '33', '942101633', 'ddelap3o@artisteer.com', '36220353', 'Soltero', 'Masculino', '2', '1', '2', '1', '9'),
	('Irving', 'Streight', '1995/06/13', '29', '965425417', 'istreight3p@sohu.com', '14248096', 'Casado', 'Masculino', '1', '2', '1', '1', '9'),
	('Reese', 'Henrys', '1987/09/03', '26', '923467003', 'rhenrys3q@lulu.com', '88519356', 'Soltero', 'Masculino', '0', '1', '4', '1', '6'),
	('Tedmund', 'Keener', '1985/12/02', '43', '999111409', 'tkeener3r@quantcast.com', '83717772', 'Casado', 'Masculino', '2', '1', '2', '1', '2'),
	('Abramo', 'Maffy', '1993/05/31', '32', '917385267', 'amaffy3s@example.com', '76056611', 'Casado', 'Masculino', '1', '1', '2', '1', '8'),
	('Elnora', 'Anand', '1983/06/11', '30', '908238702', 'eanand3t@163.com', '62278555', 'Soltero', 'Femenino', '2', '2', '3', '1', '11'),
	('Marybeth', 'Kinglesyd', '1981/08/20', '29', '967700254', 'mkinglesyd3u@sun.com', '81620372', 'Soltero', 'Femenino', '1', '2', '4', '1', '3'),
	('Ginger', 'Mathew', '1987/04/25', '26', '990251853', 'gmathew3v@statcounter.com', '54804210', 'Casado', 'Femenino', '1', '2', '3', '1', '12'),
	('Putnem', 'Giacobbo', '1988/09/08', '38', '923242853', 'pgiacobbo3w@blogs.com', '20101765', 'Casado', 'Masculino', '0', '1', '1', '1', '12'),
	('Manon', 'Dimmock', '1983/11/29', '24', '909325921', 'mdimmock3x@sun.com', '54611106', 'Soltero', 'Femenino', '2', '2', '3', '1', '12'),
	('Diann', 'Strain', '1985/07/14', '27', '912421193', 'dstrain3y@wsj.com', '19137750', 'Soltero', 'Femenino', '0', '2', '3', '1', '3'),
	('Redford', 'Hanhard', '1984/05/09', '27', '919143720', 'rhanhard3z@pen.io', '54774749', 'Soltero', 'Masculino', '1', '2', '3', '1', '10'),
	('Celeste', 'Somerfield', '1986/12/04', '36', '960033696', 'csomerfield40@hao123.com', '53701405', 'Soltero', 'Femenino', '1', '2', '4', '1', '10'),
	('Stesha', 'Whillock', '1987/06/11', '27', '933454233', 'swhillock41@youtu.be', '60611088', 'Casado', 'Femenino', '0', '1', '1', '1', '4'),
	('Emery', 'Willeson', '1996/12/06', '32', '917408821', 'ewilleson42@nba.com', '93182036', 'Soltero', 'Masculino', '1', '1', '1', '1', '11'),
	('Margalit', 'Hollyar', '1986/12/22', '35', '937815360', 'mhollyar43@wsj.com', '48976363', 'Casado', 'Femenino', '1', '1', '4', '1', '7'),
	('Lyda', 'Bonnaire', '1981/08/14', '32', '922673901', 'lbonnaire44@ifeng.com', '61976522', 'Soltero', 'Femenino', '1', '1', '2', '1', '10'),
	('Murry', 'Ribchester', '1991/03/04', '31', '935815216', 'mribchester45@sciencedaily.com', '84204926', 'Soltero', 'Masculino', '0', '2', '4', '1', '15'),
	('Vivie', 'Brafferton', '1998/04/10', '28', '990553856', 'vbrafferton46@is.gd', '48855366', 'Soltero', 'Femenino', '0', '1', '3', '1', '15'),
	('Derron', 'Dendle', '1993/08/16', '43', '915405546', 'ddendle47@instagram.com', '56029459', 'Casado', 'Masculino', '1', '1', '2', '1', '7'),
	('Antonietta', 'Drife', '1982/04/26', '31', '986507917', 'adrife48@symantec.com', '24957104', 'Soltero', 'Femenino', '1', '2', '3', '1', '5'),
	('Cris', 'Reeveley', '1983/02/19', '28', '960502392', 'creeveley49@exblog.jp', '97520338', 'Soltero', 'Masculino', '1', '2', '2', '1', '14'),
	('Leoline', 'Holdron', '1999/09/26', '33', '914873269', 'lholdron4a@illinois.edu', '93698982', 'Soltero', 'Femenino', '2', '1', '2', '1', '8'),
	('Clair', 'Corr', '1991/08/30', '32', '927566699', 'cocorr4b@howstuffworks.com', '33350578', 'Soltero', 'Masculino', '0', '2', '2', '1', '9'),
	('Ted', 'Droogan', '1984/08/15', '41', '971223451', 'tdroogan4c@about.com', '33286561', 'Soltero', 'Femenino', '1', '2', '1', '1', '13'),
	('Jolyn', 'Knapman', '1983/03/25', '28', '912508671', 'jknapman4d@army.mil', '90824745', 'Soltero', 'Femenino', '0', '2', '2', '1', '10'),
	('Iago', 'Pollen', '1994/12/18', '42', '979161636', 'ipollen4e@paginegialle.it', '65794645', 'Soltero', 'Masculino', '1', '2', '2', '1', '13'),
	('Vivien', 'Flexman', '1994/10/04', '35', '978802335', 'vflexman4f@reverbnation.com', '19904470', 'Casado', 'Femenino', '2', '2', '3', '1', '14'),
	('Kalina', 'Taberner', '1982/12/30', '36', '946814579', 'ktaberner4g@un.org', '10012818', 'Casado', 'Femenino', '0', '1', '4', '1', '11'),
	('Lon', 'Laurenceau', '1982/09/25', '34', '908866771', 'llaurenceau4h@nsw.gov.au', '25750611', 'Soltero', 'Masculino', '0', '2', '3', '1', '6'),
	('Olva', 'Taunton.', '1999/12/26', '37', '981361473', 'otaunton4i@discuz.net', '65247242', 'Soltero', 'Femenino', '1', '2', '1', '1', '3'),
	('Gar', 'Croix', '1983/05/15', '32', '987392542', 'gcroix4j@sogou.com', '66660467', 'Soltero', 'Masculino', '2', '2', '2', '1', '3'),
	('Rodina', 'Camlin', '1982/05/16', '31', '944645069', 'rcamlin4k@tinyurl.com', '73753410', 'Soltero', 'Femenino', '0', '1', '3', '1', '2'),
	('Isabelle', 'Grimsdale', '1992/09/13', '23', '917349004', 'igrimsdale4l@usatoday.com', '64329288', 'Casado', 'Femenino', '1', '1', '1', '1', '1'),
	('Welby', 'Binding', '1990/01/23', '39', '937876452', 'wbinding4m@flavors.me', '84689659', 'Casado', 'Masculino', '1', '2', '4', '1', '9'),
	('Monica', 'Asling', '1996/09/18', '28', '925868450', 'masling4n@theguardian.com', '25308384', 'Soltero', 'Femenino', '0', '1', '1', '1', '13'),
	('Leigh', 'Veljes', '1988/08/03', '43', '966789958', 'lveljes4o@blogger.com', '81020982', 'Casado', 'Masculino', '2', '1', '1', '1', '2'),
	('Stern', 'Woodroof', '1995/06/16', '40', '971546754', 'swoodroof4p@vk.com', '18371143', 'Soltero', 'Masculino', '0', '1', '2', '1', '15'),
	('Cherilyn', 'Addey', '1993/02/14', '26', '987483037', 'caddey4q@yelp.com', '63761744', 'Soltero', 'Femenino', '1', '2', '2', '1', '9'),
	('Jermain', 'Lanyon', '1983/10/22', '27', '990998173', 'jlanyon4r@soup.io', '41640229', 'Casado', 'Masculino', '2', '1', '4', '1', '8'),
	('Carlie', 'Bartoszewski', '1993/03/05', '34', '958980907', 'cbartoszewski4s@noaa.gov', '89293904', 'Soltero', 'Masculino', '2', '2', '2', '1', '15'),
	('Freddi', 'Mallison', '1984/10/19', '27', '950530008', 'fmallison4t@ftc.gov', '12552355', 'Casado', 'Femenino', '2', '1', '4', '1', '4'),
	('Arlen', 'Tonna', '1994/04/08', '41', '912891172', 'atonna4u@artisteer.com', '30736792', 'Casado', 'Masculino', '1', '1', '3', '1', '5'),
	('Dusty', 'Knibb', '1994/02/18', '27', '905156662', 'dknibb4v@google.com.au', '67962889', 'Soltero', 'Femenino', '0', '2', '2', '1', '3'),
	('Maurie', 'Dmitrienko', '1981/05/02', '43', '978265730', 'mdmitrienko4w@t-online.de', '24353205', 'Casado', 'Masculino', '0', '1', '2', '1', '5'),
	('Davidson', 'Klainman', '1992/04/24', '26', '957474726', 'dklainman4x@amazon.de', '31856885', 'Soltero', 'Masculino', '1', '1', '3', '1', '3'),
	('Yankee', 'Bolton', '1988/09/17', '28', '998578282', 'ybolton4y@blogger.com', '92331215', 'Soltero', 'Masculino', '2', '1', '4', '1', '4'),
	('Quinta', 'Beedle', '1991/10/18', '29', '979207185', 'qbeedle4z@mail.ru', '89358855', 'Soltero', 'Femenino', '1', '1', '2', '1', '6'),
	('Regen', 'Lovering', '1998/10/10', '33', '945683046', 'rlovering50@elegantthemes.com', '22491382', 'Soltero', 'Masculino', '2', '1', '1', '1', '7'),
	('Xaviera', 'Hastie', '1997/01/02', '43', '911646131', 'xhastie51@qq.com', '53703499', 'Casado', 'Femenino', '1', '1', '1', '1', '4'),
	('Fulton', 'Hollingdale', '1999/11/20', '38', '982004348', 'fhollingdale52@dyndns.org', '82338123', 'Casado', 'Masculino', '2', '1', '3', '1', '6'),
	('Maddy', 'Burdell', '1999/03/11', '40', '959936827', 'mburdell53@cocolog-nifty.com', '35279681', 'Casado', 'Femenino', '0', '2', '4', '1', '11'),
	('Farly', 'Hirtzmann', '1997/04/24', '35', '972757473', 'fhirtzmann54@biglobe.ne.jp', '90004073', 'Soltero', 'Masculino', '2', '1', '3', '1', '5'),
	('Kimball', 'Dollard', '1998/01/28', '25', '935139475', 'kdollard55@ox.ac.uk', '17435014', 'Casado', 'Masculino', '0', '1', '4', '1', '12'),
	('Bartholomeus', 'Thebeau', '1984/04/13', '36', '908191149', 'bthebeau56@sphinn.com', '59308251', 'Casado', 'Masculino', '1', '1', '1', '1', '12'),
	('Ashby', 'Brisco', '1983/12/07', '31', '913842132', 'abrisco57@google.cn', '48903036', 'Soltero', 'Masculino', '1', '2', '3', '1', '15'),
	('Finley', 'Stichall', '1985/06/25', '42', '993300609', 'fstichall58@over-blog.com', '64424564', 'Casado', 'Masculino', '2', '2', '1', '1', '12'),
	('Annie', 'Higbin', '1984/02/05', '24', '950055333', 'ahigbin59@eepurl.com', '84801105', 'Casado', 'Femenino', '1', '1', '2', '1', '11'),
	('Alec', 'Moggle', '1984/08/14', '28', '981824195', 'amoggle5a@sciencedirect.com', '27983023', 'Soltero', 'Masculino', '2', '1', '4', '1', '7'),
	('Nanni', 'Heading', '2000/03/18', '28', '944815176', 'nheading5b@walmart.com', '69416210', 'Soltero', 'Femenino', '0', '2', '1', '1', '2'),
	('Dukey', 'OLoughran', '1999/09/29', '26', '948597926', 'doloughran5c@chicagotribune.com', '94184048', 'Casado', 'Masculino', '0', '2', '2', '1', '11'),
	('Leann', 'Baum', '1985/07/14', '25', '908167341', 'lbaum5d@alibaba.com', '82480271', 'Soltero', 'Femenino', '2', '1', '3', '1', '2'),
	('Vernen', 'Bustard', '1989/11/03', '34', '962791344', 'vbustard5e@delicious.com', '74789804', 'Soltero', 'Masculino', '1', '1', '4', '1', '11'),
	('Ingaberg', 'Bethell', '1983/10/13', '25', '947686448', 'ibethell5f@seattletimes.com', '88138283', 'Soltero', 'Femenino', '0', '1', '2', '1', '2'),
	('Marybelle', 'Scola', '1987/03/03', '33', '917683114', 'mscola5g@infoseek.co.jp', '68600187', 'Soltero', 'Femenino', '2', '1', '3', '1', '1'),
	('Niki', 'Hamper', '1982/09/08', '30', '930645383', 'nhamper5h@globo.com', '30279558', 'Casado', 'Masculino', '2', '1', '3', '1', '14'),
	('Minne', 'Dawks', '1984/09/25', '37', '970027085', 'mdawks5i@reuters.com', '90812466', 'Casado', 'Femenino', '1', '2', '3', '1', '9'),
	('Geri', 'Abrahmson', '1985/01/01', '37', '921079831', 'gabrahmson5j@behance.net', '91891963', 'Casado', 'Masculino', '2', '2', '3', '1', '4'),
	('Vincenty', 'Emerson', '1991/10/07', '43', '930260059', 'vemerson5k@is.gd', '63873694', 'Casado', 'Masculino', '0', '2', '3', '1', '4'),
	('Chrissie', 'Cuffin', '1999/06/26', '43', '935903567', 'ccuffin5l@who.int', '34653324', 'Soltero', 'Masculino', '1', '1', '1', '1', '1'),
	('Truman', 'le Keux', '1988/10/23', '37', '913210252', 'tlekeux5m@blinklist.com', '11847531', 'Soltero', 'Masculino', '0', '1', '1', '1', '4'),
	('Axe', 'Vallintine', '1995/12/05', '23', '968923992', 'avallintine5n@imdb.com', '84326460', 'Soltero', 'Masculino', '2', '1', '4', '1', '2'),
	('Javier', 'Greggor', '1991/12/20', '39', '998901475', 'jgreggor5o@dyndns.org', '16673098', 'Soltero', 'Masculino', '0', '2', '3', '1', '12'),
	('Loutitia', 'McGunley', '1983/11/29', '35', '911066359', 'lmcgunley5p@bbb.org', '97475474', 'Casado', 'Femenino', '1', '2', '1', '1', '1'),
	('Spencer', 'Loyndon', '1993/06/10', '33', '900586784', 'sloyndon5q@webs.com', '46277767', 'Casado', 'Masculino', '1', '2', '3', '1', '1'),
	('Jori', 'Seegar', '1995/04/10', '25', '981921766', 'jseegar5r@nationalgeographic.com', '49329032', 'Casado', 'Femenino', '0', '2', '2', '1', '12'),
	('Lev', 'Sugarman', '1995/09/26', '24', '991107504', 'lsugarman5s@yandex.ru', '98459539', 'Soltero', 'Masculino', '0', '1', '2', '1', '7'),
	('Estele', 'Walthall', '1998/07/09', '36', '918326466', 'ewalthall5t@irs.gov', '69314605', 'Casado', 'Femenino', '0', '1', '4', '1', '3'),
	('Egon', 'Jessop', '1983/03/24', '23', '913341209', 'ejessop5u@boston.com', '52122714', 'Soltero', 'Masculino', '2', '2', '3', '1', '15'),
	('Agata', 'Goligher', '1996/02/07', '40', '954168190', 'agoligher5v@biblegateway.com', '98758430', 'Casado', 'Femenino', '2', '1', '2', '1', '5'),
	('Margarethe', 'Weild', '1986/07/05', '27', '922966795', 'mweild5w@webeden.co.uk', '31579680', 'Casado', 'Femenino', '2', '2', '3', '1', '15'),
	('Hillyer', 'Brettle', '1986/08/27', '32', '983530010', 'hbrettle5x@dyndns.org', '36088493', 'Soltero', 'Masculino', '2', '2', '1', '1', '13'),
	('Harv', 'Barbera', '1999/12/06', '32', '948598169', 'hbarbera5y@a8.net', '33269642', 'Casado', 'Masculino', '0', '1', '4', '1', '8'),
	('Joya', 'Goodenough', '1995/07/02', '32', '990140807', 'jgoodenough5z@mac.com', '58950506', 'Soltero', 'Femenino', '0', '1', '2', '1', '10'),
	('Hi', 'Brownsea', '1982/02/14', '40', '939916711', 'hbrownsea60@aol.com', '13647526', 'Casado', 'Masculino', '0', '2', '1', '1', '8'),
	('Karoly', 'Fodden', '1992/08/12', '29', '998625922', 'kfodden61@fastcompany.com', '79561943', 'Casado', 'Masculino', '1', '2', '3', '1', '6'),
	('Sande', 'Giacopazzi', '1996/06/25', '32', '952298480', 'sgiacopazzi62@opera.com', '33439143', 'Soltero', 'Femenino', '1', '2', '2', '1', '7'),
	('Silvio', 'Piolli', '1993/03/19', '36', '951741730', 'spiolli63@craigslist.org', '77754541', 'Casado', 'Masculino', '1', '1', '1', '1', '15'),
	('Emmery', 'Danett', '1982/10/04', '24', '916952314', 'edanett64@wp.com', '89368787', 'Casado', 'Masculino', '0', '2', '3', '1', '4'),
	('Whitman', 'Compson', '1992/04/27', '30', '913556270', 'wcompson65@census.gov', '55697878', 'Casado', 'Masculino', '1', '1', '4', '1', '9'),
	('Ambrose', 'Blazeby', '1999/12/12', '28', '919069644', 'ablazeby66@bigcartel.com', '92430084', 'Casado', 'Masculino', '2', '2', '2', '1', '13'),
	('Rriocard', 'Branca', '1997/12/24', '28', '908913964', 'rbranca67@usatoday.com', '40059326', 'Casado', 'Masculino', '1', '2', '4', '1', '1'),
	('Corabella', 'Kobpac', '1993/02/25', '34', '953971623', 'ckobpac68@netvibes.com', '73504165', 'Soltero', 'Femenino', '0', '1', '3', '1', '9'),
	('Louie', 'Boughton', '1984/01/14', '31', '905121947', 'lboughton69@loc.gov', '47360106', 'Soltero', 'Masculino', '0', '1', '4', '1', '14'),
	('Valeda', 'Gieraths', '1990/11/17', '43', '947099223', 'vgieraths6a@gravatar.com', '12416352', 'Soltero', 'Femenino', '0', '1', '3', '1', '2'),
	('Hermon', 'Swalteridge', '1990/01/15', '29', '929631820', 'hswalteridge6b@wp.com', '92230663', 'Casado', 'Masculino', '1', '2', '4', '1', '4'),
	('Charlean', 'Tantum', '1993/05/26', '42', '979772172', 'ctantum6c@google.pl', '83355211', 'Soltero', 'Femenino', '1', '2', '3', '1', '15'),
	('Conan', 'Cearley', '1981/01/18', '29', '900382476', 'ccearley6d@weather.com', '88318112', 'Soltero', 'Masculino', '0', '1', '2', '1', '11'),
	('Joyann', 'Caulder', '1983/01/13', '23', '961843998', 'jcaulder6e@51.la', '67340692', 'Casado', 'Femenino', '1', '1', '2', '1', '11'),
	('Muffin', 'Thackham', '1980/12/02', '40', '960551130', 'mthackham6f@sbwire.com', '60801833', 'Casado', 'Masculino', '1', '1', '4', '1', '14'),
	('Vlad', 'Story', '1993/09/11', '41', '975059187', 'vstory6g@state.gov', '18518488', 'Casado', 'Masculino', '2', '2', '3', '1', '12'),
	('Aubert', 'Matiebe', '1991/07/01', '32', '987598323', 'amatiebe6h@nasa.gov', '95516639', 'Soltero', 'Masculino', '0', '1', '1', '1', '13'),
	('Lira', 'Stopp', '1997/02/26', '30', '926192376', 'lstopp6i@slideshare.net', '50607190', 'Casado', 'Femenino', '0', '2', '3', '1', '6'),
	('Helga', 'Iacopetti', '1990/09/17', '27', '941238580', 'hiacopetti6j@joomla.org', '52177399', 'Soltero', 'Femenino', '1', '1', '2', '1', '5'),
	('Cece', 'McLucky', '1992/04/25', '35', '931340301', 'cmclucky6k@imdb.com', '49049407', 'Casado', 'Masculino', '1', '2', '3', '1', '12'),
	('Skyler', 'Dollen', '1995/10/16', '36', '940911771', 'sdollen6l@macromedia.com', '93203676', 'Casado', 'Masculino', '2', '2', '2', '1', '2'),
	('Errick', 'Wretham', '1988/05/18', '33', '993398806', 'ewretham6m@google.pl', '59673028', 'Soltero', 'Masculino', '0', '2', '3', '1', '6'),
	('Bernita', 'Dommett', '1993/12/08', '29', '998376697', 'bdommett6n@t-online.de', '33959567', 'Soltero', 'Femenino', '0', '2', '2', '1', '1'),
	('Barnett', 'Penritt', '1986/03/16', '24', '948550549', 'bpenritt6o@cbsnews.com', '19131078', 'Casado', 'Masculino', '0', '1', '1', '1', '2'),
	('Valaria', 'Gosselin', '2000/09/28', '37', '966822001', 'vgosselin6p@house.gov', '24312421', 'Soltero', 'Femenino', '1', '1', '2', '1', '13'),
	('Osmund', 'Docker', '1988/12/12', '42', '935481799', 'odocker6q@ucoz.com', '82488770', 'Soltero', 'Masculino', '2', '2', '1', '1', '5'),
	('Bess', 'Euler', '1984/01/01', '34', '949199328', 'beuler6r@typepad.com', '47608236', 'Soltero', 'Femenino', '2', '2', '1', '1', '8'),
	('Shandee', 'Stopps', '1999/01/22', '42', '932208748', 'sstopps6s@walmart.com', '74300294', 'Casado', 'Femenino', '1', '2', '1', '1', '13'),
	('Phyllis', 'Fesby', '1981/10/24', '24', '935964028', 'pfesby6t@chicagotribune.com', '12625192', 'Casado', 'Femenino', '1', '2', '3', '1', '4'),
	('Davine', 'Doughill', '1982/01/21', '28', '932910496', 'ddoughill6u@cocolog-nifty.com', '71405617', 'Soltero', 'Femenino', '1', '2', '1', '1', '7'),
	('Lacee', 'Backe', '1999/01/23', '35', '990529893', 'lbacke6v@csmonitor.com', '45813472', 'Soltero', 'Femenino', '2', '1', '3', '1', '11'),
	('Elyn', 'Jumeau', '1992/01/19', '38', '998814465', 'ejumeau6w@com.com', '67606487', 'Soltero', 'Femenino', '2', '2', '1', '1', '8'),
	('Tobias', 'Giovanazzi', '1981/02/24', '39', '961028822', 'tgiovanazzi6x@newyorker.com', '43377084', 'Casado', 'Masculino', '1', '2', '4', '1', '5'),
	('Jeffie', 'Rosengarten', '1991/02/01', '27', '912064894', 'jrosengarten6y@howstuffworks.com', '47999762', 'Casado', 'Masculino', '1', '1', '2', '1', '14'),
	('Chastity', 'Plumstead', '1994/05/02', '27', '962850391', 'cplumstead6z@vk.com', '74830338', 'Soltero', 'Femenino', '0', '1', '1', '1', '10'),
	('Parnell', 'Holstein', '1990/01/20', '32', '914741662', 'pholstein70@ebay.co.uk', '81467592', 'Soltero', 'Masculino', '0', '1', '2', '1', '15'),
	('Misti', 'Thomasset', '1983/09/19', '24', '921810243', 'mthomasset71@hp.com', '18105260', 'Soltero', 'Femenino', '0', '2', '1', '1', '2'),
	('Allx', 'Cready', '1991/09/08', '25', '951104193', 'acready72@yellowpages.com', '59767372', 'Casado', 'Femenino', '1', '1', '1', '1', '12'),
	('Evin', 'Delort', '1983/09/05', '43', '907346152', 'edelort73@quantcast.com', '44246909', 'Casado', 'Masculino', '1', '1', '4', '1', '15'),
	('Alisun', 'Von Salzberg', '1985/11/17', '24', '904557201', 'avonsalzberg74@plala.or.jp', '88229955', 'Soltero', 'Femenino', '0', '2', '1', '1', '3'),
	('Julie', 'Barnwill', '1981/12/06', '40', '970884861', 'jbarnwill75@instagram.com', '92820550', 'Soltero', 'Masculino', '1', '2', '4', '1', '4'),
	('Hamnet', 'Walisiak', '1984/12/03', '33', '989474623', 'hwalisiak76@sciencedirect.com', '75110390', 'Casado', 'Masculino', '1', '2', '2', '1', '1'),
	('Corabelle', 'Wank', '2000/04/29', '33', '907008212', 'cwank77@ihg.com', '73626396', 'Casado', 'Femenino', '2', '1', '4', '1', '9'),
	('Wilone', 'Castri', '2000/09/10', '29', '987763692', 'wcastri78@businessinsider.com', '60974130', 'Soltero', 'Femenino', '2', '1', '1', '1', '9'),
	('Celestia', 'Dillinger', '1998/11/06', '30', '916338203', 'cdillinger79@auda.org.au', '42699884', 'Soltero', 'Femenino', '0', '2', '2', '1', '5'),
	('Amalea', 'Milsom', '1995/04/22', '41', '939525935', 'amilsom7a@nytimes.com', '53797433', 'Casado', 'Femenino', '2', '1', '4', '1', '1'),
	('Bren', 'Brandt', '2000/05/20', '41', '956781259', 'bbrandt7b@berkeley.edu', '36872064', 'Casado', 'Femenino', '0', '2', '2', '1', '2'),
	('Byram', 'Stearndale', '2000/11/07', '42', '987930238', 'bstearndale7c@yellowpages.com', '63294625', 'Casado', 'Masculino', '2', '1', '4', '1', '14'),
	('Tasha', 'Serrels', '1991/09/03', '26', '932589938', 'tserrels7d@nih.gov', '34768645', 'Casado', 'Femenino', '1', '1', '1', '1', '10'),
	('Justen', 'Epple', '1994/10/22', '30', '980225796', 'jepple7e@ucsd.edu', '93937443', 'Soltero', 'Masculino', '1', '2', '2', '1', '11'),
	('Nathalie', 'Redish', '1998/08/03', '28', '996560110', 'nredish7f@state.tx.us', '77045457', 'Soltero', 'Femenino', '2', '1', '1', '1', '11'),
	('Sigismundo', 'Cookson', '1997/01/01', '25', '954448690', 'scookson7g@prlog.org', '76402382', 'Casado', 'Masculino', '2', '1', '4', '1', '5'),
	('Dasha', 'Waterman', '1998/11/19', '24', '953331629', 'dwaterman7h@angelfire.com', '70647876', 'Casado', 'Femenino', '0', '2', '4', '1', '9'),
	('Nadine', 'Rosberg', '1981/05/28', '30', '903303196', 'nrosberg7i@slate.com', '89034757', 'Casado', 'Femenino', '2', '1', '1', '1', '7'),
	('Brand', 'McGarrity', '1982/05/11', '30', '920961423', 'bmcgarrity7j@lulu.com', '86648194', 'Soltero', 'Masculino', '2', '1', '3', '1', '4'),
	('Valaria', 'Scandall', '1989/03/02', '40', '991885510', 'voscandall7k@baidu.com', '63684155', 'Soltero', 'Femenino', '1', '2', '2', '1', '6'),
	('Ryan', 'Bumby', '1996/06/26', '23', '912122809', 'rbumby7l@cyberchimps.com', '28938840', 'Casado', 'Masculino', '0', '1', '3', '1', '11'),
	('Burk', 'Melchior', '1997/08/24', '33', '918149275', 'bmelchior7m@typepad.com', '98492481', 'Casado', 'Masculino', '0', '1', '3', '1', '4'),
	('Oralee', 'Latey', '1991/02/15', '42', '955417320', 'olatey7n@marriott.com', '96217153', 'Soltero', 'Femenino', '2', '2', '4', '1', '7'),
	('Auberon', 'Tatlow', '1982/09/04', '38', '927803693', 'atatlow7o@smh.com.au', '43480073', 'Casado', 'Masculino', '1', '1', '3', '1', '3'),
	('Nettie', 'Spinola', '1997/11/09', '42', '913087791', 'nspinola7p@mayoclinic.com', '76933992', 'Casado', 'Femenino', '0', '1', '1', '1', '12'),
	('Tedie', 'Sykora', '1988/06/23', '24', '966203461', 'tsykora7q@bbc.co.uk', '14756127', 'Soltero', 'Masculino', '0', '2', '1', '1', '7'),
	('Jennica', 'Fortin', '1987/11/26', '36', '934163278', 'jfortin7r@businesswire.com', '41760480', 'Soltero', 'Femenino', '0', '1', '1', '1', '4'),
	('Stavro', 'Mebius', '1986/12/26', '32', '963889612', 'smebius7s@howstuffworks.com', '24256500', 'Casado', 'Masculino', '0', '2', '3', '1', '6'),
	('Beryl', 'Skillington', '1989/09/04', '41', '975383423', 'bskillington7t@icio.us', '75864031', 'Casado', 'Femenino', '0', '1', '1', '1', '11'),
	('Monti', 'Creech', '1990/08/06', '33', '905148939', 'mcreech7u@mtv.com', '38062181', 'Casado', 'Masculino', '2', '2', '3', '1', '7'),
	('Virginia', 'Staines', '1997/10/28', '24', '982011416', 'vstaines7v@multiply.com', '58771598', 'Casado', 'Femenino', '0', '1', '1', '1', '12'),
	('Melamie', 'De La Hay', '1981/10/14', '43', '990612516', 'mdelahay7w@wordpress.org', '73238368', 'Soltero', 'Femenino', '1', '2', '2', '1', '5'),
	('Darcy', 'Ewan', '1983/07/08', '26', '953846185', 'dewan7x@macromedia.com', '93793120', 'Casado', 'Masculino', '1', '2', '1', '1', '2'),
	('Nikolos', 'Lindback', '1992/08/05', '37', '985506174', 'nlindback7y@weibo.com', '98215502', 'Soltero', 'Masculino', '1', '2', '4', '1', '14'),
	('Fabien', 'Ranscombe', '1982/06/02', '38', '964240394', 'franscombe7z@clickbank.net', '24033213', 'Casado', 'Masculino', '0', '1', '2', '1', '12'),
	('Carri', 'Sawforde', '1996/02/13', '41', '942734661', 'csawforde80@ftc.gov', '99905374', 'Soltero', 'Femenino', '1', '2', '2', '1', '9'),
	('Sheryl', 'Arcy', '1988/06/20', '26', '900235763', 'sdarcy81@privacy.gov.au', '57642906', 'Soltero', 'Femenino', '0', '1', '3', '1', '4'),
	('Alix', 'Hazell', '1991/04/22', '32', '958719277', 'ahazell82@scientificamerican.com', '52802352', 'Casado', 'Masculino', '0', '2', '4', '1', '6'),
	('Dame', 'Pinkerton', '1995/09/17', '29', '941774740', 'dpinkerton83@tiny.cc', '85392087', 'Casado', 'Masculino', '2', '2', '1', '1', '15'),
	('Jamesy', 'Boobier', '1994/11/09', '30', '943749737', 'jboobier84@fema.gov', '21781486', 'Soltero', 'Masculino', '0', '1', '3', '1', '5'),
	('Sydelle', 'Belleny', '1990/01/10', '36', '947548530', 'sbelleny85@toplist.cz', '94389501', 'Casado', 'Femenino', '1', '2', '2', '1', '5'),
	('Darnell', 'Cadany', '1990/06/06', '42', '999348927', 'dcadany86@yandex.ru', '17928124', 'Soltero', 'Masculino', '0', '2', '2', '1', '2'),
	('Kessia', 'Olivet', '1996/10/18', '24', '939327027', 'kolivet87@zimbio.com', '82978942', 'Casado', 'Femenino', '2', '1', '1', '1', '7'),
	('Marybeth', 'Smithson', '1996/02/19', '26', '946547942', 'msmithson88@yandex.ru', '44712015', 'Soltero', 'Femenino', '2', '2', '4', '1', '12'),
	('Tildi', 'Gibbon', '1993/11/21', '43', '976942451', 'tgibbon89@skyrock.com', '34274411', 'Casado', 'Femenino', '0', '1', '4', '1', '3'),
	('Augustin', 'Tolemache', '1981/07/11', '28', '982792222', 'atolemache8a@edublogs.org', '17695872', 'Casado', 'Masculino', '0', '2', '4', '1', '2'),
	('Roana', 'Scarborough', '1997/06/08', '43', '946570010', 'rscarborough8b@plala.or.jp', '98592271', 'Soltero', 'Femenino', '2', '1', '2', '1', '11'),
	('Ruthi', 'Paling', '1997/04/13', '28', '987822014', 'rpaling8c@parallels.com', '79013962', 'Casado', 'Femenino', '1', '2', '2', '1', '7'),
	('Maggi', 'Maghull', '1997/03/25', '31', '946520715', 'mmaghull8d@vk.com', '55386690', 'Casado', 'Femenino', '2', '2', '3', '1', '14'),
	('De', 'Meus', '1989/11/10', '33', '938167005', 'dmeus8e@imageshack.us', '74746807', 'Soltero', 'Femenino', '2', '1', '2', '1', '10'),
	('Ruperta', 'Iacovozzo', '1987/10/05', '36', '952024396', 'riacovozzo8f@clickbank.net', '89434052', 'Casado', 'Femenino', '2', '1', '1', '1', '10'),
	('Prentice', 'Deesly', '1984/08/05', '38', '986599495', 'pdeesly8g@huffingtonpost.com', '63564998', 'Casado', 'Masculino', '1', '2', '2', '1', '9'),
	('Deeann', 'Harlow', '1996/02/20', '31', '974812655', 'dharlow8h@over-blog.com', '99277006', 'Soltero', 'Femenino', '0', '1', '4', '1', '3'),
	('Liam', 'Brunning', '1986/09/11', '31', '931362264', 'lbrunning8i@oracle.com', '93358367', 'Casado', 'Masculino', '0', '2', '4', '1', '6'),
	('Loleta', 'Dainter', '1996/03/21', '41', '913850506', 'ldainter8j@home.pl', '14428674', 'Soltero', 'Femenino', '0', '2', '4', '1', '12'),
	('Jeffry', 'Francesc', '2000/09/12', '29', '948030182', 'jfrancesc8k@vinaora.com', '52047474', 'Casado', 'Masculino', '1', '1', '3', '1', '3'),
	('Karrah', 'Husby', '1984/02/07', '38', '987986624', 'khusby8l@blogger.com', '58983000', 'Casado', 'Femenino', '0', '2', '4', '1', '3'),
	('Minetta', 'Paolini', '1998/12/11', '27', '984989078', 'mpaolini8m@hostgator.com', '79737184', 'Casado', 'Femenino', '1', '2', '2', '1', '9'),
	('Myrtle', 'Sang', '1992/09/18', '31', '974944353', 'msang8n@smh.com.au', '97973694', 'Casado', 'Femenino', '1', '2', '2', '1', '11'),
	('Duke', 'Sexon', '1990/09/07', '26', '910691515', 'dsexon8o@booking.com', '86566400', 'Casado', 'Masculino', '0', '2', '1', '1', '9'),
	('Berke', 'Surphliss', '1995/10/17', '36', '915530872', 'bsurphliss8p@newsvine.com', '85594048', 'Soltero', 'Masculino', '0', '1', '2', '1', '11'),
	('Lem', 'Krienke', '1998/01/25', '23', '929866648', 'lkrienke8q@usatoday.com', '44798646', 'Casado', 'Masculino', '0', '1', '2', '1', '2'),
	('Dorena', 'Petrowsky', '1986/08/12', '26', '934477157', 'dpetrowsky8r@indiegogo.com', '31998582', 'Casado', 'Femenino', '0', '2', '2', '1', '14'),
	('Garnette', 'Pilmoor', '1994/06/08', '29', '957036063', 'gpilmoor8s@behance.net', '86584623', 'Soltero', 'Femenino', '2', '1', '4', '1', '13'),
	('Bobbette', 'Drains', '1989/12/29', '42', '993047327', 'bdrains8t@desdev.cn', '44098851', 'Soltero', 'Femenino', '2', '1', '3', '1', '4'),
	('Koenraad', 'Verheijden', '2000/07/20', '26', '906709417', 'kverheijden8u@angelfire.com', '69408436', 'Soltero', 'Masculino', '1', '1', '2', '1', '11'),
	('Ora', 'Goublier', '1987/11/28', '27', '956256483', 'ogoublier8v@over-blog.com', '55921551', 'Casado', 'Femenino', '2', '2', '1', '1', '4'),
	('Nahum', 'Karlolczak', '1996/08/05', '37', '980588565', 'nkarlolczak8w@wufoo.com', '63254886', 'Soltero', 'Masculino', '1', '1', '2', '1', '5'),
	('Ashlen', 'Frenzl', '1986/01/09', '24', '999048398', 'afrenzl8x@ucsd.edu', '48029398', 'Soltero', 'Femenino', '1', '2', '1', '1', '14'),
	('Mead', 'Danilchik', '1992/06/28', '40', '991305704', 'mdanilchik8y@mapquest.com', '38687512', 'Casado', 'Femenino', '0', '2', '4', '1', '10'),
	('Daune', 'Emblen', '1994/10/15', '26', '979936296', 'demblen8z@youtube.com', '50159914', 'Casado', 'Femenino', '2', '2', '2', '1', '13'),
	('Zane', 'Cuppitt', '1991/08/17', '24', '900199831', 'zcuppitt90@intel.com', '94202733', 'Soltero', 'Masculino', '0', '1', '2', '1', '3'),
	('Newton', 'Gillean', '1992/07/01', '32', '958571063', 'ngillean91@marketwatch.com', '64015816', 'Casado', 'Masculino', '2', '1', '2', '1', '14'),
	('Dorothee', 'Plumtree', '1981/01/12', '35', '999775248', 'dplumtree92@hc360.com', '27380611', 'Casado', 'Femenino', '1', '2', '4', '1', '6'),
	('Hyacinthe', 'Heindl', '1981/03/04', '35', '955077399', 'hheindl93@fastcompany.com', '94900779', 'Casado', 'Femenino', '0', '2', '1', '1', '13'),
	('Evelyn', 'Shaplin', '1994/12/16', '42', '937768143', 'eshaplin94@e-recht24.de', '14770693', 'Soltero', 'Femenino', '2', '2', '2', '1', '12'),
	('Christen', 'Patient', '1983/08/31', '26', '972903554', 'cpatient95@globo.com', '47683824', 'Casado', 'Femenino', '2', '1', '4', '1', '8'),
	('Garreth', 'Greenhowe', '2000/07/21', '35', '983466534', 'ggreenhowe96@webeden.co.uk', '95388114', 'Casado', 'Masculino', '1', '1', '4', '1', '13'),
	('Rachel', 'Crummie', '1982/03/14', '34', '993319395', 'rcrummie97@de.vu', '85368133', 'Casado', 'Femenino', '0', '2', '2', '1', '8'),
	('Jaye', 'Pestridge', '2000/07/08', '38', '990469348', 'jpestridge98@plala.or.jp', '98732641', 'Soltero', 'Masculino', '1', '1', '3', '1', '14'),
	('Shirlee', 'Orth', '1990/06/01', '28', '982360540', 'sorth99@google.nl', '76302101', 'Soltero', 'Femenino', '2', '2', '3', '1', '10'),
	('Marlon', 'Shapland', '1995/07/21', '28', '998037521', 'mshapland9a@vk.com', '76829893', 'Soltero', 'Masculino', '2', '2', '4', '1', '4'),
	('Annadiane', 'de Clerq', '1995/01/01', '41', '965379789', 'adeclerq9b@ebay.com', '10103175', 'Casado', 'Femenino', '0', '1', '3', '1', '8'),
	('Gwenneth', 'Hawkings', '1989/05/26', '36', '975601069', 'ghawkings9c@jigsy.com', '26798351', 'Casado', 'Femenino', '1', '1', '4', '1', '11'),
	('Laurence', 'Luety', '1980/12/23', '29', '947072936', 'lluety9d@europa.eu', '24806264', 'Casado', 'Masculino', '2', '1', '3', '1', '11'),
	('Ulric', 'Arnke', '1996/05/12', '40', '912235580', 'uarnke9e@tripadvisor.com', '91701480', 'Casado', 'Masculino', '2', '1', '3', '1', '11'),
	('Ebba', 'Tedahl', '2000/06/23', '42', '990452078', 'etedahl9f@usgs.gov', '70316257', 'Soltero', 'Femenino', '2', '2', '2', '1', '15'),
	('Shirlee', 'Goulborn', '1991/02/05', '36', '972196130', 'sgoulborn9g@businesswire.com', '38408349', 'Soltero', 'Femenino', '0', '2', '3', '1', '7'),
	('Hube', 'Mitchelson', '1982/11/23', '28', '917039646', 'hmitchelson9h@storify.com', '78770428', 'Soltero', 'Masculino', '0', '2', '4', '1', '4'),
	('Dyann', 'Dayes', '1997/10/28', '23', '987395226', 'ddayes9i@github.io', '10453237', 'Casado', 'Femenino', '1', '1', '4', '1', '14'),
	('Dorian', 'Drydale', '1994/05/08', '37', '933604843', 'ddrydale9j@ning.com', '31503067', 'Casado', 'Masculino', '2', '2', '3', '1', '4'),
	('Oneida', 'Lathy', '1993/08/09', '23', '991209960', 'olathy9k@ameblo.jp', '80260731', 'Soltero', 'Femenino', '2', '1', '3', '1', '9'),
	('Joanna', 'Klimkowski', '1986/03/17', '38', '963340497', 'jklimkowski9l@flavors.me', '75531411', 'Casado', 'Femenino', '2', '2', '4', '1', '2'),
	('Curcio', 'Yerborn', '1989/05/05', '30', '935291517', 'cyerborn9m@homestead.com', '57550515', 'Casado', 'Masculino', '0', '1', '1', '1', '3'),
	('Evita', 'Challener', '1993/06/12', '28', '914131304', 'echallener9n@spotify.com', '64142804', 'Casado', 'Femenino', '2', '1', '2', '1', '7'),
	('Deck', 'Gut', '1995/01/08', '39', '947583911', 'dgut9o@surveymonkey.com', '71321223', 'Casado', 'Masculino', '2', '2', '4', '1', '9'),
	('Merwyn', 'Sedgemore', '1988/04/14', '25', '941635361', 'msedgemore9p@t.co', '13876431', 'Soltero', 'Masculino', '0', '1', '3', '1', '11'),
	('Ernst', 'Ollerenshaw', '1987/11/10', '35', '916162370', 'eollerenshaw9q@shutterfly.com', '30516250', 'Casado', 'Masculino', '2', '2', '1', '1', '14'),
	('Lief', 'Horche', '1981/12/15', '23', '923341258', 'lhorche9r@macromedia.com', '41192350', 'Casado', 'Masculino', '2', '2', '4', '1', '10'),
	('Roddie', 'McParland', '1987/10/04', '26', '978333276', 'rmcparland9s@nationalgeographic.com', '92611460', 'Casado', 'Masculino', '0', '1', '3', '1', '11'),
	('Bayard', 'McPhillimey', '1984/03/03', '37', '996295491', 'bmcphillimey9t@cargocollective.com', '63640509', 'Casado', 'Masculino', '1', '1', '2', '1', '11'),
	('Georgi', 'Dionisio', '1985/06/29', '24', '918074037', 'gdionisio9u@jigsy.com', '54755281', 'Soltero', 'Masculino', '1', '2', '1', '1', '9'),
	('Skyler', 'Sime', '1999/02/24', '35', '905128381', 'ssime9v@deliciousdays.com', '76208260', 'Soltero', 'Masculino', '1', '1', '4', '1', '15'),
	('Elizabeth', 'Dyshart', '1981/09/29', '33', '994167604', 'edyshart9w@ustream.tv', '57591295', 'Soltero', 'Femenino', '0', '1', '2', '1', '14'),
	('Rudy', 'Laister', '1984/04/08', '38', '909997251', 'rlaister9x@omniture.com', '97358030', 'Casado', 'Masculino', '1', '2', '4', '1', '1'),
	('Vivie', 'Pracy', '1986/03/22', '29', '999500191', 'vpracy9y@posterous.com', '67900271', 'Casado', 'Femenino', '0', '1', '2', '1', '15'),
	('Aldwin', 'Duffitt', '1986/10/08', '41', '958132226', 'aduffitt9z@nationalgeographic.com', '33175740', 'Soltero', 'Masculino', '2', '1', '2', '1', '4'),
	('Kiele', 'Burde', '1987/01/20', '25', '939223321', 'kburdea0@sakura.ne.jp', '20993224', 'Soltero', 'Femenino', '1', '2', '4', '1', '2'),
	('Kincaid', 'Sammons', '1991/04/11', '25', '922996732', 'ksammonsa1@nih.gov', '44692675', 'Soltero', 'Masculino', '2', '2', '3', '1', '7'),
	('Walden', 'Ruckhard', '1983/10/18', '42', '922604863', 'wruckharda2@deviantart.com', '91440147', 'Soltero', 'Masculino', '0', '2', '1', '1', '12'),
	('Vinny', 'McGahern', '1993/06/12', '36', '996081401', 'vmcgaherna3@opensource.org', '82241179', 'Casado', 'Femenino', '2', '2', '2', '1', '10'),
	('Enrico', 'Corthes', '1991/11/06', '33', '933318210', 'ecorthesa4@google.nl', '49453400', 'Casado', 'Masculino', '2', '1', '1', '1', '10'),
	('Case', 'Pfiffer', '1992/08/05', '31', '939941068', 'cpfiffera5@ibm.com', '72515753', 'Soltero', 'Masculino', '0', '1', '1', '1', '13'),
	('Fletch', 'Wilbor', '1984/09/10', '29', '993532368', 'fwilbora6@opera.com', '78875923', 'Soltero', 'Masculino', '2', '1', '4', '1', '6'),
	('Leonard', 'Serridge', '1990/12/11', '41', '928107573', 'lserridgea7@weebly.com', '52580214', 'Soltero', 'Masculino', '2', '1', '2', '1', '10'),
	('Auria', 'Cartmer', '1995/06/18', '27', '964442678', 'acartmera8@mozilla.com', '75619075', 'Soltero', 'Femenino', '2', '1', '3', '1', '13'),
	('Bernardo', 'Flanaghan', '1981/06/02', '39', '943894427', 'bflanaghana9@miitbeian.gov.cn', '46964182', 'Casado', 'Masculino', '1', '2', '3', '1', '11'),
	('Chrisy', 'Currell', '1988/08/17', '27', '937537141', 'ccurrellaa@businessinsider.com', '29446748', 'Soltero', 'Masculino', '1', '1', '3', '1', '6'),
	('Cindee', 'Mountney', '1996/02/05', '40', '913988188', 'cmountneyab@microsoft.com', '77006006', 'Casado', 'Femenino', '2', '1', '4', '1', '10'),
	('Jordon', 'Bambury', '1982/12/04', '43', '952482394', 'jbamburyac@amazon.com', '95799758', 'Casado', 'Masculino', '0', '1', '1', '1', '9'),
	('Axe', 'Hallawell', '1987/02/23', '41', '923599528', 'ahallawellad@merriam-webster.com', '45735194', 'Casado', 'Masculino', '1', '1', '3', '1', '7'),
	('Taddeo', 'Le Clercq', '1999/12/01', '42', '918012847', 'tleclercqae@va.gov', '40550175', 'Soltero', 'Masculino', '2', '2', '2', '1', '2'),
	('Chelsie', 'Colbrun', '1995/05/04', '42', '924920957', 'ccolbrunaf@accuweather.com', '51690500', 'Soltero', 'Femenino', '2', '1', '4', '1', '6'),
	('Katha', 'Haggis', '1988/12/26', '42', '940643904', 'khaggisag@deviantart.com', '32470989', 'Soltero', 'Femenino', '2', '1', '2', '1', '14'),
	('Immanuel', 'Campaigne', '2000/05/15', '41', '922988558', 'icampaigneah@msn.com', '51684577', 'Soltero', 'Masculino', '1', '1', '4', '1', '5'),
	('Brennan', 'Ballingal', '2000/09/24', '38', '953299905', 'bballingalai@jigsy.com', '78447911', 'Casado', 'Masculino', '0', '2', '1', '1', '13'),
	('Isador', 'Blaksland', '1982/08/02', '29', '978149101', 'iblakslandaj@scientificamerican.com', '53750417', 'Soltero', 'Masculino', '1', '1', '3', '1', '6'),
	('Murielle', 'Cherrett', '1998/11/25', '35', '912408770', 'mcherrettak@kickstarter.com', '10571786', 'Casado', 'Femenino', '0', '2', '4', '1', '9'),
	('Garvin', 'Danbi', '1984/06/08', '43', '905996473', 'gdanbial@noaa.gov', '21303523', 'Casado', 'Masculino', '1', '1', '3', '1', '8'),
	('Max', 'Buddington', '1993/05/10', '42', '932713171', 'mbuddingtonam@amazon.com', '70403032', 'Casado', 'Femenino', '2', '1', '4', '1', '4'),
	('Obadias', 'Silverwood', '1985/06/02', '37', '972553856', 'osilverwoodan@google.com.au', '67653807', 'Soltero', 'Masculino', '1', '2', '2', '1', '5'),
	('Cheslie', 'Kinforth', '1988/11/15', '29', '974582307', 'ckinforthao@biblegateway.com', '39055702', 'Soltero', 'Femenino', '2', '1', '1', '1', '2'),
	('Mata', 'Blount', '1981/09/12', '24', '990937595', 'mblountap@newyorker.com', '28774795', 'Soltero', 'Masculino', '2', '2', '1', '1', '13'),
	('Jard', 'Turbill', '1986/05/28', '36', '906846269', 'jturbillaq@unblog.fr', '57764970', 'Soltero', 'Masculino', '0', '2', '2', '1', '4'),
	('Sanford', 'Dumbrell', '1995/04/30', '36', '995591124', 'sdumbrellar@goo.gl', '42155127', 'Casado', 'Masculino', '0', '2', '4', '1', '5'),
	('Gerald', 'Junes', '1987/09/15', '43', '920340801', 'gjunesas@prlog.org', '68515689', 'Casado', 'Masculino', '0', '1', '2', '1', '10'),
	('Sonny', 'Du Hamel', '1996/10/22', '38', '950991383', 'sduhamelat@pagesperso-orange.fr', '18006181', 'Casado', 'Masculino', '2', '1', '1', '1', '6'),
	('Ashley', 'Stovine', '1986/01/06', '33', '902047000', 'astovineau@who.int', '81772050', 'Soltero', 'Masculino', '2', '2', '4', '1', '13'),
	('Abigail', 'Brickdale', '1994/01/02', '24', '919137191', 'abrickdaleav@toplist.cz', '24652127', 'Soltero', 'Femenino', '0', '2', '4', '1', '15'),
	('Christoforo', 'Caulder', '1985/09/30', '40', '959672800', 'ccaulderaw@ustream.tv', '88336471', 'Casado', 'Masculino', '1', '1', '1', '1', '13'),
	('Amandie', 'Kiffe', '2000/06/03', '39', '971728966', 'akiffeax@flickr.com', '35514870', 'Casado', 'Femenino', '1', '1', '2', '1', '15'),
	('Chaddy', 'McGreary', '1990/01/26', '27', '946564590', 'cmcgrearyay@discovery.com', '22456479', 'Casado', 'Masculino', '2', '2', '2', '1', '2'),
	('Matthew', 'Tarbin', '2000/01/21', '35', '993366164', 'mtarbinaz@meetup.com', '99106809', 'Soltero', 'Masculino', '1', '2', '2', '1', '2'),
	('Arnuad', 'Bonnier', '1983/12/08', '24', '988528422', 'abonnierb0@webs.com', '57558887', 'Casado', 'Masculino', '0', '2', '1', '1', '14'),
	('Blithe', 'Devine', '1993/10/09', '29', '950959244', 'bdevineb1@eventbrite.com', '95139971', 'Casado', 'Femenino', '2', '1', '4', '1', '15'),
	('Martyn', 'Chaudhry', '1983/09/27', '35', '936419320', 'mchaudhryb2@xing.com', '96147105', 'Soltero', 'Masculino', '1', '2', '4', '1', '13'),
	('Winonah', 'De Few', '1989/08/16', '26', '916169120', 'wdefewb3@ycombinator.com', '95588674', 'Casado', 'Femenino', '0', '1', '3', '1', '7'),
	('Ricoriki', 'Dewar', '1997/07/09', '38', '933315477', 'rdewarb4@netscape.com', '87706324', 'Soltero', 'Masculino', '1', '2', '2', '1', '3'),
	('Iolanthe', 'Di Bartolommeo', '2000/04/11', '37', '935219927', 'idibartolommeob5@washington.edu', '98694110', 'Soltero', 'Femenino', '1', '1', '3', '1', '3'),
	('Scarlet', 'Trimmell', '1991/12/16', '35', '978304164', 'strimmellb6@lycos.com', '17758166', 'Casado', 'Femenino', '1', '1', '3', '1', '14'),
	('Asa', 'OSherrin', '1996/01/09', '34', '998789644', 'aosherrinb7@nymag.com', '84112943', 'Soltero', 'Masculino', '0', '2', '4', '1', '12'),
	('Lynn', 'Hannam', '1993/11/12', '43', '937395497', 'lhannamb8@wired.com', '38539030', 'Casado', 'Femenino', '1', '1', '1', '1', '11'),
	('Waldon', 'McKie', '1986/04/30', '40', '996976409', 'wmckieb9@myspace.com', '35451142', 'Casado', 'Masculino', '2', '1', '2', '1', '3'),
	('Benoite', 'Fike', '1991/01/21', '32', '919640575', 'bfikeba@newsvine.com', '25345437', 'Casado', 'Femenino', '2', '2', '1', '1', '5'),
	('Betta', 'Greenstock', '1994/07/31', '25', '951473101', 'bgreenstockbb@gravatar.com', '46755294', 'Casado', 'Femenino', '1', '1', '2', '1', '1'),
	('Ronalda', 'Churchill', '1996/09/25', '35', '938235296', 'rchurchillbc@example.com', '31555614', 'Casado', 'Femenino', '1', '1', '1', '1', '9'),
	('Gearalt', 'Royce', '1987/09/23', '24', '990057621', 'groycebd@nbcnews.com', '99622595', 'Casado', 'Masculino', '1', '1', '3', '1', '11'),
	('Danni', 'Beuscher', '1985/01/16', '31', '985369872', 'dbeuscherbe@123-reg.co.uk', '61349249', 'Casado', 'Femenino', '2', '1', '4', '1', '11'),
	('Jesse', 'Reolfo', '1993/04/20', '35', '920329510', 'jreolfobf@e-recht24.de', '45414795', 'Casado', 'Masculino', '1', '2', '3', '1', '3'),
	('Osborne', 'Woodus', '1981/08/01', '34', '906951117', 'owoodusbg@csmonitor.com', '39168062', 'Casado', 'Masculino', '0', '1', '2', '1', '4'),
	('Roanne', 'McInteer', '1993/09/17', '42', '997916644', 'rmcinteerbh@stanford.edu', '86749735', 'Casado', 'Femenino', '2', '2', '3', '1', '9'),
	('Briggs', 'Seager', '1991/04/18', '43', '987866231', 'bseagerbi@utexas.edu', '84309779', 'Casado', 'Masculino', '2', '2', '1', '1', '13'),
	('Kore', 'Farlow', '1985/07/01', '28', '909298686', 'kfarlowbj@chronoengine.com', '21052682', 'Soltero', 'Femenino', '2', '1', '2', '1', '6'),
	('Kristyn', 'Marflitt', '1995/04/18', '41', '991306537', 'kmarflittbk@indiatimes.com', '55417147', 'Soltero', 'Femenino', '0', '2', '4', '1', '4'),
	('Becka', 'Spolton', '1981/05/13', '32', '995708186', 'bspoltonbl@free.fr', '16276437', 'Soltero', 'Femenino', '1', '2', '4', '1', '15'),
	('Debor', 'Georgel', '1983/09/17', '26', '998335984', 'dgeorgelbm@kickstarter.com', '73398466', 'Casado', 'Femenino', '0', '1', '1', '1', '3'),
	('Humfrey', 'Tickle', '1990/11/22', '24', '966937078', 'hticklebn@va.gov', '11854722', 'Soltero', 'Masculino', '0', '2', '1', '1', '1'),
	('Shae', 'Gulston', '1988/10/17', '28', '964653435', 'sgulstonbo@goodreads.com', '27348043', 'Casado', 'Masculino', '0', '1', '3', '1', '9'),
	('Pascale', 'Stennard', '1995/07/20', '32', '979276901', 'pstennardbp@ucoz.com', '23113101', 'Soltero', 'Masculino', '0', '2', '1', '1', '9'),
	('Marjie', 'Sparling', '1996/03/07', '36', '941738239', 'msparlingbq@patch.com', '32395694', 'Casado', 'Femenino', '1', '1', '4', '1', '8'),
	('Errol', 'Gatchell', '1981/03/26', '24', '964331188', 'egatchellbr@gizmodo.com', '35115107', 'Casado', 'Masculino', '2', '2', '2', '1', '14'),
	('Constancia', 'Youde', '1998/09/22', '36', '985556696', 'cyoudebs@princeton.edu', '62563182', 'Soltero', 'Femenino', '1', '1', '4', '1', '12'),
	('Alano', 'Crecy', '1996/06/16', '33', '902345829', 'acrecybt@google.ru', '22734635', 'Casado', 'Masculino', '2', '1', '2', '1', '4'),
	('Abbey', 'Hurche', '1984/09/09', '32', '906624983', 'ahurchebu@forbes.com', '69229587', 'Soltero', 'Masculino', '1', '1', '3', '1', '4'),
	('Loralyn', 'Wadelin', '2000/02/01', '40', '904580592', 'lwadelinbv@fc2.com', '57524373', 'Soltero', 'Femenino', '1', '1', '4', '1', '11'),
	('Rosamond', 'Martynka', '1993/06/23', '37', '975052184', 'rmartynkabw@plala.or.jp', '65122019', 'Soltero', 'Femenino', '1', '1', '4', '1', '10'),
	('Midge', 'Scrivener', '1985/11/14', '39', '956828004', 'mscrivenerbx@so-net.ne.jp', '24493651', 'Soltero', 'Femenino', '0', '1', '4', '1', '2'),
	('Othilie', 'Mollison', '1995/09/17', '25', '916471086', 'omollisonby@artisteer.com', '37455981', 'Soltero', 'Femenino', '1', '1', '1', '1', '15'),
	('Curtis', 'Buntin', '1986/04/21', '36', '911235737', 'cbuntinbz@mozilla.com', '86888089', 'Soltero', 'Masculino', '1', '1', '1', '1', '1'),
	('Angus', 'Ellsworthe', '1986/03/19', '27', '935021003', 'aellsworthec0@omniture.com', '71227492', 'Soltero', 'Masculino', '2', '1', '4', '1', '9'),
	('Elsy', 'Ugolini', '1991/09/09', '34', '953769765', 'eugolinic1@nytimes.com', '58864589', 'Casado', 'Femenino', '0', '2', '3', '1', '7'),
	('Vassili', 'Karppi', '1998/04/14', '39', '974729421', 'vkarppic2@soundcloud.com', '68116253', 'Casado', 'Masculino', '0', '2', '2', '1', '15'),
	('Vladamir', 'Nicolson', '2000/09/25', '38', '909919918', 'vnicolsonc3@wordpress.org', '42022495', 'Soltero', 'Masculino', '2', '1', '4', '1', '12'),
	('Peterus', 'Kupis', '1984/02/03', '32', '913483156', 'pkupisc4@vimeo.com', '56952000', 'Casado', 'Masculino', '2', '1', '2', '1', '5'),
	('Wittie', 'Lempel', '1985/06/20', '39', '917193127', 'wlempelc5@google.de', '75390926', 'Casado', 'Masculino', '2', '1', '1', '1', '4'),
	('Mano', 'Cockling', '1986/03/13', '37', '975550984', 'mcocklingc6@hibu.com', '14464721', 'Soltero', 'Masculino', '0', '1', '2', '1', '14'),
	('Robert', 'McAteer', '1993/07/19', '28', '938916779', 'rmcateerc7@plala.or.jp', '79801615', 'Casado', 'Masculino', '2', '2', '1', '1', '11'),
	('Valerye', 'Bolley', '1990/02/21', '25', '961107976', 'vbolleyc8@va.gov', '84987448', 'Soltero', 'Femenino', '2', '1', '2', '1', '2'),
	('Brice', 'Clutten', '1987/03/01', '36', '994305876', 'bcluttenc9@webnode.com', '84178817', 'Casado', 'Masculino', '1', '2', '1', '1', '10'),
	('Dukie', 'McMennum', '1999/05/23', '37', '974867901', 'dmcmennumca@e-recht24.de', '25015397', 'Soltero', 'Masculino', '2', '2', '1', '1', '14'),
	('Meggi', 'Siggee', '1999/10/21', '36', '974486263', 'msiggeecb@sogou.com', '60682158', 'Soltero', 'Femenino', '2', '2', '1', '1', '8'),
	('Miran', 'Spaldin', '1989/01/15', '30', '993753261', 'mspaldincc@microsoft.com', '84634527', 'Soltero', 'Femenino', '2', '1', '1', '1', '7'),
	('Marissa', 'Hookes', '1989/08/10', '43', '929495640', 'mhookescd@reference.com', '61107311', 'Soltero', 'Femenino', '0', '2', '4', '1', '13'),
	('Weider', 'Windeatt', '1986/02/14', '37', '986187675', 'wwindeattce@skyrock.com', '49922730', 'Casado', 'Masculino', '0', '2', '3', '1', '9'),
	('Siegfried', 'Bonafant', '1994/08/15', '29', '983131640', 'sbonafantcf@scribd.com', '84721966', 'Casado', 'Masculino', '2', '2', '2', '1', '11'),
	('Laurena', 'Jonuzi', '1989/08/18', '34', '983542314', 'ljonuzicg@opensource.org', '72711869', 'Casado', 'Femenino', '2', '2', '2', '1', '10'),
	('Nessie', 'Manilove', '1986/10/25', '33', '972088610', 'nmanilovech@cdbaby.com', '20400670', 'Casado', 'Femenino', '1', '1', '2', '1', '15'),
	('Darla', 'Chatainier', '1992/06/15', '32', '974481756', 'dchatainierci@census.gov', '21485341', 'Casado', 'Femenino', '1', '2', '3', '1', '4'),
	('Gracia', 'Willmer', '2000/07/30', '34', '998513415', 'gwillmercj@rakuten.co.jp', '74545321', 'Casado', 'Femenino', '0', '1', '1', '1', '4'),
	('Glad', 'Claringbold', '1983/02/28', '43', '973877168', 'gclaringboldck@google.de', '74896971', 'Soltero', 'Femenino', '0', '2', '2', '1', '12'),
	('Aeriela', 'Cunnington', '1993/06/13', '42', '946124380', 'acunningtoncl@live.com', '43825992', 'Soltero', 'Femenino', '2', '2', '2', '1', '6'),
	('Stacee', 'Mozzetti', '1994/01/30', '43', '937074176', 'smozzetticm@imgur.com', '14831687', 'Soltero', 'Masculino', '0', '1', '1', '1', '3'),
	('Charmion', 'Hughs', '1981/01/30', '36', '971241992', 'chughscn@blogger.com', '69047859', 'Casado', 'Femenino', '0', '1', '1', '1', '12'),
	('Thibaut', 'Maydwell', '1997/11/28', '28', '993344750', 'tmaydwellco@adobe.com', '25343819', 'Soltero', 'Masculino', '2', '1', '2', '1', '10'),
	('Corbie', 'Dobbing', '1982/11/21', '34', '969029943', 'cdobbingcp@ebay.co.uk', '33975667', 'Soltero', 'Masculino', '2', '1', '4', '1', '1'),
	('Elaine', 'Bedin', '1986/03/11', '35', '906805238', 'ebedincq@twitpic.com', '45383633', 'Casado', 'Femenino', '1', '2', '4', '1', '7'),
	('Alano', 'Gwyn', '1983/08/17', '38', '919259331', 'agwyncr@paypal.com', '64187919', 'Soltero', 'Masculino', '0', '2', '1', '1', '7'),
	('Pablo', 'Soaper', '1984/10/24', '24', '979785347', 'psoapercs@prnewswire.com', '16722030', 'Casado', 'Masculino', '2', '1', '1', '1', '7'),
	('Thatch', 'Dionsetto', '1982/09/17', '29', '983203951', 'tdionsettoct@mit.edu', '33750718', 'Casado', 'Masculino', '2', '2', '2', '1', '12'),
	('Fanya', 'Pude', '1997/11/28', '34', '994842834', 'fpudecu@mapy.cz', '90140509', 'Soltero', 'Femenino', '0', '1', '2', '1', '9'),
	('Stella', 'Saiens', '1995/02/20', '34', '947416237', 'ssaienscv@auda.org.au', '43438829', 'Casado', 'Femenino', '0', '2', '3', '1', '5'),
	('Doralia', 'Stevenson', '1987/10/07', '39', '915694327', 'dstevensoncw@ed.gov', '75697682', 'Soltero', 'Femenino', '0', '1', '2', '1', '14'),
	('Tawsha', 'Jacqueminot', '1990/08/02', '36', '933406637', 'tjacqueminotcx@imgur.com', '56797126', 'Casado', 'Femenino', '0', '1', '3', '1', '2'),
	('Angelita', 'Brookton', '2000/10/23', '42', '951007446', 'abrooktoncy@behance.net', '25007576', 'Soltero', 'Femenino', '0', '2', '2', '1', '3'),
	('Antons', 'Coping', '1990/06/07', '43', '905088614', 'acopingcz@51.la', '17905448', 'Soltero', 'Masculino', '2', '1', '3', '1', '9'),
	('Oriana', 'Emptage', '1988/06/19', '40', '989433387', 'oemptaged0@gnu.org', '16627066', 'Soltero', 'Femenino', '1', '1', '4', '1', '15'),
	('Fleur', 'Halvosen', '1992/11/13', '37', '914181582', 'fhalvosend1@meetup.com', '93971014', 'Casado', 'Femenino', '1', '2', '3', '1', '8'),
	('Giffie', 'Ellington', '1997/09/12', '38', '998417426', 'gellingtond2@patch.com', '91977306', 'Casado', 'Masculino', '0', '1', '2', '1', '13'),
	('Eldon', 'Moger', '1992/10/22', '36', '990205766', 'emogerd3@jalbum.net', '75495705', 'Soltero', 'Masculino', '1', '1', '1', '1', '4'),
	('Bibbie', 'Cornfoot', '1988/09/20', '32', '923820204', 'bcornfootd4@census.gov', '46810840', 'Casado', 'Femenino', '2', '2', '1', '1', '1'),
	('Abbott', 'MacKerley', '1997/05/28', '26', '932866337', 'amackerleyd5@webmd.com', '88840316', 'Soltero', 'Masculino', '1', '2', '3', '1', '15'),
	('Bard', 'Margery', '1999/09/22', '42', '938735736', 'bmargeryd6@telegraph.co.uk', '21629228', 'Soltero', 'Masculino', '2', '1', '2', '1', '15'),
	('Cloe', 'Kloster', '1981/02/09', '30', '952201356', 'cklosterd7@reuters.com', '61872160', 'Casado', 'Femenino', '0', '1', '3', '1', '6'),
	('Ignacius', 'Scoone', '1990/06/13', '33', '991908570', 'iscooned8@nih.gov', '94366745', 'Casado', 'Masculino', '0', '2', '4', '1', '6'),
	('Zorah', 'Arendsen', '1990/05/21', '23', '966253020', 'zarendsend9@wired.com', '28538825', 'Casado', 'Femenino', '2', '2', '3', '1', '3'),
	('Aland', 'Kullmann', '1998/10/24', '41', '979339841', 'akullmannda@163.com', '96128590', 'Soltero', 'Masculino', '1', '1', '2', '1', '9'),
	('Joy', 'Grainger', '1999/04/25', '23', '970278364', 'jgraingerdb@youtu.be', '45977311', 'Casado', 'Femenino', '1', '1', '1', '1', '11'),
	('Bevon', 'Jeffs', '1985/11/30', '39', '966427893', 'bjeffsdc@jiathis.com', '41416612', 'Casado', 'Masculino', '0', '2', '3', '1', '4'),
	('Winny', 'Goldsworthy', '1985/07/30', '33', '912555656', 'wgoldsworthydd@quantcast.com', '55986622', 'Casado', 'Femenino', '2', '1', '2', '1', '1'),
	('Deb', 'Bunten', '1988/06/18', '29', '988040567', 'dbuntende@reverbnation.com', '26744466', 'Soltero', 'Femenino', '2', '1', '4', '1', '13'),
	('Zolly', 'Hamstead', '1992/11/12', '29', '977773956', 'zhamsteaddf@ed.gov', '36880399', 'Soltero', 'Masculino', '1', '2', '3', '1', '10'),
	('Milka', 'McNally', '1994/02/05', '29', '916079665', 'mmcnallydg@sciencedaily.com', '82914086', 'Soltero', 'Femenino', '2', '2', '2', '1', '14'),
	('Krishna', 'Mcasparan', '1984/12/30', '28', '916475318', 'kmcasparandh@furl.net', '86277934', 'Casado', 'Masculino', '0', '1', '1', '1', '8'),
	('Stanton', 'Douris', '1981/05/28', '25', '962411738', 'sdourisdi@icio.us', '92779809', 'Casado', 'Masculino', '1', '1', '4', '1', '12'),
	('Kelci', 'Iglesiaz', '1987/06/04', '31', '903280184', 'kiglesiazdj@sakura.ne.jp', '21190019', 'Soltero', 'Femenino', '0', '1', '3', '1', '7'),
	('Emmey', 'Livesay', '1989/06/18', '41', '968772996', 'elivesaydk@marriott.com', '36556910', 'Casado', 'Femenino', '2', '1', '3', '1', '11'),
	('Ebonee', 'Finlason', '1990/09/29', '36', '904564411', 'efinlasondl@washingtonpost.com', '93130093', 'Soltero', 'Femenino', '0', '2', '2', '1', '15'),
	('Otho', 'Whiteoak', '1988/01/02', '37', '912166206', 'owhiteoakdm@cafepress.com', '85456156', 'Casado', 'Masculino', '0', '1', '1', '1', '1'),
	('Christie', 'ODay', '1983/02/04', '34', '929822284', 'codaydn@fema.gov', '94690249', 'Soltero', 'Femenino', '1', '1', '4', '1', '4'),
	('Antony', 'Eatherton', '1994/08/31', '39', '931997053', 'aeathertondo@google.nl', '25148899', 'Soltero', 'Masculino', '2', '2', '1', '1', '14'),
	('Tiphanie', 'Tomaini', '1992/04/10', '41', '904135946', 'ttomainidp@reuters.com', '31749715', 'Casado', 'Femenino', '2', '1', '4', '1', '4'),
	('Hal', 'Tryme', '1989/03/02', '24', '929503932', 'htrymedq@samsung.com', '63835585', 'Casado', 'Masculino', '2', '1', '1', '1', '10'),
	('Rollin', 'Kunc', '1996/07/08', '24', '950558431', 'rkuncdr@wisc.edu', '72812600', 'Soltero', 'Masculino', '2', '2', '3', '1', '14'),
	('Zebedee', 'Crowson', '1983/11/24', '41', '947016140', 'zcrowsonds@blogtalkradio.com', '21699960', 'Casado', 'Masculino', '2', '2', '4', '1', '8'),
	('Duff', 'Chinnock', '1996/12/13', '23', '901297911', 'dchinnockdt@spiegel.de', '25047105', 'Soltero', 'Masculino', '0', '1', '3', '1', '3'),
	('Aubree', 'Keene', '1991/10/09', '40', '960517759', 'akeenedu@issuu.com', '61680265', 'Soltero', 'Femenino', '1', '1', '2', '1', '11'),
	('Lucho', 'St Leger', '1983/08/06', '32', '932231039', 'lstlegerdv@list-manage.com', '34733815', 'Casado', 'Masculino', '1', '1', '2', '1', '10');
```

```
INSERT INTO contrato ("fecha_firma_contrato", "fecha_inicio_laboral", "fecha_termino_contrato", "sueldo_base", "liquido_teorico", "id_area", "id_cargo", "id_empleado", "id_estado_contrato", "id_tipo_contrato", "id_tipo_jornada", "id_frecuencia_pago", "id_medio_pago") VALUES
	('2019-12-31', '2022-11-08', '2022-10-19', '3000', '3000', '9', '6', '16', '1', '1', '2', '1', '2'),
	('2020-10-04', '2023-01-26', '2022-08-16', '6000', '6000', '2', '9', '17', '1', '1', '1', '2', '3'),
	('2020-03-26', '2023-05-15', '2023-11-21', '3000', '3000', '5', '5', '18', '1', '2', '1', '2', '3'),
	('2020-01-25', '2023-04-02', '2023-07-09', '5000', '5000', '9', '3', '19', '1', '2', '2', '2', '2'),
	('2020-04-02', '2022-11-16', '2023-05-11', '2000', '2000', '8', '14', '20', '1', '1', '3', '2', '3'),
	('2020-05-11', '2022-12-13', '2023-05-06', '5000', '5000', '14', '6', '21', '1', '2', '2', '2', '3'),
	('2020-04-10', '2022-12-12', '2022-12-18', '5000', '5000', '5', '9', '22', '1', '2', '3', '1', '1'),
	('2020-09-15', '2022-12-19', '2023-11-25', '6000', '6000', '10', '7', '23', '1', '1', '1', '2', '1'),
	('2020-06-04', '2023-02-08', '2022-09-30', '4000', '4000', '10', '13', '24', '1', '2', '2', '1', '2'),
	('2020-04-25', '2023-01-26', '2023-07-02', '1000', '1000', '3', '7', '25', '1', '2', '2', '2', '1'),
	('2019-12-14', '2022-11-14', '2023-01-14', '1000', '1000', '9', '6', '26', '1', '3', '1', '2', '1'),
	('2020-02-01', '2022-12-03', '2022-08-10', '1000', '1000', '4', '7', '27', '1', '2', '3', '2', '2'),
	('2020-02-29', '2023-02-23', '2023-06-10', '4000', '4000', '7', '4', '28', '1', '3', '3', '2', '3'),
	('2020-09-21', '2022-11-21', '2023-01-18', '5000', '5000', '13', '14', '29', '1', '2', '1', '2', '2'),
	('2020-10-15', '2023-06-01', '2023-04-21', '4000', '4000', '1', '1', '30', '1', '3', '3', '2', '1'),
	('2020-02-18', '2023-05-04', '2022-10-05', '3000', '3000', '5', '15', '31', '1', '2', '1', '2', '2'),
	('2020-11-12', '2023-01-27', '2023-01-03', '5000', '5000', '7', '4', '32', '1', '1', '1', '2', '3'),
	('2020-04-05', '2023-05-18', '2022-12-28', '6000', '6000', '9', '7', '33', '1', '2', '1', '2', '2'),
	('2020-07-01', '2022-12-17', '2023-06-10', '3000', '3000', '11', '8', '34', '1', '2', '2', '1', '1'),
	('2019-12-01', '2022-10-28', '2023-11-09', '2000', '2000', '3', '12', '35', '1', '2', '3', '2', '1'),
	('2020-10-30', '2023-04-22', '2023-01-15', '4000', '4000', '14', '9', '36', '1', '1', '2', '2', '1'),
	('2020-08-18', '2023-05-04', '2022-11-27', '5000', '5000', '9', '7', '37', '1', '2', '3', '2', '2'),
	('2020-05-28', '2022-12-20', '2022-11-05', '3000', '3000', '12', '2', '38', '1', '2', '2', '2', '2'),
	('2020-04-30', '2022-10-19', '2023-02-15', '3000', '3000', '10', '12', '39', '1', '1', '3', '1', '2'),
	('2020-03-12', '2022-12-29', '2022-10-21', '5000', '5000', '14', '7', '40', '1', '1', '2', '1', '2'),
	('2020-02-15', '2022-10-28', '2023-09-03', '2000', '2000', '11', '9', '41', '1', '3', '2', '1', '2'),
	('2020-09-19', '2022-10-29', '2023-03-24', '3000', '3000', '3', '15', '42', '1', '1', '1', '2', '2'),
	('2020-04-13', '2022-11-16', '2023-03-08', '2000', '2000', '4', '14', '43', '1', '3', '3', '1', '1'),
	('2020-05-28', '2023-01-21', '2023-03-27', '6000', '6000', '13', '9', '44', '1', '1', '2', '1', '2'),
	('2020-02-29', '2022-10-12', '2023-10-08', '6000', '6000', '11', '2', '45', '1', '3', '1', '2', '1'),
	('2020-06-13', '2022-10-23', '2023-02-08', '6000', '6000', '11', '8', '46', '1', '3', '3', '2', '3'),
	('2020-05-10', '2022-12-20', '2023-03-31', '3000', '3000', '15', '1', '47', '1', '3', '2', '1', '1'),
	('2020-04-28', '2023-04-22', '2023-12-05', '3000', '3000', '4', '9', '48', '1', '2', '1', '1', '3'),
	('2020-02-17', '2023-01-26', '2023-07-03', '1000', '1000', '14', '1', '49', '1', '1', '1', '2', '2'),
	('2020-10-03', '2023-06-01', '2023-11-11', '6000', '6000', '2', '6', '50', '1', '2', '3', '1', '3'),
	('2020-10-10', '2022-12-16', '2023-06-21', '1000', '1000', '1', '6', '51', '1', '2', '3', '2', '3'),
	('2020-01-13', '2023-01-08', '2023-12-09', '6000', '6000', '1', '10', '52', '1', '2', '1', '1', '1'),
	('2020-04-25', '2022-11-08', '2022-09-02', '6000', '6000', '9', '7', '53', '1', '1', '3', '1', '2'),
	('2020-07-08', '2023-02-11', '2022-11-07', '1000', '1000', '2', '4', '54', '1', '1', '3', '2', '2'),
	('2019-12-12', '2023-06-05', '2022-11-13', '4000', '4000', '4', '14', '55', '1', '3', '2', '2', '2'),
	('2020-09-10', '2023-02-23', '2023-07-29', '5000', '5000', '12', '5', '56', '1', '3', '3', '2', '3'),
	('2020-07-28', '2023-06-05', '2023-07-17', '6000', '6000', '9', '2', '57', '1', '3', '3', '1', '3'),
	('2020-11-08', '2023-01-11', '2022-11-13', '6000', '6000', '15', '6', '58', '1', '2', '2', '1', '3'),
	('2020-10-14', '2023-04-02', '2023-06-05', '5000', '5000', '15', '12', '59', '1', '3', '2', '1', '1'),
	('2020-04-29', '2023-02-11', '2024-01-01', '5000', '5000', '4', '14', '60', '1', '3', '1', '2', '3'),
	('2019-12-18', '2022-10-23', '2023-08-28', '4000', '4000', '6', '6', '61', '1', '1', '3', '1', '1'),
	('2020-11-27', '2023-03-03', '2023-04-01', '2000', '2000', '3', '9', '62', '1', '3', '3', '2', '1'),
	('2020-07-01', '2023-02-11', '2023-08-13', '3000', '3000', '6', '11', '63', '1', '1', '2', '2', '2'),
	('2020-10-09', '2022-10-22', '2023-03-01', '5000', '5000', '8', '6', '64', '1', '3', '3', '1', '2'),
	('2020-09-08', '2022-12-31', '2023-08-06', '5000', '5000', '2', '10', '65', '1', '2', '1', '1', '1'),
	('2020-10-19', '2023-02-17', '2023-02-08', '3000', '3000', '12', '14', '66', '1', '3', '3', '2', '2'),
	('2020-07-21', '2023-02-04', '2022-12-13', '4000', '4000', '12', '4', '67', '1', '1', '1', '1', '1'),
	('2020-07-11', '2022-10-11', '2022-12-24', '5000', '5000', '13', '8', '68', '1', '3', '1', '1', '2'),
	('2020-05-07', '2023-01-13', '2023-12-10', '1000', '1000', '3', '8', '69', '1', '3', '2', '2', '3'),
	('2020-11-17', '2023-01-13', '2023-04-16', '4000', '4000', '3', '1', '70', '1', '3', '3', '2', '1'),
	('2020-09-18', '2023-04-01', '2023-06-04', '6000', '6000', '8', '1', '71', '1', '3', '3', '2', '3'),
	('2020-09-04', '2023-01-08', '2023-12-30', '4000', '4000', '3', '15', '72', '1', '1', '3', '2', '3'),
	('2020-10-05', '2023-05-20', '2023-05-01', '6000', '6000', '10', '10', '73', '1', '2', '1', '2', '3'),
	('2020-04-06', '2023-03-16', '2022-07-23', '1000', '1000', '5', '8', '74', '1', '2', '3', '2', '3'),
	('2020-10-22', '2023-01-26', '2023-12-31', '1000', '1000', '11', '8', '75', '1', '3', '1', '1', '3'),
	('2020-01-23', '2022-10-14', '2023-01-18', '4000', '4000', '6', '3', '76', '1', '2', '2', '2', '3'),
	('2020-09-10', '2023-03-20', '2023-10-05', '1000', '1000', '15', '14', '77', '1', '2', '3', '1', '2'),
	('2020-08-26', '2023-06-05', '2023-02-01', '6000', '6000', '9', '3', '78', '1', '3', '2', '2', '3'),
	('2020-05-28', '2023-04-02', '2022-09-23', '3000', '3000', '5', '8', '79', '1', '1', '2', '2', '1'),
	('2020-01-08', '2022-10-16', '2022-09-13', '5000', '5000', '3', '8', '80', '1', '2', '3', '2', '2'),
	('2020-03-31', '2022-11-13', '2022-09-02', '1000', '1000', '10', '5', '81', '1', '1', '2', '2', '2'),
	('2020-08-03', '2023-06-05', '2022-07-16', '4000', '4000', '3', '6', '82', '1', '2', '1', '2', '2'),
	('2020-10-03', '2023-05-22', '2023-06-23', '1000', '1000', '12', '14', '83', '1', '3', '2', '2', '1'),
	('2020-04-07', '2023-05-19', '2022-08-05', '5000', '5000', '11', '3', '84', '1', '3', '3', '1', '1'),
	('2020-08-16', '2023-03-11', '2023-08-07', '2000', '2000', '11', '11', '85', '1', '3', '2', '1', '2'),
	('2020-04-16', '2023-06-04', '2022-10-14', '1000', '1000', '7', '12', '86', '1', '2', '2', '2', '1'),
	('2020-02-26', '2023-03-07', '2023-04-10', '2000', '2000', '8', '15', '87', '1', '1', '1', '2', '2'),
	('2020-01-07', '2023-03-15', '2023-04-27', '1000', '1000', '3', '7', '88', '1', '2', '3', '2', '1'),
	('2020-09-22', '2022-12-11', '2023-12-06', '1000', '1000', '6', '4', '89', '1', '1', '2', '1', '2'),
	('2020-07-11', '2023-02-17', '2022-11-08', '5000', '5000', '13', '4', '90', '1', '2', '2', '1', '1'),
	('2020-05-27', '2023-05-25', '2022-07-28', '4000', '4000', '10', '7', '91', '1', '2', '2', '1', '3'),
	('2020-09-12', '2023-04-16', '2023-04-20', '2000', '2000', '5', '8', '92', '1', '1', '1', '1', '3'),
	('2020-11-13', '2023-03-14', '2023-07-08', '1000', '1000', '10', '14', '93', '1', '2', '3', '2', '3'),
	('2020-05-09', '2023-02-26', '2022-12-16', '3000', '3000', '1', '15', '94', '1', '1', '1', '1', '3'),
	('2020-01-28', '2023-04-10', '2023-12-21', '4000', '4000', '11', '12', '95', '1', '2', '3', '2', '3'),
	('2020-03-23', '2023-01-15', '2023-07-01', '3000', '3000', '4', '13', '96', '1', '1', '3', '2', '2'),
	('2020-06-23', '2023-01-05', '2022-07-13', '5000', '5000', '6', '6', '97', '1', '1', '2', '2', '2'),
	('2020-11-15', '2022-11-10', '2023-04-25', '2000', '2000', '12', '5', '98', '1', '3', '2', '1', '3'),
	('2020-01-04', '2023-05-31', '2023-09-16', '3000', '3000', '2', '14', '99', '1', '1', '2', '2', '2'),
	('2020-01-26', '2022-11-25', '2023-03-15', '4000', '4000', '4', '8', '100', '1', '2', '2', '2', '2'),
	('2020-03-29', '2023-03-04', '2022-11-26', '1000', '1000', '4', '15', '101', '1', '2', '1', '1', '2'),
	('2019-12-25', '2023-01-22', '2023-10-21', '3000', '3000', '13', '6', '102', '1', '3', '2', '1', '3'),
	('2019-12-28', '2023-03-20', '2023-12-30', '2000', '2000', '10', '10', '103', '1', '1', '3', '2', '1'),
	('2020-08-05', '2023-03-01', '2023-05-30', '3000', '3000', '1', '5', '104', '1', '2', '2', '1', '1'),
	('2020-06-09', '2023-04-26', '2022-07-19', '2000', '2000', '6', '7', '105', '1', '3', '3', '2', '1'),
	('2020-04-07', '2023-05-31', '2023-03-10', '5000', '5000', '7', '7', '106', '1', '2', '3', '2', '2'),
	('2020-05-09', '2023-03-13', '2023-11-19', '2000', '2000', '12', '8', '107', '1', '2', '1', '2', '2'),
	('2020-05-11', '2023-03-02', '2022-10-09', '3000', '3000', '12', '5', '108', '1', '2', '2', '2', '1'),
	('2020-08-03', '2023-01-24', '2023-06-26', '5000', '5000', '9', '11', '109', '1', '1', '1', '2', '2'),
	('2020-03-14', '2023-04-18', '2022-08-19', '5000', '5000', '2', '9', '110', '1', '3', '1', '2', '3'),
	('2020-09-30', '2023-03-20', '2023-07-13', '4000', '4000', '8', '1', '111', '1', '2', '2', '2', '3'),
	('2020-03-31', '2023-03-09', '2023-11-17', '4000', '4000', '13', '2', '112', '1', '3', '3', '2', '3'),
	('2019-12-13', '2022-11-28', '2023-05-02', '3000', '3000', '10', '5', '113', '1', '1', '3', '1', '2'),
	('2020-07-27', '2023-01-17', '2023-08-15', '4000', '4000', '4', '7', '114', '1', '2', '3', '1', '3'),
	('2020-07-08', '2023-05-08', '2023-10-08', '6000', '6000', '6', '1', '115', '1', '2', '2', '2', '2'),
	('2020-01-08', '2023-05-26', '2023-07-12', '3000', '3000', '11', '4', '116', '1', '2', '1', '1', '1'),
	('2020-09-18', '2022-12-21', '2023-10-06', '4000', '4000', '7', '14', '117', '1', '1', '3', '1', '3'),
	('2020-05-03', '2023-04-18', '2023-07-22', '6000', '6000', '10', '13', '118', '1', '1', '2', '2', '3'),
	('2020-03-01', '2023-02-17', '2022-10-17', '5000', '5000', '10', '12', '119', '1', '3', '1', '2', '1'),
	('2020-01-28', '2023-01-23', '2022-11-20', '2000', '2000', '15', '14', '120', '1', '3', '2', '1', '2'),
	('2019-11-30', '2023-01-06', '2022-10-11', '4000', '4000', '13', '5', '121', '1', '1', '2', '2', '3'),
	('2019-12-10', '2022-12-25', '2023-04-02', '4000', '4000', '13', '11', '122', '1', '1', '2', '2', '1'),
	('2020-08-11', '2022-10-13', '2022-08-16', '6000', '6000', '15', '11', '123', '1', '2', '3', '2', '1'),
	('2020-05-01', '2022-11-03', '2023-10-08', '4000', '4000', '3', '14', '124', '1', '1', '1', '1', '1'),
	('2020-04-26', '2022-12-12', '2022-08-09', '3000', '3000', '11', '4', '125', '1', '2', '2', '1', '3'),
	('2020-09-08', '2023-01-25', '2022-12-12', '5000', '5000', '4', '5', '126', '1', '2', '2', '2', '2'),
	('2020-04-14', '2022-11-16', '2022-11-20', '1000', '1000', '10', '6', '127', '1', '3', '1', '2', '3'),
	('2020-08-05', '2023-02-03', '2023-11-11', '6000', '6000', '8', '8', '128', '1', '3', '3', '1', '2'),
	('2020-02-21', '2023-05-09', '2023-02-22', '6000', '6000', '7', '2', '129', '1', '2', '3', '1', '1'),
	('2020-11-14', '2023-04-27', '2023-09-08', '2000', '2000', '14', '5', '130', '1', '2', '3', '1', '1'),
	('2020-10-16', '2022-11-01', '2023-04-25', '2000', '2000', '3', '11', '131', '1', '3', '3', '1', '3'),
	('2020-05-06', '2022-11-10', '2022-12-05', '1000', '1000', '5', '6', '132', '1', '2', '3', '2', '1'),
	('2020-05-05', '2022-10-11', '2022-11-04', '4000', '4000', '6', '5', '133', '1', '2', '3', '1', '2'),
	('2020-11-26', '2022-12-06', '2023-06-22', '3000', '3000', '8', '10', '134', '1', '3', '1', '2', '3'),
	('2019-12-19', '2023-01-30', '2023-07-30', '3000', '3000', '8', '8', '135', '1', '1', '1', '1', '3'),
	('2020-09-05', '2023-03-07', '2023-08-02', '5000', '5000', '11', '7', '136', '1', '2', '3', '1', '2'),
	('2020-07-19', '2023-01-31', '2023-04-22', '1000', '1000', '14', '13', '137', '1', '2', '3', '1', '3'),
	('2020-05-12', '2022-12-04', '2022-08-14', '3000', '3000', '3', '2', '138', '1', '1', '1', '1', '1'),
	('2020-04-07', '2023-05-07', '2023-03-02', '4000', '4000', '4', '9', '139', '1', '1', '3', '2', '3'),
	('2020-09-30', '2023-02-16', '2023-09-23', '3000', '3000', '6', '9', '140', '1', '1', '3', '1', '1'),
	('2020-07-25', '2023-02-13', '2022-10-22', '1000', '1000', '2', '5', '141', '1', '2', '2', '2', '2'),
	('2020-07-17', '2022-11-09', '2023-10-10', '2000', '2000', '12', '15', '142', '1', '2', '3', '1', '3'),
	('2020-08-08', '2022-10-11', '2023-04-06', '2000', '2000', '5', '6', '143', '1', '1', '3', '1', '1'),
	('2020-09-20', '2022-11-12', '2022-08-23', '5000', '5000', '7', '3', '144', '1', '3', '3', '1', '1'),
	('2020-03-24', '2023-05-26', '2023-11-02', '5000', '5000', '12', '11', '145', '1', '2', '1', '1', '2'),
	('2020-09-19', '2023-04-22', '2022-10-29', '1000', '1000', '4', '8', '146', '1', '1', '1', '2', '3'),
	('2020-08-25', '2022-12-05', '2022-07-21', '2000', '2000', '2', '11', '147', '1', '3', '1', '2', '3'),
	('2020-03-13', '2023-05-07', '2023-12-29', '2000', '2000', '1', '10', '148', '1', '2', '3', '2', '2'),
	('2020-01-09', '2022-12-24', '2023-01-22', '3000', '3000', '11', '14', '149', '1', '1', '1', '1', '3'),
	('2020-09-10', '2023-03-06', '2023-02-28', '3000', '3000', '6', '1', '150', '1', '2', '1', '2', '1'),
	('2020-05-10', '2023-03-16', '2022-09-24', '1000', '1000', '6', '9', '151', '1', '2', '2', '2', '3'),
	('2020-02-03', '2022-10-22', '2022-09-06', '4000', '4000', '14', '15', '152', '1', '3', '1', '1', '3'),
	('2020-09-25', '2022-11-20', '2022-12-06', '4000', '4000', '12', '14', '153', '1', '2', '3', '2', '2'),
	('2020-03-05', '2023-05-11', '2023-11-21', '2000', '2000', '10', '4', '154', '1', '1', '2', '2', '1'),
	('2020-09-29', '2023-04-21', '2023-05-10', '2000', '2000', '5', '15', '155', '1', '1', '2', '1', '3'),
	('2020-01-13', '2022-11-15', '2022-07-23', '3000', '3000', '5', '2', '156', '1', '2', '1', '1', '3'),
	('2020-05-16', '2023-05-16', '2023-10-21', '4000', '4000', '14', '8', '157', '1', '1', '1', '1', '2'),
	('2020-08-02', '2023-01-04', '2023-08-27', '5000', '5000', '5', '1', '158', '1', '1', '2', '1', '1'),
	('2020-03-03', '2022-11-14', '2023-11-25', '2000', '2000', '9', '7', '159', '1', '2', '3', '1', '1'),
	('2020-10-24', '2022-12-06', '2022-08-07', '1000', '1000', '2', '13', '160', '1', '1', '1', '1', '3'),
	('2020-05-26', '2022-11-28', '2022-12-17', '6000', '6000', '7', '11', '161', '1', '2', '2', '1', '2'),
	('2020-08-06', '2023-05-25', '2023-02-06', '4000', '4000', '7', '8', '162', '1', '2', '1', '1', '3'),
	('2020-04-05', '2023-03-02', '2023-06-09', '3000', '3000', '14', '6', '163', '1', '2', '3', '2', '3'),
	('2020-05-06', '2023-01-04', '2023-08-03', '6000', '6000', '2', '8', '164', '1', '3', '3', '2', '1'),
	('2020-08-12', '2022-11-05', '2022-08-27', '4000', '4000', '2', '15', '165', '1', '1', '2', '1', '2'),
	('2020-06-06', '2023-03-19', '2023-09-24', '1000', '1000', '10', '4', '166', '1', '1', '2', '2', '2'),
	('2019-12-10', '2022-12-21', '2023-11-29', '5000', '5000', '2', '6', '167', '1', '1', '1', '2', '2'),
	('2020-08-07', '2022-11-02', '2023-10-18', '1000', '1000', '2', '10', '168', '1', '1', '2', '1', '3'),
	('2020-06-19', '2022-11-13', '2022-08-26', '4000', '4000', '3', '10', '169', '1', '3', '3', '2', '3'),
	('2020-06-16', '2023-04-17', '2022-08-21', '4000', '4000', '10', '2', '170', '1', '2', '3', '1', '1'),
	('2020-01-25', '2023-05-22', '2023-09-10', '3000', '3000', '10', '2', '171', '1', '1', '1', '1', '3'),
	('2020-08-26', '2023-04-11', '2023-10-18', '6000', '6000', '5', '5', '172', '1', '3', '3', '2', '2'),
	('2020-08-20', '2022-11-19', '2023-12-05', '2000', '2000', '8', '6', '173', '1', '2', '1', '1', '1'),
	('2020-10-28', '2023-05-16', '2023-10-18', '1000', '1000', '15', '7', '174', '1', '3', '1', '2', '1'),
	('2020-02-03', '2022-12-28', '2023-06-05', '6000', '6000', '2', '9', '175', '1', '3', '2', '2', '1'),
	('2020-08-02', '2023-06-02', '2023-05-05', '4000', '4000', '3', '11', '176', '1', '1', '3', '1', '3'),
	('2020-09-10', '2022-12-17', '2023-09-03', '3000', '3000', '2', '10', '177', '1', '1', '3', '1', '2'),
	('2020-01-11', '2023-03-22', '2023-09-24', '3000', '3000', '4', '5', '178', '1', '2', '3', '2', '3'),
	('2020-05-24', '2023-01-21', '2023-12-30', '6000', '6000', '15', '12', '179', '1', '3', '1', '2', '2'),
	('2020-11-04', '2022-10-18', '2023-12-31', '1000', '1000', '1', '14', '180', '1', '3', '3', '2', '3'),
	('2020-09-16', '2022-10-25', '2022-07-26', '4000', '4000', '12', '1', '181', '1', '3', '2', '2', '3'),
	('2020-03-27', '2023-05-17', '2023-09-20', '6000', '6000', '5', '12', '182', '1', '2', '3', '2', '3'),
	('2020-06-07', '2022-12-22', '2023-08-29', '1000', '1000', '7', '14', '183', '1', '2', '1', '1', '3'),
	('2020-08-04', '2022-12-30', '2023-09-18', '2000', '2000', '3', '5', '184', '1', '1', '1', '2', '2'),
	('2020-07-23', '2023-02-27', '2022-09-19', '6000', '6000', '13', '3', '185', '1', '2', '3', '2', '1'),
	('2020-03-22', '2023-04-08', '2023-11-29', '4000', '4000', '15', '7', '186', '1', '1', '1', '2', '1'),
	('2020-02-18', '2023-01-02', '2024-01-01', '6000', '6000', '13', '10', '187', '1', '2', '1', '2', '1'),
	('2020-04-12', '2023-02-03', '2023-12-18', '3000', '3000', '6', '7', '188', '1', '3', '1', '1', '3'),
	('2020-09-26', '2022-11-15', '2023-09-28', '6000', '6000', '7', '3', '189', '1', '3', '3', '1', '3'),
	('2020-02-29', '2023-01-25', '2023-04-24', '5000', '5000', '7', '6', '190', '1', '3', '3', '2', '2'),
	('2020-03-22', '2023-03-02', '2022-09-14', '6000', '6000', '15', '8', '191', '1', '1', '1', '2', '2'),
	('2020-02-27', '2023-01-03', '2023-07-15', '1000', '1000', '8', '15', '192', '1', '1', '3', '1', '1'),
	('2020-10-04', '2022-12-31', '2023-01-02', '6000', '6000', '13', '11', '193', '1', '1', '3', '1', '3'),
	('2020-06-06', '2022-11-24', '2023-05-02', '4000', '4000', '8', '10', '194', '1', '2', '3', '1', '3'),
	('2020-03-23', '2023-06-02', '2023-01-10', '6000', '6000', '11', '13', '195', '1', '1', '1', '1', '2'),
	('2020-07-08', '2022-10-15', '2023-07-04', '6000', '6000', '9', '11', '196', '1', '2', '2', '1', '3'),
	('2019-12-27', '2022-11-30', '2023-06-09', '6000', '6000', '9', '7', '197', '1', '3', '1', '1', '3'),
	('2020-06-05', '2023-05-26', '2023-06-26', '5000', '5000', '15', '6', '198', '1', '3', '1', '1', '3'),
	('2020-01-29', '2023-02-15', '2022-07-17', '2000', '2000', '15', '4', '199', '1', '3', '1', '1', '2'),
	('2020-02-03', '2023-01-20', '2023-08-21', '1000', '1000', '7', '8', '200', '1', '3', '2', '2', '1'),
	('2020-09-04', '2022-11-05', '2023-01-09', '5000', '5000', '9', '2', '201', '1', '2', '2', '2', '2'),
	('2020-05-22', '2022-11-28', '2023-01-09', '3000', '3000', '7', '3', '202', '1', '1', '1', '1', '3'),
	('2020-10-23', '2023-02-15', '2022-11-23', '2000', '2000', '15', '5', '203', '1', '3', '1', '2', '1'),
	('2020-03-31', '2023-01-22', '2023-10-05', '2000', '2000', '8', '9', '204', '1', '2', '2', '1', '2'),
	('2019-12-02', '2023-04-26', '2023-11-09', '3000', '3000', '4', '6', '205', '1', '3', '3', '1', '2'),
	('2020-01-26', '2022-11-11', '2022-12-06', '2000', '2000', '12', '10', '206', '1', '2', '1', '1', '3'),
	('2020-11-09', '2023-03-31', '2023-10-26', '5000', '5000', '3', '2', '207', '1', '1', '3', '1', '1'),
	('2020-07-17', '2022-11-17', '2023-04-23', '1000', '1000', '15', '13', '208', '1', '2', '2', '1', '2'),
	('2020-01-01', '2023-04-10', '2022-11-09', '4000', '4000', '15', '11', '209', '1', '2', '3', '2', '1'),
	('2019-12-01', '2023-03-26', '2022-07-25', '2000', '2000', '9', '2', '210', '1', '1', '3', '1', '1'),
	('2020-02-28', '2022-10-29', '2023-10-22', '4000', '4000', '14', '9', '211', '1', '2', '2', '1', '3'),
	('2020-02-03', '2023-04-21', '2023-03-08', '3000', '3000', '14', '9', '212', '1', '3', '3', '2', '1'),
	('2020-10-10', '2023-01-30', '2022-10-20', '3000', '3000', '7', '10', '213', '1', '3', '3', '1', '2'),
	('2020-04-10', '2023-01-02', '2023-04-07', '6000', '6000', '6', '4', '214', '1', '2', '1', '1', '3'),
	('2020-04-24', '2023-01-17', '2022-07-17', '2000', '2000', '5', '13', '215', '1', '3', '2', '1', '3'),
	('2020-05-31', '2023-03-26', '2022-12-24', '6000', '6000', '4', '14', '216', '1', '1', '3', '2', '1'),
	('2020-10-19', '2023-04-20', '2023-05-07', '4000', '4000', '5', '3', '217', '1', '3', '1', '1', '3'),
	('2019-12-25', '2023-04-12', '2022-09-28', '5000', '5000', '5', '4', '218', '1', '3', '1', '2', '1'),
	('2020-08-27', '2023-04-24', '2023-04-14', '6000', '6000', '8', '15', '219', '1', '2', '3', '1', '1'),
	('2020-07-25', '2022-10-31', '2023-06-12', '1000', '1000', '3', '13', '220', '1', '2', '2', '1', '3'),
	('2020-11-12', '2023-03-31', '2023-09-27', '2000', '2000', '9', '10', '221', '1', '3', '2', '1', '2'),
	('2020-07-15', '2023-06-03', '2022-09-22', '4000', '4000', '12', '4', '222', '1', '2', '3', '1', '2'),
	('2020-07-09', '2023-01-10', '2023-07-01', '6000', '6000', '13', '2', '223', '1', '1', '2', '2', '3'),
	('2020-10-02', '2023-02-17', '2022-07-16', '5000', '5000', '6', '13', '224', '1', '2', '2', '1', '2'),
	('2020-11-01', '2023-03-05', '2023-01-04', '3000', '3000', '1', '1', '225', '1', '1', '1', '2', '3'),
	('2019-12-25', '2023-02-24', '2022-11-05', '1000', '1000', '5', '7', '226', '1', '1', '1', '2', '3'),
	('2020-05-16', '2022-12-08', '2023-10-28', '2000', '2000', '7', '3', '227', '1', '2', '3', '2', '2'),
	('2020-06-30', '2022-10-12', '2023-04-07', '1000', '1000', '15', '6', '228', '1', '2', '2', '1', '2'),
	('2020-01-10', '2022-12-28', '2022-12-12', '2000', '2000', '5', '4', '229', '1', '2', '2', '1', '3'),
	('2020-01-15', '2023-01-17', '2022-07-11', '3000', '3000', '7', '3', '230', '1', '1', '1', '1', '1'),
	('2019-12-13', '2023-03-03', '2023-01-24', '2000', '2000', '8', '14', '231', '1', '3', '1', '1', '3'),
	('2020-07-17', '2023-04-19', '2022-08-14', '3000', '3000', '4', '6', '232', '1', '2', '2', '1', '1'),
	('2020-02-19', '2023-05-12', '2023-12-29', '5000', '5000', '2', '4', '233', '1', '2', '3', '1', '3'),
	('2020-11-08', '2023-04-24', '2022-09-10', '3000', '3000', '11', '5', '234', '1', '1', '3', '2', '1'),
	('2020-04-18', '2022-11-11', '2023-10-24', '1000', '1000', '11', '2', '235', '1', '2', '3', '1', '1'),
	('2020-07-04', '2023-01-26', '2022-07-17', '6000', '6000', '6', '7', '236', '1', '3', '1', '2', '2'),
	('2020-07-08', '2023-03-28', '2022-11-29', '1000', '1000', '10', '15', '237', '1', '2', '1', '2', '1'),
	('2020-05-31', '2023-04-21', '2022-07-23', '6000', '6000', '8', '6', '238', '1', '1', '3', '1', '2'),
	('2020-11-28', '2022-10-18', '2023-03-30', '4000', '4000', '9', '12', '239', '1', '2', '2', '2', '1'),
	('2020-09-04', '2022-11-22', '2022-11-25', '4000', '4000', '9', '11', '240', '1', '3', '2', '1', '3'),
	('2019-12-15', '2023-04-02', '2023-09-13', '1000', '1000', '2', '5', '241', '1', '1', '3', '1', '2'),
	('2020-05-11', '2022-12-29', '2023-10-02', '1000', '1000', '1', '5', '242', '1', '3', '1', '2', '3'),
	('2020-01-07', '2023-01-04', '2022-10-26', '6000', '6000', '2', '7', '243', '1', '1', '3', '2', '1'),
	('2020-05-09', '2023-06-02', '2023-05-12', '1000', '1000', '14', '2', '244', '1', '1', '2', '2', '2'),
	('2020-01-22', '2023-03-19', '2023-05-26', '4000', '4000', '13', '2', '245', '1', '3', '2', '1', '2'),
	('2019-12-09', '2023-06-02', '2022-09-19', '5000', '5000', '8', '12', '246', '1', '1', '2', '2', '1'),
	('2019-12-05', '2022-11-24', '2023-04-21', '4000', '4000', '12', '5', '247', '1', '1', '2', '2', '1'),
	('2020-02-17', '2023-02-27', '2023-10-16', '1000', '1000', '3', '9', '248', '1', '3', '3', '2', '1'),
	('2020-04-04', '2022-12-28', '2023-02-26', '5000', '5000', '13', '2', '249', '1', '2', '1', '1', '1'),
	('2020-01-31', '2023-06-01', '2022-08-19', '5000', '5000', '4', '2', '250', '1', '3', '1', '1', '1'),
	('2020-04-01', '2023-06-03', '2023-10-15', '3000', '3000', '7', '12', '251', '1', '1', '1', '1', '2'),
	('2020-09-06', '2023-01-09', '2023-11-12', '6000', '6000', '11', '13', '252', '1', '1', '2', '2', '3'),
	('2020-04-05', '2022-10-25', '2023-06-23', '1000', '1000', '7', '3', '253', '1', '2', '3', '2', '2'),
	('2020-05-26', '2022-12-09', '2023-05-11', '4000', '4000', '3', '14', '254', '1', '1', '2', '2', '1'),
	('2020-05-30', '2023-02-14', '2023-09-09', '1000', '1000', '6', '10', '255', '1', '1', '1', '2', '3'),
	('2020-04-22', '2023-04-25', '2022-08-20', '3000', '3000', '1', '10', '256', '1', '3', '1', '1', '3'),
	('2020-10-01', '2023-05-29', '2023-04-09', '3000', '3000', '1', '6', '257', '1', '2', '2', '1', '3'),
	('2020-02-26', '2023-06-04', '2023-06-13', '4000', '4000', '7', '4', '258', '1', '1', '3', '2', '1'),
	('2020-07-05', '2022-12-02', '2023-09-26', '1000', '1000', '2', '14', '259', '1', '2', '2', '2', '2'),
	('2020-03-04', '2022-12-22', '2022-11-14', '3000', '3000', '13', '3', '260', '1', '3', '1', '1', '2'),
	('2019-12-23', '2023-03-12', '2022-08-09', '6000', '6000', '12', '11', '261', '1', '1', '1', '2', '1'),
	('2020-03-12', '2023-01-09', '2023-10-11', '4000', '4000', '1', '15', '262', '1', '3', '3', '1', '1'),
	('2020-10-12', '2023-05-16', '2023-03-17', '4000', '4000', '3', '1', '263', '1', '3', '1', '1', '1'),
	('2020-05-27', '2023-01-04', '2023-08-16', '4000', '4000', '4', '1', '264', '1', '2', '2', '1', '2'),
	('2020-06-29', '2023-02-28', '2022-12-18', '1000', '1000', '6', '12', '265', '1', '3', '3', '2', '2'),
	('2020-09-22', '2023-02-08', '2023-08-17', '6000', '6000', '5', '7', '266', '1', '3', '1', '1', '3'),
	('2020-06-03', '2023-05-26', '2022-10-27', '5000', '5000', '4', '8', '267', '1', '2', '3', '1', '2'),
	('2020-05-16', '2023-06-01', '2022-10-15', '5000', '5000', '4', '6', '268', '1', '1', '3', '1', '2'),
	('2020-04-04', '2022-11-26', '2023-12-10', '3000', '3000', '10', '5', '269', '1', '3', '1', '2', '1'),
	('2020-11-08', '2022-12-16', '2023-10-29', '1000', '1000', '7', '9', '270', '1', '2', '2', '2', '1'),
	('2020-11-05', '2023-03-20', '2023-09-08', '2000', '2000', '12', '8', '271', '1', '3', '2', '1', '2'),
	('2020-08-25', '2023-01-25', '2023-06-14', '1000', '1000', '15', '15', '272', '1', '2', '3', '2', '1'),
	('2020-04-19', '2022-11-02', '2022-10-31', '4000', '4000', '5', '3', '273', '1', '1', '1', '2', '2'),
	('2020-06-14', '2022-10-11', '2023-02-19', '6000', '6000', '8', '9', '274', '1', '2', '1', '1', '3'),
	('2019-11-30', '2022-12-29', '2023-06-30', '3000', '3000', '2', '1', '275', '1', '3', '1', '1', '1'),
	('2020-07-19', '2022-12-04', '2023-02-10', '3000', '3000', '10', '9', '276', '1', '1', '3', '1', '2'),
	('2020-03-21', '2023-03-17', '2023-07-20', '2000', '2000', '8', '13', '277', '1', '1', '3', '1', '3'),
	('2020-11-12', '2023-01-26', '2023-10-30', '3000', '3000', '1', '8', '278', '1', '2', '1', '2', '2'),
	('2020-06-08', '2022-12-31', '2023-04-09', '2000', '2000', '14', '13', '279', '1', '1', '1', '2', '1'),
	('2020-02-22', '2022-12-19', '2023-04-03', '6000', '6000', '2', '5', '280', '1', '1', '2', '2', '1'),
	('2019-11-29', '2022-11-08', '2022-07-25', '4000', '4000', '7', '13', '281', '1', '2', '2', '2', '3'),
	('2020-09-03', '2023-01-15', '2023-03-22', '5000', '5000', '4', '3', '282', '1', '2', '1', '2', '2'),
	('2020-03-25', '2022-11-06', '2022-07-29', '6000', '6000', '14', '13', '283', '1', '2', '3', '1', '2'),
	('2020-08-04', '2023-02-28', '2023-04-29', '1000', '1000', '6', '11', '284', '1', '1', '3', '1', '2'),
	('2020-07-14', '2023-01-16', '2023-02-04', '2000', '2000', '14', '9', '285', '1', '3', '3', '1', '1'),
	('2020-01-16', '2022-10-20', '2023-02-13', '3000', '3000', '15', '1', '286', '1', '1', '2', '2', '3'),
	('2019-12-27', '2023-05-20', '2023-11-13', '6000', '6000', '4', '14', '287', '1', '1', '2', '1', '1'),
	('2020-06-10', '2023-06-06', '2023-07-08', '2000', '2000', '13', '1', '288', '1', '2', '3', '1', '2'),
	('2020-07-28', '2023-03-15', '2023-06-15', '6000', '6000', '5', '8', '289', '1', '1', '3', '1', '2'),
	('2020-03-07', '2022-11-20', '2023-01-08', '2000', '2000', '5', '5', '290', '1', '1', '1', '1', '2'),
	('2020-02-22', '2023-02-08', '2023-10-23', '1000', '1000', '7', '12', '291', '1', '2', '1', '2', '1'),
	('2020-02-21', '2023-03-20', '2023-02-05', '5000', '5000', '7', '7', '292', '1', '3', '3', '1', '1'),
	('2020-11-18', '2023-04-21', '2023-02-06', '1000', '1000', '1', '1', '293', '1', '1', '1', '1', '1'),
	('2020-08-27', '2023-01-14', '2023-07-08', '3000', '3000', '3', '6', '294', '1', '3', '2', '2', '3'),
	('2020-08-03', '2022-11-06', '2022-09-08', '5000', '5000', '4', '13', '295', '1', '3', '2', '2', '2'),
	('2020-10-08', '2023-01-06', '2023-07-16', '3000', '3000', '7', '6', '296', '1', '2', '1', '2', '3'),
	('2020-07-26', '2023-02-05', '2023-07-23', '4000', '4000', '13', '8', '297', '1', '1', '1', '2', '3'),
	('2020-01-10', '2022-12-16', '2023-03-03', '2000', '2000', '5', '1', '298', '1', '1', '3', '1', '3'),
	('2020-08-26', '2023-02-28', '2023-12-13', '2000', '2000', '5', '3', '299', '1', '1', '1', '1', '1'),
	('2020-04-01', '2023-03-11', '2023-05-09', '2000', '2000', '2', '9', '300', '1', '2', '2', '1', '3'),
	('2020-02-05', '2023-01-06', '2023-04-12', '5000', '5000', '11', '6', '301', '1', '1', '2', '1', '1'),
	('2020-03-05', '2023-04-09', '2023-06-03', '6000', '6000', '4', '13', '302', '1', '2', '1', '1', '2'),
	('2020-02-08', '2023-05-13', '2023-04-07', '5000', '5000', '10', '11', '303', '1', '2', '2', '1', '1'),
	('2020-02-22', '2022-11-29', '2023-08-04', '1000', '1000', '11', '11', '304', '1', '3', '1', '2', '3'),
	('2020-09-24', '2023-02-03', '2022-12-23', '3000', '3000', '9', '14', '305', '1', '1', '2', '1', '3'),
	('2020-07-27', '2022-12-20', '2023-02-15', '1000', '1000', '9', '5', '306', '1', '3', '1', '1', '3'),
	('2020-07-21', '2022-10-22', '2022-12-22', '6000', '6000', '7', '8', '307', '1', '1', '3', '1', '3'),
	('2020-04-16', '2022-12-18', '2023-02-10', '2000', '2000', '9', '14', '308', '1', '1', '2', '2', '1'),
	('2020-05-06', '2022-10-20', '2023-02-11', '4000', '4000', '6', '10', '309', '1', '1', '1', '2', '2'),
	('2020-03-08', '2022-11-21', '2023-01-28', '2000', '2000', '10', '15', '310', '1', '1', '1', '2', '3'),
	('2019-12-21', '2022-12-11', '2023-06-11', '6000', '6000', '8', '6', '311', '1', '1', '1', '2', '3'),
	('2020-11-24', '2023-02-27', '2023-04-12', '5000', '5000', '10', '2', '312', '1', '2', '3', '2', '1'),
	('2020-10-14', '2023-03-23', '2023-05-11', '5000', '5000', '6', '6', '313', '1', '3', '1', '1', '3'),
	('2020-01-27', '2022-10-28', '2022-10-23', '2000', '2000', '3', '9', '314', '1', '3', '2', '2', '3'),
	('2020-10-31', '2023-02-17', '2023-08-14', '4000', '4000', '4', '8', '315', '1', '2', '2', '2', '2'),
	('2020-07-06', '2022-11-18', '2023-10-04', '4000', '4000', '3', '2', '316', '1', '3', '3', '2', '1'),
	('2020-05-22', '2023-01-16', '2023-11-25', '2000', '2000', '8', '13', '317', '1', '2', '1', '1', '2'),
	('2020-01-26', '2022-11-04', '2023-01-18', '2000', '2000', '7', '6', '318', '1', '2', '1', '1', '3'),
	('2020-07-05', '2023-01-28', '2022-07-27', '1000', '1000', '8', '14', '319', '1', '3', '3', '2', '2'),
	('2020-09-15', '2023-02-14', '2023-01-16', '2000', '2000', '9', '3', '320', '1', '3', '3', '2', '3'),
	('2020-07-25', '2023-02-15', '2023-03-21', '3000', '3000', '13', '3', '321', '1', '3', '1', '2', '2'),
	('2019-12-01', '2023-03-12', '2022-08-07', '2000', '2000', '12', '2', '322', '1', '1', '2', '2', '1'),
	('2020-11-25', '2023-02-07', '2022-11-19', '5000', '5000', '15', '15', '323', '1', '3', '2', '2', '1'),
	('2020-06-01', '2022-11-06', '2022-10-03', '4000', '4000', '15', '2', '324', '1', '2', '3', '1', '2'),
	('2020-11-20', '2023-05-29', '2023-03-02', '2000', '2000', '3', '11', '325', '1', '2', '3', '2', '1'),
	('2020-06-13', '2022-11-12', '2022-11-13', '2000', '2000', '14', '10', '326', '1', '1', '2', '2', '1'),
	('2020-02-29', '2023-04-03', '2023-08-01', '3000', '3000', '4', '8', '327', '1', '2', '1', '2', '3'),
	('2019-12-18', '2022-11-23', '2023-10-13', '2000', '2000', '4', '11', '328', '1', '2', '1', '2', '3'),
	('2020-02-20', '2023-03-07', '2022-08-17', '4000', '4000', '12', '4', '329', '1', '2', '3', '1', '1'),
	('2020-11-22', '2022-11-21', '2023-12-13', '3000', '3000', '8', '7', '330', '1', '1', '1', '2', '2'),
	('2020-09-13', '2022-10-31', '2022-07-16', '2000', '2000', '1', '10', '331', '1', '2', '3', '1', '1'),
	('2020-08-31', '2023-02-27', '2023-12-16', '5000', '5000', '9', '9', '332', '1', '1', '3', '1', '3'),
	('2020-07-27', '2023-04-15', '2023-04-29', '4000', '4000', '13', '7', '333', '1', '3', '1', '1', '1'),
	('2020-09-07', '2022-12-06', '2023-02-05', '1000', '1000', '9', '11', '334', '1', '2', '2', '1', '1'),
	('2020-02-29', '2022-12-30', '2023-05-12', '3000', '3000', '13', '9', '335', '1', '1', '3', '1', '1'),
	('2020-05-28', '2023-01-16', '2023-12-12', '3000', '3000', '1', '9', '336', '1', '3', '2', '2', '2'),
	('2020-04-21', '2022-12-01', '2023-08-23', '2000', '2000', '5', '4', '337', '1', '1', '2', '2', '1'),
	('2020-02-14', '2022-11-14', '2022-08-01', '6000', '6000', '4', '14', '338', '1', '3', '2', '2', '2'),
	('2020-11-20', '2023-04-06', '2022-08-05', '1000', '1000', '5', '11', '339', '1', '1', '2', '1', '2'),
	('2020-07-07', '2023-05-15', '2022-08-06', '6000', '6000', '4', '11', '340', '1', '2', '3', '2', '3'),
	('2020-04-17', '2022-12-30', '2022-09-16', '1000', '1000', '6', '6', '341', '1', '2', '1', '2', '3'),
	('2020-09-21', '2023-04-12', '2023-04-08', '2000', '2000', '14', '11', '342', '1', '3', '3', '1', '2'),
	('2020-08-19', '2023-05-30', '2023-01-11', '4000', '4000', '6', '7', '343', '1', '3', '1', '1', '3'),
	('2020-09-25', '2023-03-08', '2023-02-05', '2000', '2000', '12', '4', '344', '1', '2', '3', '2', '1'),
	('2020-10-16', '2023-03-10', '2023-07-18', '5000', '5000', '9', '4', '345', '1', '1', '2', '2', '3'),
	('2020-04-08', '2022-11-14', '2023-01-26', '3000', '3000', '8', '2', '346', '1', '2', '2', '2', '3'),
	('2019-12-25', '2023-04-21', '2023-02-25', '5000', '5000', '11', '11', '347', '1', '3', '1', '2', '2'),
	('2019-12-02', '2023-03-27', '2022-12-14', '5000', '5000', '10', '11', '348', '1', '1', '1', '1', '2'),
	('2020-10-28', '2023-03-06', '2022-08-06', '6000', '6000', '11', '12', '349', '1', '2', '3', '2', '1'),
	('2020-08-04', '2022-11-21', '2023-10-26', '4000', '4000', '6', '4', '350', '1', '1', '3', '1', '1'),
	('2020-05-16', '2022-12-20', '2022-08-04', '3000', '3000', '1', '10', '351', '1', '1', '2', '2', '3'),
	('2020-06-23', '2022-11-01', '2023-07-03', '1000', '1000', '6', '7', '352', '1', '2', '2', '1', '3'),
	('2020-05-07', '2022-12-14', '2023-02-06', '1000', '1000', '6', '12', '353', '1', '3', '2', '1', '2'),
	('2020-11-26', '2022-11-14', '2023-02-09', '2000', '2000', '13', '6', '354', '1', '3', '3', '1', '3'),
	('2020-06-01', '2023-04-27', '2022-08-21', '4000', '4000', '5', '15', '355', '1', '3', '1', '1', '2'),
	('2020-07-20', '2022-12-06', '2023-12-23', '4000', '4000', '3', '10', '356', '1', '1', '2', '2', '2'),
	('2020-11-11', '2022-12-31', '2023-08-17', '6000', '6000', '4', '12', '357', '1', '3', '1', '2', '1'),
	('2020-06-19', '2023-02-09', '2022-11-19', '5000', '5000', '5', '15', '358', '1', '3', '2', '2', '3'),
	('2020-04-24', '2023-03-12', '2022-10-24', '3000', '3000', '11', '5', '359', '1', '2', '3', '1', '3'),
	('2020-01-06', '2023-04-25', '2023-05-03', '6000', '6000', '9', '14', '360', '1', '2', '3', '2', '1'),
	('2020-04-01', '2022-12-22', '2023-12-16', '2000', '2000', '6', '3', '361', '1', '1', '1', '1', '2'),
	('2020-03-27', '2022-12-30', '2022-10-19', '1000', '1000', '1', '6', '362', '1', '1', '1', '2', '2'),
	('2020-02-13', '2023-01-09', '2023-02-16', '2000', '2000', '15', '8', '363', '1', '2', '1', '2', '2'),
	('2020-11-14', '2023-02-19', '2023-10-22', '3000', '3000', '4', '14', '364', '1', '1', '1', '1', '2'),
	('2020-02-12', '2022-12-20', '2023-05-05', '3000', '3000', '9', '1', '365', '1', '3', '2', '1', '1'),
	('2020-07-08', '2023-05-23', '2023-01-05', '5000', '5000', '7', '14', '366', '1', '2', '3', '1', '1'),
	('2020-11-15', '2022-10-19', '2023-09-06', '5000', '5000', '5', '10', '367', '1', '1', '1', '1', '1'),
	('2020-07-10', '2023-05-01', '2022-10-03', '5000', '5000', '12', '10', '368', '1', '2', '2', '1', '2'),
	('2020-01-07', '2022-11-12', '2023-07-28', '1000', '1000', '14', '6', '369', '1', '2', '2', '2', '1'),
	('2020-06-22', '2022-12-10', '2023-05-18', '1000', '1000', '3', '15', '370', '1', '3', '2', '1', '1'),
	('2020-07-02', '2022-11-28', '2022-08-17', '3000', '3000', '2', '6', '371', '1', '2', '1', '1', '1'),
	('2020-09-02', '2023-04-23', '2023-06-04', '2000', '2000', '10', '14', '372', '1', '1', '3', '1', '1'),
	('2020-06-16', '2023-03-28', '2022-10-18', '5000', '5000', '1', '2', '373', '1', '1', '2', '1', '2'),
	('2020-11-26', '2023-01-28', '2023-10-30', '1000', '1000', '11', '10', '374', '1', '1', '1', '1', '2'),
	('2019-12-17', '2023-02-07', '2022-09-25', '4000', '4000', '12', '7', '375', '1', '2', '1', '2', '3'),
	('2020-09-02', '2022-10-17', '2022-08-05', '4000', '4000', '1', '9', '376', '1', '2', '3', '2', '2'),
	('2020-06-05', '2023-05-29', '2023-05-01', '2000', '2000', '4', '6', '377', '1', '2', '2', '2', '1'),
	('2020-11-12', '2023-05-12', '2023-10-11', '2000', '2000', '10', '6', '378', '1', '1', '1', '1', '3'),
	('2020-01-27', '2023-02-03', '2022-10-21', '3000', '3000', '13', '9', '379', '1', '3', '3', '2', '2'),
	('2020-05-26', '2022-12-13', '2023-02-06', '1000', '1000', '2', '8', '380', '1', '2', '2', '1', '3'),
	('2020-08-27', '2023-05-30', '2023-12-30', '1000', '1000', '14', '15', '381', '1', '3', '3', '2', '2'),
	('2020-04-02', '2023-02-07', '2023-12-10', '2000', '2000', '4', '13', '382', '1', '2', '2', '1', '2'),
	('2020-08-15', '2023-02-14', '2023-04-18', '2000', '2000', '6', '9', '383', '1', '1', '3', '2', '2'),
	('2020-06-08', '2023-02-14', '2022-11-17', '2000', '2000', '3', '15', '384', '1', '2', '2', '2', '2'),
	('2019-12-07', '2023-01-09', '2023-08-25', '2000', '2000', '12', '14', '385', '1', '1', '3', '2', '1'),
	('2020-11-03', '2023-04-24', '2023-01-20', '2000', '2000', '3', '12', '386', '1', '1', '1', '2', '3'),
	('2020-08-29', '2022-11-12', '2023-02-17', '4000', '4000', '10', '12', '387', '1', '1', '3', '2', '3'),
	('2020-11-26', '2023-04-11', '2023-10-03', '3000', '3000', '10', '4', '388', '1', '3', '1', '1', '1'),
	('2020-01-21', '2023-05-17', '2023-12-01', '2000', '2000', '12', '2', '389', '1', '1', '1', '2', '3'),
	('2020-07-05', '2023-03-21', '2023-01-13', '6000', '6000', '6', '1', '390', '1', '1', '1', '2', '3'),
	('2020-01-04', '2023-03-15', '2023-10-24', '2000', '2000', '9', '12', '391', '1', '3', '3', '1', '1'),
	('2020-10-02', '2022-10-23', '2023-09-14', '3000', '3000', '2', '13', '392', '1', '1', '1', '2', '1'),
	('2020-01-21', '2023-04-25', '2022-12-27', '1000', '1000', '1', '3', '393', '1', '2', '1', '2', '1'),
	('2020-01-01', '2022-12-26', '2022-12-18', '1000', '1000', '8', '8', '394', '1', '1', '1', '1', '3'),
	('2020-07-21', '2023-03-07', '2023-03-14', '5000', '5000', '5', '4', '395', '1', '1', '2', '2', '1'),
	('2020-06-14', '2023-03-28', '2023-03-02', '4000', '4000', '8', '6', '396', '1', '2', '2', '1', '2'),
	('2020-07-21', '2022-11-18', '2022-11-10', '4000', '4000', '12', '13', '397', '1', '2', '3', '2', '2'),
	('2020-02-25', '2023-05-31', '2023-08-17', '5000', '5000', '5', '12', '398', '1', '3', '3', '1', '2'),
	('2020-06-27', '2022-12-25', '2023-07-02', '1000', '1000', '5', '12', '399', '1', '3', '2', '2', '3'),
	('2020-07-26', '2023-03-28', '2023-05-23', '4000', '4000', '14', '6', '400', '1', '1', '1', '2', '1'),
	('2020-02-09', '2023-02-16', '2023-08-28', '2000', '2000', '7', '14', '401', '1', '2', '2', '2', '1'),
	('2020-10-05', '2023-04-01', '2022-11-30', '6000', '6000', '11', '3', '402', '1', '1', '3', '2', '3'),
	('2020-09-10', '2023-03-12', '2023-01-03', '1000', '1000', '5', '10', '403', '1', '1', '1', '2', '1'),
	('2020-10-04', '2023-03-13', '2023-01-21', '1000', '1000', '6', '5', '404', '1', '3', '3', '2', '1'),
	('2020-09-17', '2022-12-01', '2023-05-19', '1000', '1000', '4', '3', '405', '1', '1', '3', '2', '3'),
	('2019-12-05', '2023-02-19', '2023-06-23', '1000', '1000', '13', '5', '406', '1', '2', '3', '1', '3'),
	('2020-09-02', '2023-03-29', '2022-07-30', '3000', '3000', '12', '13', '407', '1', '1', '1', '1', '2'),
	('2020-01-07', '2023-02-02', '2023-02-23', '3000', '3000', '5', '3', '408', '1', '1', '3', '1', '2'),
	('2020-05-28', '2022-11-21', '2023-01-27', '5000', '5000', '2', '10', '409', '1', '2', '2', '1', '1'),
	('2020-10-31', '2022-12-20', '2023-02-01', '3000', '3000', '2', '10', '410', '1', '3', '2', '1', '1'),
	('2019-12-25', '2023-01-23', '2023-08-15', '6000', '6000', '2', '4', '411', '1', '2', '2', '2', '3'),
	('2019-12-20', '2023-01-26', '2023-10-22', '4000', '4000', '6', '7', '412', '1', '1', '3', '1', '3'),
	('2019-12-12', '2023-05-19', '2022-11-02', '1000', '1000', '10', '3', '413', '1', '3', '2', '1', '1'),
	('2019-12-16', '2023-02-12', '2022-11-14', '2000', '2000', '12', '4', '414', '1', '1', '3', '1', '1'),
	('2020-02-07', '2023-01-06', '2023-08-24', '1000', '1000', '8', '2', '415', '1', '3', '3', '2', '3'),
	('2020-07-01', '2023-04-05', '2022-09-14', '2000', '2000', '14', '9', '416', '1', '3', '1', '1', '1'),
	('2020-05-17', '2022-11-28', '2023-02-14', '5000', '5000', '9', '11', '417', '1', '2', '3', '1', '1'),
	('2020-07-06', '2023-02-26', '2022-11-15', '4000', '4000', '14', '4', '418', '1', '3', '3', '2', '2'),
	('2019-12-02', '2023-01-11', '2023-05-03', '2000', '2000', '12', '12', '419', '1', '2', '3', '1', '1'),
	('2020-04-29', '2022-11-30', '2022-12-14', '6000', '6000', '2', '11', '420', '1', '1', '2', '1', '2'),
	('2020-08-29', '2023-03-22', '2023-12-10', '1000', '1000', '2', '2', '421', '1', '2', '1', '1', '2'),
	('2020-01-28', '2022-12-03', '2023-11-19', '3000', '3000', '4', '8', '422', '1', '1', '1', '1', '1'),
	('2020-10-14', '2022-10-17', '2023-12-27', '1000', '1000', '10', '12', '423', '1', '2', '2', '1', '1'),
	('2020-10-08', '2022-12-14', '2023-01-28', '5000', '5000', '6', '11', '424', '1', '2', '1', '2', '2'),
	('2020-04-08', '2023-05-02', '2022-09-09', '6000', '6000', '10', '14', '425', '1', '1', '2', '2', '1'),
	('2020-10-12', '2022-11-18', '2023-10-17', '2000', '2000', '6', '15', '426', '1', '3', '1', '2', '1'),
	('2020-08-18', '2023-04-10', '2023-10-20', '6000', '6000', '11', '10', '427', '1', '2', '2', '1', '3'),
	('2020-10-28', '2023-01-30', '2023-07-21', '5000', '5000', '10', '5', '428', '1', '1', '3', '2', '2'),
	('2019-12-13', '2022-12-31', '2022-07-20', '3000', '3000', '4', '15', '429', '1', '3', '1', '2', '3'),
	('2020-11-20', '2023-05-18', '2022-09-25', '4000', '4000', '7', '11', '430', '1', '3', '1', '2', '2'),
	('2020-06-11', '2022-12-25', '2023-11-20', '5000', '5000', '9', '10', '431', '1', '1', '2', '1', '2'),
	('2020-02-16', '2022-11-08', '2023-10-25', '1000', '1000', '4', '13', '432', '1', '1', '1', '2', '3'),
	('2020-02-07', '2022-11-20', '2024-01-01', '3000', '3000', '10', '12', '433', '1', '3', '1', '2', '1'),
	('2020-07-04', '2023-02-08', '2023-02-28', '2000', '2000', '7', '2', '434', '1', '3', '1', '2', '3'),
	('2020-01-13', '2022-10-09', '2023-12-27', '1000', '1000', '4', '13', '435', '1', '3', '1', '1', '3'),
	('2020-05-05', '2022-10-27', '2023-07-11', '5000', '5000', '10', '2', '436', '1', '3', '3', '2', '1'),
	('2020-05-26', '2022-11-01', '2023-06-20', '2000', '2000', '12', '12', '437', '1', '2', '1', '2', '3'),
	('2020-06-28', '2022-10-28', '2023-10-27', '5000', '5000', '12', '9', '438', '1', '2', '3', '1', '2'),
	('2020-11-03', '2023-06-06', '2023-01-19', '5000', '5000', '7', '14', '439', '1', '3', '1', '2', '1'),
	('2019-11-30', '2023-02-13', '2023-10-04', '3000', '3000', '4', '1', '440', '1', '3', '1', '2', '3'),
	('2020-06-18', '2023-01-25', '2023-06-15', '4000', '4000', '10', '5', '441', '1', '3', '2', '2', '2'),
	('2020-08-07', '2023-06-02', '2022-08-16', '3000', '3000', '11', '4', '442', '1', '3', '3', '2', '3'),
	('2020-10-26', '2022-10-19', '2023-10-29', '4000', '4000', '8', '9', '443', '1', '3', '1', '2', '1'),
	('2020-02-28', '2023-03-29', '2023-12-25', '5000', '5000', '11', '1', '444', '1', '3', '1', '2', '1'),
	('2020-05-31', '2023-05-03', '2023-05-30', '5000', '5000', '15', '4', '445', '1', '2', '3', '2', '1'),
	('2020-01-11', '2023-04-03', '2023-04-19', '3000', '3000', '12', '12', '446', '1', '3', '1', '1', '3'),
	('2019-12-08', '2023-02-07', '2023-12-18', '6000', '6000', '1', '3', '447', '1', '1', '2', '2', '2'),
	('2020-05-21', '2022-11-24', '2023-01-09', '5000', '5000', '3', '3', '448', '1', '3', '1', '1', '1'),
	('2020-11-12', '2023-03-29', '2022-09-11', '1000', '1000', '10', '10', '449', '1', '2', '2', '2', '1'),
	('2020-02-18', '2023-04-05', '2023-03-10', '2000', '2000', '2', '2', '450', '1', '1', '2', '2', '3'),
	('2020-05-03', '2023-04-02', '2022-10-19', '6000', '6000', '8', '3', '451', '1', '2', '3', '1', '2'),
	('2020-05-21', '2023-04-13', '2023-01-19', '4000', '4000', '2', '4', '452', '1', '2', '3', '2', '2'),
	('2020-11-16', '2023-04-30', '2023-09-12', '4000', '4000', '10', '14', '453', '1', '1', '1', '2', '1'),
	('2020-06-05', '2023-01-01', '2022-07-22', '5000', '5000', '4', '6', '454', '1', '2', '3', '1', '1'),
	('2020-10-19', '2023-01-30', '2023-11-08', '2000', '2000', '14', '2', '455', '1', '1', '3', '2', '1'),
	('2020-02-10', '2023-01-05', '2022-09-23', '3000', '3000', '13', '15', '456', '1', '1', '3', '2', '1'),
	('2019-12-24', '2023-05-19', '2022-12-01', '3000', '3000', '3', '10', '457', '1', '1', '1', '2', '1'),
	('2020-06-12', '2022-12-28', '2023-10-23', '3000', '3000', '15', '4', '458', '1', '1', '1', '2', '2'),
	('2020-03-05', '2023-02-21', '2023-06-10', '2000', '2000', '14', '4', '459', '1', '1', '3', '1', '1'),
	('2020-01-23', '2023-01-18', '2022-12-07', '5000', '5000', '9', '14', '460', '1', '2', '1', '1', '1'),
	('2020-08-19', '2023-05-27', '2023-09-03', '3000', '3000', '6', '9', '461', '1', '2', '3', '2', '3'),
	('2020-04-15', '2022-11-11', '2023-09-23', '6000', '6000', '13', '15', '462', '1', '2', '3', '1', '3'),
	('2020-05-18', '2023-05-16', '2023-03-29', '3000', '3000', '14', '11', '463', '1', '3', '3', '1', '3'),
	('2020-05-11', '2023-04-06', '2023-02-21', '5000', '5000', '13', '7', '464', '1', '2', '1', '1', '1'),
	('2020-02-25', '2022-10-27', '2022-10-22', '4000', '4000', '3', '12', '465', '1', '3', '3', '1', '3'),
	('2020-06-26', '2022-10-17', '2022-07-14', '4000', '4000', '13', '1', '466', '1', '2', '2', '1', '1'),
	('2020-01-28', '2022-12-04', '2022-08-18', '3000', '3000', '13', '9', '467', '1', '2', '3', '2', '1'),
	('2020-08-04', '2022-12-21', '2022-09-23', '5000', '5000', '4', '15', '468', '1', '2', '3', '1', '1'),
	('2020-03-29', '2022-12-12', '2022-12-23', '1000', '1000', '2', '10', '469', '1', '1', '1', '1', '1'),
	('2020-04-02', '2023-02-18', '2023-07-04', '5000', '5000', '11', '10', '470', '1', '1', '1', '1', '3'),
	('2020-07-30', '2022-11-21', '2023-03-31', '2000', '2000', '11', '9', '471', '1', '2', '1', '1', '1'),
	('2019-12-28', '2022-11-11', '2022-08-22', '1000', '1000', '6', '14', '472', '1', '3', '1', '1', '1'),
	('2020-02-09', '2023-05-02', '2023-04-06', '6000', '6000', '12', '3', '473', '1', '2', '2', '2', '3'),
	('2019-12-13', '2023-06-04', '2023-01-07', '2000', '2000', '2', '5', '474', '1', '1', '2', '2', '1'),
	('2020-09-21', '2023-01-24', '2023-04-01', '6000', '6000', '7', '4', '475', '1', '1', '3', '1', '1'),
	('2020-08-22', '2023-02-15', '2023-01-27', '3000', '3000', '2', '5', '476', '1', '3', '2', '2', '3'),
	('2020-04-03', '2022-12-16', '2023-01-04', '1000', '1000', '6', '7', '477', '1', '3', '1', '2', '2'),
	('2019-12-24', '2023-02-12', '2022-08-17', '3000', '3000', '13', '6', '478', '1', '1', '3', '1', '2'),
	('2019-12-20', '2023-03-15', '2022-11-07', '4000', '4000', '2', '1', '479', '1', '1', '3', '2', '3'),
	('2020-05-10', '2023-02-27', '2023-09-22', '5000', '5000', '8', '10', '480', '1', '1', '2', '1', '3'),
	('2020-06-27', '2022-12-18', '2023-03-27', '6000', '6000', '4', '10', '481', '1', '1', '2', '1', '1'),
	('2020-01-18', '2022-10-20', '2022-10-01', '1000', '1000', '11', '13', '482', '1', '2', '1', '2', '1'),
	('2020-03-26', '2023-01-02', '2023-01-14', '6000', '6000', '2', '13', '483', '1', '3', '2', '1', '2'),
	('2020-08-09', '2023-03-24', '2023-12-06', '6000', '6000', '15', '7', '484', '1', '1', '3', '2', '2'),
	('2020-11-27', '2023-02-26', '2022-11-25', '2000', '2000', '8', '8', '485', '1', '1', '3', '1', '3'),
	('2020-08-25', '2023-04-18', '2023-08-31', '3000', '3000', '9', '8', '486', '1', '2', '1', '2', '3'),
	('2020-05-15', '2022-11-13', '2023-08-05', '2000', '2000', '12', '5', '487', '1', '2', '2', '1', '3'),
	('2019-12-30', '2022-10-24', '2023-07-11', '5000', '5000', '2', '3', '488', '1', '1', '2', '2', '2'),
	('2020-01-20', '2023-03-22', '2022-12-13', '6000', '6000', '10', '7', '489', '1', '3', '3', '1', '1'),
	('2020-02-21', '2023-03-29', '2022-12-02', '2000', '2000', '15', '1', '490', '1', '3', '1', '2', '1'),
	('2020-04-18', '2022-11-27', '2022-11-10', '1000', '1000', '7', '7', '491', '1', '2', '2', '2', '2'),
	('2020-05-14', '2022-11-29', '2023-03-26', '1000', '1000', '1', '11', '492', '1', '1', '2', '2', '1'),
	('2020-02-10', '2023-05-05', '2023-06-06', '3000', '3000', '9', '5', '493', '1', '3', '1', '2', '2'),
	('2020-11-11', '2023-02-22', '2023-05-19', '5000', '5000', '4', '15', '494', '1', '3', '2', '2', '2'),
	('2020-07-11', '2023-03-03', '2023-11-30', '2000', '2000', '7', '9', '495', '1', '3', '1', '2', '1'),
	('2020-02-02', '2023-01-10', '2022-12-09', '3000', '3000', '3', '9', '496', '1', '2', '3', '2', '3'),
	('2020-08-20', '2022-11-08', '2023-01-11', '4000', '4000', '7', '4', '497', '1', '3', '3', '1', '2'),
	('2020-07-05', '2022-10-06', '2022-08-31', '5000', '5000', '3', '5', '498', '1', '3', '2', '1', '2'),
	('2020-02-23', '2022-12-09', '2023-06-02', '2000', '2000', '8', '8', '499', '1', '3', '3', '2', '3'),
	('2020-03-22', '2023-02-24', '2022-10-26', '6000', '6000', '3', '12', '500', '1', '2', '3', '1', '1'),
	('2019-12-02', '2023-05-17', '2023-06-18', '5000', '5000', '5', '7', '501', '1', '1', '3', '2', '2'),
	('2020-07-29', '2023-06-05', '2023-01-27', '3000', '3000', '15', '12', '502', '1', '3', '2', '2', '1'),
	('2020-11-26', '2023-05-11', '2022-10-13', '5000', '5000', '12', '7', '503', '1', '1', '1', '2', '2'),
	('2020-09-07', '2022-10-09', '2023-10-14', '1000', '1000', '10', '1', '504', '1', '1', '2', '1', '1'),
	('2020-04-03', '2022-10-06', '2022-12-09', '2000', '2000', '3', '11', '505', '1', '3', '2', '1', '2'),
	('2020-04-01', '2023-04-03', '2022-12-21', '4000', '4000', '3', '6', '506', '1', '3', '3', '2', '1'),
	('2020-08-23', '2022-12-21', '2023-04-06', '3000', '3000', '4', '7', '507', '1', '2', '2', '2', '2'),
	('2020-06-04', '2023-01-24', '2023-04-02', '2000', '2000', '10', '13', '508', '1', '3', '3', '2', '1'),
	('2020-09-21', '2023-05-14', '2022-12-06', '4000', '4000', '3', '5', '509', '1', '3', '1', '2', '1'),
	('2020-06-22', '2023-02-02', '2023-01-27', '2000', '2000', '6', '7', '510', '1', '1', '3', '2', '1'),
	('2020-09-10', '2023-04-02', '2022-11-15', '6000', '6000', '13', '3', '511', '1', '2', '3', '1', '2'),
	('2020-06-12', '2022-12-11', '2023-12-15', '1000', '1000', '11', '7', '512', '1', '3', '2', '2', '2'),
	('2020-11-01', '2023-01-05', '2023-10-14', '3000', '3000', '9', '10', '513', '1', '2', '2', '2', '2'),
	('2019-12-23', '2023-05-18', '2023-03-13', '4000', '4000', '14', '10', '514', '1', '2', '3', '2', '1'),
	('2019-12-16', '2023-04-22', '2023-03-06', '2000', '2000', '7', '8', '515', '1', '1', '2', '2', '2');
```

```
INSERT INTO movimiento_planilla ("fecha", "monto", "id_contrato", "id_nomina") VALUES
	('2023-10-17', '115', '108', '4'),
	('2023-10-17', '0', '108', '5'),
	('2023-10-17', '0', '108', '6'),
	('2023-10-17', '1400', '108', '7'),
	('2023-10-17', '102', '108', '8'),
	('2023-10-17', '0', '108', '9'),
	('2023-10-17', '0', '108', '10'),
	('2023-10-17', '0', '108', '11'),
	('2023-10-17', '15', '108', '12'),
	('2023-10-17', '12', '108', '13'),
	('2023-10-17', '200', '108', '14'),
	('2023-10-17', '50', '108', '15'),
	('2023-10-17', '0', '108', '16'),
	('2023-10-17', '248', '108', '17'),
	('2023-10-17', '0', '108', '18'),
	('2023-10-17', '0', '108', '19'),
	('2023-10-17', '0', '108', '20'),
	('2023-10-17', '40', '108', '21'),
	('2023-10-17', '0', '108', '22'),
	('2023-10-17', '0', '108', '23'),
	('2023-10-17', '0', '108', '24'),
	('2023-10-17', '126', '108', '25'),
	('2023-10-17', '115', '200', '4'),
	('2023-10-17', '0', '200', '5'),
	('2023-10-17', '4', '200', '6'),
	('2023-10-17', '1800', '200', '7'),
	('2023-10-17', '205', '200', '8'),
	('2023-10-17', '0', '200', '9'),
	('2023-10-17', '100', '200', '10'),
	('2023-10-17', '0', '200', '11'),
	('2023-10-17', '15', '200', '12'),
	('2023-10-17', '20', '200', '13'),
	('2023-10-17', '0', '200', '14'),
	('2023-10-17', '50', '200', '15'),
	('2023-10-17', '0', '200', '16'),
	('2023-10-17', '0', '200', '17'),
	('2023-10-17', '200', '200', '18'),
	('2023-10-17', '80', '200', '19'),
	('2023-10-17', '4', '200', '20'),
	('2023-10-17', '400', '200', '21'),
	('2023-10-17', '0', '200', '22'),
	('2023-10-17', '67', '200', '23'),
	('2023-10-17', '0', '200', '24'),
	('2023-10-17', '162', '200', '25'),
	('2023-10-02', '115', '305', '4'),
	('2023-10-02', '0', '305', '5'),
	('2023-10-02', '0', '305', '6'),
	('2023-10-02', '1500', '305', '7'),
	('2023-10-02', '0', '305', '8'),
	('2023-10-02', '0', '305', '9'),
	('2023-10-02', '100', '305', '10'),
	('2023-10-02', '0', '305', '11'),
	('2023-10-02', '15', '305', '12'),
	('2023-10-02', '20', '305', '13'),
	('2023-10-02', '0', '305', '14'),
	('2023-10-02', '50', '305', '15'),
	('2023-10-02', '0', '305', '16'),
	('2023-10-02', '0', '305', '17'),
	('2023-10-02', '200', '305', '18'),
	('2023-10-02', '80', '305', '19'),
	('2023-10-02', '4', '305', '20'),
	('2023-10-02', '400', '305', '21'),
	('2023-10-02', '0', '305', '22'),
	('2023-10-02', '54', '305', '23'),
	('2023-10-02', '0', '305', '24'),
	('2023-10-02', '123', '305', '25'),
	('2023-10-02', '115', '305', '4'),
	('2023-10-02', '0', '305', '5'),
	('2023-10-02', '0', '305', '6'),
	('2023-10-02', '1900', '305', '7'),
	('2023-10-02', '102', '305', '8'),
	('2023-10-02', '0', '305', '9'),
	('2023-10-02', '0', '305', '10'),
	('2023-10-02', '0', '305', '11'),
	('2023-10-02', '15', '305', '12'),
	('2023-10-02', '12', '305', '13'),
	('2023-10-02', '150', '305', '14'),
	('2023-10-02', '50', '305', '15'),
	('2023-10-02', '0', '305', '16'),
	('2023-10-02', '247', '305', '17'),
	('2023-10-02', '0', '305', '18'),
	('2023-10-02', '0', '305', '19'),
	('2023-10-02', '0', '305', '20'),
	('2023-10-02', '40', '305', '21'),
	('2023-10-02', '0', '305', '22'),
	('2023-10-02', '0', '305', '23'),
	('2023-10-02', '0', '305', '24'),
	('2023-10-02', '171', '305', '25');
```
```
INSERT INTO movimiento_planilla ("fecha", "monto", "id_contrato", "id_nomina") VALUES
	('2023-12-20', '2074', '1', '7'),
	('2023-12-17', '0', '1', '8'),
	('2023-12-24', '100', '1', '9'),
	('2023-12-16', '0', '1', '10'),
	('2023-12-23', '115', '1', '11'),
	('2023-12-22', '90', '1', '12'),
	('2023-12-18', '50', '1', '13'),
	('2023-12-06', '510', '1', '14'),
	('2023-12-22', '0', '1', '15'),
	('2023-12-16', '0', '1', '16'),
	('2023-12-15', '464', '1', '17'),
	('2023-12-09', '186', '1', '18'),
	('2023-12-19', '287', '1', '19'),
	('2023-12-20', '316', '1', '20'),
	('2023-12-04', '327', '1', '21'),
	('2023-12-11', '0', '1', '22'),
	('2023-12-15', '160', '1', '23'),
	('2023-12-24', '400', '1', '24'),
	('2023-12-06', '115', '1', '25'),
	('2023-12-09', '1951', '2', '7'),
	('2023-12-14', '200', '2', '8'),
	('2023-12-17', '100', '2', '9'),
	('2023-12-09', '50', '2', '10'),
	('2023-12-10', '0', '2', '11'),
	('2023-12-16', '135', '2', '12'),
	('2023-12-14', '50', '2', '13'),
	('2023-12-20', '0', '2', '14'),
	('2023-12-23', '50', '2', '15'),
	('2023-12-10', '0', '2', '16'),
	('2023-12-05', '267', '2', '17'),
	('2023-12-17', '176', '2', '18'),
	('2023-12-13', '323', '2', '19'),
	('2023-12-10', '328', '2', '20'),
	('2023-12-24', '274', '2', '21'),
	('2023-12-15', '350', '2', '22'),
	('2023-12-14', '20', '2', '23'),
	('2023-12-24', '400', '2', '24'),
	('2023-12-09', '460', '2', '25'),
	('2023-12-12', '2654', '3', '7'),
	('2023-12-09', '200', '3', '8'),
	('2023-12-25', '0', '3', '9'),
	('2023-12-11', '0', '3', '10'),
	('2023-12-22', '115', '3', '11'),
	('2023-12-12', '0', '3', '12'),
	('2023-12-24', '100', '3', '13'),
	('2023-12-20', '0', '3', '14'),
	('2023-12-18', '200', '3', '15'),
	('2023-12-14', '75', '3', '16'),
	('2023-12-12', '378', '3', '17'),
	('2023-12-16', '200', '3', '18'),
	('2023-12-04', '405', '3', '19'),
	('2023-12-08', '278', '3', '20'),
	('2023-12-08', '419', '3', '21'),
	('2023-12-05', '0', '3', '22'),
	('2023-12-09', '180', '3', '23'),
	('2023-12-04', '800', '3', '24'),
	('2023-12-20', '230', '3', '25'),
	('2023-12-21', '2342', '6', '7'),
	('2023-12-15', '100', '6', '8'),
	('2023-12-07', '100', '6', '9'),
	('2023-12-24', '50', '6', '10'),
	('2023-12-08', '230', '6', '11'),
	('2023-12-25', '150', '6', '12'),
	('2023-12-25', '50', '6', '13'),
	('2023-12-13', '510', '6', '14'),
	('2023-12-24', '100', '6', '15'),
	('2023-12-09', '75', '6', '16'),
	('2023-12-19', '259', '6', '17'),
	('2023-12-09', '162', '6', '18'),
	('2023-12-18', '310', '6', '19'),
	('2023-12-07', '292', '6', '20'),
	('2023-12-13', '355', '6', '21'),
	('2023-12-25', '1050', '6', '22'),
	('2023-12-14', '40', '6', '23'),
	('2023-12-14', '800', '6', '24'),
	('2023-12-19', '230', '6', '25'),
	('2023-12-18', '2881', '7', '7'),
	('2023-12-24', '0', '7', '8'),
	('2023-12-17', '100', '7', '9'),
	('2023-12-06', '0', '7', '10'),
	('2023-12-05', '230', '7', '11'),
	('2023-12-09', '45', '7', '12'),
	('2023-12-06', '50', '7', '13'),
	('2023-12-04', '340', '7', '14'),
	('2023-12-23', '200', '7', '15'),
	('2023-12-07', '50', '7', '16'),
	('2023-12-15', '360', '7', '17'),
	('2023-12-05', '124', '7', '18'),
	('2023-12-18', '413', '7', '19'),
	('2023-12-12', '498', '7', '20'),
	('2023-12-18', '277', '7', '21'),
	('2023-12-10', '350', '7', '22'),
	('2023-12-04', '280', '7', '23'),
	('2023-12-23', '800', '7', '24'),
	('2023-12-05', '230', '7', '25'),
	('2023-12-17', '2677', '8', '7'),
	('2023-12-11', '0', '8', '8'),
	('2023-12-16', '100', '8', '9'),
	('2023-12-18', '0', '8', '10'),
	('2023-12-08', '115', '8', '11'),
	('2023-12-24', '105', '8', '12'),
	('2023-12-09', '50', '8', '13'),
	('2023-12-12', '510', '8', '14'),
	('2023-12-05', '50', '8', '15'),
	('2023-12-23', '25', '8', '16'),
	('2023-12-18', '472', '8', '17'),
	('2023-12-13', '192', '8', '18'),
	('2023-12-16', '461', '8', '19'),
	('2023-12-24', '387', '8', '20'),
	('2023-12-09', '202', '8', '21'),
	('2023-12-19', '0', '8', '22'),
	('2023-12-22', '200', '8', '23'),
	('2023-12-18', '400', '8', '24'),
	('2023-12-11', '345', '8', '25'),
	('2023-12-24', '2634', '9', '7'),
	('2023-12-24', '100', '9', '8'),
	('2023-12-16', '50', '9', '9'),
	('2023-12-15', '0', '9', '10'),
	('2023-12-12', '115', '9', '11'),
	('2023-12-19', '105', '9', '12'),
	('2023-12-08', '0', '9', '13'),
	('2023-12-19', '0', '9', '14'),
	('2023-12-10', '200', '9', '15'),
	('2023-12-25', '0', '9', '16'),
	('2023-12-19', '390', '9', '17'),
	('2023-12-23', '162', '9', '18'),
	('2023-12-21', '455', '9', '19'),
	('2023-12-12', '423', '9', '20'),
	('2023-12-05', '282', '9', '21'),
	('2023-12-14', '700', '9', '22'),
	('2023-12-24', '180', '9', '23'),
	('2023-12-07', '800', '9', '24'),
	('2023-12-08', '230', '9', '25'),
	('2023-12-11', '2907', '10', '7'),
	('2023-12-17', '0', '10', '8'),
	('2023-12-25', '50', '10', '9'),
	('2023-12-13', '50', '10', '10'),
	('2023-12-19', '0', '10', '11'),
	('2023-12-09', '45', '10', '12'),
	('2023-12-08', '0', '10', '13'),
	('2023-12-08', '0', '10', '14'),
	('2023-12-14', '50', '10', '15'),
	('2023-12-07', '0', '10', '16'),
	('2023-12-11', '213', '10', '17'),
	('2023-12-16', '137', '10', '18'),
	('2023-12-08', '207', '10', '19'),
	('2023-12-15', '347', '10', '20'),
	('2023-12-17', '509', '10', '21'),
	('2023-12-12', '350', '10', '22'),
	('2023-12-11', '80', '10', '23'),
	('2023-12-18', '0', '10', '24'),
	('2023-12-17', '115', '10', '25'),
	('2023-12-15', '1981', '11', '7'),
	('2023-12-09', '200', '11', '8'),
	('2023-12-14', '50', '11', '9'),
	('2023-12-23', '50', '11', '10'),
	('2023-12-12', '230', '11', '11'),
	('2023-12-12', '120', '11', '12'),
	('2023-12-14', '50', '11', '13'),
	('2023-12-21', '0', '11', '14'),
	('2023-12-16', '100', '11', '15'),
	('2023-12-15', '50', '11', '16'),
	('2023-12-21', '230', '11', '17'),
	('2023-12-10', '134', '11', '18'),
	('2023-12-06', '421', '11', '19'),
	('2023-12-19', '233', '11', '20'),
	('2023-12-04', '469', '11', '21'),
	('2023-12-07', '0', '11', '22'),
	('2023-12-06', '120', '11', '23'),
	('2023-12-04', '0', '11', '24'),
	('2023-12-08', '115', '11', '25'),
	('2023-12-14', '2187', '12', '7'),
	('2023-12-08', '0', '12', '8'),
	('2023-12-11', '0', '12', '9'),
	('2023-12-19', '100', '12', '10'),
	('2023-12-24', '115', '12', '11'),
	('2023-12-25', '120', '12', '12'),
	('2023-12-06', '50', '12', '13'),
	('2023-12-17', '170', '12', '14'),
	('2023-12-14', '150', '12', '15'),
	('2023-12-17', '0', '12', '16'),
	('2023-12-20', '344', '12', '17'),
	('2023-12-22', '162', '12', '18'),
	('2023-12-06', '339', '12', '19'),
	('2023-12-15', '216', '12', '20'),
	('2023-12-05', '331', '12', '21'),
	('2023-12-08', '0', '12', '22'),
	('2023-12-16', '200', '12', '23'),
	('2023-12-10', '0', '12', '24'),
	('2023-12-05', '460', '12', '25'),
	('2023-12-25', '2286', '13', '7'),
	('2023-12-06', '0', '13', '8'),
	('2023-12-20', '0', '13', '9'),
	('2023-12-25', '50', '13', '10'),
	('2023-12-25', '230', '13', '11'),
	('2023-12-09', '45', '13', '12'),
	('2023-12-11', '50', '13', '13'),
	('2023-12-07', '340', '13', '14'),
	('2023-12-12', '100', '13', '15'),
	('2023-12-24', '0', '13', '16'),
	('2023-12-04', '407', '13', '17'),
	('2023-12-16', '184', '13', '18'),
	('2023-12-18', '378', '13', '19'),
	('2023-12-18', '346', '13', '20'),
	('2023-12-20', '570', '13', '21'),
	('2023-12-15', '700', '13', '22'),
	('2023-12-20', '180', '13', '23'),
	('2023-12-14', '400', '13', '24'),
	('2023-12-22', '345', '13', '25'),
	('2023-12-11', '2012', '48', '7'),
	('2023-12-08', '200', '48', '8'),
	('2023-12-19', '100', '48', '9'),
	('2023-12-04', '0', '48', '10'),
	('2023-12-15', '0', '48', '11'),
	('2023-12-21', '90', '48', '12'),
	('2023-12-09', '100', '48', '13'),
	('2023-12-07', '510', '48', '14'),
	('2023-12-11', '50', '48', '15'),
	('2023-12-04', '25', '48', '16'),
	('2023-12-24', '337', '48', '17'),
	('2023-12-17', '154', '48', '18'),
	('2023-12-05', '373', '48', '19'),
	('2023-12-24', '494', '48', '20'),
	('2023-12-17', '269', '48', '21'),
	('2023-12-07', '1050', '48', '22'),
	('2023-12-16', '200', '48', '23'),
	('2023-12-08', '800', '48', '24'),
	('2023-12-17', '115', '48', '25'),
	('2023-12-04', '2338', '52', '7'),
	('2023-12-16', '100', '52', '8'),
	('2023-12-25', '50', '52', '9'),
	('2023-12-22', '0', '52', '10'),
	('2023-12-14', '0', '52', '11'),
	('2023-12-10', '120', '52', '12'),
	('2023-12-11', '100', '52', '13'),
	('2023-12-04', '510', '52', '14'),
	('2023-12-21', '50', '52', '15'),
	('2023-12-06', '25', '52', '16'),
	('2023-12-18', '279', '52', '17'),
	('2023-12-10', '155', '52', '18'),
	('2023-12-13', '284', '52', '19'),
	('2023-12-14', '239', '52', '20'),
	('2023-12-07', '437', '52', '21'),
	('2023-12-15', '700', '52', '22'),
	('2023-12-17', '160', '52', '23'),
	('2023-12-04', '800', '52', '24'),
	('2023-12-13', '115', '52', '25'),
	('2023-12-25', '1558', '75', '7'),
	('2023-12-16', '0', '75', '8'),
	('2023-12-05', '50', '75', '9'),
	('2023-12-21', '100', '75', '10'),
	('2023-12-04', '230', '75', '11'),
	('2023-12-21', '150', '75', '12'),
	('2023-12-06', '100', '75', '13'),
	('2023-12-18', '170', '75', '14'),
	('2023-12-08', '50', '75', '15'),
	('2023-12-13', '75', '75', '16'),
	('2023-12-15', '228', '75', '17'),
	('2023-12-05', '142', '75', '18'),
	('2023-12-16', '487', '75', '19'),
	('2023-12-05', '396', '75', '20'),
	('2023-12-10', '212', '75', '21'),
	('2023-12-24', '1050', '75', '22'),
	('2023-12-18', '280', '75', '23'),
	('2023-12-24', '0', '75', '24'),
	('2023-12-09', '115', '75', '25'),
	('2023-12-18', '2000', '89', '7'),
	('2023-12-21', '100', '89', '8'),
	('2023-12-14', '100', '89', '9'),
	('2023-12-17', '0', '89', '10'),
	('2023-12-10', '0', '89', '11'),
	('2023-12-09', '135', '89', '12'),
	('2023-12-24', '50', '89', '13'),
	('2023-12-15', '170', '89', '14'),
	('2023-12-23', '150', '89', '15'),
	('2023-12-20', '25', '89', '16'),
	('2023-12-23', '274', '89', '17'),
	('2023-12-15', '148', '89', '18'),
	('2023-12-09', '279', '89', '19'),
	('2023-12-24', '293', '89', '20'),
	('2023-12-23', '570', '89', '21'),
	('2023-12-11', '350', '89', '22'),
	('2023-12-17', '140', '89', '23'),
	('2023-12-19', '800', '89', '24'),
	('2023-12-17', '345', '89', '25'),
	('2023-12-25', '2281', '173', '7'),
	('2023-12-24', '100', '173', '8'),
	('2023-12-16', '0', '173', '9'),
	('2023-12-24', '50', '173', '10'),
	('2023-12-21', '0', '173', '11'),
	('2023-12-24', '0', '173', '12'),
	('2023-12-09', '50', '173', '13'),
	('2023-12-22', '510', '173', '14'),
	('2023-12-04', '150', '173', '15'),
	('2023-12-23', '100', '173', '16'),
	('2023-12-17', '250', '173', '17'),
	('2023-12-11', '142', '173', '18'),
	('2023-12-10', '358', '173', '19'),
	('2023-12-16', '379', '173', '20'),
	('2023-12-21', '355', '173', '21'),
	('2023-12-22', '350', '173', '22'),
	('2023-12-10', '260', '173', '23'),
	('2023-12-08', '0', '173', '24'),
	('2023-12-11', '345', '173', '25'),
	('2023-12-22', '2074', '188', '7'),
	('2023-12-21', '200', '188', '8'),
	('2023-12-11', '100', '188', '9'),
	('2023-12-18', '0', '188', '10'),
	('2023-12-20', '230', '188', '11'),
	('2023-12-05', '150', '188', '12'),
	('2023-12-19', '100', '188', '13'),
	('2023-12-08', '170', '188', '14'),
	('2023-12-16', '50', '188', '15'),
	('2023-12-17', '75', '188', '16'),
	('2023-12-18', '277', '188', '17'),
	('2023-12-14', '152', '188', '18'),
	('2023-12-09', '488', '188', '19'),
	('2023-12-08', '468', '188', '20'),
	('2023-12-14', '232', '188', '21'),
	('2023-12-06', '0', '188', '22'),
	('2023-12-20', '180', '188', '23'),
	('2023-12-06', '800', '188', '24'),
	('2023-12-22', '345', '188', '25'),
	('2023-12-24', '2245', '233', '7'),
	('2023-12-12', '0', '233', '8'),
	('2023-12-20', '50', '233', '9'),
	('2023-12-21', '0', '233', '10'),
	('2023-12-12', '0', '233', '11'),
	('2023-12-14', '15', '233', '12'),
	('2023-12-07', '50', '233', '13'),
	('2023-12-22', '0', '233', '14'),
	('2023-12-16', '100', '233', '15'),
	('2023-12-25', '100', '233', '16'),
	('2023-12-13', '321', '233', '17'),
	('2023-12-25', '192', '233', '18'),
	('2023-12-14', '281', '233', '19'),
	('2023-12-13', '378', '233', '20'),
	('2023-12-04', '297', '233', '21'),
	('2023-12-21', '350', '233', '22'),
	('2023-12-10', '200', '233', '23'),
	('2023-12-05', '800', '233', '24'),
	('2023-12-19', '230', '233', '25'),
	('2023-12-09', '2253', '299', '7'),
	('2023-12-07', '100', '299', '8'),
	('2023-12-24', '0', '299', '9'),
	('2023-12-12', '50', '299', '10'),
	('2023-12-07', '230', '299', '11'),
	('2023-12-17', '15', '299', '12'),
	('2023-12-05', '0', '299', '13'),
	('2023-12-24', '340', '299', '14'),
	('2023-12-08', '150', '299', '15'),
	('2023-12-07', '50', '299', '16'),
	('2023-12-17', '441', '299', '17'),
	('2023-12-19', '142', '299', '18'),
	('2023-12-07', '350', '299', '19'),
	('2023-12-18', '365', '299', '20'),
	('2023-12-12', '539', '299', '21'),
	('2023-12-04', '0', '299', '22'),
	('2023-12-15', '160', '299', '23'),
	('2023-12-06', '800', '299', '24'),
	('2023-12-12', '460', '299', '25'),
	('2023-12-11', '2309', '332', '7'),
	('2023-12-25', '200', '332', '8'),
	('2023-12-16', '0', '332', '9'),
	('2023-12-08', '100', '332', '10'),
	('2023-12-25', '115', '332', '11'),
	('2023-12-21', '105', '332', '12'),
	('2023-12-23', '50', '332', '13'),
	('2023-12-15', '340', '332', '14'),
	('2023-12-24', '100', '332', '15'),
	('2023-12-25', '25', '332', '16'),
	('2023-12-11', '290', '332', '17'),
	('2023-12-10', '187', '332', '18'),
	('2023-12-06', '469', '332', '19'),
	('2023-12-22', '203', '332', '20'),
	('2023-12-21', '444', '332', '21'),
	('2023-12-05', '0', '332', '22'),
	('2023-12-15', '20', '332', '23'),
	('2023-12-07', '0', '332', '24'),
	('2023-12-13', '460', '332', '25'),
	('2023-12-22', '2915', '361', '7'),
	('2023-12-04', '200', '361', '8'),
	('2023-12-15', '50', '361', '9'),
	('2023-12-18', '0', '361', '10'),
	('2023-12-12', '115', '361', '11'),
	('2023-12-25', '150', '361', '12'),
	('2023-12-10', '0', '361', '13'),
	('2023-12-15', '510', '361', '14'),
	('2023-12-09', '200', '361', '15'),
	('2023-12-10', '75', '361', '16'),
	('2023-12-07', '285', '361', '17'),
	('2023-12-15', '172', '361', '18'),
	('2023-12-05', '404', '361', '19'),
	('2023-12-23', '264', '361', '20'),
	('2023-12-24', '445', '361', '21'),
	('2023-12-08', '1050', '361', '22'),
	('2023-12-05', '260', '361', '23'),
	('2023-12-20', '0', '361', '24'),
	('2023-12-04', '115', '361', '25'),
	('2023-12-08', '2893', '382', '7'),
	('2023-12-08', '100', '382', '8'),
	('2023-12-05', '50', '382', '9'),
	('2023-12-15', '50', '382', '10'),
	('2023-12-16', '0', '382', '11'),
	('2023-12-16', '60', '382', '12'),
	('2023-12-24', '50', '382', '13'),
	('2023-12-24', '340', '382', '14'),
	('2023-12-12', '50', '382', '15'),
	('2023-12-06', '25', '382', '16'),
	('2023-12-13', '371', '382', '17'),
	('2023-12-05', '108', '382', '18'),
	('2023-12-04', '247', '382', '19'),
	('2023-12-05', '203', '382', '20'),
	('2023-12-14', '408', '382', '21'),
	('2023-12-11', '1050', '382', '22'),
	('2023-12-19', '260', '382', '23'),
	('2023-12-14', '800', '382', '24'),
	('2023-12-22', '115', '382', '25'),
	('2023-12-07', '2709', '421', '7'),
	('2023-12-16', '100', '421', '8'),
	('2023-12-11', '50', '421', '9'),
	('2023-12-24', '100', '421', '10'),
	('2023-12-18', '0', '421', '11'),
	('2023-12-16', '150', '421', '12'),
	('2023-12-04', '0', '421', '13'),
	('2023-12-07', '510', '421', '14'),
	('2023-12-16', '150', '421', '15'),
	('2023-12-12', '25', '421', '16'),
	('2023-12-15', '233', '421', '17'),
	('2023-12-17', '188', '421', '18'),
	('2023-12-19', '243', '421', '19'),
	('2023-12-07', '329', '421', '20'),
	('2023-12-21', '318', '421', '21'),
	('2023-12-24', '350', '421', '22'),
	('2023-12-11', '160', '421', '23'),
	('2023-12-25', '400', '421', '24'),
	('2023-12-23', '345', '421', '25'),
	('2023-12-20', '2379', '423', '7'),
	('2023-12-14', '0', '423', '8'),
	('2023-12-21', '50', '423', '9'),
	('2023-12-25', '50', '423', '10'),
	('2023-12-16', '115', '423', '11'),
	('2023-12-20', '150', '423', '12'),
	('2023-12-24', '100', '423', '13'),
	('2023-12-15', '510', '423', '14'),
	('2023-12-06', '0', '423', '15'),
	('2023-12-06', '75', '423', '16'),
	('2023-12-20', '450', '423', '17'),
	('2023-12-16', '151', '423', '18'),
	('2023-12-08', '210', '423', '19'),
	('2023-12-11', '469', '423', '20'),
	('2023-12-17', '326', '423', '21'),
	('2023-12-05', '1050', '423', '22'),
	('2023-12-07', '20', '423', '23'),
	('2023-12-05', '0', '423', '24'),
	('2023-12-14', '345', '423', '25'),
	('2023-12-15', '2588', '435', '7'),
	('2023-12-24', '100', '435', '8'),
	('2023-12-22', '50', '435', '9'),
	('2023-12-05', '0', '435', '10'),
	('2023-12-23', '115', '435', '11'),
	('2023-12-22', '0', '435', '12'),
	('2023-12-21', '0', '435', '13'),
	('2023-12-24', '170', '435', '14'),
	('2023-12-12', '100', '435', '15'),
	('2023-12-06', '75', '435', '16'),
	('2023-12-25', '296', '435', '17'),
	('2023-12-19', '102', '435', '18'),
	('2023-12-07', '351', '435', '19'),
	('2023-12-18', '438', '435', '20'),
	('2023-12-11', '544', '435', '21'),
	('2023-12-05', '1050', '435', '22'),
	('2023-12-14', '40', '435', '23'),
	('2023-12-11', '800', '435', '24'),
	('2023-12-15', '460', '435', '25');
```
