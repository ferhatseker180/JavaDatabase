-- HOMEWORK 7

-- Group the movies in the movie table according to their rating values.
SELECT rating FROM film
GROUP BY rating;

-- When we group the movies in the movie table according to the replacement_cost column, list the replacement_cost value and the corresponding number of movies if the number of movies is more than 50.
SELECT replacement_cost, COUNT(replacement_cost) FROM film
GROUP BY replacement_cost
HAVING COUNT(replacement_cost) > 50;

-- What are the customer numbers corresponding to the store_id values in the customer table?
SELECT store_id, COUNT(store_id) FROM customer
GROUP BY store_id;

-- After grouping the city data in the city table according to the country_id column, share the country_id information and the number of cities that contain the highest number of cities.
SELECT city,country_id, COUNT(city) FROM city
GROUP BY city, country_id
ORDER BY COUNT(city) DESC
LIMIT 1