package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002\"\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0014¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/model/a;", "Landroid/os/Parcelable;", "", "dataAccessNotice", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lcom/stripe/android/financialconnections/model/a;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getDataAccessNotice$annotations", "()V", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class AccountPickerPane implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataAccessNotice;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AccountPickerPane> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a$a, reason: collision with other inner class name */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/AccountPickerPane.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/a;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/a;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/a;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0830a implements vo0.e0<AccountPickerPane> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0830a f50382a;
        private static final /* synthetic */ m1 descriptor;

        static {
            C0830a c0830a = new C0830a();
            f50382a = c0830a;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.AccountPickerPane", c0830a, 1);
            m1Var.o("data_access_notice", false);
            descriptor = m1Var;
        }

        private C0830a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountPickerPane deserialize(uo0.e decoder) {
            String str;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i11 = 1;
            v1 v1Var = null;
            if (cVarB.i()) {
                str = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        str = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, str);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new AccountPickerPane(i11, str, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, AccountPickerPane value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            AccountPickerPane.b(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{n50.d.f93345a};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/a$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/a;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<AccountPickerPane> serializer() {
            return C0830a.f50382a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AccountPickerPane> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountPickerPane createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new AccountPickerPane(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountPickerPane[] newArray(int i11) {
            return new AccountPickerPane[i11];
        }
    }

    @jn0.e
    public /* synthetic */ AccountPickerPane(int i11, @ro0.o("data_access_notice") @ro0.p(with = n50.d.class) String str, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, C0830a.f50382a.getDescriptor());
        }
        this.dataAccessNotice = str;
    }

    public static final /* synthetic */ void b(AccountPickerPane self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, n50.d.f93345a, self.dataAccessNotice);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountPickerPane) && p013kotlin.jvm.internal.s.f(this.dataAccessNotice, ((AccountPickerPane) other).dataAccessNotice);
    }

    public int hashCode() {
        return this.dataAccessNotice.hashCode();
    }

    public String toString() {
        return "AccountPickerPane(dataAccessNotice=" + this.dataAccessNotice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.dataAccessNotice);
    }

    public AccountPickerPane(String dataAccessNotice) {
        p013kotlin.jvm.internal.s.k(dataAccessNotice, "dataAccessNotice");
        this.dataAccessNotice = dataAccessNotice;
    }
}
