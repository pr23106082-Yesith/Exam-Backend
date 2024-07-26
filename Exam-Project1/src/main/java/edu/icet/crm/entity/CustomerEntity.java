package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;
    private String city;
    private  String contact;
}
