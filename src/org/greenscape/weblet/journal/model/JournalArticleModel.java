package org.greenscape.weblet.journal.model;

import org.greenscape.persistence.PersistedModel;

public interface JournalArticleModel extends PersistedModel {
	String MODEL_NAME = "JournalArticle";
	String TITLE = "title";
	String DESCRIPTION = "description";
	String CONTENT = "content";
	String TYPE = "type";
	String STRUCTURE_ID = "structureId";
	String TEMPLATE_ID = "templateId";
	String DISPLAY_DATE = "displayDate";
	String EXPIRATION_DATE = "expirationDate";
	String REVIEW_DATE = "reviewDate";
	String STATUS = "status";
	String APPROVED = "approved";
	String DENIED = "denied";
	String DRAFT = "draft";
	String EXPIRED = "expired";
	String INACTIVE = "inactive";
	String INCOMPLETE = "incomplete";
	String IN_TRASH = "in_trash";
	String PENDING = "pending";
	String SCHEDULED = "scheduled";
	String SITE_ID = "siteId";

	String getTitle();

	JournalArticleModel setTitle(String title);

	String getContent();

	JournalArticleModel setContent(String content);

	String getSiteId();

	JournalArticleModel setSiteId(String siteId);
}
