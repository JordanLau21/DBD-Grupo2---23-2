import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Empleado} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-registrarempleado',
  templateUrl: './registrarempleado.component.html',
  styleUrls: ['./registrarempleado.component.scss']
})
export class RegistrarempleadoComponent implements OnInit{
  id_empresa: number=1;

  nombres: string="";
  apellidos: string="";
  fecha_nacimiento: string="";
  edad: number=0;
  telefono: number=0;
  email: string="";
  direccion: string="";
  dni: number=0;
  estado_civil: string="";
  sexo: string="";
  menores_cargo: number=0;
  id_regimen_pensionario: number=1;
  id_seguro_medico: number=1;
  id_situacion_discapacidad: number=1;
  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("registrar empleado");
    console.log(this.id_empresa);
  }
  registrar() {
    const empleado: Empleado = {
      nombres: this.nombres,
      apellidos: this.apellidos,
      fecha_nacimiento: this.fecha_nacimiento,
      edad: this.edad,
      telefono: this.telefono,
      email: this.email,
      direccion: this.direccion,
      dni: this.dni,
      estado_civil: this.estado_civil,
      sexo: this.sexo,
      menores_cargo: this.menores_cargo,
      id_regimen_pensionario: this.id_regimen_pensionario,
      id_seguro_medico: this.id_seguro_medico,
      id_situacion_discapacidad: this.id_situacion_discapacidad,
      id_empresa: this.id_empresa
    }
    this.api.registrarEmpleado(empleado).subscribe(data =>{
        console.log("SE REGISTRO AL EMPLEADO")
        console.log(data.nombres)
      }
    )
    console.log(this.nombres)
  }

}
