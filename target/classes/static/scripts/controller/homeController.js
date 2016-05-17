angular.module('aplikasiSpringboot')
    .controller('homeController',function ($scope,homeService){
        
        // $scope.hallo = 'hallo';
        // $scope.nama = 'kismet';

        $scope.editData=function (data){
            $scope.isDataEdit=true;
            $scope.currentPeserta={};
            $scope.currentPeserta.nama=data.nama;
            $scope.currentPeserta.alamat=data.alamat;
            $scope.currentPeserta.id=data.id;
        }
        
        $scope.simpanData=function(data){
            if($scope.isDataEdit==true){
                homeService.update(data.id, data).success(function (data){
                    alert("Data Berhasil Disimpan");
                    $scope.clearData();
                }).error(function (){
                    alert("Terjadi Kesalahan dalam penyimpanan");
                })
            }else{
                homeService.save(data).success(function (data){
                    alert("Data Berhasil Disimpan");
                    $scope.clearData();
                }).error(function (){
                    alert("Terjadi Kesalahan dalam penyimpanan");                    
                })            
            }
        }
        
        
        $scope.hapusData=function(id){
            homeService.hapus(id).success(function (){
                alert("data berhasil dihapus");
                $scope.clearData();
            }).error(function(){
                alert("terjadi kesalahan dalam menghapus data");
            })  
           
        }
        
        $scope.getDataPeserta=function(){
            homeService.getPeserta().success(function(data){
                $scope.listPeserta = data.content;
            })
        };
        
        $scope.reloadData = function(){
            $scope.getDataPeserta();
        }
        
        $scope.clearData = function (){
            $scope.isDataEdit=false;
            $scope.currentPeserta={};
            $scope.reloadData();
        }
    });