package q1;

import android.content.Context;
import android.widget.EdgeEffect;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lq1/a0;", "Landroid/widget/EdgeEffect;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "deltaDistance", "displacement", "Ljn0/h0;", "onPull", "(FF)V", "(F)V", "onRelease", "()V", "", "velocity", "onAbsorb", "(I)V", "delta", "a", Gender.FEMALE, "oppositeReleaseDeltaThreshold", "b", "oppositeReleaseDelta", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float oppositeReleaseDeltaThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float oppositeReleaseDelta;

    public a0(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = w4.a.a(context).O1(w4.h.g(1));
    }

    public final void a(float delta) {
        float f11 = this.oppositeReleaseDelta + delta;
        this.oppositeReleaseDelta = f11;
        if (Math.abs(f11) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int velocity) {
        this.oppositeReleaseDelta = BitmapDescriptorFactory.HUE_RED;
        super.onAbsorb(velocity);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float deltaDistance, float displacement) {
        this.oppositeReleaseDelta = BitmapDescriptorFactory.HUE_RED;
        super.onPull(deltaDistance, displacement);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = BitmapDescriptorFactory.HUE_RED;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float deltaDistance) {
        this.oppositeReleaseDelta = BitmapDescriptorFactory.HUE_RED;
        super.onPull(deltaDistance);
    }
}
