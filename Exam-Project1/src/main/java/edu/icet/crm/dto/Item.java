package edu.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Integer id;
    private String name;
    private String rentalPerDay;
    private String fineperDay;
    private  String availability;
}
