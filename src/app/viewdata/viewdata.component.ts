import { Component } from '@angular/core';
import { StudService } from '../stud.service';

@Component({
  selector: 'app-viewdata',
  templateUrl: './viewdata.component.html',
  styleUrls: ['./viewdata.component.css']
})
export class ViewdataComponent {
  data:any;
  constructor(private s1:StudService) { }

  ngOnInit(): void {
     let response = this.s1.viewservice();
     response.subscribe((data1)=>this.data=data1);
  }
}
