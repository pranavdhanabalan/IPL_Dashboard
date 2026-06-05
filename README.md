# IPL Dashboard

A full-stack web application that allows users to explore IPL teams, view match statistics, analyze team performance, and browse season-wise match history.

This project was built using Spring Boot for the backend and React for the frontend. Match data is stored and queried from a PostgreSQL database, providing fast access to team statistics and historical IPL records.

## Features

* View all IPL teams
* Team performance overview
* Total matches played and matches won
* Win/Loss statistics
* Recent match details
* Season-wise match history
* Dynamic routing with React Router
* RESTful API integration between frontend and backend
* Responsive user interface

## Tech Stack

### Frontend

* React.js
* React Router
* HTML5
* CSS3

### Backend

* Spring Boot
* Spring Data JPA
* REST APIs
* Maven

### Database

* PostgreSQL

## Project Architecture

Frontend (React)
      |
      v
REST API Calls
      |
      v
Backend (Spring Boot)
      |
      v
Spring Data JPA
      |
      v
PostgreSQL Database

## Dataset

The IPL dataset contains historical IPL match information including teams, venues, results, players, and season data. Data is processed and imported into PostgreSQL using Spring Batch.

