package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeRealmAny f78913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0.a f78914b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78915a;

        static {
            int[] iArr = new int[d0.a.values().length];
            f78915a = iArr;
            try {
                iArr[d0.a.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78915a[d0.a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78915a[d0.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78915a[d0.a.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78915a[d0.a.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78915a[d0.a.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78915a[d0.a.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f78915a[d0.a.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f78915a[d0.a.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f78915a[d0.a.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f78915a[d0.a.OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f78915a[d0.a.NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected f0(d0.a aVar) {
        this.f78914b = aVar;
    }

    static f0 b(io.realm.a aVar, NativeRealmAny nativeRealmAny) {
        d0.a type = nativeRealmAny.getType();
        switch (a.f78915a[type.ordinal()]) {
            case 1:
                return new p(nativeRealmAny);
            case 2:
                return new c(nativeRealmAny);
            case 3:
                return new v0(nativeRealmAny);
            case 4:
                return new b(nativeRealmAny);
            case 5:
                return new e(nativeRealmAny);
            case 6:
                return new l(nativeRealmAny);
            case 7:
                return new g(nativeRealmAny);
            case 8:
                return new f(nativeRealmAny);
            case 9:
                return new u(nativeRealmAny);
            case 10:
                return new w0(nativeRealmAny);
            case 11:
                if (aVar instanceof c0) {
                    try {
                        return new o0(aVar, nativeRealmAny, nativeRealmAny.getModelClass(aVar.f78899e, aVar.f78897c.n()));
                    } catch (RealmException unused) {
                    }
                }
                return new i(aVar, nativeRealmAny);
            case 12:
                return new s(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    private synchronized NativeRealmAny d() {
        try {
            if (this.f78913a == null) {
                this.f78913a = a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f78913a;
    }

    protected abstract NativeRealmAny a();

    long c() {
        return d().getNativePtr();
    }

    abstract <T> T e(Class<T> cls);

    protected f0(d0.a aVar, NativeRealmAny nativeRealmAny) {
        this.f78914b = aVar;
        this.f78913a = nativeRealmAny;
    }
}
