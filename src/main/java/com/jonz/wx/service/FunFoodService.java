package com.jonz.wx.service;
import com.jonz.wx.model.FunFood;
import com.jonz.wx.core.Service;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutTextMessage;


/**
 * Created by CodeGenerator on 2019/04/03.
 */
public interface FunFoodService extends Service<FunFood> {
    void opByFoodFuncInfo(WxMpXmlOutTextMessage textMessage);
}
