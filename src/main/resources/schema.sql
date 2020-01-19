DROP TABLE IF EXISTS EMPLOYEES;
  
CREATE TABLE LEAVE_APPROVAL (
  leave_id INT AUTO_INCREMENT  PRIMARY KEY,
  user_id VARCHAR(250) NOT NULL,
  user_name VARCHAR(250) NOT NULL,
  emp_role VARCHAR(250) NOT NULL,
  leave_status VARCHAR(250) NOT NULL,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL,
  
  
);

INSERT INTO LEAVE_APPROVAL (user_id, user_name, emp_role,leave_status,start_date,end_date) VALUES
  ('1', 'Samiksha','java','APPLIED',TO_DATE('17/12/2015', 'DD/MM/YYYY'),TO_DATE('18/12/2015', 'DD/MM/YYYY')),
  ('2', 'Padmaraj','Data scientist','APPROVED',TO_DATE('20/12/2015', 'DD/MM/YYYY'),TO_DATE('21/12/2015', 'DD/MM/YYYY')),
  ('3', 'Atharva','python developer','REJECTED',TO_DATE('27/12/2015', 'DD/MM/YYYY'),TO_DATE('28/12/2015', 'DD/MM/YYYY'));
