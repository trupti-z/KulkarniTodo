package appMain.web.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Size;

/**
 * The Class Todo.
 */
public class Todo {

	DateFormat dfor = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date obj = new Date();
  /** The id. */
  private int id;

  /** The user. */
  private String user;

  /** The desc. */
  @Size(min=10, message="Enter at least 10 characters")
  private String desc;

  /** The target date. */
  private Date targetDate;
  
  /** The Last Update. */
  private Date lastUpdate = obj;

  /** The is done. */
  private boolean done;

  public Todo() {
    super();
  }
  
  /**
   * Instantiates a new todo.
   *
   * @param id the id
   * @param user the user
   * @param desc the desc
   * @param targetDate the target date
   * @param lastUpdate the target date
   * @param isDone the is done
   */
  public Todo(int id, String user, String desc, Date targetDate, Date lastUpdate, boolean done) {
    super();
    this.id = id;
    this.user = user;
    this.desc = desc;
    this.targetDate = targetDate;
    this.lastUpdate=lastUpdate;
    this.done = done;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the user.
   *
   * @return the user
   */
  public String getUser() {
    return user;
  }

  /**
   * Sets the user.
   *
   * @param user the new user
   */
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Gets the desc.
   *
   * @return the desc
   */
  public String getDesc() {
    return desc;
  }

  /**
   * Sets the desc.
   *
   * @param desc the new desc
   */
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   * Gets the target date.
   *
   * @return the target date
   */
  public Date getTargetDate() {
    return targetDate;
  }

  /**
   * Sets the target date.
   *
   * @param targetDate the new target date
   */
  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }

  
  

  
  public Date getLastUpdate() {
	return lastUpdate;
}

public void setLastUpdate(Date lastUpdate) {
	;
	this.lastUpdate = lastUpdate;
}


  

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Todo other = (Todo) obj;
    if (id != other.id) {
      return false;
    }
    return true;
  }

  /**
   * Checks if is done.
   *
   * @return true, if is done
   */


/*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  public boolean isDone() {
	return done;
}

public void setDone(boolean done) {
	this.done = done;
}

/*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.format("Todo [id=%s, user=%s, desc=%s, targetDate=%s, lastUpdate=%s, isDone=%s]", id, user, desc,
        targetDate, lastUpdate, done);
  }
}
