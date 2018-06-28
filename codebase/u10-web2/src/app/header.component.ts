import { Component, EventEmitter, Output } from '@angular/core';
import {HeaderModel} from "./HeaderModel";


@Component({
  selector: 'headerComponent',
  templateUrl: './header.component.html'
})
export class HeaderComponent {


  private model: HeaderModel = new HeaderModel();

  @Output() onGenerateGraph = new EventEmitter<HeaderModel>();

  public onGenerateGraphClicked(): void {
    this.onGenerateGraph.emit(this.model);
  }
}
