package gk;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f69159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69160b;

    static {
        y yVar = new y();
        f69159a = yVar;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogPlatformDto", yVar, 3);
        m1Var.o("name", false);
        m1Var.o("version", false);
        m1Var.o("identifier", true);
        f69160b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        vo0.z1 z1Var = vo0.z1.f119730a;
        return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var)};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        String str;
        String str2;
        String str3;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69160b;
        uo0.c cVarB = decoder.b(m1Var);
        String str4 = null;
        if (cVarB.i()) {
            vo0.z1 z1Var = vo0.z1.f119730a;
            str = (String) cVarB.v(m1Var, 0, z1Var, null);
            str2 = (String) cVarB.v(m1Var, 1, z1Var, null);
            str3 = (String) cVarB.v(m1Var, 2, z1Var, null);
            i11 = 7;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str5 = null;
            String str6 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    str4 = (String) cVarB.v(m1Var, 0, vo0.z1.f119730a, str4);
                    i12 |= 1;
                } else if (iA == 1) {
                    str5 = (String) cVarB.v(m1Var, 1, vo0.z1.f119730a, str5);
                    i12 |= 2;
                } else {
                    if (iA != 2) {
                        throw new UnknownFieldException(iA);
                    }
                    str6 = (String) cVarB.v(m1Var, 2, vo0.z1.f119730a, str6);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        cVarB.c(m1Var);
        return new d0(i11, str, str2, str3);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69160b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        d0 value = (d0) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69160b;
        uo0.d dVarB = encoder.b(m1Var);
        vo0.z1 z1Var = vo0.z1.f119730a;
        dVarB.y(m1Var, 0, z1Var, value.f69028a);
        dVarB.y(m1Var, 1, z1Var, value.f69029b);
        if (dVarB.G(m1Var, 2) || value.f69030c != null) {
            dVarB.y(m1Var, 2, z1Var, value.f69030c);
        }
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
