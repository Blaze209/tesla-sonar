package androidx.p003lifecycle;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class o0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f8850b;

    o0(Object obj) {
        this.f8849a = obj;
        this.f8850b = d.f8768c.c(obj.getClass());
    }

    @Override // androidx.p003lifecycle.u
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.a aVar) {
        this.f8850b.a(lifecycleOwner, aVar, this.f8849a);
    }
}
