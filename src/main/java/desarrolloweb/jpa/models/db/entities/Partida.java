package desarrolloweb.jpa.models.db.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Builder
@Data
@Table(name = "partidas")
@NoArgsConstructor
@AllArgsConstructor
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "creador_email", referencedColumnName = "email", nullable = false)
    private Usuario creadorEmail;

    @Column(nullable = false, length = 100)
    private String deporte;

    @Column(nullable = false, length = 100)
    private String ciudad;

    @Column(nullable = false, length = 100)
    private String provincia;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private Time hora_comienzo;

    @Column(nullable = false)
    private Time hora_final;

    @Column(nullable = false)
    private Integer participantes;

    @Column(nullable = false)
    private Integer suplentes;

    @Column(nullable = false, length = 100)
    private String comentarios;
}
