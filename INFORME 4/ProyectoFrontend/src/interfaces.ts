export interface Cuenta{
  id_cuenta: number;
  usuario: string;
  contrasenia: string;
  rol: string;
  id_estado: number;
}
export interface RespuestaCuentas{
  cuentas: Cuenta[];
}
export interface Movimiento{
  id_movimiento: number;
  fecha: Date;
  monto: number;
  id_contrato: number;
  id_nomina: number;
}
export interface RespuestaMovimientos{
  movimientos: Movimiento[];
}
export interface Empleado{
  nombres: string;
  apellidos: string;
  fecha_nacimiento: string;
  edad: number;
  telefono: number;
  email: string;
  direccion: string;
  dni: number;
  estado_civil: string;
  sexo: string;
  menores_cargo: number;
  id_regimen_pensionario: number;
  id_seguro_medico: number;
  id_situacion_discapacidad: number;
  id_empresa: number;
}
export interface EmpleadoEmpresa{
  id_empleado: number;
  dni: number;
  nombres: string;
  apellidos: string;
  telefono: number;
  email: string;
}
export interface RespuestaVigentes{
  vigentes: EmpleadoEmpresa[];
}

export interface Contrato{
  fecha_firma_contrato: string;
  fecha_inicio_laboral: string;
  fecha_termino_contrato: string;
  sueldo_base: number;
  liquido_teorico: number;
  id_area: number;
  id_cargo: number;
  id_empleado: number;
  id_estado_contrato: number;
  id_tipo_contrato: number;
  id_tipo_jornada: number;
  id_frecuencia_pago: number;
  id_medio_pago: number;
}
export interface RespuestaContrato{
  id_contrato: number;
  dni: number;
  nombres: string;
  apellidos: string;
  cargo: string;
  inicio_contrato: string;
  fin_contrato: string;
}
export interface FiltroContrato{
  contratos: RespuestaContrato[];
}
export interface SolicitudesEmpresa{
  id_solicitud: number;
  nombres: string;
  apellidos: string;
  fecha_solicitud: number;
  tipo_solicitud: number;
  estado: string;
}
export interface RespuestaSolicitudesEmpresa{
  solicitudes: SolicitudesEmpresa[];
}
export interface DetalleSolicitud{
  nombres: string;
  apellidos: string;
  dni: number;
  fecha_solicitud: string;
  hora_solicitud: string;
  tipo_solicitud: string;
  detalle: string;
  estado: string;
}
export interface Planillas{
  id_planilla: number;
  fecha: string;
  periodo: string;
  periodicidad: string;
}
export interface RespuestaPlanillas{
  planillas: Planillas[];
}
