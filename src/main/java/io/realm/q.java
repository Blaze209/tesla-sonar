package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class q extends r0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79152a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f79152a = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79152a[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    q(io.realm.a aVar, t0 t0Var, Table table) {
        super(aVar, t0Var, table, new r0.a(table));
    }

    private void i(String str, k[] kVarArr) {
        if (kVarArr != null) {
            boolean z11 = false;
            try {
                if (kVarArr.length > 0) {
                    if (p(kVarArr, k.INDEXED)) {
                        h(str);
                        z11 = true;
                    }
                    if (p(kVarArr, k.PRIMARY_KEY)) {
                        j(str);
                    }
                }
            } catch (Exception e11) {
                long jE = e(str);
                if (z11) {
                    this.f79159c.x(jE);
                }
                throw ((RuntimeException) e11);
            }
        }
    }

    private void k() {
        if (this.f79158b.f78897c.t()) {
            throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
        }
    }

    private void l(String str) {
        if (this.f79159c.j(str) == -1) {
            return;
        }
        throw new IllegalArgumentException("Field already exists in '" + d() + "': " + str);
    }

    private void m(String str, RealmFieldType realmFieldType) {
        int i11 = a.f79152a[realmFieldType.ordinal()];
        if (i11 == 1) {
            throw new IllegalArgumentException("Boolean fields cannot be marked as primary keys: " + str);
        }
        if (i11 != 2) {
            return;
        }
        throw new IllegalArgumentException("Date fields cannot be marked as primary keys: " + str);
    }

    private void n(String str, Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            m(str, RealmFieldType.BOOLEAN);
        }
        if (cls == Date.class) {
            m(str, RealmFieldType.DATE);
        }
    }

    private void o(String str) {
        r0.c(str);
        l(str);
    }

    static boolean p(k[] kVarArr, k kVar) {
        if (kVarArr != null && kVarArr.length != 0) {
            for (k kVar2 : kVarArr) {
                if (kVar2 == kVar) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.realm.r0
    public r0 a(String str, Class<?> cls, k... kVarArr) throws Exception {
        r0.b bVar = r0.f79153e.get(cls);
        if (bVar == null) {
            if (!r0.f79156h.containsKey(cls)) {
                if (n0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, cls));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException("Use addRealmObjectField() instead to add fields that link to other RealmObjects: " + str);
        }
        if (p(kVarArr, k.PRIMARY_KEY)) {
            k();
            n(str, cls);
        }
        o(str);
        boolean z11 = bVar.f79164c;
        if (p(kVarArr, k.REQUIRED)) {
            z11 = false;
        }
        long jA = this.f79159c.a(bVar.f79162a, str, z11);
        try {
            i(str, kVarArr);
            return this;
        } catch (Exception e11) {
            this.f79159c.w(jA);
            throw e11;
        }
    }

    public r0 h(String str) {
        r0.c(str);
        b(str);
        long jE = e(str);
        if (!this.f79159c.t(jE)) {
            this.f79159c.b(jE);
            return this;
        }
        throw new IllegalStateException(str + " already has an index.");
    }

    public r0 j(String str) {
        k();
        r0.c(str);
        b(str);
        String strB = OsObjectStore.b(this.f79158b.f78899e, d());
        if (strB != null) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", strB));
        }
        long jE = e(str);
        RealmFieldType realmFieldTypeF = f(str);
        m(str, realmFieldTypeF);
        if (realmFieldTypeF != RealmFieldType.STRING && !this.f79159c.t(jE)) {
            this.f79159c.b(jE);
        }
        OsObjectStore.d(this.f79158b.f78899e, d(), str);
        return this;
    }
}
