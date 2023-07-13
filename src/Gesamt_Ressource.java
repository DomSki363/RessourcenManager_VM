public class Gesamt_Ressource {
    private int gsmt_Kerne;
    private int gsmt_Ram;
    private int gsmt_Fstpltt;

    public Gesamt_Ressource(int gsmt_Kerne, int gsmt_Ram, int gsmt_Fstpltt) {
        this.gsmt_Kerne=gsmt_Kerne;
        this.gsmt_Ram=gsmt_Ram;
        this.gsmt_Fstpltt=gsmt_Fstpltt;
    }

    public int getGsmt_Kerne() {
        return gsmt_Kerne;
    }

    public void setGsmt_Kerne(int gsmt_Kerne) {
        this.gsmt_Kerne = gsmt_Kerne;
    }

    public int getGsmt_Ram() {
        return gsmt_Ram;
    }

    public void setGsmt_Ram(int gsmt_Ram) {
        this.gsmt_Ram = gsmt_Ram;
    }

    public int getGsmt_Fstpltt() {
        return gsmt_Fstpltt;
    }

    public void setGsmt_Fstpltt(int gsmt_Fstpltt) {
        this.gsmt_Fstpltt = gsmt_Fstpltt;
    }

//    public int gsmt_Ressource_Rechner(int gsmt_Kerne,int zgw_Kerne,int gsmt_Ram,int zgw_Ram,int gsmt_Fstpltt,int zgw_Fstpltt){
//        int vrb_Kerne =  getGsmt_Kerne() - liste_der_VM.get(i).getZgw_Kerne() ;
//        ressource_Main.setGsmt_Kerne(vrb_Kerne);
//        int vrb_Ram =  ressource_Main.getGsmt_Ram() - liste_der_VM.get(i).getZgw_Ram() ;
//        ressource_Main.setGsmt_Ram(vrb_Ram);
//        int vrb_Fstpltt =  ressource_Main.getGsmt_Fstpltt() - liste_der_VM.get(i).getZgw_Fstpltt() ;
//        ressource_Main.setGsmt_Fstpltt(vrb_Fstpltt);
//    }

    @Override
    public String toString() {
        return "Gesamt_Ressource{" +
                "gsmt_Kerne=" + gsmt_Kerne +
                ", gsmt_Ram=" + gsmt_Ram +
                ", gsmt_Fstpltt=" + gsmt_Fstpltt +
                '}';
    }
}
