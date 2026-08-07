package com.fourthline.core.internal.devicedata;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.h1;
import vo0.t;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#Jd\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010!R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010#¨\u0006B"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionFrame;", "", "", "", "attitude", "rotationRate", "gravity", "acceleration", "heading", "", "timestamp", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DJ)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DJLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_core_release", "(Lcom/fourthline/core/internal/devicedata/MotionFrame;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "()D", "component6", "()J", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DJ)Lcom/fourthline/core/internal/devicedata/MotionFrame;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAttitude", "b", "getRotationRate", "c", "getGravity", DateTokenConverter.CONVERTER_KEY, "getAcceleration", "e", "D", "getHeading", "f", "J", "getTimestamp", "getTimestamp$annotations", "()V", "Companion", "$serializer", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class MotionFrame {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d[] f24119g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List attitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List rotationRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List gravity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List acceleration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double heading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionFrame$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "serializer", "()Lro0/d;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<MotionFrame> serializer() {
            return MotionFrame$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        t tVar = t.f119690a;
        f24119g = new d[]{new e(tVar), new e(tVar), new e(tVar), new e(tVar), null, new MotionTimestampSerializer()};
    }

    public /* synthetic */ MotionFrame(int i11, List list, List list2, List list3, List list4, double d11, long j11, v1 v1Var) {
        if (63 != (i11 & 63)) {
            h1.b(i11, 63, MotionFrame$$serializer.INSTANCE.getDescriptor());
        }
        this.attitude = list;
        this.rotationRate = list2;
        this.gravity = list3;
        this.acceleration = list4;
        this.heading = d11;
        this.timestamp = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MotionFrame copy$default(MotionFrame motionFrame, List list, List list2, List list3, List list4, double d11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = motionFrame.attitude;
        }
        if ((i11 & 2) != 0) {
            list2 = motionFrame.rotationRate;
        }
        if ((i11 & 4) != 0) {
            list3 = motionFrame.gravity;
        }
        if ((i11 & 8) != 0) {
            list4 = motionFrame.acceleration;
        }
        if ((i11 & 16) != 0) {
            d11 = motionFrame.heading;
        }
        if ((i11 & 32) != 0) {
            j11 = motionFrame.timestamp;
        }
        long j12 = j11;
        double d12 = d11;
        return motionFrame.copy(list, list2, list3, list4, d12, j12);
    }

    @p(with = MotionTimestampSerializer.class)
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_core_release(MotionFrame self, uo0.d output, f serialDesc) {
        d[] dVarArr = f24119g;
        output.D(serialDesc, 0, dVarArr[0], self.attitude);
        output.D(serialDesc, 1, dVarArr[1], self.rotationRate);
        output.D(serialDesc, 2, dVarArr[2], self.gravity);
        output.D(serialDesc, 3, dVarArr[3], self.acceleration);
        output.k(serialDesc, 4, self.heading);
        output.D(serialDesc, 5, dVarArr[5], Long.valueOf(self.timestamp));
    }

    public final List<Double> component1() {
        return this.attitude;
    }

    public final List<Double> component2() {
        return this.rotationRate;
    }

    public final List<Double> component3() {
        return this.gravity;
    }

    public final List<Double> component4() {
        return this.acceleration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final MotionFrame copy(List<Double> attitude, List<Double> rotationRate, List<Double> gravity, List<Double> acceleration, double heading, long timestamp) {
        s.k(attitude, "attitude");
        s.k(rotationRate, "rotationRate");
        s.k(gravity, "gravity");
        s.k(acceleration, "acceleration");
        return new MotionFrame(attitude, rotationRate, gravity, acceleration, heading, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionFrame)) {
            return false;
        }
        MotionFrame motionFrame = (MotionFrame) other;
        return s.f(this.attitude, motionFrame.attitude) && s.f(this.rotationRate, motionFrame.rotationRate) && s.f(this.gravity, motionFrame.gravity) && s.f(this.acceleration, motionFrame.acceleration) && Double.compare(this.heading, motionFrame.heading) == 0 && this.timestamp == motionFrame.timestamp;
    }

    public final List<Double> getAcceleration() {
        return this.acceleration;
    }

    public final List<Double> getAttitude() {
        return this.attitude;
    }

    public final List<Double> getGravity() {
        return this.gravity;
    }

    public final double getHeading() {
        return this.heading;
    }

    public final List<Double> getRotationRate() {
        return this.rotationRate;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((this.attitude.hashCode() * 31) + this.rotationRate.hashCode()) * 31) + this.gravity.hashCode()) * 31) + this.acceleration.hashCode()) * 31) + Double.hashCode(this.heading)) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "MotionFrame(attitude=" + this.attitude + ", rotationRate=" + this.rotationRate + ", gravity=" + this.gravity + ", acceleration=" + this.acceleration + ", heading=" + this.heading + ", timestamp=" + this.timestamp + ")";
    }

    public MotionFrame(List<Double> attitude, List<Double> rotationRate, List<Double> gravity, List<Double> acceleration, double d11, long j11) {
        s.k(attitude, "attitude");
        s.k(rotationRate, "rotationRate");
        s.k(gravity, "gravity");
        s.k(acceleration, "acceleration");
        this.attitude = attitude;
        this.rotationRate = rotationRate;
        this.gravity = gravity;
        this.acceleration = acceleration;
        this.heading = d11;
        this.timestamp = j11;
    }
}
