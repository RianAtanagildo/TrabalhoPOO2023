import java.time.LocalDate;

public class Data {
    private LocalDate data;

    public Data(int ano, int mes, int dia) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(int ano, int mes, int dia) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}