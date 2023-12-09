import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {Planillaregistro, Planillas, Solicitud} from "../../interfaces";

@Component({
  selector: 'app-nuevaplanilla',
  templateUrl: './nuevaplanilla.component.html',
  styleUrls: ['./nuevaplanilla.component.scss']
})
export class NuevaplanillaComponent implements OnInit{
  id_empresa: number=1;

  periodicidad: string="";
  periodo: string="";
  fecha_inicio: string="";
  fecha_fin: string="";

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("registrar planilla");
    console.log(this.id_empresa);
  }
  registrar() {
    const planilla: Planillaregistro = {
      periodicidad: this.periodicidad,
      periodo: this.periodo,
      fecha_inicio: this.fecha_inicio,
      fecha_fin: this.fecha_fin
    }
    this.api.registrarPlanilla(planilla).subscribe(data =>{
        console.log("SE REGISTRO A LA SOLICITUD")
      }
    )
  }
}
