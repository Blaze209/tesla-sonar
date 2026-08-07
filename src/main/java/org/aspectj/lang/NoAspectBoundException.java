package org.aspectj.lang;

/* JADX INFO: loaded from: classes9.dex */
public class NoAspectBoundException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Throwable f98505a;

    /* JADX WARN: Illegal instructions before constructor call */
    public NoAspectBoundException(String str, Throwable th2) {
        if (th2 != null) {
            str = "Exception while initializing " + str + ": " + th2;
        }
        super(str);
        this.f98505a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f98505a;
    }

    public NoAspectBoundException() {
    }
}
