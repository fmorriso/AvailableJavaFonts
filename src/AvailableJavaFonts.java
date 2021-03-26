/**
 * Display all available Fonts on the device this code is running on
 */
public class AvailableJavaFonts
{

    public static void main(String[] args)
    {
        for (String ffn : java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames())
        {
            System.out.println(ffn);
        }
    }
}
