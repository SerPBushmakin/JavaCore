package pattern.observer;

public class Main {
    public static void main(String[] args) {
        NewsPortal portal = new NewsPortal();
        NewsChanel chanel1 = new NewsChanel("Первый канал");
        portal.add(chanel1);
        NewsChanel chanel2 = new NewsChanel("Второй канал");
        portal.add(chanel2);

        portal.setNews("Изучен паттерн Наблюдатель");
    }
}
