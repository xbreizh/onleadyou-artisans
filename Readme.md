# OnleadYou - Artisan

The project is a Springboot application that deploys a simple API allowing to:
    - retrieve artisans based on some search criteria (job, city)
    - update artisans

It uses a H2 database which is filled with some sample data (see data.sql)
It deploys on port 8081 by default (both the api and the database) but that can be changed within the application.properties (server.port)

_Query example:_

### Get artisan by id:
    `Get http://localhost:8081/artisans/1`

### Get artisan by Search criteria:
`Get http://localhost:8081/artisans/criteria`
   ```
   {
        "job": "pLombier",
        "city": "mons"
   }
   ```

### Update an artisan:

`Put http://localhost:8080/artisans`

```
{
    "id": 1,
    "company": "compagnie Abécé",
    "address": "28, plage du soleil",
    "cities": [
        {
            "id": 2
        }
    ]
}
```

_Note_: 
    - An artisan can potentially be in several cities and have different jobs
