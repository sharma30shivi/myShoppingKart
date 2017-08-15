$(function() {
	//solving the active menu problem
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;

	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	
	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}	


//code for jquery data table


 
 var $table = $('#productListTable');
 
 //execute the below code only where we have table
 if($table.length){
	 
	var jsonUrl ='';
	if(window.categoryId == ''){
		jsonUrl=window.contextRoot + '/json/data/all/products';
		
	}
	else{
		jsonUrl=window.contextRoot + '/json/data/category/'+window.categoryId+'/products';
	}
	
	
	 $table.DataTable({
		 
		 lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
		 pageLength: 5,
		 ajax: {
			 url: jsonUrl,
			 dataSrc: '',/*as we are getting Collection of object without any name*/
			 
		 },
	 columns:[
				 
				 {
					 data: 'name',
				},
				 {
					 data: 'brand',
				},
				 {
					 data: 'unitPrice',
					 mRender: function(data, type, row){
						 return '&#8377; ' + data
					 }
				},
				 {
					 data: 'quantity',
				}
			 ]
		

	 
	 });
		 
 }
	 });
	 
	 
			 
	