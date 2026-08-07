package q1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q1.l0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lq1/l0;", "", "Lk3/p1;", "glowColor", "Lv1/y;", "drawPadding", "<init>", "(JLv1/y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "Lv1/y;", "()Lv1/y;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OverscrollConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long glowColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v1.y drawPadding;

    public /* synthetic */ OverscrollConfiguration(long j11, v1.y yVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, yVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v1.y getDrawPadding() {
        return this.drawPadding;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getGlowColor() {
        return this.glowColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(OverscrollConfiguration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        p013kotlin.jvm.internal.s.i(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) other;
        return p1.r(this.glowColor, overscrollConfiguration.glowColor) && p013kotlin.jvm.internal.s.f(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public int hashCode() {
        return (p1.x(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) p1.y(this.glowColor)) + ", drawPadding=" + this.drawPadding + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private OverscrollConfiguration(long j11, v1.y yVar) {
        this.glowColor = j11;
        this.drawPadding = yVar;
    }

    public /* synthetic */ OverscrollConfiguration(long j11, v1.y yVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? r1.d(4284900966L) : j11, (i11 & 2) != 0 ? androidx.compose.foundation.layout.t.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null) : yVar, null);
    }
}
