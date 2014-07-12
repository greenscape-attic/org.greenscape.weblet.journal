package org.greenscape.weblet.journal.model;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

@Model(name = JournalFolderModel.MODEL_NAME)
public class JournalFolder extends PersistedModelBase implements JournalFolderModel {
	private static final long serialVersionUID = 295956525536250325L;

}
