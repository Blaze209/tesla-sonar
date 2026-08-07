package net.time4j;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 implements net.time4j.engine.o, fp0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f93972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.tz.l f93973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient i0 f93974c;

    private b1(b0 b0Var, net.time4j.tz.l lVar) {
        this.f93973b = lVar;
        net.time4j.tz.p pVarB = lVar.B(b0Var);
        if (!b0Var.i0() || (pVarB.i() == 0 && pVarB.h() % 60 == 0)) {
            this.f93972a = b0Var;
            this.f93974c = i0.R(b0Var, pVarB);
        } else {
            throw new IllegalArgumentException("Leap second can only be represented  with timezone-offset in full minutes: " + pVarB);
        }
    }

    static b1 d(b0 b0Var, net.time4j.tz.l lVar) {
        return new b1(b0Var, lVar);
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f93972a.a();
    }

    public net.time4j.tz.p b() {
        return this.f93973b.B(this.f93972a);
    }

    public boolean c() {
        return this.f93972a.i0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f93972a.equals(b1Var.f93972a) && this.f93973b.equals(b1Var.f93973b)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.engine.o
    public net.time4j.tz.k g() {
        return this.f93973b.z();
    }

    public int hashCode() {
        return this.f93972a.hashCode() ^ this.f93973b.hashCode();
    }

    @Override // fp0.g
    public long i(fp0.f fVar) {
        return this.f93972a.i(fVar);
    }

    @Override // net.time4j.engine.o
    public boolean j() {
        return true;
    }

    @Override // net.time4j.engine.o
    public <V> V k(net.time4j.engine.p<V> pVar) {
        return this.f93974c.n(pVar) ? (V) this.f93974c.k(pVar) : (V) this.f93972a.k(pVar);
    }

    @Override // net.time4j.base.f
    public long l() {
        return this.f93972a.l();
    }

    @Override // fp0.g
    public int m(fp0.f fVar) {
        return this.f93972a.m(fVar);
    }

    @Override // net.time4j.engine.o
    public boolean n(net.time4j.engine.p<?> pVar) {
        return this.f93974c.n(pVar) || this.f93972a.n(pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // net.time4j.engine.o
    public <V> V o(net.time4j.engine.p<V> pVar) {
        V v11 = this.f93974c.n(pVar) ? (V) this.f93974c.o(pVar) : (V) this.f93972a.o(pVar);
        if (pVar == h0.f94534y && this.f93974c.b() >= 1972) {
            i0 i0Var = (i0) this.f93974c.B(pVar, v11);
            if (!this.f93973b.K(i0Var, i0Var) && i0Var.V(this.f93973b).m0(1L, n0.SECONDS).i0()) {
                return pVar.getType().cast(60);
            }
        }
        return v11;
    }

    @Override // net.time4j.engine.o
    public int p(net.time4j.engine.p<Integer> pVar) {
        if (this.f93972a.i0() && pVar == h0.f94534y) {
            return 60;
        }
        int iP = this.f93974c.p(pVar);
        return iP == Integer.MIN_VALUE ? this.f93972a.p(pVar) : iP;
    }

    @Override // net.time4j.engine.o
    public <V> V s(net.time4j.engine.p<V> pVar) {
        if (this.f93972a.i0() && pVar == h0.f94534y) {
            return pVar.getType().cast(60);
        }
        return this.f93974c.n(pVar) ? (V) this.f93974c.s(pVar) : (V) this.f93972a.s(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(this.f93974c.S());
        sb2.append('T');
        int iC = this.f93974c.c();
        if (iC < 10) {
            sb2.append('0');
        }
        sb2.append(iC);
        sb2.append(CoreConstants.COLON_CHAR);
        int iE = this.f93974c.e();
        if (iE < 10) {
            sb2.append('0');
        }
        sb2.append(iE);
        sb2.append(CoreConstants.COLON_CHAR);
        if (c()) {
            sb2.append("60");
        } else {
            int iD = this.f93974c.d();
            if (iD < 10) {
                sb2.append('0');
            }
            sb2.append(iD);
        }
        int iA = this.f93974c.a();
        if (iA != 0) {
            h0.N0(sb2, iA);
        }
        sb2.append(b());
        net.time4j.tz.k kVarG = g();
        if (!(kVarG instanceof net.time4j.tz.p)) {
            sb2.append('[');
            sb2.append(kVarG.a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}
