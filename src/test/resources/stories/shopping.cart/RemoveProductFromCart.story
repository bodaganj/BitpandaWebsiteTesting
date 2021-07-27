Narrative:
As a client of e-commerce web site
I want to be able to remove some products from Shopping cart

Scenario: Remove the only product from Shopping cart
Given product (product id = 1) page is open
When product is added to shopping cart
And 1 product is present on shopping cart
And following product is removed from shopping cart: productId = 1
Then shopping cart is empty