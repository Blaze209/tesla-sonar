package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.LocaleListCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.properties.ObservableProperty;
import t30.CountryCode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002UVB'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0001¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001fH\u0001¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u000eH\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010*J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010*J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00104R \u0010<\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010*\u001a\u0004\b:\u0010-R5\u0010B\u001a\u0004\u0018\u00010\n2\b\u0010=\u001a\u0004\u0018\u00010\n8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b/\u0010>\u0012\u0004\bA\u0010*\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u0010R4\u0010K\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000e0C8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b,\u0010E\u0012\u0004\bJ\u0010*\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR.\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010PR\u0016\u0010T\u001a\u0004\u0018\u00010D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lt30/b;", "getSelectedCountryCode", "()Lt30/b;", "countryCode", "Ljn0/h0;", "setSelectedCountryCode", "(Lt30/b;)V", "", "enabled", "setEnabled", "(Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/stripe/android/view/CountryTextInputLayout$d;", "J0", "(Lcom/stripe/android/view/CountryTextInputLayout$d;)V", "", "", "allowedCountryCodes", "setAllowedCountryCodes$payments_core_release", "(Ljava/util/Set;)V", "setAllowedCountryCodes", "setCountrySelected$payments_core_release", "setCountrySelected", "(Ljava/lang/String;)V", "L0", "M0", "N0", "()V", "Landroid/widget/AutoCompleteTextView;", "I0", "()Landroid/widget/AutoCompleteTextView;", "K0", "H0", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "E0", "I", "countryAutoCompleteStyleRes", "F0", "itemLayoutRes", "G0", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete", "getCountryAutocomplete$annotations", "countryAutocomplete", "<set-?>", "Lkotlin/properties/d;", "getSelectedCountryCode$payments_core_release", "setSelectedCountryCode$payments_core_release", "getSelectedCountryCode$payments_core_release$annotations", "selectedCountryCode", "Lkotlin/Function1;", "Lt30/a;", "Lwn0/l;", "getCountryChangeCallback$payments_core_release", "()Lwn0/l;", "setCountryChangeCallback$payments_core_release", "(Lwn0/l;)V", "getCountryChangeCallback$payments_core_release$annotations", "countryChangeCallback", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "countryCodeChangeCallback", "Lcom/stripe/android/view/c1;", "Lcom/stripe/android/view/c1;", "countryAdapter", "getSelectedCountry$payments_core_release", "()Lt30/a;", "selectedCountry", "c", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountryTextInputLayout extends TextInputLayout {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private int countryAutoCompleteStyleRes;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private int itemLayoutRes;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final AutoCompleteTextView countryAutocomplete;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final p013kotlin.properties.d selectedCountryCode;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private /* synthetic */ wn0.l<? super t30.a, jn0.h0> countryChangeCallback;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private /* synthetic */ wn0.l<? super CountryCode, jn0.h0> countryCodeChangeCallback;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private c1 countryAdapter;
    static final /* synthetic */ co0.m<Object>[] M0 = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};
    private static final c L0 = new c(null);
    public static final int N0 = 8;
    private static final int O0 = f30.b0.f63918p;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewGroup;", "it", "Landroid/widget/TextView;", "a", "(Landroid/view/ViewGroup;)Landroid/widget/TextView;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<ViewGroup, TextView> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f54551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f54552d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, CountryTextInputLayout countryTextInputLayout) {
            super(1);
            this.f54551c = context;
            this.f54552d = countryTextInputLayout;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke(ViewGroup it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            View viewInflate = LayoutInflater.from(this.f54551c).inflate(this.f54552d.itemLayoutRes, it, false);
            p013kotlin.jvm.internal.s.i(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) viewInflate;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/a;", PlaceTypes.COUNTRY, "Ljn0/h0;", "a", "(Lt30/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<t30.a, jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f54554d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f54554d = str;
        }

        public final void a(t30.a aVar) {
            CountryTextInputLayout.this.setSelectedCountryCode$payments_core_release(aVar != null ? aVar.b() : null);
            if (aVar != null) {
                CountryTextInputLayout.this.H0();
            } else {
                CountryTextInputLayout.this.setError(this.f54554d);
                CountryTextInputLayout.this.setErrorEnabled(true);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(t30.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$c;", "", "<init>", "()V", "", "INVALID_COUNTRY_AUTO_COMPLETE_STYLE", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.CountryTextInputLayout$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$d;", "Landroid/os/Parcelable;", "Lt30/b;", "countryCode", "superState", "<init>", "(Lt30/b;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lt30/b;", "()Lt30/b;", "b", "Landroid/os/Parcelable;", "()Landroid/os/Parcelable;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedCountryState implements Parcelable {
        public static final Parcelable.Creator<SelectedCountryState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CountryCode countryCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Parcelable superState;

        /* JADX INFO: renamed from: com.stripe.android.view.CountryTextInputLayout$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectedCountryState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelectedCountryState createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SelectedCountryState((CountryCode) parcel.readParcelable(SelectedCountryState.class.getClassLoader()), parcel.readParcelable(SelectedCountryState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelectedCountryState[] newArray(int i11) {
                return new SelectedCountryState[i11];
            }
        }

        public SelectedCountryState(CountryCode countryCode, Parcelable parcelable) {
            p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.superState = parcelable;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedCountryState)) {
                return false;
            }
            SelectedCountryState selectedCountryState = (SelectedCountryState) other;
            return p013kotlin.jvm.internal.s.f(this.countryCode, selectedCountryState.countryCode) && p013kotlin.jvm.internal.s.f(this.superState, selectedCountryState.superState);
        }

        public int hashCode() {
            int iHashCode = this.countryCode.hashCode() * 31;
            Parcelable parcelable = this.superState;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.countryCode + ", superState=" + this.superState + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.countryCode, flags);
            parcel.writeParcelable(this.superState, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/a;", "it", "Ljn0/h0;", "a", "(Lt30/a;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<t30.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f54557c = new e();

        e() {
            super(1);
        }

        public final void a(t30.a it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(t30.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt30/b;", "it", "Ljn0/h0;", "a", "(Lt30/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<CountryCode, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f54558c = new f();

        f() {
            super(1);
        }

        public final void a(CountryCode it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(CountryCode countryCode) {
            a(countryCode);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/view/CountryTextInputLayout$g", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Ljn0/h0;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f54560b;

        public g(boolean z11) {
            this.f54560b = z11;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            CountryTextInputLayout.this.getCountryAutocomplete().setEnabled(this.f54560b);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/view/CountryTextInputLayout$h", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends ObservableProperty<CountryCode> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountryTextInputLayout f54561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, CountryTextInputLayout countryTextInputLayout) {
            super(obj);
            this.f54561a = countryTextInputLayout;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(co0.m<?> property, CountryCode oldValue, CountryCode newValue) {
            p013kotlin.jvm.internal.s.k(property, "property");
            CountryCode countryCode = newValue;
            if (countryCode != null) {
                this.f54561a.getCountryCodeChangeCallback().invoke(countryCode);
                t30.a aVarD = t30.d.f112276a.d(countryCode, this.f54561a.getLocale());
                if (aVarD != null) {
                    this.f54561a.getCountryChangeCallback$payments_core_release().invoke(aVarD);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i11, long j11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.M0(this$0.countryAdapter.getItem(i11).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(CountryTextInputLayout this$0, View view, boolean z11) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (z11) {
            this$0.countryAutocomplete.showDropDown();
            return;
        }
        String string = this$0.countryAutocomplete.getText().toString();
        t30.d dVar = t30.d.f112276a;
        CountryCode countryCodeE = dVar.e(string, this$0.getLocale());
        if (countryCodeE != null) {
            this$0.L0(countryCodeE);
            return;
        }
        CountryCode.Companion companion = CountryCode.INSTANCE;
        if (dVar.d(companion.a(string), this$0.getLocale()) != null) {
            this$0.L0(companion.a(string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0() {
        setError(null);
        setErrorEnabled(false);
    }

    private final AutoCompleteTextView I0() {
        return this.countryAutoCompleteStyleRes == 0 ? new AutoCompleteTextView(getContext(), null, i.a.f73740q) : new AutoCompleteTextView(getContext(), null, 0, this.countryAutoCompleteStyleRes);
    }

    private final void K0() {
        t30.a aVarB = this.countryAdapter.b();
        this.countryAutocomplete.setText(aVarB.getName());
        setSelectedCountryCode$payments_core_release(aVarB.b());
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    @jn0.e
    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale localeC = LocaleListCompat.d().c(0);
        p013kotlin.jvm.internal.s.h(localeC);
        return localeC;
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    public final void J0(SelectedCountryState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        super.onRestoreInstanceState(state.getSuperState());
        CountryCode countryCode = state.getCountryCode();
        M0(countryCode);
        L0(countryCode);
        requestLayout();
    }

    public final void L0(CountryCode countryCode) {
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        t30.d dVar = t30.d.f112276a;
        t30.a aVarD = dVar.d(countryCode, getLocale());
        if (aVarD != null) {
            M0(countryCode);
        } else {
            aVarD = dVar.d(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        this.countryAutocomplete.setText(aVarD != null ? aVarD.getName() : null);
    }

    public final void M0(CountryCode countryCode) {
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        H0();
        if (p013kotlin.jvm.internal.s.f(getSelectedCountryCode$payments_core_release(), countryCode)) {
            return;
        }
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void N0() {
        this.countryAutocomplete.performValidation();
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    public final wn0.l<t30.a, jn0.h0> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final wn0.l<CountryCode, jn0.h0> getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final t30.a getSelectedCountry$payments_core_release() {
        CountryCode selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return t30.d.f112276a.d(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    public final CountryCode getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final CountryCode getSelectedCountryCode$payments_core_release() {
        return (CountryCode) this.selectedCountryCode.getValue(this, M0[0]);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof SelectedCountryState) {
            J0((SelectedCountryState) state);
        } else {
            super.onRestoreInstanceState(state);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        t30.a selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        return selectedCountry$payments_core_release != null ? new SelectedCountryState(selectedCountry$payments_core_release.b(), super.onSaveInstanceState()) : super.onSaveInstanceState();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
        if (this.countryAdapter.f(allowedCountryCodes)) {
            K0();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(wn0.l<? super t30.a, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.countryChangeCallback = lVar;
    }

    public final void setCountryCodeChangeCallback(wn0.l<? super CountryCode, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.countryCodeChangeCallback = lVar;
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        L0(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        addOnLayoutChangeListener(new g(enabled));
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void setSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        this.selectedCountryCode.setValue(this, M0[0], countryCode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @jn0.e
    public final void setCountrySelected$payments_core_release(String countryCode) {
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        L0(CountryCode.INSTANCE.a(countryCode));
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? zs.c.A0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        int i12 = O0;
        this.itemLayoutRes = i12;
        p013kotlin.properties.a aVar = p013kotlin.properties.a.f86546a;
        this.selectedCountryCode = new h(null, this);
        this.countryChangeCallback = e.f54557c;
        this.countryCodeChangeCallback = f.f54558c;
        int[] StripeCountryAutoCompleteTextInputLayout = f30.f0.f64008o;
        p013kotlin.jvm.internal.s.j(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        this.countryAutoCompleteStyleRes = typedArrayObtainStyledAttributes.getResourceId(f30.f0.f64009p, 0);
        this.itemLayoutRes = typedArrayObtainStyledAttributes.getResourceId(f30.f0.f64010q, i12);
        typedArrayObtainStyledAttributes.recycle();
        AutoCompleteTextView autoCompleteTextViewI0 = I0();
        this.countryAutocomplete = autoCompleteTextViewI0;
        addView(autoCompleteTextViewI0, new LinearLayout.LayoutParams(-1, -2));
        this.countryAdapter = new c1(context, t30.d.f112276a.f(getLocale()), this.itemLayoutRes, new a(context, this));
        autoCompleteTextViewI0.setThreshold(0);
        autoCompleteTextViewI0.setAdapter(this.countryAdapter);
        autoCompleteTextViewI0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.e1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i13, long j11) {
                CountryTextInputLayout.C0(this.f54890a, adapterView, view, i13, j11);
            }
        });
        autoCompleteTextViewI0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.f1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CountryTextInputLayout.D0(this.f54897a, view, z11);
            }
        });
        setSelectedCountryCode$payments_core_release(this.countryAdapter.b().b());
        K0();
        String string = getResources().getString(f30.d0.f63948h);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        autoCompleteTextViewI0.setValidator(new d1(this.countryAdapter, new b(string)));
    }
}
