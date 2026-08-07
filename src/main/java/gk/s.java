package gk;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f69127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69128b;

    static {
        s sVar = new s();
        f69127a = sVar;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogMetadataDto", sVar, 4);
        m1Var.o(AnalyticsAttribute.Error, true);
        m1Var.o("result", true);
        m1Var.o("request", true);
        m1Var.o("response", true);
        f69128b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        return new ro0.d[]{so0.a.p(d1.f69031a), so0.a.p(vo0.z1.f119730a), so0.a.p(f0.f69051a), so0.a.p(k0.f69079a)};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        k1 k1Var;
        String str;
        h0 h0Var;
        s0 s0Var;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69128b;
        uo0.c cVarB = decoder.b(m1Var);
        k1 k1Var2 = null;
        if (cVarB.i()) {
            k1 k1Var3 = (k1) cVarB.v(m1Var, 0, d1.f69031a, null);
            String str2 = (String) cVarB.v(m1Var, 1, vo0.z1.f119730a, null);
            h0 h0Var2 = (h0) cVarB.v(m1Var, 2, f0.f69051a, null);
            k1Var = k1Var3;
            s0Var = (s0) cVarB.v(m1Var, 3, k0.f69079a, null);
            h0Var = h0Var2;
            str = str2;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str3 = null;
            h0 h0Var3 = null;
            s0 s0Var2 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    k1Var2 = (k1) cVarB.v(m1Var, 0, d1.f69031a, k1Var2);
                    i12 |= 1;
                } else if (iA == 1) {
                    str3 = (String) cVarB.v(m1Var, 1, vo0.z1.f119730a, str3);
                    i12 |= 2;
                } else if (iA == 2) {
                    h0Var3 = (h0) cVarB.v(m1Var, 2, f0.f69051a, h0Var3);
                    i12 |= 4;
                } else {
                    if (iA != 3) {
                        throw new UnknownFieldException(iA);
                    }
                    s0Var2 = (s0) cVarB.v(m1Var, 3, k0.f69079a, s0Var2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            k1Var = k1Var2;
            str = str3;
            h0Var = h0Var3;
            s0Var = s0Var2;
        }
        cVarB.c(m1Var);
        return new x(i11, k1Var, str, h0Var, s0Var);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69128b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        x value = (x) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69128b;
        uo0.d dVarB = encoder.b(m1Var);
        if (dVarB.G(m1Var, 0) || value.f69153a != null) {
            dVarB.y(m1Var, 0, d1.f69031a, value.f69153a);
        }
        if (dVarB.G(m1Var, 1) || value.f69154b != null) {
            dVarB.y(m1Var, 1, vo0.z1.f119730a, value.f69154b);
        }
        if (dVarB.G(m1Var, 2) || value.f69155c != null) {
            dVarB.y(m1Var, 2, f0.f69051a, value.f69155c);
        }
        if (dVarB.G(m1Var, 3) || value.f69156d != null) {
            dVarB.y(m1Var, 3, k0.f69079a, value.f69156d);
        }
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
