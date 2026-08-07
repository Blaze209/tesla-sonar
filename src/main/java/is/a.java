package is;

import gs.h;
import gs.i;
import java.util.List;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f81813o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        d0 d0Var = new d0(list.get(0));
        this.f81813o = new b(d0Var.N(), d0Var.N());
    }

    @Override // gs.h
    protected i A(byte[] bArr, int i11, boolean z11) {
        if (z11) {
            this.f81813o.r();
        }
        return new c(this.f81813o.b(bArr, i11));
    }
}
