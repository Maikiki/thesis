public String intercept(ActionInvocation actionInvocation) throws Exception {
		UserQueryLog userQueryLog = new UserQueryLog();
		int page = 1;
		if (ServletActionContext.getRequest().getParameter("page") != null) {
			page = Integer.valueOf(ServletActionContext.getRequest()
					.getParameter("page"));
		}
		userQueryLog.setQuerypage(page);
		userQueryLog.setQuerytime(new Date(System.currentTimeMillis()));
		userQueryLog.setQueryword(ServletActionContext.getRequest()
				.getParameter("keywords"));

		try {
			String resource = "/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();

			UserQueryLogMapper userQueryLogMapper = session
					.getMapper(UserQueryLogMapper.class);
			userQueryLogMapper.inserUserQueryLog(userQueryLog);

			session.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actionInvocation.invoke();
	}
}
