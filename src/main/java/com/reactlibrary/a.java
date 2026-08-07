package com.reactlibrary;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.u;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.action.VoucherAction;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.ui.core.AdyenComponentView;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;

/* JADX INFO: loaded from: classes6.dex */
public class a extends LinearLayout implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f48384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.fragment.app.u f48385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private of.e f48386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48387d;

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48389a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            f48389a = iArr;
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48389a[Lifecycle.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(v0 v0Var, androidx.fragment.app.u uVar) {
        super(v0Var);
        this.f48387d = false;
        this.f48384a = v0Var;
        this.f48385b = uVar;
        View.inflate(v0Var, n.f48410a, this);
        androidx.fragment.app.u uVar2 = this.f48385b;
        if (uVar2 != null) {
            uVar2.getLifecycle().a(this);
        }
    }

    private void b(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(AnalyticsAttribute.Error, str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f48384a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("BACS mandate event", writableNativeMap);
    }

    private void d() {
        try {
            AdyenComponentView adyenComponentView = (AdyenComponentView) findViewById(m.f48409d);
            if (adyenComponentView == null) {
                return;
            }
            adyenComponentView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            adyenComponentView.layout(0, 0, adyenComponentView.getMeasuredWidth(), adyenComponentView.getMeasuredHeight());
            Log.d("BACS_MANDATE", "Mandate view restored successfully");
        } catch (Exception e11) {
            b("Failed to restore mandate view: " + e11.getMessage());
        }
    }

    @ReactMethod
    public void a(String str, String str2, String str3) {
        try {
            this.f48386c = (of.e) of.e.f97277w.c(this.f48385b, new of.f.a(Locale.forLanguageTag("en-GB"), str.equals("stage") ? Environment.f91841d : g.a("EU"), str2).a(), new C0764a(), "mandate");
            ((AdyenComponentView) findViewById(m.f48409d)).e(this.f48386c, this.f48385b);
            VoucherAction voucherAction = new VoucherAction();
            voucherAction.setPaymentMethodType(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);
            voucherAction.setUrl(str3);
            this.f48386c.h(voucherAction, this.f48385b);
            this.f48387d = true;
        } catch (Exception e11) {
            b("Failed to initialize BACS mandate component : " + e11.getMessage());
        }
    }

    public void c() {
        androidx.fragment.app.u uVar = this.f48385b;
        if (uVar != null) {
            uVar.getLifecycle().d(this);
            Log.d("BACS_MANDATE", "Lifecycle observer removed in removeObservers");
        }
    }

    @Override // androidx.p003lifecycle.u
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.a aVar) {
        androidx.fragment.app.u uVar;
        int i11 = b.f48389a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 && (uVar = this.f48385b) != null) {
                uVar.getLifecycle().d(this);
                return;
            }
            return;
        }
        if (this.f48387d) {
            Log.d("BACS_MANDATE", "Resuming from background, restoring view");
            d();
        }
    }

    /* JADX INFO: renamed from: com.reactlibrary.a$a, reason: collision with other inner class name */
    class C0764a implements be.a {
        C0764a() {
        }

        @Override // be.a
        public void a(@NonNull ActionComponentData actionComponentData) {
        }

        @Override // be.a
        public void b(@NonNull be.g gVar) {
        }

        @Override // be.a
        public void c(@NonNull String str, @NonNull me.d dVar) {
        }
    }
}
