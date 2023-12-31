INSERT
INTO
    "job"
    ("name")
VALUES
    ('plombier'),
    ('peintre'),
    ('menuisier'),
    ('maçon');

INSERT
INTO
    "city"
    ("name", "postcode", "county", "country")
VALUES
    ('Nimes', '43444', 'Gard', 'France'),
    ('Mons', '43444', 'Wallonie', 'Belgique'),
    ('Paris', '75440', 'Ile de France', 'France');

INSERT
INTO
    "artisan"
    ("company", "contactperson", "email", "phonenumber", "address", "keywords")
VALUES
   ('compagnie A', 'Jean-Paul Marso', 'companya@test.com', '33856554877', '2, rue du moulin', 'carrelage'),
   ('compagnie B', 'Maurice Moss', 'companyb@test.com', '33856554878', '55, avenue bourguignon', 'bois, alu, pvc'),
   ('compagnie C', 'Delphine Rouvier', 'companyc@test.com', '33856554879', '28, plage sic', ''),
   ('compagnie D', 'Henri Ford', 'companyd@test.com', '33856554875', '45, rue de Lyon', 'ravalement');


INSERT
INTO
    "artisan_job"
    ("artisan_id", "job_id")
VALUES
    (1, 1),
    (2, 2),
    (2, 3),
    (3, 4);


INSERT
INTO
    "artisan_city"
    ("artisan_id", "city_id")
VALUES
    (1, 1),
    (1, 2),
    (2, 1),
    (3, 3),
    (4, 3);
