package qw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f106183b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<f> f106184a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f106183b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f106183b;
                if (dVar == null) {
                    dVar = new d();
                    f106183b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f106184a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f106184a);
        }
        return setUnmodifiableSet;
    }
}
