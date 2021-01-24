Assumption:
didn't do detailed debugging and error handling
customers wouldn't change their order
Only one chef and robot
Robot commands for each customer follow the order: great new customers, take order, deliver orders to chef, deliver all dishes, checkout

General flow:
The robot could great new customers, take order from the customer, then deliver the orders to the cheif.
The chef would could one dish at a time, store the dishes until the robot take them.
The robot would take all dishes that are ready, distribute the dishes to the customer.
Lastly, give checks to the customers.