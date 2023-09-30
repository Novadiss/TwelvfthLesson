import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();

    String film1 = new String("Zxcvb nmhjh 12");
    String film2 = new String("Asdf ghjk 34");
    String film3 = new String("Qwert yuio 67");
    String film4 = new String("Nm,. 89 !!");
    String film5 = new String("HJKL ;' 0_");
    String film6 = new String("Ячсми тьбю +=");
    String film7 = new String("Фывап ролд ;%:");
    String film8 = new String("НГШЩЗХ ОЛДЖЭ )(*?");


    @Test
    public void showNoFilms() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void showTreeFilmsWithoutLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Zxcvb nmhjh 12", "Asdf ghjk 34", "Qwert yuio 67"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showFiveFilmsWithoutLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {"Zxcvb nmhjh 12", "Asdf ghjk 34", "Qwert yuio 67", "Nm,. 89 !!", "HJKL ;' 0_"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showMoreThenFiveFilmsWithoutLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);

        String[] expected = {"Zxcvb nmhjh 12", "Asdf ghjk 34", "Qwert yuio 67", "Nm,. 89 !!", "HJKL ;' 0_", "Ячсми тьбю +=", "Фывап ролд ;%:", "НГШЩЗХ ОЛДЖЭ )(*?"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastTreeFilmsWithoutLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Qwert yuio 67", "Asdf ghjk 34", "Zxcvb nmhjh 12"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsWithDefaultLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {"HJKL ;' 0_", "Nm,. 89 !!", "Qwert yuio 67", "Asdf ghjk 34", "Zxcvb nmhjh 12"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsWhenMoreThenDefaultLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {"Ячсми тьбю +=", "HJKL ;' 0_", "Nm,. 89 !!", "Qwert yuio 67", "Asdf ghjk 34"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsWithLimitTree() {
        PosterManager manager = new PosterManager(3);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {"Ячсми тьбю +=", "HJKL ;' 0_", "Nm,. 89 !!"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsWithLimitFive() {
        PosterManager manager = new PosterManager(5);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {"Ячсми тьбю +=", "HJKL ;' 0_", "Nm,. 89 !!", "Qwert yuio 67", "Asdf ghjk 34"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsWithLimitSix() {
        PosterManager manager = new PosterManager(6);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {"Ячсми тьбю +=", "HJKL ;' 0_", "Nm,. 89 !!", "Qwert yuio 67", "Asdf ghjk 34", "Zxcvb nmhjh 12"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsWithLimitEightAndFilmsAddFive() {
        PosterManager manager = new PosterManager(8);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {"Ячсми тьбю +=", "HJKL ;' 0_", "Nm,. 89 !!", "Qwert yuio 67", "Asdf ghjk 34", "Zxcvb nmhjh 12"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

