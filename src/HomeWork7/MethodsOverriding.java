package HomeWork7;

import java.util.Objects;

public class MethodsOverriding {
    String computerName;
    String userName;
    int numOfUsers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodsOverriding that = (MethodsOverriding) o;
        return Objects.equals(computerName, that.computerName) && Objects.equals(userName, that.userName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
    @Override
    public String toString() {
        return "MethodsOverriding{" +
                "Computer name - " + computerName +
                ", User name - " + userName +
                ", Total number of users - " + numOfUsers +
                "}";
    }

    public static void main(String[] args) {
        MethodsOverriding firstMeth = new MethodsOverriding();
        firstMeth.computerName = "Max";
        firstMeth.userName = "Max";
        firstMeth.numOfUsers = 2;
        System.out.println(firstMeth);

        String wantToSeeHashCode = String.valueOf(firstMeth.computerName.hashCode());
        System.out.println(wantToSeeHashCode);

        String result = String.valueOf(firstMeth.computerName.equals(firstMeth.userName));
        System.out.println(result);
    }
}
