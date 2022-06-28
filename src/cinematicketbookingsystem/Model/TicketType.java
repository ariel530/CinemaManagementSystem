
package cinematicketbookingsystem.Model;


public class TicketType {
    private int T_Id;
    private String T_Name;

    public TicketType() {
    }

    public TicketType(int T_Id, String T_Name) {
        this.T_Id = T_Id;
        this.T_Name = T_Name;
    }

    public int getT_Id() {
        return T_Id;
    }

    public void setT_Id(int T_Id) {
        this.T_Id = T_Id;
    }

    public String getT_Name() {
        return T_Name;
    }

    public void setT_Name(String T_Name) {
        this.T_Name = T_Name;
    }
    
}
