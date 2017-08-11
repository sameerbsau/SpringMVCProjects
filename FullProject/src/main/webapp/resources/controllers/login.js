var login=angular.module('myApp.login',[]);

login.controller('loginController',function($scope,$http,$state){
	
	 $scope.loginCheck = function (obj) {

         var dataObj = { url: 'login', method: 'POST', headers: { 'Content-Type': 'application/json' }, data: obj }
         $http(dataObj)
             .then(function (response) {

                 $scope.datum = response.data;
                 alert( $scope.datum.key );
                 if($scope.datum.key=="success"){
                	 $state.go("productMaster");
                 }
                 
                 

             }, function myError(response) {

                 $scope.datum = response.statusText;
             });
	 }
	
})