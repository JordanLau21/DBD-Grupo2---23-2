import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {RegistrarempleadoComponent} from "./registrarempleado/registrarempleado.component";

const routes: Routes = [
  {path:"registrarempleado", component: RegistrarempleadoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
