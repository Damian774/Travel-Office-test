public class Main {

    public static void main(String[] args) {

        MainHandler mainHandler = new MainHandler();
        do {
            mainHandler.startLogin();
        }while(!mainHandler.getShouldExitProgram());


    }
}
