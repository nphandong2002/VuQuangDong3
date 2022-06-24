<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 15/06/2022
  Time: 3:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
                <form action="add" method="post">
                    <caption>
                        <h2>
                            Add New Phone
                        </h2>
                    </caption>


                    <fieldset class="form-group">
                        <label>Name</label> <input type="text"
                                                   class="form-control" name="name" required="required">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Brand</label>
                        <select name="brand">
                            <option value="Apple">Apple</option>
                            <option value="SamSung">SamSung</option>
                            <option value="Nokia">Nokia</option>
                            <option value="Other">Other</option>
                        </select>
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Price</label> <input type="number"
                                                      class="form-control" name="price">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Description</label> <input type="text"
                                                    class="form-control" name="description">
                    </fieldset>

                    <button type="submit" class="btn btn-success">Add</button>
                    <button type="button" class="btn btn-success" onclick="reset">Reset</button>

                </form>
        </div>
    </div>
</div>
</body>
<script>
    function reset(){
        location.reload();
    }

</script>

</html>
