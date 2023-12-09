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
// SOLICITUDES

export interface Solicitud{
  id_empleado: number;
  id_tipo_solicitud: number;
  descripcion: string;
  id_empresa: number;
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
export interface SolicitudesEmpleado{
  id_solicitud: number;
  fecha_solicitud: number;
  tipo_solicitud: number;
  estado: string;
}
export interface RespuestaSolicitudesEmpleado{
  solicitudes: SolicitudesEmpleado[];
}

//EMPLEADOS

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

// ORGANIZACION

export interface Area{
  id_area: number;
  nombre: string;
  descripcion: string;
  estado: string;
  id_empresa: number;
}
export interface RespuestaArea{
  areas: Area[]
}

export interface Cargo{
  id_cargo: number;
  nombre: string;
  descripcion: string;
  requerimientos: string;
  estado: string;
  id_empresa: number;
}
export interface RespuestaCargos{
  cargos: Cargo[]
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

// PLANILLA

export interface Planillas{
  id_planilla: number;
  fecha: string;
  periodo: string;
  periodicidad: string;
}
export interface RespuestaPlanillas{
  planillas: Planillas[];
}

export interface BoletasPago{
  id_boleta: number;
  fecha: string;
  periodo: string;
  monto_emitido: number;
}

export interface RespuestaBoletasPago{
  boletas: BoletasPago[];
}

export interface BoletaEmpleado{
  nombres: string;
  apellidos: string;
  monto_emitido: number;
  id_boleta: number;
}
export interface RespuestaBoletasEmpleados{
  boletas: BoletaEmpleado[]
}


export interface Colaborador{
  id_empleado: number;
  nombre: string;
  apellidos: string;
  fecha: string;
  cargo: string;
}
export interface RespuestaColaboradores{
  colaboradores: Colaborador[]
}

export interface Planillaregistro{
  periodo: string;
  periodicidad: string;
  fecha_inicio: string;
  fecha_fin: string;
}


// MOVIMIENTOS

export interface Movimiento{
  id_movimiento: number;
  nombre_nomina: string;
  fecha: string;
  monto: number;
  id_nomina: number;
}

export interface RespuestaMovimientosIngresos{
  ingresos: Movimiento[]
}
export interface RespuestaMovimientosDescuentos{
  descuentos: Movimiento[]
}
export interface RespuestaMovimientos{
  movimientos: Movimiento[];
}




