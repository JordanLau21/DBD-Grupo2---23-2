import {Component, OnInit} from '@angular/core';
import {Cargo} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-cargos',
  templateUrl: './cargos.component.html',
  styleUrls: ['./cargos.component.scss']
})
export class CargosComponent implements OnInit{
  id_empresa: number=2;

  lista: Cargo[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empleado");
    console.log(this.id_empresa);
    this.api.obtenerCargosEmpresa(this.id_empresa).subscribe(data => {
      this.lista = data.cargos,
        console.log(this.lista)
    });
  }
}
