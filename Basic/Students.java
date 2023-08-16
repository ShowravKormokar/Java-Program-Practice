
// public class Students{

//     // Data Member
//     private int id;
//     private String name;

//     // Function
//     static void setId(int id){
//         this.id = id;
//     }

//     static void setName(String name){
//         this.name = name;
//     }

//     static void getId(){
//         System.out.println("Student ID: " + id);
//     }

//     static void getName(){
//         System.out.println("Student Name: " + name);
//     }

//     public static void main(String[] agrs){
//         Students st = new Students();

//         // Call the function
//         st.setId(222311077);
//         st.setName("Showrav Kormokar");

//         st.getId();
//         st.getName();
//     }
// }

public class Students {

    // Data Members
    private int id;
    private String name;

    // Setters
    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    // Getters
    void getId() {
        System.out.println("Student ID: " + id);
    }

    void getName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Students st = new Students();

        // Call the setters
        st.setId(222311077);
        st.setName("Showrav Kormokar");

        // Call the getters
        st.getId();
        st.getName();
    }
}
