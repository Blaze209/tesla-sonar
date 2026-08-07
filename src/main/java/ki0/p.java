package ki0;

import android.text.StaticLayout;
import android.widget.TextView;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/widget/TextView;", "", "a", "(Landroid/widget/TextView;)I", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {
    public static final int a(TextView textView) {
        int width;
        p013kotlin.jvm.internal.s.k(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || (width = textView.getWidth()) == 0 || t.y0(text)) {
            return 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).build();
        p013kotlin.jvm.internal.s.j(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getLineCount();
    }
}
