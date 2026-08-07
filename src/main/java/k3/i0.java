package k3;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0002\u000f\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Lk3/i0;", "Lk3/g3;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Lo3/a;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/ViewGroup;)Lo3/a;", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)J", "Ln3/c;", "a", "()Ln3/c;", "layer", "Ljn0/h0;", "b", "(Ln3/c;)V", "Landroid/view/ViewGroup;", "", "Ljava/lang/Object;", "lock", "Lo3/a;", "viewLayerContainer", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;", "componentCallback", "e", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i0 implements g3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f84791f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup ownerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private o3.a viewLayerContainer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2 componentCallback = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk3/i0$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f84796a = new b();

        private b() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public i0(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
    }

    private final long c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(view);
        }
        return -1L;
    }

    private final o3.a d(ViewGroup ownerView) {
        o3.a aVar = this.viewLayerContainer;
        if (aVar != null) {
            return aVar;
        }
        o3.b bVar = new o3.b(ownerView.getContext());
        ownerView.addView(bVar);
        this.viewLayerContainer = bVar;
        return bVar;
    }

    @Override // k3.g3
    public n3.c a() {
        n3.d hVar;
        n3.c cVar;
        synchronized (this.lock) {
            try {
                long jC = c(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    hVar = new n3.g(jC, null, null, 6, null);
                } else if (f84791f) {
                    try {
                        hVar = new n3.f(this.ownerView, jC, null, null, 12, null);
                    } catch (Throwable unused) {
                        f84791f = false;
                        hVar = new n3.h(d(this.ownerView), jC, null, null, 12, null);
                    }
                } else {
                    hVar = new n3.h(d(this.ownerView), jC, null, null, 12, null);
                }
                cVar = new n3.c(hVar, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // k3.g3
    public void b(n3.c layer) {
        synchronized (this.lock) {
            layer.H();
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }
}
