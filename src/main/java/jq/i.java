package jq;

import a3.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "initialPage", "Ljq/g;", "a", "(ILr2/l;II)Ljq/g;", "pager_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljq/g;", "b", "()Ljq/g;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<PagerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f84237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(0);
            this.f84237c = i11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PagerState invoke() {
            return new PagerState(this.f84237c);
        }
    }

    @jn0.e
    public static final PagerState a(int i11, l lVar, int i12, int i13) {
        lVar.H(1352421093);
        boolean z11 = true;
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if (o.J()) {
            o.S(1352421093, i12, -1, "com.google.accompanist.pager.rememberPagerState (PagerState.kt:66)");
        }
        Object[] objArr = new Object[0];
        j<PagerState, ?> jVarA = PagerState.INSTANCE.a();
        lVar.H(-1078956111);
        if ((((i12 & 14) ^ 6) <= 4 || !lVar.r(i11)) && (i12 & 6) != 4) {
            z11 = false;
        }
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = new a(i11);
            lVar.B(objI);
        }
        lVar.T();
        PagerState pagerState = (PagerState) a3.b.c(objArr, jVarA, null, (wn0.a) objI, lVar, 72, 4);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return pagerState;
    }
}
