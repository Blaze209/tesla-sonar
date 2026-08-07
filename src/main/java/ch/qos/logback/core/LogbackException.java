package ch.qos.logback.core;

/* JADX INFO: loaded from: classes3.dex */
public class LogbackException extends RuntimeException {
    private static final long serialVersionUID = -799956346239073266L;

    public LogbackException(String str) {
        super(str);
    }

    public LogbackException(String str, Throwable th2) {
        super(str, th2);
    }
}
