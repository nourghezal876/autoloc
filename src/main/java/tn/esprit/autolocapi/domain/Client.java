package tn.esprit.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;

    private String prenom;

    @Column(nullable = false, unique = true)
    private String email;

    private String telephone;

    @Column(name = "num_permis", nullable = false)
    private String numPermis;

    private LocalDate dateInscription;
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
}