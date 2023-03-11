package com.bezkoder.spring.mssql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean xpublished;

  public Tutorial() {

  }

  public Tutorial(String title, String description, boolean xpublished) {
    this.title = title;
    this.description = description;
    this.xpublished = xpublished;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isXpublished() {
    return xpublished;
  }

  public void setXpublished(boolean isPublished) {
    this.xpublished = isPublished;
  }

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + xpublished + "]";
  }

}
