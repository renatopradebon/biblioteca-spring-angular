angular.module('app', [
  'ngRoute',
  'ui.bootstrap',
  'ngAnimate'
]);

angular.module('app').constant('SERVER_BASE', 'http://localhost:5000/');

angular.module('app').config( ['$routeProvider',function($routeProvider) {

	  $routeProvider.

	    when('/home', {

		  templateUrl: 'app/home/home.html',
		  controller: 'HomeController'

		}).

		when('/livro', {

	      templateUrl: 'app/livro/livro.html',
	      controller: 'LivroController'

	    }).

	    when('/autor', {

		      templateUrl: 'app/autor/autor.html',
		      controller: 'AutorController'

	    }).

	    otherwise({

	      redirectTo: '/home'

	    });



	}]);
