package w8;

import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes3.dex */
public interface p {
    void a(long j11, long j12);

    void e(r rVar);

    int h(q qVar, i0 i0Var);

    default List<n0> j() {
        return com.google.common.collect.x.r();
    }

    boolean l(q qVar);

    void release();

    @SideEffectFree
    default p i() {
        return this;
    }
}
