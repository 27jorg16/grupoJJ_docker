package pe.edu.cibertec.grupoJJ_docker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pedidoId;

    @ManyToOne
    @JoinColumn(name = "ClienteId")
    private Cliente cliente;

    @Column(name = "FechaPedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;

    @Column(name = "TotalPedido")
    private Double totalPedido;
}