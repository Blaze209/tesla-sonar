package fh0;

import androidx.p003lifecycle.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f65971a;

    public f(b bVar) {
        this.f65971a = bVar;
    }

    public static f a(b bVar) {
        return new f(bVar);
    }

    public static s0 c(b bVar) {
        return (s0) qj0.h.d(bVar.getSavedStateHandle());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f65971a);
    }
}
