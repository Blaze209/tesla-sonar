package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<v> f3102a = Collections.unmodifiableSet(EnumSet.of(v.PASSIVE_FOCUSED, v.PASSIVE_NOT_FOCUSED, v.LOCKED_FOCUSED, v.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<x> f3103b = Collections.unmodifiableSet(EnumSet.of(x.CONVERGED, x.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<t> f3104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<t> f3105d;

    static {
        t tVar = t.CONVERGED;
        t tVar2 = t.FLASH_REQUIRED;
        t tVar3 = t.UNKNOWN;
        Set<t> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(tVar, tVar2, tVar3));
        f3104c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(tVar2);
        enumSetCopyOf.remove(tVar3);
        f3105d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(@NonNull z zVar, boolean z11) {
        boolean z12 = zVar.f() == u.OFF || zVar.f() == u.UNKNOWN || f3102a.contains(zVar.d());
        boolean z13 = zVar.k() == s.OFF;
        boolean z14 = !z11 ? !(z13 || f3104c.contains(zVar.g())) : !(z13 || f3105d.contains(zVar.g()));
        boolean z15 = zVar.i() == w.OFF || f3103b.contains(zVar.e());
        c0.y0.a("ConvergenceUtils", "checkCaptureResult, AE=" + zVar.g() + " AF =" + zVar.d() + " AWB=" + zVar.e());
        return z12 && z14 && z15;
    }
}
