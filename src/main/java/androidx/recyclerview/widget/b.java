package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RecyclerView.h f13352a;

    public b(@NonNull RecyclerView.h hVar) {
        this.f13352a = hVar;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void a(int i11, int i12, Object obj) {
        this.f13352a.notifyItemRangeChanged(i11, i12, obj);
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i11, int i12) {
        this.f13352a.notifyItemRangeInserted(i11, i12);
    }

    @Override // androidx.recyclerview.widget.r
    public void c(int i11, int i12) {
        this.f13352a.notifyItemRangeRemoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i11, int i12) {
        this.f13352a.notifyItemMoved(i11, i12);
    }
}
