package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j3.g;
import j3.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import v3.PointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\bø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00020\u0006*\u00020\bø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Ls1/d0;", "", "Ls1/p;", "orientation", "<init>", "(Ls1/p;)V", "", "touchSlop", "Lj3/g;", "b", "(F)J", DateTokenConverter.CONVERTER_KEY, "(J)F", "c", "Lv3/x;", "dragEvent", "a", "(Lv3/x;F)Lj3/g;", "Ljn0/h0;", "e", "()V", "Ls1/p;", "getOrientation", "()Ls1/p;", "J", "totalPositionChange", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p orientation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long totalPositionChange;

    /* JADX WARN: Multi-variable type inference failed */
    public d0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final long b(float touchSlop) {
        if (this.orientation == null) {
            long j11 = this.totalPositionChange;
            return g.q(this.totalPositionChange, g.s(g.h(j11, g.k(j11)), touchSlop));
        }
        float fD = d(this.totalPositionChange) - (Math.signum(d(this.totalPositionChange)) * touchSlop);
        float fC = c(this.totalPositionChange);
        return this.orientation == p.Horizontal ? h.a(fD, fC) : h.a(fC, fD);
    }

    public final g a(PointerInputChange dragEvent, float touchSlop) {
        long jR = g.r(this.totalPositionChange, g.q(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = jR;
        if ((this.orientation == null ? g.k(jR) : Math.abs(d(jR))) >= touchSlop) {
            return g.d(b(touchSlop));
        }
        return null;
    }

    public final float c(long j11) {
        return this.orientation == p.Horizontal ? g.n(j11) : g.m(j11);
    }

    public final float d(long j11) {
        return this.orientation == p.Horizontal ? g.m(j11) : g.n(j11);
    }

    public final void e() {
        this.totalPositionChange = g.INSTANCE.c();
    }

    public d0(p pVar) {
        this.orientation = pVar;
        this.totalPositionChange = g.INSTANCE.c();
    }

    public /* synthetic */ d0(p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : pVar);
    }
}
