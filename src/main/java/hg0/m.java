package hg0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements qj0.e<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f72776a;

    public m(qj0.i<Context> iVar) {
        this.f72776a = iVar;
    }

    public static m a(qj0.i<Context> iVar) {
        return new m(iVar);
    }

    public static l c(Context context) {
        return new l(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f72776a.get());
    }
}
