-- HOMEWORK 12

-- In the movie table, the movie length is shown in the length column. How many movies are longer than the average movie length?
SELECT COUNT(*) FROM film
WHERE length > (SELECT AVG(length) FROM film);


-- How many movies have the highest rental rates in the movie table?
SELECT COUNT(*) FROM film
GROUP BY rental_rate
ORDER BY rental_rate DESC
LIMIT 1;


-- In the movie table, list the movies with the lowest rental rates and lowest replacement costs.
SELECT * FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
AND
replacement_cost = (SELECT MIN(replacement_cost) FROM film);


-- List the customers who made the most purchases in the payment table.
SELECT payment.customer_id, customer.first_name, customer.last_name, COUNT(payment.payment_id) AS total_payment FROM payment
INNER JOIN customer ON payment.customer_id = customer.customer_id
GROUP BY payment.customer_id, customer.first_name, customer.last_name
ORDER BY total_payment DESC;