package p025y1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p019p1.i;
import p021s1.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ly1/j;", "Ls1/d;", "Ly1/c0;", "pagerState", "defaultBringIntoViewSpec", "<init>", "(Ly1/c0;Ls1/d;)V", "", "proposedOffsetMove", "c", "(F)F", "offset", "size", "containerSize", "b", "(FFF)F", "Ly1/c0;", "getPagerState", "()Ly1/c0;", "Ls1/d;", "getDefaultBringIntoViewSpec", "()Ls1/d;", "Lp1/i;", DateTokenConverter.CONVERTER_KEY, "Lp1/i;", "a", "()Lp1/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 pagerState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d defaultBringIntoViewSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i<Float> scrollAnimationSpec;

    public j(c0 c0Var, d dVar) {
        this.pagerState = c0Var;
        this.defaultBringIntoViewSpec = dVar;
        this.scrollAnimationSpec = dVar.a();
    }

    private final float c(float proposedOffsetMove) {
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1);
        while (proposedOffsetMove > BitmapDescriptorFactory.HUE_RED && firstVisiblePageOffset < proposedOffsetMove) {
            firstVisiblePageOffset += this.pagerState.H();
        }
        while (proposedOffsetMove < BitmapDescriptorFactory.HUE_RED && firstVisiblePageOffset > proposedOffsetMove) {
            firstVisiblePageOffset -= this.pagerState.H();
        }
        return firstVisiblePageOffset;
    }

    @Override // p021s1.d
    public i<Float> a() {
        return this.scrollAnimationSpec;
    }

    @Override // p021s1.d
    public float b(float offset, float size, float containerSize) {
        float fB = this.defaultBringIntoViewSpec.b(offset, size, containerSize);
        if (fB != BitmapDescriptorFactory.HUE_RED) {
            return c(fB);
        }
        if (this.pagerState.getFirstVisiblePageOffset() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1.0f);
        if (this.pagerState.B()) {
            firstVisiblePageOffset += this.pagerState.H();
        }
        return n.m(firstVisiblePageOffset, -containerSize, containerSize);
    }
}
