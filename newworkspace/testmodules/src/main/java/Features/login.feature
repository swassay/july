Feature: Log in tecfios test site and check background colrs

Scenario: user should log in to site and click blue or white 
			
			Given the user is in page
			When user clicks blue
			Then background changes to White
			Then program ends