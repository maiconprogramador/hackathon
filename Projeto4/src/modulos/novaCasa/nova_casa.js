import angular from 'angular';
import uirouter from 'angular-ui-router';

import NovaCasaController from './nova_casa.controller';

import casaService from '../../servicos/casa.service';

export default angular.module('myApp.novaCasa', [uirouter, casaService])
  .controller('NovaCasaController', NovaCasaController)
  .name;

  