package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends RecyclerView.n {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.g0 g0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean animateAppearance(@NonNull RecyclerView.g0 g0Var, RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i11;
        int i12;
        return (cVar == null || ((i11 = cVar.f13245a) == (i12 = cVar2.f13245a) && cVar.f13246b == cVar2.f13246b)) ? animateAdd(g0Var) : animateMove(g0Var, i11, cVar.f13246b, i12, cVar2.f13246b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i11, int i12, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean animateChange(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i11;
        int i12;
        int i13 = cVar.f13245a;
        int i14 = cVar.f13246b;
        if (g0Var2.shouldIgnore()) {
            int i15 = cVar.f13245a;
            i12 = cVar.f13246b;
            i11 = i15;
        } else {
            i11 = cVar2.f13245a;
            i12 = cVar2.f13246b;
        }
        return animateChange(g0Var, g0Var2, i13, i14, i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean animateDisappearance(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i11 = cVar.f13245a;
        int i12 = cVar.f13246b;
        View view = g0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f13245a;
        int top = cVar2 == null ? view.getTop() : cVar2.f13246b;
        if (g0Var.isRemoved() || (i11 == left && i12 == top)) {
            return animateRemove(g0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(g0Var, i11, i12, left, top);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.g0 g0Var, int i11, int i12, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean animatePersistence(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i11 = cVar.f13245a;
        int i12 = cVar2.f13245a;
        if (i11 != i12 || cVar.f13246b != cVar2.f13246b) {
            return animateMove(g0Var, i11, cVar.f13246b, i12, cVar2.f13246b);
        }
        dispatchMoveFinished(g0Var);
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.g0 g0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.g0 g0Var) {
        return !this.mSupportsChangeAnimations || g0Var.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.g0 g0Var) {
        onAddFinished(g0Var);
        dispatchAnimationFinished(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.g0 g0Var) {
        onAddStarting(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.g0 g0Var, boolean z11) {
        onChangeFinished(g0Var, z11);
        dispatchAnimationFinished(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.g0 g0Var, boolean z11) {
        onChangeStarting(g0Var, z11);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.g0 g0Var) {
        onMoveFinished(g0Var);
        dispatchAnimationFinished(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.g0 g0Var) {
        onMoveStarting(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.g0 g0Var) {
        onRemoveFinished(g0Var);
        dispatchAnimationFinished(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.g0 g0Var) {
        onRemoveStarting(g0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.g0 g0Var, boolean z11) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.g0 g0Var, boolean z11) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.g0 g0Var) {
    }

    public void setSupportsChangeAnimations(boolean z11) {
        this.mSupportsChangeAnimations = z11;
    }
}
