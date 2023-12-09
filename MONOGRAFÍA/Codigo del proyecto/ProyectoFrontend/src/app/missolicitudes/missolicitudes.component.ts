import {Component, OnInit} from '@angular/core';
import {SolicitudesEmpleado, SolicitudesEmpresa} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-missolicitudes',
  templateUrl: './missolicitudes.component.html',
  styleUrls: ['./missolicitudes.component.scss']
})
export class MissolicitudesComponent implements OnInit{
  id_empresa: number=1;
  id_empleado: number=1;

  lista: SolicitudesEmpleado[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empleado=Number(this.activateRoute.snapshot.paramMap.get('id_empleado'));
    this.api.obtenerSolicitudesEmpleado(this.id_empleado).subscribe(data => {
      this.lista = data.solicitudes;
    });
    console.log(this.lista)
  }
}
