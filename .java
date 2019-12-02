import javax.swing.JOptionPane;

public class sistemaempleados {
    public static void main(String[] args) {
        int cantidad;
        String [] Empleados = new String [6];
        int [] Sueldo = new int [6];
        String EmpleadoMayor = null;
        double SueldoMayor=0;
        
JOptionPane.showMessageDialog(null, "Bienvenido. A continuación le solicitaremos :\n1- Cantidad de empleados que va ingresar \n2- Nombre del Empleado\n3- Sueldo");
   cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
   cantidad = cantidad+1;
        for (int i = 1; i < cantidad; i++)
            {
            Empleados[i] = JOptionPane.showInputDialog("Ingrese el Nombre del empleado numero "+i);
            
            for (int j = 0; j < 1; j++)
            {
                Sueldo[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado: "));            
                if(Sueldo[j]>SueldoMayor) 
                {
                SueldoMayor = Sueldo[j];
                EmpleadoMayor = Empleados [i];
                }
            }
            }
        JOptionPane.showMessageDialog(null, "El sueldo mas alto corresponde al empleado " + EmpleadoMayor + ", y es de $" + SueldoMayor);
        JOptionPane.showMessageDialog(null, "¡ Gracias vuelvas prontos !" );
    }
}
