package game.alliance.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {
    @Id
    private UUID id;
    @Field
    private String username;
    @Field
    private String password;
    @Field
    private String email;
    @Field
    private LocalDateTime createdAt;
    @Field
    private LocalDate dateOfBirth;
}
