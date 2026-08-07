package p020r2;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
public final class g1 extends u implements l<Long, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l<Long, Object> f106555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(l<? super Long, Object> lVar) {
        super(1);
        this.f106555c = lVar;
    }

    public final Object a(long j11) {
        return this.f106555c.invoke(Long.valueOf(j11 / 1000000));
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ Object invoke(Long l11) {
        return a(l11.longValue());
    }
}
