package com.fourthline.scanners.config.orca.flavor.extensions;

import com.fourthline.orca.core.flavor.OrcaColors;
import com.fourthline.orca.core.flavor.OrcaPalette;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.flavor.OrcaButtonsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaColorsConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaGraphicConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaHintConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaInputFieldConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaPaletteConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaPopupConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaScannerConfig;
import com.fourthline.scanners.config.orca.flavor.OrcaScreenConfig;
import com.fourthline.scanners.config.orca.flavor.extensions.OrcaColorsConfigExtensionsKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.a;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"toOrcaColors", "Lcom/fourthline/orca/core/flavor/OrcaColors;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaColorsConfig;", "toOrcaColor", "Lcom/fourthline/orca/core/flavor/OrcaColors$OrcaColor$FromLong;", "", "parseColor", "", "value", "(Ljava/lang/String;)Ljava/lang/Long;", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaColorsConfigExtensionsKt {
    private static final Long parseColor(String str) throws CommonJsonError.DecodingError {
        String strY0;
        try {
            if (t.b0(str, "#", false, 2, null)) {
                String strSubstring = str.substring(1);
                s.j(strSubstring, "substring(...)");
                strY0 = strSubstring;
            } else {
                strY0 = str;
            }
            if (strY0.length() == 3) {
                strY0 = v.y0(t.f1(strY0, new String[]{""}, false, 0, 6, null), "", null, null, 0, null, new l() { // from class: rp.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return OrcaColorsConfigExtensionsKt.parseColor$lambda$1((String) obj);
                    }
                }, 30, null);
            }
            long j11 = Long.parseLong(strY0, a.a(16));
            if (strY0.length() == 6) {
                j11 |= -16777216;
            } else if (strY0.length() != 8) {
                throw new IllegalArgumentException("Unknown color");
            }
            return Long.valueOf(j11);
        } catch (Exception unused) {
            throw OrcaFlavorConfigExtensionsKt.orcaFlavorDecodingError(str, "color", "flavor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence parseColor$lambda$1(String it) {
        s.k(it, "it");
        return it + it;
    }

    public static final OrcaColors.OrcaColor.FromLong toOrcaColor(String str) throws CommonJsonError.DecodingError {
        s.k(str, "<this>");
        Long color = parseColor(str);
        if (color != null) {
            return new OrcaColors.OrcaColor.FromLong(color.longValue());
        }
        return null;
    }

    public static final OrcaColors toOrcaColors(OrcaColorsConfig orcaColorsConfig) {
        OrcaPalette orcaPalette;
        s.k(orcaColorsConfig, "<this>");
        OrcaPaletteConfig palette = orcaColorsConfig.getPalette();
        if (palette == null || (orcaPalette = OrcaPaletteConfigExtensionsKt.toOrcaPalette(palette)) == null) {
            orcaPalette = new OrcaPalette(false, null, null, null, null, null, null, null, null, 511, null);
        }
        OrcaColors orcaColors = new OrcaColors(orcaPalette);
        OrcaScreenConfig screen = orcaColorsConfig.getScreen();
        if (screen != null) {
            OrcaElementsExtensionsKt.mapToOrcaScreen(screen, orcaColors.getScreen());
        }
        OrcaInputFieldConfig inputField = orcaColorsConfig.getInputField();
        if (inputField != null) {
            OrcaElementsExtensionsKt.mapToOrcaInputField(inputField, orcaColors.getInputField());
        }
        OrcaButtonsConfig buttons = orcaColorsConfig.getButtons();
        if (buttons != null) {
            OrcaElementsExtensionsKt.mapToOrcaButtons(buttons, orcaColors.getButtons());
        }
        OrcaScannerConfig scanner = orcaColorsConfig.getScanner();
        if (scanner != null) {
            OrcaElementsExtensionsKt.mapToOrcaScanner(scanner, orcaColors.getCom.fourthline.analytics.internal.AnalyticsContext.Scanner java.lang.String());
        }
        OrcaHintConfig hint = orcaColorsConfig.getHint();
        if (hint != null) {
            OrcaElementsExtensionsKt.mapToOrcaHint(hint, orcaColors.getHint());
        }
        OrcaPopupConfig popup = orcaColorsConfig.getPopup();
        if (popup != null) {
            OrcaElementsExtensionsKt.mapToOrcaPopup(popup, orcaColors.getPopup());
        }
        OrcaGraphicConfig graphic = orcaColorsConfig.getGraphic();
        if (graphic != null) {
            OrcaElementsExtensionsKt.mapToOrcaGraphic(graphic, orcaColors.getGraphic());
        }
        return orcaColors;
    }
}
