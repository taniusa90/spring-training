package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private Status status;//spring want to know which relationship between payment and payment details
   // @OneToOne(cascade = CascadeType.ALL)//the spring will save,REMOVE automatically payment details
   @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
   // @JoinColumn(name = "payment_detail_id")
    private PaymentDetail paymentDetail;//has relationship for spring means join
    @ManyToOne
    private Merchant merchant;
    @ManyToOne
    private Customer customer;
    public Payment(LocalDate createdDate, BigDecimal amount, Status status) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.status = status;
    }
}
