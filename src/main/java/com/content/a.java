package com.content;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.EmailEditText;
import com.stripe.android.view.s;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import h40.i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import st.g;
import st.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/reactnativestripesdk/a;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "c", "()V", "", "name", "setCompanyName", "(Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "value", "setFormStyle", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/stripe/android/model/w0;", "params", "b", "(Lcom/stripe/android/model/w0;)V", "a", "Lcom/facebook/react/uimanager/v0;", "Lcom/stripe/android/view/s;", "Lcom/stripe/android/view/s;", "becsDebitWidget", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "mEventDispatcher", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/bridge/ReadableMap;", "formStyle", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private s becsDebitWidget;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private EventDispatcher mEventDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ReadableMap formStyle;

    /* JADX INFO: renamed from: com.reactnativestripesdk.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/reactnativestripesdk/a$a", "Lcom/stripe/android/view/s$c;", "", "isValid", "Ljn0/h0;", "a", "(Z)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0770a implements s.c {
        C0770a() {
        }

        @Override // com.stripe.android.view.s.c
        public void a(boolean isValid) throws IOException {
            s sVar = a.this.becsDebitWidget;
            if (sVar == null) {
                p013kotlin.jvm.internal.s.B("becsDebitWidget");
                sVar = null;
            }
            PaymentMethodCreateParams params = sVar.getParams();
            if (params != null) {
                a.this.b(params);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v0 context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.mEventDispatcher = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
    }

    private final void c() {
        s sVar = this.becsDebitWidget;
        if (sVar == null) {
            p013kotlin.jvm.internal.s.B("becsDebitWidget");
            sVar = null;
        }
        sVar.setValidParamsCallback(new C0770a());
    }

    public final void b(PaymentMethodCreateParams params) {
        p013kotlin.jvm.internal.s.k(params, "params");
        Object obj = params.c3().get("billing_details");
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        HashMap map = (HashMap) obj;
        Object obj2 = params.c3().get("au_becs_debit");
        p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        HashMap map2 = (HashMap) obj2;
        Object obj3 = map2.get("account_number");
        p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.String");
        Pair pairA = x.a("accountNumber", (String) obj3);
        Object obj4 = map2.get("bsb_number");
        p013kotlin.jvm.internal.s.i(obj4, "null cannot be cast to non-null type kotlin.String");
        Pair pairA2 = x.a("bsbNumber", (String) obj4);
        Object obj5 = map.get("name");
        p013kotlin.jvm.internal.s.i(obj5, "null cannot be cast to non-null type kotlin.String");
        Pair pairA3 = x.a("name", (String) obj5);
        Object obj6 = map.get(Scopes.EMAIL);
        p013kotlin.jvm.internal.s.i(obj6, "null cannot be cast to non-null type kotlin.String");
        Map mapO = p013kotlin.collections.v0.o(pairA, pairA2, pairA3, x.a(Scopes.EMAIL, (String) obj6));
        EventDispatcher eventDispatcher = this.mEventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new f0(getId(), mapO));
        }
    }

    public final void setCompanyName(String name) {
        v0 v0Var = this.context;
        p013kotlin.jvm.internal.s.i(name, "null cannot be cast to non-null type kotlin.String");
        this.becsDebitWidget = new s(v0Var, null, 0, name, 6, null);
        setFormStyle(this.formStyle);
        s sVar = this.becsDebitWidget;
        if (sVar == null) {
            p013kotlin.jvm.internal.s.B("becsDebitWidget");
            sVar = null;
        }
        addView(sVar);
        c();
    }

    public final void setFormStyle(ReadableMap value) {
        this.formStyle = value;
        s sVar = this.becsDebitWidget;
        if (sVar == null || value == null) {
            return;
        }
        View view = null;
        if (sVar == null) {
            p013kotlin.jvm.internal.s.B("becsDebitWidget");
            sVar = null;
        }
        i iVarA = i.a(sVar);
        p013kotlin.jvm.internal.s.j(iVarA, "bind(...)");
        String strI = s10.i.i(value, "textColor", null);
        String strI2 = s10.i.i(value, "textErrorColor", null);
        String strI3 = s10.i.i(value, "placeholderColor", null);
        Integer numF = s10.i.f(value, OrcaFlavourKeys.FONT_SIZE);
        Integer numF2 = s10.i.f(value, "borderWidth");
        String strI4 = s10.i.i(value, "backgroundColor", null);
        String strI5 = s10.i.i(value, "borderColor", null);
        Integer numF3 = s10.i.f(value, Snapshot.BORDER_RADIUS);
        int iIntValue = numF3 != null ? numF3.intValue() : 0;
        if (strI != null) {
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = iVarA.f70694b;
            p013kotlin.jvm.internal.s.i(becsDebitAccountNumberEditText, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitAccountNumberEditText.setTextColor(Color.parseColor(strI));
            BecsDebitBsbEditText becsDebitBsbEditText = iVarA.f70696d;
            p013kotlin.jvm.internal.s.i(becsDebitBsbEditText, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText.setTextColor(Color.parseColor(strI));
            EmailEditText emailEditText = iVarA.f70698f;
            p013kotlin.jvm.internal.s.i(emailEditText, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText.setTextColor(Color.parseColor(strI));
            iVarA.f70701i.setTextColor(Color.parseColor(strI));
        }
        if (strI2 != null) {
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = iVarA.f70694b;
            p013kotlin.jvm.internal.s.i(becsDebitAccountNumberEditText2, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitAccountNumberEditText2.setErrorColor(Color.parseColor(strI2));
            BecsDebitBsbEditText becsDebitBsbEditText2 = iVarA.f70696d;
            p013kotlin.jvm.internal.s.i(becsDebitBsbEditText2, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText2.setErrorColor(Color.parseColor(strI2));
            EmailEditText emailEditText2 = iVarA.f70698f;
            p013kotlin.jvm.internal.s.i(emailEditText2, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText2.setErrorColor(Color.parseColor(strI2));
            iVarA.f70701i.setErrorColor(Color.parseColor(strI2));
        }
        if (strI3 != null) {
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText3 = iVarA.f70694b;
            p013kotlin.jvm.internal.s.i(becsDebitAccountNumberEditText3, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitAccountNumberEditText3.setHintTextColor(Color.parseColor(strI3));
            BecsDebitBsbEditText becsDebitBsbEditText3 = iVarA.f70696d;
            p013kotlin.jvm.internal.s.i(becsDebitBsbEditText3, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText3.setHintTextColor(Color.parseColor(strI3));
            EmailEditText emailEditText3 = iVarA.f70698f;
            p013kotlin.jvm.internal.s.i(emailEditText3, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText3.setHintTextColor(Color.parseColor(strI3));
            iVarA.f70701i.setHintTextColor(Color.parseColor(strI3));
        }
        if (numF != null) {
            int iIntValue2 = numF.intValue();
            BecsDebitAccountNumberEditText becsDebitAccountNumberEditText4 = iVarA.f70694b;
            p013kotlin.jvm.internal.s.i(becsDebitAccountNumberEditText4, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            float f11 = iIntValue2;
            becsDebitAccountNumberEditText4.setTextSize(f11);
            BecsDebitBsbEditText becsDebitBsbEditText4 = iVarA.f70696d;
            p013kotlin.jvm.internal.s.i(becsDebitBsbEditText4, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            becsDebitBsbEditText4.setTextSize(f11);
            EmailEditText emailEditText4 = iVarA.f70698f;
            p013kotlin.jvm.internal.s.i(emailEditText4, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText");
            emailEditText4.setTextSize(f11);
            iVarA.f70701i.setTextSize(f11);
        }
        s sVar2 = this.becsDebitWidget;
        if (sVar2 == null) {
            p013kotlin.jvm.internal.s.B("becsDebitWidget");
        } else {
            view = sVar2;
        }
        g gVar = new g(new k().v().q(0, iIntValue * 2).m());
        gVar.m0(BitmapDescriptorFactory.HUE_RED);
        gVar.l0(ColorStateList.valueOf(Color.parseColor("#000000")));
        gVar.b0(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (numF2 != null) {
            gVar.m0(numF2.intValue() * 2);
        }
        if (strI5 != null) {
            gVar.l0(ColorStateList.valueOf(Color.parseColor(strI5)));
        }
        if (strI4 != null) {
            gVar.b0(ColorStateList.valueOf(Color.parseColor(strI4)));
        }
        view.setBackground(gVar);
    }
}
