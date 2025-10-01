public class Main {
    public static void main(String[] args){
        Carrera programacion = new Carrera("Programacion universitaria", 20);

        System.out.println("Matriculacion y asignacion de materias");

        Estudiante fabian = new Estudiante("Fabian","Rodriguez",50, programacion.getNombre(), 7.1, 3);
        fabian.agregarMateria(new Materia("Matematica", "MAT101", 4, 7.1));
        fabian.agregarMateria(new Materia("Bases de datos", "BD102", 5, 7));
        
        Estudiante juan = new Estudiante("Juan", "Gonzalez", 28, programacion.getNombre(), 9.9, 3);
        juan.agregarMateria(new Materia("Matematica","MAT101", 4, 8.5));
        juan.agregarMateria(new Materia("Base de datos", "BD102", 5, 10));

        Estudiante david = new Estudiante("David", "Quint", 22, programacion.getNombre(), 10, 3);
        david.agregarMateria(new Materia("Matematica", "MAT101", 4, 10));
        david.agregarMateria(new Materia("Base de datos", "BD102", 5, 10));

        programacion.agregarEstudiante(fabian);
        programacion.agregarEstudiante(juan);
        programacion.agregarEstudiante(david);

        System.out.println("Resultados final");

        System.out.printf("Promedio de %s: %.2f\n", fabian.getNombre(), fabian.calcularPromedio());
        System.out.printf("Promedio de %s: %.2f\n", juan.getNombre(), juan.calcularPromedio());
        System.out.printf("Promedio de %s: %.2f\n", david.getNombre(),ricardo.calcularPromedio());

        programacion.listarEstudiantes();

        System.out.println("Buscando alumno");
        Estudiante encontrado = programacion.buscarEstudiante("Fabian");
        if(encontrado != null){
            System.out.println("Busqueda exitosa: Se encontro a " + encontrado.getNombre() +", con promedio " + String.format("%.2f", encontrado.calcularPromedio()));
        } else {
            System.out.println("Estudiante no encontrado...");
        }
    }
}
