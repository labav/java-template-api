package ru.boar.javatemplateapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.boar.javatemplateapi.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>  {
    // TODO: Тута вбиваешь findBy... или прочие методы, при необходимости сложные реализовываешь
}
