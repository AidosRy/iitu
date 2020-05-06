package kz.iitu.csse.group34.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class NewsPost implements Comparable<NewsPost>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String shortContent;
    private String content;
    @ManyToOne
    private Users author;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date postDate;
    @ManyToMany
    private Set<Users> likes;

    @Override
    public int compareTo(NewsPost newsPost) {
        return newsPost.getPostDate().compareTo(this.getPostDate());
    }
//    @DateTimeFormat(pattern="dd-MMM-YYYY")
//    public Date getReleaseDate() {
//        return date;
//    }
}
