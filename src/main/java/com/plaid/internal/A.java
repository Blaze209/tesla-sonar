package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46191c;

    @jn0.e
    public static final class a implements vo0.e0<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f46193b;

        static {
            a aVar = new a();
            f46192a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.workflow.model.ChannelInfo", aVar, 3);
            m1Var.o("id", false);
            m1Var.o("secret", false);
            m1Var.o("polling_interval_ms", false);
            f46193b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, vo0.s0.f119686a};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            String strT;
            int i11;
            String strT2;
            long j11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f46193b;
            uo0.c cVarB = decoder.b(m1Var);
            if (cVarB.i()) {
                strT = cVarB.t(m1Var, 0);
                i11 = 7;
                strT2 = cVarB.t(m1Var, 1);
                j11 = cVarB.j(m1Var, 2);
            } else {
                strT = null;
                boolean z11 = true;
                long j12 = 0;
                String strT3 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(m1Var, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT3 = cVarB.t(m1Var, 1);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        j12 = cVarB.j(m1Var, 2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                strT2 = strT3;
                j11 = j12;
            }
            String str = strT;
            cVarB.c(m1Var);
            return new A(i11, str, strT2, j11);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f46193b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            A value = (A) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f46193b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.e(m1Var, 0, value.f46189a);
            dVarB.e(m1Var, 1, value.f46190b);
            dVarB.z(m1Var, 2, value.f46191c);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<A> {
        @Override // android.os.Parcelable.Creator
        public final A createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new A(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final A[] newArray(int i11) {
            return new A[i11];
        }
    }

    @jn0.e
    public A(int i11, @ro0.o("id") String str, @ro0.o("secret") String str2, @ro0.o("polling_interval_ms") long j11) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f46193b);
        }
        this.f46189a = str;
        this.f46190b = str2;
        this.f46191c = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a11 = (A) obj;
        return p013kotlin.jvm.internal.s.f(this.f46189a, a11.f46189a) && p013kotlin.jvm.internal.s.f(this.f46190b, a11.f46190b) && this.f46191c == a11.f46191c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46191c) + C4571x.a(this.f46190b, this.f46189a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChannelInfo(channelId=" + this.f46189a + ", channelSecret=" + this.f46190b + ", pollingInterval=" + this.f46191c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        p013kotlin.jvm.internal.s.k(out, "out");
        out.writeString(this.f46189a);
        out.writeString(this.f46190b);
        out.writeLong(this.f46191c);
    }

    public A(long j11, String channelId, String channelSecret) {
        p013kotlin.jvm.internal.s.k(channelId, "channelId");
        p013kotlin.jvm.internal.s.k(channelSecret, "channelSecret");
        this.f46189a = channelId;
        this.f46190b = channelSecret;
        this.f46191c = j11;
    }
}
