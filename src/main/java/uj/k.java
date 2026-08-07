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
@Deprecated
public abstract class k<T extends View, Z> extends uj.a<Z> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f116379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f116380g = com.bumptech.glide.i.f20496a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f116381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f116382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f116383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f116384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f116385e;

    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f116386e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f116387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<i> f116388b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f116389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC2507a f116390d;

        /* JADX INFO: renamed from: uj.k$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC2507a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f116391a;

            ViewTreeObserverOnPreDrawListenerC2507a(@NonNull a aVar) {
                this.f116391a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f116391a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(@NonNull View view) {
            this.f116387a = view;
        }

        private static int c(@NonNull Context context) {
            if (f116386e == null) {
                Display defaultDisplay = ((WindowManager) xj.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f116386e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f116386e.intValue();
        }

        private int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f116389c && this.f116387a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f116387a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f116387a.getContext());
        }

        private int f() {
            int paddingTop = this.f116387a.getPaddingTop() + this.f116387a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f116387a.getLayoutParams();
            return e(this.f116387a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f116387a.getPaddingLeft() + this.f116387a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f116387a.getLayoutParams();
            return e(this.f116387a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        private boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        private void j(int i11, int i12) {
            Iterator it = new ArrayList(this.f116388b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).e(i11, i12);
            }
        }

        void a() {
            if (this.f116388b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f116387a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f116390d);
            }
            this.f116390d = null;
            this.f116388b.clear();
        }

        void d(@NonNull i iVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                iVar.e(iG, iF);
                return;
            }
            if (!this.f116388b.contains(iVar)) {
                this.f116388b.add(iVar);
            }
            if (this.f116390d == null) {
                ViewTreeObserver viewTreeObserver = this.f116387a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC2507a viewTreeObserverOnPreDrawListenerC2507a = new ViewTreeObserverOnPreDrawListenerC2507a(this);
                this.f116390d = viewTreeObserverOnPreDrawListenerC2507a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2507a);
            }
        }

        void k(@NonNull i iVar) {
            this.f116388b.remove(iVar);
        }
    }

    public k(@NonNull T t11) {
        this.f116381a = (T) xj.k.d(t11);
        this.f116382b = new a(t11);
    }

    private Object a() {
        return this.f116381a.getTag(f116380g);
    }

    private void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f116383c;
        if (onAttachStateChangeListener == null || this.f116385e) {
            return;
        }
        this.f116381a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f116385e = true;
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f116383c;
        if (onAttachStateChangeListener == null || !this.f116385e) {
            return;
        }
        this.f116381a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f116385e = false;
    }

    private void e(Object obj) {
        f116379f = true;
        this.f116381a.setTag(f116380g, obj);
    }

    @NonNull
    public T b() {
        return this.f116381a;
    }

    @Override // uj.j
    public com.bumptech.glide.request.e getRequest() {
        Object objA = a();
        if (objA == null) {
            return null;
        }
        if (objA instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) objA;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // uj.j
    public void getSize(@NonNull i iVar) {
        this.f116382b.d(iVar);
    }

    @Override // uj.a, uj.j
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f116382b.b();
        if (this.f116384d) {
            return;
        }
        d();
    }

    @Override // uj.a, uj.j
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        c();
    }

    @Override // uj.j
    public void removeCallback(@NonNull i iVar) {
        this.f116382b.k(iVar);
    }

    @Override // uj.j
    public void setRequest(com.bumptech.glide.request.e eVar) {
        e(eVar);
    }

    public String toString() {
        return "Target for: " + this.f116381a;
    }
}
