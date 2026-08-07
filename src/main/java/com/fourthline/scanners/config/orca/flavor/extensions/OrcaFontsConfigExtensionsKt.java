package com.fourthline.scanners.config.orca.flavor.extensions;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.core.flavor.OrcaFonts;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.flavor.OrcaFontMapping;
import com.fourthline.scanners.config.orca.flavor.OrcaFontsConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.a;
import sn0.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"defaultFont", "Lcom/fourthline/orca/core/flavor/OrcaFonts;", "FONT_FOLDER_NAME", "", "toOrcaFonts", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFontsConfig;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getFontFile", "Ljava/io/File;", "fontName", "dropExtension", "fileFromAsset", "name", "fourthline-adapters-json_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OrcaFontsConfigExtensionsKt {
    private static final String FONT_FOLDER_NAME = "fonts";
    private static final OrcaFonts defaultFont = new OrcaFonts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);

    private static final String dropExtension(String str) {
        return v.y0(v.j0(t.f1(str, new String[]{"."}, false, 0, 6, null), 1), ".", null, null, 0, null, null, 62, null);
    }

    private static final File fileFromAsset(Context context, String str) throws IOException {
        File file = new File(context.getCacheDir() + "/" + str);
        InputStream inputStreamOpen = context.getAssets().open("fonts/" + str);
        s.j(inputStreamOpen, "open(...)");
        h.o(file, a.c(inputStreamOpen));
        return file;
    }

    private static final File getFontFile(Context context, String str) throws CommonJsonError.MissingFont, IOException, CommonJsonError.DecodingError {
        String str2;
        String[] list = context.getAssets().list("fonts");
        if (list != null) {
            int length = list.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    str2 = null;
                    break;
                }
                str2 = list[i11];
                s.h(str2);
                if (s.f(dropExtension(str2), str)) {
                    break;
                }
                i11++;
            }
            if (str2 != null) {
                try {
                    return fileFromAsset(context, str2);
                } catch (Exception unused) {
                    throw OrcaFlavorConfigExtensionsKt.orcaFlavorDecodingError(str, "Font", "flavor.fonts");
                }
            }
        }
        throw new CommonJsonError.MissingFont(str);
    }

    public static final OrcaFonts toOrcaFonts(OrcaFontsConfig orcaFontsConfig, Context context) {
        s.k(orcaFontsConfig, "<this>");
        s.k(context, "context");
        OrcaFontMapping screenHeader = orcaFontsConfig.getScreenHeader();
        OrcaFonts.Font fromFile = screenHeader != null ? new OrcaFonts.Font.FromFile(getFontFile(context, screenHeader.getFontName()), screenHeader.getFontSize()) : defaultFont.getScreenHeader();
        OrcaFontMapping screenTitle = orcaFontsConfig.getScreenTitle();
        OrcaFonts.Font fromFile2 = screenTitle != null ? new OrcaFonts.Font.FromFile(getFontFile(context, screenTitle.getFontName()), screenTitle.getFontSize()) : defaultFont.getScreenTitle();
        OrcaFontMapping screenMessage = orcaFontsConfig.getScreenMessage();
        OrcaFonts.Font fromFile3 = screenMessage != null ? new OrcaFonts.Font.FromFile(getFontFile(context, screenMessage.getFontName()), screenMessage.getFontSize()) : defaultFont.getScreenMessage();
        OrcaFontMapping popupTitle = orcaFontsConfig.getPopupTitle();
        OrcaFonts.Font fromFile4 = popupTitle != null ? new OrcaFonts.Font.FromFile(getFontFile(context, popupTitle.getFontName()), popupTitle.getFontSize()) : defaultFont.getPopupTitle();
        OrcaFontMapping popupMessage = orcaFontsConfig.getPopupMessage();
        OrcaFonts.Font fromFile5 = popupMessage != null ? new OrcaFonts.Font.FromFile(getFontFile(context, popupMessage.getFontName()), popupMessage.getFontSize()) : defaultFont.getPopupMessage();
        OrcaFontMapping primaryButton = orcaFontsConfig.getPrimaryButton();
        OrcaFonts.Font fromFile6 = primaryButton != null ? new OrcaFonts.Font.FromFile(getFontFile(context, primaryButton.getFontName()), primaryButton.getFontSize()) : defaultFont.getPrimaryButton();
        OrcaFontMapping secondaryButton = orcaFontsConfig.getSecondaryButton();
        OrcaFonts.Font fromFile7 = secondaryButton != null ? new OrcaFonts.Font.FromFile(getFontFile(context, secondaryButton.getFontName()), secondaryButton.getFontSize()) : defaultFont.getSecondaryButton();
        OrcaFontMapping inputField = orcaFontsConfig.getInputField();
        OrcaFonts.Font fromFile8 = inputField != null ? new OrcaFonts.Font.FromFile(getFontFile(context, inputField.getFontName()), inputField.getFontSize()) : defaultFont.getInputField();
        OrcaFontMapping inputFieldPlaceholder = orcaFontsConfig.getInputFieldPlaceholder();
        OrcaFonts.Font fromFile9 = inputFieldPlaceholder != null ? new OrcaFonts.Font.FromFile(getFontFile(context, inputFieldPlaceholder.getFontName()), inputFieldPlaceholder.getFontSize()) : defaultFont.getInputFieldPlaceholder();
        OrcaFontMapping inputFieldTitle = orcaFontsConfig.getInputFieldTitle();
        OrcaFonts.Font fromFile10 = inputFieldTitle != null ? new OrcaFonts.Font.FromFile(getFontFile(context, inputFieldTitle.getFontName()), inputFieldTitle.getFontSize()) : defaultFont.getInputFieldTitle();
        OrcaFontMapping inputFieldStatus = orcaFontsConfig.getInputFieldStatus();
        OrcaFonts.Font fromFile11 = inputFieldStatus != null ? new OrcaFonts.Font.FromFile(getFontFile(context, inputFieldStatus.getFontName()), inputFieldStatus.getFontSize()) : defaultFont.getInputFieldStatus();
        OrcaFontMapping scannerInstructionText = orcaFontsConfig.getScannerInstructionText();
        OrcaFonts.Font fromFile12 = scannerInstructionText != null ? new OrcaFonts.Font.FromFile(getFontFile(context, scannerInstructionText.getFontName()), scannerInstructionText.getFontSize()) : defaultFont.getScannerInstructionText();
        OrcaFontMapping confirmationScreenTitle = orcaFontsConfig.getConfirmationScreenTitle();
        OrcaFonts.Font fromFile13 = confirmationScreenTitle != null ? new OrcaFonts.Font.FromFile(getFontFile(context, confirmationScreenTitle.getFontName()), confirmationScreenTitle.getFontSize()) : defaultFont.getConfirmationScreenTitle();
        OrcaFontMapping confirmationScreenCheckpoints = orcaFontsConfig.getConfirmationScreenCheckpoints();
        OrcaFonts.Font fromFile14 = confirmationScreenCheckpoints != null ? new OrcaFonts.Font.FromFile(getFontFile(context, confirmationScreenCheckpoints.getFontName()), confirmationScreenCheckpoints.getFontSize()) : defaultFont.getConfirmationScreenCheckpoints();
        OrcaFontMapping tableElementTitle = orcaFontsConfig.getTableElementTitle();
        return new OrcaFonts(fromFile, fromFile2, fromFile3, null, fromFile5, fromFile4, fromFile6, fromFile7, fromFile8, fromFile9, fromFile10, fromFile11, fromFile12, fromFile13, fromFile14, tableElementTitle != null ? new OrcaFonts.Font.FromFile(getFontFile(context, tableElementTitle.getFontName()), tableElementTitle.getFontSize()) : defaultFont.getTableElementTitle(), null, null, null, 458760, null);
    }
}
