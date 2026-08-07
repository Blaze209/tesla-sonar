package org.aspectj.lang;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes9.dex */
public class SoftException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f98506b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Throwable f98507a;

    static {
        boolean z11;
        try {
            Class.forName("java.nio.Buffer");
            z11 = true;
        } catch (Throwable unused) {
            z11 = false;
        }
        f98506b = z11;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f98507a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th2 = this.f98507a;
        if (f98506b || th2 == null) {
            return;
        }
        printStream.print(CoreConstants.CAUSED_BY);
        th2.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th2 = this.f98507a;
        if (f98506b || th2 == null) {
            return;
        }
        printWriter.print(CoreConstants.CAUSED_BY);
        th2.printStackTrace(printWriter);
    }
}
