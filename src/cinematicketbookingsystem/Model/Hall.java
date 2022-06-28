
package cinematicketbookingsystem.Model;

public class Hall {
    private int H_Id;
    private String H_Name;
    public Hall() {
         this.H_Id = 0;
        this.H_Name = "";
    }

    public Hall(int H_Id, String H_Name) {
        this.H_Id = H_Id;
        this.H_Name = H_Name;
    }

    public int getH_Id() {
        return H_Id;
    }

    public void setH_Id(int H_Id) {
        this.H_Id = H_Id;
    }

    public String getH_Name() {
        return H_Name;
    }

    public void setH_Name(String H_Name) {
        this.H_Name = H_Name;
    }
    
    
}
