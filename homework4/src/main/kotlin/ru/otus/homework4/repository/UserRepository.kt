package ru.otus.homework4.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.otus.homework4.model.User
import javax.transaction.Transactional


@Repository
@Transactional(Transactional.TxType.MANDATORY)
interface UserRepository : JpaRepository<User, Long>