import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-inicioempleado',
  templateUrl: './inicioempleado.component.html',
  styleUrls: ['./inicioempleado.component.scss']
})
export class InicioempleadoComponent implements OnInit{
  id_empleado: number=1;
  constructor(private activateRoute: ActivatedRoute) {
  }
  ngOnInit(): void {
    this.id_empleado=Number(this.activateRoute.snapshot.paramMap.get('id_empleado'));
    console.log("imprimiendo el id_empresa");
    console.log(this.id_empleado);
  }
}
