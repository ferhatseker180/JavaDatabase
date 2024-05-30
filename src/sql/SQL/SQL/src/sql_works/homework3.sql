
-- List data starting with the letter A in the Country table
SELECT * FROM country
WHERE country LIKE 'A%a'

-- Listing data in the Country list that consists of at least 6 characters and ends with n
SELECT * FROM country
WHERE country LIKE '_____%n';

-- List the movie names in the title column of the movie table that contain at least 4 'T' characters, regardless of whether they are uppercase or lowercase.
SELECT title FROM film
WHERE title ILIKE '%t%';

-- Among the data in all columns in the movie table, list the data whose title starts with the character 'C', whose length is greater than 90 and whose rental_rate is 2.99.
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;