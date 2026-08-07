package kh0;

import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<b> f86124a;

    public f(i<b> iVar) {
        this.f86124a = iVar;
    }

    public static f a(i<b> iVar) {
        return new f(iVar);
    }

    public static e c(b bVar, String str) {
        return new e(bVar, str);
    }

    public e b(String str) {
        return c(this.f86124a.get(), str);
    }
}
