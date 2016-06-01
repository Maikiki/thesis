Element eIndexDir = root.getChild("indexDir");
eIndexDir.setText(indexDir);

Element eFileInfoDir = root.getChild("fileInfoDir");
eFileInfoDir.setText(fileInfoDir);
		
Element eLogDir = root.getChild("logDir");
eLogDir.setText(logDir);
		
if(password.length() != 0){
	Element ePassword = root.getChild("password");
	ePassword.setText(getMD5(password));
}

String des = new XMLOutputter().outputString(doc);
FileWriter fileWriter = new FileWriter(file);
fileWriter.write(des);
fileWriter.close();
