# Hibernate Demo

### Download and Extracts hibernate jars to your projcect  folder 

### Add hibernate jars to your module settings..

### and start playing with hibernate...

Here this demo shows parent child relationship

when inverse=true in the set definition-> the child owns the definition which means the child has to manually associate to the parent each time the child  is created

When inverse=false in the set definition -> the parent owns the definition and everytime parent is saved the child is populated with the parent key value appropriately

inversetruefalseresults.png shows the results for inverse = true (null result) and false (non null result)  set on user_events
