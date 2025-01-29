package com.h2.h2.api.model;
import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name = "faqtable")
@Data
public class FaqModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idfaq;
        private String question;
        private String answer;
        private String category;
        private String status;
        private String createUser;
        private String updateUser;
}
