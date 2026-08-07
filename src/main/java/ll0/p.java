package ll0;

import java.nio.ByteBuffer;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lll0/o;", "", "dst", "", "offset", "length", "Ljn0/h0;", "c", "(Lll0/o;[BII)V", "Lll0/a;", "b", "(Lll0/o;Lll0/a;I)V", "Ljl0/c;", "destination", "", "destinationOffset", "a", "(Lll0/o;Ljava/nio/ByteBuffer;JJ)J", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p {
    public static final long a(o readAvailable, ByteBuffer byteBuffer, long j11, long j12) throws Throwable {
        long j13;
        p013kotlin.jvm.internal.s.k(readAvailable, "$this$readAvailable");
        ByteBuffer destination = byteBuffer;
        p013kotlin.jvm.internal.s.k(destination, "destination");
        boolean z11 = true;
        ml0.a aVarB = ml0.f.b(readAvailable, 1);
        if (aVarB == null) {
            j13 = j12;
        } else {
            long j14 = j11;
            j13 = j12;
            ml0.a aVarC = aVarB;
            while (true) {
                try {
                    int iMin = (int) Math.min(j13, aVarC.getWritePosition() - aVarC.getReadPosition());
                    long j15 = iMin;
                    jl0.c.d(aVarC.getMemory(), destination, aVarC.getReadPosition(), j15, j14);
                    aVarC.c(iMin);
                    j13 -= j15;
                    j14 += j15;
                    if (j13 <= 0) {
                        ml0.f.a(readAvailable, aVarC);
                        break;
                    }
                    try {
                        aVarC = ml0.f.c(readAvailable, aVarC);
                        if (aVarC == null) {
                            break;
                        }
                        destination = byteBuffer;
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = false;
                        if (z11) {
                            ml0.f.a(readAvailable, aVarC);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        long j16 = j12 - j13;
        if (j16 == 0 && readAvailable.w0()) {
            return -1L;
        }
        return j16;
    }

    public static final void b(o oVar, a dst, int i11) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(dst, "dst");
        boolean z11 = true;
        ml0.a aVarB = ml0.f.b(oVar, 1);
        if (aVarB != null) {
            do {
                try {
                    int iMin = Math.min(i11, aVarB.getWritePosition() - aVarB.getReadPosition());
                    f.a(aVarB, dst, iMin);
                    i11 -= iMin;
                    if (i11 <= 0) {
                        ml0.f.a(oVar, aVarB);
                        break;
                    }
                    try {
                        aVarB = ml0.f.c(oVar, aVarB);
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = false;
                        if (z11) {
                            ml0.f.a(oVar, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } while (aVarB != null);
        }
        if (i11 <= 0) {
            return;
        }
        w.a(i11);
        throw new KotlinNothingValueException();
    }

    public static final void c(o oVar, byte[] dst, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(dst, "dst");
        boolean z11 = true;
        ml0.a aVarB = ml0.f.b(oVar, 1);
        if (aVarB != null) {
            do {
                try {
                    int iMin = Math.min(i12, aVarB.getWritePosition() - aVarB.getReadPosition());
                    f.b(aVarB, dst, i11, iMin);
                    i12 -= iMin;
                    i11 += iMin;
                    if (i12 <= 0) {
                        ml0.f.a(oVar, aVarB);
                        break;
                    }
                    try {
                        aVarB = ml0.f.c(oVar, aVarB);
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = false;
                        if (z11) {
                            ml0.f.a(oVar, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } while (aVarB != null);
        }
        if (i12 <= 0) {
            return;
        }
        w.a(i12);
        throw new KotlinNothingValueException();
    }
}
