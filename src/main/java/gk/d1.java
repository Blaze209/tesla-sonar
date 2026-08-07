package gk;

import ch.qos.logback.core.joran.action.Action;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements vo0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f69031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ vo0.m1 f69032b;

    static {
        d1 d1Var = new d1();
        f69031a = d1Var;
        vo0.m1 m1Var = new vo0.m1("com.dlocal.direct.internal.analytics.event.LogErrorDto", d1Var, 8);
        m1Var.o("name", true);
        m1Var.o("level", true);
        m1Var.o(Action.FILE_ATTRIBUTE, true);
        m1Var.o("message", true);
        m1Var.o("function", true);
        m1Var.o("raw", true);
        m1Var.o("line", true);
        m1Var.o("code", true);
        f69032b = m1Var;
    }

    @Override // vo0.e0
    public final ro0.d[] childSerializers() {
        vo0.z1 z1Var = vo0.z1.f119730a;
        return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(vo0.j0.f119632a), so0.a.p(z1Var)};
    }

    @Override // ro0.c
    public final Object deserialize(uo0.e decoder) {
        int i11;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        vo0.m1 m1Var = f69032b;
        uo0.c cVarB = decoder.b(m1Var);
        int i12 = 7;
        String str8 = null;
        if (cVarB.i()) {
            vo0.z1 z1Var = vo0.z1.f119730a;
            String str9 = (String) cVarB.v(m1Var, 0, z1Var, null);
            String str10 = (String) cVarB.v(m1Var, 1, z1Var, null);
            String str11 = (String) cVarB.v(m1Var, 2, z1Var, null);
            String str12 = (String) cVarB.v(m1Var, 3, z1Var, null);
            String str13 = (String) cVarB.v(m1Var, 4, z1Var, null);
            String str14 = (String) cVarB.v(m1Var, 5, z1Var, null);
            Integer num2 = (Integer) cVarB.v(m1Var, 6, vo0.j0.f119632a, null);
            str = (String) cVarB.v(m1Var, 7, z1Var, null);
            i11 = 255;
            num = num2;
            str2 = str14;
            str6 = str12;
            str7 = str13;
            str5 = str11;
            str4 = str10;
            str3 = str9;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str15 = null;
            Integer num3 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            while (z11) {
                int iA = cVarB.A(m1Var);
                switch (iA) {
                    case -1:
                        z11 = false;
                        i12 = 7;
                        break;
                    case 0:
                        str8 = (String) cVarB.v(m1Var, 0, vo0.z1.f119730a, str8);
                        i13 |= 1;
                        i12 = 7;
                        break;
                    case 1:
                        str17 = (String) cVarB.v(m1Var, 1, vo0.z1.f119730a, str17);
                        i13 |= 2;
                        i12 = 7;
                        break;
                    case 2:
                        str18 = (String) cVarB.v(m1Var, 2, vo0.z1.f119730a, str18);
                        i13 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        str19 = (String) cVarB.v(m1Var, 3, vo0.z1.f119730a, str19);
                        i13 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        str20 = (String) cVarB.v(m1Var, 4, vo0.z1.f119730a, str20);
                        i13 |= 16;
                        break;
                    case 5:
                        str16 = (String) cVarB.v(m1Var, 5, vo0.z1.f119730a, str16);
                        i13 |= 32;
                        break;
                    case 6:
                        num3 = (Integer) cVarB.v(m1Var, 6, vo0.j0.f119632a, num3);
                        i13 |= 64;
                        break;
                    case 7:
                        str15 = (String) cVarB.v(m1Var, i12, vo0.z1.f119730a, str15);
                        i13 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            i11 = i13;
            str = str15;
            num = num3;
            str2 = str16;
            str3 = str8;
            str4 = str17;
            str5 = str18;
            str6 = str19;
            str7 = str20;
        }
        cVarB.c(m1Var);
        return new k1(i11, str3, str4, str5, str6, str7, str2, num, str);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final to0.f getDescriptor() {
        return f69032b;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, Object obj) {
        k1 value = (k1) obj;
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        vo0.m1 m1Var = f69032b;
        uo0.d dVarB = encoder.b(m1Var);
        if (dVarB.G(m1Var, 0) || value.f69082a != null) {
            dVarB.y(m1Var, 0, vo0.z1.f119730a, value.f69082a);
        }
        if (dVarB.G(m1Var, 1) || value.f69083b != null) {
            dVarB.y(m1Var, 1, vo0.z1.f119730a, value.f69083b);
        }
        if (dVarB.G(m1Var, 2) || value.f69084c != null) {
            dVarB.y(m1Var, 2, vo0.z1.f119730a, value.f69084c);
        }
        if (dVarB.G(m1Var, 3) || value.f69085d != null) {
            dVarB.y(m1Var, 3, vo0.z1.f119730a, value.f69085d);
        }
        if (dVarB.G(m1Var, 4) || value.f69086e != null) {
            dVarB.y(m1Var, 4, vo0.z1.f119730a, value.f69086e);
        }
        if (dVarB.G(m1Var, 5) || value.f69087f != null) {
            dVarB.y(m1Var, 5, vo0.z1.f119730a, value.f69087f);
        }
        if (dVarB.G(m1Var, 6) || value.f69088g != null) {
            dVarB.y(m1Var, 6, vo0.j0.f119632a, value.f69088g);
        }
        if (dVarB.G(m1Var, 7) || value.f69089h != null) {
            dVarB.y(m1Var, 7, vo0.z1.f119730a, value.f69089h);
        }
        dVarB.c(m1Var);
    }

    @Override // vo0.e0
    public final ro0.d[] typeParametersSerializers() {
        return vo0.e0.a.a(this);
    }
}
