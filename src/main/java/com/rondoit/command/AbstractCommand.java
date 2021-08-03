package com.rondoit.command;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
public class AbstractCommand implements Command {

    private final String id;

    public AbstractCommand(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getSimpleName() {
        return getClass().getSimpleName();
    }
}
