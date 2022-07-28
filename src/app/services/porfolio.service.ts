import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PorfolioService {
url:string="localhost:9000/personas/traer";
  constructor(private http:HttpClient) {}

    getPersona():Observable<any>{
      return this.http.get<any>(this.url);
    
   }
}
