package org.greenscape.weblet.journal.model;

import org.greenscape.persistence.PersistedModel;

public interface JournalFolderModel extends PersistedModel {
	String MODEL_NAME = "JournalFolder";
	String PARENT_FOLDER_ID = "parentFolderId";
	String NAME = "name";
	String DESCRIPTION = "description";
	String STATUS = "status";
	String STATUS_DATE = "statusDate";
	String APPROVED = "approved";
	String DENIED = "denied";
	String DRAFT = "draft";
	String EXPIRED = "expired";
	String INACTIVE = "inactive";
	String INCOMPLETE = "incomplete";
	String IN_TRASH = "in_trash";
	String PENDING = "pending";
	String SCHEDULED = "scheduled";
	String CONTAINER_MODEL_ID = "containerModelId";
	String CONTAINER_MODEL_NAME = "containerModelName";
	String PARENT_CONTAINER_MODEL_ID = "parentContainerModelId";
}
