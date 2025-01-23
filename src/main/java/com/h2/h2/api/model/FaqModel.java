package com.h2.h2.api.model;
import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name = "faqTable")
@Data
public class FaqModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idFaq;
    
        @Column(name = "question",length = 120, nullable = false)
        private String question;
    
        @Column(name = "answer",length = 120, nullable = false)
        private String answer;
    
        @Column(name = "category",length = 120, nullable = false)
        private String category;
    
        @Column(name = "status",length = 120, nullable = false)
        private String status;
    
        @Column(name = "createUser",length = 120, nullable = false)
        private String createUser;
    
        @Column(name = "updateUser",length = 120, nullable = true)
        private String updateUser;
}
