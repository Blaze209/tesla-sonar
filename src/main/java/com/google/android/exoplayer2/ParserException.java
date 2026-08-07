package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39393b;

    protected ParserException(String str, Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.f39392a = z11;
        this.f39393b = i11;
    }

    public static ParserException a(String str, Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException b(String str, Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f39392a + ", dataType=" + this.f39393b + "}";
    }
}
