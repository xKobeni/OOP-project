package project_design;

public class admindatas{
    
    private String admin; 
    private String adminpass; 
    private String adminID; 
    
    public admindatas(String admin, String adminpass, String adminID){
        
        this.admin = admin; 
        this.adminpass = adminpass; 
        this.adminID = adminID; 
        
        //new Create_New(admin, adminpass, adminID);
    }
    
    public String getadmin(){return admin;}
    public String getadminpass(){return adminpass;}
    public String getadminID(){return adminID;}
    
    
    public void setadmin(String admin){this.admin = admin;}
    public void setadminpass(String adminpass){this.adminpass = adminpass;}
    public void setadminID(String adminID){this.adminID = adminID;}
    
}

