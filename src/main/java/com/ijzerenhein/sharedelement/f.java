package com.ijzerenhein.sharedelement;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f45567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f45568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f45569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ReadableMap f45570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f45571g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f45573i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45574j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f45575k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f45576l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<Callback> f45577m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f45578n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<Callback> f45579o = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f45572h = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private il.c<um.m> f45580p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Handler f45581q = null;

    class a extends p {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f45581q == null) {
                return;
            }
            this.f45646a++;
            boolean zI = f.this.i();
            boolean zJ = f.this.j();
            if (zI && zJ) {
                f.this.f45581q = null;
            } else {
                f.this.f45581q.postDelayed(this, 8L);
            }
        }
    }

    class b extends il.c<um.m> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f45583b;

        b(View view) {
            this.f45583b = view;
        }

        @Override // il.c, il.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void p(String str, um.m mVar, Animatable animatable) {
            f.this.p(this.f45583b);
            f.this.i();
        }

        @Override // il.c, il.d
        public void l(String str, Object obj) {
        }

        @Override // il.c, il.d
        public void n(String str, Throwable th2) {
            Log.d("RNSharedElementNode", "mDraweeControllerListener.onFailure: " + str + ", throwable: " + th2);
        }
    }

    f(Context context, int i11, View view, boolean z11, View view2, ReadableMap readableMap) {
        this.f45566b = i11;
        this.f45567c = view;
        this.f45568d = view2;
        this.f45569e = z11;
        this.f45570f = readableMap;
        this.f45571g = new j(readableMap, context);
        this.f45565a = context;
    }

    private void f(View view) {
        if (this.f45580p == null && (view instanceof pl.d)) {
            ol.a controller = ((pl.d) view).getController();
            if (controller instanceof el.e) {
                b bVar = new b(view);
                this.f45580p = bVar;
                ((el.e) controller).j(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        View viewM = m();
        if (viewM == null) {
            return false;
        }
        if (this.f45579o == null) {
            return true;
        }
        int width = viewM.getWidth();
        int height = viewM.getHeight();
        if (width == 0 && height == 0) {
            return false;
        }
        RectF rectFA = c.a(viewM);
        if (rectFA == null) {
            f(viewM);
            return false;
        }
        c cVar = new c();
        cVar.f45553a = viewM;
        cVar.f45554b = rectFA;
        this.f45578n = cVar;
        ArrayList<Callback> arrayList = this.f45579o;
        this.f45579o = null;
        Iterator<Callback> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().invoke(cVar, this);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        View viewM = m();
        if (viewM == null) {
            return false;
        }
        if (this.f45577m == null) {
            return true;
        }
        int left = viewM.getLeft();
        int top = viewM.getTop();
        int width = viewM.getWidth();
        int height = viewM.getHeight();
        if (width == 0 && height == 0) {
            return false;
        }
        Matrix matrixC = j.c(viewM);
        Matrix matrixC2 = j.c(this.f45568d);
        if (matrixC == null || matrixC2 == null) {
            return false;
        }
        Rect rect = new Rect(left, top, width + left, height + top);
        j jVar = new j(this.f45570f, this.f45565a);
        j.i(viewM, jVar.f45599a);
        jVar.f45600b = rect;
        j.i(this.f45568d, jVar.f45601c);
        jVar.f45602d = matrixC2;
        jVar.f45605g = viewM.getAlpha();
        this.f45576l = jVar;
        ArrayList<Callback> arrayList = this.f45577m;
        this.f45577m = null;
        Iterator<Callback> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().invoke(jVar, this);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(View view) {
        if (this.f45580p == null) {
            return;
        }
        ol.a controller = ((pl.d) view).getController();
        if (controller instanceof el.e) {
            ((el.e) controller).S(this.f45580p);
            this.f45580p = null;
        }
    }

    private static View s(View view, j jVar) {
        if (view == null) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof ImageView) {
                    int left = childAt.getLeft();
                    int top = childAt.getTop();
                    int width = childAt.getWidth();
                    int height = childAt.getHeight();
                    int iRound = Math.round(jVar.f45610l);
                    int iRound2 = Math.round(jVar.f45610l);
                    int iRound3 = Math.round(viewGroup.getWidth() - (jVar.f45610l * 2.0f));
                    int iRound4 = Math.round(viewGroup.getHeight() - (jVar.f45610l * 2.0f));
                    if (left >= iRound - 1 && left <= iRound + 1 && top >= iRound2 - 1 && top <= iRound2 + 1 && width >= iRound3 - 1 && width <= iRound3 + 1 && height >= iRound4 - 1 && height <= iRound4 + 1) {
                        return childAt;
                    }
                }
            }
        }
        return view;
    }

    private void t() {
        if (this.f45581q != null) {
            return;
        }
        Handler handler = new Handler();
        this.f45581q = handler;
        handler.postDelayed(new a(), 4L);
    }

    private void u() {
        if (this.f45581q != null) {
            this.f45581q = null;
        }
    }

    void g() {
        int i11 = this.f45574j + 1;
        this.f45574j = i11;
        if (i11 == 1) {
            this.f45575k = this.f45567c.getAlpha();
            this.f45567c.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    int h() {
        int i11 = this.f45573i + 1;
        this.f45573i = i11;
        return i11;
    }

    View k() {
        return this.f45568d;
    }

    int l() {
        return this.f45566b;
    }

    View m() {
        View view = this.f45572h;
        if (view != null) {
            return view;
        }
        View childAt = this.f45567c;
        if (this.f45569e) {
            int childCount = ((ViewGroup) childAt).getChildCount();
            if (childCount == 1) {
                childAt = ((ViewGroup) this.f45567c).getChildAt(0);
            } else if (childCount <= 0) {
                Log.d("RNSharedElementNode", "Child for parent doesn't exist");
                return null;
            }
        }
        View viewS = s(childAt, this.f45571g);
        this.f45572h = viewS;
        return viewS;
    }

    void n() {
        int i11 = this.f45574j - 1;
        this.f45574j = i11;
        if (i11 == 0) {
            this.f45567c.setAlpha(this.f45575k);
        }
    }

    int o() {
        int i11 = this.f45573i - 1;
        this.f45573i = i11;
        if (i11 == 0) {
            p(this.f45572h);
            u();
            this.f45567c = null;
            this.f45568d = null;
            this.f45570f = null;
            this.f45572h = null;
            this.f45578n = null;
            this.f45579o = null;
            this.f45576l = null;
            this.f45577m = null;
        }
        return this.f45573i;
    }

    void q(Callback callback) {
        c cVar = this.f45578n;
        if (cVar != null) {
            callback.invoke(cVar, this);
            return;
        }
        if (this.f45579o == null) {
            this.f45579o = new ArrayList<>();
        }
        this.f45579o.add(callback);
        if (i()) {
            return;
        }
        t();
    }

    void r(Callback callback) {
        j jVar = this.f45576l;
        if (jVar != null) {
            callback.invoke(jVar, this);
            return;
        }
        if (this.f45577m == null) {
            this.f45577m = new ArrayList<>();
        }
        this.f45577m.add(callback);
        if (j()) {
            return;
        }
        t();
    }
}
