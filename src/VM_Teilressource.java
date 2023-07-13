public class VM_Teilressource {
    private int zgw_Kerne ;
    private int zgw_Ram ;

    private int zgw_Fstpltt ;

    public VM_Teilressource(int zgw_Kerne, int zgw_Ram, int zgw_Fstpltt) {
        this.zgw_Kerne = zgw_Kerne;
        this.zgw_Ram = zgw_Ram;
        this.zgw_Fstpltt = zgw_Fstpltt;
    }


    public int getZgw_Kerne() {
        return zgw_Kerne;
    }

    public void setZgw_Kerne(int zgw_Kerne) {
        this.zgw_Kerne = zgw_Kerne;
    }

    public int getZgw_Ram() {
        return zgw_Ram;
    }

    public void setZgw_Ram(int zgw_Ram) {
        this.zgw_Ram = zgw_Ram;
    }

    public int getZgw_Fstpltt() {
        return zgw_Fstpltt;
    }

    public void setZgw_Fstpltt(int zgw_Fstpltt) {
        this.zgw_Fstpltt = zgw_Fstpltt;
    }
    public int gsmt_Rechner_Fstpltt(int gsmt_Fstpltt, int zgw_Fstpltt){
        return gsmt_Fstpltt - zgw_Fstpltt;
    }
    @Override
    public String toString() {
        return "VM_Teilressource{" +
                "zgw_Kerne=" + zgw_Kerne +
                ", zgw_Ram=" + zgw_Ram +
                ", zgw_Fstpltt=" + zgw_Fstpltt +
                '}';
    }
}
