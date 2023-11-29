import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-detalleplanilla',
  templateUrl: './detalleplanilla.component.html',
  styleUrls: ['./detalleplanilla.component.scss']
})
export class DetalleplanillaComponent implements OnInit{
  id_planilla: number=1;
  id_empresa: number=1;
  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.id_empresa =Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id empresa");
    this.id_planilla=Number(this.activateRoute.snapshot.paramMap.get('id_planilla'));
    console.log("imprimiendo el id cuenta");
  }
}
