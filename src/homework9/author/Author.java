package homework9.author;

import java.util.Objects;

public class Author {

    private String name;
    private String lastname;

    public Author(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public String toString(){
        return "name: " + name + ", lastname: "+ lastname;
    }

    public boolean equals(Author author) {
        if (author == null) return false;

        if (!Objects.equals(name, author.name)) return false;
        return Objects.equals(lastname, author.lastname);
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }
}
