import {Component, OnInit} from '@angular/core';
import {Empleado, Movimiento, RespuestaContrato} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-vermovimientos',
  templateUrl: './vermovimientos.component.html',
  styleUrls: ['./vermovimientos.component.scss']
})
export class VermovimientosComponent implements OnInit{
  indice: number=1;
  id_contrato: number=1;

  datos: Empleado[]=[];
  ingresos: Movimiento[]=[];
  descuentos: Movimiento[]=[];
  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_contrato=Number(this.activateRoute.snapshot.paramMap.get('id_contrato'));
    console.log("imprimiendo el id cuenta");
    this.api.obtenerMovimientosContratoIng(this.id_contrato).subscribe(data => {
      this.ingresos = data.movimientos,
        console.log(this.ingresos)
    });
    this.api.obtenerMovimientosContratoDes(this.id_contrato).subscribe(data => {
      this.descuentos = data.movimientos,
        console.log(this.descuentos)
    });
  }

}
