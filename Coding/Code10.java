SqlSession session = sqlSessionFactory.openSession();
try {
  // do work
} finally {
  session.close();
}
