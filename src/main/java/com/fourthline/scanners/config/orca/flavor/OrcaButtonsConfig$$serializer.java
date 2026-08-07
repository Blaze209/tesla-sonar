package com.fourthline.scanners.config.orca.flavor;

import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class OrcaButtonsConfig$$serializer implements e0<OrcaButtonsConfig> {
    public static final OrcaButtonsConfig$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OrcaButtonsConfig$$serializer orcaButtonsConfig$$serializer = new OrcaButtonsConfig$$serializer();
        INSTANCE = orcaButtonsConfig$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.flavor.OrcaButtonsConfig", orcaButtonsConfig$$serializer, 7);
        m1Var.o("primary", false);
        m1Var.o("secondary", false);
        m1Var.o("scannerPrimary", false);
        m1Var.o("scannerSecondary", false);
        m1Var.o("checkbox", false);
        m1Var.o("linkButtonColor", false);
        m1Var.o("backButtonColor", false);
        descriptor = m1Var;
    }

    private OrcaButtonsConfig$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        OrcaButtonsConfig$OrcaButtonConfig$$serializer orcaButtonsConfig$OrcaButtonConfig$$serializer = OrcaButtonsConfig$OrcaButtonConfig$$serializer.INSTANCE;
        d<?> dVarP = a.p(orcaButtonsConfig$OrcaButtonConfig$$serializer);
        d<?> dVarP2 = a.p(orcaButtonsConfig$OrcaButtonConfig$$serializer);
        d<?> dVarP3 = a.p(orcaButtonsConfig$OrcaButtonConfig$$serializer);
        d<?> dVarP4 = a.p(orcaButtonsConfig$OrcaButtonConfig$$serializer);
        d<?> dVarP5 = a.p(OrcaButtonsConfig$OrcaCheckboxConfig$$serializer.INSTANCE);
        z1 z1Var = z1.f119730a;
        return new d[]{dVarP, dVarP2, dVarP3, dVarP4, dVarP5, a.p(z1Var), a.p(z1Var)};
    }

    @Override // ro0.c
    public final OrcaButtonsConfig deserialize(uo0.e decoder) {
        int i11;
        String str;
        OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig;
        OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig2;
        OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig3;
        OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig4;
        OrcaButtonsConfig.OrcaCheckboxConfig orcaCheckboxConfig;
        String str2;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        int i12 = 6;
        OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig5 = null;
        if (cVarB.i()) {
            OrcaButtonsConfig$OrcaButtonConfig$$serializer orcaButtonsConfig$OrcaButtonConfig$$serializer = OrcaButtonsConfig$OrcaButtonConfig$$serializer.INSTANCE;
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig6 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 0, orcaButtonsConfig$OrcaButtonConfig$$serializer, null);
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig7 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 1, orcaButtonsConfig$OrcaButtonConfig$$serializer, null);
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig8 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 2, orcaButtonsConfig$OrcaButtonConfig$$serializer, null);
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig9 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 3, orcaButtonsConfig$OrcaButtonConfig$$serializer, null);
            OrcaButtonsConfig.OrcaCheckboxConfig orcaCheckboxConfig2 = (OrcaButtonsConfig.OrcaCheckboxConfig) cVarB.v(fVar, 4, OrcaButtonsConfig$OrcaCheckboxConfig$$serializer.INSTANCE, null);
            z1 z1Var = z1.f119730a;
            String str3 = (String) cVarB.v(fVar, 5, z1Var, null);
            orcaButtonConfig4 = orcaButtonConfig9;
            str = (String) cVarB.v(fVar, 6, z1Var, null);
            str2 = str3;
            orcaCheckboxConfig = orcaCheckboxConfig2;
            i11 = 127;
            orcaButtonConfig3 = orcaButtonConfig8;
            orcaButtonConfig2 = orcaButtonConfig7;
            orcaButtonConfig = orcaButtonConfig6;
        } else {
            boolean z11 = true;
            int i13 = 0;
            String str4 = null;
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig10 = null;
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig11 = null;
            OrcaButtonsConfig.OrcaButtonConfig orcaButtonConfig12 = null;
            OrcaButtonsConfig.OrcaCheckboxConfig orcaCheckboxConfig3 = null;
            String str5 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z11 = false;
                        i12 = 6;
                        break;
                    case 0:
                        orcaButtonConfig5 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 0, OrcaButtonsConfig$OrcaButtonConfig$$serializer.INSTANCE, orcaButtonConfig5);
                        i13 |= 1;
                        i12 = 6;
                        break;
                    case 1:
                        orcaButtonConfig10 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 1, OrcaButtonsConfig$OrcaButtonConfig$$serializer.INSTANCE, orcaButtonConfig10);
                        i13 |= 2;
                        i12 = 6;
                        break;
                    case 2:
                        orcaButtonConfig11 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 2, OrcaButtonsConfig$OrcaButtonConfig$$serializer.INSTANCE, orcaButtonConfig11);
                        i13 |= 4;
                        break;
                    case 3:
                        orcaButtonConfig12 = (OrcaButtonsConfig.OrcaButtonConfig) cVarB.v(fVar, 3, OrcaButtonsConfig$OrcaButtonConfig$$serializer.INSTANCE, orcaButtonConfig12);
                        i13 |= 8;
                        break;
                    case 4:
                        orcaCheckboxConfig3 = (OrcaButtonsConfig.OrcaCheckboxConfig) cVarB.v(fVar, 4, OrcaButtonsConfig$OrcaCheckboxConfig$$serializer.INSTANCE, orcaCheckboxConfig3);
                        i13 |= 16;
                        break;
                    case 5:
                        str5 = (String) cVarB.v(fVar, 5, z1.f119730a, str5);
                        i13 |= 32;
                        break;
                    case 6:
                        str4 = (String) cVarB.v(fVar, i12, z1.f119730a, str4);
                        i13 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            i11 = i13;
            str = str4;
            orcaButtonConfig = orcaButtonConfig5;
            orcaButtonConfig2 = orcaButtonConfig10;
            orcaButtonConfig3 = orcaButtonConfig11;
            orcaButtonConfig4 = orcaButtonConfig12;
            orcaCheckboxConfig = orcaCheckboxConfig3;
            str2 = str5;
        }
        cVarB.c(fVar);
        return new OrcaButtonsConfig(i11, orcaButtonConfig, orcaButtonConfig2, orcaButtonConfig3, orcaButtonConfig4, orcaCheckboxConfig, str2, str, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, OrcaButtonsConfig value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        OrcaButtonsConfig.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
