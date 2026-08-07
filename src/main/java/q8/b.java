package q8;

import t9.j;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
final class b extends t9.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q f104891p;

    public b(String str, q qVar) {
        super(str);
        this.f104891p = qVar;
    }

    @Override // t9.i
    protected j C(byte[] bArr, int i11, boolean z11) {
        if (z11) {
            this.f104891p.reset();
        }
        return this.f104891p.c(bArr, 0, i11);
    }
}
