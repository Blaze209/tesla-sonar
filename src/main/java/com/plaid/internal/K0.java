package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class K0 implements Parcelable {
    public static final Parcelable.Creator<K0> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46379a;

    @jn0.e
    public static final class a implements vo0.e0<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46381b;

        static {
            a aVar = new a();
            f46380a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.models.EmbeddedOpenLinkActionWithInstitutionId", aVar, 1);
            m1Var.o("institution_id", false);
            f46381b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            String strT;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46381b;
            uo0.c cVarB = decoder.b(m1Var);
            int i11 = 1;
            if (cVarB.i()) {
                strT = cVarB.t(m1Var, 0);
            } else {
                strT = null;
                boolean z11 = true;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        strT = cVarB.t(m1Var, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(m1Var);
            return new K0(i11, strT);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46381b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            K0 value = (K0) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46381b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.e(m1Var, 0, value.f46379a);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<K0> {
        @Override // android.os.Parcelable.Creator
        public final K0 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new K0(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final K0[] newArray(int i11) {
            return new K0[i11];
        }
    }

    @jn0.e
    public K0(int i11, @ro0.o("institution_id") String str) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f46381b);
        }
        this.f46379a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K0) && p013kotlin.jvm.internal.s.f(this.f46379a, ((K0) obj).f46379a);
    }

    public final int hashCode() {
        return this.f46379a.hashCode();
    }

    public final String toString() {
        return "EmbeddedOpenLinkActionWithInstitutionId(institutionId=" + this.f46379a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeString(this.f46379a);
    }

    public K0(String institutionId) {
        p013kotlin.jvm.internal.s.k(institutionId, "institutionId");
        this.f46379a = institutionId;
    }
}
