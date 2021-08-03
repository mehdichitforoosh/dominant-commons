package com.rondoit.command;

import org.joda.time.DateTime;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
public class AbstractCreateCommand extends AbstractCommand  implements CreateCommand{

    private final String creatorId;
    private final DateTime creationDate;

    public AbstractCreateCommand(String id, String creatorId, DateTime creationDate) {
        super(id);
        this.creatorId = creatorId;
        this.creationDate = creationDate;
    }

    public String getCreatorId() {
        return null;
    }

    public DateTime getCreationDate() {
        return null;
    }
}
