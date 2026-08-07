package com.fourthline.scanners.config.orca.flavor;

import com.fourthline.analytics.internal.AnalyticsContext;
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

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/flavor/OrcaColorsConfig.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class OrcaColorsConfig$$serializer implements e0<OrcaColorsConfig> {
    public static final OrcaColorsConfig$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OrcaColorsConfig$$serializer orcaColorsConfig$$serializer = new OrcaColorsConfig$$serializer();
        INSTANCE = orcaColorsConfig$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.flavor.OrcaColorsConfig", orcaColorsConfig$$serializer, 9);
        m1Var.o("palette", false);
        m1Var.o("box", false);
        m1Var.o("buttons", false);
        m1Var.o(AnalyticsContext.Screen, false);
        m1Var.o("hint", false);
        m1Var.o("inputField", false);
        m1Var.o("popup", false);
        m1Var.o(AnalyticsContext.Scanner, false);
        m1Var.o("graphic", false);
        descriptor = m1Var;
    }

    private OrcaColorsConfig$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        return new d[]{a.p(OrcaPaletteConfig$$serializer.INSTANCE), a.p(OrcaBoxConfig$$serializer.INSTANCE), a.p(OrcaButtonsConfig$$serializer.INSTANCE), a.p(OrcaScreenConfig$$serializer.INSTANCE), a.p(OrcaHintConfig$$serializer.INSTANCE), a.p(OrcaInputFieldConfig$$serializer.INSTANCE), a.p(OrcaPopupConfig$$serializer.INSTANCE), a.p(OrcaScannerConfig$$serializer.INSTANCE), a.p(OrcaGraphicConfig$$serializer.INSTANCE)};
    }

    @Override // ro0.c
    public final OrcaColorsConfig deserialize(uo0.e decoder) {
        int i11;
        OrcaScannerConfig orcaScannerConfig;
        OrcaGraphicConfig orcaGraphicConfig;
        OrcaPopupConfig orcaPopupConfig;
        OrcaInputFieldConfig orcaInputFieldConfig;
        OrcaHintConfig orcaHintConfig;
        OrcaPaletteConfig orcaPaletteConfig;
        OrcaBoxConfig orcaBoxConfig;
        OrcaButtonsConfig orcaButtonsConfig;
        OrcaScreenConfig orcaScreenConfig;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        int i12 = 7;
        OrcaPaletteConfig orcaPaletteConfig2 = null;
        if (cVarB.i()) {
            OrcaPaletteConfig orcaPaletteConfig3 = (OrcaPaletteConfig) cVarB.v(fVar, 0, OrcaPaletteConfig$$serializer.INSTANCE, null);
            OrcaBoxConfig orcaBoxConfig2 = (OrcaBoxConfig) cVarB.v(fVar, 1, OrcaBoxConfig$$serializer.INSTANCE, null);
            OrcaButtonsConfig orcaButtonsConfig2 = (OrcaButtonsConfig) cVarB.v(fVar, 2, OrcaButtonsConfig$$serializer.INSTANCE, null);
            OrcaScreenConfig orcaScreenConfig2 = (OrcaScreenConfig) cVarB.v(fVar, 3, OrcaScreenConfig$$serializer.INSTANCE, null);
            OrcaHintConfig orcaHintConfig2 = (OrcaHintConfig) cVarB.v(fVar, 4, OrcaHintConfig$$serializer.INSTANCE, null);
            OrcaInputFieldConfig orcaInputFieldConfig2 = (OrcaInputFieldConfig) cVarB.v(fVar, 5, OrcaInputFieldConfig$$serializer.INSTANCE, null);
            OrcaPopupConfig orcaPopupConfig2 = (OrcaPopupConfig) cVarB.v(fVar, 6, OrcaPopupConfig$$serializer.INSTANCE, null);
            orcaPaletteConfig = orcaPaletteConfig3;
            orcaScannerConfig = (OrcaScannerConfig) cVarB.v(fVar, 7, OrcaScannerConfig$$serializer.INSTANCE, null);
            orcaPopupConfig = orcaPopupConfig2;
            orcaInputFieldConfig = orcaInputFieldConfig2;
            orcaScreenConfig = orcaScreenConfig2;
            orcaGraphicConfig = (OrcaGraphicConfig) cVarB.v(fVar, 8, OrcaGraphicConfig$$serializer.INSTANCE, null);
            orcaHintConfig = orcaHintConfig2;
            orcaButtonsConfig = orcaButtonsConfig2;
            orcaBoxConfig = orcaBoxConfig2;
            i11 = 511;
        } else {
            boolean z11 = true;
            int i13 = 0;
            OrcaScannerConfig orcaScannerConfig2 = null;
            OrcaGraphicConfig orcaGraphicConfig2 = null;
            OrcaPopupConfig orcaPopupConfig3 = null;
            OrcaInputFieldConfig orcaInputFieldConfig3 = null;
            OrcaHintConfig orcaHintConfig3 = null;
            OrcaBoxConfig orcaBoxConfig3 = null;
            OrcaButtonsConfig orcaButtonsConfig3 = null;
            OrcaScreenConfig orcaScreenConfig3 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z11 = false;
                        i12 = 7;
                        break;
                    case 0:
                        orcaPaletteConfig2 = (OrcaPaletteConfig) cVarB.v(fVar, 0, OrcaPaletteConfig$$serializer.INSTANCE, orcaPaletteConfig2);
                        i13 |= 1;
                        i12 = 7;
                        break;
                    case 1:
                        orcaBoxConfig3 = (OrcaBoxConfig) cVarB.v(fVar, 1, OrcaBoxConfig$$serializer.INSTANCE, orcaBoxConfig3);
                        i13 |= 2;
                        i12 = 7;
                        break;
                    case 2:
                        orcaButtonsConfig3 = (OrcaButtonsConfig) cVarB.v(fVar, 2, OrcaButtonsConfig$$serializer.INSTANCE, orcaButtonsConfig3);
                        i13 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        orcaScreenConfig3 = (OrcaScreenConfig) cVarB.v(fVar, 3, OrcaScreenConfig$$serializer.INSTANCE, orcaScreenConfig3);
                        i13 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        orcaHintConfig3 = (OrcaHintConfig) cVarB.v(fVar, 4, OrcaHintConfig$$serializer.INSTANCE, orcaHintConfig3);
                        i13 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        orcaInputFieldConfig3 = (OrcaInputFieldConfig) cVarB.v(fVar, 5, OrcaInputFieldConfig$$serializer.INSTANCE, orcaInputFieldConfig3);
                        i13 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        orcaPopupConfig3 = (OrcaPopupConfig) cVarB.v(fVar, 6, OrcaPopupConfig$$serializer.INSTANCE, orcaPopupConfig3);
                        i13 |= 64;
                        break;
                    case 7:
                        orcaScannerConfig2 = (OrcaScannerConfig) cVarB.v(fVar, i12, OrcaScannerConfig$$serializer.INSTANCE, orcaScannerConfig2);
                        i13 |= 128;
                        break;
                    case 8:
                        orcaGraphicConfig2 = (OrcaGraphicConfig) cVarB.v(fVar, 8, OrcaGraphicConfig$$serializer.INSTANCE, orcaGraphicConfig2);
                        i13 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            i11 = i13;
            orcaScannerConfig = orcaScannerConfig2;
            orcaGraphicConfig = orcaGraphicConfig2;
            orcaPopupConfig = orcaPopupConfig3;
            orcaInputFieldConfig = orcaInputFieldConfig3;
            orcaHintConfig = orcaHintConfig3;
            orcaPaletteConfig = orcaPaletteConfig2;
            orcaBoxConfig = orcaBoxConfig3;
            orcaButtonsConfig = orcaButtonsConfig3;
            orcaScreenConfig = orcaScreenConfig3;
        }
        cVarB.c(fVar);
        return new OrcaColorsConfig(i11, orcaPaletteConfig, orcaBoxConfig, orcaButtonsConfig, orcaScreenConfig, orcaHintConfig, orcaInputFieldConfig, orcaPopupConfig, orcaScannerConfig, orcaGraphicConfig, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, OrcaColorsConfig value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        OrcaColorsConfig.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
