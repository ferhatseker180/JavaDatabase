-- Homework 9

-- Write the INNER JOIN query in which we can see the city and country names in the city table and the country table together.
SELECT city,country FROM city
INNER JOIN country ON city.country_id = country.country_id;

-- Write the INNER JOIN query in which we can see the customer table, the payment id in the payment table, and the first_name and last_name in the customer table together.
SELECT payment.payment_id,customer.first_name,customer.last_name FROM customer
INNER JOIN payment ON customer.customer_id = payment.payment_id;

-- Write the INNER JOIN query in which we can see the customer table, the rental id in the rental table, and the first_name and last_name in the customer table together.
SELECT rental.rental_id, customer.first_name, customer.last_name FROM customer
INNER JOIN rental ON rental.customer_id = customer.customer_id;