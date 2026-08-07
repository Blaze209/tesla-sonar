package p025y1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p020r2.b2;
import p020r2.e3;
import p020r2.l1;
import p020r2.m1;
import p024x1.b0;
import p024x1.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010\u001dR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010\u001aR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0017\u00103\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Ly1/x;", "", "", "currentPage", "", "currentPageOffsetFraction", "Ly1/c0;", "state", "<init>", "(IFLy1/c0;)V", "page", "offsetFraction", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(IF)V", "Ly1/u;", "measureResult", "k", "(Ly1/u;)V", "index", "f", "Ly1/r;", "itemProvider", "e", "(Ly1/r;I)I", "j", "(F)V", "delta", "a", "(I)V", "Ly1/c0;", "getState", "()Ly1/c0;", "<set-?>", "b", "Lr2/m1;", "()I", "g", "c", "Lr2/l1;", "()F", "h", "", DateTokenConverter.CONVERTER_KEY, "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownCurrentPageKey", "Lx1/b0;", "Lx1/b0;", "()Lx1/b0;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m1 currentPage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l1 currentPageOffsetFraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownCurrentPageKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b0 nearestRangeState;

    public x(int i11, float f11, c0 c0Var) {
        this.state = c0Var;
        this.currentPage = e3.a(i11);
        this.currentPageOffsetFraction = b2.a(f11);
        this.nearestRangeState = new b0(i11, 30, 100);
    }

    private final void g(int i11) {
        this.currentPage.a(i11);
    }

    private final void h(float f11) {
        this.currentPageOffsetFraction.r(f11);
    }

    private final void i(int page, float offsetFraction) {
        g(page);
        this.nearestRangeState.o(page);
        h(offsetFraction);
    }

    public final void a(int delta) {
        h(c() + (this.state.H() == 0 ? BitmapDescriptorFactory.HUE_RED : delta / this.state.H()));
    }

    public final int b() {
        return this.currentPage.b();
    }

    public final float c() {
        return this.currentPageOffsetFraction.d();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int e(r itemProvider, int index) {
        int iA = u.a(itemProvider, this.lastKnownCurrentPageKey, index);
        if (index != iA) {
            g(iA);
            this.nearestRangeState.o(index);
        }
        return iA;
    }

    public final void f(int index, float offsetFraction) {
        i(index, offsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final void j(float offsetFraction) {
        h(offsetFraction);
    }

    public final void k(u measureResult) {
        e currentPage = measureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String() : null;
        if (this.hadFirstNotEmptyLayout || !measureResult.l().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            e currentPage2 = measureResult.getCurrentPage();
            i(currentPage2 != null ? currentPage2.getIndex() : 0, measureResult.getCurrentPageOffsetFraction());
        }
    }
}
