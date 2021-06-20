/**
 * 
 */



$('#btnAddSupplier').click(function() {
	var supplierName = $('#supplierName').val();
	var place = $('#Place').val();

	var settings = {
		"url": HostURL + "/RFQApp/supplier/add",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({ "supplierName": supplierName, "place": place }),
	};

	$.ajax(settings).done(function(response) {
		console.log(response);
	})
		.fail(function(jqXHR, textStatus, errorThrown) { alert("Error"); });
		
		location.reload();
});

$(function() {
	
var num = 0;
	var settings = {
		"url": "http://localhost:7071/RFQApp/supplier/all",
		"method": "GET",
		"timeout": 0,
	};

	$.ajax(settings).done(function(response) {
		//console.log(response);
		var dataSet = [];
		$.each(response,function(index,value){
			console.log(index++);
			num=index++;
			var supplier = [];
			supplier.push(value.supplierName);
			supplier.push(value.place);
			dataSet.push(supplier);
		//	var tbody = "<tbody><tr><td>"+num+"</td><td>"+value.supplierName+"</td><td>"+value.place+"</td></tr></tbody>";
		//	$('#supplierTable').append(tbody);
	
		});
					
		$('#supplierTable').DataTable({
		 	data: dataSet,
        	columns: [
          	  { title: "Supplier Name" },
           	 { title: "Place" }
			]
		});
					
	});
	
	
})