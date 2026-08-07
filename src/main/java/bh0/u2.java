package bh0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class u2 implements qj0.e<t2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f17387a;

    public u2(qj0.i<Context> iVar) {
        this.f17387a = iVar;
    }

    public static u2 a(qj0.i<Context> iVar) {
        return new u2(iVar);
    }

    public static t2 c(Context context) {
        return new t2(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t2 get() {
        return c(this.f17387a.get());
    }
}
