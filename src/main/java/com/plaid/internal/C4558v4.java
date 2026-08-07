package com.plaid.internal;

import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: com.plaid.internal.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@ro0.p
public final class C4558v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f48178d;

    /* JADX INFO: renamed from: com.plaid.internal.v4$a */
    @jn0.e
    public static final class a implements vo0.e0<C4558v4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ vo0.m1 f48180b;

        static {
            a aVar = new a();
            f48179a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.plaid.internal.url.OutOfProcessWebviewFallbackJson", aVar, 4);
            m1Var.o("mode", false);
            m1Var.o(ImagesContract.URL, false);
            m1Var.o("webview_fallback_id", false);
            m1Var.o("channel_from_webview", false);
            f48180b = m1Var;
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{vo0.j0.f119632a, z1Var, z1Var, A.a.f46192a};
        }

        @Override // ro0.c
        public final Object deserialize(uo0.e decoder) {
            int iE;
            int i11;
            String str;
            String str2;
            A a11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            vo0.m1 m1Var = f48180b;
            uo0.c cVarB = decoder.b(m1Var);
            if (cVarB.i()) {
                iE = cVarB.e(m1Var, 0);
                String strT = cVarB.t(m1Var, 1);
                String strT2 = cVarB.t(m1Var, 2);
                a11 = (A) cVarB.n(m1Var, 3, A.a.f46192a, null);
                str2 = strT2;
                str = strT;
                i11 = 15;
            } else {
                boolean z11 = true;
                iE = 0;
                String strT3 = null;
                String strT4 = null;
                A a12 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(m1Var);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        iE = cVarB.e(m1Var, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT3 = cVarB.t(m1Var, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        strT4 = cVarB.t(m1Var, 2);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        a12 = (A) cVarB.n(m1Var, 3, A.a.f46192a, a12);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT3;
                str2 = strT4;
                a11 = a12;
            }
            int i13 = iE;
            cVarB.c(m1Var);
            return new C4558v4(i11, i13, str, str2, a11);
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return f48180b;
        }

        @Override // ro0.q
        public final void serialize(uo0.f encoder, Object obj) {
            C4558v4 value = (C4558v4) obj;
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            vo0.m1 m1Var = f48180b;
            uo0.d dVarB = encoder.b(m1Var);
            dVarB.x(m1Var, 0, value.f48175a);
            dVarB.e(m1Var, 1, value.f48176b);
            dVarB.e(m1Var, 2, value.f48177c);
            dVarB.D(m1Var, 3, A.a.f46192a, value.f48178d);
            dVarB.c(m1Var);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    @jn0.e
    public C4558v4(int i11, @ro0.o("mode") int i12, @ro0.o(ImagesContract.URL) String str, @ro0.o("webview_fallback_id") String str2, @ro0.o("channel_from_webview") A a11) {
        if (15 != (i11 & 15)) {
            vo0.h1.b(i11, 15, a.f48180b);
        }
        this.f48175a = i12;
        this.f48176b = str;
        this.f48177c = str2;
        this.f48178d = a11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4558v4)) {
            return false;
        }
        C4558v4 c4558v4 = (C4558v4) obj;
        return this.f48175a == c4558v4.f48175a && p013kotlin.jvm.internal.s.f(this.f48176b, c4558v4.f48176b) && p013kotlin.jvm.internal.s.f(this.f48177c, c4558v4.f48177c) && p013kotlin.jvm.internal.s.f(this.f48178d, c4558v4.f48178d);
    }

    public final int hashCode() {
        return this.f48178d.hashCode() + C4571x.a(this.f48177c, C4571x.a(this.f48176b, Integer.hashCode(this.f48175a) * 31, 31), 31);
    }

    public final String toString() {
        return "OutOfProcessWebviewFallbackJson(mode=" + this.f48175a + ", url=" + this.f48176b + ", webviewFallbackId=" + this.f48177c + ", channelInfo=" + this.f48178d + ")";
    }
}
