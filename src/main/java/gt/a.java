package gt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;
import ft.c;
import ft.d;

/* JADX INFO: loaded from: classes5.dex */
public class a extends MaterialCardView implements d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    private final c f69549r;

    public a(Context context) {
        this(context, null);
    }

    @Override // ft.d
    public void a() {
        this.f69549r.b();
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
        this.f69549r.a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        c cVar = this.f69549r;
        if (cVar != null) {
            cVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f69549r.e();
    }

    @Override // ft.d
    public int getCircularRevealScrimColor() {
        return this.f69549r.f();
    }

    @Override // ft.d
    public d.e getRevealInfo() {
        return this.f69549r.h();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.f69549r;
        return cVar != null ? cVar.j() : super.isOpaque();
    }

    @Override // ft.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f69549r.k(drawable);
    }

    @Override // ft.d
    public void setCircularRevealScrimColor(int i11) {
        this.f69549r.l(i11);
    }

    @Override // ft.d
    public void setRevealInfo(d.e eVar) {
        this.f69549r.m(eVar);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69549r = new c(this);
    }
}
