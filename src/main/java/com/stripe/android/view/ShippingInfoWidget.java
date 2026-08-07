package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.model.Address;
import com.stripe.android.model.ShippingInformation;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t30.CountryCode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R6\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R6\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010GR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010GR\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010GR\u0014\u0010K\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010GR\u0014\u0010L\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010GR\u0014\u0010M\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010GR\u0014\u0010N\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010GR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010PR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010PR\u0014\u0010S\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010PR\u0014\u0010T\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR\u0014\u0010U\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010PR\u0014\u0010W\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010PR\u0014\u0010Y\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010PR\u0014\u0010\\\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010%\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b]\u0010[¨\u0006^"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "Ljn0/h0;", "g", "(Lcom/stripe/android/model/b;)V", "Lcom/stripe/android/view/ShippingInfoWidget$a;", "field", "", "f", "(Lcom/stripe/android/view/ShippingInfoWidget$a;)Z", "e", DateTokenConverter.CONVERTER_KEY, "c", "()V", "n", "l", "b", "Lt30/a;", PlaceTypes.COUNTRY, "o", "(Lt30/a;)V", "p", "m", "j", IntegerTokenConverter.CONVERTER_KEY, "k", "Lcom/stripe/android/model/f1;", "shippingInformation", "h", "(Lcom/stripe/android/model/f1;)V", "", "", "allowedCountryCodes", "setAllowedCountryCodes", "(Ljava/util/Set;)V", "q", "()Z", "Lh40/f;", "a", "Lkotlin/Lazy;", "getViewBinding", "()Lh40/f;", "viewBinding", "Lcom/stripe/android/view/n2;", "Lcom/stripe/android/view/n2;", "postalCodeValidator", "", "value", "Ljava/util/List;", "getOptionalFields", "()Ljava/util/List;", "setOptionalFields", "(Ljava/util/List;)V", "optionalFields", "getHiddenFields", "setHiddenFields", "hiddenFields", "Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryAutoCompleteTextView", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "addressLine1TextInputLayout", "addressLine2TextInputLayout", "cityTextInputLayout", "nameTextInputLayout", "postalCodeTextInputLayout", "stateTextInputLayout", "phoneNumberTextInputLayout", "Lcom/stripe/android/view/StripeEditText;", "Lcom/stripe/android/view/StripeEditText;", "addressEditText", "addressEditText2", "cityEditText", "nameEditText", "postalCodeEditText", "r", "stateEditText", "s", "phoneNumberEditText", "getRawShippingInformation", "()Lcom/stripe/android/model/f1;", "rawShippingInformation", "getShippingInformation", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ShippingInfoWidget extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n2 postalCodeValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<? extends a> optionalFields;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<? extends a> hiddenFields;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CountryTextInputLayout countryAutoCompleteTextView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout addressLine1TextInputLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout addressLine2TextInputLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout cityTextInputLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout nameTextInputLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout postalCodeTextInputLayout;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout stateTextInputLayout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout phoneNumberTextInputLayout;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText addressEditText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText addressEditText2;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText cityEditText;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText nameEditText;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText postalCodeEditText;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText stateEditText;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText phoneNumberEditText;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget$a;", "", "<init>", "(Ljava/lang/String;I)V", "Line1", "Line2", "City", "PostalCode", "State", "Phone", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        Line1,
        Line2,
        City,
        PostalCode,
        State,
        Phone;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<t30.a, jn0.h0> {
        b(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        public final void a(t30.a p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((ShippingInfoWidget) this.receiver).o(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(t30.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh40/f;", "b", "()Lh40/f;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<h40.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f54710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShippingInfoWidget f54711d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ShippingInfoWidget shippingInfoWidget) {
            super(0);
            this.f54710c = context;
            this.f54711d = shippingInfoWidget;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h40.f invoke() {
            h40.f fVarB = h40.f.b(LayoutInflater.from(this.f54710c), this.f54711d);
            p013kotlin.jvm.internal.s.j(fVarB, "inflate(...)");
            return fVarB;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void b() {
        if (d(a.Line1)) {
            this.addressLine1TextInputLayout.setVisibility(8);
        }
        if (d(a.Line2)) {
            this.addressLine2TextInputLayout.setVisibility(8);
        }
        if (d(a.State)) {
            this.stateTextInputLayout.setVisibility(8);
        }
        if (d(a.City)) {
            this.cityTextInputLayout.setVisibility(8);
        }
        if (d(a.PostalCode)) {
            this.postalCodeTextInputLayout.setVisibility(8);
        }
        if (d(a.Phone)) {
            this.phoneNumberTextInputLayout.setVisibility(8);
        }
    }

    private final void c() {
        this.countryAutoCompleteTextView.setCountryChangeCallback$payments_core_release(new b(this));
        this.phoneNumberEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        n();
        l();
        t30.a selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    private final boolean d(a field) {
        return this.hiddenFields.contains(field);
    }

    private final boolean e(a field) {
        return this.optionalFields.contains(field);
    }

    private final boolean f(a field) {
        return (e(field) || d(field)) ? false : true;
    }

    private final void g(Address address) {
        this.cityEditText.setText(address.getCity());
        String country = address.getCountry();
        if (country != null && country.length() > 0) {
            this.countryAutoCompleteTextView.setCountrySelected$payments_core_release(country);
        }
        this.addressEditText.setText(address.getLine1());
        this.addressEditText2.setText(address.getLine2());
        this.postalCodeEditText.setText(address.getPostalCode());
        this.stateEditText.setText(address.getState());
    }

    private final ShippingInformation getRawShippingInformation() {
        Address.a aVarB = new Address.a().b(this.cityEditText.getFieldText$payments_core_release());
        t30.a selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        return new ShippingInformation(aVarB.d(selectedCountry$payments_core_release != null ? selectedCountry$payments_core_release.b() : null).e(this.addressEditText.getFieldText$payments_core_release()).f(this.addressEditText2.getFieldText$payments_core_release()).g(this.postalCodeEditText.getFieldText$payments_core_release()).h(this.stateEditText.getFieldText$payments_core_release()).a(), this.nameEditText.getFieldText$payments_core_release(), this.phoneNumberEditText.getFieldText$payments_core_release());
    }

    private final h40.f getViewBinding() {
        return (h40.f) this.viewBinding.getValue();
    }

    private final void i() {
        this.addressLine1TextInputLayout.setHint(e(a.Line1) ? getResources().getString(f30.d0.f63956l) : getResources().getString(f90.h.f64613a));
        this.addressLine2TextInputLayout.setHint(getResources().getString(f30.d0.f63958m));
        this.postalCodeTextInputLayout.setHint(e(a.PostalCode) ? getResources().getString(f30.d0.f63966q) : getResources().getString(o30.e.f96369g));
        this.stateTextInputLayout.setHint(e(a.State) ? getResources().getString(f30.d0.f63972t) : getResources().getString(o30.e.f96370h));
        this.postalCodeEditText.setErrorMessage(getResources().getString(f30.d0.C));
        this.stateEditText.setErrorMessage(getResources().getString(f30.d0.E));
    }

    private final void j() {
        this.addressLine1TextInputLayout.setHint(e(a.Line1) ? getResources().getString(f30.d0.f63952j) : getResources().getString(o30.e.f96363a));
        this.addressLine2TextInputLayout.setHint(getResources().getString(f30.d0.f63954k));
        this.postalCodeTextInputLayout.setHint(e(a.PostalCode) ? getResources().getString(f30.d0.f63970s) : getResources().getString(f30.d0.f63968r));
        this.stateTextInputLayout.setHint(e(a.State) ? getResources().getString(f30.d0.f63962o) : getResources().getString(o30.e.f96366d));
        this.postalCodeEditText.setErrorMessage(getResources().getString(f30.d0.D));
        this.stateEditText.setErrorMessage(getResources().getString(f30.d0.f63950i));
    }

    private final void k() {
        this.addressLine1TextInputLayout.setHint(e(a.Line1) ? getResources().getString(f30.d0.f63952j) : getResources().getString(o30.e.f96363a));
        this.addressLine2TextInputLayout.setHint(getResources().getString(f30.d0.f63954k));
        this.postalCodeTextInputLayout.setHint(e(a.PostalCode) ? getResources().getString(f30.d0.f63984z) : getResources().getString(f30.d0.f63982y));
        this.stateTextInputLayout.setHint(e(a.State) ? getResources().getString(f30.d0.f63976v) : getResources().getString(f30.d0.f63974u));
        this.postalCodeEditText.setErrorMessage(getResources().getString(f90.h.f64635w));
        this.stateEditText.setErrorMessage(getResources().getString(f30.d0.F));
    }

    private final void l() {
        this.nameTextInputLayout.setHint(getResources().getString(o30.e.f96367e));
        this.cityTextInputLayout.setHint(e(a.City) ? getResources().getString(f30.d0.f63960n) : getResources().getString(o30.e.f96364b));
        this.phoneNumberTextInputLayout.setHint(e(a.Phone) ? getResources().getString(f30.d0.f63964p) : getResources().getString(o30.e.f96368f));
        b();
    }

    private final void m() {
        this.addressLine1TextInputLayout.setHint(e(a.Line1) ? getResources().getString(f30.d0.f63956l) : getResources().getString(f90.h.f64613a));
        this.addressLine2TextInputLayout.setHint(getResources().getString(f30.d0.f63958m));
        this.postalCodeTextInputLayout.setHint(e(a.PostalCode) ? getResources().getString(f30.d0.f63980x) : getResources().getString(o30.e.f96372j));
        this.stateTextInputLayout.setHint(e(a.State) ? getResources().getString(f30.d0.f63978w) : getResources().getString(o30.e.f96371i));
        this.postalCodeEditText.setErrorMessage(getResources().getString(f90.h.f64634v));
        this.stateEditText.setErrorMessage(getResources().getString(f30.d0.H));
    }

    private final void n() {
        this.addressEditText.setErrorMessageListener(new m1(this.addressLine1TextInputLayout));
        this.cityEditText.setErrorMessageListener(new m1(this.cityTextInputLayout));
        this.nameEditText.setErrorMessageListener(new m1(this.nameTextInputLayout));
        this.postalCodeEditText.setErrorMessageListener(new m1(this.postalCodeTextInputLayout));
        this.stateEditText.setErrorMessageListener(new m1(this.stateTextInputLayout));
        this.phoneNumberEditText.setErrorMessageListener(new m1(this.phoneNumberTextInputLayout));
        this.addressEditText.setErrorMessage(getResources().getString(f30.d0.G));
        this.cityEditText.setErrorMessage(getResources().getString(f30.d0.f63946g));
        this.nameEditText.setErrorMessage(getResources().getString(f30.d0.A));
        this.phoneNumberEditText.setErrorMessage(getResources().getString(f30.d0.B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(t30.a country) {
        String value = country.b().getValue();
        if (p013kotlin.jvm.internal.s.f(value, Locale.US.getCountry())) {
            m();
        } else if (p013kotlin.jvm.internal.s.f(value, Locale.UK.getCountry())) {
            j();
        } else if (p013kotlin.jvm.internal.s.f(value, Locale.CANADA.getCountry())) {
            i();
        } else {
            k();
        }
        p(country);
        this.postalCodeTextInputLayout.setVisibility((!t30.d.f112276a.b(country.b()) || d(a.PostalCode)) ? 8 : 0);
    }

    private final void p(t30.a country) {
        this.postalCodeEditText.setFilters(p013kotlin.jvm.internal.s.f(country.b().getValue(), Locale.CANADA.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
    }

    public final List<a> getHiddenFields() {
        return this.hiddenFields;
    }

    public final List<a> getOptionalFields() {
        return this.optionalFields;
    }

    public final ShippingInformation getShippingInformation() {
        if (q()) {
            return getRawShippingInformation();
        }
        return null;
    }

    public final void h(ShippingInformation shippingInformation) {
        if (shippingInformation == null) {
            return;
        }
        Address address = shippingInformation.getAddress();
        if (address != null) {
            g(address);
        }
        this.nameEditText.setText(shippingInformation.getName());
        this.phoneNumberEditText.setText(shippingInformation.getPhone());
    }

    public final boolean q() {
        String string;
        Editable text;
        String string2;
        Editable text2;
        String string3;
        Editable text3;
        String string4;
        Editable text4;
        String string5;
        Editable text5;
        String string6;
        CountryCode countryCodeB;
        Editable text6 = this.addressEditText.getText();
        if (text6 != null && (string = text6.toString()) != null && (text = this.nameEditText.getText()) != null && (string2 = text.toString()) != null && (text2 = this.cityEditText.getText()) != null && (string3 = text2.toString()) != null && (text3 = this.stateEditText.getText()) != null && (string4 = text3.toString()) != null && (text4 = this.postalCodeEditText.getText()) != null && (string5 = text4.toString()) != null && (text5 = this.phoneNumberEditText.getText()) != null && (string6 = text5.toString()) != null) {
            this.countryAutoCompleteTextView.N0();
            t30.a selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
            boolean zB = this.postalCodeValidator.b(string5, (selectedCountry$payments_core_release == null || (countryCodeB = selectedCountry$payments_core_release.b()) == null) ? null : countryCodeB.getValue(), this.optionalFields, this.hiddenFields);
            this.postalCodeEditText.setShouldShowError(!zB);
            boolean z11 = p013kotlin.text.t.y0(string) && f(a.Line1);
            this.addressEditText.setShouldShowError(z11);
            boolean z12 = p013kotlin.text.t.y0(string3) && f(a.City);
            this.cityEditText.setShouldShowError(z12);
            boolean zY0 = p013kotlin.text.t.y0(string2);
            this.nameEditText.setShouldShowError(zY0);
            boolean z13 = p013kotlin.text.t.y0(string4) && f(a.State);
            this.stateEditText.setShouldShowError(z13);
            boolean z14 = p013kotlin.text.t.y0(string6) && f(a.Phone);
            this.phoneNumberEditText.setShouldShowError(z14);
            if (zB && !z11 && !z12 && !z13 && !zY0 && !z14 && selectedCountry$payments_core_release != null) {
                return true;
            }
        }
        return false;
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
        this.countryAutoCompleteTextView.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends a> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.hiddenFields = value;
        l();
        t30.a selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends a> value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.optionalFields = value;
        l();
        t30.a selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            o(selectedCountry$payments_core_release);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.viewBinding = jn0.m.b(new c(context, this));
        this.postalCodeValidator = new n2();
        this.optionalFields = p013kotlin.collections.v.m();
        this.hiddenFields = p013kotlin.collections.v.m();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().f70672b;
        p013kotlin.jvm.internal.s.j(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.countryAutoCompleteTextView = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().f70680j;
        p013kotlin.jvm.internal.s.j(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.addressLine1TextInputLayout = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().f70681k;
        p013kotlin.jvm.internal.s.j(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.addressLine2TextInputLayout = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().f70682l;
        p013kotlin.jvm.internal.s.j(tlCityAaw, "tlCityAaw");
        this.cityTextInputLayout = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().f70683m;
        p013kotlin.jvm.internal.s.j(tlNameAaw, "tlNameAaw");
        this.nameTextInputLayout = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().f70685o;
        p013kotlin.jvm.internal.s.j(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.postalCodeTextInputLayout = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().f70686p;
        p013kotlin.jvm.internal.s.j(tlStateAaw, "tlStateAaw");
        this.stateTextInputLayout = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().f70684n;
        p013kotlin.jvm.internal.s.j(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.phoneNumberTextInputLayout = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().f70673c;
        p013kotlin.jvm.internal.s.j(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.addressEditText = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().f70674d;
        p013kotlin.jvm.internal.s.j(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.addressEditText2 = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().f70675e;
        p013kotlin.jvm.internal.s.j(etCityAaw, "etCityAaw");
        this.cityEditText = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().f70676f;
        p013kotlin.jvm.internal.s.j(etNameAaw, "etNameAaw");
        this.nameEditText = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().f70678h;
        p013kotlin.jvm.internal.s.j(etPostalCodeAaw, "etPostalCodeAaw");
        this.postalCodeEditText = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().f70679i;
        p013kotlin.jvm.internal.s.j(etStateAaw, "etStateAaw");
        this.stateEditText = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().f70677g;
        p013kotlin.jvm.internal.s.j(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.phoneNumberEditText = etPhoneNumberAaw;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            etNameAaw.setAutofillHints(new String[]{"name"});
            tlAddressLine1Aaw.setAutofillHints(new String[]{"postalAddress"});
            etPostalCodeAaw.setAutofillHints(new String[]{"postalCode"});
            etPhoneNumberAaw.setAutofillHints(new String[]{"phone"});
        }
        c();
    }
}
