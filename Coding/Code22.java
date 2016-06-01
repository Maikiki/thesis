<select id="selectUsers" parameterType="int" resultType="User">
  select id, username, password
  from users
  where id = #{id}
</select>
