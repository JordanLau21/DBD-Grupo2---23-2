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
    DetalleplanillaComponent
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
