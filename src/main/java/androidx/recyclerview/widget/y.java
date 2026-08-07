package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f13590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f13591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.v f13592c = new a();

    class a extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f13593a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 == 0 && this.f13593a) {
                this.f13593a = false;
                y.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            if (i11 == 0 && i12 == 0) {
                return;
            }
            this.f13593a = true;
        }
    }

    private void e() {
        this.f13590a.m1(this.f13592c);
        this.f13590a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f13590a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f13590a.n(this.f13592c);
        this.f13590a.setOnFlingListener(this);
    }

    private boolean i(@NonNull RecyclerView.q qVar, int i11, int i12) {
        RecyclerView.b0 b0VarD;
        int iG;
        if (!(qVar instanceof RecyclerView.b0.b) || (b0VarD = d(qVar)) == null || (iG = g(qVar, i11, i12)) == -1) {
            return false;
        }
        b0VarD.p(iG);
        qVar.P1(b0VarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(int i11, int i12) {
        RecyclerView.q layoutManager = this.f13590a.getLayoutManager();
        if (layoutManager == null || this.f13590a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f13590a.getMinFlingVelocity();
        return (Math.abs(i12) > minFlingVelocity || Math.abs(i11) > minFlingVelocity) && i(layoutManager, i11, i12);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13590a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f13590a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f13591b = new Scroller(this.f13590a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(@NonNull RecyclerView.q qVar, @NonNull View view);

    protected abstract RecyclerView.b0 d(@NonNull RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.q qVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.q qVar, int i11, int i12);

    void j() {
        RecyclerView.q layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f13590a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i11 = iArrC[0];
        if (i11 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f13590a.A1(i11, iArrC[1]);
    }
}
