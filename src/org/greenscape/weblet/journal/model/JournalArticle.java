package org.greenscape.weblet.journal.model;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

@Model(name = JournalArticleModel.MODEL_NAME)
public class JournalArticle extends PersistedModelBase implements JournalArticleModel {
	private static final long serialVersionUID = 2909978029577850549L;

	@Override
	public String getTitle() {
		return (String) getProperty(TITLE);
	}

	@Override
	public JournalArticleModel setTitle(String title) {
		setProperty(TITLE, title);
		return this;
	}

	@Override
	public String getContent() {
		return (String) getProperty(CONTENT);
	}

	@Override
	public JournalArticleModel setContent(String content) {
		setProperty(CONTENT, content);
		return this;
	}

	@Override
	public String getSiteId() {
		return (String) getProperty(SITE_ID);
	}

	@Override
	public JournalArticleModel setSiteId(String siteId) {
		setProperty(SITE_ID, siteId);
		return this;
	}
}
