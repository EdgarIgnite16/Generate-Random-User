package Ultilites;

import java.util.ArrayList;

public class _OptionGenerate {
    private ArrayList<String> listOptionns;

    public _OptionGenerate() {
        try {
            this.listOptionns = new ArrayList<>();
            this.setData();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setData() {
        listOptionns.add("Id");
        listOptionns.add("Uid");
        listOptionns.add("Username");
        listOptionns.add("Email");
        listOptionns.add("Firstname");
        listOptionns.add("Lastname");
        listOptionns.add("Address");
        listOptionns.add("PhoneNumber");
        listOptionns.add("CreaditCard");
        listOptionns.add("DateOfBirth");
        listOptionns.add("Gender");
        listOptionns.add("Password");
        listOptionns.add("SocialInsuranceNumber");
        listOptionns.add("Subscription");
    }

    public ArrayList<String> getData() {
        return listOptionns;
    }
}
