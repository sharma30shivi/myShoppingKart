<div class="container">
<div class="row">
<!-- Would be to display side bar-->
	<div class="col-md-3">
	<%@include file="./shared/sidebar.jsp" %>
	
	</div>

<!-- to display actual products -->
<div class="col-md-9">
	<div class="row">
		<!-- Added Bread Crumb Component -->
		<div class="col-lg-12">
				<c:if test="${userClickAllProducts == true}">
					<script>
						window.categoryId = '';
					</script>
					
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
				</c:if>
				<c:if test="${userClickCategoryProducts == true}">
					<script>
						window.categoryId = '${category.id}';
					</script>
					
					
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
						
					</ol>
				</c:if>
			</div>
	</div>
	
	<div class="row">
		
		<div class="col-xs-12">
		
			<table id="productListTable" class ="table table-striped table-bordered">
			
			<thead>
				
				<tr>
				
				<th>Name</th>
				<th>Brand</th>
				<th>Price</th>
				<th>Qty. Available</th>
			</tr>
			</thead>
			
			<tfoot>
				
				<tr>
				
				<th>Name</th>
				<th>Brand</th>
				<th>Price</th>
				<th>Qty. Available</th>
			</tr>
			</tfoot>
			</table>
		</div>
	</div>
	</div>
	</div>
</div>
<!-- In bootstrap how we divide into two griids 3+9 =12 -->
<!-- Bread Crumb -->