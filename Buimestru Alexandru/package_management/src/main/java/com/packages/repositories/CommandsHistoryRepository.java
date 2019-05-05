package com.packages.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packages.model.CommandsHistory;

public interface CommandsHistoryRepository extends JpaRepository<CommandsHistory,Integer>{
    public List<CommandsHistory> findAllByEmailSender(String email_sender);
    public List<CommandsHistory> findAllByEmailDriver(String email_driver);
    public Boolean existsByEmailSender(String email_sender);
    public Boolean existsByEmailDriver(String email_driver);
}
