'use strict';

import angular from 'angular'
import uirouter from 'angular-ui-router';
var blockUI = require('angular-block-ui');

import 'bootstrap';
import './scss/app.scss';

import routing from './app.config';

import home from './modulos/home/home.js';
import casa from './modulos/casa/casa.js';
import nova_casa from './modulos/novaCasa/nova_casa.js';


angular
.module('myApp', [
  uirouter,
  blockUI,
  casa,
  nova_casa, 
  home
])
.config(routing);