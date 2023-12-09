import {Component, OnInit} from '@angular/core';
import {BoletaEmpleado, BoletasPago} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-detalleboletaspago',
  templateUrl: './detalleboletaspago.component.html',
  styleUrls: ['./detalleboletaspago.component.scss']
})
export class DetalleboletaspagoComponent implements OnInit{
  id_empresa: number=1;
  monto_emitido: number=1;
  id_planilla: number=1;
  cantidad_boletas: number=0;
  periodo: string="";

  lista: BoletaEmpleado[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log(this.id_empresa);
    this.api.obtenerdatosBoleta(this.id_planilla).subscribe(data => {
      this.id_planilla=data.id_boleta;
      this.periodo=data.periodo;
      this.monto_emitido=data.monto_emitido;
    });
    this.api.obtenerBoletasEmpleados(this.id_planilla).subscribe(data => {
      this.lista=data.boletas;
    });
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
