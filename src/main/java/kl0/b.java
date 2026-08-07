package kl0;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import ll0.j;
import ll0.k;
import ll0.o;
import ll0.r;
import ml0.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u000e*\u00060\nj\u0002`\u000b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0019\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "Lll0/k;", "c", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lll0/k;", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "Lll0/o;", "max", "", "a", "(Ljava/nio/charset/CharsetDecoder;Lll0/o;I)Ljava/lang/String;", "", "g", "(Lll0/o;)J", "Lll0/r;", "dst", "e", "(Ljava/nio/charset/CharsetEncoder;Lll0/r;)I", "destination", "f", "(Ljava/nio/charset/CharsetEncoder;Lll0/r;Ljava/lang/CharSequence;II)I", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final String a(CharsetDecoder charsetDecoder, o input, int i11) {
        s.k(charsetDecoder, "<this>");
        s.k(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i11, g(input)));
        a.a(charsetDecoder, input, sb2, i11);
        String string = sb2.toString();
        s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, o oVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, oVar, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final k c(CharsetEncoder charsetEncoder, CharSequence input, int i11, int i12) {
        s.k(charsetEncoder, "<this>");
        s.k(input, "input");
        j jVar = new j(null, 1, 0 == true ? 1 : 0);
        try {
            f(charsetEncoder, jVar, input, i11, i12);
            return jVar.T0();
        } catch (Throwable th2) {
            jVar.release();
            throw th2;
        }
    }

    public static /* synthetic */ k d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i11, i12);
    }

    private static final int e(CharsetEncoder charsetEncoder, r rVar) {
        ml0.a aVarD = f.d(rVar, 1, null);
        int i11 = 1;
        int limit = 0;
        while (true) {
            try {
                int limit2 = aVarD.getLimit() - aVarD.getWritePosition();
                i11 = a.e(charsetEncoder, aVarD) ? 0 : i11 + 1;
                limit += limit2 - (aVarD.getLimit() - aVarD.getWritePosition());
                if (i11 <= 0) {
                    rVar.n();
                    return limit;
                }
                aVarD = f.d(rVar, 1, aVarD);
            } catch (Throwable th2) {
                rVar.n();
                throw th2;
            }
        }
    }

    public static final int f(CharsetEncoder charsetEncoder, r destination, CharSequence input, int i11, int i12) {
        int i13;
        s.k(charsetEncoder, "<this>");
        s.k(destination, "destination");
        s.k(input, "input");
        if (i11 >= i12) {
            return 0;
        }
        ml0.a aVarD = f.d(destination, 1, null);
        int limit = 0;
        while (true) {
            try {
                int limit2 = aVarD.getLimit() - aVarD.getWritePosition();
                int iF = a.f(charsetEncoder, input, i11, i12, aVarD);
                if (iF < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i11 += iF;
                limit += limit2 - (aVarD.getLimit() - aVarD.getWritePosition());
                if (i11 >= i12) {
                    i13 = 0;
                } else {
                    i13 = iF == 0 ? 8 : 1;
                }
                if (i13 <= 0) {
                    destination.n();
                    return limit + e(charsetEncoder, destination);
                }
                aVarD = f.d(destination, i13, aVarD);
            } catch (Throwable th2) {
                destination.n();
                throw th2;
            }
        }
    }

    public static final long g(o oVar) {
        s.k(oVar, "<this>");
        return oVar instanceof k ? oVar.J0() : Math.max(oVar.J0(), 16L);
    }
}
