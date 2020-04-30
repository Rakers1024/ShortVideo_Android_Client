package com.wanyi.uiframe.persistence;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.wanyi.uiframe.persistence.entity.HistoryMovieDataDo;
import com.wanyi.uiframe.persistence.entity.LocalMovieDataDo;
import com.wanyi.uiframe.persistence.entity.NoticeDo;
import com.wanyi.uiframe.persistence.entity.SearchHistoryDo;

import com.wanyi.uiframe.persistence.HistoryMovieDataDoDao;
import com.wanyi.uiframe.persistence.LocalMovieDataDoDao;
import com.wanyi.uiframe.persistence.NoticeDoDao;
import com.wanyi.uiframe.persistence.SearchHistoryDoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig historyMovieDataDoDaoConfig;
    private final DaoConfig localMovieDataDoDaoConfig;
    private final DaoConfig noticeDoDaoConfig;
    private final DaoConfig searchHistoryDoDaoConfig;

    private final HistoryMovieDataDoDao historyMovieDataDoDao;
    private final LocalMovieDataDoDao localMovieDataDoDao;
    private final NoticeDoDao noticeDoDao;
    private final SearchHistoryDoDao searchHistoryDoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        historyMovieDataDoDaoConfig = daoConfigMap.get(HistoryMovieDataDoDao.class).clone();
        historyMovieDataDoDaoConfig.initIdentityScope(type);

        localMovieDataDoDaoConfig = daoConfigMap.get(LocalMovieDataDoDao.class).clone();
        localMovieDataDoDaoConfig.initIdentityScope(type);

        noticeDoDaoConfig = daoConfigMap.get(NoticeDoDao.class).clone();
        noticeDoDaoConfig.initIdentityScope(type);

        searchHistoryDoDaoConfig = daoConfigMap.get(SearchHistoryDoDao.class).clone();
        searchHistoryDoDaoConfig.initIdentityScope(type);

        historyMovieDataDoDao = new HistoryMovieDataDoDao(historyMovieDataDoDaoConfig, this);
        localMovieDataDoDao = new LocalMovieDataDoDao(localMovieDataDoDaoConfig, this);
        noticeDoDao = new NoticeDoDao(noticeDoDaoConfig, this);
        searchHistoryDoDao = new SearchHistoryDoDao(searchHistoryDoDaoConfig, this);

        registerDao(HistoryMovieDataDo.class, historyMovieDataDoDao);
        registerDao(LocalMovieDataDo.class, localMovieDataDoDao);
        registerDao(NoticeDo.class, noticeDoDao);
        registerDao(SearchHistoryDo.class, searchHistoryDoDao);
    }
    
    public void clear() {
        historyMovieDataDoDaoConfig.clearIdentityScope();
        localMovieDataDoDaoConfig.clearIdentityScope();
        noticeDoDaoConfig.clearIdentityScope();
        searchHistoryDoDaoConfig.clearIdentityScope();
    }

    public HistoryMovieDataDoDao getHistoryMovieDataDoDao() {
        return historyMovieDataDoDao;
    }

    public LocalMovieDataDoDao getLocalMovieDataDoDao() {
        return localMovieDataDoDao;
    }

    public NoticeDoDao getNoticeDoDao() {
        return noticeDoDao;
    }

    public SearchHistoryDoDao getSearchHistoryDoDao() {
        return searchHistoryDoDao;
    }

}