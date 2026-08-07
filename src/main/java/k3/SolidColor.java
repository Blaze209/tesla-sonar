package k3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k3.h4, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lk3/h4;", "Lk3/h1;", "Lk3/p1;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lj3/m;", "size", "Lk3/r3;", "p", "", "alpha", "Ljn0/h0;", "a", "(JLk3/r3;F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "b", "()J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SolidColor extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ SolidColor(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // k3.h1
    public void a(long size, r3 p11, float alpha) {
        long jP;
        p11.a(1.0f);
        if (alpha == 1.0f) {
            jP = this.value;
        } else {
            long j11 = this.value;
            jP = p1.p(j11, p1.s(j11) * alpha, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        }
        p11.s(jP);
        if (p11.x() != null) {
            p11.F(null);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SolidColor) && p1.r(this.value, ((SolidColor) other).value);
    }

    public int hashCode() {
        return p1.x(this.value);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) p1.y(this.value)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private SolidColor(long j11) {
        super(null);
        this.value = j11;
    }
}
