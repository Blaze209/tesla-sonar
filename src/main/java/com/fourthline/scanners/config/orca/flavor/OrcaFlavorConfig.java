package com.fourthline.scanners.config.orca.flavor;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J@\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "", "Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;", "colors", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", OrcaFlavourKeys.LAYOUTS, "Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;", OrcaFlavourKeys.FONTS, "Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "localization", "<init>", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;", "component2", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", "component3", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;", "component4", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "copy", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;)Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/scanners/config/orca/flavor/OrcaColorModeConfig;", "getColors", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLayoutsConfig;", "getLayouts", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;", "getFonts", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "getLocalization", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class OrcaFlavorConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OrcaColorModeConfig colors;
    private final OrcaFontsConfig fonts;
    private final OrcaLayoutsConfig layouts;
    private final OrcaLocalizationConfig localization;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<OrcaFlavorConfig> serializer() {
            return OrcaFlavorConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaFlavorConfig(int i11, OrcaColorModeConfig orcaColorModeConfig, OrcaLayoutsConfig orcaLayoutsConfig, OrcaFontsConfig orcaFontsConfig, OrcaLocalizationConfig orcaLocalizationConfig, v1 v1Var) {
        if (15 != (i11 & 15)) {
            h1.b(i11, 15, OrcaFlavorConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.colors = orcaColorModeConfig;
        this.layouts = orcaLayoutsConfig;
        this.fonts = orcaFontsConfig;
        this.localization = orcaLocalizationConfig;
    }

    public static /* synthetic */ OrcaFlavorConfig copy$default(OrcaFlavorConfig orcaFlavorConfig, OrcaColorModeConfig orcaColorModeConfig, OrcaLayoutsConfig orcaLayoutsConfig, OrcaFontsConfig orcaFontsConfig, OrcaLocalizationConfig orcaLocalizationConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaColorModeConfig = orcaFlavorConfig.colors;
        }
        if ((i11 & 2) != 0) {
            orcaLayoutsConfig = orcaFlavorConfig.layouts;
        }
        if ((i11 & 4) != 0) {
            orcaFontsConfig = orcaFlavorConfig.fonts;
        }
        if ((i11 & 8) != 0) {
            orcaLocalizationConfig = orcaFlavorConfig.localization;
        }
        return orcaFlavorConfig.copy(orcaColorModeConfig, orcaLayoutsConfig, orcaFontsConfig, orcaLocalizationConfig);
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(OrcaFlavorConfig self, uo0.d output, f serialDesc) {
        output.y(serialDesc, 0, OrcaColorModeConfig$$serializer.INSTANCE, self.colors);
        output.y(serialDesc, 1, OrcaLayoutsConfig$$serializer.INSTANCE, self.layouts);
        output.y(serialDesc, 2, OrcaFontsConfig$$serializer.INSTANCE, self.fonts);
        output.y(serialDesc, 3, OrcaLocalizationConfig$$serializer.INSTANCE, self.localization);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaColorModeConfig getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaLayoutsConfig getLayouts() {
        return this.layouts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaFontsConfig getFonts() {
        return this.fonts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaLocalizationConfig getLocalization() {
        return this.localization;
    }

    public final OrcaFlavorConfig copy(OrcaColorModeConfig colors, OrcaLayoutsConfig layouts, OrcaFontsConfig fonts, OrcaLocalizationConfig localization) {
        return new OrcaFlavorConfig(colors, layouts, fonts, localization);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaFlavorConfig)) {
            return false;
        }
        OrcaFlavorConfig orcaFlavorConfig = (OrcaFlavorConfig) other;
        return s.f(this.colors, orcaFlavorConfig.colors) && s.f(this.layouts, orcaFlavorConfig.layouts) && s.f(this.fonts, orcaFlavorConfig.fonts) && s.f(this.localization, orcaFlavorConfig.localization);
    }

    public final OrcaColorModeConfig getColors() {
        return this.colors;
    }

    public final OrcaFontsConfig getFonts() {
        return this.fonts;
    }

    public final OrcaLayoutsConfig getLayouts() {
        return this.layouts;
    }

    public final OrcaLocalizationConfig getLocalization() {
        return this.localization;
    }

    public int hashCode() {
        OrcaColorModeConfig orcaColorModeConfig = this.colors;
        int iHashCode = (orcaColorModeConfig == null ? 0 : orcaColorModeConfig.hashCode()) * 31;
        OrcaLayoutsConfig orcaLayoutsConfig = this.layouts;
        int iHashCode2 = (iHashCode + (orcaLayoutsConfig == null ? 0 : orcaLayoutsConfig.hashCode())) * 31;
        OrcaFontsConfig orcaFontsConfig = this.fonts;
        int iHashCode3 = (iHashCode2 + (orcaFontsConfig == null ? 0 : orcaFontsConfig.hashCode())) * 31;
        OrcaLocalizationConfig orcaLocalizationConfig = this.localization;
        return iHashCode3 + (orcaLocalizationConfig != null ? orcaLocalizationConfig.hashCode() : 0);
    }

    public String toString() {
        return "OrcaFlavorConfig(colors=" + this.colors + ", layouts=" + this.layouts + ", fonts=" + this.fonts + ", localization=" + this.localization + ")";
    }

    public OrcaFlavorConfig(OrcaColorModeConfig orcaColorModeConfig, OrcaLayoutsConfig orcaLayoutsConfig, OrcaFontsConfig orcaFontsConfig, OrcaLocalizationConfig orcaLocalizationConfig) {
        this.colors = orcaColorModeConfig;
        this.layouts = orcaLayoutsConfig;
        this.fonts = orcaFontsConfig;
        this.localization = orcaLocalizationConfig;
    }
}
