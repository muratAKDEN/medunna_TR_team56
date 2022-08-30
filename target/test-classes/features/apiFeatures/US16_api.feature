Feature: Us 16 Rooms are read, created, updated and deleted

@RoomGet
  Scenario: Get Request For Rooms

    Given admin sends GET request
    And  admin deserializes the data coming from DB
    And admin validates the data


  @RoomPost
  Scenario: post request validation

    Given admin sends post request for rooms
    And  admin validates the post request


    @RoomPut
    Scenario: Put Request For Rooms

      Given  admin sends put request for rooms
