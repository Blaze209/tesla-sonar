package com.google.zxing;

/* JADX INFO: loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NotFoundException f45168c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f45168c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f45170b);
    }

    private NotFoundException() {
    }
}
