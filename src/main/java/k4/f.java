package k4;

import android.os.Build;
import android.text.TextPaint;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "text", "Landroid/text/TextPaint;", "textPaint", "Lk4/e;", "a", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Lk4/e;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final e a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new c(charSequence, textPaint) : new d(charSequence);
    }
}
