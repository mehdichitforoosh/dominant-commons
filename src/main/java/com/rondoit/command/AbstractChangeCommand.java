package com.rondoit.command;

import org.joda.time.DateTime;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
public class AbstractChangeCommand extends AbstractCommand implements ChangeCommand {

    private final String modifierId;
    private final DateTime modificationDate;
    private final Long version;

    public AbstractChangeCommand(String id, String modifierId, DateTime modificationDate, Long version) {
        super(id);
        this.modifierId = modifierId;
        this.modificationDate = modificationDate;
        this.version = version;
    }

    public String getModifierId() {
        return this.modifierId;
    }

    public DateTime getModificationDate() {
        return this.modificationDate;
    }

    public Long getVersion() {
        return this.version;
    }
}
