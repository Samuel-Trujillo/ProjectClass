public class ProjectTest{
    public static void main(String[] args) {
        Project project1 = new Project("world ender");
        Project project2 = new Project("spacex", "to space!!");
        Project project3 = new Project();
        System.out.println(project2.elevatorPitch());
        System.out.println(project1.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}

