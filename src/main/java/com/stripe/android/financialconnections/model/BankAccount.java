package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002%*B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b%\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u0017¨\u00061"}, d2 = {"Lcom/stripe/android/financialconnections/model/c;", "Lcom/stripe/android/financialconnections/model/f0;", "", "id", "last4", "bankName", "routingNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lcom/stripe/android/financialconnections/model/c;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "getLast4$annotations", "getBankName$annotations", DateTokenConverter.CONVERTER_KEY, "getRoutingNumber", "getRoutingNumber$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class BankAccount extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String last4;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bankName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String routingNumber;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BankAccount> CREATOR = new C0832c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/BankAccount.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/c;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/c;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/c;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<BankAccount> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50407a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50407a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.BankAccount", aVar, 4);
            m1Var.o("id", false);
            m1Var.o("last4", false);
            m1Var.o("bank_name", true);
            m1Var.o("routing_number", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BankAccount deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                String strT3 = cVarB.t(descriptor2, 1);
                z1 z1Var = z1.f119730a;
                String str5 = (String) cVarB.v(descriptor2, 2, z1Var, null);
                str = strT2;
                str4 = (String) cVarB.v(descriptor2, 3, z1Var, null);
                str3 = str5;
                str2 = strT3;
                i11 = 15;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT4 = null;
                String str6 = null;
                String str7 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT4 = cVarB.t(descriptor2, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str6 = (String) cVarB.v(descriptor2, 2, z1.f119730a, str6);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        str7 = (String) cVarB.v(descriptor2, 3, z1.f119730a, str7);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT;
                str2 = strT4;
                str3 = str6;
                str4 = str7;
            }
            cVarB.c(descriptor2);
            return new BankAccount(i11, str, str2, str3, str4, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, BankAccount value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            BankAccount.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, so0.a.p(z1Var), so0.a.p(z1Var)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/c$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/c;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<BankAccount> serializer() {
            return a.f50407a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C0832c implements Parcelable.Creator<BankAccount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccount createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccount[] newArray(int i11) {
            return new BankAccount[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @jn0.e
    public /* synthetic */ BankAccount(int i11, @ro0.o("id") String str, @ro0.o("last4") String str2, @ro0.o("bank_name") String str3, @ro0.o("routing_number") String str4, v1 v1Var) {
        super(null);
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f50407a.getDescriptor());
        }
        this.id = str;
        this.last4 = str2;
        if ((i11 & 4) == 0) {
            this.bankName = null;
        } else {
            this.bankName = str3;
        }
        if ((i11 & 8) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str4;
        }
    }

    public static final /* synthetic */ void c(BankAccount self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.getId());
        output.e(serialDesc, 1, self.last4);
        if (output.G(serialDesc, 2) || self.bankName != null) {
            output.y(serialDesc, 2, z1.f119730a, self.bankName);
        }
        if (!output.G(serialDesc, 3) && self.routingNumber == null) {
            return;
        }
        output.y(serialDesc, 3, z1.f119730a, self.routingNumber);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLast4() {
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
        if (!(other instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) other;
        return p013kotlin.jvm.internal.s.f(this.id, bankAccount.id) && p013kotlin.jvm.internal.s.f(this.last4, bankAccount.last4) && p013kotlin.jvm.internal.s.f(this.bankName, bankAccount.bankName) && p013kotlin.jvm.internal.s.f(this.routingNumber, bankAccount.routingNumber);
    }

    @Override // com.stripe.android.financialconnections.model.f0
    public String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.last4.hashCode()) * 31;
        String str = this.bankName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.id + ", last4=" + this.last4 + ", bankName=" + this.bankName + ", routingNumber=" + this.routingNumber + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.last4);
        parcel.writeString(this.bankName);
        parcel.writeString(this.routingNumber);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccount(String id2, String last4, String str, String str2) {
        super(null);
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(last4, "last4");
        this.id = id2;
        this.last4 = last4;
        this.bankName = str;
        this.routingNumber = str2;
    }
}
