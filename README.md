# InheritanceLab
<ul>
 <li>Implement a Inheritance Projecct for Hospital</li>
 <li>Implemented a parent class HospitalEmployee.java and created three subclass Nurse.java and Doctor.java which extends HospitalEmployee and one Surgeon.java which extends Doctor</li>
 <li>In HospitalEmployee.java we have created two varialble for name and employee id and also created a work() method that prints the name employee who works in the hospital and a toString() method which return the value name and the employee id.</li>
 <li>In Nurse.java we have created a new variable number of patients and also inherited all the vairables from the parent class HospitalEmployee, implemented a constructor and override the toString() methof which return the value name, the emloyee id and the number of patiet the nurse have.</li>
 <li>In Doctor.java we have created a new variable speciality and also inherited all the vairables from the parent class HospitalEmployee, implemented a constructor and override the toString() methof which return the value name, the emloyee id and the speciality of the doctor.</li>
 <li>In Surgeon.java we have created a new variable operating and also inherited all the vairables from the parent class Doctor, implemented a constructor and override the toString() methof which return the value name, the emloyee id and whether the doctor is operating or not.</li>
 <li>We have to run a super class Hospital.java which created several objects drevid from HospitalEMployee</li>
 <li>Then Override the work() method in the Nurse,Doctor and Surgeon class to print a different output and then run the Hospital.java class again to see the final output</li>
