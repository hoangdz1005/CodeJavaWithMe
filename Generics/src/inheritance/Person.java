package inheritance;

public class Person<K, V> {
    private K identifier;
    private V information;

    public K getIdentifier() {
        return identifier;
    }

    public void setIdentifier(K identifier) {
        this.identifier = identifier;
    }

    public V getInformation() {
        return information;
    }

    public void setInformation(V information) {
        this.information = information;
    }

    public Person(K identifier, V information) {
        this.identifier = identifier;
        this.information = information;
    }
}
