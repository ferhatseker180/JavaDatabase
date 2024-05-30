-- Homework 11

-- Let's sort all the data for the first_name columns in the actor and customer tables.
(
	SELECT first_name FROM actor
	ORDER BY first_name
)
UNION
(
	SELECT first_name FROM customer
	ORDER BY first_name
);

-- Let's list the intersecting data for the first_name columns in the actor and customer tables.
(
	SELECT first_name FROM actor
)
INTERSECT
(
	SELECT first_name FROM customer
);

-- For the first_name columns in the actor and customer tables, let's list the data that is in the first table but not in the second table.
(
	SELECT first_name FROM actor
)
EXCEPT
(
	SELECT first_name FROM customer
);

