package com.hl.diary.service.impl;

import com.hl.diary.mapper.ReleaseMapper;
import com.hl.diary.pojo.Release;
import com.hl.diary.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    ReleaseMapper releaseMapper;

    @Override
    public int insertSelective(Release release) {
        return releaseMapper.insert(release);
    }
}
