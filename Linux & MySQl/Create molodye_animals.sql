USE people_friends;

DROP TABLE IF EXISTS molodye_animals;
CREATE TABLE molodye_animals 
SELECT 
	id, 
	(((TIMESTAMPDIFF(DAY, birthday, NOW()) DIV 30) DIV 12)) as full_years, 
    (((TIMESTAMPDIFF(DAY, birthday, NOW()) DIV 30) % 12)) as full_month 
FROM animals_list 
WHERE (TIMESTAMPDIFF(MONTH, birthday, NOW())< 36  && TIMESTAMPDIFF(MONTH, birthday, NOW()) > 12);
