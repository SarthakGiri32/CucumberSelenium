Feature: Prepaid NSO
  This feature is for the Prepaid NSO flow
  Background:
    Given user logs into Verizon Website

  @prepaidNSO
  Scenario Outline: Order a Prepaid SIM and plan for a phone
    When user clicks on the Shop menu
    And clicks on the Prepaid menu
    And clicks on the Prepaid overview option
    And clicks on the Bring Your Own Device option
    And clicks on the Join Verizon option
    And clicks on the Smartphone device type
    And clicks on Continue in the Device Type selection page
    And clicks on I don't know option in the Device Details page
    And enters <imeiNumber> IMEI number in the Device IMEI page
    And clicks on the Check my device option
    And clicks on the Add SIM to cart option
    And enters <zipCode> ZIP Code in the Confirm Location pop-up
    And clicks on the Remember Location checkbox
    And clicks on the Confirm location button
    And selects the Five GB prepaid plan
    And clicks on Continue in the Plan Selection page
    Then clicks on Not now in the International plans page
    Examples:
      | imeiNumber              | zipCode   |
      | "357536082126865" | "76401" |