package concerttours.service.impl;
import java.util.Date;
import java.util.List;

import concerttours.daos.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import concerttours.model.NewsModel;
import concerttours.service.NewsService;

public class DefaultNewsService implements NewsService
{
    @Autowired
    private NewsDao newsDao;


    public void setNewsDao(final NewsDao newsDao)
    {
        this.newsDao = newsDao;
    }

    @Override
    public List<NewsModel> getNewsOfTheDay(final Date date)
    {
        return newsDao.getNewsOfTheDay(date);
    }
}

