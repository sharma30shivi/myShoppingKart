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
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
				</c:if>
				<c:if test="${userClickCategoryProducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
						
					</ol>
				</c:if>
			</div>
	</div>
	</div>
	</div>
</div>
<!-- In bootstrap how we divide into two griids 3+9 =12 -->
<!-- Bread Crumb -->