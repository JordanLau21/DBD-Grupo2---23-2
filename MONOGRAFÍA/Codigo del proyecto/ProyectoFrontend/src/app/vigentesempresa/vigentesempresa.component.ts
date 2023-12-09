import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {EmpleadoEmpresa, RespuestaContrato, RespuestaVigentes} from "../../interfaces";

@Component({
  selector: 'app-vigentesempresa',
  templateUrl: './vigentesempresa.component.html',
  styleUrls: ['./vigentesempresa.component.scss']
})
export class VigentesempresaComponent implements OnInit{
  id_empresa: number=2;

  lista: EmpleadoEmpresa[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empleado");
    console.log(this.id_empresa);
    this.api.obtenerEmpleadosVigentes(this.id_empresa).subscribe(data => {
      this.lista = data.vigentes,
      console.log(this.lista)
    });
  }
}
