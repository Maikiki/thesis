<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" 
"http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="ftpSearcher.mybatis.mapper.FeedbackMapper">

	<insert id="insertFeedback" parameterType="ftpSearcher.model.Feedback">
		INSERT INTO feedback
		(username, comment,commentdate) VALUES
		(#{username},#{comment},#{commentdate})
	</insert>
	<delete id="deleteByID" parameterType="int">
		delete from feedback where id = #{id}
	</delete>
</mapper>
