package gg;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.g0;
import okio.h;
import okio.i;
import okio.j;
import okio.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f68881g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f68882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f68883b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f68884c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f68885d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f68886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f68887f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f68888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0 f68889b;

        private a(String[] strArr, g0 g0Var) {
            this.f68888a = strArr;
            this.f68889b = g0Var;
        }

        public static a a(String... strArr) {
            try {
                k[] kVarArr = new k[strArr.length];
                h hVar = new h();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    c.C(hVar, strArr[i11]);
                    hVar.readByte();
                    kVarArr[i11] = hVar.m1();
                }
                return new a((String[]) strArr.clone(), g0.n(kVarArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f68881g[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f68881g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void C(i iVar, String str) {
        String str2;
        String[] strArr = f68881g;
        iVar.writeByte(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i12) {
                        iVar.p0(str, i11, i12);
                    }
                    iVar.l2(str2);
                    i11 = i12 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                    iVar.p0(str, i11, i12);
                }
                iVar.l2(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            iVar.p0(str, i11, length);
        }
        iVar.writeByte(34);
    }

    public static c n(j jVar) {
        return new e(jVar);
    }

    public abstract void B();

    public abstract void F();

    final gg.b H(String str) throws gg.b {
        throw new gg.b(str + " at path " + getPath());
    }

    public abstract String L();

    public abstract String O();

    public abstract void e();

    public abstract void f();

    public final String getPath() {
        return d.a(this.f68882a, this.f68883b, this.f68884c, this.f68885d);
    }

    public abstract void h();

    public abstract boolean hasNext();

    public abstract void j();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract b o();

    final void p(int i11) {
        int i12 = this.f68882a;
        int[] iArr = this.f68883b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new gg.a("Nesting too deep at " + getPath());
            }
            this.f68883b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f68884c;
            this.f68884c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f68885d;
            this.f68885d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f68883b;
        int i13 = this.f68882a;
        this.f68882a = i13 + 1;
        iArr3[i13] = i11;
    }

    public abstract int t(a aVar);
}
