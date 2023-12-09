import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {Cargo} from "../../interfaces";

@Component({
  selector: 'app-nuevocargo',
  templateUrl: './nuevocargo.component.html',
  styleUrls: ['./nuevocargo.component.scss']
})
export class NuevocargoComponent implements OnInit{
  id_empresa: number=1;
  nombre: string="";
  descripcion: string="";
  requerimientos: string="";

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("registrar empleado");
    console.log(this.id_empresa);
  }
  registrar() {
    const cargo: Cargo = {
      id_cargo: 1,
      nombre: this.nombre,
      descripcion: this.descripcion,
      requerimientos: this.requerimientos,
      estado: "Activo",
      id_empresa: this.id_empresa
    }
    this.api.registrarCargo(cargo).subscribe(data =>{
        console.log("SE REGISTRO AL AREA")
      }
    )
  }
}
