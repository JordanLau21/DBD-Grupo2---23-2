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

  fecha_inicio: string="02/10/2022";
  fecha_fin: string="01/01/2023";

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empresa");
    console.log(this.id_empresa);
    this.filtrar();
  }

  filtrar() {
    this.api.obtenerContratos(this.fecha_inicio, this.fecha_fin).subscribe(data => {
      this.lista = data.contratos;
    });
  }
}
