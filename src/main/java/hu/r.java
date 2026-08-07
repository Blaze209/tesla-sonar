package hu;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class r implements h {
    r() {
    }

    @Override // hu.h
    public final void a(ClassLoader classLoader, Set set) {
        q.c(classLoader, set, new o());
    }

    @Override // hu.h
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z11) {
        return q.d(classLoader, file, file2, z11, "zip");
    }
}
