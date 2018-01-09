# Hibernate-4-events-maven
Demo App for Hibernate 4 event

This app is build using Maven and uses Hibernate 4.x

Hibernate comes with an event system (a concept of listeners and event ) l and we can configure the events we want to track in the form of listeners. Most commonly used events are-

    Pre – Select:  : these types of event are fired before executing any select statement.
    Post – Select: : these types of event are fired after executing any select statement.
    Pre – Insert: : these types of event are fired before execution of insert statement.
    Post – Insert: : these types of event are fired after execution of  an insert statement.
    Pre – Update: : these types of event are fired before execution of  update statements.
    Post – Update: : these types of event are fired after execution of any update statement.
    Pre – Delete: these types of event are fired  before execution of  any delete statement.
    Post – Delete: these types of event are fired after execution of any delete statement.
    
    
Steps 
   - Create listener 
   - Register listener with Integrator
   - Add "org.hibernate.integrator.spi.Integrator" file under "resources/META-INF/services/".(very important)
   - In the file add the fully qualified class name of Integrartor.
    
    
