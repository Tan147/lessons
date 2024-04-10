package com.tatiana.project.lesson23;

public class WriteCommand extends Command{
    public WriteCommand(String code){
        super(code);
    }
    @Override
    public void execute(Storage storage) {
        storage.open();
        storage.write();
    }
}
