package raj.springframework.recipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Raj Rathore on 09-Oct-17
 */
@Entity
public class UnitOfMeasure {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String description;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
