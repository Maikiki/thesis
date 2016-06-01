public void compare(ArrayList<FileInfo> oldFileInfos,
		ArrayList<FileInfo> indexOfNew, ArrayList<FileInfo> indexOfOld,
		ArrayList<FileInfo> modified) {
	for (FileInfo newOne : this.fileInfos) {
		for (FileInfo oldOne : oldFileInfos) {
			if (newOne.getName().equals(oldOne.getName())
					&& newOne.getType().equals(oldOne.getType())) {
				if (newOne.getSize() == oldOne.getSize()
						&& newOne.getDate() == oldOne.getDate()) {
					indexOfNew.add(newOne);
					indexOfOld.add(oldOne);
					break;
				} else {
					modified.add(newOne);
					break;
				}
			}
		}
	}
}
