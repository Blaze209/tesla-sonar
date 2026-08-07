package com.fourthline.scanners.config.orca.flavor.extensions;

import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaPalette;
import com.fourthline.scanners.config.orca.flavor.OrcaPaletteConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toOrcaPalette", "Lcom/fourthline/orca/core/flavor/OrcaPalette;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaPaletteConfig;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaPaletteConfigExtensionsKt {
    public static final OrcaPalette toOrcaPalette(OrcaPaletteConfig orcaPaletteConfig) {
        OrcaColors.OrcaColor primary;
        OrcaColors.OrcaColor accent;
        OrcaColors.OrcaColor dark;
        OrcaColors.OrcaColor darkLight;
        OrcaColors.OrcaColor darkLighter;
        OrcaColors.OrcaColor darkSoft;
        OrcaColors.OrcaColor gray;
        OrcaColors.OrcaColor light;
        s.k(orcaPaletteConfig, "<this>");
        OrcaPalette orcaPalette = new OrcaPalette(false, null, null, null, null, null, null, null, null, 511, null);
        Boolean boolIsLight = orcaPaletteConfig.isLight();
        boolean zBooleanValue = boolIsLight != null ? boolIsLight.booleanValue() : orcaPalette.isLight();
        String primary2 = orcaPaletteConfig.getPrimary();
        if (primary2 == null || (primary = OrcaColorsConfigExtensionsKt.toOrcaColor(primary2)) == null) {
            primary = orcaPalette.getPrimary();
        }
        OrcaColors.OrcaColor orcaColor = primary;
        String accent2 = orcaPaletteConfig.getAccent();
        if (accent2 == null || (accent = OrcaColorsConfigExtensionsKt.toOrcaColor(accent2)) == null) {
            accent = orcaPalette.getAccent();
        }
        OrcaColors.OrcaColor orcaColor2 = accent;
        String dark2 = orcaPaletteConfig.getDark();
        if (dark2 == null || (dark = OrcaColorsConfigExtensionsKt.toOrcaColor(dark2)) == null) {
            dark = orcaPalette.getDark();
        }
        OrcaColors.OrcaColor orcaColor3 = dark;
        String darkLight2 = orcaPaletteConfig.getDarkLight();
        if (darkLight2 == null || (darkLight = OrcaColorsConfigExtensionsKt.toOrcaColor(darkLight2)) == null) {
            darkLight = orcaPalette.getDarkLight();
        }
        OrcaColors.OrcaColor orcaColor4 = darkLight;
        String darkLighter2 = orcaPaletteConfig.getDarkLighter();
        if (darkLighter2 == null || (darkLighter = OrcaColorsConfigExtensionsKt.toOrcaColor(darkLighter2)) == null) {
            darkLighter = orcaPalette.getDarkLighter();
        }
        OrcaColors.OrcaColor orcaColor5 = darkLighter;
        String darkSoft2 = orcaPaletteConfig.getDarkSoft();
        if (darkSoft2 == null || (darkSoft = OrcaColorsConfigExtensionsKt.toOrcaColor(darkSoft2)) == null) {
            darkSoft = orcaPalette.getDarkSoft();
        }
        OrcaColors.OrcaColor orcaColor6 = darkSoft;
        String gray2 = orcaPaletteConfig.getGray();
        if (gray2 == null || (gray = OrcaColorsConfigExtensionsKt.toOrcaColor(gray2)) == null) {
            gray = orcaPalette.getGray();
        }
        OrcaColors.OrcaColor orcaColor7 = gray;
        String light2 = orcaPaletteConfig.getLight();
        if (light2 == null || (light = OrcaColorsConfigExtensionsKt.toOrcaColor(light2)) == null) {
            light = orcaPalette.getLight();
        }
        return new OrcaPalette(zBooleanValue, orcaColor, orcaColor2, orcaColor3, orcaColor4, orcaColor5, orcaColor6, light, orcaColor7);
    }
}
