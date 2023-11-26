import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {MatriculaComponent} from "./matricula/matricula.component";
import { SeccionComponent } from './seccion/seccion.component';
import {InicioComponent} from "./inicio/inicio.component";
import {ReportematriculaComponent} from "./reportematricula/reportematricula.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MatriculaComponent,
    SeccionComponent,
    InicioComponent,
    ReportematriculaComponent
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
