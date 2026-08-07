package p025y1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p020r2.l;
import p024x1.d;
import p024x1.j0;
import p024x1.o;
import wn0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ly1/p;", "Lx1/o;", "Ly1/l;", "Lkotlin/Function2;", "Ly1/v;", "", "Ljn0/h0;", "pageContent", "Lkotlin/Function1;", "", Action.KEY_ATTRIBUTE, "pageCount", "<init>", "(Lwn0/r;Lwn0/l;I)V", "a", "Lwn0/r;", "getPageContent", "()Lwn0/r;", "b", "Lwn0/l;", "getKey", "()Lwn0/l;", "c", "I", "getPageCount", "()I", "Lx1/d;", DateTokenConverter.CONVERTER_KEY, "Lx1/d;", "h", "()Lx1/d;", "intervals", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class p extends o<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r<v, Integer, l, Integer, h0> pageContent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Integer, Object> key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d<l> intervals;

    /* JADX WARN: Multi-variable type inference failed */
    public p(r<? super v, ? super Integer, ? super l, ? super Integer, h0> rVar, wn0.l<? super Integer, ? extends Object> lVar, int i11) {
        this.pageContent = rVar;
        this.key = lVar;
        this.pageCount = i11;
        j0 j0Var = new j0();
        j0Var.b(i11, new l(lVar, rVar));
        this.intervals = j0Var;
    }

    @Override // p024x1.o
    public d<l> h() {
        return this.intervals;
    }
}
