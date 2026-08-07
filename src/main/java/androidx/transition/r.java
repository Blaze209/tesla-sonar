package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r implements Cloneable {
    private static final Animator[] M = new Animator[0];
    private static final int[] N = {2, 1, 3, 4};
    private static final k O = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> P = new ThreadLocal<>();
    a0 F;
    private e G;
    private androidx.collection.a<String, String> H;
    long J;
    g K;
    long L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<e0> f14156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<e0> f14157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h[] f14158v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14137a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14138b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f14139c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f14140d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<Integer> f14141e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<View> f14142f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f14143g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<Class<?>> f14144h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<Integer> f14145i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<View> f14146j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<Class<?>> f14147k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<String> f14148l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<Integer> f14149m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<View> f14150n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<Class<?>> f14151o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f0 f14152p = new f0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f0 f14153q = new f0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    c0 f14154r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f14155s = N;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f14159w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList<Animator> f14160x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Animator[] f14161y = M;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f14162z = 0;
    private boolean A = false;
    boolean B = false;
    private r C = null;
    private ArrayList<h> D = null;
    ArrayList<Animator> E = new ArrayList<>();
    private k I = O;

    class a extends k {
        a() {
        }

        @Override // androidx.transition.k
        @NonNull
        public Path a(float f11, float f12, float f13, float f14) {
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f13, f14);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f14163a;

        b(androidx.collection.a aVar) {
            this.f14163a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14163a.remove(animator);
            r.this.f14160x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            r.this.f14160x.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r.this.s();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f14166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f14167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e0 f14168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f14169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        r f14170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f14171f;

        d(View view, String str, r rVar, WindowId windowId, e0 e0Var, Animator animator) {
            this.f14166a = view;
            this.f14167b = str;
            this.f14168c = e0Var;
            this.f14169d = windowId;
            this.f14170e = rVar;
            this.f14171f = animator;
        }
    }

    public static abstract class e {
        public abstract Rect a(@NonNull r rVar);
    }

    private static class f {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j11) {
            ((AnimatorSet) animator).setCurrentPlayTime(j11);
        }
    }

    class g extends y implements b0, c7.b.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f14176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p004c7.f f14177f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Runnable f14180i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f14172a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<Consumer<b0>> f14173b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<Consumer<b0>> f14174c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Consumer<b0>[] f14178g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final h0 f14179h = new h0();

        g() {
        }

        public static /* synthetic */ void m(g gVar, p004c7.b bVar, boolean z11, float f11, float f12) {
            if (z11) {
                gVar.getClass();
                return;
            }
            if (f11 >= 1.0f) {
                r.this.Z(i.f14183b, false);
                return;
            }
            long jC = gVar.c();
            r rVarY0 = ((c0) r.this).y0(0);
            r rVar = rVarY0.C;
            rVarY0.C = null;
            r.this.k0(-1L, gVar.f14172a);
            r.this.k0(jC, -1L);
            gVar.f14172a = jC;
            Runnable runnable = gVar.f14180i;
            if (runnable != null) {
                runnable.run();
            }
            r.this.E.clear();
            if (rVar != null) {
                rVar.Z(i.f14183b, true);
            }
        }

        private void n() {
            ArrayList<Consumer<b0>> arrayList = this.f14174c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f14174c.size();
            if (this.f14178g == null) {
                this.f14178g = new Consumer[size];
            }
            Consumer<b0>[] consumerArr = (Consumer[]) this.f14174c.toArray(this.f14178g);
            this.f14178g = null;
            for (int i11 = 0; i11 < size; i11++) {
                consumerArr[i11].accept(this);
                consumerArr[i11] = null;
            }
            this.f14178g = consumerArr;
        }

        private void o() {
            if (this.f14177f != null) {
                return;
            }
            this.f14179h.a(AnimationUtils.currentAnimationTimeMillis(), this.f14172a);
            this.f14177f = new p004c7.f(new p004c7.e());
            p004c7.g gVar = new p004c7.g();
            gVar.d(1.0f);
            gVar.f(200.0f);
            this.f14177f.y(gVar);
            this.f14177f.n(this.f14172a);
            this.f14177f.c(this);
            this.f14177f.o(this.f14179h.b());
            this.f14177f.j(c() + 1);
            this.f14177f.k(-1.0f);
            this.f14177f.l(4.0f);
            this.f14177f.b(new c7.b.q() { // from class: androidx.transition.s
                @Override // c7.b.q
                public final void a(p004c7.b bVar, boolean z11, float f11, float f12) {
                    r.g.m(this.f14187a, bVar, z11, f11, f12);
                }
            });
        }

        @Override // c7.b.r
        public void b(p004c7.b bVar, float f11, float f12) {
            long jMax = Math.max(-1L, Math.min(c() + 1, Math.round(f11)));
            r.this.k0(jMax, this.f14172a);
            this.f14172a = jMax;
            n();
        }

        @Override // androidx.transition.b0
        public long c() {
            return r.this.J();
        }

        @Override // androidx.transition.b0
        public void d() {
            o();
            this.f14177f.t(c() + 1);
        }

        @Override // androidx.transition.b0
        public void g(long j11) {
            if (this.f14177f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j11 == this.f14172a || !isReady()) {
                return;
            }
            if (!this.f14176e) {
                if (j11 != 0 || this.f14172a <= 0) {
                    long jC = c();
                    if (j11 == jC && this.f14172a < jC) {
                        j11 = 1 + jC;
                    }
                } else {
                    j11 = -1;
                }
                long j12 = this.f14172a;
                if (j11 != j12) {
                    r.this.k0(j11, j12);
                    this.f14172a = j11;
                }
            }
            n();
            this.f14179h.a(AnimationUtils.currentAnimationTimeMillis(), j11);
        }

        @Override // androidx.transition.b0
        public boolean isReady() {
            return this.f14175d;
        }

        @Override // androidx.transition.b0
        public void j(@NonNull Runnable runnable) {
            this.f14180i = runnable;
            o();
            this.f14177f.t(BitmapDescriptorFactory.HUE_RED);
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void k(@NonNull r rVar) {
            this.f14176e = true;
        }

        void p() {
            long j11 = c() == 0 ? 1L : 0L;
            r.this.k0(j11, this.f14172a);
            this.f14172a = j11;
        }

        public void q() {
            this.f14175d = true;
            ArrayList<Consumer<b0>> arrayList = this.f14173b;
            if (arrayList != null) {
                this.f14173b = null;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    arrayList.get(i11).accept(this);
                }
            }
            n();
        }
    }

    public interface h {
        void a(@NonNull r rVar);

        void e(@NonNull r rVar);

        void f(@NonNull r rVar);

        default void h(@NonNull r rVar, boolean z11) {
            i(rVar);
        }

        void i(@NonNull r rVar);

        void k(@NonNull r rVar);

        default void l(@NonNull r rVar, boolean z11) {
            e(rVar);
        }
    }

    interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f14182a = new i() { // from class: androidx.transition.t
            @Override // androidx.transition.r.i
            public final void d(r.h hVar, r rVar, boolean z11) {
                hVar.l(rVar, z11);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f14183b = new i() { // from class: androidx.transition.u
            @Override // androidx.transition.r.i
            public final void d(r.h hVar, r rVar, boolean z11) {
                hVar.h(rVar, z11);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f14184c = new i() { // from class: androidx.transition.v
            @Override // androidx.transition.r.i
            public final void d(r.h hVar, r rVar, boolean z11) {
                hVar.k(rVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f14185d = new i() { // from class: androidx.transition.w
            @Override // androidx.transition.r.i
            public final void d(r.h hVar, r rVar, boolean z11) {
                hVar.f(rVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f14186e = new i() { // from class: androidx.transition.x
            @Override // androidx.transition.r.i
            public final void d(r.h hVar, r rVar, boolean z11) {
                hVar.a(rVar);
            }
        };

        void d(@NonNull h hVar, @NonNull r rVar, boolean z11);
    }

    public r() {
    }

    private static androidx.collection.a<Animator, d> D() {
        androidx.collection.a<Animator, d> aVar = P.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        P.set(aVar2);
        return aVar2;
    }

    private static boolean P(int i11) {
        return i11 >= 1 && i11 <= 4;
    }

    private static boolean R(e0 e0Var, e0 e0Var2, String str) {
        Object obj = e0Var.f14041a.get(str);
        Object obj2 = e0Var2.f14041a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void S(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View viewValueAt = sparseArray.valueAt(i11);
            if (viewValueAt != null && Q(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i11))) != null && Q(view)) {
                e0 e0Var = aVar.get(viewValueAt);
                e0 e0Var2 = aVar2.get(view);
                if (e0Var != null && e0Var2 != null) {
                    this.f14156t.add(e0Var);
                    this.f14157u.add(e0Var2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void U(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2) {
        e0 e0VarRemove;
        for (int size = aVar.getSize() - 1; size >= 0; size--) {
            View viewI = aVar.i(size);
            if (viewI != null && Q(viewI) && (e0VarRemove = aVar2.remove(viewI)) != null && Q(e0VarRemove.f14042b)) {
                this.f14156t.add(aVar.k(size));
                this.f14157u.add(e0VarRemove);
            }
        }
    }

    private void V(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2, androidx.collection.v<View> vVar, androidx.collection.v<View> vVar2) {
        View viewD;
        int iK = vVar.k();
        for (int i11 = 0; i11 < iK; i11++) {
            View viewL = vVar.l(i11);
            if (viewL != null && Q(viewL) && (viewD = vVar2.d(vVar.g(i11))) != null && Q(viewD)) {
                e0 e0Var = aVar.get(viewL);
                e0 e0Var2 = aVar2.get(viewD);
                if (e0Var != null && e0Var2 != null) {
                    this.f14156t.add(e0Var);
                    this.f14157u.add(e0Var2);
                    aVar.remove(viewL);
                    aVar2.remove(viewD);
                }
            }
        }
    }

    private void W(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            View viewM = aVar3.m(i11);
            if (viewM != null && Q(viewM) && (view = aVar4.get(aVar3.i(i11))) != null && Q(view)) {
                e0 e0Var = aVar.get(viewM);
                e0 e0Var2 = aVar2.get(view);
                if (e0Var != null && e0Var2 != null) {
                    this.f14156t.add(e0Var);
                    this.f14157u.add(e0Var2);
                    aVar.remove(viewM);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void X(f0 f0Var, f0 f0Var2) {
        androidx.collection.a<View, e0> aVar = new androidx.collection.a<>(f0Var.f14047a);
        androidx.collection.a<View, e0> aVar2 = new androidx.collection.a<>(f0Var2.f14047a);
        int i11 = 0;
        while (true) {
            int[] iArr = this.f14155s;
            if (i11 >= iArr.length) {
                e(aVar, aVar2);
                return;
            }
            int i12 = iArr[i11];
            if (i12 == 1) {
                U(aVar, aVar2);
            } else if (i12 == 2) {
                W(aVar, aVar2, f0Var.f14050d, f0Var2.f14050d);
            } else if (i12 == 3) {
                S(aVar, aVar2, f0Var.f14048b, f0Var2.f14048b);
            } else if (i12 == 4) {
                V(aVar, aVar2, f0Var.f14049c, f0Var2.f14049c);
            }
            i11++;
        }
    }

    private void Y(r rVar, i iVar, boolean z11) {
        r rVar2 = this.C;
        if (rVar2 != null) {
            rVar2.Y(rVar, iVar, z11);
        }
        ArrayList<h> arrayList = this.D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.D.size();
        h[] hVarArr = this.f14158v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f14158v = null;
        h[] hVarArr2 = (h[]) this.D.toArray(hVarArr);
        for (int i11 = 0; i11 < size; i11++) {
            iVar.d(hVarArr2[i11], rVar, z11);
            hVarArr2[i11] = null;
        }
        this.f14158v = hVarArr2;
    }

    private static int[] a0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i11] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i11] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i11] = 2;
            } else if ("itemId".equalsIgnoreCase(strTrim)) {
                iArr[i11] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                i11--;
                iArr = iArr2;
            }
            i11++;
        }
        return iArr;
    }

    private void e(androidx.collection.a<View, e0> aVar, androidx.collection.a<View, e0> aVar2) {
        for (int i11 = 0; i11 < aVar.getSize(); i11++) {
            e0 e0VarM = aVar.m(i11);
            if (Q(e0VarM.f14042b)) {
                this.f14156t.add(e0VarM);
                this.f14157u.add(null);
            }
        }
        for (int i12 = 0; i12 < aVar2.getSize(); i12++) {
            e0 e0VarM2 = aVar2.m(i12);
            if (Q(e0VarM2.f14042b)) {
                this.f14157u.add(e0VarM2);
                this.f14156t.add(null);
            }
        }
    }

    private static void f(f0 f0Var, View view, e0 e0Var) {
        f0Var.f14047a.put(view, e0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (f0Var.f14048b.indexOfKey(id2) >= 0) {
                f0Var.f14048b.put(id2, null);
            } else {
                f0Var.f14048b.put(id2, view);
            }
        }
        String strJ = ViewCompat.J(view);
        if (strJ != null) {
            if (f0Var.f14050d.containsKey(strJ)) {
                f0Var.f14050d.put(strJ, null);
            } else {
                f0Var.f14050d.put(strJ, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (f0Var.f14049c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    f0Var.f14049c.h(itemIdAtPosition, view);
                    return;
                }
                View viewD = f0Var.f14049c.d(itemIdAtPosition);
                if (viewD != null) {
                    viewD.setHasTransientState(false);
                    f0Var.f14049c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean g(int[] iArr, int i11) {
        int i12 = iArr[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr[i13] == i12) {
                return true;
            }
        }
        return false;
    }

    private void h0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            h(animator);
        }
    }

    private void j(View view, boolean z11) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f14145i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f14146j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f14147k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.f14147k.get(i11).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    e0 e0Var = new e0(view);
                    if (z11) {
                        l(e0Var);
                    } else {
                        i(e0Var);
                    }
                    e0Var.f14043c.add(this);
                    k(e0Var);
                    if (z11) {
                        f(this.f14152p, view, e0Var);
                    } else {
                        f(this.f14153q, view, e0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f14149m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f14150n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f14151o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    if (this.f14151o.get(i12).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                                j(viewGroup.getChildAt(i13), z11);
                            }
                        }
                    }
                }
            }
        }
    }

    @NonNull
    public k A() {
        return this.I;
    }

    public a0 B() {
        return this.F;
    }

    @NonNull
    public final r C() {
        c0 c0Var = this.f14154r;
        return c0Var != null ? c0Var.C() : this;
    }

    public long E() {
        return this.f14138b;
    }

    @NonNull
    public List<Integer> F() {
        return this.f14141e;
    }

    public List<String> G() {
        return this.f14143g;
    }

    public List<Class<?>> H() {
        return this.f14144h;
    }

    @NonNull
    public List<View> I() {
        return this.f14142f;
    }

    final long J() {
        return this.J;
    }

    public String[] K() {
        return null;
    }

    public e0 L(@NonNull View view, boolean z11) {
        c0 c0Var = this.f14154r;
        if (c0Var != null) {
            return c0Var.L(view, z11);
        }
        return (z11 ? this.f14152p : this.f14153q).f14047a.get(view);
    }

    boolean M() {
        return !this.f14160x.isEmpty();
    }

    public boolean N() {
        return false;
    }

    public boolean O(e0 e0Var, e0 e0Var2) {
        if (e0Var != null && e0Var2 != null) {
            String[] strArrK = K();
            if (strArrK != null) {
                for (String str : strArrK) {
                    if (R(e0Var, e0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = e0Var.f14041a.keySet().iterator();
                while (it.hasNext()) {
                    if (R(e0Var, e0Var2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean Q(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f14145i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f14146j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f14147k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f14147k.get(i11).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f14148l != null && ViewCompat.J(view) != null && this.f14148l.contains(ViewCompat.J(view))) {
            return false;
        }
        if ((this.f14141e.size() == 0 && this.f14142f.size() == 0 && (((arrayList = this.f14144h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f14143g) == null || arrayList2.isEmpty()))) || this.f14141e.contains(Integer.valueOf(id2)) || this.f14142f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f14143g;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.J(view))) {
            return true;
        }
        if (this.f14144h != null) {
            for (int i12 = 0; i12 < this.f14144h.size(); i12++) {
                if (this.f14144h.get(i12).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void Z(i iVar, boolean z11) {
        Y(this, iVar, z11);
    }

    public void b0(View view) {
        if (this.B) {
            return;
        }
        int size = this.f14160x.size();
        Animator[] animatorArr = (Animator[]) this.f14160x.toArray(this.f14161y);
        this.f14161y = M;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.pause();
        }
        this.f14161y = animatorArr;
        Z(i.f14185d, false);
        this.A = true;
    }

    @NonNull
    public r c(@NonNull h hVar) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(hVar);
        return this;
    }

    void c0(@NonNull ViewGroup viewGroup) {
        d dVar;
        this.f14156t = new ArrayList<>();
        this.f14157u = new ArrayList<>();
        X(this.f14152p, this.f14153q);
        androidx.collection.a<Animator, d> aVarD = D();
        int size = aVarD.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animatorI = aVarD.i(i11);
            if (animatorI != null && (dVar = aVarD.get(animatorI)) != null && dVar.f14166a != null && windowId.equals(dVar.f14169d)) {
                e0 e0Var = dVar.f14168c;
                View view = dVar.f14166a;
                e0 e0VarL = L(view, true);
                e0 e0VarY = y(view, true);
                if (e0VarL == null && e0VarY == null) {
                    e0VarY = this.f14153q.f14047a.get(view);
                }
                if ((e0VarL != null || e0VarY != null) && dVar.f14170e.O(e0Var, e0VarY)) {
                    r rVar = dVar.f14170e;
                    if (rVar.C().K != null) {
                        animatorI.cancel();
                        rVar.f14160x.remove(animatorI);
                        aVarD.remove(animatorI);
                        if (rVar.f14160x.size() == 0) {
                            rVar.Z(i.f14184c, false);
                            if (!rVar.B) {
                                rVar.B = true;
                                rVar.Z(i.f14183b, false);
                            }
                        }
                    } else if (animatorI.isRunning() || animatorI.isStarted()) {
                        animatorI.cancel();
                    } else {
                        aVarD.remove(animatorI);
                    }
                }
            }
        }
        q(viewGroup, this.f14152p, this.f14153q, this.f14156t, this.f14157u);
        if (this.K == null) {
            i0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            d0();
            this.K.p();
            this.K.q();
        }
    }

    protected void cancel() {
        int size = this.f14160x.size();
        Animator[] animatorArr = (Animator[]) this.f14160x.toArray(this.f14161y);
        this.f14161y = M;
        for (int i11 = size - 1; i11 >= 0; i11--) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            animator.cancel();
        }
        this.f14161y = animatorArr;
        Z(i.f14184c, false);
    }

    @NonNull
    public r d(@NonNull View view) {
        this.f14142f.add(view);
        return this;
    }

    void d0() {
        androidx.collection.a<Animator, d> aVarD = D();
        this.J = 0L;
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            Animator animator = this.E.get(i11);
            d dVar = aVarD.get(animator);
            if (animator != null && dVar != null) {
                if (u() >= 0) {
                    dVar.f14171f.setDuration(u());
                }
                if (E() >= 0) {
                    dVar.f14171f.setStartDelay(E() + dVar.f14171f.getStartDelay());
                }
                if (x() != null) {
                    dVar.f14171f.setInterpolator(x());
                }
                this.f14160x.add(animator);
                this.J = Math.max(this.J, f.a(animator));
            }
        }
        this.E.clear();
    }

    @NonNull
    public r e0(@NonNull h hVar) {
        r rVar;
        ArrayList<h> arrayList = this.D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (rVar = this.C) != null) {
                rVar.e0(hVar);
            }
            if (this.D.size() == 0) {
                this.D = null;
            }
        }
        return this;
    }

    @NonNull
    public r f0(@NonNull View view) {
        this.f14142f.remove(view);
        return this;
    }

    public void g0(View view) {
        if (this.A) {
            if (!this.B) {
                int size = this.f14160x.size();
                Animator[] animatorArr = (Animator[]) this.f14160x.toArray(this.f14161y);
                this.f14161y = M;
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    Animator animator = animatorArr[i11];
                    animatorArr[i11] = null;
                    animator.resume();
                }
                this.f14161y = animatorArr;
                Z(i.f14186e, false);
            }
            this.A = false;
        }
    }

    protected void h(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void i(@NonNull e0 e0Var);

    protected void i0() {
        s0();
        androidx.collection.a<Animator, d> aVarD = D();
        for (Animator animator : this.E) {
            if (aVarD.containsKey(animator)) {
                s0();
                h0(animator, aVarD);
            }
        }
        this.E.clear();
        s();
    }

    void j0(boolean z11) {
        this.f14159w = z11;
    }

    void k(e0 e0Var) {
        String[] strArrB;
        if (this.F == null || e0Var.f14041a.isEmpty() || (strArrB = this.F.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!e0Var.f14041a.containsKey(str)) {
                this.F.a(e0Var);
                return;
            }
        }
    }

    void k0(long j11, long j12) {
        long J = J();
        int i11 = 0;
        boolean z11 = j11 < j12;
        if ((j12 < 0 && j11 >= 0) || (j12 > J && j11 <= J)) {
            this.B = false;
            Z(i.f14182a, z11);
        }
        int size = this.f14160x.size();
        Animator[] animatorArr = (Animator[]) this.f14160x.toArray(this.f14161y);
        this.f14161y = M;
        while (i11 < size) {
            Animator animator = animatorArr[i11];
            animatorArr[i11] = null;
            f.b(animator, Math.min(Math.max(0L, j11), f.a(animator)));
            i11++;
            J = J;
        }
        long j13 = J;
        this.f14161y = animatorArr;
        if ((j11 <= j13 || j12 > j13) && (j11 >= 0 || j12 < 0)) {
            return;
        }
        if (j11 > j13) {
            this.B = true;
        }
        Z(i.f14183b, z11);
    }

    public abstract void l(@NonNull e0 e0Var);

    @NonNull
    public r l0(long j11) {
        this.f14139c = j11;
        return this;
    }

    void m(@NonNull ViewGroup viewGroup, boolean z11) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        n(z11);
        if ((this.f14141e.size() > 0 || this.f14142f.size() > 0) && (((arrayList = this.f14143g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f14144h) == null || arrayList2.isEmpty()))) {
            for (int i11 = 0; i11 < this.f14141e.size(); i11++) {
                View viewFindViewById = viewGroup.findViewById(this.f14141e.get(i11).intValue());
                if (viewFindViewById != null) {
                    e0 e0Var = new e0(viewFindViewById);
                    if (z11) {
                        l(e0Var);
                    } else {
                        i(e0Var);
                    }
                    e0Var.f14043c.add(this);
                    k(e0Var);
                    if (z11) {
                        f(this.f14152p, viewFindViewById, e0Var);
                    } else {
                        f(this.f14153q, viewFindViewById, e0Var);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f14142f.size(); i12++) {
                View view = this.f14142f.get(i12);
                e0 e0Var2 = new e0(view);
                if (z11) {
                    l(e0Var2);
                } else {
                    i(e0Var2);
                }
                e0Var2.f14043c.add(this);
                k(e0Var2);
                if (z11) {
                    f(this.f14152p, view, e0Var2);
                } else {
                    f(this.f14153q, view, e0Var2);
                }
            }
        } else {
            j(viewGroup, z11);
        }
        if (z11 || (aVar = this.H) == null) {
            return;
        }
        int size = aVar.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList3.add(this.f14152p.f14050d.remove(this.H.i(i13)));
        }
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = (View) arrayList3.get(i14);
            if (view2 != null) {
                this.f14152p.f14050d.put(this.H.m(i14), view2);
            }
        }
    }

    public void m0(e eVar) {
        this.G = eVar;
    }

    void n(boolean z11) {
        if (z11) {
            this.f14152p.f14047a.clear();
            this.f14152p.f14048b.clear();
            this.f14152p.f14049c.a();
        } else {
            this.f14153q.f14047a.clear();
            this.f14153q.f14048b.clear();
            this.f14153q.f14049c.a();
        }
    }

    @NonNull
    public r n0(TimeInterpolator timeInterpolator) {
        this.f14140d = timeInterpolator;
        return this;
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public r clone() {
        try {
            r rVar = (r) super.clone();
            rVar.E = new ArrayList<>();
            rVar.f14152p = new f0();
            rVar.f14153q = new f0();
            rVar.f14156t = null;
            rVar.f14157u = null;
            rVar.K = null;
            rVar.C = this;
            rVar.D = null;
            return rVar;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public void o0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f14155s = N;
            return;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!P(iArr[i11])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (g(iArr, i11)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f14155s = (int[]) iArr.clone();
    }

    public Animator p(@NonNull ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        return null;
    }

    public void p0(k kVar) {
        if (kVar == null) {
            this.I = O;
        } else {
            this.I = kVar;
        }
    }

    void q(@NonNull ViewGroup viewGroup, @NonNull f0 f0Var, @NonNull f0 f0Var2, @NonNull ArrayList<e0> arrayList, @NonNull ArrayList<e0> arrayList2) {
        Animator animatorP;
        int i11;
        boolean z11;
        int i12;
        View view;
        e0 e0Var;
        Animator animator;
        Animator animator2;
        e0 e0Var2;
        androidx.collection.a<Animator, d> aVarD = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z12 = C().K != null;
        long jMin = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            e0 e0Var3 = arrayList.get(i13);
            e0 e0Var4 = arrayList2.get(i13);
            if (e0Var3 != null && !e0Var3.f14043c.contains(this)) {
                e0Var3 = null;
            }
            if (e0Var4 != null && !e0Var4.f14043c.contains(this)) {
                e0Var4 = null;
            }
            if (!(e0Var3 == null && e0Var4 == null) && ((e0Var3 == null || e0Var4 == null || O(e0Var3, e0Var4)) && (animatorP = p(viewGroup, e0Var3, e0Var4)) != null)) {
                if (e0Var4 != null) {
                    View view2 = e0Var4.f14042b;
                    String[] strArrK = K();
                    if (strArrK != null && strArrK.length > 0) {
                        e0Var2 = new e0(view2);
                        i11 = size;
                        z11 = z12;
                        e0 e0Var5 = f0Var2.f14047a.get(view2);
                        i12 = i13;
                        if (e0Var5 != null) {
                            int i14 = 0;
                            while (i14 < strArrK.length) {
                                Map<String, Object> map = e0Var2.f14041a;
                                int i15 = i14;
                                String str = strArrK[i15];
                                map.put(str, e0Var5.f14041a.get(str));
                                i14 = i15 + 1;
                                strArrK = strArrK;
                            }
                        }
                        int size2 = aVarD.getSize();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size2) {
                                view = view2;
                                animator2 = animatorP;
                                break;
                            }
                            d dVar = aVarD.get(aVarD.i(i16));
                            if (dVar.f14168c != null && dVar.f14166a == view2) {
                                view = view2;
                                if (dVar.f14167b.equals(z()) && dVar.f14168c.equals(e0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                            } else {
                                view = view2;
                            }
                            i16++;
                            view2 = view;
                        }
                    } else {
                        view = view2;
                        i11 = size;
                        z11 = z12;
                        i12 = i13;
                        animator2 = animatorP;
                        e0Var2 = null;
                    }
                    e0 e0Var6 = e0Var2;
                    animator = animator2;
                    e0Var = e0Var6;
                } else {
                    i11 = size;
                    z11 = z12;
                    i12 = i13;
                    view = e0Var3.f14042b;
                    e0Var = null;
                }
                if (animator != null) {
                    animator = animatorP;
                    a0 a0Var = this.F;
                    if (a0Var != null) {
                        long jC = a0Var.c(viewGroup, this, e0Var3, e0Var4);
                        sparseIntArray.put(this.E.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j11 = jMin;
                    d dVar2 = new d(view, z(), this, viewGroup.getWindowId(), e0Var, animator);
                    Animator animator3 = animator;
                    if (z11) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        animator3 = animatorSet;
                    }
                    aVarD.put(animator3, dVar2);
                    this.E.add(animator3);
                    jMin = j11;
                } else {
                    animator = animatorP;
                }
            } else {
                i11 = size;
                z11 = z12;
                i12 = i13;
            }
            i13 = i12 + 1;
            size = i11;
            z12 = z11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                d dVar3 = aVarD.get(this.E.get(sparseIntArray.keyAt(i17)));
                dVar3.f14171f.setStartDelay((((long) sparseIntArray.valueAt(i17)) - jMin) + dVar3.f14171f.getStartDelay());
            }
        }
    }

    public void q0(a0 a0Var) {
        this.F = a0Var;
    }

    @NonNull
    b0 r() {
        g gVar = new g();
        this.K = gVar;
        c(gVar);
        return this.K;
    }

    @NonNull
    public r r0(long j11) {
        this.f14138b = j11;
        return this;
    }

    protected void s() {
        int i11 = this.f14162z - 1;
        this.f14162z = i11;
        if (i11 == 0) {
            Z(i.f14183b, false);
            for (int i12 = 0; i12 < this.f14152p.f14049c.k(); i12++) {
                View viewL = this.f14152p.f14049c.l(i12);
                if (viewL != null) {
                    viewL.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < this.f14153q.f14049c.k(); i13++) {
                View viewL2 = this.f14153q.f14049c.l(i13);
                if (viewL2 != null) {
                    viewL2.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    protected void s0() {
        if (this.f14162z == 0) {
            Z(i.f14182a, false);
            this.B = false;
        }
        this.f14162z++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void t(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> aVarD = D();
        int size = aVarD.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        androidx.collection.a aVar = new androidx.collection.a(aVarD);
        aVarD.clear();
        for (int i11 = size - 1; i11 >= 0; i11--) {
            d dVar = (d) aVar.m(i11);
            if (dVar.f14166a != null && windowId.equals(dVar.f14169d)) {
                ((Animator) aVar.i(i11)).end();
            }
        }
    }

    String t0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f14139c != -1) {
            sb2.append("dur(");
            sb2.append(this.f14139c);
            sb2.append(") ");
        }
        if (this.f14138b != -1) {
            sb2.append("dly(");
            sb2.append(this.f14138b);
            sb2.append(") ");
        }
        if (this.f14140d != null) {
            sb2.append("interp(");
            sb2.append(this.f14140d);
            sb2.append(") ");
        }
        if (this.f14141e.size() > 0 || this.f14142f.size() > 0) {
            sb2.append("tgts(");
            if (this.f14141e.size() > 0) {
                for (int i11 = 0; i11 < this.f14141e.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f14141e.get(i11));
                }
            }
            if (this.f14142f.size() > 0) {
                for (int i12 = 0; i12 < this.f14142f.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f14142f.get(i12));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @NonNull
    public String toString() {
        return t0("");
    }

    public long u() {
        return this.f14139c;
    }

    public Rect v() {
        e eVar = this.G;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public e w() {
        return this.G;
    }

    public TimeInterpolator x() {
        return this.f14140d;
    }

    e0 y(View view, boolean z11) {
        c0 c0Var = this.f14154r;
        if (c0Var != null) {
            return c0Var.y(view, z11);
        }
        ArrayList<e0> arrayList = z11 ? this.f14156t : this.f14157u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            e0 e0Var = arrayList.get(i11);
            if (e0Var == null) {
                return null;
            }
            if (e0Var.f14042b == view) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            return (z11 ? this.f14157u : this.f14156t).get(i11);
        }
        return null;
    }

    @NonNull
    public String z() {
        return this.f14137a;
    }

    public r(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f14127c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = j5.k.k(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jK >= 0) {
            l0(jK);
        }
        long jK2 = j5.k.k(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jK2 > 0) {
            r0(jK2);
        }
        int iL = j5.k.l(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iL > 0) {
            n0(AnimationUtils.loadInterpolator(context, iL));
        }
        String strM = j5.k.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            o0(a0(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
