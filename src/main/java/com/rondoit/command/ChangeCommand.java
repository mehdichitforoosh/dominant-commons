package com.rondoit.command;

import org.joda.time.DateTime;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
public interface ChangeCommand {

    String getModifierId();

    DateTime getModificationDate();

    Long getVersion();

}
