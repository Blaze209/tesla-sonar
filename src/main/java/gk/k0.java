package gk;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f69079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69080b;

    static {
        k0 k0Var = new k0();
        f69079a = k0Var;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogResponseDto", k0Var, 4);
        m1Var.o("status_code", true);
        m1Var.o("result", true);
        m1Var.o("latency", true);
        m1Var.o(AnalyticsAttribute.Error, true);
        f69080b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        return new ro0.d[]{so0.a.p(vo0.j0.f119632a), so0.a.p(s0.f69130f[1]), so0.a.p(vo0.s0.f119686a), so0.a.p(d1.f69031a)};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        Integer num;
        f fVar;
        Long l11;
        k1 k1Var;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69080b;
        uo0.c cVarB = decoder.b(m1Var);
        ro0.d[] dVarArr = s0.f69130f;
        Integer num2 = null;
        if (cVarB.i()) {
            Integer num3 = (Integer) cVarB.v(m1Var, 0, vo0.j0.f119632a, null);
            f fVar2 = (f) cVarB.v(m1Var, 1, dVarArr[1], null);
            Long l12 = (Long) cVarB.v(m1Var, 2, vo0.s0.f119686a, null);
            fVar = fVar2;
            num = num3;
            k1Var = (k1) cVarB.v(m1Var, 3, d1.f69031a, null);
            l11 = l12;
            i11 = 15;
        } else {
            boolean z11 = true;
            int i12 = 0;
            f fVar3 = null;
            Long l13 = null;
            k1 k1Var2 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    num2 = (Integer) cVarB.v(m1Var, 0, vo0.j0.f119632a, num2);
                    i12 |= 1;
                } else if (iA == 1) {
                    fVar3 = (f) cVarB.v(m1Var, 1, dVarArr[1], fVar3);
                    i12 |= 2;
                } else if (iA == 2) {
                    l13 = (Long) cVarB.v(m1Var, 2, vo0.s0.f119686a, l13);
                    i12 |= 4;
                } else {
                    if (iA != 3) {
                        throw new UnknownFieldException(iA);
                    }
                    k1Var2 = (k1) cVarB.v(m1Var, 3, d1.f69031a, k1Var2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            num = num2;
            fVar = fVar3;
            l11 = l13;
            k1Var = k1Var2;
        }
        cVarB.c(m1Var);
        return new s0(i11, num, fVar, l11, k1Var);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69080b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        s0 value = (s0) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69080b;
        uo0.d dVarB = encoder.b(m1Var);
        ro0.d[] dVarArr = s0.f69130f;
        if (dVarB.G(m1Var, 0) || value.f69131a != null) {
            dVarB.y(m1Var, 0, vo0.j0.f119632a, value.f69131a);
        }
        if (dVarB.G(m1Var, 1) || value.f69132b != null) {
            dVarB.y(m1Var, 1, dVarArr[1], value.f69132b);
        }
        if (dVarB.G(m1Var, 2) || value.f69133c != null) {
            dVarB.y(m1Var, 2, vo0.s0.f119686a, value.f69133c);
        }
        if (dVarB.G(m1Var, 3) || value.f69134d != null) {
            dVarB.y(m1Var, 3, d1.f69031a, value.f69134d);
        }
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
