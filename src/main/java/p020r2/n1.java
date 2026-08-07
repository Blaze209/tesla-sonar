package p020r2;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lr2/n1;", "Lr2/e1;", "Lr2/p1;", "", "value", "getValue", "()Ljava/lang/Long;", "h", "(J)V", "c", "()J", "z", "longValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n1 extends e1, p1<Long> {
    @Override // p020r2.e1
    long c();

    default void h(long j11) {
        z(j11);
    }

    @Override // p020r2.p1
    /* bridge */ /* synthetic */ default void setValue(Long l11) {
        h(l11.longValue());
    }

    void z(long j11);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p020r2.y3
    default Long getValue() {
        return Long.valueOf(c());
    }
}
