package uj;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d<T extends View, Z> implements j<Z> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f116364f = com.bumptech.glide.i.f20496a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f116365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f116366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f116367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f116368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f116369e;

    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f116370e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f116371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<i> f116372b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f116373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC2506a f116374d;

        /* JADX INFO: renamed from: uj.d$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC2506a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f116375a;

            ViewTreeObserverOnPreDrawListenerC2506a(@NonNull a aVar) {
                this.f116375a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f116375a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(@NonNull View view) {
            this.f116371a = view;
        }

        private static int c(@NonNull Context context) {
            if (f116370e == null) {
                Display defaultDisplay = ((WindowManager) xj.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f116370e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f116370e.intValue();
        }

        private int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f116373c && this.f116371a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f116371a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f116371a.getContext());
        }

        private int f() {
            int paddingTop = this.f116371a.getPaddingTop() + this.f116371a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f116371a.getLayoutParams();
            return e(this.f116371a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f116371a.getPaddingLeft() + this.f116371a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f116371a.getLayoutParams();
            return e(this.f116371a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        private boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        private void j(int i11, int i12) {
            Iterator it = new ArrayList(this.f116372b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).e(i11, i12);
            }
        }

        void a() {
            if (this.f116372b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f116371a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f116374d);
            }
            this.f116374d = null;
            this.f116372b.clear();
        }

        void d(@NonNull i iVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                iVar.e(iG, iF);
                return;
            }
            if (!this.f116372b.contains(iVar)) {
                this.f116372b.add(iVar);
            }
            if (this.f116374d == null) {
                ViewTreeObserver viewTreeObserver = this.f116371a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC2506a viewTreeObserverOnPreDrawListenerC2506a = new ViewTreeObserverOnPreDrawListenerC2506a(this);
                this.f116374d = viewTreeObserverOnPreDrawListenerC2506a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2506a);
            }
        }

        void k(@NonNull i iVar) {
            this.f116372b.remove(iVar);
        }
    }

    public d(@NonNull T t11) {
        this.f116366b = (T) xj.k.d(t11);
        this.f116365a = new a(t11);
    }

    private Object a() {
        return this.f116366b.getTag(f116364f);
    }

    private void b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f116367c;
        if (onAttachStateChangeListener == null || this.f116369e) {
            return;
        }
        this.f116366b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f116369e = true;
    }

    private void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f116367c;
        if (onAttachStateChangeListener == null || !this.f116369e) {
            return;
        }
        this.f116366b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f116369e = false;
    }

    private void f(Object obj) {
        this.f116366b.setTag(f116364f, obj);
    }

    protected abstract void d(Drawable drawable);

    @Override // uj.j
    public final com.bumptech.glide.request.e getRequest() {
        Object objA = a();
        if (objA == null) {
            return null;
        }
        if (objA instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) objA;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // uj.j
    public final void getSize(@NonNull i iVar) {
        this.f116365a.d(iVar);
    }

    @Override // uj.j
    public final void onLoadCleared(Drawable drawable) {
        this.f116365a.b();
        d(drawable);
        if (this.f116368d) {
            return;
        }
        c();
    }

    @Override // uj.j
    public final void onLoadStarted(Drawable drawable) {
        b();
        e(drawable);
    }

    @Override // uj.j
    public final void removeCallback(@NonNull i iVar) {
        this.f116365a.k(iVar);
    }

    @Override // uj.j
    public final void setRequest(com.bumptech.glide.request.e eVar) {
        f(eVar);
    }

    public String toString() {
        return "Target for: " + this.f116366b;
    }

    @Override // rj.l
    public void onDestroy() {
    }

    @Override // rj.l
    public void onStart() {
    }

    @Override // rj.l
    public void onStop() {
    }

    protected void e(Drawable drawable) {
    }
}
