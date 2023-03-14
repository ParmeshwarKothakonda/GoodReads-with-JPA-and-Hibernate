Given five files,

- `BookController.java` 
- `BookRepository.java`
- `BookJpaService.java`
- `BookJpaRepository.java`
- `Book.java`

And also given a database file `goodreads` which contains `book` table.

#### PLAYLIST table

|    Columns    |  Type   |
| :-----------: | :-----: |
|    id         | INTEGER |
|   name        |  TEXT   |
|   imageUrl    |  TEXT   |


### Completion Instructions

- `Book.java`: The `Book` class should contain the following attributes.

  |   Attribute   |  Type   |
  | :-----------: | :----:  |
  |    id         | INTEGER |
  |   name        |  TEXT   |
  |   imageUrl    |  TEXT   |

- `BookRepository.java`: Create an interface containing required methods.
- `BookJpaService.java`: Update the service class with logic for managing book data.
- `BookController`: Create the controller class to handle HTTP requests.
- `BookJpaRepository.java`: Create an interface which implements the `JpaRepository` interface.

Implement the following APIs.

### API 1

#### Path: `/books`

#### Method: `GET`

#### Description:

Returns a list of all books in the `book`.

#### Response

```
[
    {
        "id": 1,
        "name": "Save the cat",
        "imageUrl": "savethecat.jpg"
    },
   ...
]
```

### API 2

#### Path: `/books`

#### Method: `POST`

#### Description:

Creates a new book in the `book`. `id` is auto-incremented.

#### Request

```
{
        "name": "Re-Work",
        "imageUrl": "rework.jpg"
}

```

#### Response

```
{
        "id": 2,
        "name": "Re-Work",
        "imageUrl": "rework.jpg"
}
```

### API 3

#### Path: `/books/bulk`

#### Method: `POST`

#### Description:

Creates multiple books in the book table and returns a text containing the numbers of books added.
For example, the below request object contains details of 4 books.

#### Request

```
[
    {
        "name": "Ikigai",
        "imageUrl": "ikigai.jpg"
    },
    {
        "name": "Atomic Habits",
        "imageUrl": "atomichabits.jpg"
    },
    ...
]

```
#### Request

Successfully added 4 books

### API 4

#### Path: `/books/{id}`

#### Method: `GET`

#### Description:

Returns a book based on a `id`. If the given `id` is not found in the `book`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Response

```
{
    "id": 4,
    "name": "Atomic Habits",
    "imageUrl": "atomichabits.jpg"

}
```

### API 5

#### Path: `/books/{id}`

#### Method: `PUT`

#### Description:

Updates the details of a book in the `book` based on the `id` and return the updated book details.
If the given `id` is not found in the `book`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

#### Request

```
{
    "name": "Re work"
}
```

#### Response

```
{
    "id": 2,
    "name": "Re Work",
    "imageUrl": "rework.jpg"
}

```

### API 6

#### Path: `/books/{id}`

#### Method: `DELETE`

#### Description:

Deletes a book from the `book`  based on the `id`. If the given `id` is not found in the `book`, raise `ResponseStatusException` with `HttpStatus.NOT_FOUND`.

**Do not modify the code in the `BookApplication.java`.**

**Do not  modify anything in the `application.properties` file**

**Do not add any Sql files**

