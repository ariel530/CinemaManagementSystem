
package cinematicketbookingsystem.Model;

import java.sql.Date;


public class Movie {
    private int M_Id;
    private String M_Name;
    private Date M_Date;
    private String M_Time;
    private double  M_Price;
    private int M_TId;
    private int M_HId;
    private String M_ImagePath;
    private boolean M_IsDeleted;

    public Movie() {
    }

    public Movie(int M_Id, String M_Name, Date M_Date, String M_Time, double M_Price, int M_TId, int M_HId, String M_ImagePath, boolean M_IsDeleted) {
        this.M_Id = M_Id;
        this.M_Name = M_Name;
        this.M_Date = M_Date;
        this.M_Time = M_Time;
        this.M_Price = M_Price;
        this.M_TId = M_TId;
        this.M_HId = M_HId;
        this.M_ImagePath = M_ImagePath;
        this.M_IsDeleted = M_IsDeleted;
    }

    public int getM_Id() {
        return M_Id;
    }

    public void setM_Id(int M_Id) {
        this.M_Id = M_Id;
    }

    public String getM_Name() {
        return M_Name;
    }

    public void setM_Name(String M_Name) {
        this.M_Name = M_Name;
    }

    public Date getM_Date() {
        return M_Date;
    }

    public void setM_Date(Date M_Date) {
        this.M_Date = M_Date;
    }

    public String getM_Time() {
        return M_Time;
    }

    public void setM_Time(String M_Time) {
        this.M_Time = M_Time;
    }

    public double getM_Price() {
        return M_Price;
    }

    public void setM_Price(double M_Price) {
        this.M_Price = M_Price;
    }

    public int getM_TId() {
        return M_TId;
    }

    public void setM_TId(int M_TId) {
        this.M_TId = M_TId;
    }

    public int getM_HId() {
        return M_HId;
    }

    public void setM_HId(int M_HId) {
        this.M_HId = M_HId;
    }

    public String getM_ImagePath() {
        return M_ImagePath;
    }

    public void setM_ImagePath(String M_ImagePath) {
        this.M_ImagePath = M_ImagePath;
    }

    public boolean isM_IsDeleted() {
        return M_IsDeleted;
    }

    public void setM_IsDeleted(boolean M_IsDeleted) {
        this.M_IsDeleted = M_IsDeleted;
    }
    
    
    
    
    
}
