(function () {
    var app = angular.module("MyApp", []);
    var crl = app.controller("my_ctrler", function ($scope, $http) {
        var cartItemCount = 0;
       
        var totlist = 0;
        var comnCart = [];
        $scope.cartItems = comnCart;
        $http.get("InfoServlet").then(function (response) {
            $scope.values = response.data;
            totlist = $scope.values.length;
      
        });
        
        $scope.addToCart = function (value) {    
       
            if(!checkExists(comnCart, value)){
                comnCart.push(value);
                cartItemCount++;
                $scope.remValue = value;
                
            }
            if(totlist == cartItemCount){
                $scope.clickValues = "All items  Added to your cart";
            }
        }
        
        function checkExists(comnCart, value){
            var exists = false;              
            if (cartItemCount <= comnCart.length) {
                for (i = 0; i <= cartItemCount; i++) {
                    if (comnCart[i] == value) {
                        exists = true;
                    }
                }
            }
            return exists;
        }
        
        /************************************************************/ 
        $scope.removeFromCart = function (value) {
            $scope.clickValues = "";
            if(removeItem(comnCart, value)){
               
                cartItemCount--;
            }  
        }
        
        function removeItem(comnCart, value){
            var remove = false;              
            if (cartItemCount!=0) {
                for (i = 0; i <= cartItemCount; i++) {
                    if (comnCart[i] == value) {
                        remove = true;
                        comnCart.splice(i, 1);
                      
                    }
                }
            }
            return remove;
        }
        
    });
})();