package nj;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T extends Drawable> implements fj.c<T>, fj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f95061a;

    public e(T t11) {
        this.f95061a = (T) k.d(t11);
    }

    @Override // fj.c
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f95061a.getConstantState();
        return constantState == null ? this.f95061a : (T) constantState.newDrawable();
    }

    @Override // fj.b
    public void initialize() {
        T t11 = this.f95061a;
        if (t11 instanceof BitmapDrawable) {
            ((BitmapDrawable) t11).getBitmap().prepareToDraw();
        } else if (t11 instanceof pj.c) {
            ((pj.c) t11).e().prepareToDraw();
        }
    }
}
