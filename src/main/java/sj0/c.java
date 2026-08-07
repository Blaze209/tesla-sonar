package sj0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f111283c = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f111284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111285b;

    public c(Context context) {
        super(context);
        this.f111284a = new f();
        a(null, 0);
    }

    private void a(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f111300a, i11, 0);
        this.f111285b = typedArrayObtainStyledAttributes.getColor(h.f111301b, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @NonNull
    private a getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new i() : new j(getContext());
    }

    public e b(boolean z11) {
        return this.f111284a.b(z11);
    }

    public e c(float f11) {
        return this.f111284a.d(f11);
    }

    public e d(int i11) {
        this.f111285b = i11;
        return this.f111284a.e(i11);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f111284a.a(canvas)) {
            super.draw(canvas);
        }
    }

    public e e(@NonNull ViewGroup viewGroup, a aVar) {
        this.f111284a.destroy();
        g gVar = new g(this, viewGroup, this.f111285b, aVar);
        this.f111284a = gVar;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f111284a.f(true);
        } else {
            Log.e(f111283c, "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f111284a.f(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f111284a.c();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111284a = new f();
        a(attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f111284a = new f();
        a(attributeSet, i11);
    }
}
