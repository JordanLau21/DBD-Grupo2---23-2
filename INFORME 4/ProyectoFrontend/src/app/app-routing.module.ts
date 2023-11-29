import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {InicioempresaComponent} from "./inicioempresa/inicioempresa.component";
import {RegistrarempresaComponent} from "./registrarempresa/registrarempresa.component";
import {RegistrarcontratoComponent} from "./registrarcontrato/registrarcontrato.component";
import {MovimientosplanillaComponent} from "./movimientosplanilla/movimientosplanilla.component";
import {RegistrarempleadoComponent} from "./registrarempleado/registrarempleado.component";
import {VermovimientosComponent} from "./vermovimientos/vermovimientos.component";
import {SolicitudesempresaComponent} from "./solicitudesempresa/solicitudesempresa.component";
import {VigentesempresaComponent} from "./vigentesempresa/vigentesempresa.component";
import {DesvinculadosempresaComponent} from "./desvinculadosempresa/desvinculadosempresa.component";
import {DetallesolicitudComponent} from "./detallesolicitud/detallesolicitud.component";
import {VerplanillasComponent} from "./verplanillas/verplanillas.component";

const routes: Routes = [
  {path:"login", component: LoginComponent},
  {path:"inicioempresa/:id_empresa",component: InicioempresaComponent},
  {path:"registrarempleado/:id_empresa",component: RegistrarempleadoComponent},
  {path:"registrarcontrato/:id_empresa/:id_empleado",component:RegistrarcontratoComponent},
  {path:"registrarmovimientos/:id_empresa",component: MovimientosplanillaComponent},
  {path:"vermovimientos/:id_contrato",component: VermovimientosComponent},
  {path:"solictudesempresa/:id_empresa",component: SolicitudesempresaComponent},
  {path:"vigentes/:id_empresa",component: VigentesempresaComponent},
  {path:"desvinculados/:id_empresa",component: DesvinculadosempresaComponent},
  {path:"detallesolicitud/:id_solicitud", component: DetallesolicitudComponent},
  {path:"verplanillas/:id_empresa", component: VerplanillasComponent},
  {path:"detalleplanilla/:id_empresa/:id_planilla",component:DetallesolicitudComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
