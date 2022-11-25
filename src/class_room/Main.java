package class_room;

public class Main {
    public static void main(String[] args) {
        ExcellentPupil excellentPupil1 = new ExcellentPupil();
        ExcellentPupil excellentPupil2 = new ExcellentPupil();
        GoodPupil goodPupil1 = new GoodPupil();
        GoodPupil goodPupil2 = new GoodPupil();
        BadPupil badPupil1 = new BadPupil();
        BadPupil badPupil2 = new BadPupil();
        BadPupil badPupil3 = new BadPupil();
        ClassRoom classRoom1 = new ClassRoom(excellentPupil1,excellentPupil2,goodPupil1,goodPupil2);
        System.out.println("Class Room 1 (4 pupils: 2 excellent і 2 good pupils)");
        classRoom1.showInfo();
        System.out.println("-----------------------------------");
        ClassRoom classRoom2 = new ClassRoom(badPupil1,badPupil2,badPupil3);
        System.out.println("Class Room 2 (3 pupils: all bad pupils, other pupil is missing)");
        classRoom2.showInfo();
        System.out.println("-----------------------------------");
        ClassRoom classRoom3 = new ClassRoom(badPupil1,goodPupil2);
        System.out.println("Class Room 3 (2 pupils: 1 bad pupil, 1 good pupil, other pupils is missing)");
        classRoom3.showInfo();

    }
}
