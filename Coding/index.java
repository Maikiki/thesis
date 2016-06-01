protected void addIntoIndex(String name, String type, long size, int date,
		String path) throws Exception {
	Document doc = new Document();
	//初始化Lucene文档
	doc.add(new Field("name", name, Field.Store.YES, Field.Index.ANALYZED));
	doc.add(new Field("type", type, Field.Store.YES, Field.Index.NOT_ANALYZED));
	doc.add(new NumericField("size", Field.Store.YES, true).setLongValue(size));
	doc.add(new NumericField("date", Field.Store.YES, true).setIntValue(date));
	doc.add(new Field("path", path, Field.Store.YES, Field.Index.NOT_ANALYZED));
	//将文档添加到Lucene索引
	indexWriter.addDocument(doc);
}
