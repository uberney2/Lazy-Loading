$(document).ready(function(){

	$("#div1").load("files/lazy_loading_example_input.txt", function(data) {
		var array = data.split('\n');
		array = array.map(function(n) {
			return parseInt(n);
		});
		console.log(array);
		callLoading();
	});

	function callLoading() {
		$.ajax({
  			url: "http://localhost:8080/lazy/rest/lazy/loading",
  			type: "get",
  			data: {
    			items: "20, 20, 20",
    			day: 3
  			},
  			success: function(response) {
    			console.log(response);
  			},
  			error: function(err) {
    			console.error(err);
  			}
		});
	} 


});


