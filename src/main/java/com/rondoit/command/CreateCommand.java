package com.rondoit.command;

import org.joda.time.DateTime;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
public interface CreateCommand extends Command {

    String getCreatorId();

    DateTime getCreationDate();

}
