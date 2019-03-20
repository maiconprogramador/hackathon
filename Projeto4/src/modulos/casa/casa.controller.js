import { inherit } from "@uirouter/core";

export default class CasaController {

  constructor(casaService) {
    var vm = this;
    this.name = 'Casa';

    init();

    function init(){
      casaService.getCasas().then(function abc(resp) {
        vm.casas  = resp.data;
        console.log(vm.casas)

      });
    }
  }
  
}
CasaController.$inject = ['casaService'];
