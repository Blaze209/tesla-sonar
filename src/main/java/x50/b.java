package x50;

import android.text.Html;
import android.text.Spanned;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import p020r2.o;
import v50.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "source", "Landroid/text/Spanned;", "a", "(Ljava/lang/String;)Landroid/text/Spanned;", "html", "Lv50/g$d;", "b", "(Ljava/lang/String;Lr2/l;I)Lv50/g$d;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final Spanned a(String source) {
        s.k(source, "source");
        Spanned spannedFromHtml = Html.fromHtml(source, 0);
        s.h(spannedFromHtml);
        return spannedFromHtml;
    }

    public static final g.Text b(String html, l lVar, int i11) {
        s.k(html, "html");
        lVar.H(1858689687);
        if (o.J()) {
            o.S(1858689687, i11, -1, "com.stripe.android.financialconnections.ui.sdui.rememberHtml (ServerDrivenUi.kt:38)");
        }
        lVar.H(-482654486);
        boolean z11 = (((i11 & 14) ^ 6) > 4 && lVar.n(html)) || (i11 & 6) == 4;
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = new g.Text(a(html));
            lVar.B(objI);
        }
        g.Text text = (g.Text) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return text;
    }
}
