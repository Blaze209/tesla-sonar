package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g extends u0 {

    class a extends r.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f14051a;

        a(Rect rect) {
            this.f14051a = rect;
        }

        @Override // androidx.transition.r.e
        public Rect a(@NonNull r rVar) {
            return this.f14051a;
        }
    }

    class b implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f14054b;

        b(View view, ArrayList arrayList) {
            this.f14053a = view;
            this.f14054b = arrayList;
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
            rVar.e0(this);
            rVar.c(this);
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
            rVar.e0(this);
            this.f14053a.setVisibility(8);
            int size = this.f14054b.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((View) this.f14054b.get(i11)).setVisibility(0);
            }
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
        }
    }

    class c extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f14056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f14057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f14059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f14060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f14061f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f14056a = obj;
            this.f14057b = arrayList;
            this.f14058c = obj2;
            this.f14059d = arrayList2;
            this.f14060e = obj3;
            this.f14061f = arrayList3;
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void e(@NonNull r rVar) {
            Object obj = this.f14056a;
            if (obj != null) {
                g.this.E(obj, this.f14057b, null);
            }
            Object obj2 = this.f14058c;
            if (obj2 != null) {
                g.this.E(obj2, this.f14059d, null);
            }
            Object obj3 = this.f14060e;
            if (obj3 != null) {
                g.this.E(obj3, this.f14061f, null);
            }
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void i(@NonNull r rVar) {
            rVar.e0(this);
        }
    }

    class d implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14063a;

        d(Runnable runnable) {
            this.f14063a = runnable;
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
            this.f14063a.run();
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
        }
    }

    class e extends r.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f14065a;

        e(Rect rect) {
            this.f14065a = rect;
        }

        @Override // androidx.transition.r.e
        public Rect a(@NonNull r rVar) {
            Rect rect = this.f14065a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f14065a;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, r rVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            rVar.cancel();
            runnable2.run();
        }
    }

    private static boolean D(r rVar) {
        return (u0.l(rVar.F()) && u0.l(rVar.G()) && u0.l(rVar.H())) ? false : true;
    }

    @Override // androidx.fragment.app.u0
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        c0 c0Var = (c0) obj;
        if (c0Var != null) {
            c0Var.I().clear();
            c0Var.I().addAll(arrayList2);
            E(c0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.u0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        c0 c0Var = new c0();
        c0Var.w0((r) obj);
        return c0Var;
    }

    public void E(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        r rVar = (r) obj;
        int i11 = 0;
        if (rVar instanceof c0) {
            c0 c0Var = (c0) rVar;
            int iZ0 = c0Var.z0();
            while (i11 < iZ0) {
                E(c0Var.y0(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (D(rVar)) {
            return;
        }
        List<View> listI = rVar.I();
        if (listI.size() == arrayList.size() && listI.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i11 < size) {
                rVar.d(arrayList2.get(i11));
                i11++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                rVar.f0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.u0
    public void a(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((r) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.u0
    public void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        r rVar = (r) obj;
        if (rVar == null) {
            return;
        }
        int i11 = 0;
        if (rVar instanceof c0) {
            c0 c0Var = (c0) rVar;
            int iZ0 = c0Var.z0();
            while (i11 < iZ0) {
                b(c0Var.y0(i11), arrayList);
                i11++;
            }
            return;
        }
        if (D(rVar) || !u0.l(rVar.I())) {
            return;
        }
        int size = arrayList.size();
        while (i11 < size) {
            rVar.d(arrayList.get(i11));
            i11++;
        }
    }

    @Override // androidx.fragment.app.u0
    public void c(@NonNull Object obj) {
        ((b0) obj).d();
    }

    @Override // androidx.fragment.app.u0
    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
        ((b0) obj).j(runnable);
    }

    @Override // androidx.fragment.app.u0
    public void e(@NonNull ViewGroup viewGroup, Object obj) {
        z.a(viewGroup, (r) obj);
    }

    @Override // androidx.fragment.app.u0
    public boolean g(@NonNull Object obj) {
        return obj instanceof r;
    }

    @Override // androidx.fragment.app.u0
    public Object h(Object obj) {
        if (obj != null) {
            return ((r) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u0
    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return z.c(viewGroup, (r) obj);
    }

    @Override // androidx.fragment.app.u0
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.u0
    public boolean n(@NonNull Object obj) {
        boolean zN = ((r) obj).N();
        if (!zN) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zN;
    }

    @Override // androidx.fragment.app.u0
    public Object o(Object obj, Object obj2, Object obj3) {
        r rVarF0 = (r) obj;
        r rVar = (r) obj2;
        r rVar2 = (r) obj3;
        if (rVarF0 != null && rVar != null) {
            rVarF0 = new c0().w0(rVarF0).w0(rVar).F0(1);
        } else if (rVarF0 == null) {
            rVarF0 = rVar != null ? rVar : null;
        }
        if (rVar2 == null) {
            return rVarF0;
        }
        c0 c0Var = new c0();
        if (rVarF0 != null) {
            c0Var.w0(rVarF0);
        }
        c0Var.w0(rVar2);
        return c0Var;
    }

    @Override // androidx.fragment.app.u0
    @NonNull
    public Object p(Object obj, Object obj2, Object obj3) {
        c0 c0Var = new c0();
        if (obj != null) {
            c0Var.w0((r) obj);
        }
        if (obj2 != null) {
            c0Var.w0((r) obj2);
        }
        if (obj3 != null) {
            c0Var.w0((r) obj3);
        }
        return c0Var;
    }

    @Override // androidx.fragment.app.u0
    public void r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((r) obj).c(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.u0
    public void s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((r) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.u0
    public void t(@NonNull Object obj, float f11) {
        b0 b0Var = (b0) obj;
        if (b0Var.isReady()) {
            long jC = (long) (f11 * b0Var.c());
            if (jC == 0) {
                jC = 1;
            }
            if (jC == b0Var.c()) {
                jC = b0Var.c() - 1;
            }
            b0Var.g(jC);
        }
    }

    @Override // androidx.fragment.app.u0
    public void u(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((r) obj).m0(new e(rect));
        }
    }

    @Override // androidx.fragment.app.u0
    public void v(@NonNull Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((r) obj).m0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.u0
    public void w(@NonNull Fragment fragment, @NonNull Object obj, @NonNull q5.e eVar, @NonNull Runnable runnable) {
        x(fragment, obj, eVar, null, runnable);
    }

    @Override // androidx.fragment.app.u0
    public void x(@NonNull Fragment fragment, @NonNull Object obj, @NonNull q5.e eVar, final Runnable runnable, @NonNull final Runnable runnable2) {
        final r rVar = (r) obj;
        eVar.c(new q5.e.a() { // from class: androidx.transition.f
            @Override // q5.e.a
            public final void onCancel() {
                g.C(runnable, rVar, runnable2);
            }
        });
        rVar.c(new d(runnable2));
    }

    @Override // androidx.fragment.app.u0
    public void z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        c0 c0Var = (c0) obj;
        List<View> listI = c0Var.I();
        listI.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            u0.f(listI, arrayList.get(i11));
        }
        listI.add(view);
        arrayList.add(view);
        b(c0Var, arrayList);
    }
}
