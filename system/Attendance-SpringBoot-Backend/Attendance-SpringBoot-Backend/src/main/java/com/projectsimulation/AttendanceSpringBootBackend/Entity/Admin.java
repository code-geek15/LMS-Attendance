package com.projectsimulation.AttendanceSpringBootBackend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    String id;
    private String adminName;
    private String phoneNumber;
    private String address;
}