package com.fourthline.scanners.config.orca.flavor;

import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/flavor/OrcaFontsConfig.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class OrcaFontsConfig$$serializer implements e0<OrcaFontsConfig> {
    public static final OrcaFontsConfig$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OrcaFontsConfig$$serializer orcaFontsConfig$$serializer = new OrcaFontsConfig$$serializer();
        INSTANCE = orcaFontsConfig$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.flavor.OrcaFontsConfig", orcaFontsConfig$$serializer, 18);
        m1Var.o("screenHeader", false);
        m1Var.o("screenTitle", false);
        m1Var.o("screenMessage", false);
        m1Var.o("popupTitle", false);
        m1Var.o("popupMessage", false);
        m1Var.o("primaryButton", false);
        m1Var.o("secondaryButton", false);
        m1Var.o("inputField", false);
        m1Var.o("inputFieldPlaceholder", false);
        m1Var.o("inputFieldTitle", false);
        m1Var.o("inputFieldStatus", false);
        m1Var.o("scannerInstructionText", false);
        m1Var.o("confirmationScreenTitle", false);
        m1Var.o("confirmationScreenCheckpoints", false);
        m1Var.o("tableElementTitle", false);
        m1Var.o("tableElementDescription", false);
        m1Var.o("instructionsLink", false);
        m1Var.o("hintText", false);
        descriptor = m1Var;
    }

    private OrcaFontsConfig$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        OrcaFontMapping$$serializer orcaFontMapping$$serializer = OrcaFontMapping$$serializer.INSTANCE;
        return new d[]{a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer), a.p(orcaFontMapping$$serializer)};
    }

    @Override // ro0.c
    public final OrcaFontsConfig deserialize(uo0.e decoder) {
        OrcaFontMapping orcaFontMapping;
        OrcaFontMapping orcaFontMapping2;
        OrcaFontMapping orcaFontMapping3;
        OrcaFontMapping orcaFontMapping4;
        OrcaFontMapping orcaFontMapping5;
        OrcaFontMapping orcaFontMapping6;
        OrcaFontMapping orcaFontMapping7;
        OrcaFontMapping orcaFontMapping8;
        OrcaFontMapping orcaFontMapping9;
        OrcaFontMapping orcaFontMapping10;
        OrcaFontMapping orcaFontMapping11;
        OrcaFontMapping orcaFontMapping12;
        OrcaFontMapping orcaFontMapping13;
        OrcaFontMapping orcaFontMapping14;
        OrcaFontMapping orcaFontMapping15;
        OrcaFontMapping orcaFontMapping16;
        OrcaFontMapping orcaFontMapping17;
        OrcaFontMapping orcaFontMapping18;
        int i11;
        int i12;
        OrcaFontMapping orcaFontMapping19;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        OrcaFontMapping orcaFontMapping20 = null;
        if (cVarB.i()) {
            OrcaFontMapping$$serializer orcaFontMapping$$serializer = OrcaFontMapping$$serializer.INSTANCE;
            OrcaFontMapping orcaFontMapping21 = (OrcaFontMapping) cVarB.v(fVar, 0, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping22 = (OrcaFontMapping) cVarB.v(fVar, 1, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping23 = (OrcaFontMapping) cVarB.v(fVar, 2, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping24 = (OrcaFontMapping) cVarB.v(fVar, 3, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping25 = (OrcaFontMapping) cVarB.v(fVar, 4, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping26 = (OrcaFontMapping) cVarB.v(fVar, 5, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping27 = (OrcaFontMapping) cVarB.v(fVar, 6, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping28 = (OrcaFontMapping) cVarB.v(fVar, 7, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping29 = (OrcaFontMapping) cVarB.v(fVar, 8, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping30 = (OrcaFontMapping) cVarB.v(fVar, 9, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping31 = (OrcaFontMapping) cVarB.v(fVar, 10, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping32 = (OrcaFontMapping) cVarB.v(fVar, 11, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping33 = (OrcaFontMapping) cVarB.v(fVar, 12, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping34 = (OrcaFontMapping) cVarB.v(fVar, 13, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping35 = (OrcaFontMapping) cVarB.v(fVar, 14, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping36 = (OrcaFontMapping) cVarB.v(fVar, 15, orcaFontMapping$$serializer, null);
            OrcaFontMapping orcaFontMapping37 = (OrcaFontMapping) cVarB.v(fVar, 16, orcaFontMapping$$serializer, null);
            orcaFontMapping12 = (OrcaFontMapping) cVarB.v(fVar, 17, orcaFontMapping$$serializer, null);
            i11 = 262143;
            orcaFontMapping14 = orcaFontMapping23;
            orcaFontMapping13 = orcaFontMapping22;
            orcaFontMapping = orcaFontMapping21;
            orcaFontMapping7 = orcaFontMapping32;
            orcaFontMapping8 = orcaFontMapping31;
            orcaFontMapping18 = orcaFontMapping30;
            orcaFontMapping10 = orcaFontMapping28;
            orcaFontMapping11 = orcaFontMapping27;
            orcaFontMapping17 = orcaFontMapping26;
            orcaFontMapping15 = orcaFontMapping24;
            orcaFontMapping16 = orcaFontMapping25;
            orcaFontMapping2 = orcaFontMapping37;
            orcaFontMapping3 = orcaFontMapping36;
            orcaFontMapping4 = orcaFontMapping35;
            orcaFontMapping5 = orcaFontMapping34;
            orcaFontMapping6 = orcaFontMapping33;
            orcaFontMapping9 = orcaFontMapping29;
        } else {
            boolean z11 = true;
            int i13 = 0;
            OrcaFontMapping orcaFontMapping38 = null;
            OrcaFontMapping orcaFontMapping39 = null;
            OrcaFontMapping orcaFontMapping40 = null;
            OrcaFontMapping orcaFontMapping41 = null;
            OrcaFontMapping orcaFontMapping42 = null;
            OrcaFontMapping orcaFontMapping43 = null;
            OrcaFontMapping orcaFontMapping44 = null;
            OrcaFontMapping orcaFontMapping45 = null;
            OrcaFontMapping orcaFontMapping46 = null;
            OrcaFontMapping orcaFontMapping47 = null;
            OrcaFontMapping orcaFontMapping48 = null;
            OrcaFontMapping orcaFontMapping49 = null;
            OrcaFontMapping orcaFontMapping50 = null;
            OrcaFontMapping orcaFontMapping51 = null;
            OrcaFontMapping orcaFontMapping52 = null;
            OrcaFontMapping orcaFontMapping53 = null;
            OrcaFontMapping orcaFontMapping54 = null;
            while (z11) {
                OrcaFontMapping orcaFontMapping55 = orcaFontMapping49;
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z11 = false;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping38 = orcaFontMapping38;
                        i13 = i13;
                        break;
                    case 0:
                        orcaFontMapping19 = orcaFontMapping55;
                        orcaFontMapping50 = (OrcaFontMapping) cVarB.v(fVar, 0, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping50);
                        i13 |= 1;
                        orcaFontMapping51 = orcaFontMapping51;
                        orcaFontMapping49 = orcaFontMapping19;
                        orcaFontMapping38 = orcaFontMapping38;
                        break;
                    case 1:
                        orcaFontMapping19 = orcaFontMapping55;
                        orcaFontMapping51 = (OrcaFontMapping) cVarB.v(fVar, 1, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping51);
                        i13 |= 2;
                        orcaFontMapping52 = orcaFontMapping52;
                        orcaFontMapping49 = orcaFontMapping19;
                        orcaFontMapping38 = orcaFontMapping38;
                        break;
                    case 2:
                        orcaFontMapping19 = orcaFontMapping55;
                        orcaFontMapping52 = (OrcaFontMapping) cVarB.v(fVar, 2, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping52);
                        i13 |= 4;
                        orcaFontMapping53 = orcaFontMapping53;
                        orcaFontMapping49 = orcaFontMapping19;
                        orcaFontMapping38 = orcaFontMapping38;
                        break;
                    case 3:
                        orcaFontMapping19 = orcaFontMapping55;
                        orcaFontMapping53 = (OrcaFontMapping) cVarB.v(fVar, 3, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping53);
                        i13 |= 8;
                        orcaFontMapping54 = orcaFontMapping54;
                        orcaFontMapping49 = orcaFontMapping19;
                        orcaFontMapping38 = orcaFontMapping38;
                        break;
                    case 4:
                        orcaFontMapping19 = orcaFontMapping55;
                        orcaFontMapping54 = (OrcaFontMapping) cVarB.v(fVar, 4, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping54);
                        i13 |= 16;
                        orcaFontMapping49 = orcaFontMapping19;
                        orcaFontMapping38 = orcaFontMapping38;
                        break;
                    case 5:
                        orcaFontMapping38 = orcaFontMapping38;
                        orcaFontMapping49 = (OrcaFontMapping) cVarB.v(fVar, 5, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping55);
                        i13 |= 32;
                        orcaFontMapping38 = orcaFontMapping38;
                        break;
                    case 6:
                        orcaFontMapping47 = (OrcaFontMapping) cVarB.v(fVar, 6, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping47);
                        i13 |= 64;
                        orcaFontMapping49 = orcaFontMapping55;
                        break;
                    case 7:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping46 = (OrcaFontMapping) cVarB.v(fVar, 7, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping46);
                        i13 |= 128;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 8:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping45 = (OrcaFontMapping) cVarB.v(fVar, 8, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping45);
                        i13 |= 256;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 9:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping38 = (OrcaFontMapping) cVarB.v(fVar, 9, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping38);
                        i13 |= 512;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 10:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping44 = (OrcaFontMapping) cVarB.v(fVar, 10, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping44);
                        i13 |= 1024;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 11:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping43 = (OrcaFontMapping) cVarB.v(fVar, 11, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping43);
                        i13 |= 2048;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 12:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping42 = (OrcaFontMapping) cVarB.v(fVar, 12, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping42);
                        i13 |= 4096;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 13:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping20 = (OrcaFontMapping) cVarB.v(fVar, 13, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping20);
                        i13 |= PKIFailureInfo.certRevoked;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 14:
                        orcaFontMapping47 = orcaFontMapping47;
                        orcaFontMapping41 = (OrcaFontMapping) cVarB.v(fVar, 14, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping41);
                        i13 |= 16384;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 15:
                        orcaFontMapping40 = (OrcaFontMapping) cVarB.v(fVar, 15, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping40);
                        i12 = 32768;
                        i13 |= i12;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 16:
                        orcaFontMapping39 = (OrcaFontMapping) cVarB.v(fVar, 16, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping39);
                        i12 = 65536;
                        i13 |= i12;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    case 17:
                        orcaFontMapping48 = (OrcaFontMapping) cVarB.v(fVar, 17, OrcaFontMapping$$serializer.INSTANCE, orcaFontMapping48);
                        i12 = 131072;
                        i13 |= i12;
                        orcaFontMapping49 = orcaFontMapping55;
                        orcaFontMapping47 = orcaFontMapping47;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            orcaFontMapping = orcaFontMapping50;
            orcaFontMapping2 = orcaFontMapping39;
            orcaFontMapping3 = orcaFontMapping40;
            orcaFontMapping4 = orcaFontMapping41;
            orcaFontMapping5 = orcaFontMapping20;
            orcaFontMapping6 = orcaFontMapping42;
            orcaFontMapping7 = orcaFontMapping43;
            orcaFontMapping8 = orcaFontMapping44;
            orcaFontMapping9 = orcaFontMapping45;
            orcaFontMapping10 = orcaFontMapping46;
            orcaFontMapping11 = orcaFontMapping47;
            orcaFontMapping12 = orcaFontMapping48;
            orcaFontMapping13 = orcaFontMapping51;
            orcaFontMapping14 = orcaFontMapping52;
            orcaFontMapping15 = orcaFontMapping53;
            orcaFontMapping16 = orcaFontMapping54;
            orcaFontMapping17 = orcaFontMapping49;
            orcaFontMapping18 = orcaFontMapping38;
            i11 = i13;
        }
        cVarB.c(fVar);
        return new OrcaFontsConfig(i11, orcaFontMapping, orcaFontMapping13, orcaFontMapping14, orcaFontMapping15, orcaFontMapping16, orcaFontMapping17, orcaFontMapping11, orcaFontMapping10, orcaFontMapping9, orcaFontMapping18, orcaFontMapping8, orcaFontMapping7, orcaFontMapping6, orcaFontMapping5, orcaFontMapping4, orcaFontMapping3, orcaFontMapping2, orcaFontMapping12, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, OrcaFontsConfig value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        OrcaFontsConfig.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
