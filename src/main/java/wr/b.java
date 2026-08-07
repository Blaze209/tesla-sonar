package wr;

import java.nio.ByteBuffer;
import java.util.Arrays;
import ts.d0;
import ur.d;
import ur.g;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b extends g {
    @Override // ur.g
    protected ur.a b(d dVar, ByteBuffer byteBuffer) {
        return new ur.a(c(new d0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(d0 d0Var) {
        return new a((String) ts.a.e(d0Var.B()), (String) ts.a.e(d0Var.B()), d0Var.A(), d0Var.A(), Arrays.copyOfRange(d0Var.e(), d0Var.f(), d0Var.g()));
    }
}
