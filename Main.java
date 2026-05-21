class Main 
{
  public static void main(String[] args) 
  {
    // Test default constructor
    DACArecipient p1 = new DACArecipient();
    System.out.println(p1);

    // Test full constructor
    DACArecipient p2 = new DACArecipient(
      "Mendez",
      "Javier",
      "56-3-445",
      "El Salvador",
      2451564,
      3956753,
      3956840,
      'M'
    );

    System.out.println(p2);
  }
}