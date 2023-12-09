import {Component, OnInit} from '@angular/core';
import {BoletasPago, SolicitudesEmpresa} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-boletapago',
  templateUrl: './boletapago.component.html',
  styleUrls: ['./boletapago.component.scss']
})
export class BoletapagoComponent implements OnInit{
  id_empresa: number=1;
  lista: BoletasPago[]=[];

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log(this.id_empresa);
    this.api.obtenerBoletasPago(this.id_empresa).subscribe(data => {
      this.lista = data.boletas;
    });
    console.log(this.lista)
  }
}
