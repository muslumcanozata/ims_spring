package ims.spr.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USERM")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISNO")
    private long isno;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "DS")
    private String ds;
}
