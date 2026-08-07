package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.g0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f49410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f49411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f49412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f49413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f49414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f49415f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49416a;

        static {
            int[] iArr = new int[c.values().length];
            f49416a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49416a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49416a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49416a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49416a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49416a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f49417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0 f49418b;

        private b(String[] strArr, g0 g0Var) {
            this.f49417a = strArr;
            this.f49418b = g0Var;
        }

        public static b a(String... strArr) {
            try {
                okio.k[] kVarArr = new okio.k[strArr.length];
                okio.h hVar = new okio.h();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    n.d1(hVar, strArr[i11]);
                    hVar.readByte();
                    kVarArr[i11] = hVar.m1();
                }
                return new b((String[]) strArr.clone(), g0.n(kVarArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public enum c {
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

    k() {
        this.f49411b = new int[32];
        this.f49412c = new String[32];
        this.f49413d = new int[32];
    }

    public static k t(okio.j jVar) {
        return new m(jVar);
    }

    public abstract c B();

    public abstract k C();

    public abstract void F();

    public abstract void H();

    final void I(int i11) {
        int i12 = this.f49410a;
        int[] iArr = this.f49411b;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f49411b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f49412c;
            this.f49412c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f49413d;
            this.f49413d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f49411b;
        int i13 = this.f49410a;
        this.f49410a = i13 + 1;
        iArr3[i13] = i11;
    }

    public final Object J() {
        switch (a.f49416a[B().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                f();
                while (hasNext()) {
                    arrayList.add(J());
                }
                e();
                return arrayList;
            case 2:
                s sVar = new s();
                h();
                while (hasNext()) {
                    String strL = L();
                    Object objJ = J();
                    Object objPut = sVar.put(strL, objJ);
                    if (objPut != null) {
                        throw new JsonDataException("Map key '" + strL + "' has multiple values at path " + getPath() + ": " + objPut + " and " + objJ);
                    }
                }
                j();
                return sVar;
            case 3:
                return O();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return o();
            default:
                throw new IllegalStateException("Expected a value but was " + B() + " at path " + getPath());
        }
    }

    public abstract String L();

    public abstract String O();

    public final void P(boolean z11) {
        this.f49414e = z11;
    }

    public abstract int T(b bVar);

    public abstract int b0(b bVar);

    public final boolean c() {
        return this.f49415f;
    }

    public final void c0(boolean z11) {
        this.f49415f = z11;
    }

    public abstract void e();

    public abstract void e0();

    public abstract void f();

    public final String getPath() {
        return l.a(this.f49410a, this.f49411b, this.f49412c, this.f49413d);
    }

    public abstract void h();

    public abstract boolean hasNext();

    public abstract void j();

    final JsonEncodingException k0(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public final boolean n() {
        return this.f49414e;
    }

    final JsonDataException n0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract long nextLong();

    public abstract <T> T o();

    public abstract okio.j p();

    k(k kVar) {
        this.f49410a = kVar.f49410a;
        this.f49411b = (int[]) kVar.f49411b.clone();
        this.f49412c = (String[]) kVar.f49412c.clone();
        this.f49413d = (int[]) kVar.f49413d.clone();
        this.f49414e = kVar.f49414e;
        this.f49415f = kVar.f49415f;
    }
}
