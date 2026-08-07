package w3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w4.y;
import w4.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u0012\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R(\u0010\u001e\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lw3/d;", "", "<init>", "()V", "", "timeMillis", "Lj3/g;", "position", "Ljn0/h0;", "a", "(JJ)V", "Lw4/y;", "maximumVelocity", "b", "(J)J", "e", "Lw3/c$a;", "Lw3/c$a;", "getStrategy$annotations", "strategy", "Lw3/c;", "Lw3/c;", "xVelocityTracker", "c", "yVelocityTracker", DateTokenConverter.CONVERTER_KEY, "J", "()J", "f", "(J)V", "currentPointerPositionAccumulator", "g", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c.a strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c xVelocityTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c yVelocityTracker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public d() {
        c.a aVar = e.h() ? c.a.Impulse : c.a.Lsq2;
        this.strategy = aVar;
        boolean z11 = false;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.xVelocityTracker = new c(z11, aVar, i11, defaultConstructorMarker);
        this.yVelocityTracker = new c(z11, aVar, i11, defaultConstructorMarker);
        this.currentPointerPositionAccumulator = g.INSTANCE.c();
    }

    public final void a(long timeMillis, long position) {
        this.xVelocityTracker.a(timeMillis, g.m(position));
        this.yVelocityTracker.a(timeMillis, g.n(position));
    }

    public final long b(long maximumVelocity) {
        if (!(y.h(maximumVelocity) > BitmapDescriptorFactory.HUE_RED && y.i(maximumVelocity) > BitmapDescriptorFactory.HUE_RED)) {
            y3.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(maximumVelocity)));
        }
        return z.a(this.xVelocityTracker.d(y.h(maximumVelocity)), this.yVelocityTracker.d(y.i(maximumVelocity)));
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void e() {
        this.xVelocityTracker.e();
        this.yVelocityTracker.e();
        this.lastMoveEventTimeStamp = 0L;
    }

    public final void f(long j11) {
        this.currentPointerPositionAccumulator = j11;
    }

    public final void g(long j11) {
        this.lastMoveEventTimeStamp = j11;
    }
}
