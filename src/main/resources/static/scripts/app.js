angular.module('aplikasiSpringboot',['ngRoute'])
    .config(function ($routeProvider){
        $routeProvider
        .when('/',{
            templateUrl:'views/dasboard.html',
            controller:'dasboardCtrl'
        })
        .when('/home',{
            templateUrl:'views/home.html',
            controller:'homeController'
        })
    });

