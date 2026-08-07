package ft;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class b extends FrameLayout implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final c f66556a;

    public b(@NonNull Context context) {
        this(context, null);
    }

    @Override // ft.d
    public void a() {
        this.f66556a.b();
    }

    @Override // ft.c.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // ft.c.a
    public boolean c() {
        return super.isOpaque();
    }

    @Override // ft.d
    public void d() {
        this.f66556a.a();
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
        c cVar = this.f66556a;
        if (cVar != null) {
            cVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f66556a.e();
    }

    @Override // ft.d
    public int getCircularRevealScrimColor() {
        return this.f66556a.f();
    }

    @Override // ft.d
    public d.e getRevealInfo() {
        return this.f66556a.h();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.f66556a;
        return cVar != null ? cVar.j() : super.isOpaque();
    }

    @Override // ft.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f66556a.k(drawable);
    }

    @Override // ft.d
    public void setCircularRevealScrimColor(int i11) {
        this.f66556a.l(i11);
    }

    @Override // ft.d
    public void setRevealInfo(d.e eVar) {
        this.f66556a.m(eVar);
    }

    public b(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66556a = new c(this);
    }
}
