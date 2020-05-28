@Regression

Feature: Manage Medical Appointment
  As patient
  I make the request for a medical appointment
  To the Hospital Administration system

  @Doctor
  Scenario: Register a Doctor
    Given that carlos needs to register a new doctor
    When he registers it in the Hospital Administration application

  |name|lastName|phone|documentType|documentNumber|
  |Mercedes|González|2399500|Cédula de ciudadanía|43003288|

    Then he verifies that Doctor the message Datos guardados correctamente.

  @Patient
  Scenario: Register a patient
    Given that carlos needs to register a new patient
    When carlos registers it in the Hospital Administration application

  |name|lastName|phone|documentType|documentNumber|
  |Valentina|Jaramillo|2399582|Pasaportes|102013|

    Then he verifies that message Datos guardados correctamente.

  @Appointment
  Scenario: schedule appointment
    Given that carlos needs go to the doctor
    When he schedule an appointment

  |dateAppointment|documentNumberPatient|documentNumberDoctor|observations|
  |10/19/2019|102010|43998735|Cita Médica|

    Then he verifies that the Datos guardados correctamente.





