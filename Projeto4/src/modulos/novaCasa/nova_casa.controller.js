import { inherit } from "@uirouter/core";

export default class NovaCasaController {

  constructor(casaService) {
    var vm = this;
    this.name = 'Cadastrar Casa';

    init();

    function init(){
      casaService.getCasas().then(function abc(resp) {
        vm.casas = resp.data;
      });
    }
  }
  
}
NovaCasaController.$inject = ['casaService'];
