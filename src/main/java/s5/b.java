package s5;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class b {

    static class a {
        static Spanned a(String str, int i11) {
            return Html.fromHtml(str, i11);
        }
    }

    public static Spanned a(String str, int i11) {
        return a.a(str, i11);
    }
}
