package bs;

import java.nio.ByteBuffer;
import ts.c0;
import ts.d0;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c extends ur.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f18017a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f18018b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0 f18019c;

    @Override // ur.g
    protected ur.a b(ur.d dVar, ByteBuffer byteBuffer) {
        ur.a.b eVar;
        m0 m0Var = this.f18019c;
        if (m0Var == null || dVar.f116511i != m0Var.e()) {
            m0 m0Var2 = new m0(dVar.f39722e);
            this.f18019c = m0Var2;
            m0Var2.a(dVar.f39722e - dVar.f116511i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f18017a.S(bArrArray, iLimit);
        this.f18018b.o(bArrArray, iLimit);
        this.f18018b.r(39);
        long jH = (((long) this.f18018b.h(1)) << 32) | ((long) this.f18018b.h(32));
        this.f18018b.r(20);
        int iH = this.f18018b.h(12);
        int iH2 = this.f18018b.h(8);
        this.f18017a.V(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.a(this.f18017a, iH, jH);
        } else if (iH2 == 4) {
            eVar = f.a(this.f18017a);
        } else if (iH2 != 5) {
            eVar = iH2 != 6 ? null : g.a(this.f18017a, jH, this.f18019c);
        } else {
            eVar = d.a(this.f18017a, jH, this.f18019c);
        }
        return eVar == null ? new ur.a(new ur.a.b[0]) : new ur.a(eVar);
    }
}
