import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File input = new File("caminho/para/sua/imagem.jpg");
            BufferedImage image = ImageIO.read(input);

            int width = image.getWidth();
            int height = image.getHeight();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int pixel = image.getRGB(j, i);

                    int alpha = (pixel >> 24) & 0xff;
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;
                    
                    red *= ((double) j / width);
                    green *= ((double) i / height);
                    blue *= ((double) j / width) * ((double) i / height);

                    pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
                    image.setRGB(j, i, pixel);
                }
            }

            File output = new File("caminho/para/sua/nova/imagem.jpg");
            ImageIO.write(image, "jpg", output);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}