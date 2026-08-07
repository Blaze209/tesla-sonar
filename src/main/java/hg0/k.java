package hg0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements qj0.e<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f72774a;

    public k(qj0.i<Context> iVar) {
        this.f72774a = iVar;
    }

    public static k a(qj0.i<Context> iVar) {
        return new k(iVar);
    }

    public static j c(Context context) {
        return new j(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f72774a.get());
    }
}
