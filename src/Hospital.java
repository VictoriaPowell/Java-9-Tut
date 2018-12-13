public class Hospital {

    private int patients;
    private int doctors;
    private int examRoomCount;
    private boolean[] examRoomStatus;

    public Hospital (int patients, int doctors, int examRooms){
        this.patients = patients;
        this.doctors = doctors;
        this.examRoomCount = examRooms;
        this.examRoomStatus = new boolean[this.examRoomCount];
    }

    public void newPatient(int newPatients) {
        this.patients += newPatients;
    }

    public void newDoctor(int newDoctors) {
        this.doctors += newDoctors;
    }

    public int getPatients(){
        return this.patients;
    }

    public int getDoctors(){
        return this.patients;
    }

    public void doctorFinished(int roomNumber) {
        if(!this.examRoomStatus[roomNumber-1]){
            this.examRoomStatus[roomNumber-1] = true;
        }
        else {
            System.out.println("Error: This room is already empty");
        }
    }

    public double newWaitTime(){
        int emptyRooms = 0;
        for(int i = 0; i< this.examRoomCount; i++){
            if (this.examRoomStatus[i]){
                emptyRooms++;
            }
        }
        int count = this.patients - emptyRooms;

    }

    public String toString(){
        System.out.println("Welcome to the hospital!"
                + "\nThere are currently " + this.patients + " patients and "
                + this.doctors + " doctors."
                + "\nWith " + this.examRoomCount + " exam rooms, you should expect a "
                + this.newWaitTime() + "m wait");
    }

}
