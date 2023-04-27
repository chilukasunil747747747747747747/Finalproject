import { Component } from '@angular/core';
import { StudService } from '../stud.service';

@Component({
  selector: 'app-updatedata',
  templateUrl: './updatedata.component.html',
  styleUrls: ['./updatedata.component.css']
})
export class UpdatedataComponent {
  constructor(private s1:StudService) { }

  ngOnInit(): void {
  }
updatestuddata(updateform:{value:any;})
{
    return this.s1.updateservice(updateform.value).subscribe();
}
}
