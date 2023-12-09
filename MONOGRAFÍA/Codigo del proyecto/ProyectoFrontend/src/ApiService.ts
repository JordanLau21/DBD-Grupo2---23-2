import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable, throwError} from "rxjs";

import {catchError, retry} from "rxjs/operators";
import {
  Area, BoletasPago,
  Cargo,
  Contrato,
  Cuenta,
  DetalleSolicitud,
  Empleado,
  FiltroContrato,
  Planillaregistro,
  Planillas,
  RespuestaArea, RespuestaBoletasEmpleados,
  RespuestaBoletasPago,
  RespuestaCargos,
  RespuestaColaboradores,
  RespuestaContrato,
  RespuestaCuentas,
  RespuestaMovimientos,
  RespuestaMovimientosDescuentos,
  RespuestaMovimientosIngresos,
  RespuestaPlanillas,
  RespuestaSolicitudesEmpleado,
  RespuestaSolicitudesEmpresa,
  RespuestaVigentes,
  Solicitud,
  SolicitudesEmpresa
} from "./interfaces";

@Injectable({
  providedIn: 'root'
})

@Injectable({providedIn: 'root'})
export class ApiService {
  httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json;charset=utf-8'})};

  constructor(private http: HttpClient) {
  }

  errorHandl(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

  // LOGEO
  obtenerCuentasEmpresa(): Observable<RespuestaCuentas> {
    return this.http.post<RespuestaCuentas>('http://localhost:8080/obtenerCuentasEmpresa', null,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  // SOLICITUDES
  obtenerSolicitudesEmpresa(id_empresa: number): Observable<RespuestaSolicitudesEmpresa> {
    return this.http.post<RespuestaSolicitudesEmpresa>('http://localhost:8080/obtenerSolicitudesEmpresa', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerDetalleSolicitud(id_solicitud: number): Observable<DetalleSolicitud> {
    return this.http.post<DetalleSolicitud>('http://localhost:8080/obtenerDetalleSolicitud', id_solicitud,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerSolicitudesEmpleado(id_empleado: number) {
    return this.http.post<RespuestaSolicitudesEmpleado>('http://localhost:8080/obtenerSolicitudesEmpleado', id_empleado,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  registrarSolicitud(solicitud: Solicitud) {
    return this.http.post<RespuestaSolicitudesEmpleado>('http://localhost:8080/registrarSolicitud', solicitud,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }


  // EMPLEADOS

  registrarEmpleado(data: Empleado): Observable<Empleado> {
    return this.http.post<Empleado>("http://localhost:8080/registrarEmpleado", data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  registrarContrato(data: Contrato): Observable<Contrato> {
    return this.http.post<Contrato>("http://localhost:8080/registrarContrato", data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  obtenerEmpleadosVigentes(id_empresa: number): Observable<RespuestaVigentes> {
    return this.http.post<RespuestaVigentes>('http://localhost:8080/obtenerEmpleadosVigentes', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerEmpleadoDesvinculados(id_empresa: number): Observable<RespuestaVigentes> {
    return this.http.post<RespuestaVigentes>('http://localhost:8080/obtenerEmpleadosDesvinculados', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }



  // MOVIMIENTOS

  obtenerContratos(fecha_inicio: string, fecha_fin: string): Observable<FiltroContrato> {
    return this.http.post<FiltroContrato>('http://localhost:8080/obtenerContratos', fecha_fin,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerMovimientosContratoDes(id_contrato: number) {
    return this.http.post<RespuestaMovimientos>('http://localhost:8080/obtenerMovimientosContratoDes', id_contrato,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerMovimientosContratoIng(id_contrato: number) {
    return this.http.post<RespuestaMovimientos>('http://localhost:8080/obtenerMovimientosContratoIng', id_contrato,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }


  //ORGANIZACION

  obtenerAreasEmpresa(id_empresa: number) {
    return this.http.post<RespuestaArea>('http://localhost:8080/obtenerAreasEmpresa', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerCargosEmpresa(id_empresa: number) {
    return this.http.post<RespuestaCargos>('http://localhost:8080/obtenerCargosEmpresa', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  registrarArea(area: Area) {
    return this.http.post<Area>('http://localhost:8080/registrarArea', area,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  registrarCargo(cargo: Cargo) {
    return this.http.post<Cargo>('http://localhost:8080/registrarCargo', cargo,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  // PLANILLA

  obtenerPlanillas(id_empresa: number): Observable<RespuestaPlanillas> {
    return this.http.post<RespuestaPlanillas>('http://localhost:8080/obtenerPlanillas', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }


  obtenerBoletasPago(id_empresa: number) {
    return this.http.post<RespuestaBoletasPago>('http://localhost:8080/obtenerBoletasPago', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerColaboradores(id_planilla: number) {
    return this.http.post<RespuestaColaboradores>('http://localhost:8080/obtenerColaboradores', id_planilla,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerDatosPlanilla(id_planilla: number) {
    return this.http.post<Planillas>('http://localhost:8080/obtenerDatosPlanilla', id_planilla,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  registrarPlanilla(planilla: Planillaregistro) {
    return this.http.post<Planillas>('http://localhost:8080/registrarPlanilla', planilla,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerdatosBoleta(id_planilla: number) {
    return this.http.post<BoletasPago>('http://localhost:8080/obtenerBoleta', id_planilla,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  obtenerBoletasEmpleados(id_planilla: number) {
    return this.http.post<RespuestaBoletasEmpleados>('http://localhost:8080/obtenerBoletasEmpleados', id_planilla,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }
}
