package bm0;

import rm0.g;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static RuntimeException a(Throwable th2) {
        throw g.h(th2);
    }

    public static void b(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
