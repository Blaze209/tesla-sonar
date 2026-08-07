package com.google.zxing;

/* JADX INFO: loaded from: classes6.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FormatException f45167c;

    static {
        FormatException formatException = new FormatException();
        f45167c = formatException;
        formatException.setStackTrace(ReaderException.f45170b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f45169a ? new FormatException() : f45167c;
    }
}
