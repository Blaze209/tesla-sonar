package w1;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lw1/i;", "Lx1/o$a;", "Lkotlin/Function1;", "", "", Action.KEY_ATTRIBUTE, "type", "Lkotlin/Function2;", "Lw1/c;", "Ljn0/h0;", "item", "<init>", "(Lwn0/l;Lwn0/l;Lwn0/r;)V", "a", "Lwn0/l;", "getKey", "()Lwn0/l;", "b", "getType", "c", "Lwn0/r;", "()Lwn0/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements x1.o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Integer, Object> type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.r<c, Integer, p020r2.l, Integer, h0> item;

    /* JADX WARN: Multi-variable type inference failed */
    public i(wn0.l<? super Integer, ? extends Object> lVar, wn0.l<? super Integer, ? extends Object> lVar2, wn0.r<? super c, ? super Integer, ? super p020r2.l, ? super Integer, h0> rVar) {
        this.key = lVar;
        this.type = lVar2;
        this.item = rVar;
    }

    public final wn0.r<c, Integer, p020r2.l, Integer, h0> a() {
        return this.item;
    }

    @Override // x1.o.a
    public wn0.l<Integer, Object> getKey() {
        return this.key;
    }

    @Override // x1.o.a
    public wn0.l<Integer, Object> getType() {
        return this.type;
    }
}
