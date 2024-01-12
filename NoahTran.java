
/**
 * A BoopleSnoot is Mr. Jaffe's animal
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class NoahTran extends Animal
{
  public NoahTran() {
    super("Noah Tran", "White & Grey", 2);
  }
  
  public String getType() {
    return "White Tiger";
  }
  /**
   * What does the animal say?  Descendant classes should override this
   * method or default speak will generate "Yaba-daba-doo"
   */
  public String speak() {
    return "Who denied me my destiny?";
  }
  /**
   * This will return a String that describes the animal's general disposition.
   * Sample dispositions could be "mean" or "friendly".  Use different adjectives
   * in your method. The default disposition is "meh"
   * 
   * @return Disposition
   */
  public String getDisposition() {
    return "hostile";
  }
  /**
   * This will return the animal's name. What's the default name?
   * 
   * @return The name of the animal (i.e. "Fido", "Rover")
   */
  public String getName() {
    return "Tai Lung";
  }
}
