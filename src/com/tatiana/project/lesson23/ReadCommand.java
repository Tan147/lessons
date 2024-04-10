package com.tatiana.project.lesson23;

public class ReadCommand extends Command{
    public ReadCommand(String code) {
        super(code);
    }

    @Override
    public void execute(Storage storage) {
        storage.open();
        storage.read();
    }
}