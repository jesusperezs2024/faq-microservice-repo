CREATE TABLE faqTable (
    idFaq INT AUTO_INCREMENT PRIMARY KEY,
    question VARCHAR(255),
    answer VARCHAR(255),
    category VARCHAR(255),
    status VARCHAR(255),
    create_user VARCHAR(255),
    update_user VARCHAR(255)
);
