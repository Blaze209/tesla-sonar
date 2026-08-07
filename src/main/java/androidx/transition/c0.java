package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class c0 extends r {
    ArrayList<r> Q;
    private boolean R;
    int S;
    boolean T;
    private int U;

    class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f14026a;

        a(r rVar) {
            this.f14026a = rVar;
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void i(@NonNull r rVar) {
            this.f14026a.i0();
            rVar.e0(this);
        }
    }

    class b extends y {
        b() {
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void k(@NonNull r rVar) {
            c0.this.Q.remove(rVar);
            if (c0.this.M()) {
                return;
            }
            c0.this.Z(r.i.f14184c, false);
            c0 c0Var = c0.this;
            c0Var.B = true;
            c0Var.Z(r.i.f14183b, false);
        }
    }

    static class c extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c0 f14029a;

        c(c0 c0Var) {
            this.f14029a = c0Var;
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void e(@NonNull r rVar) {
            c0 c0Var = this.f14029a;
            if (c0Var.T) {
                return;
            }
            c0Var.s0();
            this.f14029a.T = true;
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void i(@NonNull r rVar) {
            c0 c0Var = this.f14029a;
            int i11 = c0Var.S - 1;
            c0Var.S = i11;
            if (i11 == 0) {
                c0Var.T = false;
                c0Var.s();
            }
            rVar.e0(this);
        }
    }

    public c0() {
        this.Q = new ArrayList<>();
        this.R = true;
        this.T = false;
        this.U = 0;
    }

    private int A0(long j11) {
        for (int i11 = 1; i11 < this.Q.size(); i11++) {
            if (this.Q.get(i11).L > j11) {
                return i11 - 1;
            }
        }
        return this.Q.size() - 1;
    }

    private void H0() {
        c cVar = new c(this);
        Iterator<r> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().c(cVar);
        }
        this.S = this.Q.size();
    }

    private void x0(@NonNull r rVar) {
        this.Q.add(rVar);
        rVar.f14154r = this;
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c0 e0(@NonNull r.h hVar) {
        return (c0) super.e0(hVar);
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public c0 f0(@NonNull View view) {
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            this.Q.get(i11).f0(view);
        }
        return (c0) super.f0(view);
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public c0 l0(long j11) {
        ArrayList<r> arrayList;
        super.l0(j11);
        if (this.f14139c >= 0 && (arrayList = this.Q) != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.Q.get(i11).l0(j11);
            }
        }
        return this;
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public c0 n0(TimeInterpolator timeInterpolator) {
        this.U |= 1;
        ArrayList<r> arrayList = this.Q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.Q.get(i11).n0(timeInterpolator);
            }
        }
        return (c0) super.n0(timeInterpolator);
    }

    @NonNull
    public c0 F0(int i11) {
        if (i11 == 0) {
            this.R = true;
            return this;
        }
        if (i11 == 1) {
            this.R = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i11);
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public c0 r0(long j11) {
        return (c0) super.r0(j11);
    }

    @Override // androidx.transition.r
    boolean M() {
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            if (this.Q.get(i11).M()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.r
    public boolean N() {
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.Q.get(i11).N()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.r
    public void b0(View view) {
        super.b0(view);
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).b0(view);
        }
    }

    @Override // androidx.transition.r
    protected void cancel() {
        super.cancel();
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).cancel();
        }
    }

    @Override // androidx.transition.r
    void d0() {
        this.J = 0L;
        b bVar = new b();
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            r rVar = this.Q.get(i11);
            rVar.c(bVar);
            rVar.d0();
            long J = rVar.J();
            if (this.R) {
                this.J = Math.max(this.J, J);
            } else {
                long j11 = this.J;
                rVar.L = j11;
                this.J = j11 + J;
            }
        }
    }

    @Override // androidx.transition.r
    public void g0(View view) {
        super.g0(view);
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).g0(view);
        }
    }

    @Override // androidx.transition.r
    public void i(@NonNull e0 e0Var) {
        if (Q(e0Var.f14042b)) {
            for (r rVar : this.Q) {
                if (rVar.Q(e0Var.f14042b)) {
                    rVar.i(e0Var);
                    e0Var.f14043c.add(rVar);
                }
            }
        }
    }

    @Override // androidx.transition.r
    protected void i0() {
        if (this.Q.isEmpty()) {
            s0();
            s();
            return;
        }
        H0();
        if (this.R) {
            Iterator<r> it = this.Q.iterator();
            while (it.hasNext()) {
                it.next().i0();
            }
            return;
        }
        for (int i11 = 1; i11 < this.Q.size(); i11++) {
            this.Q.get(i11 - 1).c(new a(this.Q.get(i11)));
        }
        r rVar = this.Q.get(0);
        if (rVar != null) {
            rVar.i0();
        }
    }

    @Override // androidx.transition.r
    void j0(boolean z11) {
        super.j0(z11);
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).j0(z11);
        }
    }

    @Override // androidx.transition.r
    void k(e0 e0Var) {
        super.k(e0Var);
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).k(e0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.r
    void k0(long j11, long j12) {
        long j13;
        long J = J();
        long j14 = 0;
        if (this.f14154r != null) {
            if (j11 < 0 && j12 < 0) {
                return;
            }
            if (j11 > J && j12 > J) {
                return;
            }
        }
        boolean z11 = j11 < j12;
        if ((j11 >= 0 && j12 < 0) || (j11 <= J && j12 > J)) {
            this.B = false;
            Z(r.i.f14182a, z11);
        }
        if (!this.R) {
            int iA0 = A0(j12);
            if (j11 >= j12) {
                while (true) {
                    if (iA0 < this.Q.size()) {
                        r rVar = this.Q.get(iA0);
                        long j15 = rVar.L;
                        j13 = j14;
                        long j16 = j11 - j15;
                        if (j16 < j13) {
                            break;
                        }
                        rVar.k0(j16, j12 - j15);
                        iA0++;
                        j14 = j13;
                    }
                }
            } else {
                j13 = 0;
                while (iA0 >= 0) {
                    r rVar2 = this.Q.get(iA0);
                    long j17 = rVar2.L;
                    long j18 = j11 - j17;
                    rVar2.k0(j18, j12 - j17);
                    if (j18 >= 0) {
                        break;
                    } else {
                        iA0--;
                    }
                }
            }
            if (this.f14154r != null) {
                if ((j11 > J || j12 > J) && (j11 >= 0 || j12 < j13)) {
                    return;
                }
                if (j11 > J) {
                    this.B = true;
                }
                Z(r.i.f14183b, z11);
            }
        }
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            this.Q.get(i11).k0(j11, j12);
        }
        j13 = j14;
        if (this.f14154r != null) {
            if (j11 > J) {
                return;
            } else {
                return;
            }
            if (j11 > J) {
                this.B = true;
            }
            Z(r.i.f14183b, z11);
        }
    }

    @Override // androidx.transition.r
    public void l(@NonNull e0 e0Var) {
        if (Q(e0Var.f14042b)) {
            for (r rVar : this.Q) {
                if (rVar.Q(e0Var.f14042b)) {
                    rVar.l(e0Var);
                    e0Var.f14043c.add(rVar);
                }
            }
        }
    }

    @Override // androidx.transition.r
    public void m0(r.e eVar) {
        super.m0(eVar);
        this.U |= 8;
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).m0(eVar);
        }
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: o */
    public r clone() {
        c0 c0Var = (c0) super.clone();
        c0Var.Q = new ArrayList<>();
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0Var.x0(this.Q.get(i11).clone());
        }
        return c0Var;
    }

    @Override // androidx.transition.r
    public void p0(k kVar) {
        super.p0(kVar);
        this.U |= 4;
        if (this.Q != null) {
            for (int i11 = 0; i11 < this.Q.size(); i11++) {
                this.Q.get(i11).p0(kVar);
            }
        }
    }

    @Override // androidx.transition.r
    void q(@NonNull ViewGroup viewGroup, @NonNull f0 f0Var, @NonNull f0 f0Var2, @NonNull ArrayList<e0> arrayList, @NonNull ArrayList<e0> arrayList2) {
        long jE = E();
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar = this.Q.get(i11);
            if (jE > 0 && (this.R || i11 == 0)) {
                long jE2 = rVar.E();
                if (jE2 > 0) {
                    rVar.r0(jE2 + jE);
                } else {
                    rVar.r0(jE);
                }
            }
            rVar.q(viewGroup, f0Var, f0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.r
    public void q0(a0 a0Var) {
        super.q0(a0Var);
        this.U |= 2;
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).q0(a0Var);
        }
    }

    @Override // androidx.transition.r
    void t(ViewGroup viewGroup) {
        super.t(viewGroup);
        int size = this.Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).t(viewGroup);
        }
    }

    @Override // androidx.transition.r
    String t0(String str) {
        String strT0 = super.t0(str);
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strT0);
            sb2.append("\n");
            sb2.append(this.Q.get(i11).t0(str + "  "));
            strT0 = sb2.toString();
        }
        return strT0;
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public c0 c(@NonNull r.h hVar) {
        return (c0) super.c(hVar);
    }

    @Override // androidx.transition.r
    @NonNull
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public c0 d(@NonNull View view) {
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            this.Q.get(i11).d(view);
        }
        return (c0) super.d(view);
    }

    @NonNull
    public c0 w0(@NonNull r rVar) {
        x0(rVar);
        long j11 = this.f14139c;
        if (j11 >= 0) {
            rVar.l0(j11);
        }
        if ((this.U & 1) != 0) {
            rVar.n0(x());
        }
        if ((this.U & 2) != 0) {
            rVar.q0(B());
        }
        if ((this.U & 4) != 0) {
            rVar.p0(A());
        }
        if ((this.U & 8) != 0) {
            rVar.m0(w());
        }
        return this;
    }

    public r y0(int i11) {
        if (i11 < 0 || i11 >= this.Q.size()) {
            return null;
        }
        return this.Q.get(i11);
    }

    public int z0() {
        return this.Q.size();
    }

    public c0(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = new ArrayList<>();
        this.R = true;
        this.T = false;
        this.U = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f14133i);
        F0(j5.k.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
