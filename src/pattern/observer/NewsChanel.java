package pattern.observer;

class NewsChanel implements Channel{
    private final String name;

    public NewsChanel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s, получена новость: %s\n", name, message);
    }
}
