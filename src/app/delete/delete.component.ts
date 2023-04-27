import { Component } from '@angular/core';
import { StudService } from '../stud.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent {
  constructor(private s1:StudService) { }

  ngOnInit(): void {
  }
  deletedata(deleteform:{value:any;})
  {
      return this.s1.deleteservice(deleteform.value).subscribe();
  }
}
