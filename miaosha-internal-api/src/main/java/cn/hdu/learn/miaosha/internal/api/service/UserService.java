package cn.hdu.learn.miaosha.internal.api.service;

import cn.hdu.learn.miaosha.internal.api.ro.MiaoshaUserRO;

/**
 * 描述：
 *
 * @author guaner
 * @date 2019/4/7
 */
public interface UserService {

    MiaoshaUserRO getUser(Long id);

}
