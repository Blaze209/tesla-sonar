package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r implements Closeable, Flushable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f49462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f49463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f49464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f49465h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f49458a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f49459b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f49460c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f49461d = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f49466i = -1;

    r() {
    }

    public static r e0(okio.i iVar) {
        return new n(iVar);
    }

    public final void B(int i11) {
        this.f49466i = i11;
    }

    public abstract r C();

    public abstract r D0(Number number);

    public abstract r G0(String str);

    public final String H() {
        String str = this.f49462e;
        return str != null ? str : "";
    }

    public final r H0(okio.j jVar) {
        if (this.f49465h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        okio.i iVarK0 = K0();
        try {
            jVar.D1(iVarK0);
            if (iVarK0 != null) {
                iVarK0.close();
            }
            return this;
        } catch (Throwable th2) {
            if (iVarK0 != null) {
                try {
                    iVarK0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final boolean I() {
        return this.f49464g;
    }

    public final boolean J() {
        return this.f49463f;
    }

    public abstract r J0(boolean z11);

    public abstract okio.i K0();

    public final void P(boolean z11) {
        this.f49463f = z11;
    }

    public final r T(Object obj) {
        if (obj instanceof Map) {
            o();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                b0((String) key);
                T(entry.getValue());
            }
            C();
            return this;
        }
        if (obj instanceof List) {
            c();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            t();
            return this;
        }
        if (obj instanceof String) {
            G0((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            J0(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            w0(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            y0(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            D0((Number) obj);
            return this;
        }
        if (obj == null) {
            c0();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    public abstract r b0(String str);

    public abstract r c();

    public abstract r c0();

    public final String getPath() {
        return l.a(this.f49458a, this.f49459b, this.f49460c, this.f49461d);
    }

    final int k0() {
        int i11 = this.f49458a;
        if (i11 != 0) {
            return this.f49459b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final int n() {
        int iK0 = k0();
        if (iK0 != 5 && iK0 != 3 && iK0 != 2 && iK0 != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i11 = this.f49466i;
        this.f49466i = this.f49458a;
        return i11;
    }

    public final void n0() {
        int iK0 = k0();
        if (iK0 != 5 && iK0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f49465h = true;
    }

    public abstract r o();

    final boolean p() {
        int i11 = this.f49458a;
        int[] iArr = this.f49459b;
        if (i11 != iArr.length) {
            return false;
        }
        if (i11 == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f49459b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f49460c;
        this.f49460c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f49461d;
        this.f49461d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof q)) {
            return true;
        }
        q qVar = (q) this;
        Object[] objArr = qVar.f49454j;
        qVar.f49454j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    final void r0(int i11) {
        int[] iArr = this.f49459b;
        int i12 = this.f49458a;
        this.f49458a = i12 + 1;
        iArr[i12] = i11;
    }

    final void s0(int i11) {
        this.f49459b[this.f49458a - 1] = i11;
    }

    public abstract r t();

    public void t0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f49462e = str;
    }

    public final void u0(boolean z11) {
        this.f49464g = z11;
    }

    public abstract r w0(double d11);

    public abstract r y0(long j11);

    public abstract r z0(Boolean bool);
}
