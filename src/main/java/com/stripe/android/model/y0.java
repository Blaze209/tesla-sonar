package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u000b\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007H ¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/v0$p;", "type", "<init>", "(Lcom/stripe/android/model/v0$p;)V", "", "Lkotlin/Pair;", "", "", "a", "()Ljava/util/List;", "", "c3", "()Ljava/util/Map;", "Lcom/stripe/android/model/v0$p;", "getType", "()Lcom/stripe/android/model/v0$p;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lcom/stripe/android/model/y0$a;", "Lcom/stripe/android/model/y0$b;", "Lcom/stripe/android/model/y0$c;", "Lcom/stripe/android/model/y0$d;", "Lcom/stripe/android/model/y0$e;", "Lcom/stripe/android/model/y0$f;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class y0 implements o1, Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51735b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethod.p type;

    /* JADX INFO: renamed from: com.stripe.android.model.y0$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0005¨\u0006 "}, d2 = {"Lcom/stripe/android/model/y0$a;", "Lcom/stripe/android/model/y0;", "", "code", "<init>", "(Ljava/lang/String;)V", "", "Lkotlin/Pair;", "", "a", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "getCode", "setCode", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Blik extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private String code;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f51738e = 8;
        public static final Parcelable.Creator<Blik> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.y0$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Blik> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Blik createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Blik(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Blik[] newArray(int i11) {
                return new Blik[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Blik(String code) {
            super(PaymentMethod.p.Blik, null);
            p013kotlin.jvm.internal.s.k(code, "code");
            this.code = code;
        }

        @Override // com.stripe.android.model.y0
        public List<Pair<String, Object>> a() {
            return p013kotlin.collections.v.e(jn0.x.a("code", this.code));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Blik) && p013kotlin.jvm.internal.s.f(this.code, ((Blik) other).code);
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        public String toString() {
            return "Blik(code=" + this.code + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.code);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.y0$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0001\u000fB9\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB-\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010&R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b'\u0010,\"\u0004\b-\u0010.R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/stripe/android/model/y0$b;", "Lcom/stripe/android/model/y0;", "", "cvc", "network", "Lcom/stripe/android/model/l$c;", "setupFutureUsage", "", "moto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/l$c;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/l$c;)V", "", "Lkotlin/Pair;", "", "a", "()Ljava/util/List;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/l$c;Ljava/lang/Boolean;)Lcom/stripe/android/model/y0$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "getCvc", "setCvc", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "getNetwork", "setNetwork", "e", "Lcom/stripe/android/model/l$c;", "()Lcom/stripe/android/model/l$c;", "setSetupFutureUsage", "(Lcom/stripe/android/model/l$c;)V", "f", "Ljava/lang/Boolean;", "getMoto$payments_core_release", "()Ljava/lang/Boolean;", "setMoto$payments_core_release", "(Ljava/lang/Boolean;)V", "g", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Card extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private String cvc;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private String network;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private ConfirmPaymentIntentParams.c setupFutureUsage;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private Boolean moto;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final a f51740g = new a(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f51741h = 8;
        public static final Parcelable.Creator<Card> CREATOR = new C0923b();

        /* JADX INFO: renamed from: com.stripe.android.model.y0$b$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/y0$b$a;", "", "<init>", "()V", "", "PARAM_CVC", "Ljava/lang/String;", "PARAM_MOTO", "PARAM_NETWORK", "PARAM_SETUP_FUTURE_USAGE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.y0$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0923b implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                Boolean boolValueOf = null;
                ConfirmPaymentIntentParams.c cVarValueOf = parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.c.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Card(string, string2, cVarValueOf, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public /* synthetic */ Card(String str, String str2, ConfirmPaymentIntentParams.c cVar, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ Card c(Card card, String str, String str2, ConfirmPaymentIntentParams.c cVar, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = card.cvc;
            }
            if ((i11 & 2) != 0) {
                str2 = card.network;
            }
            if ((i11 & 4) != 0) {
                cVar = card.setupFutureUsage;
            }
            if ((i11 & 8) != 0) {
                bool = card.moto;
            }
            return card.b(str, str2, cVar, bool);
        }

        @Override // com.stripe.android.model.y0
        public List<Pair<String, Object>> a() {
            Pair pairA = jn0.x.a("cvc", this.cvc);
            Pair pairA2 = jn0.x.a("network", this.network);
            Pair pairA3 = jn0.x.a("moto", this.moto);
            ConfirmPaymentIntentParams.c cVar = this.setupFutureUsage;
            return p013kotlin.collections.v.p(pairA, pairA2, pairA3, jn0.x.a("setup_future_usage", cVar != null ? cVar.getCode() : null));
        }

        public final Card b(String cvc, String network, ConfirmPaymentIntentParams.c setupFutureUsage, Boolean moto) {
            return new Card(cvc, network, setupFutureUsage, moto);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ConfirmPaymentIntentParams.c getSetupFutureUsage() {
            return this.setupFutureUsage;
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
            return p013kotlin.jvm.internal.s.f(this.cvc, card.cvc) && p013kotlin.jvm.internal.s.f(this.network, card.network) && this.setupFutureUsage == card.setupFutureUsage && p013kotlin.jvm.internal.s.f(this.moto, card.moto);
        }

        public int hashCode() {
            String str = this.cvc;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.network;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ConfirmPaymentIntentParams.c cVar = this.setupFutureUsage;
            int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Boolean bool = this.moto;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Card(cvc=" + this.cvc + ", network=" + this.network + ", setupFutureUsage=" + this.setupFutureUsage + ", moto=" + this.moto + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.cvc);
            parcel.writeString(this.network);
            ConfirmPaymentIntentParams.c cVar = this.setupFutureUsage;
            if (cVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cVar.name());
            }
            Boolean bool = this.moto;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public Card(String str, String str2, ConfirmPaymentIntentParams.c cVar, Boolean bool) {
            super(PaymentMethod.p.Card, null);
            this.cvc = str;
            this.network = str2;
            this.setupFutureUsage = cVar;
            this.moto = bool;
        }

        public /* synthetic */ Card(String str, String str2, ConfirmPaymentIntentParams.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : cVar);
        }

        public Card(String str, String str2, ConfirmPaymentIntentParams.c cVar) {
            this(str, str2, cVar, null);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.y0$c, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/y0$c;", "Lcom/stripe/android/model/y0;", "", "confirmationNumber", "<init>", "(Ljava/lang/String;)V", "", "Lkotlin/Pair;", "", "a", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Konbini extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String confirmationNumber;
        public static final Parcelable.Creator<Konbini> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.y0$c$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Konbini> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Konbini createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Konbini(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Konbini[] newArray(int i11) {
                return new Konbini[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Konbini(String confirmationNumber) {
            super(PaymentMethod.p.Konbini, null);
            p013kotlin.jvm.internal.s.k(confirmationNumber, "confirmationNumber");
            this.confirmationNumber = confirmationNumber;
        }

        @Override // com.stripe.android.model.y0
        public List<Pair<String, Object>> a() {
            return p013kotlin.collections.v.e(jn0.x.a("confirmation_number", this.confirmationNumber));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Konbini) && p013kotlin.jvm.internal.s.f(this.confirmationNumber, ((Konbini) other).confirmationNumber);
        }

        public int hashCode() {
            return this.confirmationNumber.hashCode();
        }

        public String toString() {
            return "Konbini(confirmationNumber=" + this.confirmationNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.confirmationNumber);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.y0$d, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\nB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005¨\u0006\""}, d2 = {"Lcom/stripe/android/model/y0$d;", "Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/l$c;", "setupFutureUsage", "<init>", "(Lcom/stripe/android/model/l$c;)V", "", "Lkotlin/Pair;", "", "", "a", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/model/l$c;", "b", "()Lcom/stripe/android/model/l$c;", "setSetupFutureUsage", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class USBankAccount extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private ConfirmPaymentIntentParams.c setupFutureUsage;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f51749e = 8;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.y0$d$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<USBankAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final USBankAccount createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new USBankAccount(parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        public USBankAccount(ConfirmPaymentIntentParams.c cVar) {
            super(PaymentMethod.p.USBankAccount, null);
            this.setupFutureUsage = cVar;
        }

        @Override // com.stripe.android.model.y0
        public List<Pair<String, Object>> a() {
            ConfirmPaymentIntentParams.c cVar = this.setupFutureUsage;
            return p013kotlin.collections.v.e(jn0.x.a("setup_future_usage", cVar != null ? cVar.getCode() : null));
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ConfirmPaymentIntentParams.c getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof USBankAccount) && this.setupFutureUsage == ((USBankAccount) other).setupFutureUsage;
        }

        public int hashCode() {
            ConfirmPaymentIntentParams.c cVar = this.setupFutureUsage;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "USBankAccount(setupFutureUsage=" + this.setupFutureUsage + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            ConfirmPaymentIntentParams.c cVar = this.setupFutureUsage;
            if (cVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cVar.name());
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.y0$e, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0005¨\u0006 "}, d2 = {"Lcom/stripe/android/model/y0$e;", "Lcom/stripe/android/model/y0;", "", "appId", "<init>", "(Ljava/lang/String;)V", "", "Lkotlin/Pair;", "", "a", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "getAppId", "setAppId", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WeChatPay extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private String appId;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f51752e = 8;
        public static final Parcelable.Creator<WeChatPay> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.y0$e$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<WeChatPay> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeChatPay createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new WeChatPay(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WeChatPay[] newArray(int i11) {
                return new WeChatPay[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeChatPay(String appId) {
            super(PaymentMethod.p.WeChatPay, null);
            p013kotlin.jvm.internal.s.k(appId, "appId");
            this.appId = appId;
        }

        @Override // com.stripe.android.model.y0
        public List<Pair<String, Object>> a() {
            return p013kotlin.collections.v.p(jn0.x.a("client", "android"), jn0.x.a("app_id", this.appId));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WeChatPay) && p013kotlin.jvm.internal.s.f(this.appId, ((WeChatPay) other).appId);
        }

        public int hashCode() {
            return this.appId.hashCode();
        }

        public String toString() {
            return "WeChatPay(appId=" + this.appId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.appId);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/y0$f;", "Lcom/stripe/android/model/y0;", "<init>", "()V", "", "Lkotlin/Pair;", "", "", "a", "()Ljava/util/List;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f51754c = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                parcel.readInt();
                return f.f51754c;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        private f() {
            super(PaymentMethod.p.WeChatPay, null);
        }

        @Override // com.stripe.android.model.y0
        public List<Pair<String, Object>> a() {
            return p013kotlin.collections.v.e(jn0.x.a("client", "mobile_web"));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ y0(PaymentMethod.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar);
    }

    public abstract List<Pair<String, Object>> a();

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        List<Pair<String, Object>> listA = a();
        Map mapI = p013kotlin.collections.v0.i();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            Object objB = pair.b();
            Map mapF = objB != null ? p013kotlin.collections.v0.f(jn0.x.a(str, objB)) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            mapI = p013kotlin.collections.v0.r(mapI, mapF);
        }
        return !mapI.isEmpty() ? p013kotlin.collections.v0.f(jn0.x.a(this.type.code, mapI)) : p013kotlin.collections.v0.i();
    }

    private y0(PaymentMethod.p pVar) {
        this.type = pVar;
    }
}
