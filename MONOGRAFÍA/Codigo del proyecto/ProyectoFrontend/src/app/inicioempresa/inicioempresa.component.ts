import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-inicioempresa',
  templateUrl: './inicioempresa.component.html',
  styleUrls: ['./inicioempresa.component.scss']
})
export class InicioempresaComponent implements OnInit{
  id_empresa: number=1;
  constructor(private activateRoute: ActivatedRoute) {
  }
  ngOnInit(): void {
    this.id_empresa=Number(this.activateRoute.snapshot.paramMap.get('id_empresa'));
    console.log("imprimiendo el id_empresa");
    console.log(this.id_empresa);
  }

}
