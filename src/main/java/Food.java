    import java.util.Random;

    public class Food {

        private  int posX;
        private  int posY;

        public Food() {
            posX = generatePos(Graphics.WIDTH);
            posY = generatePos(Graphics.HEIGHT);
        }

        private int generatePos(int size) {
            Random random = new Random();
           return random.nextInt(size / Graphics.snake_SIZE) * Graphics.snake_SIZE;
           //this makes the food track sync with snake track

        }

        public int getPosX() {
            return posX;
        }

        public int getPosY() {
            return posY;
        }
    }

