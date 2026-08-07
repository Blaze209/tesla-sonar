package ip0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.c0;
import okio.i0;
import okio.u0;
import org.bouncycastle.crypto.hpke.HPKE;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.m0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lokio/i0;", "zipPath", "Lokio/o;", "fileSystem", "Lkotlin/Function1;", "Lip0/l;", "", "predicate", "Lokio/u0;", IntegerTokenConverter.CONVERTER_KEY, "(Lokio/i0;Lokio/o;Lwn0/l;)Lokio/u0;", "", "entries", "", "e", "(Ljava/util/List;)Ljava/util/Map;", "Lokio/j;", "l", "(Lokio/j;)Lip0/l;", "Lip0/g;", "o", "(Lokio/j;)Lip0/g;", "regularRecord", "t", "(Lokio/j;Lip0/g;)Lip0/g;", "", "extraSize", "Lkotlin/Function2;", "", "Ljn0/h0;", "block", "p", "(Lokio/j;ILwn0/p;)V", "u", "(Lokio/j;)V", "centralDirectoryZipEntry", "q", "(Lokio/j;Lip0/l;)Lip0/l;", "r", "filetime", "g", "(J)J", InquiryField.DateField.TYPE, "time", "f", "(II)Ljava/lang/Long;", "", "h", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((l) t11).getCanonicalPath(), ((l) t12).getCanonicalPath());
        }
    }

    private static final Map<i0, l> e(List<l> list) {
        i0 i0VarE = i0.Companion.e(i0.INSTANCE, "/", false, 1, null);
        Map<i0, l> mapO = v0.o(x.a(i0VarE, new l(i0VarE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (l lVar : v.a1(list, new a())) {
            if (mapO.put(lVar.getCanonicalPath(), lVar) == null) {
                while (true) {
                    i0 i0VarG = lVar.getCanonicalPath().g();
                    if (i0VarG == null) {
                        break;
                    }
                    l lVar2 = mapO.get(i0VarG);
                    if (lVar2 != null) {
                        lVar2.c().add(lVar.getCanonicalPath());
                        break;
                    }
                    l lVar3 = new l(i0VarG, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                    mapO.put(i0VarG, lVar3);
                    lVar3.c().add(lVar.getCanonicalPath());
                    lVar = lVar3;
                }
            }
        }
        return mapO;
    }

    public static final Long f(int i11, int i12) {
        if (i12 == -1) {
            return null;
        }
        return Long.valueOf(r.a(((i11 >> 9) & 127) + 1980, (i11 >> 5) & 15, i11 & 31, (i12 >> 11) & 31, (i12 >> 5) & 63, (i12 & 31) << 1));
    }

    public static final long g(long j11) {
        return (j11 / ((long) 10000)) - 11644473600000L;
    }

    private static final String h(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i11, p013kotlin.text.a.a(16));
        s.j(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    public static final u0 i(i0 zipPath, okio.o fileSystem, wn0.l<? super l, Boolean> predicate) {
        Throwable th2;
        Throwable th3;
        Throwable th4;
        s.k(zipPath, "zipPath");
        s.k(fileSystem, "fileSystem");
        s.k(predicate, "predicate");
        okio.m mVarE0 = fileSystem.e0(zipPath);
        try {
            long size = mVarE0.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + mVarE0.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                okio.j jVarD = c0.d(mVarE0.J(size));
                try {
                    if (jVarD.w3() == 101010256) {
                        g gVarO = o(jVarD);
                        String strM0 = jVarD.M0(gVarO.getCommentByteCount());
                        jVarD.close();
                        long j11 = size - ((long) 20);
                        Throwable th5 = null;
                        if (j11 > 0) {
                            okio.j jVarD2 = c0.d(mVarE0.J(j11));
                            try {
                                if (jVarD2.w3() == 117853008) {
                                    int iW3 = jVarD2.w3();
                                    long jE0 = jVarD2.E0();
                                    if (jVarD2.w3() != 1 || iW3 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    okio.j jVarD3 = c0.d(mVarE0.J(jE0));
                                    try {
                                        int iW4 = jVarD3.w3();
                                        if (iW4 != 101075792) {
                                            throw new IOException("bad zip: expected " + h(101075792) + " but was " + h(iW4));
                                        }
                                        gVarO = t(jVarD3, gVarO);
                                        h0 h0Var = h0.f84049a;
                                        if (jVarD3 != null) {
                                            try {
                                                jVarD3.close();
                                            } catch (Throwable th6) {
                                                th4 = th6;
                                            }
                                        }
                                        th4 = null;
                                        if (th4 != null) {
                                            throw th4;
                                        }
                                    } catch (Throwable th7) {
                                        if (jVarD3 != null) {
                                            try {
                                                jVarD3.close();
                                                h0 h0Var2 = h0.f84049a;
                                            } catch (Throwable th8) {
                                                try {
                                                    jn0.g.a(th7, th8);
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    gVarO = gVarO;
                                                    if (jVarD2 != null) {
                                                        try {
                                                            jVarD2.close();
                                                            h0 h0Var3 = h0.f84049a;
                                                        } catch (Throwable th10) {
                                                            jn0.g.a(th2, th10);
                                                        }
                                                    }
                                                    th3 = th2;
                                                }
                                            }
                                        }
                                        th4 = th7;
                                        gVarO = gVarO;
                                    }
                                }
                                h0 h0Var4 = h0.f84049a;
                                if (jVarD2 != null) {
                                    try {
                                        jVarD2.close();
                                    } catch (Throwable th11) {
                                        th3 = th11;
                                    }
                                }
                                th3 = null;
                            } catch (Throwable th12) {
                                th2 = th12;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        okio.j jVarD4 = c0.d(mVarE0.J(gVarO.getCentralDirectoryOffset()));
                        try {
                            long entryCount = gVarO.getEntryCount();
                            for (long j12 = 0; j12 < entryCount; j12++) {
                                l lVarL = l(jVarD4);
                                if (lVarL.getOffset() >= gVarO.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(lVarL).booleanValue()) {
                                    arrayList.add(lVarL);
                                }
                            }
                            h0 h0Var5 = h0.f84049a;
                            if (jVarD4 != null) {
                                try {
                                    jVarD4.close();
                                } catch (Throwable th13) {
                                    th5 = th13;
                                }
                            }
                        } catch (Throwable th14) {
                            if (jVarD4 != null) {
                                try {
                                    jVarD4.close();
                                    h0 h0Var6 = h0.f84049a;
                                } catch (Throwable th15) {
                                    jn0.g.a(th14, th15);
                                }
                            }
                            th5 = th14;
                        }
                        if (th5 != null) {
                            throw th5;
                        }
                        u0 u0Var = new u0(zipPath, fileSystem, e(arrayList), strM0);
                        if (mVarE0 != null) {
                            try {
                                mVarE0.close();
                                h0 h0Var7 = h0.f84049a;
                            } catch (Throwable unused) {
                            }
                        }
                        return u0Var;
                    }
                    jVarD.close();
                    size--;
                } catch (Throwable th16) {
                    jVarD.close();
                    throw th16;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th17) {
            if (mVarE0 == null) {
                throw th17;
            }
            try {
                mVarE0.close();
                h0 h0Var8 = h0.f84049a;
                throw th17;
            } catch (Throwable th18) {
                jn0.g.a(th17, th18);
                throw th17;
            }
        }
    }

    public static /* synthetic */ u0 j(i0 i0Var, okio.o oVar, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new wn0.l() { // from class: ip0.m
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(q.k((l) obj2));
                }
            };
        }
        return i(i0Var, oVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(l it) {
        s.k(it, "it");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l l(final okio.j jVar) throws IOException {
        s.k(jVar, "<this>");
        int iW3 = jVar.w3();
        if (iW3 != 33639248) {
            throw new IOException("bad zip: expected " + h(33639248) + " but was " + h(iW3));
        }
        jVar.skip(4L);
        short sA0 = jVar.A0();
        int i11 = sA0 & HPKE.aead_EXPORT_ONLY;
        if ((sA0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i11));
        }
        int iA0 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        int iA1 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        int iA2 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        long jW3 = ((long) jVar.w3()) & 4294967295L;
        final m0 m0Var = new m0();
        m0Var.f86528a = ((long) jVar.w3()) & 4294967295L;
        final m0 m0Var2 = new m0();
        m0Var2.f86528a = ((long) jVar.w3()) & 4294967295L;
        int iA3 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        int iA4 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        int iA5 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        jVar.skip(8L);
        final m0 m0Var3 = new m0();
        m0Var3.f86528a = ((long) jVar.w3()) & 4294967295L;
        String strM0 = jVar.M0(iA3);
        if (t.g0(strM0, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j11 = m0Var2.f86528a == 4294967295L ? 8 : 0L;
        if (m0Var.f86528a == 4294967295L) {
            j11 += (long) 8;
        }
        if (m0Var3.f86528a == 4294967295L) {
            j11 += (long) 8;
        }
        final long j12 = j11;
        final n0 n0Var = new n0();
        final n0 n0Var2 = new n0();
        final n0 n0Var3 = new n0();
        final j0 j0Var = new j0();
        p(jVar, iA4, new wn0.p() { // from class: ip0.o
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return q.m(j0Var, j12, m0Var2, jVar, m0Var, m0Var3, n0Var, n0Var2, n0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j12 <= 0 || j0Var.f86523a) {
            return new l(i0.Companion.e(i0.INSTANCE, "/", false, 1, null).i(strM0), t.L(strM0, "/", false, 2, null), jVar.M0(iA5), jW3, m0Var.f86528a, m0Var2.f86528a, iA0, m0Var3.f86528a, iA2, iA1, (Long) n0Var.f86529a, (Long) n0Var2.f86529a, (Long) n0Var3.f86529a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(j0 j0Var, long j11, m0 m0Var, final okio.j jVar, m0 m0Var2, m0 m0Var3, final n0 n0Var, final n0 n0Var2, final n0 n0Var3, int i11, long j12) throws IOException {
        if (i11 != 1) {
            if (i11 == 10) {
                if (j12 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                jVar.skip(4L);
                p(jVar, (int) (j12 - 4), new wn0.p() { // from class: ip0.p
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return q.n(n0Var, jVar, n0Var2, n0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (j0Var.f86523a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            j0Var.f86523a = true;
            if (j12 < j11) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jE0 = m0Var.f86528a;
            if (jE0 == 4294967295L) {
                jE0 = jVar.E0();
            }
            m0Var.f86528a = jE0;
            m0Var2.f86528a = m0Var2.f86528a == 4294967295L ? jVar.E0() : 0L;
            m0Var3.f86528a = m0Var3.f86528a == 4294967295L ? jVar.E0() : 0L;
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final h0 n(n0 n0Var, okio.j jVar, n0 n0Var2, n0 n0Var3, int i11, long j11) throws IOException {
        if (i11 == 1) {
            if (n0Var.f86529a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j11 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            n0Var.f86529a = Long.valueOf(jVar.E0());
            n0Var2.f86529a = Long.valueOf(jVar.E0());
            n0Var3.f86529a = Long.valueOf(jVar.E0());
        }
        return h0.f84049a;
    }

    private static final g o(okio.j jVar) throws IOException {
        int iA0 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        int iA1 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        long jA0 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        if (jA0 != (jVar.A0() & HPKE.aead_EXPORT_ONLY) || iA0 != 0 || iA1 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        jVar.skip(4L);
        return new g(jA0, 4294967295L & ((long) jVar.w3()), jVar.A0() & HPKE.aead_EXPORT_ONLY);
    }

    private static final void p(okio.j jVar, int i11, wn0.p<? super Integer, ? super Long, h0> pVar) throws IOException {
        long j11 = i11;
        while (j11 != 0) {
            if (j11 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iA0 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
            long jA0 = ((long) jVar.A0()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j12 = j11 - ((long) 4);
            if (j12 < jA0) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            jVar.D2(jA0);
            long size = jVar.getBufferField().getSize();
            pVar.invoke(Integer.valueOf(iA0), Long.valueOf(jA0));
            long size2 = (jVar.getBufferField().getSize() + jA0) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iA0);
            }
            if (size2 > 0) {
                jVar.getBufferField().skip(size2);
            }
            j11 = j12 - jA0;
        }
    }

    public static final l q(okio.j jVar, l centralDirectoryZipEntry) throws IOException {
        s.k(jVar, "<this>");
        s.k(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        l lVarR = r(jVar, centralDirectoryZipEntry);
        s.h(lVarR);
        return lVarR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final l r(final okio.j jVar, l lVar) throws IOException {
        int iW3 = jVar.w3();
        if (iW3 != 67324752) {
            throw new IOException("bad zip: expected " + h(67324752) + " but was " + h(iW3));
        }
        jVar.skip(2L);
        short sA0 = jVar.A0();
        int i11 = sA0 & HPKE.aead_EXPORT_ONLY;
        if ((sA0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + h(i11));
        }
        jVar.skip(18L);
        long jA0 = ((long) jVar.A0()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iA0 = jVar.A0() & HPKE.aead_EXPORT_ONLY;
        jVar.skip(jA0);
        if (lVar == null) {
            jVar.skip(iA0);
            return null;
        }
        final n0 n0Var = new n0();
        final n0 n0Var2 = new n0();
        final n0 n0Var3 = new n0();
        p(jVar, iA0, new wn0.p() { // from class: ip0.n
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return q.s(jVar, n0Var, n0Var2, n0Var3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        return lVar.a((Integer) n0Var.f86529a, (Integer) n0Var2.f86529a, (Integer) n0Var3.f86529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final h0 s(okio.j jVar, n0 n0Var, n0 n0Var2, n0 n0Var3, int i11, long j11) throws IOException {
        if (i11 == 21589) {
            if (j11 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b11 = jVar.readByte();
            boolean z11 = (b11 & 1) == 1;
            boolean z12 = (b11 & 2) == 2;
            boolean z13 = (b11 & 4) == 4;
            long j12 = z11 ? 5L : 1L;
            if (z12) {
                j12 += 4;
            }
            if (z13) {
                j12 += 4;
            }
            if (j11 < j12) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z11) {
                n0Var.f86529a = Integer.valueOf(jVar.w3());
            }
            if (z12) {
                n0Var2.f86529a = Integer.valueOf(jVar.w3());
            }
            if (z13) {
                n0Var3.f86529a = Integer.valueOf(jVar.w3());
            }
        }
        return h0.f84049a;
    }

    private static final g t(okio.j jVar, g gVar) throws IOException {
        jVar.skip(12L);
        int iW3 = jVar.w3();
        int iW4 = jVar.w3();
        long jE0 = jVar.E0();
        if (jE0 != jVar.E0() || iW3 != 0 || iW4 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        jVar.skip(8L);
        return new g(jE0, jVar.E0(), gVar.getCommentByteCount());
    }

    public static final void u(okio.j jVar) throws IOException {
        s.k(jVar, "<this>");
        r(jVar, null);
    }
}
