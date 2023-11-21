import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable, throwError} from "rxjs";

import {catchError, retry} from "rxjs/operators";
import {Empleado} from "./interfaces";


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

  registrarEmpleado(data: Empleado): Observable<Empleado> {
    return this.http.post<Empleado>("http://localhost:8080/registrarEmpleado", data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }
}
