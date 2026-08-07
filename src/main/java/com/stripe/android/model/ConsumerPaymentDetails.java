package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.p, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0019\u001c\u001d\u001eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/p;", "Lt30/f;", "", "Lcom/stripe/android/model/p$e;", "paymentDetails", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", DateTokenConverter.CONVERTER_KEY, "e", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ConsumerPaymentDetails implements t30.f {
    public static final Parcelable.Creator<ConsumerPaymentDetails> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<e> paymentDetails;

    /* JADX INFO: renamed from: com.stripe.android.model.p$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lcom/stripe/android/model/p$a;", "Lcom/stripe/android/model/p$e;", "", "id", "last4", "bankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "getId", DateTokenConverter.CONVERTER_KEY, "a", "e", "b", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BankAccount extends e {
        public static final Parcelable.Creator<BankAccount> CREATOR = new C0906a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String last4;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bankName;

        /* JADX INFO: renamed from: com.stripe.android.model.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0906a implements Parcelable.Creator<BankAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BankAccount createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BankAccount(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BankAccount[] newArray(int i11) {
                return new BankAccount[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String id2, String last4, String str) {
            super(id2, "bank_account", null);
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(last4, "last4");
            this.id = id2;
            this.last4 = last4;
            this.bankName = str;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getLast4() {
            return this.last4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankAccount)) {
                return false;
            }
            BankAccount bankAccount = (BankAccount) other;
            return p013kotlin.jvm.internal.s.f(this.id, bankAccount.id) && p013kotlin.jvm.internal.s.f(this.last4, bankAccount.last4) && p013kotlin.jvm.internal.s.f(this.bankName, bankAccount.bankName);
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.e
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.last4.hashCode()) * 31;
            String str = this.bankName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "BankAccount(id=" + this.id + ", last4=" + this.last4 + ", bankName=" + this.bankName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.last4);
            parcel.writeString(this.bankName);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.p$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/p$b;", "Lcom/stripe/android/model/p$e;", "", "id", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "getId", DateTokenConverter.CONVERTER_KEY, "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Card extends e {
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String last4;

        /* JADX INFO: renamed from: com.stripe.android.model.p$b$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String id2, String last4) {
            super(id2, "card", null);
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(last4, "last4");
            this.id = id2;
            this.last4 = last4;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getLast4() {
            return this.last4;
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
            return p013kotlin.jvm.internal.s.f(this.id, card.id) && p013kotlin.jvm.internal.s.f(this.last4, card.last4);
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.e
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.last4.hashCode();
        }

        public String toString() {
            return "Card(id=" + this.id + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.last4);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.p$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConsumerPaymentDetails> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsumerPaymentDetails createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(ConsumerPaymentDetails.class.getClassLoader()));
            }
            return new ConsumerPaymentDetails(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConsumerPaymentDetails[] newArray(int i11) {
            return new ConsumerPaymentDetails[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.p$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/p$d;", "Lcom/stripe/android/model/p$e;", "", "id", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Ljava/lang/String;", "getId", DateTokenConverter.CONVERTER_KEY, "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Passthrough extends e {
        public static final Parcelable.Creator<Passthrough> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String last4;

        /* JADX INFO: renamed from: com.stripe.android.model.p$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Passthrough> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Passthrough createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Passthrough(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Passthrough[] newArray(int i11) {
                return new Passthrough[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Passthrough(String id2, String last4) {
            super(id2, "card", null);
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(last4, "last4");
            this.id = id2;
            this.last4 = last4;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getLast4() {
            return this.last4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passthrough)) {
                return false;
            }
            Passthrough passthrough = (Passthrough) other;
            return p013kotlin.jvm.internal.s.f(this.id, passthrough.id) && p013kotlin.jvm.internal.s.f(this.last4, passthrough.last4);
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.e
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.last4.hashCode();
        }

        public String toString() {
            return "Passthrough(id=" + this.id + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.last4);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.p$e */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/p$e;", "Landroid/os/Parcelable;", "", "id", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getType", "last4", "Lcom/stripe/android/model/p$a;", "Lcom/stripe/android/model/p$b;", "Lcom/stripe/android/model/p$d;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        public /* synthetic */ e(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* JADX INFO: renamed from: a */
        public abstract String getLast4();

        public String getId() {
            return this.id;
        }

        private e(String str, String str2) {
            this.id = str;
            this.type = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerPaymentDetails(List<? extends e> paymentDetails) {
        p013kotlin.jvm.internal.s.k(paymentDetails, "paymentDetails");
        this.paymentDetails = paymentDetails;
    }

    public final List<e> a() {
        return this.paymentDetails;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConsumerPaymentDetails) && p013kotlin.jvm.internal.s.f(this.paymentDetails, ((ConsumerPaymentDetails) other).paymentDetails);
    }

    public int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.paymentDetails + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        List<e> list = this.paymentDetails;
        parcel.writeInt(list.size());
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }
}
