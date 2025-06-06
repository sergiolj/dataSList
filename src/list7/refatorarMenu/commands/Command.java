package list7.refatorarMenu.commands;

public interface Command {
    boolean execute();
    String getDescription();
    void errorMsg();
}
