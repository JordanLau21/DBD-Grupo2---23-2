import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {Contrato, RespuestaContrato} from "../../interfaces";
import {compareNumbers} from "@angular/compiler-cli/src/version_helpers";

@Component({
  selector: 'app-movimientosplanilla',
  templateUrl: './movimientosplanilla.component.html',
  styleUrls: ['./movimientosplanilla.component.scss']
})
export class MovimientosplanillaComponent implements OnInit{
  id_empresa: number=1;

  lista: RespuestaContrato[]=[];

  fecha_inicio: string="";
  fecha_fin: string="";

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id cuenta");
    console.log(this.id_empresa);
  }

  filtrar() {
    this.api.obtenerContratos(this.fecha_inicio, this.fecha_fin).subscribe(data => {
      this.lista = data.contratos;
    });
  }
}
