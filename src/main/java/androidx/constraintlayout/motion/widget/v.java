package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6844a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashSet<View> f6846c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<u.b> f6848e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<u> f6845b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f6847d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<u.b> f6849f = new ArrayList<>();

    class a implements androidx.constraintlayout.widget.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f6850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6853d;

        a(u uVar, int i11, boolean z11, int i12) {
            this.f6850a = uVar;
            this.f6851b = i11;
            this.f6852c = z11;
            this.f6853d = i12;
        }
    }

    public v(p pVar) {
        this.f6844a = pVar;
    }

    private void e(u uVar, boolean z11) {
        ConstraintLayout.getSharedValues().a(uVar.h(), new a(uVar, uVar.h(), z11, uVar.g()));
    }

    private void i(u uVar, View... viewArr) {
        int currentState = this.f6844a.getCurrentState();
        if (uVar.f6809e == 2) {
            uVar.c(this, this.f6844a, currentState, null, viewArr);
            return;
        }
        if (currentState != -1) {
            androidx.constraintlayout.widget.d dVarJ0 = this.f6844a.j0(currentState);
            if (dVarJ0 == null) {
                return;
            }
            uVar.c(this, this.f6844a, currentState, dVarJ0, viewArr);
            return;
        }
        Log.w(this.f6847d, "No support for ViewTransition within transition yet. Currently: " + this.f6844a.toString());
    }

    public void a(u uVar) {
        this.f6845b.add(uVar);
        this.f6846c = null;
        if (uVar.i() == 4) {
            e(uVar, true);
        } else if (uVar.i() == 5) {
            e(uVar, false);
        }
    }

    void b(u.b bVar) {
        if (this.f6848e == null) {
            this.f6848e = new ArrayList<>();
        }
        this.f6848e.add(bVar);
    }

    void c() {
        ArrayList<u.b> arrayList = this.f6848e;
        if (arrayList == null) {
            return;
        }
        Iterator<u.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f6848e.removeAll(this.f6849f);
        this.f6849f.clear();
        if (this.f6848e.isEmpty()) {
            this.f6848e = null;
        }
    }

    void d() {
        this.f6844a.invalidate();
    }

    void f(u.b bVar) {
        this.f6849f.add(bVar);
    }

    void g(MotionEvent motionEvent) {
        int currentState = this.f6844a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f6846c == null) {
            this.f6846c = new HashSet<>();
            for (u uVar : this.f6845b) {
                int childCount = this.f6844a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f6844a.getChildAt(i11);
                    if (uVar.j(childAt)) {
                        childAt.getId();
                        this.f6846c.add(childAt);
                    }
                }
            }
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<u.b> arrayList = this.f6848e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<u.b> it = this.f6848e.iterator();
            while (it.hasNext()) {
                it.next().d(action, x11, y11);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.d dVarJ0 = this.f6844a.j0(currentState);
            for (u uVar2 : this.f6845b) {
                if (uVar2.l(action)) {
                    for (View view : this.f6846c) {
                        if (uVar2.j(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x11, (int) y11)) {
                                uVar2.c(this, this.f6844a, currentState, dVarJ0, view);
                            }
                        }
                    }
                }
            }
        }
    }

    void h(int i11, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        u uVar = null;
        for (u uVar2 : this.f6845b) {
            if (uVar2.e() == i11) {
                for (View view : viewArr) {
                    if (uVar2.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i(uVar2, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                uVar = uVar2;
            }
        }
        if (uVar == null) {
            Log.e(this.f6847d, " Could not find ViewTransition");
        }
    }
}
