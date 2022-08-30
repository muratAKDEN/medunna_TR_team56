@smoke
Feature: US11 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli


Background: ortak adimlar
  Given Kullanici "medunnaUrl" adresine gider
  Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
  And kullanici acilan dropdown menude signIn butonuna tiklar
  And kullanici username olarak "doctorUser" girer
  And kullanici password olarak "password" girer
  And kullanici Sign In butonuna tiklar



  And ft mypages butonuna tiklar
  And ft myAppointments butonuna tiklar
  And ft edit butonuna tiklar


  Scenario: TC01 "Create a new appointment or edit" işlemlerini yapabilmeli


    Given ft Create or Edit an Appointment yazisini gorur
    And Kullanici sayfayi kapatir

  Scenario: TC02 Bir randevu guncellendiginde; kullanıcı (doktor), hastanın asagıdaki bilgilerini gormelidir
  "id, start and end date, Status, physician and patient"

    Given ft "ID","Start DateTime","End DateTime","Status","Physician" gorebilmeli
    And Kullanici sayfayi kapatir

  Scenario: TC03 Doktor  "Anamnesis, Treatment ve Diagnosis"  alanlarini doldurmak zorundadir
    Given ft "Anamnesis","Treatment" ve "Diagnosis" alanlarini doldurmali
    And Kullanici sayfayi kapatir
  Scenario: TC04 "prescription ve description" alanlari doldurmali
    Given ft "prescription","description" doldurmali
    And Kullanici sayfayi kapatir
  Scenario: TC05 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak secilebilmeli
    And ft "PENDING","COMPLETED","CANCELLED" olarak secebilmeli
    And Kullanici sayfayi kapatir