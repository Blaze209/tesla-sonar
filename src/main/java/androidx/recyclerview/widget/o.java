package androidx.recyclerview.widget;

import android.view.View;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f13562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f13563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f13565e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f13568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f13569i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f13561a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f13566f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f13567g = 0;

    o() {
    }

    boolean a(RecyclerView.c0 c0Var) {
        int i11 = this.f13563c;
        return i11 >= 0 && i11 < c0Var.b();
    }

    View b(RecyclerView.x xVar) {
        View viewO = xVar.o(this.f13563c);
        this.f13563c += this.f13564d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f13562b + ", mCurrentPosition=" + this.f13563c + ", mItemDirection=" + this.f13564d + ", mLayoutDirection=" + this.f13565e + ", mStartLine=" + this.f13566f + ", mEndLine=" + this.f13567g + CoreConstants.CURLY_RIGHT;
    }
}
