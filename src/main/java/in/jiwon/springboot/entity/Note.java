package in.jiwon.springboot.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="tbl_notes")
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String body;

    private String category;


}