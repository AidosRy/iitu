package kz.iitu.csse.group34.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Users author;
    @ManyToOne
    private NewsPost newsPost;
    private  String comment;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date postDate;
    @ManyToMany
    private Set<Users> likes;
}
