package com.reactcommunity.rndatetimepicker;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o extends com.facebook.react.a {
    public static /* synthetic */ Map c() {
        HashMap map = new HashMap();
        map.put(DatePickerModule.NAME, new ReactModuleInfo(DatePickerModule.NAME, DatePickerModule.NAME, false, false, false, false));
        map.put(TimePickerModule.NAME, new ReactModuleInfo(TimePickerModule.NAME, TimePickerModule.NAME, false, false, false, false));
        map.put(MaterialDatePickerModule.NAME, new ReactModuleInfo(MaterialDatePickerModule.NAME, MaterialDatePickerModule.NAME, false, false, false, false, false));
        map.put(MaterialTimePickerModule.NAME, new ReactModuleInfo(MaterialTimePickerModule.NAME, MaterialTimePickerModule.NAME, false, false, false, false, false));
        return map;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(DatePickerModule.NAME)) {
            return new DatePickerModule(reactApplicationContext);
        }
        if (str.equals(TimePickerModule.NAME)) {
            return new TimePickerModule(reactApplicationContext);
        }
        if (str.equals(MaterialDatePickerModule.NAME)) {
            return new MaterialDatePickerModule(reactApplicationContext);
        }
        if (str.equals(MaterialTimePickerModule.NAME)) {
            return new MaterialTimePickerModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new yn.a() { // from class: com.reactcommunity.rndatetimepicker.n
            @Override // yn.a
            public final Map getReactModuleInfos() {
                return o.c();
            }
        };
    }
}
