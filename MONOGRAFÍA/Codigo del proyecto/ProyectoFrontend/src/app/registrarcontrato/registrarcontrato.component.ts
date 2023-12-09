import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {Contrato, Empleado} from "../../interfaces";

@Component({
  selector: 'app-registrarcontrato',
  templateUrl: './registrarcontrato.component.html',
  styleUrls: ['./registrarcontrato.component.scss']
})
export class RegistrarcontratoComponent implements OnInit{
  id_empresa: number=1;
  id_empleado: number=1;

  fecha_firma_contrato: string="";
  fecha_inicio_laboral: string="";
  fecha_termino_contrato: string="";
  sueldo_base: number=0;
  liquido_teorico: number=0;
  id_area: number=0;
  id_cargo: number=0;
  id_estado_contrato: number=0;
  id_tipo_contrato: number=0;
  id_tipo_jornada: number=0;
  id_frecuencia_pago: number=0;
  id_medio_pago: number=0;

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    this.id_empleado=Number(this.activateRoute.snapshot.paramMap.get('id_empleado'));
    console.log("imprimiendo el id cuenta");
    console.log(this.id_empresa);
  }
  registrar() {
    const contrato: Contrato = {
      fecha_firma_contrato: this.fecha_firma_contrato,
      fecha_inicio_laboral: this.fecha_inicio_laboral,
      fecha_termino_contrato: this.fecha_termino_contrato,
      sueldo_base: this.sueldo_base,
      liquido_teorico: this.liquido_teorico,
      id_area: this.id_area,
      id_cargo: this.id_cargo,
      id_empleado: this.id_empleado,
      id_estado_contrato: this.id_estado_contrato,
      id_tipo_contrato: this.id_tipo_contrato,
      id_tipo_jornada: this.id_tipo_jornada,
      id_frecuencia_pago: this.id_frecuencia_pago,
      id_medio_pago: this.id_medio_pago
    }
    this.api.registrarContrato(contrato).subscribe(data => {
        console.log("<====RESPUESTA=====>")
      }
    )
    console.log(this.id_area)
  }
}
