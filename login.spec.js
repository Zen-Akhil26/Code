describe('Amazon webpage', function() 
{
  it('Login page', function() {
   cy.visit("https://www.amazon.in/")
   cy.contains('amazon.in')

 



   cy.contains('Hello, Sign in').click()
   cy.contains('Login')

   
   cy.get('#ap_email').type('8904117845').should('have.value', '8904117845')

   
   cy.get('#continue').should('be.visible').click()
   cy.contains('Password')
   .expect($("<h1 value='Password' />"))
   .to.have.text('Password')


   cy.get('#ap_password').type('mjaa1994').should('have.value', 'mjaa1994')
   
 
   cy.get('#signInSubmit').should('be.visible').click()
   cy.contains('Hello, akhil')


  })
})
