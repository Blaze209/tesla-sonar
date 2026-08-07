package com.fourthline.scanners.config.orca.flavor.extensions;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaFonts;
import com.fourthline.orca.core.flavor.OrcaLayouts;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.flavor.OrcaColorModeConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaColorsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaFlavorConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaFontsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaLayoutsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaLocalizationConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\f"}, d2 = {"toOrcaFlavor", "Lcom/fourthline/orca/core/flavor/OrcaFlavor;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFlavorConfig;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "orcaFlavorDecodingError", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$DecodingError;", "value", "", "expectedType", "", "path", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaFlavorConfigExtensionsKt {
    public static final CommonJsonError.DecodingError orcaFlavorDecodingError(Object value, String expectedType, String path) {
        s.k(value, "value");
        s.k(expectedType, "expectedType");
        s.k(path, "path");
        return new CommonJsonError.DecodingError("Could not deserialize '" + value + "' as " + expectedType + " for configuration object '" + path + "'.");
    }

    public static final OrcaFlavor toOrcaFlavor(OrcaFlavorConfig orcaFlavorConfig, Context context) throws Exception {
        OrcaColors colorsDark;
        OrcaLayouts layouts;
        OrcaFonts fonts;
        OrcaLocalization localization;
        OrcaColorsConfig colorsDark2;
        OrcaColorsConfig colorsLight;
        s.k(orcaFlavorConfig, "<this>");
        s.k(context, "context");
        OrcaFlavor orcaFlavor = new OrcaFlavor(null, null, null, null, null, 31, null);
        try {
            OrcaColorModeConfig colors = orcaFlavorConfig.getColors();
            OrcaColors orcaColors = (colors == null || (colorsLight = colors.getColorsLight()) == null) ? null : OrcaColorsConfigExtensionsKt.toOrcaColors(colorsLight);
            OrcaColorModeConfig colors2 = orcaFlavorConfig.getColors();
            if (colors2 == null || (colorsDark2 = colors2.getColorsDark()) == null || (colorsDark = OrcaColorsConfigExtensionsKt.toOrcaColors(colorsDark2)) == null) {
                colorsDark = orcaColors;
            }
            if (orcaColors == null) {
                orcaColors = orcaFlavor.getColorsLight();
            }
            OrcaColors orcaColors2 = orcaColors;
            if (colorsDark == null) {
                colorsDark = orcaFlavor.getColorsDark();
            }
            OrcaColors orcaColors3 = colorsDark;
            OrcaLayoutsConfig layouts2 = orcaFlavorConfig.getLayouts();
            if (layouts2 == null || (layouts = OrcaLayoutsConfigExtensionsKt.toOrcaLayouts(layouts2)) == null) {
                layouts = orcaFlavor.getLayouts();
            }
            OrcaLayouts orcaLayouts = layouts;
            OrcaFontsConfig fonts2 = orcaFlavorConfig.getFonts();
            if (fonts2 == null || (fonts = OrcaFontsConfigExtensionsKt.toOrcaFonts(fonts2, context)) == null) {
                fonts = orcaFlavor.getFonts();
            }
            OrcaFonts orcaFonts = fonts;
            OrcaLocalizationConfig localization2 = orcaFlavorConfig.getLocalization();
            if (localization2 == null || (localization = OrcaLocalizationConfigExtensionsKt.toOrcaLocalization(localization2)) == null) {
                localization = orcaFlavor.getLocalization();
            }
            return new OrcaFlavor(orcaColors2, orcaColors3, orcaLayouts, orcaFonts, localization);
        } catch (Exception e11) {
            if (e11 instanceof CommonJsonError) {
                throw e11;
            }
            throw CommonJsonError.IncorrectConfiguration.INSTANCE;
        }
    }
}
