package service;

import implementation.Mentor;

public class MentorAccount {
    //This mentor interface makes it lossely coupling
    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void manageAccount(){
        this.mentor.createAccount();
    }

}
