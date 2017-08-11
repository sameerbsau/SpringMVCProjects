 var app = angular.module("myApp", ["ui.router",'myApp.login','myApp.page2']);

 app.config(function($stateProvider, $urlRouterProvider){
	 
	 $urlRouterProvider.otherwise('login');
	 $stateProvider.state({
			name: 'login',
			url: '/login',
			templateUrl:'resources/pages/login.html',
			controller:'loginController'
 }).state({
		name: 'productMaster',
		url: '/productMaster',
		templateUrl:'resources/pages/productmaster.html',
		/*controller:'loginController'*/
}).state({
	name: 'page2',
	url: '/page2',
	templateUrl:'resources/pages/page2.html',
	controller:'page2Controller'
});
});
 
 app.controller('myCtrl',function(){
	 
 })
 
 
 