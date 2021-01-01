import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TestingComponent} from './components/testing/testing.component';

const routes: Routes = [ ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
