package com.henninghall.date_picker;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class c extends y0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ReactApplicationContext f45183a;

    class a implements yn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f45184a = false;

        a() {
        }

        @Override // yn.a
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            HashMap map = new HashMap();
            map.put("RNDatePicker", new ReactModuleInfo("RNDatePicker", "RNDatePicker", false, false, true, false, false));
            return map;
        }
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DatePickerModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        f45183a = reactApplicationContext;
        return Arrays.asList(new DatePickerManager());
    }

    @Override // com.facebook.react.a, com.facebook.react.p0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (!str.equals("RNDatePicker")) {
            return null;
        }
        f45183a = reactApplicationContext;
        return new DatePickerModule(reactApplicationContext);
    }

    @Override // com.facebook.react.a
    public yn.a getReactModuleInfoProvider() {
        return new a();
    }
}
