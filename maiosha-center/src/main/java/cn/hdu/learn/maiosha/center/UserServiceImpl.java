package cn.hdu.learn.maiosha.center;

import cn.hdu.learn.miaosha.dal.dao.MiaoshaUserMapper;
import cn.hdu.learn.miaosha.dal.model.MiaoshaUser;
import cn.hdu.learn.miaosha.internal.api.ro.MiaoshaUserRO;
import cn.hdu.learn.miaosha.internal.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @author guaner
 * @date 2019/4/7
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private MiaoshaUserMapper miaoshaUserMapper;


    @Override
    public MiaoshaUserRO getUser(Long id) {
        MiaoshaUser user = miaoshaUserMapper.getById(id);
        MiaoshaUserRO  miaoshaUserRO = new MiaoshaUserRO();
        miaoshaUserRO.setId(user.getId());
        miaoshaUserRO.setAge(user.getAge());
        miaoshaUserRO.setName(user.getName());
        return miaoshaUserRO;
    }
}
