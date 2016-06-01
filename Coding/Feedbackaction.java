添加用户反馈：INSERT INTO feedback (username, comment,commentdate) VALUES (#{username},#{comment},#{commentdate})
读取所有用户反馈：SELECT * FROM feedback ORDER BY commentdate DESC
删除用户反馈：DELETE FROM feedback WHERE id = #{id}