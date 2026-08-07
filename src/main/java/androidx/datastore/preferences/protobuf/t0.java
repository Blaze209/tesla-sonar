package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class t0<T> implements e1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f8218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1<?, ?> f8219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o<?> f8221d;

    private t0(k1<?, ?> k1Var, o<?> oVar, p0 p0Var) {
        this.f8219b = k1Var;
        this.f8220c = oVar.e(p0Var);
        this.f8221d = oVar;
        this.f8218a = p0Var;
    }

    private <UT, UB> int c(k1<UT, UB> k1Var, T t11) {
        return k1Var.i(k1Var.g(t11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends s.b<ET>> void d(k1<UT, UB> k1Var, o<ET> oVar, T t11, d1 d1Var, n nVar) throws Throwable {
        k1<UT, UB> k1Var2;
        UB ubF = k1Var.f(t11);
        Object objD = oVar.d(t11);
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                k1Var2 = k1Var;
                o<ET> oVar2 = oVar;
                d1 d1Var2 = d1Var;
                n nVar2 = nVar;
                try {
                    if (!f(d1Var2, nVar2, oVar2, objD, k1Var2, ubF)) {
                        k1Var2.o(t11, ubF);
                        return;
                    }
                    d1Var = d1Var2;
                    nVar = nVar2;
                    oVar = oVar2;
                    k1Var = k1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    k1Var2.o(t11, ubF);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                k1Var2 = k1Var;
            }
        }
        k1Var.o(t11, ubF);
    }

    static <T> t0<T> e(k1<?, ?> k1Var, o<?> oVar, p0 p0Var) {
        return new t0<>(k1Var, oVar, p0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends s.b<ET>> boolean f(d1 d1Var, n nVar, o<ET> oVar, s<ET> sVar, k1<UT, UB> k1Var, UB ub2) throws InvalidProtocolBufferException {
        int tag = d1Var.getTag();
        int uInt32 = 0;
        if (tag != p1.f8183a) {
            if (p1.b(tag) != 2) {
                return d1Var.skipField();
            }
            Object objB = oVar.b(nVar, this.f8218a, p1.a(tag));
            if (objB == null) {
                return k1Var.m(ub2, d1Var, 0);
            }
            oVar.h(d1Var, objB, nVar, sVar);
            return true;
        }
        Object objB2 = null;
        g bytes = null;
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = d1Var.getTag();
            if (tag2 == p1.f8185c) {
                uInt32 = d1Var.readUInt32();
                objB2 = oVar.b(nVar, this.f8218a, uInt32);
            } else if (tag2 == p1.f8186d) {
                if (objB2 != null) {
                    oVar.h(d1Var, objB2, nVar, sVar);
                } else {
                    bytes = d1Var.readBytes();
                }
            } else if (!d1Var.skipField()) {
                break;
            }
        }
        if (d1Var.getTag() != p1.f8184b) {
            throw InvalidProtocolBufferException.b();
        }
        if (bytes != null) {
            if (objB2 != null) {
                oVar.i(bytes, objB2, nVar, sVar);
            } else {
                k1Var.d(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void g(k1<UT, UB> k1Var, T t11, q1 q1Var) {
        k1Var.s(k1Var.g(t11), q1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void a(T t11, q1 q1Var) {
        Iterator itT = this.f8221d.c(t11).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            s.b bVar = (s.b) entry.getKey();
            if (bVar.getLiteJavaType() != p1.c.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof a0.b) {
                q1Var.writeMessageSetItem(bVar.getNumber(), ((a0.b) entry).a().e());
            } else {
                q1Var.writeMessageSetItem(bVar.getNumber(), entry.getValue());
            }
        }
        g(this.f8219b, t11, q1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void b(T t11, d1 d1Var, n nVar) throws Throwable {
        d(this.f8219b, this.f8221d, t11, d1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public boolean equals(T t11, T t12) {
        if (!this.f8219b.g(t11).equals(this.f8219b.g(t12))) {
            return false;
        }
        if (this.f8220c) {
            return this.f8221d.c(t11).equals(this.f8221d.c(t12));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int getSerializedSize(T t11) {
        int iC = c(this.f8219b, t11);
        return this.f8220c ? iC + this.f8221d.c(t11).j() : iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int hashCode(T t11) {
        int iHashCode = this.f8219b.g(t11).hashCode();
        return this.f8220c ? (iHashCode * 53) + this.f8221d.c(t11).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public final boolean isInitialized(T t11) {
        return this.f8221d.c(t11).p();
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void makeImmutable(T t11) {
        this.f8219b.j(t11);
        this.f8221d.f(t11);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void mergeFrom(T t11, T t12) {
        g1.G(this.f8219b, t11, t12);
        if (this.f8220c) {
            g1.E(this.f8221d, t11, t12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public T newInstance() {
        p0 p0Var = this.f8218a;
        return p0Var instanceof w ? (T) ((w) p0Var).F() : (T) p0Var.newBuilderForType().buildPartial();
    }
}
