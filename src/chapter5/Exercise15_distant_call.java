package chapter5;
/* Exercise 15: Create a class inside a package. Your class should contain a protected method. 
 * Outside of the package, try to call the protected method and explain the results. 
 * Now inherit from your class and call the protected method from inside a method of your derived class.
 */
public class Exercise15_distant_call {
	Exercise15_distant_call(){
		//chapter6.Exercise15.destroy();  //"The method destroy() from the type Exercise15 is not visible" message appears if reaching to a public class
	}
}
//Please refer to chapter 5 Exercise15