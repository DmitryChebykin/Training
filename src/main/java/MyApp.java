class MyApp {
    public void start() {
        ConsoleDialog consoleDialog = new ConsoleDialog();
        consoleDialog.showMenu();
        consoleDialog.acceptCommandStringByUser();
        CommandStringHandler commandString = new CommandStringHandler();
        commandString.handleUserCommand(consoleDialog.commandStringByUser);
    }

}
