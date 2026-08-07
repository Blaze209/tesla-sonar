package com.fourthline.scanners.config.orca.flavor.extensions;

import com.fourthline.orca.core.flavor.OrcaLocalization;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.flavor.OrcaLocalizationConfig;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"toOrcaLocalization", "Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "toLanguageType", "Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaLocalizationConfigExtensionsKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final OrcaLocalization.LanguageType toLanguageType(String str) throws CommonJsonError.DecodingError {
        String upperCase = str.toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case 2117:
                if (upperCase.equals("BG")) {
                    return OrcaLocalization.LanguageType.BG;
                }
                break;
            case 2173:
                if (upperCase.equals("DA")) {
                    return OrcaLocalization.LanguageType.DA;
                }
                break;
            case 2177:
                if (upperCase.equals("DE")) {
                    return OrcaLocalization.LanguageType.DE;
                }
                break;
            case 2215:
                if (upperCase.equals("EL")) {
                    return OrcaLocalization.LanguageType.EL;
                }
                break;
            case 2217:
                if (upperCase.equals("EN")) {
                    return OrcaLocalization.LanguageType.EN;
                }
                break;
            case 2222:
                if (upperCase.equals("ES")) {
                    return OrcaLocalization.LanguageType.ES;
                }
                break;
            case 2223:
                if (upperCase.equals("ET")) {
                    return OrcaLocalization.LanguageType.ET;
                }
                break;
            case 2243:
                if (upperCase.equals("FI")) {
                    return OrcaLocalization.LanguageType.FI;
                }
                break;
            case 2252:
                if (upperCase.equals("FR")) {
                    return OrcaLocalization.LanguageType.FR;
                }
                break;
            case 2314:
                if (upperCase.equals("HR")) {
                    return OrcaLocalization.LanguageType.HR;
                }
                break;
            case 2347:
                if (upperCase.equals("IT")) {
                    return OrcaLocalization.LanguageType.IT;
                }
                break;
            case 2471:
                if (upperCase.equals("MT")) {
                    return OrcaLocalization.LanguageType.MT;
                }
                break;
            case 2484:
                if (upperCase.equals("NB")) {
                    return OrcaLocalization.LanguageType.NB;
                }
                break;
            case 2494:
                if (upperCase.equals("NL")) {
                    return OrcaLocalization.LanguageType.NL;
                }
                break;
            case 2556:
                if (upperCase.equals("PL")) {
                    return OrcaLocalization.LanguageType.PL;
                }
                break;
            case 2564:
                if (upperCase.equals("PT")) {
                    return OrcaLocalization.LanguageType.PT;
                }
                break;
            case 2621:
                if (upperCase.equals("RO")) {
                    return OrcaLocalization.LanguageType.RO;
                }
                break;
            case 2686:
                if (upperCase.equals("TR")) {
                    return OrcaLocalization.LanguageType.TR;
                }
                break;
        }
        throw OrcaFlavorConfigExtensionsKt.orcaFlavorDecodingError(str, "LanguageType", "flavor.localization");
    }

    public static final OrcaLocalization toOrcaLocalization(OrcaLocalizationConfig orcaLocalizationConfig) {
        OrcaLocalization.LanguageType baseLanguage;
        OrcaLocalization.LanguageType fixedLanguage;
        s.k(orcaLocalizationConfig, "<this>");
        OrcaLocalization orcaLocalization = new OrcaLocalization(null, null, 3, null);
        String baseLanguage2 = orcaLocalizationConfig.getBaseLanguage();
        if (baseLanguage2 == null || (baseLanguage = toLanguageType(baseLanguage2)) == null) {
            baseLanguage = orcaLocalization.getBaseLanguage();
        }
        String fixedLanguage2 = orcaLocalizationConfig.getFixedLanguage();
        if (fixedLanguage2 == null || (fixedLanguage = toLanguageType(fixedLanguage2)) == null) {
            fixedLanguage = orcaLocalization.getFixedLanguage();
        }
        return new OrcaLocalization(baseLanguage, fixedLanguage);
    }
}
