import {Component, OnInit} from '@angular/core';
import {ApiService} from "../../ApiService";
import {Empleado} from "../../interfaces";

@Component({
  selector: 'app-registrarempleado',
  templateUrl: './registrarempleado.component.html',
  styleUrls: ['./registrarempleado.component.scss']
})
export class RegistrarempleadoComponent implements OnInit{
  id_empleado: number=0;
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
  id_regimen_pensionario: number=-1;
  id_seguro_medico: number=-1;
  id_situacion_discapacidad: number=-1;
  id_empresa: number=-1;
  id_cuenta: number=-1;
  constructor(private api: ApiService) {
  }
  ngOnInit(): void{

  }

  registrar() {
    console.log(this.id_empleado);
    console.log(this.nombres);

    const empleado: Empleado = {
      id_empleado: this.id_empleado,
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
      id_regimen_pensionario: this.id_regimen_pensionario,
      id_seguro_medico: this.id_seguro_medico,
      id_situacion_discapacidad: this.id_situacion_discapacidad,
      id_empresa: this.id_empresa,
      id_cuenta: this.id_cuenta
    }

    this.api.registrarEmpleado(empleado).subscribe(data =>{
        console.log("<====RESPUESTA=====>")
        console.log(data.nombres)
      }
    )
  }
}
