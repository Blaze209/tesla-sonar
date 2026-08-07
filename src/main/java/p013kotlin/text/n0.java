package p013kotlin.text;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.dashcam_viewer.p1;
import com.tesla.dashcam_viewer.u;
import jn0.a0;
import jn0.c0;
import jn0.f0;
import jn0.y;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u000e*\u00020\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"", "Ljn0/y;", "a", "(Ljava/lang/String;)B", "Ljn0/f0;", "k", "(Ljava/lang/String;)S", "Ljn0/a0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)I", "", "radix", "e", "(Ljava/lang/String;I)I", "Ljn0/c0;", "h", "(Ljava/lang/String;)J", "b", "(Ljava/lang/String;)Ljn0/y;", "c", "(Ljava/lang/String;I)Ljn0/y;", "l", "(Ljava/lang/String;)Ljn0/f0;", "m", "(Ljava/lang/String;I)Ljn0/f0;", "f", "(Ljava/lang/String;)Ljn0/a0;", "g", "(Ljava/lang/String;I)Ljn0/a0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljn0/c0;", "j", "(Ljava/lang/String;I)Ljn0/c0;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    public static final byte a(String str) {
        s.k(str, "<this>");
        y yVarB = b(str);
        if (yVarB != null) {
            return yVarB.getData();
        }
        e0.w(str);
        throw new KotlinNothingValueException();
    }

    public static final y b(String str) {
        s.k(str, "<this>");
        return c(str, 10);
    }

    public static final y c(String str, int i11) {
        s.k(str, "<this>");
        a0 a0VarG = g(str, i11);
        if (a0VarG == null) {
            return null;
        }
        int data = a0VarG.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, a0.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return y.a(y.b((byte) data));
    }

    public static final int d(String str) {
        s.k(str, "<this>");
        a0 a0VarF = f(str);
        if (a0VarF != null) {
            return a0VarF.getData();
        }
        e0.w(str);
        throw new KotlinNothingValueException();
    }

    public static final int e(String str, int i11) {
        s.k(str, "<this>");
        a0 a0VarG = g(str, i11);
        if (a0VarG != null) {
            return a0VarG.getData();
        }
        e0.w(str);
        throw new KotlinNothingValueException();
    }

    public static final a0 f(String str) {
        s.k(str, "<this>");
        return g(str, 10);
    }

    public static final a0 g(String str, int i11) {
        int i12;
        s.k(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        if (s.m(cCharAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i12 = 0;
        }
        int iB = a0.b(i11);
        int iA = 119304647;
        while (i12 < length) {
            int iB2 = b.b(str.charAt(i12), i11);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i13 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = p1.a(-1, iB);
                    if (Integer.compare(i13 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = a0.b(i13 * iB);
            int iB4 = a0.b(a0.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i13 = iB4;
        }
        return a0.a(i13);
    }

    public static final long h(String str) {
        s.k(str, "<this>");
        c0 c0VarI = i(str);
        if (c0VarI != null) {
            return c0VarI.getData();
        }
        e0.w(str);
        throw new KotlinNothingValueException();
    }

    public static final c0 i(String str) {
        s.k(str, "<this>");
        return j(str, 10);
    }

    public static final c0 j(String str, int i11) {
        s.k(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (s.m(cCharAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = c0.b(i11);
        long j11 = 0;
        long jA = 512409557603043100L;
        while (i12 < length) {
            int iB = b.b(str.charAt(i12), i11);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = u.a(-1L, jB);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = c0.b(j11 * jB);
            long jB3 = c0.b(c0.b(((long) a0.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            j11 = jB3;
        }
        return c0.a(j11);
    }

    public static final short k(String str) {
        s.k(str, "<this>");
        f0 f0VarL = l(str);
        if (f0VarL != null) {
            return f0VarL.getData();
        }
        e0.w(str);
        throw new KotlinNothingValueException();
    }

    public static final f0 l(String str) {
        s.k(str, "<this>");
        return m(str, 10);
    }

    public static final f0 m(String str, int i11) {
        s.k(str, "<this>");
        a0 a0VarG = g(str, i11);
        if (a0VarG == null) {
            return null;
        }
        int data = a0VarG.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, a0.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return f0.a(f0.b((short) data));
    }
}
