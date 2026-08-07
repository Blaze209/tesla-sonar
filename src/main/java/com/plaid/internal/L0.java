package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class L0 implements Parcelable {
    public static final Parcelable.Creator<L0> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0 f46414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K0 f46415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J0 f46416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46417e;

    @jn0.e
    public static final class a implements vo0.e0<L0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46419b;

        static {
            a aVar = new a();
            f46418a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.models.EmbeddedOpenLinkConfiguration", aVar, 5);
            m1Var.o("embedded_workflow_session_id", false);
            m1Var.o("open_link_action_default", true);
            m1Var.o("open_link_action_with_institution_id", true);
            m1Var.o("open_link_action_link_with_account_numbers", true);
            m1Var.o("is_polling", true);
            f46419b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a, so0.a.p(I0.a.f46344a), so0.a.p(K0.a.f46380a), so0.a.p(J0.a.f46365a), vo0.h.f119620a};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            String str;
            I0 i12;
            K0 k11;
            J0 j11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46419b;
            uo0.c cVarB = decoder.b(m1Var);
            if (cVarB.i()) {
                String strT = cVarB.t(m1Var, 0);
                I0 i13 = (I0) cVarB.v(m1Var, 1, I0.a.f46344a, null);
                K0 k12 = (K0) cVarB.v(m1Var, 2, K0.a.f46380a, null);
                str = strT;
                j11 = (J0) cVarB.v(m1Var, 3, J0.a.f46365a, null);
                zW = cVarB.w(m1Var, 4);
                k11 = k12;
                i12 = i13;
                i11 = 31;
            } else {
                boolean z11 = true;
                boolean zW2 = false;
                String strT2 = null;
                I0 i14 = null;
                K0 k13 = null;
                J0 j12 = null;
                int i15 = 0;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT2 = cVarB.t(m1Var, 0);
                        i15 |= 1;
                    } else if (iA == 1) {
                        i14 = (I0) cVarB.v(m1Var, 1, I0.a.f46344a, i14);
                        i15 |= 2;
                    } else if (iA == 2) {
                        k13 = (K0) cVarB.v(m1Var, 2, K0.a.f46380a, k13);
                        i15 |= 4;
                    } else if (iA == 3) {
                        j12 = (J0) cVarB.v(m1Var, 3, J0.a.f46365a, j12);
                        i15 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        zW2 = cVarB.w(m1Var, 4);
                        i15 |= 16;
                    }
                }
                zW = zW2;
                i11 = i15;
                str = strT2;
                i12 = i14;
                k11 = k13;
                j11 = j12;
            }
            cVarB.c(m1Var);
            return new L0(i11, str, i12, k11, j11, zW);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46419b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            L0 value = (L0) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46419b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.e(m1Var, 0, value.f46413a);
            if (dVarB.G(m1Var, 1) || value.f46414b != null) {
                dVarB.y(m1Var, 1, I0.a.f46344a, value.f46414b);
            }
            if (dVarB.G(m1Var, 2) || value.f46415c != null) {
                dVarB.y(m1Var, 2, K0.a.f46380a, value.f46415c);
            }
            if (dVarB.G(m1Var, 3) || value.f46416d != null) {
                dVarB.y(m1Var, 3, J0.a.f46365a, value.f46416d);
            }
            if (dVarB.G(m1Var, 4) || value.f46417e) {
                dVarB.A(m1Var, 4, value.f46417e);
            }
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<L0> {
        @Override // android.os.Parcelable.Creator
        public final L0 createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new L0(parcel.readString(), parcel.readInt() == 0 ? null : I0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : K0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? J0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final L0[] newArray(int i11) {
            return new L0[i11];
        }
    }

    @jn0.e
    public L0(int i11, @ro0.o("embedded_workflow_session_id") String str, @ro0.o("open_link_action_default") I0 i12, @ro0.o("open_link_action_with_institution_id") K0 k11, @ro0.o("open_link_action_link_with_account_numbers") J0 j11, @ro0.o("is_polling") boolean z11) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f46419b);
        }
        this.f46413a = str;
        if ((i11 & 2) == 0) {
            this.f46414b = null;
        } else {
            this.f46414b = i12;
        }
        if ((i11 & 4) == 0) {
            this.f46415c = null;
        } else {
            this.f46415c = k11;
        }
        if ((i11 & 8) == 0) {
            this.f46416d = null;
        } else {
            this.f46416d = j11;
        }
        if ((i11 & 16) == 0) {
            this.f46417e = false;
        } else {
            this.f46417e = z11;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l11 = (L0) obj;
        return p013kotlin.jvm.internal.s.f(this.f46413a, l11.f46413a) && p013kotlin.jvm.internal.s.f(this.f46414b, l11.f46414b) && p013kotlin.jvm.internal.s.f(this.f46415c, l11.f46415c) && p013kotlin.jvm.internal.s.f(this.f46416d, l11.f46416d) && this.f46417e == l11.f46417e;
    }

    public final int hashCode() {
        int iHashCode = this.f46413a.hashCode() * 31;
        I0 i11 = this.f46414b;
        int iHashCode2 = (iHashCode + (i11 == null ? 0 : i11.hashCode())) * 31;
        K0 k11 = this.f46415c;
        int iHashCode3 = (iHashCode2 + (k11 == null ? 0 : k11.f46379a.hashCode())) * 31;
        J0 j11 = this.f46416d;
        return Boolean.hashCode(this.f46417e) + ((iHashCode3 + (j11 != null ? j11.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EmbeddedOpenLinkConfiguration(embeddedWorkflowSessionId=" + this.f46413a + ", openLinkActionDefault=" + this.f46414b + ", openLinkActionWithInstitutionId=" + this.f46415c + ", openLinkActionLinkWithAccountNumbers=" + this.f46416d + ", isPolling=" + this.f46417e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeString(this.f46413a);
        if (this.f46414b == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeInt(1);
        }
        K0 k11 = this.f46415c;
        if (k11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeString(k11.f46379a);
        }
        if (this.f46416d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            p013kotlin.jvm.internal.s.k(out, "out");
            out.writeInt(1);
        }
        out.writeInt(this.f46417e ? 1 : 0);
    }

    public L0(String embeddedWorkflowSessionId, I0 i11, K0 k11, J0 j11, boolean z11) {
        p013kotlin.jvm.internal.s.k(embeddedWorkflowSessionId, "embeddedWorkflowSessionId");
        this.f46413a = embeddedWorkflowSessionId;
        this.f46414b = i11;
        this.f46415c = k11;
        this.f46416d = j11;
        this.f46417e = z11;
    }
}
