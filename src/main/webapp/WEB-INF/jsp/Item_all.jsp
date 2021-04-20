<%@ include file="header.jsp" %>

<div class="container">    
  <div class="row">
  <c:forEach items="${items}" var="item">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading"> ${item.name} </div>
        <div class="panel-body">
        <p>Price : ${item.price}  </p>
        </div>
        <div class="panel-footer"> <button type="button" class="btn btn-primary btn-md"
           onClick="location.href='/items/${item.id} ' ">Browse</button></div>
      </div>
    </div>
    </c:forEach>
  </div>
</div><br>

</body>
</html>
