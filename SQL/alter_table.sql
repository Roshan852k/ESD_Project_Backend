ALTER TABLE pre_requisites
ADD FOREIGN KEY (course_id) REFERENCES course(course_id);

ALTER TABLE pre_requisites
ADD FOREIGN KEY (pre_requisites) REFERENCES course(name);

ALTER TABLE schedule
ADD FOREIGN KEY (course_id) REFERENCES course(course_id);

ALTER TABLE faculty
ADD FOREIGN KEY (course_id) REFERENCES course(course_id);

ALTER TABLE course_specialisation
ADD FOREIGN KEY (course_id) REFERENCES course(course_id);

ALTER TABLE course_specialisation
ADD FOREIGN KEY (specialisation_id) REFERENCES specialisation(specialisation_id);

