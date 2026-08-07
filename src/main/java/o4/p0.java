package o4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/o0;", "", "maxChars", "Li4/d;", "c", "(Lo4/o0;I)Li4/d;", "b", "a", "(Lo4/o0;)Li4/d;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p0 {
    public static final i4.d a(TextFieldValue textFieldValue) {
        return textFieldValue.getText().s(textFieldValue.getSelection());
    }

    public static final i4.d b(TextFieldValue textFieldValue, int i11) {
        return textFieldValue.getText().subSequence(i4.p0.k(textFieldValue.getSelection()), Math.min(i4.p0.k(textFieldValue.getSelection()) + i11, textFieldValue.h().length()));
    }

    public static final i4.d c(TextFieldValue textFieldValue, int i11) {
        return textFieldValue.getText().subSequence(Math.max(0, i4.p0.l(textFieldValue.getSelection()) - i11), i4.p0.l(textFieldValue.getSelection()));
    }
}
