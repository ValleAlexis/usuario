public class Usuario {
    private String nombre;
    private Integer edad;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean ingresar(){
        String nombreString;
        System.out.println("Dime tu nombre: ");
        nombreString = App.sc.nextLine();
        setNombre(nombreString);
        return true;
    }

    public void crearDino(){
        if(ingresar())
            System.out.println("Voy a Crear Dino");
        else
            System.out.println("Primero debes logearte al sistema");

    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if(edad>0)
            this.edad = edad;
        else
            System.out.println("Edad incorrecta");
    }
    
}
