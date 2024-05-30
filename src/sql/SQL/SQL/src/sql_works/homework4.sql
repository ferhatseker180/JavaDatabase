-- List the different values in the replacement cost column in the movie table.
SELECT DISTINCT replacement_cost FROM film;

-- How many different data are there in the replacement_cost column in the movie table?
SELECT COUNT (DISTINCT replacement_cost) FROM film;

-- How many of the movie titles in the movie table start with the character T and also have a rating equal to 'G'?
SELECT COUNT (*) FROM film
WHERE title LIKE 'T%' AND rating = 'G';

-- How many of the country names in the country table consist of 5 characters?
SELECT COUNT (*) FROM country
WHERE length (country) = 5;

-- How many of the city names in the city table end with the character 'R' or r?
SELECT COUNT (*) FROM city
WHERE city ILIKE '%r';