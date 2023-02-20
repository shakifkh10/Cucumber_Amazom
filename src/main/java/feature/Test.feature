Feature:  Amazon test cases

  Scenario Outline: Test case: login and add bed to cart
  	Given Opening the browser
   	Then Click Hello Sign In
   	And Enter email "<Email>"
   	And Enter continue
    And Enter password "<Password>"
  	Then Click Sign In
  	And Enter Search "<SearchText>"
  	And Click Search 
  	And Click Search Result 
  	Then Click Add to cart
  	And Click Cart
  	And Click Delete
  	And Enter Search "<SearchText2>"
  	And Click Search 
  	And Click Search Result 
  	Then Click Add to cart
  	And Click Cart
  	And Click Delete
		Then Close Browser
  	  	
Examples:
  | Email | Password | SearchText | SearchText2 |
 	| shakif.kh10@gmail.com | qacourse22 | Bed | Lamp |

  
  	