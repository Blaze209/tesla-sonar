package ll0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lll0/r;", "", "src", "", "offset", "length", "Ljn0/h0;", "b", "(Lll0/r;[BII)V", "Lll0/a;", "a", "(Lll0/r;Lll0/a;I)V", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    public static final void a(r rVar, a src, int i11) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        p013kotlin.jvm.internal.s.k(src, "src");
        ml0.a aVarD = ml0.f.d(rVar, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i11, aVarD.getLimit() - aVarD.getWritePosition());
                f.d(aVarD, src, iMin);
                i11 -= iMin;
                if (i11 <= 0) {
                    rVar.n();
                    return;
                }
                aVarD = ml0.f.d(rVar, 1, aVarD);
            } catch (Throwable th2) {
                rVar.n();
                throw th2;
            }
        }
    }

    public static final void b(r rVar, byte[] src, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        p013kotlin.jvm.internal.s.k(src, "src");
        ml0.a aVarD = ml0.f.d(rVar, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i12, aVarD.getLimit() - aVarD.getWritePosition());
                f.e(aVarD, src, i11, iMin);
                i11 += iMin;
                i12 -= iMin;
                if (i12 <= 0) {
                    rVar.n();
                    return;
                }
                aVarD = ml0.f.d(rVar, 1, aVarD);
            } catch (Throwable th2) {
                rVar.n();
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(r rVar, a aVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = aVar.getWritePosition() - aVar.getReadPosition();
        }
        a(rVar, aVar, i11);
    }

    public static /* synthetic */ void d(r rVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length - i11;
        }
        b(rVar, bArr, i11, i12);
    }
}
