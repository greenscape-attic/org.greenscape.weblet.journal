package org.greenscape.weblet.journal.model;

import org.greenscape.persistence.PersistedModel;

public interface JournalTemplateModel extends PersistedModel {
	String MODEL_NAME = "JournalTemplate";
	String STRUCTURE_ID = "structureId";
	String NAME = "name";
	String DESCRIPTION = "description";
	String XSL = "xsl";
	String LANG_TYPE = "langType";

}
