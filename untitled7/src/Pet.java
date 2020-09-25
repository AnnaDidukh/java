import java.util.Objects;

public class Pet {
    private String nik;
    private String v;

    public Pet(String nik, String v) {
        this.nik = nik;
        this.v = v;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nik='" + nik + '\'' +
                ", v='" + v + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(nik, pet.nik) &&
                Objects.equals(v, pet.v);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nik, v);
    }
}
