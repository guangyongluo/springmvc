<!DOCTYPE html>
<html>
<head>
<title>Add Product Form</title>
    <link rel="stylesheet" href="/css/chapter02/design03/main.css">
</head>
<body>
<form method="post" action="save-product">
    <h1>Add Product 
        <span>Please use this form to enter product details</span>
    </h1>
    <label>
        <span>Product Name :</span>
        <input id="name" type="text" name="name" 
            placeholder="The complete product name"/>
    </label>
    <label>
        <span>Description :</span>
        <input id="description" type="text" name="description" 
            placeholder="Product description"/>
    </label>
    <label>
        <span>Price :</span>
        <input id="price" name="price" type="number" step="any"
            placeholder="Product price in #.## format"/>
    </label> 
    <label>
        <span>&nbsp;</span> 
        <input type="submit"/> 
    </label> 
</form>
</body>
</html>