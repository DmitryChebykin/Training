class MyApp {

    public void start() {
        ArrayListProcessor arrayListProcessor = new ArrayListProcessor();
        ConsoleDialog consoleDialog = new ConsoleDialog();
        CommandStringHandler commandString = new CommandStringHandler();
        rotateRuntime(consoleDialog, commandString, arrayListProcessor);
    }
    private void rotateInput (ConsoleDialog consoleDialog, CommandStringHandler commandString){

        do {
            consoleDialog.tryInput();
            String checkExit = commandString.checkExitCode(consoleDialog.commandStringByUser);
            if (checkExit.equals("0")) {
                System.exit(0);
            }
            commandString.checkRightCommand(consoleDialog.commandStringByUser);

        }
        while ( !commandString.rightCommand);

    }

    private void rotateInputForRightParams(ConsoleDialog consoleDialog, CommandStringHandler commandString) {
        do {
            rotateInput(consoleDialog, commandString);
            commandString.checkTaskNumberIfNeeded();
        }
        while ( !commandString.rightParamPlaced);{}
    }
    private void rotateRuntime (ConsoleDialog consoleDialog, CommandStringHandler commandString, ArrayListProcessor arrayListProcessor){

        do {commandString.reset();
            rotateInputForRightParams(consoleDialog, commandString);
            commandString.defineTaskContent();
            arrayListProcessor.setCommandsForTaskList(new String[]{commandString.commandTask, commandString.numberTask, commandString.contentTask});
            arrayListProcessor.runCommand();
        }
        while(true);
    }

}
