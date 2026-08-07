package com.google.zxing;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static boolean f45169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f45170b;

    static {
        f45169a = System.getProperty("surefire.test.class.path") != null;
        f45170b = new StackTraceElement[0];
    }

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
