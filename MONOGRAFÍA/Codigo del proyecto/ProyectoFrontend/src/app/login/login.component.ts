import {Component, OnInit} from '@angular/core';
import {Cuenta} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{
  usuario:string="";
  contrasenia:string="";
  id_empresa: number=3;
  cuentas: Cuenta[]=[];

  mensaje: string="";
  rol: string="";
  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.validar()
  }


  validar():boolean{
    this.api.obtenerCuentasEmpresa().subscribe(data=>{this.cuentas= data.cuentas,
      console.log(this.cuentas)})
    let validado = false;
    let indice1= 0;
    while(this.cuentas[indice1]!= null){
      if(this.cuentas[indice1].usuario==this.usuario &&
        this.cuentas[indice1].contrasenia==this.contrasenia) {
        validado=true;
        this.mensaje="Validado!";
        break;
      }
      else{
        indice1++;
        this.mensaje="no valido";
      }
    }
    this.rol=this.cuentas[indice1].rol;
    console.log(indice1)
    console.log(validado)
    console.log(this.usuario)
    console.log(this.mensaje)
    return validado;
  }
}
