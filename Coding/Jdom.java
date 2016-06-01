SAXBuilder buider = new SAXBuilder();
//获得ftpSearcher-config.xml的位置
URL path = this.getClass().getClassLoader()
				.getResource("ftpSearcher-config.xml");
File file = new File(path.getPath())
Document doc = buider.build(file);
