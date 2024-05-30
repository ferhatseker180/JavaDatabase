-- Homework 10

-- Write the LEFT JOIN query in which we can see the city and country names in the city table and the country table together.
SELECT city.city, country.country FROM city
LEFT JOIN country ON city.country_id = country.country_id;

-- Write the RIGHT JOIN query in which we can see the customer table, the payment id in the payment table, and the first_name and last_name in the customer table together.
SELECT customer.first_name, customer.last_name, payment.payment_id FROM payment
RIGHT JOIN customer ON customer.customer_id = payment.payment_id;


-- Write the FULL JOIN query in which we can see the customer table, the rental id in the rental table, and the first_name and last_name in the customer table together.
SELECT customer.first_name, customer.last_name, rental.rental_id FROM customer
FULL JOIN rental ON customer.customer_id = rental.rental_id;

