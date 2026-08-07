package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000245B\u0081\u0001\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b)\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b*\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b,\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b.\u00103¨\u00066"}, d2 = {"Lcom/stripe/android/model/BankAccount;", "Lt30/f;", "", "", "id", "accountHolderName", "Lcom/stripe/android/model/BankAccount$Type;", "accountHolderType", "bankName", "countryCode", "currency", "fingerprint", "last4", "routingNumber", "Lcom/stripe/android/model/BankAccount$Status;", PermissionsResponse.STATUS_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "c", "Lcom/stripe/android/model/BankAccount$Type;", "()Lcom/stripe/android/model/BankAccount$Type;", DateTokenConverter.CONVERTER_KEY, "e", "getCountryCode", "f", "getCurrency", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Lcom/stripe/android/model/BankAccount$Status;", "()Lcom/stripe/android/model/BankAccount$Status;", "Status", "Type", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BankAccount implements t30.f, Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountHolderName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Type accountHolderType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bankName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fingerprint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String last4;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String routingNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Status status;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/BankAccount$Status;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode$payments_model_release", "Companion", "a", "New", "Validated", "Verified", "VerificationFailed", "Errored", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Status {
        New("new"),
        Validated("validated"),
        Verified("verified"),
        VerificationFailed("verification_failed"),
        Errored("errored");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.BankAccount$Status$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/BankAccount$Status$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/BankAccount$Status;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/BankAccount$Status;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status a(String code) {
                Status next;
                Iterator<Status> it = Status.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        Status(String str) {
            this.code = str;
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$payments_model_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/BankAccount$Type;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode$payments_model_release", "Companion", "a", "Company", "Individual", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Type {
        Company("company"),
        Individual(Kind.INDIVIDUAL);

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.BankAccount$Type$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/BankAccount$Type$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/BankAccount$Type;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/BankAccount$Type;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type a(String code) {
                Type next;
                Iterator<Type> it = Type.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        Type(String str) {
            this.code = str;
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$payments_model_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BankAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccount createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Status.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccount[] newArray(int i11) {
            return new BankAccount[i11];
        }
    }

    public BankAccount() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountHolderName() {
        return this.accountHolderName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Type getAccountHolderType() {
        return this.accountHolderType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) other;
        return p013kotlin.jvm.internal.s.f(this.id, bankAccount.id) && p013kotlin.jvm.internal.s.f(this.accountHolderName, bankAccount.accountHolderName) && this.accountHolderType == bankAccount.accountHolderType && p013kotlin.jvm.internal.s.f(this.bankName, bankAccount.bankName) && p013kotlin.jvm.internal.s.f(this.countryCode, bankAccount.countryCode) && p013kotlin.jvm.internal.s.f(this.currency, bankAccount.currency) && p013kotlin.jvm.internal.s.f(this.fingerprint, bankAccount.fingerprint) && p013kotlin.jvm.internal.s.f(this.last4, bankAccount.last4) && p013kotlin.jvm.internal.s.f(this.routingNumber, bankAccount.routingNumber) && this.status == bankAccount.status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountHolderName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.accountHolderType;
        int iHashCode3 = (iHashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str3 = this.bankName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fingerprint;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.last4;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.routingNumber;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Status status = this.status;
        return iHashCode9 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.id + ", accountHolderName=" + this.accountHolderName + ", accountHolderType=" + this.accountHolderType + ", bankName=" + this.bankName + ", countryCode=" + this.countryCode + ", currency=" + this.currency + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", routingNumber=" + this.routingNumber + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.accountHolderName);
        Type type = this.accountHolderType;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
        parcel.writeString(this.bankName);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.currency);
        parcel.writeString(this.fingerprint);
        parcel.writeString(this.last4);
        parcel.writeString(this.routingNumber);
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.id = str;
        this.accountHolderName = str2;
        this.accountHolderType = type;
        this.bankName = str3;
        this.countryCode = str4;
        this.currency = str5;
        this.fingerprint = str6;
        this.last4 = str7;
        this.routingNumber = str8;
        this.status = status;
    }

    public /* synthetic */ BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : type, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : status);
    }
}
