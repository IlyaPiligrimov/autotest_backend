import io.restassured.filter.log.LogDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTestBuilder {

    @Test
    void createObject(){

        MyClass myClass1 = new MyClass();
        myClass1.setAttr1("");
        myClass1.setAttr2(true);
        myClass1.setAttr3(1l);

        MyClass myClass2 = new MyClass("",true,1l);

        MyClass myClass3 = new MyClassBuilder()
                .setAttr1("")
                .setAttr2(true)
                .setAttr3(1l)
                .createMyClass();

        Assertions.assertEquals(myClass1,myClass3);
        Assertions.assertFalse(myClass1==myClass3);
    }
}