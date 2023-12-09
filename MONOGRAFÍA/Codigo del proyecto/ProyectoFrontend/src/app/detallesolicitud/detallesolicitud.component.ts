import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {DetalleSolicitud} from "../../interfaces";

@Component({
  selector: 'app-detallesolicitud',
  templateUrl: './detallesolicitud.component.html',
  styleUrls: ['./detallesolicitud.component.scss']
})
export class DetallesolicitudComponent implements OnInit{
  id_solicitud: number=1;
  id_empresa: number=1;

  nombres: string="";
  apellidos: string="";
  dni: number=1;
  fecha_solicitud: string="";
  hora_solicitud: string="";
  tipo_solicitud: string="";
  detalle: string="";
  estado: string="";

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_solicitud=Number(this.activateRoute.snapshot.paramMap.get('id_solicitud'));
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    this.api.obtenerDetalleSolicitud(this.id_solicitud).subscribe(data => {
      this.nombres=data.nombres;
      this.apellidos=data.apellidos;
      this.dni=data.dni;
      this.fecha_solicitud=data.fecha_solicitud;
      this.hora_solicitud=data.hora_solicitud;
      this.tipo_solicitud=data.tipo_solicitud;
      this.detalle=data.detalle;
      this.estado=data.estado;
      console.log(this.id_solicitud)
    });
    console.log(this.id_solicitud)
  }
}
