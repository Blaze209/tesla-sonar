package io.realm;

import com.adyen.checkout.components.core.Address;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class z0 extends td0.q implements io.realm.internal.o, a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final OsObjectSchemaInfo f79202e = o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f79203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z<td0.q> f79204d;

    static final class a extends io.realm.internal.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f79205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f79206f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo osObjectSchemaInfoB = osSchemaInfo.b("RealmRawItem");
            this.f79205e = a("async_key", "async_key", osObjectSchemaInfoB);
            this.f79206f = a("async_value", "async_value", osObjectSchemaInfoB);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f79205e = aVar.f79205e;
            aVar2.f79206f = aVar.f79206f;
        }
    }

    z0() {
        this.f79204d.i();
    }

    public static td0.q k(c0 c0Var, a aVar, td0.q qVar, boolean z11, Map<n0, io.realm.internal.o> map, Set<o> set) {
        io.realm.internal.o oVar = map.get(qVar);
        if (oVar != null) {
            return (td0.q) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(c0Var.P0(td0.q.class), set);
        osObjectBuilder.n(aVar.f79205e, qVar.b());
        osObjectBuilder.c(aVar.f79206f, qVar.a());
        z0 z0VarQ = q(c0Var, osObjectBuilder.o());
        map.put(qVar, z0VarQ);
        return z0VarQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static td0.q l(c0 c0Var, a aVar, td0.q qVar, boolean z11, Map<n0, io.realm.internal.o> map, Set<o> set) {
        boolean z12;
        if ((qVar instanceof io.realm.internal.o) && !p0.h(qVar)) {
            io.realm.internal.o oVar = (io.realm.internal.o) qVar;
            if (oVar.f().c() != null) {
                io.realm.a aVarC = oVar.f().c();
                if (aVarC.f78896b != c0Var.f78896b) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (aVarC.getPath().equals(c0Var.getPath())) {
                    return qVar;
                }
            }
        }
        io.realm.a.c cVar = io.realm.a.f78894k.get();
        io.realm.internal.o oVar2 = map.get(qVar);
        if (oVar2 != null) {
            return (td0.q) oVar2;
        }
        z0 z0Var = null;
        if (z11) {
            Table tableP0 = c0Var.P0(td0.q.class);
            long j11 = aVar.f79205e;
            String strB = qVar.b();
            long jD = strB == null ? tableP0.d(j11) : tableP0.e(j11, strB);
            if (jD == -1) {
                z12 = false;
            } else {
                try {
                    cVar.g(c0Var, tableP0.r(jD), aVar, false, Collections.EMPTY_LIST);
                    z0Var = new z0();
                    map.put(qVar, z0Var);
                    cVar.a();
                    z12 = z11;
                } catch (Throwable th2) {
                    cVar.a();
                    throw th2;
                }
            }
        } else {
            z12 = z11;
        }
        return z12 ? r(c0Var, aVar, z0Var, qVar, map, set) : k(c0Var, aVar, qVar, z11, map, set);
    }

    public static a m(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static td0.q n(td0.q qVar, int i11, int i12, Map<n0, io.realm.internal.o.a<n0>> map) {
        td0.q qVar2;
        if (i11 > i12 || qVar == 0) {
            return null;
        }
        io.realm.internal.o.a<n0> aVar = map.get(qVar);
        if (aVar == null) {
            qVar2 = new td0.q();
            map.put(qVar, new io.realm.internal.o.a<>(i11, qVar2));
        } else {
            if (i11 >= aVar.f79099a) {
                return (td0.q) aVar.f79100b;
            }
            td0.q qVar3 = (td0.q) aVar.f79100b;
            aVar.f79099a = i11;
            qVar2 = qVar3;
        }
        qVar2.c(qVar.b());
        qVar2.e(qVar.a());
        return qVar2;
    }

    private static OsObjectSchemaInfo o() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RealmRawItem", false, 2, 0);
        bVar.a("", "async_key", RealmFieldType.STRING, true, false, false);
        bVar.a("", "async_value", RealmFieldType.BINARY, false, false, false);
        return bVar.b();
    }

    public static OsObjectSchemaInfo p() {
        return f79202e;
    }

    static z0 q(io.realm.a aVar, io.realm.internal.q qVar) {
        io.realm.a.c cVar = io.realm.a.f78894k.get();
        cVar.g(aVar, qVar, aVar.J().e(td0.q.class), false, Collections.EMPTY_LIST);
        z0 z0Var = new z0();
        cVar.a();
        return z0Var;
    }

    static td0.q r(c0 c0Var, a aVar, td0.q qVar, td0.q qVar2, Map<n0, io.realm.internal.o> map, Set<o> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(c0Var.P0(td0.q.class), set);
        osObjectBuilder.n(aVar.f79205e, qVar2.b());
        osObjectBuilder.c(aVar.f79206f, qVar2.a());
        osObjectBuilder.p();
        return qVar;
    }

    @Override // td0.q, io.realm.a1
    public byte[] a() {
        this.f79204d.c().n();
        return this.f79204d.d().getBinaryByteArray(this.f79203c.f79206f);
    }

    @Override // td0.q, io.realm.a1
    public String b() {
        this.f79204d.c().n();
        return this.f79204d.d().getString(this.f79203c.f79205e);
    }

    @Override // td0.q, io.realm.a1
    public void c(String str) {
        if (this.f79204d.e()) {
            return;
        }
        this.f79204d.c().n();
        throw new RealmException("Primary key field 'async_key' cannot be changed after object was created.");
    }

    @Override // io.realm.internal.o
    public void d() {
        if (this.f79204d != null) {
            return;
        }
        io.realm.a.c cVar = io.realm.a.f78894k.get();
        this.f79203c = (a) cVar.c();
        z<td0.q> zVar = new z<>(this);
        this.f79204d = zVar;
        zVar.k(cVar.e());
        this.f79204d.l(cVar.f());
        this.f79204d.h(cVar.b());
        this.f79204d.j(cVar.d());
    }

    @Override // td0.q, io.realm.a1
    public void e(byte[] bArr) {
        if (!this.f79204d.e()) {
            this.f79204d.c().n();
            if (bArr == null) {
                this.f79204d.d().setNull(this.f79203c.f79206f);
                return;
            } else {
                this.f79204d.d().setBinaryByteArray(this.f79203c.f79206f, bArr);
                return;
            }
        }
        if (this.f79204d.b()) {
            io.realm.internal.q qVarD = this.f79204d.d();
            if (bArr == null) {
                qVarD.getTable().z(this.f79203c.f79206f, qVarD.getObjectKey(), true);
            } else {
                qVarD.getTable().y(this.f79203c.f79206f, qVarD.getObjectKey(), bArr, true);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        io.realm.a aVarC = this.f79204d.c();
        io.realm.a aVarC2 = z0Var.f79204d.c();
        String path = aVarC.getPath();
        String path2 = aVarC2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (aVarC.b0() != aVarC2.b0() || !aVarC.f78899e.getVersionID().equals(aVarC2.f78899e.getVersionID())) {
            return false;
        }
        String strO = this.f79204d.d().getTable().o();
        String strO2 = z0Var.f79204d.d().getTable().o();
        if (strO == null ? strO2 == null : strO.equals(strO2)) {
            return this.f79204d.d().getObjectKey() == z0Var.f79204d.d().getObjectKey();
        }
        return false;
    }

    @Override // io.realm.internal.o
    public z<?> f() {
        return this.f79204d;
    }

    public int hashCode() {
        String path = this.f79204d.c().getPath();
        String strO = this.f79204d.d().getTable().o();
        long objectKey = this.f79204d.d().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (strO != null ? strO.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String toString() {
        if (!p0.j(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("RealmRawItem = proxy[");
        sb2.append("{async_key:");
        String strB = b();
        String str = Address.ADDRESS_NULL_PLACEHOLDER;
        sb2.append(strB != null ? b() : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{async_value:");
        if (a() != null) {
            str = "binary(" + a().length + ")";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
