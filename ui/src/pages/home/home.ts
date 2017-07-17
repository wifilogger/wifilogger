import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Platform } from 'ionic-angular';

declare var cordova:any;

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  value:String = '41';

  constructor(public navCtrl: NavController, platform: Platform) {
    platform.ready().then(() => {
      console.log('CALLING ECHO PLUGIN');
      cordova.echo('42', (value) => {
        this.value = value;
      });
      console.log('CALLING ECHO PLUGIN DONE');
    });
  }

}
