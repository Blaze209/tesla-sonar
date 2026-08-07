package com.content;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.os.LocaleListCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import com.stripe.android.view.f0;
import com.stripe.android.view.m0;
import com.stripe.android.view.x0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import h40.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.s0;
import p013kotlin.text.t;
import s10.g;
import s10.i;
import t30.CountryCode;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\bJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\bJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u001aJ\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\u001aJ\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0017¢\u0006\u0004\b&\u0010\u001aJ)\u0010*\u001a\u00020\u00062\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010'j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\b1\u0010/J\u001b\u00104\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010302¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\bR\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R%\u0010B\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u000103028\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u00105R$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010XR\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/reactnativestripesdk/k;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "n", "()V", "", "color", "setCardBrandTint", "(I)V", "o", "s", "t", "Lt30/b;", "countryCode", "setPostalCodeFilter", "(Lt30/b;)V", "Landroid/text/InputFilter;", "k", "(Lt30/b;)Landroid/text/InputFilter;", "", "value", "setAutofocus", "(Z)V", "r", "p", "q", "Lcom/facebook/react/bridge/ReadableMap;", "setCardStyle", "(Lcom/facebook/react/bridge/ReadableMap;)V", "setPlaceHolders", "isEnabled", "setDangerouslyGetFullCardDetails", "setPostalCodeEnabled", "isDisabled", "setDisabled", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "preferredNetworks", "setPreferredNetworks", "(Ljava/util/ArrayList;)V", "", "onBehalfOf", "setOnBehalfOf", "(Ljava/lang/String;)V", "countryString", "setCountryCode", "", "", "getValue", "()Ljava/util/Map;", "requestLayout", "Lcom/stripe/android/view/m0;", "a", "Lcom/stripe/android/view/m0;", "mCardWidget", "Lh40/l;", "b", "Lh40/l;", "cardInputWidgetBinding", "c", "Ljava/util/Map;", "getCardDetails", "cardDetails", "Lcom/stripe/android/model/w0$c;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/w0$c;", "getCardParams", "()Lcom/stripe/android/model/w0$c;", "setCardParams", "(Lcom/stripe/android/model/w0$c;)V", "cardParams", "Lcom/stripe/android/model/b;", "e", "Lcom/stripe/android/model/b;", "getCardAddress", "()Lcom/stripe/android/model/b;", "setCardAddress", "(Lcom/stripe/android/model/b;)V", "cardAddress", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "f", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "mEventDispatcher", "g", "Z", "dangerouslyGetFullCardDetails", "h", "Ljava/lang/String;", "currentFocusedField", IntegerTokenConverter.CONVERTER_KEY, "isCardValid", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "mLayoutRunnable", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private m0 mCardWidget;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l cardInputWidgetBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> cardDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private PaymentMethodCreateParams.Card cardParams;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Address cardAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EventDispatcher mEventDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean dangerouslyGetFullCardDetails;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String currentFocusedField;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isCardValid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Runnable mLayoutRunnable;

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"com/reactnativestripesdk/k$a", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "var1", "var2", "var3", "var4", "onTextChanged", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable p11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence p11, int p12, int p13, int p14) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
            if (k.this.dangerouslyGetFullCardDetails) {
                k.this.getCardDetails().put("cvc", String.valueOf(var1));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/k$b", "Lcom/stripe/android/view/f0;", "Ljn0/h0;", "e", "()V", "b", "a", "c", "Lcom/stripe/android/view/f0$a;", "focusField", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/view/f0$a;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements f0 {
        b() {
        }

        @Override // com.stripe.android.view.f0
        public void a() {
        }

        @Override // com.stripe.android.view.f0
        public void b() {
        }

        @Override // com.stripe.android.view.f0
        public void c() {
        }

        @Override // com.stripe.android.view.f0
        public void d(f0.a focusField) {
            s.k(focusField, "focusField");
        }

        @Override // com.stripe.android.view.f0
        public void e() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"com/reactnativestripesdk/k$c", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "var1", "var2", "var3", "var4", "onTextChanged", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable p11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence p11, int p12, int p13, int p14) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
            List listF1 = t.f1(String.valueOf(var1), new String[]{"/"}, false, 0, 6, null);
            k.this.getCardDetails().put("expiryMonth", t.x((String) listF1.get(0)));
            if (listF1.size() == 2) {
                k.this.getCardDetails().put("expiryYear", t.x((String) t.f1(String.valueOf(var1), new String[]{"/"}, false, 0, 6, null).get(1)));
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"com/reactnativestripesdk/k$d", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "var1", "var2", "var3", "var4", "onTextChanged", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable p11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence p11, int p12, int p13, int p14) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
            k.this.getCardDetails().put("postalCode", String.valueOf(var1));
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"com/reactnativestripesdk/k$e", "Landroid/text/TextWatcher;", "", "p0", "", "p1", "p2", "p3", "Ljn0/h0;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "var1", "var2", "var3", "var4", "onTextChanged", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable p11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence p11, int p12, int p13, int p14) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
            if (k.this.dangerouslyGetFullCardDetails) {
                k.this.getCardDetails().put(InquiryField.FloatField.TYPE2, t.V(String.valueOf(var1), " ", "", false, 4, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v0 context) {
        super(context);
        s.k(context, "context");
        m0 m0Var = new m0(context, null, 0, 6, null);
        this.mCardWidget = m0Var;
        l lVarA = l.a(m0Var);
        s.j(lVarA, "bind(...)");
        this.cardInputWidgetBinding = lVarA;
        this.cardDetails = p013kotlin.collections.v0.o(x.a("brand", ""), x.a("last4", ""), x.a("expiryMonth", null), x.a("expiryYear", null), x.a("postalCode", ""), x.a("validNumber", "Unknown"), x.a("validCVC", "Unknown"), x.a("validExpiryDate", "Unknown"));
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.mEventDispatcher = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
        lVarA.f70718e.setFocusable(true);
        lVarA.f70718e.setFocusableInTouchMode(true);
        lVarA.f70718e.requestFocus();
        addView(this.mCardWidget);
        t();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                k.i(this.f48781a);
            }
        });
        this.mLayoutRunnable = new Runnable() { // from class: com.reactnativestripesdk.d
            @Override // java.lang.Runnable
            public final void run() {
                k.m(this.f48788a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(k kVar) {
        kVar.requestLayout();
    }

    @SuppressLint({"RestrictedApi"})
    private final InputFilter k(final CountryCode countryCode) {
        return new InputFilter() { // from class: com.reactnativestripesdk.e
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return k.l(countryCode, charSequence, i11, i12, spanned, i13, i14);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(CountryCode countryCode, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        while (i11 < i12) {
            CountryCode.Companion companion = CountryCode.INSTANCE;
            if (!(s.f(countryCode, companion.b()) && s10.k.INSTANCE.b(charSequence.charAt(i11))) && (s.f(countryCode, companion.b()) || !s10.k.INSTANCE.a(charSequence.charAt(i11)))) {
                return "";
            }
            i11++;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(k kVar) {
        kVar.measure(View.MeasureSpec.makeMeasureSpec(kVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(kVar.getHeight(), 1073741824));
        kVar.layout(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
    }

    private final void n() {
        EventDispatcher eventDispatcher = this.mEventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new l(getId(), this.currentFocusedField));
        }
    }

    private final void o() {
        PaymentMethodCreateParams.Card paymentMethodCard = this.mCardWidget.getPaymentMethodCard();
        if (paymentMethodCard != null) {
            this.cardParams = paymentMethodCard;
            this.cardAddress = new Address.a().g((String) this.cardDetails.get("postalCode")).a();
        } else {
            this.cardParams = null;
            this.cardAddress = null;
        }
        CardParams cardParams = this.mCardWidget.getCardParams();
        if (cardParams != null) {
            this.cardDetails.put("brand", i.l(cardParams.getBrand()));
            this.cardDetails.put("last4", cardParams.i());
        } else {
            this.cardDetails.put("brand", null);
            this.cardDetails.put("last4", null);
        }
        s();
    }

    private final void s() {
        EventDispatcher eventDispatcher = this.mEventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new com.content.b(getId(), this.cardDetails, this.mCardWidget.getPostalCodeEnabled(), this.isCardValid, this.dangerouslyGetFullCardDetails));
        }
    }

    private final void setCardBrandTint(int color) {
        try {
            this.cardInputWidgetBinding.f70715b.getClass().getDeclaredMethod("setTintColorInt$payments_core_release", Integer.TYPE).invoke(this.cardInputWidgetBinding.f70715b, Integer.valueOf(color));
        } catch (Exception e11) {
            Log.e("StripeReactNative", "Unable to set card brand tint color: " + e11.getMessage());
        }
    }

    private final void setPostalCodeFilter(CountryCode countryCode) {
        PostalCodeEditText postalCodeEditText = this.cardInputWidgetBinding.f70723j;
        s0 s0Var = new s0(2);
        s0Var.b(this.cardInputWidgetBinding.f70723j.getFilters());
        s0Var.a(k(countryCode));
        postalCodeEditText.setFilters((InputFilter[]) s0Var.d(new InputFilter[s0Var.c()]));
    }

    private final void t() {
        this.cardInputWidgetBinding.f70716c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.u(this.f48805a, view, z11);
            }
        });
        this.cardInputWidgetBinding.f70721h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.v(this.f48808a, view, z11);
            }
        });
        this.cardInputWidgetBinding.f70719f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.w(this.f48810a, view, z11);
            }
        });
        this.cardInputWidgetBinding.f70723j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                k.x(this.f48812a, view, z11);
            }
        });
        this.mCardWidget.setCardValidCallback(new x0() { // from class: com.reactnativestripesdk.j
            @Override // com.stripe.android.view.x0
            public final void a(boolean z11, Set set) {
                k.y(this.f48814a, z11, set);
            }
        });
        this.mCardWidget.setCardInputListener(new b());
        this.mCardWidget.setExpiryDateTextWatcher(new c());
        this.mCardWidget.setPostalCodeTextWatcher(new d());
        this.mCardWidget.setCardNumberTextWatcher(new e());
        this.mCardWidget.setCvcNumberTextWatcher(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(k kVar, View view, boolean z11) {
        kVar.currentFocusedField = z11 ? "CardNumber" : null;
        kVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(k kVar, View view, boolean z11) {
        kVar.currentFocusedField = z11 ? "ExpiryDate" : null;
        kVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(k kVar, View view, boolean z11) {
        kVar.currentFocusedField = z11 ? "Cvc" : null;
        kVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(k kVar, View view, boolean z11) {
        kVar.currentFocusedField = z11 ? "PostalCode" : null;
        kVar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(k kVar, boolean z11, Set invalidFields) {
        s.k(invalidFields, "invalidFields");
        kVar.isCardValid = z11;
        Map<String, Object> map = kVar.cardDetails;
        x0.a aVar = x0.a.Number;
        CardNumberEditText cardNumberEditText = kVar.cardInputWidgetBinding.f70716c;
        s.j(cardNumberEditText, "cardNumberEditText");
        map.put("validNumber", z(invalidFields, aVar, cardNumberEditText));
        Map<String, Object> map2 = kVar.cardDetails;
        x0.a aVar2 = x0.a.Cvc;
        CvcEditText cvcEditText = kVar.cardInputWidgetBinding.f70719f;
        s.j(cvcEditText, "cvcEditText");
        map2.put("validCVC", z(invalidFields, aVar2, cvcEditText));
        Map<String, Object> map3 = kVar.cardDetails;
        x0.a aVar3 = x0.a.Expiry;
        ExpiryDateEditText expiryDateEditText = kVar.cardInputWidgetBinding.f70721h;
        s.j(expiryDateEditText, "expiryDateEditText");
        map3.put("validExpiryDate", z(invalidFields, aVar3, expiryDateEditText));
        kVar.cardDetails.put("brand", i.l(kVar.cardInputWidgetBinding.f70716c.getCardBrand()));
        if (z11) {
            kVar.o();
            return;
        }
        kVar.cardParams = null;
        kVar.cardAddress = null;
        kVar.s();
    }

    private static final String z(Set<? extends x0.a> set, x0.a aVar, StripeEditText stripeEditText) {
        if (set.contains(aVar)) {
            return stripeEditText.getShouldShowError() ? "Invalid" : "Incomplete";
        }
        return "Valid";
    }

    public final Address getCardAddress() {
        return this.cardAddress;
    }

    public final Map<String, Object> getCardDetails() {
        return this.cardDetails;
    }

    public final PaymentMethodCreateParams.Card getCardParams() {
        return this.cardParams;
    }

    public final Map<String, Object> getValue() {
        return this.cardDetails;
    }

    public final void p() {
        CardNumberEditText cardNumberEditText = this.cardInputWidgetBinding.f70716c;
        s.j(cardNumberEditText, "cardNumberEditText");
        g.c(cardNumberEditText);
        this.cardInputWidgetBinding.f70716c.clearFocus();
        this.cardInputWidgetBinding.f70718e.requestFocus();
    }

    public final void q() {
        this.cardInputWidgetBinding.f70716c.setText("");
        this.cardInputWidgetBinding.f70719f.setText("");
        this.cardInputWidgetBinding.f70721h.setText("");
        if (this.mCardWidget.getPostalCodeEnabled()) {
            this.cardInputWidgetBinding.f70723j.setText("");
        }
    }

    public final void r() {
        this.cardInputWidgetBinding.f70716c.requestFocus();
        CardNumberEditText cardNumberEditText = this.cardInputWidgetBinding.f70716c;
        s.j(cardNumberEditText, "cardNumberEditText");
        g.e(cardNumberEditText);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    public final void setAutofocus(boolean value) {
        if (value) {
            this.cardInputWidgetBinding.f70716c.requestFocus();
            CardNumberEditText cardNumberEditText = this.cardInputWidgetBinding.f70716c;
            s.j(cardNumberEditText, "cardNumberEditText");
            g.e(cardNumberEditText);
        }
    }

    public final void setCardAddress(Address address) {
        this.cardAddress = address;
    }

    public final void setCardParams(PaymentMethodCreateParams.Card card) {
        this.cardParams = card;
    }

    public final void setCardStyle(ReadableMap value) {
        s.k(value, "value");
        Integer numF = i.f(value, "borderWidth");
        String strI = i.i(value, "backgroundColor", null);
        String strI2 = i.i(value, "borderColor", null);
        Integer numF2 = i.f(value, Snapshot.BORDER_RADIUS);
        int iIntValue = numF2 != null ? numF2.intValue() : 0;
        String strI3 = i.i(value, "textColor", null);
        Integer numF3 = i.f(value, OrcaFlavourKeys.FONT_SIZE);
        String strJ = i.j(value, "fontFamily", null, 4, null);
        String strI4 = i.i(value, "placeholderColor", null);
        String strI5 = i.i(value, "textErrorColor", null);
        String strI6 = i.i(value, "cursorColor", null);
        l lVar = this.cardInputWidgetBinding;
        Set<StripeEditText> setI = d1.i(lVar.f70716c, lVar.f70719f, lVar.f70721h, lVar.f70723j);
        if (strI3 != null) {
            Iterator it = setI.iterator();
            while (it.hasNext()) {
                ((StripeEditText) it.next()).setTextColor(Color.parseColor(strI3));
            }
        }
        if (strI5 != null) {
            Iterator it2 = setI.iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).setErrorColor(Color.parseColor(strI5));
            }
        }
        if (strI4 != null) {
            Iterator it3 = setI.iterator();
            while (it3.hasNext()) {
                ((StripeEditText) it3.next()).setHintTextColor(Color.parseColor(strI4));
            }
            setCardBrandTint(Color.parseColor(strI4));
        }
        if (numF3 != null) {
            int iIntValue2 = numF3.intValue();
            Iterator it4 = setI.iterator();
            while (it4.hasNext()) {
                ((StripeEditText) it4.next()).setTextSize(iIntValue2);
            }
        }
        if (strJ != null) {
            for (StripeEditText stripeEditText : setI) {
                String str = strJ.length() > 0 ? strJ : null;
                AssetManager assets = getContext().getAssets();
                s.j(assets, "getAssets(...)");
                stripeEditText.setTypeface(com.facebook.react.views.text.k.a(null, -1, -1, str, assets));
            }
        }
        if (strI6 != null && Build.VERSION.SDK_INT >= 29) {
            int color = Color.parseColor(strI6);
            for (StripeEditText stripeEditText2 : setI) {
                Drawable textCursorDrawable = stripeEditText2.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setTint(color);
                }
                Drawable textSelectHandle = stripeEditText2.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(color);
                }
                Drawable textSelectHandleLeft = stripeEditText2.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(color);
                }
                Drawable textSelectHandleRight = stripeEditText2.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(color);
                }
                stripeEditText2.setHighlightColor(color);
            }
        }
        this.mCardWidget.setPadding(20, 0, 20, 0);
        m0 m0Var = this.mCardWidget;
        st.g gVar = new st.g(new st.k().v().q(0, w.g(iIntValue)).m());
        gVar.m0(BitmapDescriptorFactory.HUE_RED);
        gVar.l0(ColorStateList.valueOf(Color.parseColor("#000000")));
        gVar.b0(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (numF != null) {
            gVar.m0(w.g(numF.intValue()));
        }
        if (strI2 != null) {
            gVar.l0(ColorStateList.valueOf(Color.parseColor(strI2)));
        }
        if (strI != null) {
            gVar.b0(ColorStateList.valueOf(Color.parseColor(strI)));
        }
        m0Var.setBackground(gVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void setCountryCode(String countryString) {
        if (this.mCardWidget.getPostalCodeEnabled()) {
            CountryCode.Companion companion = CountryCode.INSTANCE;
            if (countryString == null) {
                Locale localeC = LocaleListCompat.d().c(0);
                countryString = localeC != null ? localeC.getCountry() : null;
                if (countryString == null) {
                    countryString = "US";
                }
            }
            CountryCode countryCodeA = companion.a(countryString);
            this.mCardWidget.setPostalCodeRequired(t30.d.f112276a.b(countryCodeA));
            setPostalCodeFilter(countryCodeA);
        }
    }

    public final void setDangerouslyGetFullCardDetails(boolean isEnabled) {
        this.dangerouslyGetFullCardDetails = isEnabled;
    }

    public final void setDisabled(boolean isDisabled) {
        this.mCardWidget.setEnabled(!isDisabled);
    }

    public final void setOnBehalfOf(String onBehalfOf) {
        this.mCardWidget.setOnBehalfOf(onBehalfOf);
    }

    public final void setPlaceHolders(ReadableMap value) {
        s.k(value, "value");
        String strI = i.i(value, InquiryField.FloatField.TYPE2, null);
        String strI2 = i.i(value, "expiration", null);
        String strI3 = i.i(value, "cvc", null);
        String strI4 = i.i(value, "postalCode", null);
        if (strI != null) {
            this.cardInputWidgetBinding.f70716c.setHint(strI);
        }
        if (strI2 != null) {
            this.cardInputWidgetBinding.f70721h.setHint(strI2);
        }
        if (strI3 != null) {
            this.mCardWidget.setCvcLabel(strI3);
        }
        if (strI4 != null) {
            this.cardInputWidgetBinding.f70723j.setHint(strI4);
        }
    }

    public final void setPostalCodeEnabled(boolean isEnabled) {
        this.mCardWidget.setPostalCodeEnabled(isEnabled);
        if (isEnabled) {
            return;
        }
        this.mCardWidget.setPostalCodeRequired(false);
    }

    public final void setPreferredNetworks(ArrayList<Integer> preferredNetworks) {
        this.mCardWidget.setPreferredNetworks(i.O(preferredNetworks));
    }
}
