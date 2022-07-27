public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setEdad(20);
        p1.setNombre("Esmeldy");
        p1.setTelefono(636751022);

        System.out.println("Edad: "+p1.getEdad());
        System.out.println("Nombre: "+p1.nombre);
        System.out.println("Teléfono: "+p1.telefono);

    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }
}