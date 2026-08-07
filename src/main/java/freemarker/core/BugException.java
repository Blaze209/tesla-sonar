package freemarker.core;

/* JADX INFO: loaded from: classes8.dex */
public class BugException extends RuntimeException {
    public BugException() {
        this((Throwable) null);
    }

    public BugException(String str) {
        this(str, null);
    }

    public BugException(Throwable th2) {
        super("A bug was detected in FreeMarker; please report it with stack-trace", th2);
    }

    public BugException(String str, Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("A bug was detected in FreeMarker; please report it with stack-trace: ");
        stringBuffer.append(str);
        super(stringBuffer.toString(), th2);
    }
}
