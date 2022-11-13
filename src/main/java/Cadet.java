import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cadet implements Comparable<Cadet> {
    private String name;
    private String rang;
    private int age;

    public Cadet(String name, String rang, int age) {
        this.name = name;
        this.rang = rang;
        this.age = age;
    }


    @Override
    public int compareTo(Cadet c) {
        return this.getAge()-c.getAge();
    }

}
