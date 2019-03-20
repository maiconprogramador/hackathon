import angular from 'angular';

class CasaService {

    constructor($http) {
        this.$http = $http;
        //const apiBase = "http://localhost:8080/projeto/api";
        const apiBase = "http://localhost:8080/projeto5";
        this.path =  apiBase + "/casa";
    }
    
    getCasas() {
        return this.$http.get(this.path);
    }
}

export default angular.module('services.casa-service', [])
.service('casaService', CasaService)
.name;