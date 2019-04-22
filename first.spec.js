

describe('Login ', function() 
{

 it('Login page,Company Profile', function() {

    this.retries(2)
   cy.clearCookies()
   cy.getCookies().should('be.empty')
   cy.clearCookies()
   cy.visit("https://secure.zenefits.com/accounts/login/")
   

   cy.contains('Welcome back!')
   cy.get('#id_username')
   .type('bbatraski+qaprod1@zenefits.com')
   .should('have.value','bbatraski+qaprod1@zenefits.com')

   cy.get('#id_password')
   .type('Nairb123!')
   .should('have.value','Nairb123!')

   cy.get('#loginForm > .btn')
   .click()
  // cy.title().should('include','Zenefits')
   cy.contains('Inbox')
   cy.contains('Help')

   cy.get('.avatar-initials > .zmdi')
   .click()
 
    this.retries(2)
    cy.get('.step-title')
   cy.contains('Tell us all about your new hire.')
    cy.get('.js-glue-basic-info-cancel')
    cy.click()

  //click on company profile
     this.retries(2)
   cy.get('.js-walkme-dashboard-app-1_com_zenefits_CompanyAdmin > .u-square-content')
   .click()
  cy.contains('Total Headcount')
  cy.contains('Date Established')

 cy.contains('Company Profile')
cy.contains('General Information')
cy.contains('Contact Information')


cy.contains('Tax Info')
.click()
cy.contains('Tax Filing Information')
cy.contains('Accountant Contact Information')


cy.contains('Plan Info')
.click()
cy.contains('Zenefits Plan Information')



cy.contains('Billing & Payments')
.click()
cy.contains('Billing History')


cy.contains('Address & Labor Groups')
.click()
cy.contains('Addresses')
cy.get('h6')
cy.contains('Labor Groups')
cy.contains('Work Locations')
cy.contains('Departments')
cy.contains('Positions')


cy.contains('Administrators')
.click()
cy.contains('Primary Administrator')
cy.contains('Additional Administrator')


cy.contains('Permissions')
.click()
cy.contains('Manager Permissions')
cy.contains('Individual Permissions')

  })
})

