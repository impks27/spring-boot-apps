"# spring-boot-apps" 

employee-api-data:

Create and check employee using the following:

http://localhost:8080/employees

{
	"name" : "Oliver Queen",
	"age" : 27
}

http://localhost:8080/employees/1

ticket-booking-app:

Book ticket using the following request:

http://localhost:8083/book-ticket

{
	"employeeId" : 1,
	"boarding" : "New York",
	"destination" : "San Francisco",
	"amount" : 500
}

Sample response:

{
    "employeeId": 1,
    "name": "Oliver Queen",
    "age": 27,
    "boarding": "New York",
    "destination": "San Francisco",
    "amount": 500,
    "ticketId": "TKT7227444",
    "message": "Your ticket(s) booked successfully. Happy journey!"
}


