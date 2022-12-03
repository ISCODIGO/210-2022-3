package clock;

public class Reloj implements Comparable<Reloj> {
    public static int variableStatic;
    // Atributos
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor
    // No tiene retorno (ni siquiera void)
    // Se llama igual que la clase
    public Reloj(int h, int m, int s) {
        variableStatic++;
        horas = h;
        minutos = m;
        segundos = s;
    }

    public Reloj() {
        variableStatic++;
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    // Constructor por copia
    public Reloj(Reloj r) {
        variableStatic++;
        horas = r.horas;
        minutos = r.minutos;
        segundos = r.segundos;
    }

    // Getter
    public int getHoras() {
        return horas;
    }

    // Setter
    public void setHoras(int horas) {
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("Las horas son desde 0 hasta 23");
        }
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Las minutos son desde 0 hasta 59");
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Las segundos son desde 0 hasta 59");
        }
        this.segundos = segundos;
    }

    public void incrementar1Seg() {
        // incrementar un segundo al reloj
        // 00:00:59 -> 00:01:00
        // 00:59:59 -> 01:00:00
        this.segundos++;

        if (this.segundos > 59) {
            this.segundos = 0;
            this.minutos++;
        }

        if (this.minutos > 59) {
            this.minutos = 0;
            this.horas++;
        }

        if (this.horas > 23) {
            this.horas = 0;
        }

    }

    public void rebajarStatic() {
        variableStatic--;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    @Override
    public int compareTo(Reloj o) {
        // A y B
        // A - B
        // A.compareTo(B)
        int segundos1 = segundos + minutos * 60 + horas * 3600;
        int segundos2 = o.segundos + o.minutos * 60 + o.horas * 3600;

        return segundos1 - segundos2;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Reloj temp)) {
            return false;
        }
        // unboxing
        //return this.horas == temp.horas && this.minutos == temp.minutos && this.segundos == temp.segundos;

        return this.compareTo(temp) == 0;

    }
}
