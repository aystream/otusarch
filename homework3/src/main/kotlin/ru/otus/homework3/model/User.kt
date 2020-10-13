package ru.otus.homework3.model

import java.io.Serializable
import javax.persistence.*

@Entity 
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
        @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
        var id: Long? = null,
        @Column(name = "user_name")
        var username: String? = null,
        @Column(name = "first_name")
        var firstName: String? = null,
        @Column(name = "last_name")
        var lastName: String? = null,
        var email: String? = null,
        var phone: String? = null,
) : Serializable {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is User) return false

                return id != null && other.id != null && id == other.id
        }

        override fun hashCode() = 31

        override fun toString() = "User{" +
                "id=$id" +
                ", username='$username'" +
                "}"

        companion object {
                private const val serialVersionUID = 1L
        }
}
