angular.module('app',[
  'ui.router',
  'ui.bootstrap',
  'ngAnimate'
]);

angular.module('app').constant('SERVER_BASE', 'http://localhost:5000/');

angular.module('app').config([

   '$stateProvider', '$urlRouterProvider', '$locationProvider',

   function($stateProvider, $urlRouterProvider, $locationProvider) {

	   $locationProvider.html5Mode({
		   enabled: true,
		   requireBase: true //se true entao declare <base href="/"> no <head>
	   });

	   //$urlRouterProvider.otherwise('home');

	   $stateProvider

	   .state('home', {
		      url: "/",
		      templateUrl: '/app/home/home.html',
		      controller:'HomeController'

		})

	   .state('autor', {
		      url: "autor",
		      templateUrl: '/app/autor/autor.html',
		      controller:'AutorController'

		})

	   .state('livro', {
		      url: "livro",
		      templateUrl: '/app/livro/livro.html',
		      controller:'LivroController'

		});


}]);
