package com.henninghall.date_picker;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    private static DeviceEventManagerModule.RCTDeviceEventEmitter a() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) c.f45183a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    private static RCTEventEmitter b() {
        return (RCTEventEmitter) c.f45183a.getJSModule(RCTEventEmitter.class);
    }

    public static void c(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", str);
        a().emit("onCancel", writableMapCreateMap);
    }

    public static void d(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(InquiryField.DateField.TYPE, str);
        writableMapCreateMap.putString("id", str2);
        a().emit("onConfirm", writableMapCreateMap);
    }

    public static void e(Calendar calendar, String str, String str2, View view) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(InquiryField.DateField.TYPE, m.b(calendar));
        writableMapCreateMap.putString("dateString", str);
        writableMapCreateMap.putString("id", str2);
        b().receiveEvent(view.getId(), "dateChange", writableMapCreateMap);
    }

    public static void f(py.d dVar, String str, View view) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("spinnerState", dVar.toString());
        writableMapCreateMap.putString("id", str);
        b().receiveEvent(view.getId(), "spinnerStateChange", writableMapCreateMap);
    }
}
