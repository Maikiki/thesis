//假定session对象实例已被构建
FeedbackMapper feedbackMapper = session.getMapper(FeedbackMapper.class);
feedbackMapper.deleteByID(feedbackID);
session.commit();
session.close();
