package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
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
@xn.a(name = DatePickerModule.NAME)
public class DatePickerModule extends NativeModuleDatePickerSpec {
    public static final String NAME = "RNCDatePicker";

    private class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Promise f48291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f48292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48293c = false;

        public a(Promise promise, Bundle bundle) {
            this.f48291a = promise;
            this.f48292b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            if (this.f48293c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "neutralButtonAction");
            this.f48291a.resolve(writableNativeMap);
            this.f48293c = true;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i11, int i12, int i13) {
            if (this.f48293c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            j jVar = new j(this.f48292b);
            Calendar calendar = Calendar.getInstance(d.m(this.f48292b));
            calendar.set(i11, i12, i13, jVar.b(), jVar.c(), 0);
            calendar.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dateSetAction");
            writableNativeMap.putDouble("timestamp", calendar.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / 1000) / 60);
            this.f48291a.resolve(writableNativeMap);
            this.f48293c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f48293c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", "dismissedAction");
            this.f48291a.resolve(writableNativeMap);
            this.f48293c = true;
        }
    }

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0(FragmentManager fragmentManager, ReadableMap readableMap, Promise promise) {
        l lVar = (l) fragmentManager.o0(NAME);
        Bundle bundleE = d.e(readableMap);
        if (lVar != null) {
            lVar.i(bundleE);
            return;
        }
        l lVar2 = new l();
        lVar2.setArguments(bundleE);
        a aVar = new a(promise, bundleE);
        lVar2.f(aVar);
        lVar2.e(aVar);
        lVar2.g(aVar);
        lVar2.show(fragmentManager, NAME);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        d.h((androidx.fragment.app.u) getCurrentActivity(), NAME, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        androidx.fragment.app.u uVar = (androidx.fragment.app.u) getCurrentActivity();
        if (uVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            final FragmentManager supportFragmentManager = uVar.getSupportFragmentManager();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactcommunity.rndatetimepicker.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48310a.lambda$open$0(supportFragmentManager, readableMap, promise);
                }
            });
        }
    }
}
