import { Injectable } from '@angular/core';
import { createOfflineCompileUrlResolver } from '@angular/compiler';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  name: string = 'This is my singleton user service';

  API_URL: string = 'http://localhost:3000/users';

  constructor(private http: HttpClient) {
  }

  public test(): string{
    return 'properly injected service'; 
  }

  public getUser(): Observable<User[] {
    return this.http.get<User[]>(this.API_URL);
  }
}
