for (Files newFile : newFiles) {
	for (Files oldFile : oldFiles) {
		if (newFile.getPath().equals(oldFile.getPath())) {			
			modified = new Files(newFile.getPath());
			indexOfNew = new DeleteIndex();
			indexOfOld = new DeleteIndex();
			indexOfNew.setFilesIndex(newFiles.indexOf(newFile));
			indexOfOld.setFilesIndex(oldFiles.indexOf(oldFile));

			newFile.compare(oldFile.getFileInfos(),
					indexOfNew.getFileInfoIndex(),
					indexOfOld.getFileInfoIndex(),
					modified.getFileInfos());

			modifiedFiles.add(modified);
			deleteInNew.add(indexOfNew);
			deleteInOld.add(indexOfOld);

			break;
		}
	}
}
