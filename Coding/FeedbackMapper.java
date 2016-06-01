package ftpSearcher.mybatis.mapper;
import java.util.List;
import ftpSearcher.model.Feedback;

public interface FeedbackMapper {	
	public void insertFeedback(Feedback feedback);
	public List<Feedback> getAllFeedback();	
	public void deleteByID(int id);
}
