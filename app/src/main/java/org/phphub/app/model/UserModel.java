package org.phphub.app.model;

import android.content.Context;

import org.phphub.app.api.UserApi;
import org.phphub.app.api.entity.UserEntity;
import org.phphub.app.common.base.BaseModel;

import rx.Observable;

public class UserModel extends BaseModel<UserApi> {
    public UserModel(Context context) {
        super(context, UserApi.class);
    }

    public Observable<UserEntity.AUser> getMyselfInfo() {
        return getService().getMyselfInfo();
    }

    public Observable<UserEntity.AUser> getUserInfo(int userId) {
        return getService().getUserInfo(userId);
    }
}
