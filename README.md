
## Project Description

Backend Online Store

## Technologies Used

* Java
* PostgreSQL
* Maven
* Spring Boot
* SpringMVC
* Tomcat

## Features

Online Store API:
* sign up
* log in/log out
* update items
* add items to cart
* create orders

  ## How to use
  login:  	/login Post:{"username", "email"}
  logout:  	/logout Post: {"username"}
  register:   	/user/register Post: {"username", "email"}
  get User:	/user/mail/email Get: {"email"}
  get Cart	/user/cart/email Get: {"email"}
  update user	/user/update/id Put: {"id"}
  update cart	/user/updatecart/id Put: {"id"}
  delete user	/user/delete/id Delete: {"id"}
  get Item	/item/id Get: {"id"}
  get itemname	/item/byname/productname Put: {"itemName"}
  update item	/item/id Put: {"id"}
  delete item	/item/delete/id Delete: {"id"}