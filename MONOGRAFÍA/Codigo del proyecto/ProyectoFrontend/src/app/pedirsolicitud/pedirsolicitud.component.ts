import {Component, OnInit} from '@angular/core';
import {Empleado, Solicitud, SolicitudesEmpleado} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-pedirsolicitud',
  templateUrl: './pedirsolicitud.component.html',
  styleUrls: ['./pedirsolicitud.component.scss']
})
export class PedirsolicitudComponent implements OnInit{
  id_empresa: number=1;
  id_empleado: number=1;
  id_tipo_solicitud: number=1;
  descripcion: string="";


  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empleado=Number(this.activateRoute.snapshot.paramMap.get('id_empleado'));
    console.log("registrar empleado");
    console.log(this.id_empresa);
  }
  registrar() {
    const solicitud: Solicitud = {
      id_empleado: this.id_empleado,
      id_tipo_solicitud: this.id_tipo_solicitud,
      descripcion: this.descripcion,
      id_empresa: this.id_empresa
    }
    this.api.registrarSolicitud(solicitud).subscribe(data =>{
        console.log("SE REGISTRO A LA SOLICITUD")
      }
    )
  }

}
