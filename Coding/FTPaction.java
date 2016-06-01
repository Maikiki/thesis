添加新的FTP服务器信息：INSERT INTO ftpserver (domain, ipv4, port, submittime, description) VALUES (#{domain},#{ipv4},#{port},#{submittime},#{description})
获取所有FTP服务器信息：SELECT * FROM ftpserver
获取指定FTP服务器信息：SELECT * FROM ftpserver WHERE id = #{id}
更改指定FTP服务器信息：UPDATE ftpserver SET domain = #{domain}, ipv4 = #{ipv4},port = #{port}, encoding = #{encoding}, verify= #{verify} WHERE id = #{id}
删除指定FTP服务器信息：DELETE FROM ftpserver WHERE id = #{serverID}
