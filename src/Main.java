import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Gesamt_Ressource ressource_Main =new Gesamt_Ressource(128,256,10000);
        VM_Teilressource vM1 = new VM_Teilressource(8,18,100);
        VM_Teilressource vM2 = new VM_Teilressource(11,18,100);
        VM_Teilressource vM3 = new VM_Teilressource(22,28,70);
        ArrayList<VM_Teilressource> liste_der_VM = new ArrayList<VM_Teilressource>();

        liste_der_VM.add(vM1);
        liste_der_VM.add(vM2);
        liste_der_VM.add(vM3);
// TODO AUSGABE_GESAMT  --> in methode Auslagern


        for(int i = 0; i<liste_der_VM.size(); i++){

                    int vrb_Kerne =  ressource_Main.getGsmt_Kerne() - liste_der_VM.get(i).getZgw_Kerne() ;
                    ressource_Main.setGsmt_Kerne(vrb_Kerne);
                    int vrb_Ram =  ressource_Main.getGsmt_Ram() - liste_der_VM.get(i).getZgw_Ram() ;
                    ressource_Main.setGsmt_Ram(vrb_Ram);
                    int vrb_Fstpltt =  ressource_Main.getGsmt_Fstpltt() - liste_der_VM.get(i).getZgw_Fstpltt() ;
                    ressource_Main.setGsmt_Fstpltt(vrb_Fstpltt);

    }
        System.out.println("Verbleibende Gesamtkerne = "+ressource_Main.getGsmt_Kerne());
        System.out.println("Verbleibender Ram = "+ressource_Main.getGsmt_Ram());
        System.out.println("Verbleibende GB_Festplatte = "+ressource_Main.getGsmt_Fstpltt());


}
}