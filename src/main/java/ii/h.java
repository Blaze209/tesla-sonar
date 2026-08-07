package ii;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lii/h;", "Lii/r;", "left", "Lii/r$c;", "element", "<init>", "(Lii/r;Lii/r$c;)V", "E", "Lii/r$d;", Action.KEY_ATTRIBUTE, "a", "(Lii/r$d;)Lii/r$c;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "b", "(Lii/r$d;)Lii/r;", "c", "Lii/r;", DateTokenConverter.CONVERTER_KEY, "Lii/r$c;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r left;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r.c element;

    public h(r left, r.c element) {
        p013kotlin.jvm.internal.s.k(left, "left");
        p013kotlin.jvm.internal.s.k(element, "element");
        this.left = left;
        this.element = element;
    }

    @Override // ii.r
    public <E extends r.c> E a(r.d<E> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        h hVar = this;
        while (true) {
            E e11 = (E) hVar.element.a(key);
            if (e11 != null) {
                return e11;
            }
            r rVar = hVar.left;
            if (!(rVar instanceof h)) {
                return (E) rVar.a(key);
            }
            hVar = (h) rVar;
        }
    }

    @Override // ii.r
    public r b(r.d<?> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        if (this.element.a(key) != null) {
            return this.left;
        }
        r rVarB = this.left.b(key);
        if (rVarB == this.left) {
            return this;
        }
        return rVarB == m.f78152c ? this.element : new h(rVarB, this.element);
    }

    @Override // ii.r
    public r c(r rVar) {
        return r.b.a(this, rVar);
    }

    @Override // ii.r
    public <R> R fold(R initial, wn0.p<? super R, ? super r.c, ? extends R> operation) {
        p013kotlin.jvm.internal.s.k(operation, "operation");
        return operation.invoke((Object) this.left.fold(initial, operation), this.element);
    }
}
