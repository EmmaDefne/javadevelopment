public class Mentor {
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

     //constructor
    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) {
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }
    //method
    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();

    }
}
