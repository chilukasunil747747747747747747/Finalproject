import { Component } from '@angular/core';
import { StudService } from '../stud.service';

@Component({
  selector: 'app-insertdata',
  templateUrl: './insertdata.component.html',
  styleUrls: ['./insertdata.component.css']
})
export class InsertdataComponent {


  constructor(private s1:StudService) { }

  ngOnInit(): void {
  }
insertstuddata(insertform:{value:any;})
{
    return this.s1.insertservice(insertform.value).subscribe();
}
}

