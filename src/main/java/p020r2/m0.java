package p020r2;

import p013kotlin.Metadata;
import wn0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr2/m0;", "T", "Lr2/g2;", "Lr2/m3;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lr2/m3;Lwn0/a;)V", "value", "Lr2/h2;", "c", "(Ljava/lang/Object;)Lr2/h2;", "b", "Lr2/m3;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m0<T> extends g2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m3<T> policy;

    public m0(m3<T> m3Var, a<? extends T> aVar) {
        super(aVar);
        this.policy = m3Var;
    }

    @Override // p020r2.g2
    public h2<T> c(T value) {
        return new h2<>(this, value, value == null, this.policy, null, null, true);
    }
}
