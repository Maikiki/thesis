TopDocs hits = searcher.search(query,1);
if (hits.totalHits > 0)
	hits = searcher.search(query,hits.totalHits);
else
	hits = searcher.search(query,1);
