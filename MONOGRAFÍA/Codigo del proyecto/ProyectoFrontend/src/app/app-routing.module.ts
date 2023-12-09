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
import {AreasComponent} from "./areas/areas.component";
import {CargosComponent} from "./cargos/cargos.component";
import {InicioempleadoComponent} from "./inicioempleado/inicioempleado.component";
import {MiscontratosComponent} from "./miscontratos/miscontratos.component";
import {MisboletasComponent} from "./misboletas/misboletas.component";
import {MissolicitudesComponent} from "./missolicitudes/missolicitudes.component";
import {DetalleplanillaComponent} from "./detalleplanilla/detalleplanilla.component";
import {PedirsolicitudComponent} from "./pedirsolicitud/pedirsolicitud.component";
import {NuevoareaComponent} from "./nuevoarea/nuevoarea.component";
import {NuevocargoComponent} from "./nuevocargo/nuevocargo.component";
import {BoletapagoComponent} from "./boletapago/boletapago.component";
import {DetalleboletaspagoComponent} from "./detalleboletaspago/detalleboletaspago.component";
import {DetalleboletaComponent} from "./detalleboleta/detalleboleta.component";
import {NuevaplanillaComponent} from "./nuevaplanilla/nuevaplanilla.component";

const routes: Routes = [
  {path:"login", component: LoginComponent},
  {path:"inicioempresa/:id_empresa",component: InicioempresaComponent},
  {path:"inicioempleado/:id_empleado",component: InicioempleadoComponent},
  {path:"registrarempleado/:id_empresa",component: RegistrarempleadoComponent},
  {path:"registrarcontrato/:id_empresa/:id_empleado",component:RegistrarcontratoComponent},
  {path:"registrarmovimientos/:id_empresa",component: MovimientosplanillaComponent},
  {path:"vermovimientos/:id_contrato",component: VermovimientosComponent},
  {path:"solictudesempresa/:id_empresa",component: SolicitudesempresaComponent},
  {path:"vigentes/:id_empresa",component: VigentesempresaComponent},
  {path:"desvinculados/:id_empresa",component: DesvinculadosempresaComponent},
  {path:"detallesolicitud/:id_empresa/:id_solicitud", component: DetallesolicitudComponent},
  {path:"verplanillas/:id_empresa", component: VerplanillasComponent},
  {path:"detalleplanilla/:id_empresa/:id_planilla",component:DetalleplanillaComponent},
  {path:"nuevaplanilla/:id_empresa", component: NuevaplanillaComponent},
  {path:"areas/:id_empresa", component: AreasComponent},
  {path:"nuevoarea/:id_empresa",component: NuevoareaComponent},
  {path:"cargos/:id_empresa", component: CargosComponent},
  {path:"nuevocargo/:id_empresa",component: NuevocargoComponent},
  {path:"miscontratos/:id_empleado", component: MiscontratosComponent},
  {path:"misboletas/:id_empleado", component: MisboletasComponent},
  {path:"missolicitudes/:id_empleado", component: MissolicitudesComponent},
  {path:"pedirsolicitud/:id_empleado",component: PedirsolicitudComponent},
  {path:"boletaspago/:id_empresa", component: BoletapagoComponent},
  {path:"detalleboletaspago/:id_boleta", component: DetalleboletaspagoComponent},
  {path:"detalleboleta/:id_boleta", component: DetalleboletaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
