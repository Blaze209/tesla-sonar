package io.realm.internal;

import io.realm.d0;
import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;

/* JADX INFO: loaded from: classes9.dex */
public class TableQuery implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f79055e = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Table f79056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f79057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f79058c = new e0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f79059d = true;

    public TableQuery(g gVar, Table table, long j11) {
        this.f79056a = table;
        this.f79057b = j11;
        gVar.a(this);
    }

    private static String h(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    private native long[] nativeAverageDecimal128(long j11, long j12);

    private native double nativeAverageDouble(long j11, long j12);

    private native double nativeAverageFloat(long j11, long j12);

    private native double nativeAverageInt(long j11, long j12);

    private native long[] nativeAverageRealmAny(long j11, long j12);

    private native void nativeBeginGroup(long j11);

    private native long nativeCount(long j11);

    private native void nativeEndGroup(long j11);

    private native long nativeFind(long j11);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long j11, long j12);

    private native Double nativeMaximumDouble(long j11, long j12);

    private native Float nativeMaximumFloat(long j11, long j12);

    private native Long nativeMaximumInt(long j11, long j12);

    private native NativeRealmAny nativeMaximumRealmAny(long j11, long j12);

    private native Long nativeMaximumTimestamp(long j11, long j12);

    private native long[] nativeMinimumDecimal128(long j11, long j12);

    private native Double nativeMinimumDouble(long j11, long j12);

    private native Float nativeMinimumFloat(long j11, long j12);

    private native Long nativeMinimumInt(long j11, long j12);

    private native NativeRealmAny nativeMinimumRealmAny(long j11, long j12);

    private native Long nativeMinimumTimestamp(long j11, long j12);

    private native void nativeNot(long j11);

    private native void nativeOr(long j11);

    private native void nativeRawDescriptor(long j11, String str, long j12);

    private native void nativeRawPredicate(long j11, String str, long[] jArr, long j12);

    private native long nativeRemove(long j11);

    private native long[] nativeSumDecimal128(long j11, long j12);

    private native double nativeSumDouble(long j11, long j12);

    private native double nativeSumFloat(long j11, long j12);

    private native long nativeSumInt(long j11, long j12);

    private native long[] nativeSumRealmAny(long j11, long j12);

    private native String nativeValidateQuery(long j11);

    public TableQuery a() {
        o(null, "FALSEPREDICATE", new long[0]);
        this.f79059d = false;
        return this;
    }

    public TableQuery b() {
        nativeBeginGroup(this.f79057b);
        this.f79059d = false;
        return this;
    }

    public TableQuery c(OsKeyPathMapping osKeyPathMapping, String str, d0 d0Var) {
        this.f79058c.a(this, osKeyPathMapping, h(str) + " BEGINSWITH $0", d0Var);
        this.f79059d = false;
        return this;
    }

    public TableQuery d(OsKeyPathMapping osKeyPathMapping, String str, d0 d0Var) {
        this.f79058c.a(this, osKeyPathMapping, h(str) + " BEGINSWITH[c] $0", d0Var);
        this.f79059d = false;
        return this;
    }

    public TableQuery e() {
        nativeEndGroup(this.f79057b);
        this.f79059d = false;
        return this;
    }

    public TableQuery f(OsKeyPathMapping osKeyPathMapping, String str, d0 d0Var) {
        this.f79058c.a(this, osKeyPathMapping, h(str) + " = $0", d0Var);
        this.f79059d = false;
        return this;
    }

    public TableQuery g(OsKeyPathMapping osKeyPathMapping, String str, d0 d0Var) {
        this.f79058c.a(this, osKeyPathMapping, h(str) + " =[c] $0", d0Var);
        this.f79059d = false;
        return this;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79055e;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79057b;
    }

    public Table i() {
        return this.f79056a;
    }

    public TableQuery j(OsKeyPathMapping osKeyPathMapping, String str, d0[] d0VarArr) {
        String strH = h(str);
        b();
        int length = d0VarArr.length;
        boolean z11 = true;
        int i11 = 0;
        while (i11 < length) {
            d0 d0Var = d0VarArr[i11];
            if (!z11) {
                n();
            }
            if (d0Var == null) {
                l(osKeyPathMapping, strH);
            } else {
                f(osKeyPathMapping, strH, d0Var);
            }
            i11++;
            z11 = false;
        }
        e();
        this.f79059d = false;
        return this;
    }

    public TableQuery k(OsKeyPathMapping osKeyPathMapping, String str, d0[] d0VarArr) {
        String strH = h(str);
        b();
        int length = d0VarArr.length;
        boolean z11 = true;
        int i11 = 0;
        while (i11 < length) {
            d0 d0Var = d0VarArr[i11];
            if (!z11) {
                n();
            }
            if (d0Var == null) {
                l(osKeyPathMapping, strH);
            } else {
                g(osKeyPathMapping, strH, d0Var);
            }
            i11++;
            z11 = false;
        }
        e();
        this.f79059d = false;
        return this;
    }

    public TableQuery l(OsKeyPathMapping osKeyPathMapping, String str) {
        o(osKeyPathMapping, h(str) + " = NULL", new long[0]);
        this.f79059d = false;
        return this;
    }

    public TableQuery m() {
        nativeNot(this.f79057b);
        this.f79059d = false;
        return this;
    }

    public TableQuery n() {
        nativeOr(this.f79057b);
        this.f79059d = false;
        return this;
    }

    public void o(OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        nativeRawPredicate(this.f79057b, str, jArr, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L);
    }

    public void p() {
        if (this.f79059d) {
            return;
        }
        String strNativeValidateQuery = nativeValidateQuery(this.f79057b);
        if (!"".equals(strNativeValidateQuery)) {
            throw new UnsupportedOperationException(strNativeValidateQuery);
        }
        this.f79059d = true;
    }
}
