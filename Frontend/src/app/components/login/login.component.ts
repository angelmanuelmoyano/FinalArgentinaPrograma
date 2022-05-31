import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder,Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AutentificacionService } from 'src/app/services/autentificacion.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


form:FormGroup;

  constructor(private formBuilder: FormBuilder, private autentifacion:AutentificacionService,private rutas : Router) { 
    this.form=this.formBuilder.group({
      email:['',[Validators.required, Validators.email]],
      password: ['',[Validators.required, Validators.minLength(5)]],
      deviceinfo:this.formBuilder.group({
        dispositivo_id:["asdadsasd"],
        dispositivo_tipo:["Android"],
        notificacionToken:["adadasdasd"]
      })
      /*deviceInfo:this.formBuilder.group({
      deviceId: ["1786786521"],
      dispositivo-tipo: ['ANDROID'],
      notificacion_token: ['3424AD']
    })*/
  })
  }

  ngOnInit(): void {
  }
  get Email(){
    return this.form.get('email');
  }
  get Password(){
    return this.form.get('password');
  }
 onEnviar(event:Event){
   event.preventDefault;
   this.autentifacion.IniciarSesion(this.form.value).subscribe(data=>{
     console.log("DATA"+ JSON.stringify(data))
     this.rutas.navigate(['/porfolio']);
   })
 }

}
