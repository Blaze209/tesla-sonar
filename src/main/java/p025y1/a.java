package p025y1;

import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import java.util.concurrent.CancellationException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p021s1.p;
import u3.e;
import w4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Ly1/a;", "Lu3/a;", "Ly1/c0;", "state", "Ls1/p;", "orientation", "<init>", "(Ly1/c0;Ls1/p;)V", "Lj3/g;", "", "b", "(J)F", "Lw4/y;", "a", "(JLs1/p;)J", "available", "Lu3/e;", "source", "L1", "(JI)J", "consumed", "n0", "(JJI)J", "V", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly1/c0;", "getState", "()Ly1/c0;", "Ls1/p;", "getOrientation", "()Ls1/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a implements u3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p orientation;

    public a(c0 c0Var, p pVar) {
        this.state = c0Var;
        this.orientation = pVar;
    }

    private final float b(long j11) {
        return this.orientation == p.Horizontal ? g.m(j11) : g.n(j11);
    }

    @Override // u3.a
    public long L1(long available, int source) {
        if (!e.e(source, e.INSTANCE.c()) || Math.abs(this.state.w()) <= 1.0E-6d) {
            return g.INSTANCE.c();
        }
        float fW = this.state.w() * this.state.G();
        float pageSize = ((this.state.C().getPageSize() + this.state.C().getPageSpacing()) * (-Math.signum(this.state.w()))) + fW;
        if (this.state.w() > BitmapDescriptorFactory.HUE_RED) {
            pageSize = fW;
            fW = pageSize;
        }
        p pVar = this.orientation;
        p pVar2 = p.Horizontal;
        float fN = -this.state.d(-n.m(pVar == pVar2 ? g.m(available) : g.n(available), fW, pageSize));
        float fM = this.orientation == pVar2 ? fN : g.m(available);
        if (this.orientation != p.Vertical) {
            fN = g.n(available);
        }
        return g.f(available, fM, fN);
    }

    @Override // u3.a
    public Object V(long j11, long j12, Continuation<? super y> continuation) {
        return y.b(a(j12, this.orientation));
    }

    public final long a(long j11, p pVar) {
        return pVar == p.Vertical ? y.e(j11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null) : y.e(j11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1, null);
    }

    @Override // u3.a
    public long n0(long consumed, long available, int source) {
        if (!e.e(source, e.INSTANCE.b()) || b(available) == BitmapDescriptorFactory.HUE_RED) {
            return g.INSTANCE.c();
        }
        throw new CancellationException("Scroll cancelled");
    }
}
