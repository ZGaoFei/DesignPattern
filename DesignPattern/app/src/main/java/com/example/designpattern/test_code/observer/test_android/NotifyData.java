package com.example.designpattern.test_code.observer.test_android;

import java.util.ArrayList;
import java.util.List;

public class NotifyData {
    private static NotifyData notifyData = new NotifyData();

    private List<BaseActivity> list = new ArrayList<>();
    private int type;

    private NotifyData() {

    }

    public static NotifyData getInstance() {
        return notifyData;
    }

    public void setType(int type) {
        this.type = type;
        notifyType();
    }

    public int getType() {
        return type;
    }

    public void attach(BaseActivity activity) {
        list.add(activity);
    }

    public void detach(BaseActivity activity) {
        if (list.contains(activity)) {
            list.remove(activity);
        }
    }

    public void notifyType() {
        for (BaseActivity activity : list) {
            if (activity != null && !activity.isFinishing()) {
                activity.update();
            }
        }
    }
}
