
public class Run_app {

	public static void main(String[] args)throws Exception {
		Runtime runtime=Runtime.getRuntime();
		//while(true){
			runtime.exec("notepad.exe");
			runtime.exec("mspaint.exe");
			runtime.exec("calc.exe");
		//}

	}

}
