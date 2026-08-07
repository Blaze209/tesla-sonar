package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class t extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f2808a;

    public t(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2808a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2808a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2808a.g(canvas);
    }

    public t(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.M);
    }

    public t(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        w0.a(this, getContext());
        u uVar = new u(this);
        this.f2808a = uVar;
        uVar.c(attributeSet, i11);
    }
}
