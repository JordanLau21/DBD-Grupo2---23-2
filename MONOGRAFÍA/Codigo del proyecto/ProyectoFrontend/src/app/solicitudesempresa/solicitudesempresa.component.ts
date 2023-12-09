import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {RespuestaContrato, SolicitudesEmpresa} from "../../interfaces";

@Component({
  selector: 'app-solicitudesempresa',
  templateUrl: './solicitudesempresa.component.html',
  styleUrls: ['./solicitudesempresa.component.scss']
})
export class SolicitudesempresaComponent implements OnInit{
  id_empresa: number=1;
  lista: SolicitudesEmpresa[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id cuenta");
    console.log(this.id_empresa);
    this.api.obtenerSolicitudesEmpresa(this.id_empresa).subscribe(data => {
      this.lista = data.solicitudes;
    });
    console.log(this.lista)
  }
}
