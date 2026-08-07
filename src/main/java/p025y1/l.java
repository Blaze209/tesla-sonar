package p025y1;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import p013kotlin.Metadata;
import p024x1.o;
import wn0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly1/l;", "Lx1/o$a;", "Lkotlin/Function1;", "", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "Ly1/v;", "Ljn0/h0;", "item", "<init>", "(Lwn0/l;Lwn0/r;)V", "a", "Lwn0/l;", "getKey", "()Lwn0/l;", "b", "Lwn0/r;", "()Lwn0/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r<v, Integer, p020r2.l, Integer, h0> item;

    /* JADX WARN: Multi-variable type inference failed */
    public l(wn0.l<? super Integer, ? extends Object> lVar, r<? super v, ? super Integer, ? super p020r2.l, ? super Integer, h0> rVar) {
        this.key = lVar;
        this.item = rVar;
    }

    public final r<v, Integer, p020r2.l, Integer, h0> a() {
        return this.item;
    }

    @Override // x1.o.a
    public wn0.l<Integer, Object> getKey() {
        return this.key;
    }
}
