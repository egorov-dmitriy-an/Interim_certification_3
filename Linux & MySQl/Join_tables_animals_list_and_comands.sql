USE people_friends;
SELECT a.id, a.animal_name, a.birthday, an_c.id_comand FROM animals_list a
LEFT JOIN animals_comands an_c ON a.id=an_c.id_animal;