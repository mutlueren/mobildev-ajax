$( document ).ready(function() {
	
    $("#personForm").submit(function(event) {
		event.preventDefault();
		ajaxPost();
	});
     
    function ajaxPost(){
    	
    	var formData = {
    		name : $("#name").val(),
            age :  $("#age").val(),
            hobby :  $("#hobby").val()
    	}
    	
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "createNewPerson",
			data : JSON.stringify(formData),
            dataType : 'json',
            
			success : function(result) {
				if(result.status == "Done"){
					$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
												"Post Successfully! <br>" +
												"Person's info: Name = " + 
                                                result.data.name + 
                                                " ,LastName = " + 
                                                result.data.age + 
                                                " ,Hobby = " + 
                                                result.data.hobby + "</p>");
				}else{
					$("#postResultDiv").html("<strong>Error</strong>");
				}
				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	resetData();
    }
    
    function resetData(){
    	$("#name").val("");
        $("#age").val("");
        $("#hobby").val("");
    }
})