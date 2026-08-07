package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import hr.b0;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f39860a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(b0 b0Var) {
        this.f39860a = b0Var;
    }

    public final boolean a(d0 d0Var, long j11) {
        return b(d0Var) && c(d0Var, j11);
    }

    protected abstract boolean b(d0 d0Var);

    protected abstract boolean c(d0 d0Var, long j11);
}
