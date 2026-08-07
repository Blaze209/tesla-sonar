package com.fourthline.scanners.config.orca.flavor;

import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBa\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bu\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J|\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010Q\u001a\u0004\bR\u00105¨\u0006U"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;", "", "Lcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;", "palette", "Lcom/fourthline/scanners/config/orca/flavor/OrcaBoxConfig;", "box", "Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;", "buttons", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;", AnalyticsContext.Screen, "Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;", "hint", "Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;", "inputField", "Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;", "popup", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;", AnalyticsContext.Scanner, "Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;", "graphic", "<init>", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaBoxConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaBoxConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;", "component2", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaBoxConfig;", "component3", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;", "component4", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;", "component5", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;", "component6", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;", "component7", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;", "component8", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;", "component9", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;", "copy", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaBoxConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;)Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;", "getPalette", "Lcom/fourthline/scanners/config/orca/flavor/OrcaBoxConfig;", "getBox", "Lcom/fourthline/scanners/config/orca/flavor/OrcaButtonsConfig;", "getButtons", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScreenConfig;", "getScreen", "Lcom/fourthline/scanners/config/orca/flavor/OrcaHintConfig;", "getHint", "Lcom/fourthline/scanners/config/orca/flavor/OrcaInputFieldConfig;", "getInputField", "Lcom/fourthline/scanners/config/orca/flavor/OrcaPopupConfig;", "getPopup", "Lcom/fourthline/scanners/config/orca/flavor/OrcaScannerConfig;", "getScanner", "Lcom/fourthline/scanners/config/orca/flavor/OrcaGraphicConfig;", "getGraphic", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class OrcaColorsConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OrcaBoxConfig box;
    private final OrcaButtonsConfig buttons;
    private final OrcaGraphicConfig graphic;
    private final OrcaHintConfig hint;
    private final OrcaInputFieldConfig inputField;
    private final OrcaPaletteConfig palette;
    private final OrcaPopupConfig popup;
    private final OrcaScannerConfig scanner;
    private final OrcaScreenConfig screen;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<OrcaColorsConfig> serializer() {
            return OrcaColorsConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaColorsConfig(int i11, OrcaPaletteConfig orcaPaletteConfig, OrcaBoxConfig orcaBoxConfig, OrcaButtonsConfig orcaButtonsConfig, OrcaScreenConfig orcaScreenConfig, OrcaHintConfig orcaHintConfig, OrcaInputFieldConfig orcaInputFieldConfig, OrcaPopupConfig orcaPopupConfig, OrcaScannerConfig orcaScannerConfig, OrcaGraphicConfig orcaGraphicConfig, v1 v1Var) {
        if (511 != (i11 & 511)) {
            h1.b(i11, 511, OrcaColorsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.palette = orcaPaletteConfig;
        this.box = orcaBoxConfig;
        this.buttons = orcaButtonsConfig;
        this.screen = orcaScreenConfig;
        this.hint = orcaHintConfig;
        this.inputField = orcaInputFieldConfig;
        this.popup = orcaPopupConfig;
        this.scanner = orcaScannerConfig;
        this.graphic = orcaGraphicConfig;
    }

    public static /* synthetic */ OrcaColorsConfig copy$default(OrcaColorsConfig orcaColorsConfig, OrcaPaletteConfig orcaPaletteConfig, OrcaBoxConfig orcaBoxConfig, OrcaButtonsConfig orcaButtonsConfig, OrcaScreenConfig orcaScreenConfig, OrcaHintConfig orcaHintConfig, OrcaInputFieldConfig orcaInputFieldConfig, OrcaPopupConfig orcaPopupConfig, OrcaScannerConfig orcaScannerConfig, OrcaGraphicConfig orcaGraphicConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaPaletteConfig = orcaColorsConfig.palette;
        }
        if ((i11 & 2) != 0) {
            orcaBoxConfig = orcaColorsConfig.box;
        }
        if ((i11 & 4) != 0) {
            orcaButtonsConfig = orcaColorsConfig.buttons;
        }
        if ((i11 & 8) != 0) {
            orcaScreenConfig = orcaColorsConfig.screen;
        }
        if ((i11 & 16) != 0) {
            orcaHintConfig = orcaColorsConfig.hint;
        }
        if ((i11 & 32) != 0) {
            orcaInputFieldConfig = orcaColorsConfig.inputField;
        }
        if ((i11 & 64) != 0) {
            orcaPopupConfig = orcaColorsConfig.popup;
        }
        if ((i11 & 128) != 0) {
            orcaScannerConfig = orcaColorsConfig.scanner;
        }
        if ((i11 & 256) != 0) {
            orcaGraphicConfig = orcaColorsConfig.graphic;
        }
        OrcaScannerConfig orcaScannerConfig2 = orcaScannerConfig;
        OrcaGraphicConfig orcaGraphicConfig2 = orcaGraphicConfig;
        OrcaInputFieldConfig orcaInputFieldConfig2 = orcaInputFieldConfig;
        OrcaPopupConfig orcaPopupConfig2 = orcaPopupConfig;
        OrcaHintConfig orcaHintConfig2 = orcaHintConfig;
        OrcaButtonsConfig orcaButtonsConfig2 = orcaButtonsConfig;
        return orcaColorsConfig.copy(orcaPaletteConfig, orcaBoxConfig, orcaButtonsConfig2, orcaScreenConfig, orcaHintConfig2, orcaInputFieldConfig2, orcaPopupConfig2, orcaScannerConfig2, orcaGraphicConfig2);
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(OrcaColorsConfig self, uo0.d output, f serialDesc) {
        output.y(serialDesc, 0, OrcaPaletteConfig$$serializer.INSTANCE, self.palette);
        output.y(serialDesc, 1, OrcaBoxConfig$$serializer.INSTANCE, self.box);
        output.y(serialDesc, 2, OrcaButtonsConfig$$serializer.INSTANCE, self.buttons);
        output.y(serialDesc, 3, OrcaScreenConfig$$serializer.INSTANCE, self.screen);
        output.y(serialDesc, 4, OrcaHintConfig$$serializer.INSTANCE, self.hint);
        output.y(serialDesc, 5, OrcaInputFieldConfig$$serializer.INSTANCE, self.inputField);
        output.y(serialDesc, 6, OrcaPopupConfig$$serializer.INSTANCE, self.popup);
        output.y(serialDesc, 7, OrcaScannerConfig$$serializer.INSTANCE, self.scanner);
        output.y(serialDesc, 8, OrcaGraphicConfig$$serializer.INSTANCE, self.graphic);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaPaletteConfig getPalette() {
        return this.palette;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaBoxConfig getBox() {
        return this.box;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrcaButtonsConfig getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OrcaScreenConfig getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrcaHintConfig getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrcaInputFieldConfig getInputField() {
        return this.inputField;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OrcaPopupConfig getPopup() {
        return this.popup;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OrcaScannerConfig getScanner() {
        return this.scanner;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OrcaGraphicConfig getGraphic() {
        return this.graphic;
    }

    public final OrcaColorsConfig copy(OrcaPaletteConfig palette, OrcaBoxConfig box, OrcaButtonsConfig buttons, OrcaScreenConfig screen, OrcaHintConfig hint, OrcaInputFieldConfig inputField, OrcaPopupConfig popup, OrcaScannerConfig scanner, OrcaGraphicConfig graphic) {
        return new OrcaColorsConfig(palette, box, buttons, screen, hint, inputField, popup, scanner, graphic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaColorsConfig)) {
            return false;
        }
        OrcaColorsConfig orcaColorsConfig = (OrcaColorsConfig) other;
        return s.f(this.palette, orcaColorsConfig.palette) && s.f(this.box, orcaColorsConfig.box) && s.f(this.buttons, orcaColorsConfig.buttons) && s.f(this.screen, orcaColorsConfig.screen) && s.f(this.hint, orcaColorsConfig.hint) && s.f(this.inputField, orcaColorsConfig.inputField) && s.f(this.popup, orcaColorsConfig.popup) && s.f(this.scanner, orcaColorsConfig.scanner) && s.f(this.graphic, orcaColorsConfig.graphic);
    }

    public final OrcaBoxConfig getBox() {
        return this.box;
    }

    public final OrcaButtonsConfig getButtons() {
        return this.buttons;
    }

    public final OrcaGraphicConfig getGraphic() {
        return this.graphic;
    }

    public final OrcaHintConfig getHint() {
        return this.hint;
    }

    public final OrcaInputFieldConfig getInputField() {
        return this.inputField;
    }

    public final OrcaPaletteConfig getPalette() {
        return this.palette;
    }

    public final OrcaPopupConfig getPopup() {
        return this.popup;
    }

    public final OrcaScannerConfig getScanner() {
        return this.scanner;
    }

    public final OrcaScreenConfig getScreen() {
        return this.screen;
    }

    public int hashCode() {
        OrcaPaletteConfig orcaPaletteConfig = this.palette;
        int iHashCode = (orcaPaletteConfig == null ? 0 : orcaPaletteConfig.hashCode()) * 31;
        OrcaBoxConfig orcaBoxConfig = this.box;
        int iHashCode2 = (iHashCode + (orcaBoxConfig == null ? 0 : orcaBoxConfig.hashCode())) * 31;
        OrcaButtonsConfig orcaButtonsConfig = this.buttons;
        int iHashCode3 = (iHashCode2 + (orcaButtonsConfig == null ? 0 : orcaButtonsConfig.hashCode())) * 31;
        OrcaScreenConfig orcaScreenConfig = this.screen;
        int iHashCode4 = (iHashCode3 + (orcaScreenConfig == null ? 0 : orcaScreenConfig.hashCode())) * 31;
        OrcaHintConfig orcaHintConfig = this.hint;
        int iHashCode5 = (iHashCode4 + (orcaHintConfig == null ? 0 : orcaHintConfig.hashCode())) * 31;
        OrcaInputFieldConfig orcaInputFieldConfig = this.inputField;
        int iHashCode6 = (iHashCode5 + (orcaInputFieldConfig == null ? 0 : orcaInputFieldConfig.hashCode())) * 31;
        OrcaPopupConfig orcaPopupConfig = this.popup;
        int iHashCode7 = (iHashCode6 + (orcaPopupConfig == null ? 0 : orcaPopupConfig.hashCode())) * 31;
        OrcaScannerConfig orcaScannerConfig = this.scanner;
        int iHashCode8 = (iHashCode7 + (orcaScannerConfig == null ? 0 : orcaScannerConfig.hashCode())) * 31;
        OrcaGraphicConfig orcaGraphicConfig = this.graphic;
        return iHashCode8 + (orcaGraphicConfig != null ? orcaGraphicConfig.hashCode() : 0);
    }

    public String toString() {
        return "OrcaColorsConfig(palette=" + this.palette + ", box=" + this.box + ", buttons=" + this.buttons + ", screen=" + this.screen + ", hint=" + this.hint + ", inputField=" + this.inputField + ", popup=" + this.popup + ", scanner=" + this.scanner + ", graphic=" + this.graphic + ")";
    }

    public OrcaColorsConfig(OrcaPaletteConfig orcaPaletteConfig, OrcaBoxConfig orcaBoxConfig, OrcaButtonsConfig orcaButtonsConfig, OrcaScreenConfig orcaScreenConfig, OrcaHintConfig orcaHintConfig, OrcaInputFieldConfig orcaInputFieldConfig, OrcaPopupConfig orcaPopupConfig, OrcaScannerConfig orcaScannerConfig, OrcaGraphicConfig orcaGraphicConfig) {
        this.palette = orcaPaletteConfig;
        this.box = orcaBoxConfig;
        this.buttons = orcaButtonsConfig;
        this.screen = orcaScreenConfig;
        this.hint = orcaHintConfig;
        this.inputField = orcaInputFieldConfig;
        this.popup = orcaPopupConfig;
        this.scanner = orcaScannerConfig;
        this.graphic = orcaGraphicConfig;
    }
}
