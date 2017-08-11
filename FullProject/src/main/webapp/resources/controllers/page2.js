var page2=angular.module('myApp.page2',[]);

page2.controller('page2Controller',function($scope,$http,$state){
	
	 $scope.test2 = function () {

         var dataObj = { url: 'test', method: 'GET' }
         $http(dataObj)
             .then(function (response) {

                 $scope.datum = response.data;
                 alert( $scope.datum[0] );
                 /*if($scope.datum.[0]=="success"){
                	 $state.go("productMaster");
                 }*/
                 
                 

             }, function myError(response) {

                 $scope.datum = response.statusText;
             });
	 }
	
})