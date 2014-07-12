package org.greenscape.weblet.journal.model;

import org.greenscape.persistence.PersistedModel;

public interface JournalStructureModel extends PersistedModel {
	String MODEL_NAME = "JournalStructure";
	String PARENT_STRUCTURE_ID = "parentStructureId";
	String NAME = "name";
	String DESCRIPTION = "description";
	String XSD = "xsd";

}
