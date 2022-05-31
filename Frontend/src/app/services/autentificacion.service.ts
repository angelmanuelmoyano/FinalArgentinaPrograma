import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import{map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AutentificacionService {
url="http://localhost:9000/personas/auth";
 currentUserSubject: BehaviorSubject<any>;
  constructor(private http:HttpClient) {
    console.log("auth corriendo");
    this.currentUserSubject= new BehaviorSubject<any>(JSON.parse(sessionStorage.getItem('currentUser')||'{}'));
   }
   IniciarSesion(credenciales:any):Observable<any>{

    return this.http.post(this.url,credenciales).pipe(map(data=>{
      sessionStorage.setItem('currenUser',JSON.stringify(data))
      return data;
    }))
   }
}
