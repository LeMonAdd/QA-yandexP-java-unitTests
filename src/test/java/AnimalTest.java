import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class )
public class FelineTest {
    private final String nameAnimal;

    public FelineTest(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    @Parameterized.Parameters
    public static Object[][] getNameAnimal() {
        return new Object[][] {
                {"Животные"},
                {"Птицы"},
                {"Рыба"},
        };
    }


    @Test
    public void test() throws Exception {
        Feline feline = new Feline();

        for(String el : feline.eatMeat()) {
            System.out.println(el);
        }
    }


}
