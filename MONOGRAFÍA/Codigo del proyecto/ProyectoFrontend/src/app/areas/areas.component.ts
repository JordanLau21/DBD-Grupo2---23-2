import {Component, OnInit} from '@angular/core';
import {Area, EmpleadoEmpresa} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-areas',
  templateUrl: './areas.component.html',
  styleUrls: ['./areas.component.scss']
})
export class AreasComponent implements OnInit{
  id_empresa: number=2;

  lista: Area[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empleado");
    console.log(this.id_empresa);
    this.api.obtenerAreasEmpresa(this.id_empresa).subscribe(data => {
      this.lista = data.areas,
        console.log(this.lista)
    });
  }
}
