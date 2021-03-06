package be.vdab.landen.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Entity
@Table(name = "landen")
public class Land {
    @Id
    private String code;
    private String naam;
}
