# cloud-api

[![Build Status](https://api.travis-ci.org/sarbull/blog-api.svg?branch=master)](https://travis-ci.org/sarbull/blog-api)

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.svg)](https://heroku.com/deploy?template=https://github.com/spring-rookie/cloud-api/tree/master)

Cloud's API using Spring and JPA.

# Demo
[https://cloud-api-2.herokuapp.com](https://cloud-api-2.herokuapp.com/posts)

# Tools
- Swagger
- Spring Data JPA
- H2 for development

# API

## Posts
| Method        | URL                     |
|---------------|-------------------------|
| GET           | /cloud                  |
| POST          | /cloud                  |
| GET           | /cloud/:postId          |
| DELETE        | /cloud/:postId          |
| GET           | /cloud/:postId/comments |
| POST          | /cloud/:postId/comments |

## Posts
![Posts](https://raw.githubusercontent.com/sarbull/blog-api/master/media/posts.png)
