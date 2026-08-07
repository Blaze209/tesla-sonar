package o4;

import android.view.inputmethod.ExtractedText;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/o0;", "Landroid/view/inputmethod/ExtractedText;", "a", "(Lo4/o0;)Landroid/view/inputmethod/ExtractedText;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = i4.p0.l(textFieldValue.getSelection());
        extractedText.selectionEnd = i4.p0.k(textFieldValue.getSelection());
        extractedText.flags = !p013kotlin.text.t.g0(textFieldValue.h(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
