angular.module('aplikasiSpringboot')
    .factory('homeService', function ($http){
        return {
            save: function (data) {
                return $http.post("/api/peserta",data);
            },
            findPeserta:function (id){
                return $http.get("/api/peserta"+id);
            },
            getPeserta:function (){
                return $http.get("/api/peserta");
            },
            hapus:function (id){
                return $http.delete("/api/peserta/"+id)
            },
            update:function (id,data){
                return $http.put("/api/peserta/"+id, data);
            }
        };
    });