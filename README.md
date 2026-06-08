# IPL Dashboard

A full-stack web application that allows users to explore IPL teams, view match statistics, analyze team performance, and browse season-wise match history.

This project was built using Spring Boot for the backend and React for the frontend. Match data is stored and queried from a PostgreSQL database, providing fast access to team statistics and historical IPL records.

<img width="2342" height="1682" alt="image" src="https://github.com/user-attachments/assets/ba0bbd7d-5dbf-4628-b577-6dbbd3d94cd4" />

<img width="2234" height="1680" alt="image" src="https://github.com/user-attachments/assets/f8119e6e-2217-4097-bb7e-f3ab75469cb7" />

<img width="2288" height="1684" alt="image" src="https://github.com/user-attachments/assets/df4acbf8-32bc-45b7-9ef8-e0dd4d65bafd" />

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

Frontend (React)->REST API Calls->Backend (Spring Boot)->Spring Data JPA->PostgreSQL Database

## Dataset

The IPL dataset contains historical IPL match information including teams, venues, results, players, and season data. Data is processed and imported into PostgreSQL using Spring Batch.

