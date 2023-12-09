import {Component, OnInit} from '@angular/core';
import {BoletaEmpleado, Movimiento} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-detalleboleta',
  templateUrl: './detalleboleta.component.html',
  styleUrls: ['./detalleboleta.component.scss']
})
export class DetalleboletaComponent implements OnInit{
  id_empresa: number=1;
  id_boleta: number=1;
  monto_emitido: number=1;
  id_planilla: number=1;
  cantidad_boletas: number=0;
  periodo: string="";

  lista: BoletaEmpleado[]=[];
  ingresos: Movimiento[]=[];
  descuentos: Movimiento[]=[];
  aportes: Movimiento[]=[];
  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {

    this.id_boleta=Number(this.activateRoute.snapshot.paramMap.get('id_boleta'));
    console.log(this.id_boleta);
    console.log(this.lista)
    let indice=0;
    let cant=0;
    while (this.lista[indice]!=null){
      cant++;
      indice++;
    }
    this.cantidad_boletas=cant;
  }

}
