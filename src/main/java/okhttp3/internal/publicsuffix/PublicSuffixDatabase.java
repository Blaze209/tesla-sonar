package okhttp3.internal.publicsuffix;

import ch.qos.logback.core.CoreConstants;
import ho0.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.c0;
import okio.j;
import okio.u;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "", "splitDomain", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "findMatchingRule", "(Ljava/util/List;)Ljava/util/List;", "Ljn0/h0;", "readTheListUninterruptibly", "readTheList", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "([B[B)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = v.e(Marker.ANY_MARKER);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i11) {
            int i12;
            int iAnd;
            boolean z11;
            int iAnd2;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i12 = i15 + i16;
                    if (bArr[i12] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i12 - i15;
                int i18 = i11;
                boolean z12 = false;
                int i19 = 0;
                int i21 = 0;
                while (true) {
                    if (z12) {
                        iAnd = 46;
                        z11 = false;
                    } else {
                        boolean z13 = z12;
                        iAnd = Util.and(bArr2[i18][i19], 255);
                        z11 = z13;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i15 + i21], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i21++;
                    i19++;
                    if (i21 == i17) {
                        break;
                    }
                    if (bArr2[i18].length != i19) {
                        z12 = z11;
                    } else {
                        if (i18 == bArr2.length - 1) {
                            break;
                        }
                        i18++;
                        z12 = true;
                        i19 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i22 = i17 - i21;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i23 = i18 + 1; i23 < length3; i23++) {
                            length2 += bArr2[i23].length;
                        }
                        if (length2 >= i22) {
                            if (length2 <= i22) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                s.j(UTF_8, "UTF_8");
                                return new String(bArr, i15, i17, UTF_8);
                            }
                        }
                    }
                    i13 = i12 + 1;
                }
                length = i14;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String strBinarySearch;
        String str2;
        List<String> listM;
        List<String> listM2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i11 = 0; i11 < size; i11++) {
            String str3 = domainLabels.get(i11);
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.j(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            s.j(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                s.B("publicSuffixListBytes");
                bArr2 = null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i12);
            if (strBinarySearch != null) {
                break;
            }
            i12++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                str2 = null;
                break;
            }
            bArr3[i13] = WILDCARD_LABEL;
            Companion companion2 = INSTANCE;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                s.B("publicSuffixListBytes");
                bArr4 = null;
            }
            String strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i13);
            if (strBinarySearch2 != null) {
                str2 = strBinarySearch2;
                break;
            }
            i13++;
        }
        if (str2 != null) {
            int i14 = size - 1;
            for (int i15 = 0; i15 < i14; i15++) {
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    s.B("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i15);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
            }
        }
        if (str != null) {
            return t.e1(EXCEPTION_MARKER + str, new char[]{CoreConstants.DOT}, false, 0, 6, null);
        }
        if (strBinarySearch == null && str2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listM = t.e1(strBinarySearch, new char[]{CoreConstants.DOT}, false, 0, 6, null)) == null) {
            listM = v.m();
        }
        if (str2 == null || (listM2 = t.e1(str2, new char[]{CoreConstants.DOT}, false, 0, 6, null)) == null) {
            listM2 = v.m();
        }
        return listM.size() > listM2.size() ? listM : listM2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    private final void readTheList() {
        try {
            n0 n0Var = new n0();
            n0 n0Var2 = new n0();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                j jVarD = c0.d(new u(c0.m(resourceAsStream)));
                try {
                    n0Var.f86529a = jVarD.y2(jVarD.readInt());
                    n0Var2.f86529a = jVarD.y2(jVarD.readInt());
                    h0 h0Var = h0.f84049a;
                    b.a(jVarD, null);
                    synchronized (this) {
                        T t11 = n0Var.f86529a;
                        s.h(t11);
                        this.publicSuffixListBytes = (byte[]) t11;
                        T t12 = n0Var2.f86529a;
                        s.h(t12);
                        this.publicSuffixExceptionListBytes = (byte[]) t12;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(jVarD, th2);
                        throw th3;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th4) {
            this.readCompleteLatch.countDown();
            throw th4;
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z11 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z11 = true;
                } catch (IOException e11) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e11);
                    if (!z11) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (!z11) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> splitDomain(String domain) {
        List<String> listE1 = t.e1(domain, new char[]{CoreConstants.DOT}, false, 0, 6, null);
        return s.f(v.A0(listE1), "") ? v.j0(listE1, 1) : listE1;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        s.k(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        s.j(unicodeDomain, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicodeDomain);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return l.R(l.C(v.e0(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        s.k(publicSuffixListBytes, "publicSuffixListBytes");
        s.k(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
