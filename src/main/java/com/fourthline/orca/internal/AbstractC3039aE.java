package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.aE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3039aE {
    public static final ZD a(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        if (th2 instanceof ZD) {
            return (ZD) th2;
        }
        if (th2 instanceof C3393il) {
            return ZD.a.f30007a;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "Can't find a message in `Throwable.toWorkerError`";
        }
        return new ZD.b(message);
    }
}
