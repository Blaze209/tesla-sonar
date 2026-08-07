package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0002\n\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H ¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148 X \u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00188 X \u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/a1;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/v0$p;", "type", "<init>", "(Lcom/stripe/android/model/v0$p;)V", "", "", "", "a", "()Ljava/util/Map;", "c3", "Lcom/stripe/android/model/v0$p;", "e", "()Lcom/stripe/android/model/v0$p;", "Lcom/stripe/android/model/v0$b;", "b", "()Lcom/stripe/android/model/v0$b;", "allowRedisplay", "Lcom/stripe/android/model/v0$e;", "c", "()Lcom/stripe/android/model/v0$e;", "billingDetails", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "productUsageTokens", "Lcom/stripe/android/model/a1$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a1 implements o1, Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethod.p type;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 72\u00020\u0001:\u0002\u0012#BS\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b#\u0010/R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b'\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/stripe/android/model/a1$a;", "Lcom/stripe/android/model/a1;", "", "expiryMonth", "expiryYear", "Lcom/stripe/android/model/a1$a$c;", "networks", "Lcom/stripe/android/model/v0$e;", "billingDetails", "", "", "productUsageTokens", "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/a1$a$c;Lcom/stripe/android/model/v0$e;Ljava/util/Set;Lcom/stripe/android/model/v0$b;)V", "", "", "a", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/Integer;", "getExpiryMonth", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "getExpiryYear", "e", "Lcom/stripe/android/model/a1$a$c;", "getNetworks", "()Lcom/stripe/android/model/a1$a$c;", "f", "Lcom/stripe/android/model/v0$e;", "()Lcom/stripe/android/model/v0$e;", "g", "Ljava/util/Set;", "()Ljava/util/Set;", "h", "Lcom/stripe/android/model/v0$b;", "b", "()Lcom/stripe/android/model/v0$b;", IntegerTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends a1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer expiryMonth;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer expiryYear;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c networks;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethod.BillingDetails billingDetails;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Set<String> productUsageTokens;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethod.b allowRedisplay;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final C0884a f51062i = new C0884a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f51063j = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.a1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/a1$a$a;", "", "<init>", "()V", "", "PARAM_EXP_MONTH", "Ljava/lang/String;", "PARAM_EXP_YEAR", "PARAM_NETWORKS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C0884a {
            public /* synthetic */ C0884a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0884a() {
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                PaymentMethod.BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(numValueOf, numValueOf2, cVarCreateFromParcel, billingDetailsCreateFromParcel, linkedHashSet, parcel.readInt() != 0 ? PaymentMethod.b.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/a1$a$c;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "preferred", "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getPreferred", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements o1, Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String preferred;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final C0885a f51070b = new C0885a(null);
            public static final Parcelable.Creator<c> CREATOR = new b();

            /* JADX INFO: renamed from: com.stripe.android.model.a1$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/a1$a$c$a;", "", "<init>", "()V", "", "PARAM_PREFERRED", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class C0885a {
                public /* synthetic */ C0885a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0885a() {
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.stripe.android.model.o1
            public Map<String, Object> c3() {
                String str = this.preferred;
                return str != null ? p013kotlin.collections.v0.f(jn0.x.a("preferred", str)) : p013kotlin.collections.v0.i();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return (other instanceof c) && p013kotlin.jvm.internal.s.f(((c) other).preferred, this.preferred);
            }

            public int hashCode() {
                return Objects.hash(this.preferred);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.preferred + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.preferred);
            }

            public c(String str) {
                this.preferred = str;
            }

            public /* synthetic */ c(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, c cVar, PaymentMethod.BillingDetails billingDetails, Set<String> productUsageTokens, PaymentMethod.b bVar) {
            super(PaymentMethod.p.Card, null);
            p013kotlin.jvm.internal.s.k(productUsageTokens, "productUsageTokens");
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.networks = cVar;
            this.billingDetails = billingDetails;
            this.productUsageTokens = productUsageTokens;
            this.allowRedisplay = bVar;
        }

        @Override // com.stripe.android.model.a1
        public Map<String, Object> a() {
            Pair pairA = jn0.x.a("exp_month", this.expiryMonth);
            Pair pairA2 = jn0.x.a("exp_year", this.expiryYear);
            c cVar = this.networks;
            List<Pair> listP = p013kotlin.collections.v.p(pairA, pairA2, jn0.x.a("networks", cVar != null ? cVar.c3() : null));
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listP) {
                Object objF = pair.f();
                Pair pairA3 = objF != null ? jn0.x.a(pair.e(), objF) : null;
                if (pairA3 != null) {
                    arrayList.add(pairA3);
                }
            }
            return p013kotlin.collections.v0.y(arrayList);
        }

        @Override // com.stripe.android.model.a1
        /* JADX INFO: renamed from: b, reason: from getter */
        public PaymentMethod.b getAllowRedisplay() {
            return this.allowRedisplay;
        }

        @Override // com.stripe.android.model.a1
        /* JADX INFO: renamed from: c, reason: from getter */
        public PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        @Override // com.stripe.android.model.a1
        public Set<String> d() {
            return this.productUsageTokens;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return p013kotlin.jvm.internal.s.f(aVar.expiryMonth, this.expiryMonth) && p013kotlin.jvm.internal.s.f(aVar.expiryYear, this.expiryYear) && p013kotlin.jvm.internal.s.f(aVar.networks, this.networks) && p013kotlin.jvm.internal.s.f(aVar.getBillingDetails(), getBillingDetails());
        }

        public int hashCode() {
            return Objects.hash(this.expiryMonth, this.expiryYear, this.networks, getBillingDetails());
        }

        public String toString() {
            return "PaymentMethodCreateParams.Card.(expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", networks=" + this.networks + ", billingDetails=" + getBillingDetails() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
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
            c cVar = this.networks;
            if (cVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cVar.writeToParcel(parcel, flags);
            }
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            if (billingDetails == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                billingDetails.writeToParcel(parcel, flags);
            }
            Set<String> set = this.productUsageTokens;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            PaymentMethod.b bVar = this.allowRedisplay;
            if (bVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bVar.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.a1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/a1$b;", "", "<init>", "()V", "", "expiryMonth", "expiryYear", "Lcom/stripe/android/model/a1$a$c;", "networks", "Lcom/stripe/android/model/v0$e;", "billingDetails", "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "", "", "productUsageTokens", "Lcom/stripe/android/model/a1;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/a1$a$c;Lcom/stripe/android/model/v0$e;Lcom/stripe/android/model/v0$b;Ljava/util/Set;)Lcom/stripe/android/model/a1;", "PARAM_ALLOW_REDISPLAY", "Ljava/lang/String;", "PARAM_BILLING_DETAILS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a1 b(Companion companion, Integer num, Integer num2, a.c cVar, PaymentMethod.BillingDetails billingDetails, PaymentMethod.b bVar, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = null;
            }
            if ((i11 & 2) != 0) {
                num2 = null;
            }
            if ((i11 & 4) != 0) {
                cVar = null;
            }
            if ((i11 & 8) != 0) {
                billingDetails = null;
            }
            if ((i11 & 16) != 0) {
                bVar = null;
            }
            return companion.a(num, num2, cVar, billingDetails, bVar, set);
        }

        public final a1 a(Integer expiryMonth, Integer expiryYear, a.c networks, PaymentMethod.BillingDetails billingDetails, PaymentMethod.b allowRedisplay, Set<String> productUsageTokens) {
            p013kotlin.jvm.internal.s.k(productUsageTokens, "productUsageTokens");
            return new a(expiryMonth, expiryYear, networks, billingDetails, productUsageTokens, allowRedisplay);
        }

        private Companion() {
        }
    }

    public /* synthetic */ a1(PaymentMethod.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar);
    }

    public abstract Map<String, Object> a();

    /* JADX INFO: renamed from: b */
    public abstract PaymentMethod.b getAllowRedisplay();

    /* JADX INFO: renamed from: c */
    public abstract PaymentMethod.BillingDetails getBillingDetails();

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(this.type.code, a()));
        PaymentMethod.BillingDetails billingDetails = getBillingDetails();
        Map mapF2 = billingDetails != null ? p013kotlin.collections.v0.f(jn0.x.a("billing_details", billingDetails.c3())) : null;
        if (mapF2 == null) {
            mapF2 = p013kotlin.collections.v0.i();
        }
        PaymentMethod.b allowRedisplay = getAllowRedisplay();
        Map mapF3 = allowRedisplay != null ? p013kotlin.collections.v0.f(jn0.x.a("allow_redisplay", allowRedisplay.getValue())) : null;
        if (mapF3 == null) {
            mapF3 = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(mapF2, mapF3), mapF);
    }

    public abstract Set<String> d();

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PaymentMethod.p getType() {
        return this.type;
    }

    private a1(PaymentMethod.p pVar) {
        this.type = pVar;
    }
}
