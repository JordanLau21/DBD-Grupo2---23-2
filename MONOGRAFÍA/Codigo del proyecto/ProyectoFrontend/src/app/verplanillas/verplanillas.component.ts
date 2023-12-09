import {Component, OnInit} from '@angular/core';
import {EmpleadoEmpresa, Planillas} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-verplanillas',
  templateUrl: './verplanillas.component.html',
  styleUrls: ['./verplanillas.component.scss']
})
export class VerplanillasComponent implements OnInit{
  id_empresa: number=2;

  lista: Planillas[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empresa");
    console.log(this.id_empresa);
    this.api.obtenerPlanillas(this.id_empresa).subscribe(data => {
      this.lista = data.planillas,
        console.log(this.lista)
    });
  }
}
