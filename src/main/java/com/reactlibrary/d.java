package com.reactlibrary;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.u;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.ui.core.AdyenComponentView;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import java.util.Objects;
import me.Environment;

/* JADX INFO: loaded from: classes6.dex */
public class d extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f48392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ud.a f48393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f48394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f48395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BacsDirectDebitPaymentMethod f48396e;

    public d(v0 v0Var, u uVar) {
        super(v0Var);
        this.f48392a = v0Var;
        this.f48394c = uVar;
        View.inflate(v0Var, n.f48411b, this);
    }

    private void i() {
        try {
            if (this.f48393b.h()) {
                this.f48395d.setVisibility(8);
                Button button = (Button) findViewById(m.f48406a);
                button.setOnClickListener(new View.OnClickListener() { // from class: com.reactlibrary.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f48391a.n(view);
                    }
                });
                button.setVisibility(0);
                AdyenComponentView adyenComponentView = (AdyenComponentView) findViewById(m.f48408c);
                if (adyenComponentView != null) {
                    int width = adyenComponentView.getWidth();
                    adyenComponentView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    adyenComponentView.layout(0, 0, width, Math.max(adyenComponentView.getMeasuredHeight(), 400));
                    l(this.f48392a, adyenComponentView);
                }
            }
        } catch (Exception e11) {
            t("Failed to attach BACS confirmation view : " + e11.getMessage());
        }
    }

    private void j() {
        try {
            ((AdyenComponentView) findViewById(m.f48408c)).e(this.f48393b, this.f48394c);
            this.f48393b.i();
            Button button = (Button) findViewById(m.f48407b);
            this.f48395d = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.reactlibrary.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48390a.o(view);
                }
            });
            k();
        } catch (Exception e11) {
            t("Failed to attach BACS input view : " + e11.getMessage());
        }
    }

    public static void l(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.findFocus().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        ((RCTEventEmitter) this.f48392a.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topError", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(WritableMap writableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("details", writableMap);
        ((RCTEventEmitter) this.f48392a.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topChange", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        ((RCTEventEmitter) this.f48392a.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onConfirm", null);
    }

    private void s() {
        this.f48393b.k();
    }

    private void t(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(AnalyticsAttribute.Error, str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f48392a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("BACS form event", writableNativeMap);
    }

    public void k() {
        try {
            Editable text = ((AdyenTextInputEditText) findViewById(ud.f.f116127b)).getText();
            Objects.requireNonNull(text);
            text.clear();
            Editable text2 = ((AdyenTextInputEditText) findViewById(ud.f.f116126a)).getText();
            Objects.requireNonNull(text2);
            text2.clear();
            Editable text3 = ((AdyenTextInputEditText) findViewById(ud.f.f116129d)).getText();
            Objects.requireNonNull(text3);
            text3.clear();
            Editable text4 = ((AdyenTextInputEditText) findViewById(ud.f.f116128c)).getText();
            Objects.requireNonNull(text4);
            text4.clear();
            ((SwitchCompat) findViewById(ud.f.f116131f)).setChecked(false);
            ((SwitchCompat) findViewById(ud.f.f116130e)).setChecked(false);
            ((TextView) findViewById(ud.f.f116137l)).setText("");
            ((TextView) findViewById(ud.f.f116136k)).setText("");
        } catch (Exception e11) {
            t("Failed to clear BACS inputs : " + e11.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public void m(String str, String str2, String str3, String str4, String str5, Integer num) {
        try {
            Environment environmentA = str.equals("stage") ? Environment.f91841d : g.a("EU");
            Amount amount = new Amount();
            amount.setCurrency(str5);
            amount.setValue(num.intValue());
            new Locale(str3, str4);
            ud.c cVar = (ud.c) ((ud.c.a) new ud.c.a(this.f48392a, environmentA, str2).h(amount)).l(false).a();
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod.setName("BACS Direct Debit");
            paymentMethod.setType(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);
            ud.a aVarF = ud.a.f116106y.f(this.f48394c, paymentMethod, cVar, new a(), new OrderRequest("", ""), "bacs");
            this.f48393b = aVarF;
            aVarF.j(false);
            j();
        } catch (Exception e11) {
            t("Failed to initialize BACS component : " + e11.getMessage());
        }
    }

    public void u() {
        if (this.f48393b == null) {
            return;
        }
        this.f48392a = null;
        this.f48393b = null;
    }

    class a implements be.f {
        a() {
        }

        @Override // be.f
        public void a(@NonNull ActionComponentData actionComponentData) {
        }

        @Override // be.f
        public void b(@NonNull be.g gVar) {
            d.this.p(gVar.a());
        }

        @Override // be.f
        public void d(@NonNull be.h hVar) {
            d.this.r();
            d.this.f48396e = null;
        }

        @Override // be.f
        public void e(@NonNull be.h hVar) {
            boolean isInputValid = hVar.getIsInputValid();
            if (d.this.f48395d != null) {
                d.this.f48395d.setEnabled(isInputValid);
                if (isInputValid) {
                    d.this.f48395d.setBackgroundColor(Color.parseColor("#3368FF"));
                    d.this.f48395d.setTextColor(Color.parseColor("#F3F3F3"));
                } else {
                    d.this.f48395d.setBackgroundColor(Color.parseColor("#1E2E5B"));
                    d.this.f48395d.setTextColor(Color.parseColor("#969696"));
                }
            }
            if (isInputValid) {
                try {
                    if (d.this.f48396e == null) {
                        d.this.f48396e = (BacsDirectDebitPaymentMethod) hVar.getData().getPaymentMethod();
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("accountNumber", d.this.f48396e.getBankAccountNumber());
                        writableMapCreateMap.putString("locationId", d.this.f48396e.getBankLocationId());
                        writableMapCreateMap.putString("accountHolder", d.this.f48396e.getHolderName());
                        d.this.q(writableMapCreateMap);
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override // be.f
        public void c(@NonNull String str, @NonNull me.d dVar) {
        }
    }
}
