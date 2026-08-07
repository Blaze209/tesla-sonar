package net.time4j.tz.model;

import java.io.Serializable;
import net.time4j.c0;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
@net.time4j.format.c("iso8601")
public class g extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient byte f94801e;

    protected g(c0 c0Var, int i11, i iVar, int i12) {
        super(i11, iVar, i12);
        this.f94801e = (byte) c0Var.getValue();
    }

    @Override // net.time4j.tz.model.d
    protected String a() {
        return "iso8601";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.tz.model.d
    public final g0 b(int i11) {
        return (g0) j(i11).H(c(), net.time4j.f.DAYS);
    }

    @Override // net.time4j.tz.model.d
    protected int h(long j11) {
        return net.time4j.base.b.i(net.time4j.base.b.l(j11));
    }

    @Override // net.time4j.tz.model.d
    protected int i(net.time4j.base.a aVar) {
        return aVar.b();
    }

    protected g0 j(int i11) {
        throw null;
    }

    byte k() {
        return this.f94801e;
    }

    protected boolean l(g gVar) {
        return f().equals(gVar.f()) && c() == gVar.c() && d() == gVar.d() && e() == gVar.e() && this.f94801e == gVar.f94801e;
    }
}
