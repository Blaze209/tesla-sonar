package ig0;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCombinedStepComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "document_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final ButtonCombinedStepComponentStyle a(ButtonCancelComponentStyle buttonCancelComponentStyle) {
        p013kotlin.jvm.internal.s.k(buttonCancelComponentStyle, "<this>");
        return new ButtonCombinedStepComponentStyle(buttonCancelComponentStyle.getPadding(), buttonCancelComponentStyle.getMargin(), buttonCancelComponentStyle.getJustify(), buttonCancelComponentStyle.getFontFamily(), buttonCancelComponentStyle.getFontSize(), buttonCancelComponentStyle.getFontWeight(), buttonCancelComponentStyle.getLetterSpacing(), buttonCancelComponentStyle.getLineHeight(), buttonCancelComponentStyle.getTextColor(), buttonCancelComponentStyle.getHeight(), buttonCancelComponentStyle.getWidth(), buttonCancelComponentStyle.getBackgroundColor(), buttonCancelComponentStyle.getBorderColor(), buttonCancelComponentStyle.getBorderRadius(), buttonCancelComponentStyle.getBorderWidth());
    }

    public static final ButtonCombinedStepComponentStyle b(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
        p013kotlin.jvm.internal.s.k(buttonSubmitComponentStyle, "<this>");
        return new ButtonCombinedStepComponentStyle(buttonSubmitComponentStyle.getPadding(), buttonSubmitComponentStyle.getMargin(), buttonSubmitComponentStyle.getJustify(), buttonSubmitComponentStyle.getFontFamily(), buttonSubmitComponentStyle.getFontSize(), buttonSubmitComponentStyle.getFontWeight(), buttonSubmitComponentStyle.getLetterSpacing(), buttonSubmitComponentStyle.getLineHeight(), buttonSubmitComponentStyle.getTextColor(), buttonSubmitComponentStyle.getHeight(), buttonSubmitComponentStyle.getWidth(), buttonSubmitComponentStyle.getBackgroundColor(), buttonSubmitComponentStyle.getBorderColor(), buttonSubmitComponentStyle.getBorderRadius(), buttonSubmitComponentStyle.getBorderWidth());
    }
}
