package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static r f14188a = new androidx.transition.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<r>>>> f14189b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f14190c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        r f14191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f14192b;

        /* JADX INFO: renamed from: androidx.transition.z$a$a, reason: collision with other inner class name */
        class C0239a extends y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f14193a;

            C0239a(androidx.collection.a aVar) {
                this.f14193a = aVar;
            }

            @Override // androidx.transition.y, androidx.transition.r.h
            public void i(@NonNull r rVar) {
                ((ArrayList) this.f14193a.get(a.this.f14192b)).remove(rVar);
                rVar.e0(this);
            }
        }

        a(r rVar, ViewGroup viewGroup) {
            this.f14191a = rVar;
            this.f14192b = viewGroup;
        }

        private void a() {
            this.f14192b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f14192b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!z.f14190c.remove(this.f14192b)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<r>> aVarE = z.e();
            ArrayList<r> arrayList = aVarE.get(this.f14192b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarE.put(this.f14192b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f14191a);
            this.f14191a.c(new C0239a(aVarE));
            this.f14191a.m(this.f14192b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).g0(this.f14192b);
                }
            }
            this.f14191a.c0(this.f14192b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            z.f14190c.remove(this.f14192b);
            ArrayList<r> arrayList = z.e().get(this.f14192b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<r> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().g0(this.f14192b);
                }
            }
            this.f14191a.n(true);
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, r rVar) {
        if (f14190c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f14190c.add(viewGroup);
        if (rVar == null) {
            rVar = f14188a;
        }
        r rVarClone = rVar.clone();
        h(viewGroup, rVarClone);
        n.f(viewGroup, null);
        g(viewGroup, rVarClone);
    }

    private static void b(n nVar, r rVar) {
        ViewGroup viewGroupD = nVar.d();
        if (f14190c.contains(viewGroupD)) {
            return;
        }
        n nVarC = n.c(viewGroupD);
        if (rVar == null) {
            if (nVarC != null) {
                nVarC.b();
            }
            nVar.a();
            return;
        }
        f14190c.add(viewGroupD);
        r rVarClone = rVar.clone();
        if (nVarC != null && nVarC.e()) {
            rVarClone.j0(true);
        }
        h(viewGroupD, rVarClone);
        nVar.a();
        g(viewGroupD, rVarClone);
    }

    public static b0 c(@NonNull ViewGroup viewGroup, @NonNull r rVar) {
        if (f14190c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!rVar.N()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f14190c.add(viewGroup);
        r rVarClone = rVar.clone();
        c0 c0Var = new c0();
        c0Var.w0(rVarClone);
        h(viewGroup, c0Var);
        n.f(viewGroup, null);
        g(viewGroup, c0Var);
        viewGroup.invalidate();
        return c0Var.r();
    }

    public static void d(ViewGroup viewGroup) {
        f14190c.remove(viewGroup);
        ArrayList<r> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((r) arrayList2.get(size)).t(viewGroup);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<r>> e() {
        androidx.collection.a<ViewGroup, ArrayList<r>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<r>>> weakReference = f14189b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<r>> aVar2 = new androidx.collection.a<>();
        f14189b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void f(@NonNull n nVar, r rVar) {
        b(nVar, rVar);
    }

    private static void g(ViewGroup viewGroup, r rVar) {
        if (rVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(rVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void h(ViewGroup viewGroup, r rVar) {
        ArrayList<r> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<r> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b0(viewGroup);
            }
        }
        if (rVar != null) {
            rVar.m(viewGroup, true);
        }
        n nVarC = n.c(viewGroup);
        if (nVarC != null) {
            nVarC.b();
        }
    }
}
