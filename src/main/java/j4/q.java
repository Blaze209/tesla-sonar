package j4;

import android.text.Layout;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/text/Layout;", "", "offset", "", "upstream", "a", "(Landroid/text/Layout;IZ)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    public static final int a(Layout layout, int i11, boolean z11) {
        if (i11 <= 0) {
            return 0;
        }
        if (i11 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i11);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i11 || lineEnd == i11) {
            if (lineStart == i11) {
                if (z11) {
                    return lineForOffset - 1;
                }
            } else if (!z11) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
