<select id="selectUsers" parameterType="int" resultType="hashmap">
  select <include refid="userColumns"/>
  from some_table
  where id = #{id}
</select>
