package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"address","country","state"},ignoreUnknown = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDTO {
   @JsonIgnore
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @JsonBackReference//will hide the UserDto from AccountDto, this field is not going to be serialized
    private UserDTO user;//we prevent the UserDto to be converted to Json in AccountDto
}
