<%@ include file="header.jsp" %>

<div class="container">    
  <div class="row">
  
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading"> ${item.name} </div>
        <div class="panel-body">
        <p>Description : ${item.description}  </p>
        <p>Price : ${item.price}  </p> 
        </div>
        <div class="panel-footer"> <button type="button" class="btn btn-primary btn-md"
           onClick="location.href=' ' ">Buy</button></div>
      </div>
    </div>
   
  </div>
</div><br>

</body>
</html>