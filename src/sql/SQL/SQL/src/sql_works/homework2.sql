-- Listing all data in the movie table whose replacement cost value is greater than 12.99 and less than 16.99
SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.99;

-- Printing the first_name value in the actor table containing the values ​​Penelope, Nick and Ed
SELECT first_name,last_name FROM actor
WHERE first_name IN ('Penelope','Nick','Ed');

-- List the movies with rental rate values of 0.99, 2.99, 4.99 and replacement cost values of 12.99, 15.99, 28.99 in the movie table.
SELECT * FROM film
WHERE (rental_rate IN (0.99,2.99,4.99)) AND (replacement_cost IN(12.99,15.99,28.99));