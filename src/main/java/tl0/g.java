package tl0;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class g extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f114785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ql0.c f114787c;

    public g(@NonNull rl0.c cVar, @NonNull String str, @NonNull ql0.c cVar2) {
        super(str);
        this.f114785a = cVar;
        this.f114786b = str;
        this.f114787c = cVar2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f114787c.a(view, this.f114786b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.f114785a.f(textPaint);
    }
}
