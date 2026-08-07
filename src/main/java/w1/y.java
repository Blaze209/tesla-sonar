package w1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p020r2.e3;
import p020r2.m1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Lw1/y;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "Ljn0/h0;", "g", "Lw1/r;", "measureResult", "h", "(Lw1/r;)V", IntegerTokenConverter.CONVERTER_KEY, "(I)V", DateTokenConverter.CONVERTER_KEY, "Lw1/l;", "itemProvider", "j", "(Lw1/l;I)I", "<set-?>", "a", "Lr2/m1;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Lx1/b0;", "Lx1/b0;", "()Lx1/b0;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m1 scrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p024x1.b0 nearestRangeState;

    public y(int i11, int i12) {
        this.index = e3.a(i11);
        this.scrollOffset = e3.a(i12);
        this.nearestRangeState = new p024x1.b0(i11, 30, 100);
    }

    private final void f(int i11) {
        this.scrollOffset.a(i11);
    }

    private final void g(int index, int scrollOffset) {
        if (index >= BitmapDescriptorFactory.HUE_RED) {
            e(index);
            this.nearestRangeState.o(index);
            f(scrollOffset);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + index + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    public final int a() {
        return this.index.b();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p024x1.b0 getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int c() {
        return this.scrollOffset.b();
    }

    public final void d(int index, int scrollOffset) {
        g(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void e(int i11) {
        this.index.a(i11);
    }

    public final void h(r measureResult) {
        s firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset >= BitmapDescriptorFactory.HUE_RED) {
                s firstVisibleItem2 = measureResult.getFirstVisibleItem();
                g(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
            }
        }
    }

    public final void i(int scrollOffset) {
        if (scrollOffset >= BitmapDescriptorFactory.HUE_RED) {
            f(scrollOffset);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + scrollOffset + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final int j(l itemProvider, int index) {
        int iA = p024x1.u.a(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iA) {
            e(iA);
            this.nearestRangeState.o(index);
        }
        return iA;
    }
}
