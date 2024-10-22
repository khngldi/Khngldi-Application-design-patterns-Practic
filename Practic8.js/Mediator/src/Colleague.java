public abstract class Colleague {
    protected IMediator mediator;
    protected String name;

    public Colleague(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receiveMessage(String message);

    public String getName() {
        return name;
    }
}
