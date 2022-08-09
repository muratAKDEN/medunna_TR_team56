Feature: US11 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli


Background: ortak adimlar
  Given kullanici "medunnaUrl" anasayfasindaa
  Then doktor signInbutonu tiklar
  And doktor loginButonu tiklar
  And doktor "doctorUser" ve "password" girer SignIn tıklar
  And doktor mypages butonuna tiklar
  And doktor myAppointments butonuna tiklar
  And doktor edit butonuna tiklar


  Scenario: TC01 "Create a new appointment or edit" işlemlerini yapabilmeli


    Given doktor Create or Edit an Appointment yazisini gorur
