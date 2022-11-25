package class_room;

public class MissingPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Pupil is missing");
    }

    @Override
    public void read() {
        System.out.println("Pupil is missing");
    }

    @Override
    public void write() {
        System.out.println("Pupil is missing");
    }

    @Override
    public void relax() {
        System.out.println("Pupil is missing");
    }
}
