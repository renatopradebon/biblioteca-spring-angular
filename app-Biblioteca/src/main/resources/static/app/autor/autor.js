'use strict';

angular.module('app').controller(
		'AutorController',
		[ '$scope', '$http', 'AutorService', '$uibModal',
				function($scope, $http, AutorService, $uibModal) {

					$scope.autores = [];
					$scope.loadAutores = function() {
						AutorService.getAutores().success(function(data) {
							$scope.autores = data._embedded.autor;
						});
					};
					$scope.loadAutores();

				} ]);
