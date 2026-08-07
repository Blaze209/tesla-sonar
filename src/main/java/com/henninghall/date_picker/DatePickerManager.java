package com.henninghall.date_picker;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DatePickerManager extends SimpleViewManager<i> {
    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return a.b();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return jn.c.a().b("dateChange", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onChange"))).b("spinnerStateChange", jn.c.d("phasedRegistrationNames", jn.c.d("bubbled", "onStateChange"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDatePicker";
    }

    @no.b(names = {InquiryField.DateField.TYPE, "mode", "locale", "maximumDate", "minimumDate", "fadeToColor", "textColor", "timezoneOffsetInMinutes", "minuteInterval", "androidVariant", "dividerHeight", "is24hourSource"})
    public void setProps(i iVar, int i11, Dynamic dynamic) {
        a.f(iVar, i11, dynamic, getClass());
    }

    @no.b(customType = "Style", names = {Snapshot.HEIGHT})
    public void setStyle(i iVar, int i11, Dynamic dynamic) {
        a.g(iVar, i11, dynamic, getClass());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createViewInstance(v0 v0Var) {
        return a.a(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(i iVar) {
        super.onAfterUpdateTransaction(iVar);
        a.d(iVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(i iVar, int i11, ReadableArray readableArray) {
        a.e(iVar, i11, readableArray);
    }
}
