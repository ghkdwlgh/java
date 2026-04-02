package jump2java;
class HouseDog extends Dog {
    HouseDog(String name) {
        this.setName(name);
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class S5_0502 {

}
