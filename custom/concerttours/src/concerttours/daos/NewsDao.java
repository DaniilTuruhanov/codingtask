package concerttours.daos;
import java.util.Date;
import java.util.List;
import concerttours.model.NewsModel;

public interface NewsDao
{
    List<NewsModel> getNewsOfTheDay(Date date);
}