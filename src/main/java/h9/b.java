package h9;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p7.f0;
import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f9.c {
    @Override // f9.c
    protected f0 b(f9.b bVar, ByteBuffer byteBuffer) {
        return new f0(c(new c0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(c0 c0Var) {
        return new a((String) s7.a.f(c0Var.G()), (String) s7.a.f(c0Var.G()), c0Var.F(), c0Var.F(), Arrays.copyOfRange(c0Var.f(), c0Var.g(), c0Var.j()));
    }
}
