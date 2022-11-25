package class_room;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Pupil studies bad");
    }

    @Override
    public void read() {
        System.out.println("Pupil reads bad");
    }

    @Override
    public void write() {
        System.out.println("Pupil writes bad");
    }

    @Override
    public void relax() {
        System.out.println("Pupil relaxes excellent");
    }
}
