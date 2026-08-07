package gk;

import com.google.android.gms.actions.SearchIntents;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f69051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69052b;

    static {
        f0 f0Var = new f0();
        f69051a = f0Var;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogRequestDto", f0Var, 4);
        m1Var.o("base_url", false);
        m1Var.o("path", false);
        m1Var.o(SearchIntents.EXTRA_QUERY, false);
        m1Var.o("method", false);
        f69052b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        vo0.z1 z1Var = vo0.z1.f119730a;
        return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var)};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69052b;
        uo0.c cVarB = decoder.b(m1Var);
        String str5 = null;
        if (cVarB.i()) {
            vo0.z1 z1Var = vo0.z1.f119730a;
            String str6 = (String) cVarB.v(m1Var, 0, z1Var, null);
            String str7 = (String) cVarB.v(m1Var, 1, z1Var, null);
            String str8 = (String) cVarB.v(m1Var, 2, z1Var, null);
            str4 = (String) cVarB.v(m1Var, 3, z1Var, null);
            i11 = 15;
            str3 = str8;
            str2 = str7;
            str = str6;
        } else {
            boolean z11 = true;
            int i12 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                if (iA == -1) {
                    z11 = false;
                } else if (iA == 0) {
                    str5 = (String) cVarB.v(m1Var, 0, vo0.z1.f119730a, str5);
                    i12 |= 1;
                } else if (iA == 1) {
                    str9 = (String) cVarB.v(m1Var, 1, vo0.z1.f119730a, str9);
                    i12 |= 2;
                } else if (iA == 2) {
                    str10 = (String) cVarB.v(m1Var, 2, vo0.z1.f119730a, str10);
                    i12 |= 4;
                } else {
                    if (iA != 3) {
                        throw new UnknownFieldException(iA);
                    }
                    str11 = (String) cVarB.v(m1Var, 3, vo0.z1.f119730a, str11);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
        }
        cVarB.c(m1Var);
        return new h0(i11, str, str2, str3, str4);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69052b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        h0 value = (h0) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69052b;
        uo0.d dVarB = encoder.b(m1Var);
        vo0.z1 z1Var = vo0.z1.f119730a;
        dVarB.y(m1Var, 0, z1Var, value.f69059a);
        dVarB.y(m1Var, 1, z1Var, value.f69060b);
        dVarB.y(m1Var, 2, z1Var, value.f69061c);
        dVarB.y(m1Var, 3, z1Var, value.f69062d);
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
