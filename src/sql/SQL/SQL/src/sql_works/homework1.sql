-- Homework 1:
-- All titles and descriptions in the movie table were displayed
SELECT title,description FROM film;

-- Data with length greater than 60 and less than 75 in the movie table were listed.
SELECT * FROM film
WHERE length > 60 AND length < 75;

-- All columns in the movie table listed data with rental_rate of 0.99 and replacement_cost of 12.99 or 28.99
SELECT * FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);

-- Finding the last name of the customer whose first_name value is Mary in the Customer table
SELECT * FROM customer
WHERE first_name = 'Mary';

-- Listing data whose length is not 50 and whose rental rate is not 2.99 or 4.99 in the movie table
SELECT * FROM film
WHERE NOT length = 50 AND (rental_rate = 2.99 OR rental_rate = 4.99);
