import angular from 'angular';
import uirouter from 'angular-ui-router';

import CasaController from './casa.controller';

import casaService from '../../servicos/casa.service';

export default angular.module('myApp.casa', [uirouter, casaService])
  .controller('CasaController', CasaController)
  .name;

  