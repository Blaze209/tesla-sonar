package vc;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ec.n;
import ec.u;
import p013kotlin.Metadata;
import xc.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\u0004\u0018\u00010\u001d8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lvc/a;", "Landroid/view/View;", "T", "Lvc/d;", "Lxc/e;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lec/n;", "placeholder", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lec/n;)V", AnalyticsAttribute.Error, "c", "result", "b", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "image", "g", "f", "", "a", "Z", "isStarted", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "e", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T extends View> implements d<T>, e, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isStarted;

    @Override // xc.e
    public abstract Drawable a();

    @Override // vc.c
    public void b(n result) {
        g(result);
    }

    @Override // vc.c
    public void c(n error) {
        g(error);
    }

    @Override // vc.c
    public void d(n placeholder) {
        g(placeholder);
    }

    public abstract void e(Drawable drawable);

    protected final void f() {
        Object objA = a();
        Animatable animatable = objA instanceof Animatable ? (Animatable) objA : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void g(n image) {
        Drawable drawableA = image != null ? u.a(image, getView().getResources()) : null;
        Object objA = a();
        Animatable animatable = objA instanceof Animatable ? (Animatable) objA : null;
        if (animatable != null) {
            animatable.stop();
        }
        e(drawableA);
        f();
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        this.isStarted = true;
        f();
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        this.isStarted = false;
        f();
    }
}
