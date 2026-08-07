package com.content;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
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
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import com.stripe.android.view.e0;
import com.stripe.android.view.f0;
import com.stripe.android.view.x0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import h40.k;
import h40.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.s0;
import s10.g;
import s10.i;
import t30.CountryCode;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0015J)\u0010 \u001a\u00020\b2\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010\u0019J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u0015J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\fJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0016H\u0007¢\u0006\u0004\b'\u0010\u0019J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0012¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\fR\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/reactnativestripesdk/v;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "", "countryString", "Ljn0/h0;", "setCountry", "(Ljava/lang/String;)V", "m", "()V", "q", "w", "Landroid/text/InputFilter;", "j", "()Landroid/text/InputFilter;", "", "value", "setPostalCodeEnabled", "(Z)V", "Lcom/facebook/react/bridge/ReadableMap;", "defaults", "setDefaultValues", "(Lcom/facebook/react/bridge/ReadableMap;)V", "isDisabled", "setDisabled", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "preferredNetworks", "setPreferredNetworks", "(Ljava/util/ArrayList;)V", "setPlaceHolders", "setAutofocus", "p", "n", "o", "setCardStyle", "isEnabled", "setDangerouslyGetFullCardDetails", "requestLayout", "Lcom/stripe/android/view/e0;", "a", "Lcom/stripe/android/view/e0;", "cardForm", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "b", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "mEventDispatcher", "c", "Z", "dangerouslyGetFullCardDetails", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "currentFocusedField", "Lcom/stripe/android/model/w0$c;", "e", "Lcom/stripe/android/model/w0$c;", "getCardParams", "()Lcom/stripe/android/model/w0$c;", "setCardParams", "(Lcom/stripe/android/model/w0$c;)V", "cardParams", "Lcom/stripe/android/model/b;", "f", "Lcom/stripe/android/model/b;", "getCardAddress", "()Lcom/stripe/android/model/b;", "setCardAddress", "(Lcom/stripe/android/model/b;)V", "cardAddress", "Lh40/k;", "g", "Lh40/k;", "cardFormViewBinding", "Lh40/m;", "h", "Lh40/m;", "multilineWidgetBinding", "Ljava/lang/Runnable;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Runnable;", "mLayoutRunnable", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private e0 cardForm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private EventDispatcher mEventDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean dangerouslyGetFullCardDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String currentFocusedField;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private PaymentMethodCreateParams.Card cardParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Address cardAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k cardFormViewBinding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m multilineWidgetBinding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Runnable mLayoutRunnable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(v0 context) {
        super(context);
        s.k(context, "context");
        this.cardForm = new e0(context, null, f30.e0.f63988b);
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.mEventDispatcher = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
        k kVarA = k.a(this.cardForm);
        s.j(kVarA, "bind(...)");
        this.cardFormViewBinding = kVarA;
        m mVarA = m.a(kVarA.f70707b);
        s.j(mVarA, "bind(...)");
        this.multilineWidgetBinding = mVarA;
        kVarA.f70708c.setFocusable(true);
        kVarA.f70708c.setFocusableInTouchMode(true);
        ViewGroup.LayoutParams layoutParams = kVarA.f70708c.getLayoutParams();
        s.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        addView(this.cardForm);
        q();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativestripesdk.n
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                v.i(this.f48854a);
            }
        });
        this.mLayoutRunnable = new Runnable() { // from class: com.reactnativestripesdk.o
            @Override // java.lang.Runnable
            public final void run() {
                v.l(this.f48860a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(v vVar) {
        vVar.requestLayout();
    }

    @SuppressLint({"RestrictedApi"})
    private final InputFilter j() {
        return new InputFilter() { // from class: com.reactnativestripesdk.p
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                return v.k(this.f48865a, charSequence, i11, i12, spanned, i13, i14);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(v vVar, CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        if (s.f(vVar.cardFormViewBinding.f70709d.getSelectedCountryCode(), CountryCode.INSTANCE.b())) {
            return null;
        }
        while (i11 < i12) {
            if (!s10.k.INSTANCE.a(charSequence.charAt(i11))) {
                return "";
            }
            i11++;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(v vVar) {
        vVar.measure(View.MeasureSpec.makeMeasureSpec(vVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(vVar.getHeight(), 1073741824));
        vVar.layout(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
    }

    private final void m() {
        EventDispatcher eventDispatcher = this.mEventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new l(getId(), this.currentFocusedField));
        }
    }

    private final void q() {
        this.cardForm.setCardValidCallback(new x0() { // from class: com.reactnativestripesdk.q
            @Override // com.stripe.android.view.x0
            public final void a(boolean z11, Set set) {
                v.r(this.f48891a, z11, set);
            }
        });
        CardNumberEditText etCardNumber = this.multilineWidgetBinding.f70728d;
        s.j(etCardNumber, "etCardNumber");
        CvcEditText etCvc = this.multilineWidgetBinding.f70729e;
        s.j(etCvc, "etCvc");
        ExpiryDateEditText etExpiry = this.multilineWidgetBinding.f70730f;
        s.j(etExpiry, "etExpiry");
        PostalCodeEditText postalCode = this.cardFormViewBinding.f70712g;
        s.j(postalCode, "postalCode");
        etCardNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.s(this.f48910a, view, z11);
            }
        });
        etCvc.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.t(this.f48918a, view, z11);
            }
        });
        etExpiry.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.u(this.f48919a, view, z11);
            }
        });
        postalCode.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.reactnativestripesdk.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                v.v(this.f48922a, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(v vVar, boolean z11, Set set) {
        String postalCode;
        String country;
        s.k(set, "<unused var>");
        if (!z11) {
            vVar.cardParams = null;
            vVar.cardAddress = null;
            EventDispatcher eventDispatcher = vVar.mEventDispatcher;
            if (eventDispatcher != null) {
                eventDispatcher.h(new m(vVar.getId(), null, z11, vVar.dangerouslyGetFullCardDetails));
                return;
            }
            return;
        }
        CardParams cardParams = vVar.cardForm.getCardParams();
        if (cardParams != null) {
            Object obj = cardParams.c3().get("card");
            s.i(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            HashMap map = (HashMap) obj;
            Object obj2 = map.get("exp_month");
            s.i(obj2, "null cannot be cast to non-null type kotlin.Int");
            Pair pairA = x.a("expiryMonth", (Integer) obj2);
            Object obj3 = map.get("exp_year");
            s.i(obj3, "null cannot be cast to non-null type kotlin.Int");
            Pair pairA2 = x.a("expiryYear", (Integer) obj3);
            Pair pairA3 = x.a("last4", cardParams.i());
            Pair pairA4 = x.a("brand", i.l(cardParams.getBrand()));
            Address address = cardParams.getAddress();
            String str = "";
            if (address == null || (postalCode = address.getPostalCode()) == null) {
                postalCode = "";
            }
            Pair pairA5 = x.a("postalCode", postalCode);
            Address address2 = cardParams.getAddress();
            if (address2 != null && (country = address2.getCountry()) != null) {
                str = country;
            }
            Map mapO = p013kotlin.collections.v0.o(pairA, pairA2, pairA3, pairA4, pairA5, x.a(PlaceTypes.COUNTRY, str));
            if (vVar.dangerouslyGetFullCardDetails) {
                Object obj4 = map.get(InquiryField.FloatField.TYPE2);
                s.i(obj4, "null cannot be cast to non-null type kotlin.String");
                mapO.put(InquiryField.FloatField.TYPE2, (String) obj4);
                Object obj5 = map.get("cvc");
                s.i(obj5, "null cannot be cast to non-null type kotlin.String");
                mapO.put("cvc", (String) obj5);
            }
            EventDispatcher eventDispatcher2 = vVar.mEventDispatcher;
            if (eventDispatcher2 != null) {
                eventDispatcher2.h(new m(vVar.getId(), mapO, z11, vVar.dangerouslyGetFullCardDetails));
            }
            Address.a aVar = new Address.a();
            Address address3 = cardParams.getAddress();
            Address.a aVarG = aVar.g(address3 != null ? address3.getPostalCode() : null);
            Address address4 = cardParams.getAddress();
            vVar.cardAddress = aVarG.c(address4 != null ? address4.getCountry() : null).a();
            PaymentMethodCreateParams.Card paymentMethodCard = vVar.cardFormViewBinding.f70707b.getPaymentMethodCard();
            if (paymentMethodCard != null) {
                vVar.cardParams = paymentMethodCard;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(v vVar, View view, boolean z11) {
        vVar.currentFocusedField = z11 ? f0.a.CardNumber.toString() : null;
        vVar.m();
    }

    @SuppressLint({"RestrictedApi"})
    private final void setCountry(String countryString) {
        if (countryString != null) {
            this.cardFormViewBinding.f70709d.setSelectedCountryCode(new CountryCode(countryString));
            this.cardFormViewBinding.f70709d.L0(new CountryCode(countryString));
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(v vVar, View view, boolean z11) {
        vVar.currentFocusedField = z11 ? f0.a.Cvc.toString() : null;
        vVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(v vVar, View view, boolean z11) {
        vVar.currentFocusedField = z11 ? f0.a.ExpiryDate.toString() : null;
        vVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(v vVar, View view, boolean z11) {
        vVar.currentFocusedField = z11 ? f0.a.PostalCode.toString() : null;
        vVar.m();
    }

    private final void w() {
        PostalCodeEditText postalCodeEditText = this.cardFormViewBinding.f70712g;
        s0 s0Var = new s0(2);
        s0Var.b(this.cardFormViewBinding.f70712g.getFilters());
        s0Var.a(j());
        postalCodeEditText.setFilters((InputFilter[]) s0Var.d(new InputFilter[s0Var.c()]));
    }

    public final Address getCardAddress() {
        return this.cardAddress;
    }

    public final PaymentMethodCreateParams.Card getCardParams() {
        return this.cardParams;
    }

    public final void n() {
        CardNumberEditText etCardNumber = this.multilineWidgetBinding.f70728d;
        s.j(etCardNumber, "etCardNumber");
        g.c(etCardNumber);
        etCardNumber.clearFocus();
    }

    public final void o() {
        this.multilineWidgetBinding.f70728d.setText("");
        this.multilineWidgetBinding.f70729e.setText("");
        this.multilineWidgetBinding.f70730f.setText("");
        this.cardFormViewBinding.f70712g.setText("");
    }

    public final void p() {
        CardNumberEditText etCardNumber = this.multilineWidgetBinding.f70728d;
        s.j(etCardNumber, "etCardNumber");
        etCardNumber.requestFocus();
        g.e(etCardNumber);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    public final void setAutofocus(boolean value) {
        if (value) {
            CardNumberEditText etCardNumber = this.multilineWidgetBinding.f70728d;
            s.j(etCardNumber, "etCardNumber");
            etCardNumber.requestFocus();
            g.e(etCardNumber);
        }
    }

    public final void setCardAddress(Address address) {
        this.cardAddress = address;
    }

    public final void setCardParams(PaymentMethodCreateParams.Card card) {
        this.cardParams = card;
    }

    @SuppressLint({"RestrictedApi"})
    public final void setCardStyle(ReadableMap value) {
        s.k(value, "value");
        String strI = i.i(value, "backgroundColor", null);
        String strI2 = i.i(value, "textColor", null);
        Integer numF = i.f(value, "borderWidth");
        String strI3 = i.i(value, "borderColor", null);
        Integer numF2 = i.f(value, Snapshot.BORDER_RADIUS);
        int iIntValue = numF2 != null ? numF2.intValue() : 0;
        Integer numF3 = i.f(value, OrcaFlavourKeys.FONT_SIZE);
        String strJ = i.j(value, "fontFamily", null, 4, null);
        String strI4 = i.i(value, "placeholderColor", null);
        String strI5 = i.i(value, "textErrorColor", null);
        String strI6 = i.i(value, "cursorColor", null);
        Set<StripeEditText> setI = d1.i(this.cardFormViewBinding.f70707b.getCardNumberEditText(), this.cardFormViewBinding.f70707b.getCvcEditText(), this.cardFormViewBinding.f70707b.getExpiryDateEditText(), this.cardFormViewBinding.f70712g);
        m mVar = this.multilineWidgetBinding;
        Set setI2 = d1.i(mVar.f70735k, mVar.f70733i, mVar.f70734j, this.cardFormViewBinding.f70713h);
        if (strI2 != null) {
            Iterator it = setI.iterator();
            while (it.hasNext()) {
                ((StripeEditText) it.next()).setTextColor(Color.parseColor(strI2));
            }
            this.cardFormViewBinding.f70709d.getCountryAutocomplete().setTextColor(Color.parseColor(strI2));
        }
        if (strI5 != null) {
            Iterator it2 = setI.iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).setErrorColor(Color.parseColor(strI5));
                this.cardFormViewBinding.f70712g.setErrorColor(Color.parseColor(strI5));
            }
        }
        if (strI4 != null) {
            for (Object obj : setI2) {
                s.j(obj, "next(...)");
                ((TextInputLayout) obj).setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(strI4)));
            }
        }
        if (numF3 != null) {
            int iIntValue2 = numF3.intValue();
            Iterator it3 = setI.iterator();
            while (it3.hasNext()) {
                ((StripeEditText) it3.next()).setTextSize(iIntValue2);
            }
        }
        if (strJ != null) {
            if (strJ.length() <= 0) {
                strJ = null;
            }
            AssetManager assets = getContext().getAssets();
            s.j(assets, "getAssets(...)");
            Typeface typefaceA = com.facebook.react.views.text.k.a(null, -1, -1, strJ, assets);
            Iterator it4 = setI.iterator();
            while (it4.hasNext()) {
                ((StripeEditText) it4.next()).setTypeface(typefaceA);
            }
            for (Object obj2 : setI2) {
                s.j(obj2, "next(...)");
                ((TextInputLayout) obj2).setTypeface(typefaceA);
            }
            this.cardFormViewBinding.f70709d.setTypeface(typefaceA);
            this.cardFormViewBinding.f70709d.getCountryAutocomplete().setTypeface(typefaceA);
            this.cardFormViewBinding.f70711f.setTypeface(typefaceA);
        }
        if (strI6 != null && Build.VERSION.SDK_INT >= 29) {
            int color = Color.parseColor(strI6);
            for (StripeEditText stripeEditText : setI) {
                Drawable textCursorDrawable = stripeEditText.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setTint(color);
                }
                Drawable textSelectHandle = stripeEditText.getTextSelectHandle();
                if (textSelectHandle != null) {
                    textSelectHandle.setTint(color);
                }
                Drawable textSelectHandleLeft = stripeEditText.getTextSelectHandleLeft();
                if (textSelectHandleLeft != null) {
                    textSelectHandleLeft.setTint(color);
                }
                Drawable textSelectHandleRight = stripeEditText.getTextSelectHandleRight();
                if (textSelectHandleRight != null) {
                    textSelectHandleRight.setTint(color);
                }
                stripeEditText.setHighlightColor(color);
            }
        }
        MaterialCardView materialCardView = this.cardFormViewBinding.f70708c;
        st.g gVar = new st.g(new st.k().v().q(0, w.g(iIntValue)).m());
        gVar.m0(BitmapDescriptorFactory.HUE_RED);
        gVar.l0(ColorStateList.valueOf(Color.parseColor("#000000")));
        gVar.b0(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
        if (numF != null) {
            gVar.m0(w.g(numF.intValue()));
        }
        if (strI3 != null) {
            gVar.l0(ColorStateList.valueOf(Color.parseColor(strI3)));
        }
        if (strI != null) {
            gVar.b0(ColorStateList.valueOf(Color.parseColor(strI)));
        }
        materialCardView.setBackground(gVar);
    }

    public final void setDangerouslyGetFullCardDetails(boolean isEnabled) {
        this.dangerouslyGetFullCardDetails = isEnabled;
    }

    public final void setDefaultValues(ReadableMap defaults) {
        s.k(defaults, "defaults");
        setCountry(defaults.getString("countryCode"));
    }

    public final void setDisabled(boolean isDisabled) {
        this.cardForm.setEnabled(!isDisabled);
    }

    public final void setPlaceHolders(ReadableMap value) {
        s.k(value, "value");
        String strI = i.i(value, InquiryField.FloatField.TYPE2, null);
        String strI2 = i.i(value, "expiration", null);
        String strI3 = i.i(value, "cvc", null);
        String strI4 = i.i(value, "postalCode", null);
        if (strI != null) {
            this.multilineWidgetBinding.f70733i.setHint(strI);
        }
        if (strI2 != null) {
            this.multilineWidgetBinding.f70735k.setHint(strI2);
        }
        if (strI3 != null) {
            this.multilineWidgetBinding.f70734j.setHint(strI3);
        }
        if (strI4 != null) {
            this.cardFormViewBinding.f70713h.setHint(strI4);
        }
    }

    public final void setPostalCodeEnabled(boolean value) {
        int i11 = value ? 0 : 8;
        this.cardFormViewBinding.f70707b.setPostalCodeRequired(false);
        this.cardFormViewBinding.f70713h.setVisibility(i11);
    }

    public final void setPreferredNetworks(ArrayList<Integer> preferredNetworks) {
        this.cardForm.setPreferredNetworks(i.O(preferredNetworks));
    }
}
