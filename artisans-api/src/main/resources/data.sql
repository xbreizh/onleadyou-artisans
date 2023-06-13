INSERT INTO "job"
    ("name")
VALUES ('plombier'),
    ('peintre'),
    ('menuisier'),
    ('maçon')
;

INSERT INTO "city"
    ("name", "postcode", "county", "country")
VALUES
    ('Nimes', '43444', 'Gard', 'France'),
    ('Mons', '43444', 'Wallonie', 'Belgique'),
    ('Paris', '75440', 'Ile de France', 'France');

INSERT INTO "artisan"
    ("company", "email", "phonenumber", "address")
VALUES ('compagnie A', 'companya@test.com', '33856554877', '2, rue du moulin'),
       ('compagnie B', 'companyb@test.com', '33856554878', '55, avenue bourguignon'),
       ('compagnie C', 'companyc@test.com', '33856554879', '28, plage sic'),
       ('compagnie D', 'companyd@test.com', '33856554875', '45, rue de Lyon');


-- Insert artisan_jobs
INSERT INTO "artisan_job" ("artisan_id", "job_id")
VALUES (1, 1), -- Artisan 1 has job 'plombier'
       (2, 2), -- Artisan 2 has job 'peintre'
       (2, 3), -- Artisan 2 also has job 'menuisier'
       (3, 4); -- Artisan 3 has job 'maçon'

-- Insert artisan_cities
INSERT INTO "artisan_city" ("artisan_id", "city_id")
VALUES (1, 1), -- Artisan 1 is located in city 'Nimes'
       (1, 2), -- Artisan 1 is also located in city 'Mons'
       (2, 1), -- Artisan 2 is located in city 'Nimes'
       (3, 3), -- Artisan 3 is located in city 'Paris'
       (4, 3); -- Artisan 4 is also located in city 'Paris'
