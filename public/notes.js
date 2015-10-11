var module = angular.module('myapp', ['ngResource']);

module.factory('Note', function($resource) {
  return $resource(':username/notes', { username: '@username' });
})
.controller('NotesController', function($scope,$http, Note) {
	var url = function() {
		return {username:$scope.username||'vladson'};
	};
	
	var update = function() {
		console.log(url());
		$scope.notes = Note.query(url());
	};
	
	$scope.update = update;
	
	$scope.add = function() {
		var note = new Note();
        note.date = new Date();
		note.text = $scope.text;
		note.save(url(), function() {
			$scope.text = "";
			update();
		});
	};

    $scope.delete = function(id) {

        Note.delete(angular.extend(url(), {id:id}));

        update();

    };

    $scope.search = function() {

        var user = $scope.username || 'vladson';

        console.log($scope.searchText);



        $http.get(user+'/notes/find', {params:{text: $scope.searchText}})

            .success(function(res) {

                console.log(res);

                $scope.notes = res;

            });

    };

	update();
});
