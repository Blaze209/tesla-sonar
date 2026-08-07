package m9;

import java.nio.ByteBuffer;
import p7.f0;
import s7.b0;
import s7.c0;
import s7.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f91591a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f91592b = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i0 f91593c;

    @Override // f9.c
    protected f0 b(f9.b bVar, ByteBuffer byteBuffer) {
        f0.a eVar;
        i0 i0Var = this.f91593c;
        if (i0Var == null || bVar.f64593j != i0Var.f()) {
            i0 i0Var2 = new i0(bVar.f9288f);
            this.f91593c = i0Var2;
            i0Var2.a(bVar.f9288f - bVar.f64593j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f91591a.Z(bArrArray, iLimit);
        this.f91592b.o(bArrArray, iLimit);
        this.f91592b.r(39);
        long jH = (((long) this.f91592b.h(1)) << 32) | ((long) this.f91592b.h(32));
        this.f91592b.r(20);
        int iH = this.f91592b.h(12);
        int iH2 = this.f91592b.h(8);
        this.f91591a.c0(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.a(this.f91591a, iH, jH);
        } else if (iH2 == 4) {
            eVar = f.a(this.f91591a);
        } else if (iH2 != 5) {
            eVar = iH2 != 6 ? null : g.a(this.f91591a, jH, this.f91593c);
        } else {
            eVar = d.a(this.f91591a, jH, this.f91593c);
        }
        return eVar == null ? new f0(new f0.a[0]) : new f0(eVar);
    }
}
