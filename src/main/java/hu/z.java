package hu;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class z implements h {
    z() {
    }

    @Override // hu.h
    public final void a(ClassLoader classLoader, Set set) {
        w.c(classLoader, set);
    }

    @Override // hu.h
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z11) {
        return m.d(classLoader, file, file2, z11, new n(), "path", new y());
    }
}
