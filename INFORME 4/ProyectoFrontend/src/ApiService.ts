import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable, throwError} from "rxjs";

import {catchError, retry} from "rxjs/operators";
import {
  Contrato,
  Cuenta, DetalleSolicitud,
  Empleado,
  FiltroContrato,
  RespuestaContrato,
  RespuestaCuentas, RespuestaPlanillas, RespuestaSolicitudesEmpresa, RespuestaVigentes,
  SolicitudesEmpresa
} from "./interfaces";


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

  // 1
  obtenerCuentasEmpresa(): Observable<RespuestaCuentas> {
    return this.http.post<RespuestaCuentas>('http://localhost:8080/obtenerCuentasEmpresa', null,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  // 2
  obtenerSolicitudesEmpresa(id_empresa: number): Observable<RespuestaSolicitudesEmpresa> {
    return this.http.post<RespuestaSolicitudesEmpresa>('http://localhost:8080/obtenerSolicitudesEmpresa', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }
  //3
  obtenerDetalleSolicitud(id_solicitud: number): Observable<DetalleSolicitud> {
    return this.http.post<DetalleSolicitud>('http://localhost:8080/obtenerDetalleSolicitud', id_solicitud,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }
  //4
  registrarEmpleado(data: Empleado): Observable<Empleado> {
    return this.http.post<Empleado>("http://localhost:8080/registrarEmpleado", data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }
  //5
  registrarContrato(data: Contrato): Observable<Contrato> {
    return this.http.post<Contrato>("http://localhost:8080/registrarContrato", data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  //6
  obtenerEmpleadosVigentes(id_empresa: number): Observable<RespuestaVigentes> {
    return this.http.post<RespuestaVigentes>('http://localhost:8080/obtenerEmpleadosVigentes', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  //7
  obtenerEmpleadoDesvinculados(id_empresa: number): Observable<RespuestaVigentes> {
    return this.http.post<RespuestaVigentes>('http://localhost:8080/obtenerEmpleadoDesvinculados', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  //8
  obtenerPlanillas(id_empresa: number): Observable<RespuestaPlanillas> {
    return this.http.post<RespuestaPlanillas>('http://localhost:8080/obtenerPlanillas', id_empresa,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }





  obtenerContratos(fecha_inicio: string, fecha_fin: string): Observable<FiltroContrato> {
    return this.http.post<FiltroContrato>('http://localhost:8080/obtenerContratos', null,
      this.httpOptions)
      .pipe(retry(1), catchError(this.errorHandl));
  }

  //



}
