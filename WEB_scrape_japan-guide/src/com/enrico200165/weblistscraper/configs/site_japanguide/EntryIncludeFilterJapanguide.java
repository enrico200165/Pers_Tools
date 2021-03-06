package com.enrico200165.weblistscraper.configs.site_japanguide;

import com.enrico200165.weblistscraper.marketingDB.ProspectCoreData;
import com.enrico200165.weblistscraper.tools.EntryIncludeFilter;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Element;

public class EntryIncludeFilterJapanguide extends EntryIncludeFilter {

	EntryIncludeFilterJapanguide() {
	}

	@Override
	public boolean includeEntrySpecific(Element entry) {
		// normally it should be TD but Japan guide uses a table peer user
		return false;
	}

	@Override
	public boolean includeProspectSpecific(ProspectCoreData prospectCastIt) {
		return true;
		// return justToTest(prospect);
	}

	// ########## (INTERNAL) LIBRARY FUNCTIONS #########
	public boolean justToTest(ProspectJapanguide prospect) {
		return (prospect.it().getUserID().length() > 7);
	}

	private static org.apache.log4j.Logger log = Logger.getLogger(EntryIncludeFilterJapanguide.class);

}