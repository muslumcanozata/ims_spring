package ims.spr.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EMPLOYEEM")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISNO")
    private int isno;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "TEL")
    private long tel;

    @Column(name = "RFID")
    private String rfid;

    @Column(name = "DIRECTORATE")
    private int directorate;

    @Column(name = "MANAGER")
    private String manager;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "RATIONGROUP")
    private int rationGroup;

    @Column(name = "DS")
    private String ds;
}
