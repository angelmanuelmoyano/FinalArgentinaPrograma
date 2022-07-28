import { Component, OnInit } from '@angular/core';
import { PersonaService } from 'src/app/services/persona.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private persona:PersonaService) { }

  ngOnInit(): void {

    this.persona.getPersona().subscribe(data=>{
      console.log(data);
    })
  }

}
