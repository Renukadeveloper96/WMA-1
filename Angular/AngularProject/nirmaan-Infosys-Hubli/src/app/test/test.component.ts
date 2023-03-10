import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css'],
//  styles:[`
//  .text-success{
//   color:green;
//   font-family: 'Courier New', Courier, monospace;
//   font-size:40px;
//   font-weight: bold;
// }
//  `]
})
export class TestComponent implements OnInit {

  public company="nirmaan";
  public name="infosys";
  public myId="testId";
  public isDisabled=false;
  public successClass="text-success";
  public hasError=true;
  public isSpecial=true;
  public messageClasses={
    "text-success":!this.hasError,
    "text-danger":!this.hasError,
    "text-special":this.isSpecial
  }
  constructor(){}
  ngOnInit(){}

  greetUser(){
    return "Hi"+" "+this.name
  }
}
