package hu;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class w implements h {
    w() {
    }

    static void c(ClassLoader classLoader, Set set) {
        q.c(classLoader, set, new u());
    }

    static boolean d(ClassLoader classLoader, File file, File file2, boolean z11) {
        return m.d(classLoader, file, file2, z11, new n(), "path", new v());
    }

    @Override // hu.h
    public final void a(ClassLoader classLoader, Set set) {
        c(classLoader, set);
    }

    @Override // hu.h
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z11) {
        return d(classLoader, file, file2, z11);
    }
}
