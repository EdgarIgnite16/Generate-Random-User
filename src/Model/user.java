package Model;

public class user {
    private int Id;
    private String Uid;
    private String Username;
    private String Email;
    private String Firstname;
    private String Lastname;
    private String Address;
    private String PhoneNumber;
    private String CreaditCard;
    private String DateOfBirth;
    private String Gender;
    private String Password;
    private String SocialInsuranceNumber;

    public user() {
        this.Id = -1;
        this.Uid = "";
        this.Username = "";
        this.Email = "";
        this.Firstname = "";
        this.Lastname = "";
        this.Address = "";
        this.PhoneNumber = "";
        this.CreaditCard = "";
        this.DateOfBirth = "";
        this.Gender = "";
        this.Password = "";
        this.SocialInsuranceNumber = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getCreaditCard() {
        return CreaditCard;
    }

    public void setCreaditCard(String creaditCard) {
        CreaditCard = creaditCard;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSocialInsuranceNumber() {
        return SocialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(String socialInsuranceNumber) {
        SocialInsuranceNumber = socialInsuranceNumber;
    }


    @Override
    public String toString() {
        return "user{" +
                "Id=" + Id +
                ", Uid='" + Uid + '\'' +
                ", Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", CreaditCard='" + CreaditCard + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Password='" + Password + '\'' +
                ", SocialInsuranceNumber='" + SocialInsuranceNumber + '\'' +
                '}';
    }
}
