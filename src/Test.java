class Test 
{ 
    int a; 
    int b; 
      
    // Parameterized constructor 
    Test(int a, int b) 
    { 
        //this.a = a; 
        a = 108; 
        this.b = b; 
    } 
  
    void display() 
    { 
        //Displaying value of variables a and b 
        System.out.println("a = " + a + "  b = " + b); 
        System.out.println("Swamynathan again..."); 
    } 
  
    public static void main(String[] args) 
    { 
        Test object = new Test(111110, 9990); 
        object.display(); 
    } 
}
