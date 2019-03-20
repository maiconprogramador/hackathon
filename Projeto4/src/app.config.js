routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'vm'
      }
      $stateProvider.state(homeState);
      
      let casaState = {
        name: 'casa',
        url: '/casa',
        templateUrl: './modulos/casa/casa.view.html',
        controller: 'CasaController',
        controllerAs: 'vm'
      }
      $stateProvider.state(casaState);

      let novaCasaState = {
        name: 'nova_casa',
        url: '/cadastro',
        templateUrl: './modulos/novaCasa/nova_casa.view.html',
        controller: 'NovaCasaController',
        controllerAs: 'vm'
      }
      $stateProvider.state(novaCasaState);
      
      $urlRouterProvider.otherwise('/home')  
}