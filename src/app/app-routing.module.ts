import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InsertdataComponent } from './insertdata/insertdata.component';
import { UpdatedataComponent } from './updatedata/updatedata.component';
import { DeleteComponent } from './delete/delete.component';
import { ViewdataComponent } from './viewdata/viewdata.component';

const routes: Routes = [
  {
    component:InsertdataComponent,
    path:'insert'
  },
  {
    component:UpdatedataComponent,
    path:'update'
  },
  {
    component:DeleteComponent,
    path:'delete'
  },
  {
    component:ViewdataComponent,
    path:'view'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
