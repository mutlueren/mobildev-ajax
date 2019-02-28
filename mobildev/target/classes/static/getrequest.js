$( document ).ready(function() {
	
	$("#getAllPersons").click(function(event){
		event.preventDefault();
		ajaxGet();
	});
	
	function ajaxGet(){
		$.ajax({
			type : "GET",
            url :  "allPerson",
            
			success: function(result){
					$('#getResultDiv ul').empty();
					var personList = "<table border='1'>";
                	personList += "<tr><td>ad</td><td>Age</td><td>Hobby</td></tr>";
					$.each(result, function(i, person){

						personList +="<tr>";
						personList +="<td>"+person.name+"</td>";
						personList +="<td>"+person.age+"</td>";
						personList +="<td>"+person.hobby+"</td>";
						personList +="</tr>";

			        });
                	personList +="</table>";
                	$('#getResultDiv').append(personList)
					console.log("Success: ", result);
			},
			error : function(e) {
				$("#getResultDiv").html("<strong>Error</strong>");
				console.log("ERROR: ", e);
            }
		});	
	}
})