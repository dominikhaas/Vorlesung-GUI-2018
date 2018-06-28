import { Component } from '@angular/core';
import {HeaderModel} from "./HeaderModel";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
})
export class AppComponent {

  private _counter: number = 0;

  public onGenerateGraphEvent(model: HeaderModel) {
    alert("AppComponent: " + model);
    this._counter++;
  }

  public myMethod(a: number): void {

  }
}
