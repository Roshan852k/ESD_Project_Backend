CREATE TABLE course (
    course_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_code VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    credit INT NOT NULL,
    capacity INT NOT NULL,
    year INT NOT NULL,
    term VARCHAR(255) NOT NULL
);

CREATE TABLE pre_requisites (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_id BIGINT NOT NULL,
    pre_requisites VARCHAR(255) NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE schedule (
    schedule_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_id BIGINT NOT NULL,
    day VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    time VARCHAR(255) NOT NULL
);

CREATE TABLE faculty (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    faculty VARCHAR(255) NOT NULL,
    course_id BIGINT NOT NULL
);

CREATE TABLE specialisation (
    specialisation_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    year INT,
    credit INT
);

CREATE TABLE course_specialisation (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_id BIGINT NOT NULL,
    specialisation_id BIGINT NOT NULL
);

CREATE TABLE emp (
    emp_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255),
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    title VARCHAR(255),
    department VARCHAR(255)
);

