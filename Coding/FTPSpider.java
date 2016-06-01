public class FTPSpider {
    private FTPClient     ftp;            // FTP客户端类
    private String        server;         // 连接的FTP服务器
    private int           port;           // FTP服务器开放的端口
    private String        controlEncoding; // 控制编码
    private String        charEncoding;   // 字符集编码

    private String        outputFile;     // 输出文件的位置
    private Queue<String> pathQueue;      // 路径队列，遍历FTP服务器时使用
    private int           count = 0;      // 记录遍历的文件数量

    public int getCount()  //遍历文件数量
    public FTPSpider(String server, int port, String charEncoding,String outputFile)  //构造方法
    public FTPSpider(String server, String outputFile)  //构造方法
    public void connectFTP()  //连接FTP服务器
    public void getFTPInfo(String remotePath)  //扫描指定目录
    private void closeTheConnect()  //退出FTP服务器
}
