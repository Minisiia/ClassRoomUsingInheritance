package class_room;

public class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Pupil studies good");
    }

    @Override
    public void read() {
        System.out.println("Pupil reads good");
    }

    @Override
    public void write() {
        System.out.println("Pupil writes good");
    }

    @Override
    public void relax() {
        System.out.println("Pupil relaxes good");
    }
}
