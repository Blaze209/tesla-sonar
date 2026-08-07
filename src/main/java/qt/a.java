package qt;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import st.g;
import st.k;
import st.n;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Drawable implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f106144a;

    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f106144a = new b(this.f106144a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f106144a;
        if (bVar.f106146b) {
            bVar.f106145a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f106144a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f106144a.f106145a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f106144a.f106145a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f106144a.f106145a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = qt.b.e(iArr);
        b bVar = this.f106144a;
        if (bVar.f106146b == zE) {
            return zOnStateChange;
        }
        bVar.f106146b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f106144a.f106145a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f106144a.f106145a.setColorFilter(colorFilter);
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f106144a.f106145a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        this.f106144a.f106145a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f106144a.f106145a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f106144a.f106145a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        g f106145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f106146b;

        public b(g gVar) {
            this.f106145a = gVar;
            this.f106146b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.f106145a = (g) bVar.f106145a.getConstantState().newDrawable();
            this.f106146b = bVar.f106146b;
        }
    }

    private a(b bVar) {
        this.f106144a = bVar;
    }
}
