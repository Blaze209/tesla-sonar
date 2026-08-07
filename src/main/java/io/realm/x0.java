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
public class x0 extends td0.o implements io.realm.internal.o, y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final OsObjectSchemaInfo f79187e = s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f79188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z<td0.o> f79189d;

    static final class a extends io.realm.internal.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f79190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f79191f;

        a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo osObjectSchemaInfoB = osSchemaInfo.b("RealmItem");
            this.f79190e = a("async_key", "async_key", osObjectSchemaInfoB);
            this.f79191f = a("async_value", "async_value", osObjectSchemaInfoB);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f79190e = aVar.f79190e;
            aVar2.f79191f = aVar.f79191f;
        }
    }

    x0() {
        this.f79189d.i();
    }

    public static td0.o o(c0 c0Var, a aVar, td0.o oVar, boolean z11, Map<n0, io.realm.internal.o> map, Set<o> set) {
        io.realm.internal.o oVar2 = map.get(oVar);
        if (oVar2 != null) {
            return (td0.o) oVar2;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(c0Var.P0(td0.o.class), set);
        osObjectBuilder.n(aVar.f79190e, oVar.b());
        osObjectBuilder.n(aVar.f79191f, oVar.a());
        x0 x0VarU = u(c0Var, osObjectBuilder.o());
        map.put(oVar, x0VarU);
        return x0VarU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static td0.o p(c0 c0Var, a aVar, td0.o oVar, boolean z11, Map<n0, io.realm.internal.o> map, Set<o> set) {
        boolean z12;
        if ((oVar instanceof io.realm.internal.o) && !p0.h(oVar)) {
            io.realm.internal.o oVar2 = (io.realm.internal.o) oVar;
            if (oVar2.f().c() != null) {
                io.realm.a aVarC = oVar2.f().c();
                if (aVarC.f78896b != c0Var.f78896b) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (aVarC.getPath().equals(c0Var.getPath())) {
                    return oVar;
                }
            }
        }
        io.realm.a.c cVar = io.realm.a.f78894k.get();
        io.realm.internal.o oVar3 = map.get(oVar);
        if (oVar3 != null) {
            return (td0.o) oVar3;
        }
        x0 x0Var = null;
        if (z11) {
            Table tableP0 = c0Var.P0(td0.o.class);
            long j11 = aVar.f79190e;
            String strB = oVar.b();
            long jD = strB == null ? tableP0.d(j11) : tableP0.e(j11, strB);
            if (jD == -1) {
                z12 = false;
            } else {
                try {
                    cVar.g(c0Var, tableP0.r(jD), aVar, false, Collections.EMPTY_LIST);
                    x0Var = new x0();
                    map.put(oVar, x0Var);
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
        return z12 ? v(c0Var, aVar, x0Var, oVar, map, set) : o(c0Var, aVar, oVar, z11, map, set);
    }

    public static a q(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static td0.o r(td0.o oVar, int i11, int i12, Map<n0, io.realm.internal.o.a<n0>> map) {
        td0.o oVar2;
        if (i11 > i12 || oVar == 0) {
            return null;
        }
        io.realm.internal.o.a<n0> aVar = map.get(oVar);
        if (aVar == null) {
            oVar2 = new td0.o();
            map.put(oVar, new io.realm.internal.o.a<>(i11, oVar2));
        } else {
            if (i11 >= aVar.f79099a) {
                return (td0.o) aVar.f79100b;
            }
            td0.o oVar3 = (td0.o) aVar.f79100b;
            aVar.f79099a = i11;
            oVar2 = oVar3;
        }
        oVar2.c(oVar.b());
        oVar2.g(oVar.a());
        return oVar2;
    }

    private static OsObjectSchemaInfo s() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RealmItem", false, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.a("", "async_key", realmFieldType, true, false, false);
        bVar.a("", "async_value", realmFieldType, false, false, false);
        return bVar.b();
    }

    public static OsObjectSchemaInfo t() {
        return f79187e;
    }

    static x0 u(io.realm.a aVar, io.realm.internal.q qVar) {
        io.realm.a.c cVar = io.realm.a.f78894k.get();
        cVar.g(aVar, qVar, aVar.J().e(td0.o.class), false, Collections.EMPTY_LIST);
        x0 x0Var = new x0();
        cVar.a();
        return x0Var;
    }

    static td0.o v(c0 c0Var, a aVar, td0.o oVar, td0.o oVar2, Map<n0, io.realm.internal.o> map, Set<o> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(c0Var.P0(td0.o.class), set);
        osObjectBuilder.n(aVar.f79190e, oVar2.b());
        osObjectBuilder.n(aVar.f79191f, oVar2.a());
        osObjectBuilder.p();
        return oVar;
    }

    @Override // td0.o, io.realm.y0
    public String a() {
        this.f79189d.c().n();
        return this.f79189d.d().getString(this.f79188c.f79191f);
    }

    @Override // td0.o, io.realm.y0
    public String b() {
        this.f79189d.c().n();
        return this.f79189d.d().getString(this.f79188c.f79190e);
    }

    @Override // td0.o, io.realm.y0
    public void c(String str) {
        if (this.f79189d.e()) {
            return;
        }
        this.f79189d.c().n();
        throw new RealmException("Primary key field 'async_key' cannot be changed after object was created.");
    }

    @Override // io.realm.internal.o
    public void d() {
        if (this.f79189d != null) {
            return;
        }
        io.realm.a.c cVar = io.realm.a.f78894k.get();
        this.f79188c = (a) cVar.c();
        z<td0.o> zVar = new z<>(this);
        this.f79189d = zVar;
        zVar.k(cVar.e());
        this.f79189d.l(cVar.f());
        this.f79189d.h(cVar.b());
        this.f79189d.j(cVar.d());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        io.realm.a aVarC = this.f79189d.c();
        io.realm.a aVarC2 = x0Var.f79189d.c();
        String path = aVarC.getPath();
        String path2 = aVarC2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (aVarC.b0() != aVarC2.b0() || !aVarC.f78899e.getVersionID().equals(aVarC2.f78899e.getVersionID())) {
            return false;
        }
        String strO = this.f79189d.d().getTable().o();
        String strO2 = x0Var.f79189d.d().getTable().o();
        if (strO == null ? strO2 == null : strO.equals(strO2)) {
            return this.f79189d.d().getObjectKey() == x0Var.f79189d.d().getObjectKey();
        }
        return false;
    }

    @Override // io.realm.internal.o
    public z<?> f() {
        return this.f79189d;
    }

    @Override // td0.o, io.realm.y0
    public void g(String str) {
        if (!this.f79189d.e()) {
            this.f79189d.c().n();
            if (str == null) {
                this.f79189d.d().setNull(this.f79188c.f79191f);
                return;
            } else {
                this.f79189d.d().setString(this.f79188c.f79191f, str);
                return;
            }
        }
        if (this.f79189d.b()) {
            io.realm.internal.q qVarD = this.f79189d.d();
            if (str == null) {
                qVarD.getTable().z(this.f79188c.f79191f, qVarD.getObjectKey(), true);
            } else {
                qVarD.getTable().A(this.f79188c.f79191f, qVarD.getObjectKey(), str, true);
            }
        }
    }

    public int hashCode() {
        String path = this.f79189d.c().getPath();
        String strO = this.f79189d.d().getTable().o();
        long objectKey = this.f79189d.d().getObjectKey();
        return ((((527 + (path != null ? path.hashCode() : 0)) * 31) + (strO != null ? strO.hashCode() : 0)) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String toString() {
        if (!p0.j(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("RealmItem = proxy[");
        sb2.append("{async_key:");
        String strB = b();
        String strA = Address.ADDRESS_NULL_PLACEHOLDER;
        sb2.append(strB != null ? b() : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{async_value:");
        if (a() != null) {
            strA = a();
        }
        sb2.append(strA);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
