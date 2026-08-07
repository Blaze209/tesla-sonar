package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = TimePickerModule.NAME)
public class TimePickerModule extends NativeModuleTimePickerSpec {
    public static final String NAME = "RNCTimePicker";

    private class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Promise f48295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f48296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48297c = false;

        public a(Promise promise, Bundle bundle) {
            this.f48295a = promise;
            this.f48296b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            if (this.f48297c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f48295a.resolve(writableNativeMap);
            this.f48297c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f48297c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f48295a.resolve(writableNativeMap);
            this.f48297c = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public void onTimeSet(TimePicker timePicker, int i11, int i12) {
            if (this.f48297c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            j jVar = new j(this.f48296b);
            Calendar calendar = Calendar.getInstance(d.m(this.f48296b));
            calendar.set(jVar.f(), jVar.d(), jVar.a(), i11, i12, 0);
            calendar.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "timeSetAction");
            writableNativeMap.putDouble("timestamp", calendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000) / 60);
            this.f48295a.resolve(writableNativeMap);
            this.f48297c = true;
        }
    }

    public TimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(FragmentManager fragmentManager, ReadableMap readableMap, Promise promise) {
        x xVar = (x) fragmentManager.o0(NAME);
        Bundle bundleG = d.g(readableMap);
        if (xVar != null) {
            xVar.g(bundleG);
            return;
        }
        x xVar2 = new x();
        xVar2.setArguments(bundleG);
        a aVar = new a(promise, bundleG);
        xVar2.d(aVar);
        xVar2.f(aVar);
        xVar2.e(aVar);
        xVar2.show(fragmentManager, NAME);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        d.h((androidx.fragment.app.u) getCurrentActivity(), NAME, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        androidx.fragment.app.u uVar = (androidx.fragment.app.u) getCurrentActivity();
        if (uVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            final FragmentManager supportFragmentManager = uVar.getSupportFragmentManager();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactcommunity.rndatetimepicker.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48303a.lambda$open$0(supportFragmentManager, readableMap, promise);
                }
            });
        }
    }
}
