import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {Area} from "../../interfaces";

@Component({
  selector: 'app-nuevoarea',
  templateUrl: './nuevoarea.component.html',
  styleUrls: ['./nuevoarea.component.scss']
})
export class NuevoareaComponent implements OnInit{
  id_empresa: number=1;
  nombre: string="";
  descripcion: string="";

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("registrar empleado");
    console.log(this.id_empresa);
  }
  registrar() {
    const area: Area = {
      id_area: 1,
      nombre: this.nombre,
      descripcion: this.descripcion,
      estado: "Activo",
      id_empresa: this.id_empresa
    }
    this.api.registrarArea(area).subscribe(data =>{
        console.log("SE REGISTRO AL AREA")
      }
    )
  }
}
