import {Component, OnInit} from '@angular/core';
import {RespuestaContrato} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-vermovimientos',
  templateUrl: './vermovimientos.component.html',
  styleUrls: ['./vermovimientos.component.scss']
})
export class VermovimientosComponent implements OnInit{
  indice: number=1;

  constructor(private activateRoute: ActivatedRoute, private api: ApiService) {
  }
  ngOnInit(): void {
    this.indice=Number(this.activateRoute.snapshot.paramMap.get('id_contrato'));
    console.log("imprimiendo el id cuenta");

  }

}
