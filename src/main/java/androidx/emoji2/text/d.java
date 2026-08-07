package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class d implements e.InterfaceC0167e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f8251b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f8252a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f8252a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f8251b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.InterfaceC0167e
    public boolean a(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i11 < i12) {
            sbB.append(charSequence.charAt(i11));
            i11++;
        }
        return k5.f.a(this.f8252a, sbB.toString());
    }
}
