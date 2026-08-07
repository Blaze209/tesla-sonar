package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.BlikPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.CashAppPayPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.EPSPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.IdealPaymentMethod;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.v0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0012)<>@ACEFHLNPRTVXZ\\Bç\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020-HÖ\u0001¢\u0006\u0004\b4\u0010/J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-HÖ\u0001¢\u0006\u0004\b9\u0010:R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010;R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b@\u0010;R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010;R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lcom/stripe/android/model/v0;", "Lt30/f;", "", "id", "", "created", "", "liveMode", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lcom/stripe/android/model/v0$p;", "type", "Lcom/stripe/android/model/v0$e;", "billingDetails", "customerId", "Lcom/stripe/android/model/v0$g;", "card", "Lcom/stripe/android/model/v0$h;", "cardPresent", "Lcom/stripe/android/model/v0$k;", "fpx", "Lcom/stripe/android/model/v0$l;", IdealPaymentMethod.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/v0$n;", "sepaDebit", "Lcom/stripe/android/model/v0$c;", "auBecsDebit", "Lcom/stripe/android/model/v0$d;", "bacsDebit", "Lcom/stripe/android/model/v0$o;", "sofort", "Lcom/stripe/android/model/v0$s;", "upi", "Lcom/stripe/android/model/v0$m;", "netbanking", "Lcom/stripe/android/model/v0$r;", "usBankAccount", "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/v0$p;Lcom/stripe/android/model/v0$e;Ljava/lang/String;Lcom/stripe/android/model/v0$g;Lcom/stripe/android/model/v0$h;Lcom/stripe/android/model/v0$k;Lcom/stripe/android/model/v0$l;Lcom/stripe/android/model/v0$n;Lcom/stripe/android/model/v0$c;Lcom/stripe/android/model/v0$d;Lcom/stripe/android/model/v0$o;Lcom/stripe/android/model/v0$s;Lcom/stripe/android/model/v0$m;Lcom/stripe/android/model/v0$r;Lcom/stripe/android/model/v0$b;)V", "a", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "b", "Ljava/lang/Long;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/stripe/android/model/v0$p;", "f", "Lcom/stripe/android/model/v0$e;", "g", "h", "Lcom/stripe/android/model/v0$g;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/v0$h;", "j", "Lcom/stripe/android/model/v0$k;", "k", "Lcom/stripe/android/model/v0$l;", "l", "Lcom/stripe/android/model/v0$n;", "m", "Lcom/stripe/android/model/v0$c;", "n", "Lcom/stripe/android/model/v0$d;", "o", "Lcom/stripe/android/model/v0$o;", "p", "Lcom/stripe/android/model/v0$s;", "q", "Lcom/stripe/android/model/v0$m;", "r", "Lcom/stripe/android/model/v0$r;", "s", "Lcom/stripe/android/model/v0$b;", "t", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethod implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Long created;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean liveMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final String code;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final p type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final BillingDetails billingDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final String customerId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    public final Card card;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    public final CardPresent cardPresent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final Fpx fpx;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    public final Ideal ideal;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public final SepaDebit sepaDebit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    public final AuBecsDebit auBecsDebit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final BacsDebit bacsDebit;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public final Sofort sofort;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    public final Upi upi;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    public final Netbanking netbanking;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    public final USBankAccount usBankAccount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    public final b allowRedisplay;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f51534u = 8;
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new j();

    /* JADX INFO: renamed from: com.stripe.android.model.v0$b */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/v0$b;", "", "Lt30/f;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue$payments_core_release", "()Ljava/lang/String;", "UNSPECIFIED", "LIMITED", "ALWAYS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b implements t30.f {
        UNSPECIFIED("unspecified"),
        LIMITED("limited"),
        ALWAYS(PermissionsResponse.SCOPE_ALWAYS);

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: com.stripe.android.model.v0$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        b(String str) {
            this.value = str;
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: getValue$payments_core_release, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/v0$c;", "Lcom/stripe/android/model/v0$q;", "", "bsbNumber", "fingerprint", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuBecsDebit extends q {
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bsbNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String fingerprint;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String last4;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AuBecsDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AuBecsDebit[] newArray(int i11) {
                return new AuBecsDebit[i11];
            }
        }

        public AuBecsDebit(String str, String str2, String str3) {
            super(null);
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) other;
            return p013kotlin.jvm.internal.s.f(this.bsbNumber, auBecsDebit.bsbNumber) && p013kotlin.jvm.internal.s.f(this.fingerprint, auBecsDebit.fingerprint) && p013kotlin.jvm.internal.s.f(this.last4, auBecsDebit.last4);
        }

        public int hashCode() {
            String str = this.bsbNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fingerprint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.bsbNumber + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/v0$d;", "Lcom/stripe/android/model/v0$q;", "", "fingerprint", "last4", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BacsDebit extends q {
        public static final Parcelable.Creator<BacsDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String fingerprint;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String last4;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String sortCode;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BacsDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BacsDebit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BacsDebit[] newArray(int i11) {
                return new BacsDebit[i11];
            }
        }

        public BacsDebit(String str, String str2, String str3) {
            super(null);
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) other;
            return p013kotlin.jvm.internal.s.f(this.fingerprint, bacsDebit.fingerprint) && p013kotlin.jvm.internal.s.f(this.last4, bacsDebit.last4) && p013kotlin.jvm.internal.s.f(this.sortCode, bacsDebit.sortCode);
        }

        public int hashCode() {
            String str = this.fingerprint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.last4;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sortCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", sortCode=" + this.sortCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.sortCode);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$e, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002\u0010\"B9\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lcom/stripe/android/model/v0$e;", "Lt30/f;", "Lcom/stripe/android/model/o1;", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", Scopes.EMAIL, "name", "phone", "<init>", "(Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "", "a", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/b;", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingDetails implements t30.f, o1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f51568f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final String phone;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BillingDetails> CREATOR = new c();

        /* JADX INFO: renamed from: com.stripe.android.model.v0$e$a */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/v0$e$a;", "", "<init>", "()V", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "b", "(Lcom/stripe/android/model/b;)Lcom/stripe/android/model/v0$e$a;", "", Scopes.EMAIL, "c", "(Ljava/lang/String;)Lcom/stripe/android/model/v0$e$a;", "name", DateTokenConverter.CONVERTER_KEY, "phone", "e", "Lcom/stripe/android/model/v0$e;", "a", "()Lcom/stripe/android/model/v0$e;", "Lcom/stripe/android/model/b;", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private Address address;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String email;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private String phone;

            public final BillingDetails a() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }

            public final a b(Address address) {
                this.address = address;
                return this;
            }

            public final a c(String email) {
                this.email = email;
                return this;
            }

            public final a d(String name) {
                this.name = name;
                return this;
            }

            public final a e(String phone) {
                this.phone = phone;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/v0$e$b;", "", "<init>", "()V", "Lcom/stripe/android/model/f1;", "shippingInformation", "Lcom/stripe/android/model/v0$e;", "a", "(Lcom/stripe/android/model/f1;)Lcom/stripe/android/model/v0$e;", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BillingDetails a(ShippingInformation shippingInformation) {
                p013kotlin.jvm.internal.s.k(shippingInformation, "shippingInformation");
                return new BillingDetails(shippingInformation.getAddress(), null, shippingInformation.getName(), shippingInformation.getPhone(), 2, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$e$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<BillingDetails> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BillingDetails createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BillingDetails[] newArray(int i11) {
                return new BillingDetails[i11];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public final boolean a() {
            Address bVar = this.address;
            return ((bVar == null || !bVar.g()) && this.email == null && this.name == null && this.phone == null) ? false : true;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map mapI = p013kotlin.collections.v0.i();
            Address bVar = this.address;
            Map mapF = bVar != null ? p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.ADDRESS, bVar.c3())) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            Map mapR = p013kotlin.collections.v0.r(mapI, mapF);
            String str = this.email;
            Map mapF2 = str != null ? p013kotlin.collections.v0.f(jn0.x.a(Scopes.EMAIL, str)) : null;
            if (mapF2 == null) {
                mapF2 = p013kotlin.collections.v0.i();
            }
            Map mapR2 = p013kotlin.collections.v0.r(mapR, mapF2);
            String str2 = this.name;
            Map mapF3 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("name", str2)) : null;
            if (mapF3 == null) {
                mapF3 = p013kotlin.collections.v0.i();
            }
            Map mapR3 = p013kotlin.collections.v0.r(mapR2, mapF3);
            String str3 = this.phone;
            Map mapF4 = str3 != null ? p013kotlin.collections.v0.f(jn0.x.a("phone", str3)) : null;
            if (mapF4 == null) {
                mapF4 = p013kotlin.collections.v0.i();
            }
            return p013kotlin.collections.v0.r(mapR3, mapF4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) other;
            return p013kotlin.jvm.internal.s.f(this.address, billingDetails.address) && p013kotlin.jvm.internal.s.f(this.email, billingDetails.email) && p013kotlin.jvm.internal.s.f(this.name, billingDetails.name) && p013kotlin.jvm.internal.s.f(this.phone, billingDetails.phone);
        }

        public int hashCode() {
            Address bVar = this.address;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Address bVar = this.address;
            if (bVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bVar.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        public BillingDetails(Address bVar, String str, String str2, String str3) {
            this.address = bVar;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address bVar, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$f */
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bK\u0010\u0007J\r\u0010M\u001a\u00020L¢\u0006\u0004\bM\u0010NR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010OR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010PR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010QR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010RR\u001e\u0010J\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010OR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010TR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010UR\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010OR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010VR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010WR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010XR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010YR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010ZR\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010[R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\\R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010]R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010^R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010`¨\u0006a"}, d2 = {"Lcom/stripe/android/model/v0$f;", "", "<init>", "()V", "", "id", "l", "(Ljava/lang/String;)Lcom/stripe/android/model/v0$f;", "", "created", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Lcom/stripe/android/model/v0$f;", "", "liveMode", "n", "(Z)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$p;", "type", "r", "(Lcom/stripe/android/model/v0$p;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$e;", "billingDetails", "e", "(Lcom/stripe/android/model/v0$e;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "b", "(Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$g;", "card", "f", "(Lcom/stripe/android/model/v0$g;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$h;", "cardPresent", "g", "(Lcom/stripe/android/model/v0$h;)Lcom/stripe/android/model/v0$f;", "customerId", "j", "Lcom/stripe/android/model/v0$l;", IdealPaymentMethod.PAYMENT_METHOD_TYPE, "m", "(Lcom/stripe/android/model/v0$l;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$k;", "fpx", "k", "(Lcom/stripe/android/model/v0$k;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$n;", "sepaDebit", "p", "(Lcom/stripe/android/model/v0$n;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$c;", "auBecsDebit", "c", "(Lcom/stripe/android/model/v0$c;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$d;", "bacsDebit", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/v0$d;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$o;", "sofort", "q", "(Lcom/stripe/android/model/v0$o;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$m;", "netbanking", "o", "(Lcom/stripe/android/model/v0$m;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$r;", "usBankAccount", "s", "(Lcom/stripe/android/model/v0$r;)Lcom/stripe/android/model/v0$f;", "Lcom/stripe/android/model/v0$s;", "upi", "t", "(Lcom/stripe/android/model/v0$s;)Lcom/stripe/android/model/v0$f;", "code", "h", "Lcom/stripe/android/model/v0;", "a", "()Lcom/stripe/android/model/v0;", "Ljava/lang/String;", "Ljava/lang/Long;", "Z", "Lcom/stripe/android/model/v0$p;", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/model/v0$e;", "Lcom/stripe/android/model/v0$b;", "Lcom/stripe/android/model/v0$g;", "Lcom/stripe/android/model/v0$h;", "Lcom/stripe/android/model/v0$l;", "Lcom/stripe/android/model/v0$k;", "Lcom/stripe/android/model/v0$n;", "Lcom/stripe/android/model/v0$c;", "Lcom/stripe/android/model/v0$d;", "Lcom/stripe/android/model/v0$o;", "Lcom/stripe/android/model/v0$m;", "Lcom/stripe/android/model/v0$r;", "Lcom/stripe/android/model/v0$s;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Long created;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean liveMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String code;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private BillingDetails billingDetails;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b allowRedisplay;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String customerId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Card card;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private CardPresent cardPresent;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Ideal ideal;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Fpx fpx;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private SepaDebit sepaDebit;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private AuBecsDebit auBecsDebit;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private BacsDebit bacsDebit;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Sofort sofort;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private Netbanking netbanking;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private USBankAccount usBankAccount;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private Upi upi;

        public final PaymentMethod a() {
            String str = this.id;
            Long l11 = this.created;
            boolean z11 = this.liveMode;
            p pVar = this.type;
            return new PaymentMethod(str, l11, z11, this.code, pVar, this.billingDetails, this.customerId, this.card, this.cardPresent, this.fpx, this.ideal, this.sepaDebit, this.auBecsDebit, this.bacsDebit, this.sofort, null, this.netbanking, this.usBankAccount, this.allowRedisplay, 32768, null);
        }

        public final f b(b allowRedisplay) {
            this.allowRedisplay = allowRedisplay;
            return this;
        }

        public final f c(AuBecsDebit auBecsDebit) {
            this.auBecsDebit = auBecsDebit;
            return this;
        }

        public final f d(BacsDebit bacsDebit) {
            this.bacsDebit = bacsDebit;
            return this;
        }

        public final f e(BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }

        public final f f(Card card) {
            this.card = card;
            return this;
        }

        public final f g(CardPresent cardPresent) {
            this.cardPresent = cardPresent;
            return this;
        }

        public final f h(String code) {
            this.code = code;
            return this;
        }

        public final f i(Long created) {
            this.created = created;
            return this;
        }

        public final f j(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public final f k(Fpx fpx) {
            this.fpx = fpx;
            return this;
        }

        public final f l(String id2) {
            this.id = id2;
            return this;
        }

        public final f m(Ideal ideal) {
            this.ideal = ideal;
            return this;
        }

        public final f n(boolean liveMode) {
            this.liveMode = liveMode;
            return this;
        }

        public final f o(Netbanking netbanking) {
            this.netbanking = netbanking;
            return this;
        }

        public final f p(SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
        }

        public final f q(Sofort sofort) {
            this.sofort = sofort;
            return this;
        }

        public final f r(p type) {
            this.type = type;
            return this;
        }

        public final f s(USBankAccount usBankAccount) {
            this.usBankAccount = usBankAccount;
            return this;
        }

        public final f t(Upi upi) {
            this.upi = upi;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$g, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0003'+-B\u0097\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010,¨\u0006:"}, d2 = {"Lcom/stripe/android/model/v0$g;", "Lcom/stripe/android/model/v0$q;", "Lcom/stripe/android/model/h;", "brand", "Lcom/stripe/android/model/v0$g$a;", "checks", "", PlaceTypes.COUNTRY, "", "expiryMonth", "expiryYear", "fingerprint", "funding", "last4", "Lcom/stripe/android/model/v0$g$d;", "threeDSecureUsage", "Ly60/a;", "wallet", "Lcom/stripe/android/model/v0$g$c;", "networks", "displayBrand", "<init>", "(Lcom/stripe/android/model/h;Lcom/stripe/android/model/v0$g$a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0$g$d;Ly60/a;Lcom/stripe/android/model/v0$g$c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/h;", "b", "Lcom/stripe/android/model/v0$g$a;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/v0$g$d;", "j", "Ly60/a;", "k", "Lcom/stripe/android/model/v0$g$c;", "l", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Card extends q {
        public static final Parcelable.Creator<Card> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final h brand;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final Checks checks;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String country;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final Integer expiryMonth;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final Integer expiryYear;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final String fingerprint;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final String funding;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final String last4;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final ThreeDSecureUsage threeDSecureUsage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final y60.a wallet;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final Networks networks;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final String displayBrand;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$g$a, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/v0$g$a;", "Lt30/f;", "", "addressLine1Check", "addressPostalCodeCheck", "cvcCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Checks implements t30.f {
            public static final Parcelable.Creator<Checks> CREATOR = new C0917a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final String addressLine1Check;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            public final String addressPostalCodeCheck;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            public final String cvcCheck;

            /* JADX INFO: renamed from: com.stripe.android.model.v0$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0917a implements Parcelable.Creator<Checks> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Checks createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Checks(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Checks[] newArray(int i11) {
                    return new Checks[i11];
                }
            }

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checks)) {
                    return false;
                }
                Checks checks = (Checks) other;
                return p013kotlin.jvm.internal.s.f(this.addressLine1Check, checks.addressLine1Check) && p013kotlin.jvm.internal.s.f(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && p013kotlin.jvm.internal.s.f(this.cvcCheck, checks.cvcCheck);
            }

            public int hashCode() {
                String str = this.addressLine1Check;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.addressPostalCodeCheck;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cvcCheck;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.addressLine1Check + ", addressPostalCodeCheck=" + this.addressPostalCodeCheck + ", cvcCheck=" + this.cvcCheck + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.addressLine1Check);
                parcel.writeString(this.addressPostalCodeCheck);
                parcel.writeString(this.cvcCheck);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$g$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Card(h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Checks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureUsage.CREATOR.createFromParcel(parcel), (y60.a) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$g$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010\u000b¨\u0006%"}, d2 = {"Lcom/stripe/android/model/v0$g$c;", "Lt30/f;", "", "", "available", "", "selectionMandatory", "preferred", "<init>", "(Ljava/util/Set;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Z", "getSelectionMandatory", "()Z", "getSelectionMandatory$annotations", "()V", "c", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Networks implements t30.f {
            public static final Parcelable.Creator<Networks> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> available;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean selectionMandatory;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String preferred;

            /* JADX INFO: renamed from: com.stripe.android.model.v0$g$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Networks> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Networks createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new Networks(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Networks[] newArray(int i11) {
                    return new Networks[i11];
                }
            }

            public Networks() {
                this(null, false, null, 7, null);
            }

            public final Set<String> a() {
                return this.available;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPreferred() {
                return this.preferred;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Networks)) {
                    return false;
                }
                Networks networks = (Networks) other;
                return p013kotlin.jvm.internal.s.f(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && p013kotlin.jvm.internal.s.f(this.preferred, networks.preferred);
            }

            public int hashCode() {
                int iHashCode = ((this.available.hashCode() * 31) + Boolean.hashCode(this.selectionMandatory)) * 31;
                String str = this.preferred;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.available + ", selectionMandatory=" + this.selectionMandatory + ", preferred=" + this.preferred + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                Set<String> set = this.available;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.selectionMandatory ? 1 : 0);
                parcel.writeString(this.preferred);
            }

            public Networks(Set<String> available, boolean z11, String str) {
                p013kotlin.jvm.internal.s.k(available, "available");
                this.available = available;
                this.selectionMandatory = z11;
                this.preferred = str;
            }

            public /* synthetic */ Networks(Set set, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? p013kotlin.collections.d1.d() : set, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$g$d, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/v0$g$d;", "Lt30/f;", "", "isSupported", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ThreeDSecureUsage implements t30.f {
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean isSupported;

            /* JADX INFO: renamed from: com.stripe.android.model.v0$g$d$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ThreeDSecureUsage> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ThreeDSecureUsage createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new ThreeDSecureUsage(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ThreeDSecureUsage[] newArray(int i11) {
                    return new ThreeDSecureUsage[i11];
                }
            }

            public ThreeDSecureUsage(boolean z11) {
                this.isSupported = z11;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) other).isSupported;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSupported);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.isSupported + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(this.isSupported ? 1 : 0);
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return this.brand == card.brand && p013kotlin.jvm.internal.s.f(this.checks, card.checks) && p013kotlin.jvm.internal.s.f(this.country, card.country) && p013kotlin.jvm.internal.s.f(this.expiryMonth, card.expiryMonth) && p013kotlin.jvm.internal.s.f(this.expiryYear, card.expiryYear) && p013kotlin.jvm.internal.s.f(this.fingerprint, card.fingerprint) && p013kotlin.jvm.internal.s.f(this.funding, card.funding) && p013kotlin.jvm.internal.s.f(this.last4, card.last4) && p013kotlin.jvm.internal.s.f(this.threeDSecureUsage, card.threeDSecureUsage) && p013kotlin.jvm.internal.s.f(this.wallet, card.wallet) && p013kotlin.jvm.internal.s.f(this.networks, card.networks) && p013kotlin.jvm.internal.s.f(this.displayBrand, card.displayBrand);
        }

        public int hashCode() {
            int iHashCode = this.brand.hashCode() * 31;
            Checks checks = this.checks;
            int iHashCode2 = (iHashCode + (checks == null ? 0 : checks.hashCode())) * 31;
            String str = this.country;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.fingerprint;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.funding;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.last4;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            int iHashCode9 = (iHashCode8 + (threeDSecureUsage == null ? 0 : threeDSecureUsage.hashCode())) * 31;
            y60.a aVar = this.wallet;
            int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Networks networks = this.networks;
            int iHashCode11 = (iHashCode10 + (networks == null ? 0 : networks.hashCode())) * 31;
            String str5 = this.displayBrand;
            return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.brand + ", checks=" + this.checks + ", country=" + this.country + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", fingerprint=" + this.fingerprint + ", funding=" + this.funding + ", last4=" + this.last4 + ", threeDSecureUsage=" + this.threeDSecureUsage + ", wallet=" + this.wallet + ", networks=" + this.networks + ", displayBrand=" + this.displayBrand + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.brand.name());
            Checks checks = this.checks;
            if (checks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                checks.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.country);
            Integer num = this.expiryMonth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.funding);
            parcel.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            if (threeDSecureUsage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                threeDSecureUsage.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.wallet, flags);
            Networks networks = this.networks;
            if (networks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                networks.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.displayBrand);
        }

        public /* synthetic */ Card(h hVar, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, y60.a aVar, Networks networks, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? h.Unknown : hVar, (i11 & 2) != 0 ? null : checks, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : threeDSecureUsage, (i11 & 512) != 0 ? null : aVar, (i11 & 1024) != 0 ? null : networks, (i11 & 2048) != 0 ? null : str5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(h brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, y60.a aVar, Networks networks, String str5) {
            super(null);
            p013kotlin.jvm.internal.s.k(brand, "brand");
            this.brand = brand;
            this.checks = checks;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage;
            this.wallet = aVar;
            this.networks = networks;
            this.displayBrand = str5;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$h, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0017B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/v0$h;", "Lcom/stripe/android/model/v0$q;", "", "ignore", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardPresent extends q {
        public static final Parcelable.Creator<CardPresent> CREATOR = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ CardPresent f51616c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean ignore;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$h$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/v0$h$a;", "", "<init>", "()V", "Lcom/stripe/android/model/v0$h;", "EMPTY", "Lcom/stripe/android/model/v0$h;", "a", "()Lcom/stripe/android/model/v0$h;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CardPresent a() {
                return CardPresent.f51616c;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$h$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<CardPresent> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CardPresent createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new CardPresent(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CardPresent[] newArray(int i11) {
                return new CardPresent[i11];
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            INSTANCE = new Companion(defaultConstructorMarker);
            f51616c = new CardPresent(false, 1, defaultConstructorMarker);
        }

        public CardPresent() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardPresent) && this.ignore == ((CardPresent) other).ignore;
        }

        public int hashCode() {
            return Boolean.hashCode(this.ignore);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.ignore + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.ignore ? 1 : 0);
        }

        public /* synthetic */ CardPresent(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11);
        }

        public CardPresent(boolean z11) {
            super(null);
            this.ignore = z11;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$i, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/v0$i;", "", "<init>", "()V", "Lorg/json/JSONObject;", "paymentMethod", "Lcom/stripe/android/model/v0;", "a", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentMethod a(JSONObject paymentMethod) {
            if (paymentMethod != null) {
                return new x60.v().a(paymentMethod);
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$j */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new PaymentMethod(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CardPresent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : USBankAccount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod[] newArray(int i11) {
            return new PaymentMethod[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$k, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/v0$k;", "Lcom/stripe/android/model/v0$q;", "", PlaceTypes.BANK, "accountHolderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Fpx extends q {
        public static final Parcelable.Creator<Fpx> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bank;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String accountHolderType;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$k$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Fpx> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Fpx createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Fpx(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fpx[] newArray(int i11) {
                return new Fpx[i11];
            }
        }

        public Fpx(String str, String str2) {
            super(null);
            this.bank = str;
            this.accountHolderType = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fpx)) {
                return false;
            }
            Fpx fpx = (Fpx) other;
            return p013kotlin.jvm.internal.s.f(this.bank, fpx.bank) && p013kotlin.jvm.internal.s.f(this.accountHolderType, fpx.accountHolderType);
        }

        public int hashCode() {
            String str = this.bank;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.bank + ", accountHolderType=" + this.accountHolderType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bank);
            parcel.writeString(this.accountHolderType);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$l, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/v0$l;", "Lcom/stripe/android/model/v0$q;", "", PlaceTypes.BANK, "bankIdentifierCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ideal extends q {
        public static final Parcelable.Creator<Ideal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bank;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bankIdentifierCode;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$l$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Ideal> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Ideal createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Ideal(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Ideal[] newArray(int i11) {
                return new Ideal[i11];
            }
        }

        public Ideal(String str, String str2) {
            super(null);
            this.bank = str;
            this.bankIdentifierCode = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ideal)) {
                return false;
            }
            Ideal ideal = (Ideal) other;
            return p013kotlin.jvm.internal.s.f(this.bank, ideal.bank) && p013kotlin.jvm.internal.s.f(this.bankIdentifierCode, ideal.bankIdentifierCode);
        }

        public int hashCode() {
            String str = this.bank;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankIdentifierCode;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.bank + ", bankIdentifierCode=" + this.bankIdentifierCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bank);
            parcel.writeString(this.bankIdentifierCode);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$m, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/v0$m;", "Lcom/stripe/android/model/v0$q;", "", PlaceTypes.BANK, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Netbanking extends q {
        public static final Parcelable.Creator<Netbanking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bank;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$m$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Netbanking> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Netbanking createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Netbanking[] newArray(int i11) {
                return new Netbanking[i11];
            }
        }

        public Netbanking(String str) {
            super(null);
            this.bank = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Netbanking) && p013kotlin.jvm.internal.s.f(this.bank, ((Netbanking) other).bank);
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bank);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$n, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lcom/stripe/android/model/v0$n;", "Lcom/stripe/android/model/v0$q;", "", "bankCode", "branchCode", PlaceTypes.COUNTRY, "fingerprint", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SepaDebit extends q {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bankCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final String branchCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String country;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final String fingerprint;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final String last4;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$n$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SepaDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SepaDebit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SepaDebit[] newArray(int i11) {
                return new SepaDebit[i11];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) other;
            return p013kotlin.jvm.internal.s.f(this.bankCode, sepaDebit.bankCode) && p013kotlin.jvm.internal.s.f(this.branchCode, sepaDebit.branchCode) && p013kotlin.jvm.internal.s.f(this.country, sepaDebit.country) && p013kotlin.jvm.internal.s.f(this.fingerprint, sepaDebit.fingerprint) && p013kotlin.jvm.internal.s.f(this.last4, sepaDebit.last4);
        }

        public int hashCode() {
            String str = this.bankCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerprint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.bankCode + ", branchCode=" + this.branchCode + ", country=" + this.country + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bankCode);
            parcel.writeString(this.branchCode);
            parcel.writeString(this.country);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$o, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/v0$o;", "Lcom/stripe/android/model/v0$q;", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Sofort extends q {
        public static final Parcelable.Creator<Sofort> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String country;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$o$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Sofort> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Sofort createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Sofort[] newArray(int i11) {
                return new Sofort[i11];
            }
        }

        public Sofort(String str) {
            super(null);
            this.country = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sofort) && p013kotlin.jvm.internal.s.f(this.country, ((Sofort) other).country);
        }

        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.country + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.country);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$q */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/v0$q;", "Lt30/f;", "<init>", "()V", "Lcom/stripe/android/model/v0$c;", "Lcom/stripe/android/model/v0$d;", "Lcom/stripe/android/model/v0$g;", "Lcom/stripe/android/model/v0$h;", "Lcom/stripe/android/model/v0$k;", "Lcom/stripe/android/model/v0$l;", "Lcom/stripe/android/model/v0$m;", "Lcom/stripe/android/model/v0$n;", "Lcom/stripe/android/model/v0$o;", "Lcom/stripe/android/model/v0$r;", "Lcom/stripe/android/model/v0$s;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class q implements t30.f {
        public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private q() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$r, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003#%'BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u001c\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u0012\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/stripe/android/model/v0$r;", "Lcom/stripe/android/model/v0$q;", "Lcom/stripe/android/model/v0$r$b;", "accountHolderType", "Lcom/stripe/android/model/v0$r$c;", "accountType", "", "bankName", "fingerprint", "last4", "financialConnectionsAccount", "Lcom/stripe/android/model/v0$r$d;", "networks", "routingNumber", "<init>", "(Lcom/stripe/android/model/v0$r$b;Lcom/stripe/android/model/v0$r$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0$r$d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/v0$r$b;", "b", "Lcom/stripe/android/model/v0$r$c;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lcom/stripe/android/model/v0$r$d;", "h", IntegerTokenConverter.CONVERTER_KEY, "getLinkedAccount$annotations", "()V", "linkedAccount", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class USBankAccount extends q {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final b accountHolderType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final c accountType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final String bankName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final String fingerprint;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final String last4;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final String financialConnectionsAccount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final USBankNetworks networks;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final String routingNumber;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final String linkedAccount;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$r$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<USBankAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final USBankAccount createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new USBankAccount(b.CREATOR.createFromParcel(parcel), c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : USBankNetworks.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$r$b */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/v0$r$b;", "", "Lt30/f;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "UNKNOWN", "INDIVIDUAL", "COMPANY", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b implements t30.f {
            UNKNOWN("unknown"),
            INDIVIDUAL(Kind.INDIVIDUAL),
            COMPANY("company");

            private final String value;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* JADX INFO: renamed from: com.stripe.android.model.v0$r$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return b.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            b(String str) {
                this.value = str;
            }

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(name());
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$r$c */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/v0$r$c;", "", "Lt30/f;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "UNKNOWN", "CHECKING", "SAVINGS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum c implements t30.f {
            UNKNOWN("unknown"),
            CHECKING("checking"),
            SAVINGS("savings");

            private final String value;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: com.stripe.android.model.v0$r$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return c.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            c(String str) {
                this.value = str;
            }

            public static EnumEntries<c> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(name());
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$r$d, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/v0$r$d;", "Lt30/f;", "", "preferred", "", "supported", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class USBankNetworks implements t30.f {
            public static final Parcelable.Creator<USBankNetworks> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String preferred;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> supported;

            /* JADX INFO: renamed from: com.stripe.android.model.v0$r$d$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<USBankNetworks> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final USBankNetworks createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new USBankNetworks(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final USBankNetworks[] newArray(int i11) {
                    return new USBankNetworks[i11];
                }
            }

            public USBankNetworks(String str, List<String> supported) {
                p013kotlin.jvm.internal.s.k(supported, "supported");
                this.preferred = str;
                this.supported = supported;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getPreferred() {
                return this.preferred;
            }

            public final List<String> b() {
                return this.supported;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof USBankNetworks)) {
                    return false;
                }
                USBankNetworks uSBankNetworks = (USBankNetworks) other;
                return p013kotlin.jvm.internal.s.f(this.preferred, uSBankNetworks.preferred) && p013kotlin.jvm.internal.s.f(this.supported, uSBankNetworks.supported);
            }

            public int hashCode() {
                String str = this.preferred;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.supported.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.preferred + ", supported=" + this.supported + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.preferred);
                parcel.writeStringList(this.supported);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public USBankAccount(b accountHolderType, c accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            super(null);
            p013kotlin.jvm.internal.s.k(accountHolderType, "accountHolderType");
            p013kotlin.jvm.internal.s.k(accountType, "accountType");
            this.accountHolderType = accountHolderType;
            this.accountType = accountType;
            this.bankName = str;
            this.fingerprint = str2;
            this.last4 = str3;
            this.financialConnectionsAccount = str4;
            this.networks = uSBankNetworks;
            this.routingNumber = str5;
            this.linkedAccount = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return this.accountHolderType == uSBankAccount.accountHolderType && this.accountType == uSBankAccount.accountType && p013kotlin.jvm.internal.s.f(this.bankName, uSBankAccount.bankName) && p013kotlin.jvm.internal.s.f(this.fingerprint, uSBankAccount.fingerprint) && p013kotlin.jvm.internal.s.f(this.last4, uSBankAccount.last4) && p013kotlin.jvm.internal.s.f(this.financialConnectionsAccount, uSBankAccount.financialConnectionsAccount) && p013kotlin.jvm.internal.s.f(this.networks, uSBankAccount.networks) && p013kotlin.jvm.internal.s.f(this.routingNumber, uSBankAccount.routingNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.accountHolderType.hashCode() * 31) + this.accountType.hashCode()) * 31;
            String str = this.bankName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprint;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.financialConnectionsAccount;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            USBankNetworks uSBankNetworks = this.networks;
            int iHashCode6 = (iHashCode5 + (uSBankNetworks == null ? 0 : uSBankNetworks.hashCode())) * 31;
            String str5 = this.routingNumber;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.accountHolderType + ", accountType=" + this.accountType + ", bankName=" + this.bankName + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", financialConnectionsAccount=" + this.financialConnectionsAccount + ", networks=" + this.networks + ", routingNumber=" + this.routingNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.accountHolderType.writeToParcel(parcel, flags);
            this.accountType.writeToParcel(parcel, flags);
            parcel.writeString(this.bankName);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.financialConnectionsAccount);
            USBankNetworks uSBankNetworks = this.networks;
            if (uSBankNetworks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankNetworks.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.routingNumber);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$s, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/v0$s;", "Lcom/stripe/android/model/v0$q;", "", "vpa", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Upi extends q {
        public static final Parcelable.Creator<Upi> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final String vpa;

        /* JADX INFO: renamed from: com.stripe.android.model.v0$s$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Upi> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Upi createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Upi[] newArray(int i11) {
                return new Upi[i11];
            }
        }

        public Upi(String str) {
            super(null);
            this.vpa = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Upi) && p013kotlin.jvm.internal.s.f(this.vpa, ((Upi) other).vpa);
        }

        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.vpa + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.vpa);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$t */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51641a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.Fpx.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Ideal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.USBankAccount.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f51641a = iArr;
        }
    }

    public PaymentMethod(String str, Long l11, boolean z11, String str2, p pVar, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, b bVar) {
        this.id = str;
        this.created = l11;
        this.liveMode = z11;
        this.code = str2;
        this.type = pVar;
        this.billingDetails = billingDetails;
        this.customerId = str3;
        this.card = card;
        this.cardPresent = cardPresent;
        this.fpx = fpx;
        this.ideal = ideal;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.allowRedisplay = bVar;
    }

    public final boolean a() {
        p pVar = this.type;
        switch (pVar == null ? -1 : t.f51641a[pVar.ordinal()]) {
            case 1:
                return this.card != null;
            case 2:
                return this.cardPresent != null;
            case 3:
                return this.fpx != null;
            case 4:
                return this.ideal != null;
            case 5:
                return this.sepaDebit != null;
            case 6:
                return this.auBecsDebit != null;
            case 7:
                return this.bacsDebit != null;
            case 8:
                return this.sofort != null;
            case 9:
                return this.usBankAccount != null;
            default:
                return true;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return p013kotlin.jvm.internal.s.f(this.id, paymentMethod.id) && p013kotlin.jvm.internal.s.f(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && p013kotlin.jvm.internal.s.f(this.code, paymentMethod.code) && this.type == paymentMethod.type && p013kotlin.jvm.internal.s.f(this.billingDetails, paymentMethod.billingDetails) && p013kotlin.jvm.internal.s.f(this.customerId, paymentMethod.customerId) && p013kotlin.jvm.internal.s.f(this.card, paymentMethod.card) && p013kotlin.jvm.internal.s.f(this.cardPresent, paymentMethod.cardPresent) && p013kotlin.jvm.internal.s.f(this.fpx, paymentMethod.fpx) && p013kotlin.jvm.internal.s.f(this.ideal, paymentMethod.ideal) && p013kotlin.jvm.internal.s.f(this.sepaDebit, paymentMethod.sepaDebit) && p013kotlin.jvm.internal.s.f(this.auBecsDebit, paymentMethod.auBecsDebit) && p013kotlin.jvm.internal.s.f(this.bacsDebit, paymentMethod.bacsDebit) && p013kotlin.jvm.internal.s.f(this.sofort, paymentMethod.sofort) && p013kotlin.jvm.internal.s.f(this.upi, paymentMethod.upi) && p013kotlin.jvm.internal.s.f(this.netbanking, paymentMethod.netbanking) && p013kotlin.jvm.internal.s.f(this.usBankAccount, paymentMethod.usBankAccount) && this.allowRedisplay == paymentMethod.allowRedisplay;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.created;
        int iHashCode2 = (((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Boolean.hashCode(this.liveMode)) * 31;
        String str2 = this.code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.type;
        int iHashCode4 = (iHashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int iHashCode5 = (iHashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        String str3 = this.customerId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Card card = this.card;
        int iHashCode7 = (iHashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        CardPresent cardPresent = this.cardPresent;
        int iHashCode8 = (iHashCode7 + (cardPresent == null ? 0 : cardPresent.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int iHashCode9 = (iHashCode8 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int iHashCode10 = (iHashCode9 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int iHashCode11 = (iHashCode10 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int iHashCode12 = (iHashCode11 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int iHashCode13 = (iHashCode12 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int iHashCode14 = (iHashCode13 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int iHashCode15 = (iHashCode14 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int iHashCode16 = (iHashCode15 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int iHashCode17 = (iHashCode16 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        b bVar = this.allowRedisplay;
        return iHashCode17 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.id + ", created=" + this.created + ", liveMode=" + this.liveMode + ", code=" + this.code + ", type=" + this.type + ", billingDetails=" + this.billingDetails + ", customerId=" + this.customerId + ", card=" + this.card + ", cardPresent=" + this.cardPresent + ", fpx=" + this.fpx + ", ideal=" + this.ideal + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + ", allowRedisplay=" + this.allowRedisplay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        Long l11 = this.created;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeInt(this.liveMode ? 1 : 0);
        parcel.writeString(this.code);
        p pVar = this.type;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, flags);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.customerId);
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, flags);
        }
        CardPresent cardPresent = this.cardPresent;
        if (cardPresent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardPresent.writeToParcel(parcel, flags);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpx.writeToParcel(parcel, flags);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ideal.writeToParcel(parcel, flags);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sepaDebit.writeToParcel(parcel, flags);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auBecsDebit.writeToParcel(parcel, flags);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bacsDebit.writeToParcel(parcel, flags);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sofort.writeToParcel(parcel, flags);
        }
        Upi upi = this.upi;
        if (upi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            upi.writeToParcel(parcel, flags);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            netbanking.writeToParcel(parcel, flags);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccount.writeToParcel(parcel, flags);
        }
        b bVar = this.allowRedisplay;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.v0$a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/v0$a;", "Landroid/os/Parcelable;", "", "J0", "()Z", "shouldRefresh", "", "v1", "()I", "retryCount", "a", "b", "c", "Lcom/stripe/android/model/v0$a$a;", "Lcom/stripe/android/model/v0$a$b;", "Lcom/stripe/android/model/v0$a$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends Parcelable {

        /* JADX INFO: renamed from: com.stripe.android.model.v0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u00020\f8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\u00020\u00078\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\t¨\u0006!"}, d2 = {"Lcom/stripe/android/model/v0$a$a;", "Lcom/stripe/android/model/v0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Z", "J0", "()Z", "getShouldRefresh$annotations", "shouldRefresh", "c", "I", "v1", "getRetryCount$annotations", "retryCount", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class C0913a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final boolean shouldRefresh = false;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0913a f51554a = new C0913a();

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final int retryCount = 5;
            public static final Parcelable.Creator<C0913a> CREATOR = new C0914a();

            /* JADX INFO: renamed from: com.stripe.android.model.v0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0914a implements Parcelable.Creator<C0913a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0913a createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return C0913a.f51554a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0913a[] newArray(int i11) {
                    return new C0913a[i11];
                }
            }

            private C0913a() {
            }

            @Override // com.stripe.android.model.PaymentMethod.a
            /* JADX INFO: renamed from: J0 */
            public boolean getShouldRefresh() {
                return shouldRefresh;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0913a);
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // com.stripe.android.model.PaymentMethod.a
            /* JADX INFO: renamed from: v1 */
            public int getRetryCount() {
                return retryCount;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: J0 */
        boolean getShouldRefresh();

        /* JADX INFO: renamed from: v1 */
        int getRetryCount();

        /* JADX INFO: renamed from: com.stripe.android.model.v0$a$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010 \u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/stripe/android/model/v0$a$b;", "Lcom/stripe/android/model/v0$a;", "", "retryCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "v1", "b", "Z", "J0", "()Z", "getShouldRefresh$annotations", "()V", "shouldRefresh", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Poll implements a {
            public static final Parcelable.Creator<Poll> CREATOR = new C0915a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int retryCount;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final boolean shouldRefresh;

            /* JADX INFO: renamed from: com.stripe.android.model.v0$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0915a implements Parcelable.Creator<Poll> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Poll createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Poll(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Poll[] newArray(int i11) {
                    return new Poll[i11];
                }
            }

            public Poll(int i11) {
                this.retryCount = i11;
                this.shouldRefresh = true;
            }

            @Override // com.stripe.android.model.PaymentMethod.a
            /* JADX INFO: renamed from: J0, reason: from getter */
            public boolean getShouldRefresh() {
                return this.shouldRefresh;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Poll) && this.retryCount == ((Poll) other).retryCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.retryCount);
            }

            public String toString() {
                return "Poll(retryCount=" + this.retryCount + ")";
            }

            @Override // com.stripe.android.model.PaymentMethod.a
            /* JADX INFO: renamed from: v1, reason: from getter */
            public int getRetryCount() {
                return this.retryCount;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(this.retryCount);
            }

            public /* synthetic */ Poll(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? 5 : i11);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$a$c, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010 \u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/stripe/android/model/v0$a$c;", "Lcom/stripe/android/model/v0$a;", "", "retryCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "v1", "b", "Z", "J0", "()Z", "getShouldRefresh$annotations", "()V", "shouldRefresh", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Refresh implements a {
            public static final Parcelable.Creator<Refresh> CREATOR = new C0916a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int retryCount;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final boolean shouldRefresh;

            /* JADX INFO: renamed from: com.stripe.android.model.v0$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0916a implements Parcelable.Creator<Refresh> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Refresh createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Refresh(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Refresh[] newArray(int i11) {
                    return new Refresh[i11];
                }
            }

            public Refresh(int i11) {
                this.retryCount = i11;
                this.shouldRefresh = true;
            }

            @Override // com.stripe.android.model.PaymentMethod.a
            /* JADX INFO: renamed from: J0, reason: from getter */
            public boolean getShouldRefresh() {
                return this.shouldRefresh;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Refresh) && this.retryCount == ((Refresh) other).retryCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.retryCount);
            }

            public String toString() {
                return "Refresh(retryCount=" + this.retryCount + ")";
            }

            @Override // com.stripe.android.model.PaymentMethod.a
            /* JADX INFO: renamed from: v1, reason: from getter */
            public int getRetryCount() {
                return this.retryCount;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeInt(this.retryCount);
            }

            public /* synthetic */ Refresh(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? 1 : i11);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Link' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.stripe.android.model.v0$p */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001 B;\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001ej\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bG¨\u0006H"}, d2 = {"Lcom/stripe/android/model/v0$p;", "", "Landroid/os/Parcelable;", "", "code", "", "isReusable", "isVoucher", "requiresMandate", "hasDelayedSettlement", "Lcom/stripe/android/model/v0$a;", "afterRedirectAction", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZZZLcom/stripe/android/model/v0$a;)V", "()Z", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Z", "Lcom/stripe/android/model/v0$a;", "getAfterRedirectAction$payments_core_release", "()Lcom/stripe/android/model/v0$a;", "Companion", "a", "Link", "Card", "CardPresent", "Fpx", "Ideal", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Netbanking", "Blik", "WeChatPay", "Klarna", "Affirm", "RevolutPay", "Sunbit", "Billie", "Satispay", "AmazonPay", "Alma", "MobilePay", "Multibanco", "Zip", "USBankAccount", "CashAppPay", "Boleto", "Konbini", "Swish", "Twint", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class p implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ p[] $VALUES;
        public static final p Affirm;
        public static final p AfterpayClearpay;
        public static final p Alipay;
        public static final p Alma;
        public static final p AmazonPay;
        public static final p AuBecsDebit;
        public static final p BacsDebit;
        public static final p Bancontact;
        public static final p Billie;
        public static final p Blik;
        public static final Parcelable.Creator<p> CREATOR;
        public static final p Card;
        public static final p CardPresent;
        public static final p CashAppPay;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final p Eps;
        public static final p Fpx;
        public static final p Giropay;
        public static final p GrabPay;
        public static final p Ideal;
        public static final p Klarna;
        public static final p Link;
        public static final p MobilePay;
        public static final p Multibanco;
        public static final p Netbanking;
        public static final p Oxxo;
        public static final p P24;
        public static final p PayPal;
        public static final p RevolutPay;
        public static final p Satispay;
        public static final p SepaDebit;
        public static final p Sofort;
        public static final p Sunbit;
        public static final p Swish;
        public static final p Twint;
        public static final p USBankAccount;
        public static final p Upi;
        public static final p Zip;
        private final a afterRedirectAction;
        public final String code;
        private final boolean hasDelayedSettlement;
        public final boolean isReusable;
        public final boolean isVoucher;
        public final boolean requiresMandate;
        public static final p WeChatPay = new p("WeChatPay", 21, "wechat_pay", false, false, false, false, new a.Refresh(5));
        public static final p Boleto = new p("Boleto", 35, "boleto", false, true, false, true, 0 == true ? 1 : 0, 32, null);
        public static final p Konbini = new p("Konbini", 36, "konbini", false, true, false, true, null, 32, null);

        /* JADX INFO: renamed from: com.stripe.android.model.v0$p$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/v0$p$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/v0$p;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/v0$p;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ p a(String code) {
                p next;
                Iterator<p> it = p.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.code, code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.v0$p$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return p.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i11) {
                return new p[i11];
            }
        }

        private static final /* synthetic */ p[] $values() {
            return new p[]{Link, Card, CardPresent, Fpx, Ideal, SepaDebit, AuBecsDebit, BacsDebit, Sofort, Upi, P24, Bancontact, Giropay, Eps, Oxxo, Alipay, GrabPay, PayPal, AfterpayClearpay, Netbanking, Blik, WeChatPay, Klarna, Affirm, RevolutPay, Sunbit, Billie, Satispay, AmazonPay, Alma, MobilePay, Multibanco, Zip, USBankAccount, CashAppPay, Boleto, Konbini, Swish, Twint};
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            boolean z11 = false;
            Link = new p("Link", 0, "link", false, false, true, z11, null, 32, null);
            boolean z12 = false;
            boolean z13 = false;
            Card = new p("Card", 1, "card", true, z12, z11, z13, null, 32, null);
            boolean z14 = false;
            CardPresent = new p("CardPresent", 2, "card_present", z12, z11, z13, z14, null, 32, null);
            Fpx = new p("Fpx", 3, "fpx", z11, z13, z14, false, null, 32, null);
            Ideal = new p("Ideal", 4, IdealPaymentMethod.PAYMENT_METHOD_TYPE, z13, z14, true, false, null, 32, null);
            boolean z15 = true;
            SepaDebit = new p("SepaDebit", 5, "sepa_debit", z14, false, true, z15, null, 32, null);
            boolean z16 = true;
            AuBecsDebit = new p("AuBecsDebit", 6, "au_becs_debit", true, false, z15, z16, null, 32, null);
            boolean z17 = false;
            boolean z18 = true;
            BacsDebit = new p("BacsDebit", 7, "bacs_debit", true, z17, z16, z18, null, 32, null);
            Sofort = new p("Sofort", 8, "sofort", z17, false, z18, true, null, 32, null);
            int i11 = 0;
            int i12 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z19 = false;
            boolean z21 = false;
            Upi = new p("Upi", 9, "upi", false, false, false, false, new a.Refresh(i11, i12, defaultConstructorMarker));
            P24 = new p("P24", 10, "p24", false, z19, z21, false, 0 == true ? 1 : 0, 32, null);
            boolean z22 = false;
            Bancontact = new p("Bancontact", 11, "bancontact", z19, z21, true, z22, null, 32, null);
            boolean z23 = false;
            Giropay = new p("Giropay", 12, "giropay", z21, z23, z22, false, null, 32, null);
            boolean z24 = true;
            boolean z25 = false;
            Eps = new p("Eps", 13, EPSPaymentMethod.PAYMENT_METHOD_TYPE, z23, z22, z24, z25, null, 32, null);
            Oxxo = new p("Oxxo", 14, "oxxo", z22, z24, z25, true, null, 32, null);
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            Alipay = new p("Alipay", 15, "alipay", false, z25, false, false, null, 32, defaultConstructorMarker2);
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            GrabPay = new p("GrabPay", 16, "grabpay", false, z26, z27, z28, null, 32, null);
            boolean z29 = false;
            PayPal = new p("PayPal", 17, "paypal", z26, z27, z28, z29, null, 32, null);
            boolean z31 = false;
            AfterpayClearpay = new p("AfterpayClearpay", 18, "afterpay_clearpay", z27, z28, z29, z31, null, 32, null);
            boolean z32 = false;
            Netbanking = new p("Netbanking", 19, "netbanking", z28, z29, z31, z32, null, 32, null);
            boolean z33 = false;
            Blik = new p("Blik", 20, BlikPaymentMethod.PAYMENT_METHOD_TYPE, z29, z31, z32, z33, null, 32, null);
            boolean z34 = false;
            boolean z35 = false;
            Klarna = new p("Klarna", 22, "klarna", z32, z33, z34, z35, 0 == true ? 1 : 0, 32, null);
            boolean z36 = false;
            Affirm = new p("Affirm", 23, "affirm", z33, z34, z35, z36, null, 32, null);
            boolean z37 = false;
            RevolutPay = new p("RevolutPay", 24, "revolut_pay", z34, z35, z36, z37, null, 32, null);
            boolean z38 = false;
            Sunbit = new p("Sunbit", 25, "sunbit", z35, z36, z37, z38, null, 32, 0 == true ? 1 : 0);
            boolean z39 = false;
            Billie = new p("Billie", 26, "billie", z36, z37, z38, z39, null, 32, null);
            Satispay = new p("Satispay", 27, "satispay", z37, z38, z39, false, null, 32, defaultConstructorMarker2);
            boolean z41 = false;
            boolean z42 = false;
            boolean z43 = false;
            AmazonPay = new p("AmazonPay", 28, "amazon_pay", false, z41, z42, z43, null, 32, null);
            boolean z44 = false;
            Alma = new p("Alma", 29, "alma", z41, z42, z43, z44, null, 32, null);
            boolean z45 = false;
            MobilePay = new p("MobilePay", 30, "mobilepay", z42, z43, z44, z45, null, 32, null);
            Multibanco = new p("Multibanco", 31, "multibanco", z43, true, z45, true, null, 32, null);
            boolean z46 = false;
            Zip = new p("Zip", 32, "zip", false, z45, z46, false, null, 32, null);
            USBankAccount = new p("USBankAccount", 33, "us_bank_account", true, z46, true, true, null, 32, null);
            CashAppPay = new p("CashAppPay", 34, CashAppPayPaymentMethod.PAYMENT_METHOD_TYPE, false, false, false, false, new a.Refresh(i11, i12, defaultConstructorMarker));
            Swish = new p("Swish", 37, "swish", false, false, false, false, new a.Poll(i11, i12, defaultConstructorMarker));
            Twint = new p("Twint", 38, "twint", false, false, false, false, new a.Poll(i11, i12, defaultConstructorMarker));
            p[] pVarArr$values = $values();
            $VALUES = pVarArr$values;
            $ENTRIES = on0.a.a(pVarArr$values);
            INSTANCE = new Companion(defaultConstructorMarker);
            CREATOR = new b();
        }

        private p(String str, int i11, String str2, boolean z11, boolean z12, boolean z13, boolean z14, a aVar) {
            super(str, i11);
            this.code = str2;
            this.isReusable = z11;
            this.isVoucher = z12;
            this.requiresMandate = z13;
            this.hasDelayedSettlement = z14;
            this.afterRedirectAction = aVar;
        }

        public static EnumEntries<p> getEntries() {
            return $ENTRIES;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: getAfterRedirectAction$payments_core_release, reason: from getter */
        public final a getAfterRedirectAction() {
            return this.afterRedirectAction;
        }

        /* JADX INFO: renamed from: hasDelayedSettlement, reason: from getter */
        public final boolean getHasDelayedSettlement() {
            return this.hasDelayedSettlement;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(name());
        }

        /* synthetic */ p(String str, int i11, String str2, boolean z11, boolean z12, boolean z13, boolean z14, a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, str2, z11, z12, z13, z14, (i12 & 32) != 0 ? a.C0913a.f51554a : aVar);
        }
    }

    public /* synthetic */ PaymentMethod(String str, Long l11, boolean z11, String str2, p pVar, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11, z11, str2, pVar, (i11 & 32) != 0 ? null : billingDetails, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : card, (i11 & 256) != 0 ? null : cardPresent, (i11 & 512) != 0 ? null : fpx, (i11 & 1024) != 0 ? null : ideal, (i11 & 2048) != 0 ? null : sepaDebit, (i11 & 4096) != 0 ? null : auBecsDebit, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : bacsDebit, (i11 & 16384) != 0 ? null : sofort, (32768 & i11) != 0 ? null : upi, (65536 & i11) != 0 ? null : netbanking, (131072 & i11) != 0 ? null : uSBankAccount, (i11 & 262144) != 0 ? null : bVar);
    }
}
