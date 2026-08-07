package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import s7.c0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o0 f11415a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(o0 o0Var) {
        this.f11415a = o0Var;
    }

    public final boolean a(c0 c0Var, long j11) {
        return b(c0Var) && c(c0Var, j11);
    }

    protected abstract boolean b(c0 c0Var);

    protected abstract boolean c(c0 c0Var, long j11);
}
