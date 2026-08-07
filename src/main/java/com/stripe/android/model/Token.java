package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Date;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.p1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0002!(BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b.\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b!\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b$\u00103¨\u00065"}, d2 = {"Lcom/stripe/android/model/p1;", "Lt30/f;", "", "", "id", "Lcom/stripe/android/model/p1$c;", "type", "Ljava/util/Date;", "created", "", "livemode", "used", "Lcom/stripe/android/model/BankAccount;", "bankAccount", "Lcom/stripe/android/model/g;", "card", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/p1$c;Ljava/util/Date;ZZLcom/stripe/android/model/BankAccount;Lcom/stripe/android/model/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "Lcom/stripe/android/model/p1$c;", "e", "()Lcom/stripe/android/model/p1$c;", "c", "Ljava/util/Date;", "()Ljava/util/Date;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "f", "Lcom/stripe/android/model/BankAccount;", "()Lcom/stripe/android/model/BankAccount;", "g", "Lcom/stripe/android/model/g;", "()Lcom/stripe/android/model/g;", "h", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Token implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date created;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean livemode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean used;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final BankAccount bankAccount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Card card;
    public static final Parcelable.Creator<Token> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.p1$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Token> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Token createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            Date date = (Date) parcel.readSerializable();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new Token(string, cVarValueOf, date, z11, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BankAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Token[] newArray(int i11) {
            return new Token[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.p1$c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/p1$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "Card", "BankAccount", "Pii", "Account", "CvcUpdate", "Person", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        Card("card"),
        BankAccount("bank_account"),
        Pii("pii"),
        Account("account"),
        CvcUpdate("cvc_update"),
        Person("person");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.p1$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/p1$c$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/p1$c;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/p1$c;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String code) {
                c next;
                Iterator<c> it = c.getEntries().iterator();
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

        c(String str) {
            this.code = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public Token(String id2, c type, Date created, boolean z11, boolean z12, BankAccount bankAccount, Card gVar) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(created, "created");
        this.id = id2;
        this.type = type;
        this.created = created;
        this.livemode = z11;
        this.used = z12;
        this.bankAccount = bankAccount;
        this.card = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Date getCreated() {
        return this.created;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Token)) {
            return false;
        }
        Token token = (Token) other;
        return p013kotlin.jvm.internal.s.f(this.id, token.id) && this.type == token.type && p013kotlin.jvm.internal.s.f(this.created, token.created) && this.livemode == token.livemode && this.used == token.used && p013kotlin.jvm.internal.s.f(this.bankAccount, token.bankAccount) && p013kotlin.jvm.internal.s.f(this.card, token.card);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getUsed() {
        return this.used;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.created.hashCode()) * 31) + Boolean.hashCode(this.livemode)) * 31) + Boolean.hashCode(this.used)) * 31;
        BankAccount bankAccount = this.bankAccount;
        int iHashCode2 = (iHashCode + (bankAccount == null ? 0 : bankAccount.hashCode())) * 31;
        Card gVar = this.card;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "Token(id=" + this.id + ", type=" + this.type + ", created=" + this.created + ", livemode=" + this.livemode + ", used=" + this.used + ", bankAccount=" + this.bankAccount + ", card=" + this.card + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.type.name());
        parcel.writeSerializable(this.created);
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeInt(this.used ? 1 : 0);
        BankAccount bankAccount = this.bankAccount;
        if (bankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bankAccount.writeToParcel(parcel, flags);
        }
        Card gVar = this.card;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ Token(String str, c cVar, Date date, boolean z11, boolean z12, BankAccount bankAccount, Card gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, date, z11, z12, (i11 & 32) != 0 ? null : bankAccount, (i11 & 64) != 0 ? null : gVar);
    }
}
