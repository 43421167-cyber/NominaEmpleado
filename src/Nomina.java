public class Nomina {
    private String clave;
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    //Creando el constructor
    public Nomina (String clave, String nombre, int horasTrabajadas, double pagoPorHora){
        this.clave = clave;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    //Creando getters y setters
    public String getClave(){
        return clave;
    }
    public void setClave(String clave){
        this.clave = clave;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    //Reglas a implementar
    //Horas trabajadas
    public int getHorasCalculadas(){
        if(horasTrabajadas > 50){
            return 50;
        }
        return horasTrabajadas;
    }

    //Horas normales
    public int calcularHorasNormales() {
        int horas = getHorasCalculadas();
        if(horas > 40){
            return 40;
        }
        return horas;
    }
     //Determinar Horas Extras
    public int calcularHorasExtras() {
        int horas = getHorasCalculadas();
        if (horas > 40){
            return horas - 40;
        }
        return 0;
    }

    //Calcular pago de las horas normales
    public double calcularPagoNormal() {
        return calcularHorasNormales() * pagoPorHora;
    }

    //Calcular el pago de las horas extra
    public double calcularPagoExtra() {
        return calcularHorasExtras() * (pagoPorHora * 2);
    }

    //Calcular el pago total
    public double calcularPagoTotal() {
        return calcularPagoNormal() + calcularPagoExtra();
    }



}
