package elerning.Model;


import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @Column(name = "category")
    private String category;

    public Categories() {
    }

    public String getCategory_name() {
        return category;
    }

    public void setCategory_name(String category_name) {
        this.category = category_name;
    }
}
