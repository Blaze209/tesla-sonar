package uj;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f<Z> extends k<ImageView, Z> implements vj.b.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Animatable f116376h;

    public f(ImageView imageView) {
        super(imageView);
    }

    private void f(Z z11) {
        if (!(z11 instanceof Animatable)) {
            this.f116376h = null;
            return;
        }
        Animatable animatable = (Animatable) z11;
        this.f116376h = animatable;
        animatable.start();
    }

    private void i(Z z11) {
        h(z11);
        f(z11);
    }

    public void g(Drawable drawable) {
        ((ImageView) this.f116381a).setImageDrawable(drawable);
    }

    protected abstract void h(Z z11);

    @Override // uj.k, uj.a, uj.j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f116376h;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        g(drawable);
    }

    @Override // uj.a, uj.j
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        i(null);
        g(drawable);
    }

    @Override // uj.k, uj.a, uj.j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        i(null);
        g(drawable);
    }

    @Override // uj.j
    public void onResourceReady(@NonNull Z z11, vj.b<? super Z> bVar) {
        if (bVar == null || !bVar.a(z11, this)) {
            i(z11);
        } else {
            f(z11);
        }
    }

    @Override // uj.a, rj.l
    public void onStart() {
        Animatable animatable = this.f116376h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // uj.a, rj.l
    public void onStop() {
        Animatable animatable = this.f116376h;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
