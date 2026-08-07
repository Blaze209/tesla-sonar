package jq;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import w4.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Ljq/a;", "Lu3/a;", "", "consumeHorizontal", "consumeVertical", "Ljq/g;", "pagerState", "<init>", "(ZZLjq/g;)V", "Lj3/g;", "consumed", "available", "Lu3/e;", "source", "n0", "(JJI)J", "Lw4/y;", "V", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Z", "b", "c", "Ljq/g;", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class a implements u3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean consumeHorizontal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean consumeVertical;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PagerState pagerState;

    public a(boolean z11, boolean z12, PagerState pagerState) {
        s.k(pagerState, "pagerState");
        this.consumeHorizontal = z11;
        this.consumeVertical = z12;
        this.pagerState = pagerState;
    }

    @Override // u3.a
    public Object V(long j11, long j12, Continuation<? super y> continuation) {
        return y.b(this.pagerState.k() == BitmapDescriptorFactory.HUE_RED ? b.f(j12, this.consumeHorizontal, this.consumeVertical) : y.INSTANCE.a());
    }

    @Override // u3.a
    public long n0(long consumed, long available, int source) {
        return u3.e.e(source, u3.e.INSTANCE.a()) ? b.e(available, this.consumeHorizontal, this.consumeVertical) : j3.g.INSTANCE.c();
    }
}
