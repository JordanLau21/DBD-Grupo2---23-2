import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {Colaborador} from "../../interfaces";

@Component({
  selector: 'app-detalleplanilla',
  templateUrl: './detalleplanilla.component.html',
  styleUrls: ['./detalleplanilla.component.scss']
})
export class DetalleplanillaComponent implements OnInit{
  id_planilla: number=1;
  id_empresa: number=1;

  cantidad_colaboradores: number=1;
  periodicidad: string="";
  periodo: string="";

  lista: Colaborador[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa =Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empresa");
    this.id_planilla=Number(this.activateRoute.snapshot.paramMap.get('id_planilla'));
    console.log("imprimiendo el id cuenta");
    this.api.obtenerDatosPlanilla(this.id_planilla).subscribe(data => {
      this.id_planilla = data.id_planilla;
      this.periodicidad = data.periodicidad;
      this.periodo = data.periodo;

    });
    this.api.obtenerColaboradores(this.id_planilla).subscribe(data => {
      this.lista = data.colaboradores;
    });
    let indice = 0;
    let cant = 0;
    while(this.lista[indice]!=null){
      cant=cant+1;
      indice++;
    }
    this.cantidad_colaboradores=cant;
  }
}
