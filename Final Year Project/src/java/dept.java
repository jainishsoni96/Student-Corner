/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunj Tandel
 */
public class dept 
{
    public int did;
    public String dname;
    
    dept(int did,String dname)
    {
       this.did=did;
       this.dname=dname;
    
    }

    /**
     * @return the did
     */
    public int getDid() {
        return did;
    }

    /**
     * @param did the did to set
     */
    public void setDid(int did) {
        this.did = did;
    }

    /**
     * @return the dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname the dname to set
     */
    public void setDname(String dname) {
        this.dname = dname;
    }
    
}
