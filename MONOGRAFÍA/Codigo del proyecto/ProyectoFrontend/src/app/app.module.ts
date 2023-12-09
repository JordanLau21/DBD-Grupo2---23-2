import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { InicioempresaComponent } from './inicioempresa/inicioempresa.component';
import { InicioempleadoComponent } from './inicioempleado/inicioempleado.component';
import { RegistrarempleadoComponent } from './registrarempleado/registrarempleado.component';
import { RegistrarempresaComponent } from './registrarempresa/registrarempresa.component';
import { RegistrarcontratoComponent } from './registrarcontrato/registrarcontrato.component';
import { MovimientosplanillaComponent } from './movimientosplanilla/movimientosplanilla.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import { VermovimientosComponent } from './vermovimientos/vermovimientos.component';
import { SolicitudesempresaComponent } from './solicitudesempresa/solicitudesempresa.component';
import { VigentesempresaComponent } from './vigentesempresa/vigentesempresa.component';
import { DesvinculadosempresaComponent } from './desvinculadosempresa/desvinculadosempresa.component';
import { DetallesolicitudComponent } from './detallesolicitud/detallesolicitud.component';
import { VerplanillasComponent } from './verplanillas/verplanillas.component';
import { DetalleplanillaComponent } from './detalleplanilla/detalleplanilla.component';
import { AreasComponent } from './areas/areas.component';
import { CargosComponent } from './cargos/cargos.component';
import { MiscontratosComponent } from './miscontratos/miscontratos.component';
import { MissolicitudesComponent } from './missolicitudes/missolicitudes.component';
import { MisboletasComponent } from './misboletas/misboletas.component';
import { PedirsolicitudComponent } from './pedirsolicitud/pedirsolicitud.component';
import { NuevoareaComponent } from './nuevoarea/nuevoarea.component';
import { NuevocargoComponent } from './nuevocargo/nuevocargo.component';
import { BoletapagoComponent } from './boletapago/boletapago.component';
import { DetalleboletaspagoComponent } from './detalleboletaspago/detalleboletaspago.component';
import { DetalleboletaComponent } from './detalleboleta/detalleboleta.component';
import { NuevaplanillaComponent } from './nuevaplanilla/nuevaplanilla.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    InicioempresaComponent,
    InicioempleadoComponent,
    RegistrarempleadoComponent,
    RegistrarempresaComponent,
    RegistrarcontratoComponent,
    MovimientosplanillaComponent,
    VermovimientosComponent,
    SolicitudesempresaComponent,
    VigentesempresaComponent,
    DesvinculadosempresaComponent,
    DetallesolicitudComponent,
    VerplanillasComponent,
    DetalleplanillaComponent,
    AreasComponent,
    CargosComponent,
    MiscontratosComponent,
    MissolicitudesComponent,
    MisboletasComponent,
    PedirsolicitudComponent,
    NuevoareaComponent,
    NuevocargoComponent,
    BoletapagoComponent,
    DetalleboletaspagoComponent,
    DetalleboletaComponent,
    NuevaplanillaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
