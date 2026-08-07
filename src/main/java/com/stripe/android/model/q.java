package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/q;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "a", "b", "Lcom/stripe/android/model/q$a;", "Lcom/stripe/android/model/q$b;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface q extends o1, Parcelable {

    /* JADX INFO: renamed from: com.stripe.android.model.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/q$a;", "Lcom/stripe/android/model/q;", "", "bankAccountId", "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BankAccount implements q {
        public static final Parcelable.Creator<BankAccount> CREATOR = new C0907a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bankAccountId;

        /* JADX INFO: renamed from: com.stripe.android.model.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0907a implements Parcelable.Creator<BankAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BankAccount createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BankAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BankAccount[] newArray(int i11) {
                return new BankAccount[i11];
            }
        }

        public BankAccount(String bankAccountId) {
            p013kotlin.jvm.internal.s.k(bankAccountId, "bankAccountId");
            this.bankAccountId = bankAccountId;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            return p013kotlin.collections.v0.m(jn0.x.a("type", "bank_account"), jn0.x.a("bank_account", p013kotlin.collections.v0.f(jn0.x.a("account", this.bankAccountId))));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BankAccount) && p013kotlin.jvm.internal.s.f(this.bankAccountId, ((BankAccount) other).bankAccountId);
        }

        public int hashCode() {
            return this.bankAccountId.hashCode();
        }

        public String toString() {
            return "BankAccount(bankAccountId=" + this.bankAccountId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bankAccountId);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.q$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\u001cB+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/stripe/android/model/q$b;", "Lcom/stripe/android/model/q;", "", "", "", "cardPaymentMethodCreateParamsMap", Scopes.EMAIL, "", "active", "<init>", "(Ljava/util/Map;Ljava/lang/String;Z)V", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Card implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> cardPaymentMethodCreateParamsMap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean active;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Card> CREATOR = new C0908b();

        /* JADX INFO: renamed from: com.stripe.android.model.q$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/q$b$a;", "", "<init>", "()V", "", "", "paymentMethodCreateParams", "a", "(Ljava/util/Map;)Ljava/util/Map;", "BASE_PARAM_CARD", "Ljava/lang/String;", "BASE_PARAM_CARD_EXPIRY_MONTH", "BASE_PARAM_CARD_EXPIRY_YEAR", "BASE_PARAM_CARD_NUMBER", "BASE_PARAM_NETWORKS", "BASE_PARAM_PREFERRED", "LINK_PARAM_BILLING_EMAIL_ADDRESS", "LINK_PARAM_CARD", "LINK_PARAM_PREFERRED_NETWORK", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Map<String, Map<String, Object>> a(Map<String, ? extends Object> paymentMethodCreateParams) {
                p013kotlin.jvm.internal.s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
                Object obj = paymentMethodCreateParams.get("card");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map != null) {
                    return p013kotlin.collections.v0.f(jn0.x.a("card", p013kotlin.collections.v0.f(jn0.x.a("cvc", map.get("cvc")))));
                }
                return null;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.q$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0908b implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(Card.class.getClassLoader()));
                }
                return new Card(linkedHashMap, parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public Card(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap, String email, boolean z11) {
            p013kotlin.jvm.internal.s.k(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            p013kotlin.jvm.internal.s.k(email, "email");
            this.cardPaymentMethodCreateParamsMap = cardPaymentMethodCreateParamsMap;
            this.email = email;
            this.active = z11;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map<String, Object> mapO = p013kotlin.collections.v0.o(jn0.x.a("type", "card"), jn0.x.a("active", Boolean.valueOf(this.active)), jn0.x.a("billing_email_address", this.email));
            Pair<String, Object> pairA = r.a(this.cardPaymentMethodCreateParamsMap);
            if (pairA != null) {
                mapO.put(pairA.e(), pairA.f());
            }
            Object obj = this.cardPaymentMethodCreateParamsMap.get("card");
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (p013kotlin.collections.v.g0(p013kotlin.collections.d1.i(InquiryField.FloatField.TYPE2, "exp_month", "exp_year"), entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map mapD = p013kotlin.collections.v0.D(linkedHashMap);
                Object obj2 = map.get("networks");
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                Object obj3 = map2 != null ? map2.get("preferred") : null;
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null) {
                    mapD.put("preferred_network", str);
                }
                mapO.put("card", p013kotlin.collections.v0.A(mapD));
            }
            return mapO;
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
            return p013kotlin.jvm.internal.s.f(this.cardPaymentMethodCreateParamsMap, card.cardPaymentMethodCreateParamsMap) && p013kotlin.jvm.internal.s.f(this.email, card.email) && this.active == card.active;
        }

        public int hashCode() {
            return (((this.cardPaymentMethodCreateParamsMap.hashCode() * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.active);
        }

        public String toString() {
            return "Card(cardPaymentMethodCreateParamsMap=" + this.cardPaymentMethodCreateParamsMap + ", email=" + this.email + ", active=" + this.active + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Map<String, Object> map = this.cardPaymentMethodCreateParamsMap;
            parcel.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
            parcel.writeString(this.email);
            parcel.writeInt(this.active ? 1 : 0);
        }
    }
}
