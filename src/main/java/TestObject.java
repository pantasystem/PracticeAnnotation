@TargetObject
public class TestObject {
    @Field(name = "name")
    public String name;

    @Field(name = "description")
    public String description;

    @Field(name = "age")
    public int age;

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                '}';
    }
}
