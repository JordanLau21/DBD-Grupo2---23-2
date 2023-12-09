import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {EmpleadoEmpresa} from "../../interfaces";
import {compareSegments} from "@angular/compiler-cli/src/ngtsc/sourcemaps/src/segment_marker";

@Component({
  selector: 'app-desvinculadosempresa',
  templateUrl: './desvinculadosempresa.component.html',
  styleUrls: ['./desvinculadosempresa.component.scss']
})
export class DesvinculadosempresaComponent implements OnInit{
  id_empresa: number=1;

  lista: EmpleadoEmpresa[]=[];


  constructor(private api: ApiService, private activateRoute: ActivatedRoute) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id cuenta");
    console.log(this.lista);
    this.api.obtenerEmpleadoDesvinculados(this.id_empresa).subscribe(data => {
      this.lista=data.vigentes
      console.log(this.lista)
    })
  }
}
