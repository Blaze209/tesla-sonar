package hg0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements qj0.e<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f72784a;

    public s(qj0.i<Context> iVar) {
        this.f72784a = iVar;
    }

    public static s a(qj0.i<Context> iVar) {
        return new s(iVar);
    }

    public static r c(Context context) {
        return new r(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f72784a.get());
    }
}
