package class_room;

public class ClassRoom {
    private Pupil pupil1;
    private Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;
    MissingPupil missingPupil = new MissingPupil();

    public ClassRoom() {
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = missingPupil;
        this.pupil4 = missingPupil;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = missingPupil;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public void showInfo () {
        System.out.println("Academic success");
        pupil1.study();
        pupil2.study();
        pupil3.study();
        pupil4.study();
        System.out.println("Reading");
        pupil1.read();
        pupil2.read();
        pupil3.read();
        pupil4.read();
        System.out.println("Writing");
        pupil1.write();
        pupil2.write();
        pupil3.write();
        pupil4.write();
        System.out.println("Relax");
        pupil1.relax();
        pupil2.relax();
        pupil3.relax();
        pupil4.relax();

    }
}
