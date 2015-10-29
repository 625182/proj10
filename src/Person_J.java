public class Person_J extends Person {
    String orgFormShort;
    String orgFormFull;

    public void setOrgFormShort(String orgFormShort) {
        this.orgFormShort = orgFormShort;
    }
    public String getOrgFormShort() {
        return this.orgFormShort;
    }

    public void setOrgFormFull(String orgFormFull) {
        this.orgFormFull = orgFormFull;
    }
    public String getOrgFormFull() {
        return this.orgFormFull;
    }

    public String getFullName() {
        return this.orgFormShort + " \"" + this.firstName + "\"";
    }
}
