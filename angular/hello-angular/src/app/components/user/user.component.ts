import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private uService: User) { }

  ngOnInit() {
    console.log('in USER component ngOnInit');
    this.test = this.uService.test();
    this.loadUsers();
  }


  loadUsers() {
    this.uService.getUsers().subscribe(
      list => {
        if (myRespBody != null && myRespBody.length > 0) {
          console.log('yay! We have successfully received an HTTP response');
        }
        else {
          console.log('user list not populated');
        }
      },
      error => console.log('ERR')
    );
  }
}
