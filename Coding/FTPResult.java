public class FTPResults {
	private String name,type,size,date,path,url;
……
省略了部分getter和setter
……
	//将Byte转换到其他单位
public void setSize(String size) { 
		long numofsize = Long.valueOf(size);
		int level = 0;
		while (numofsize > 1023) {
			numofsize = numofsize / 1024;
			level++;
		}
		if (level == 0) {
			this.size = "大小：" + numofsize + "B";
		}
		if (level == 1) {
			this.size = "大小：" + numofsize + "KB";
		}
		if (level == 2) {
			this.size = "大小：" + numofsize + "MB";
		}
		if (level == 3) {
			this.size = "大小：" + numofsize + "GB";
		}
	}
//构造文件URL地址
	public void setUrl(String path, String name, String type) { 
		if(type.equals("folder")){
			this.url = path+name+"/";
		}else{
			this.url = path+name+"."+type;
		}
	}
}
