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

  Scenario: TC02 Bir randevu guncellendiginde; kullanıcı (doktor), hastanın asagıdaki bilgilerini gormelidir
  "id, start and end date, Status, physician and patient"

    Given doktor "ID","Start DateTime","End DateTime","Status","Physician" gorebilmeli


  Scenario: TC03 Doktor  "Anamnesis, Treatment ve Diagnosis"  alanlarini doldurmak zorundadir
    Given doktor "Anamnesis","Treatment" ve "Diagnosis" alanlarini doldurmali

  Scenario: TC04 "prescription ve description" alanlari doldurmali
    Given doktor "prescription","description" doldurmali

  Scenario: TC05 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak secilebilmeli
    Given doktor status olarak secebilmeli
