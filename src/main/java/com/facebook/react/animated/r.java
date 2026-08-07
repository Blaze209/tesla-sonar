package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002\u0012\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001cR\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u001cR\u0014\u0010<\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010;R\u0014\u0010=\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010;¨\u0006?"}, d2 = {"Lcom/facebook/react/animated/r;", "Lcom/facebook/react/animated/e;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/animated/r$b;", "state", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/animated/r$b;)D", "realDeltaTime", "Ljn0/h0;", "c", "(D)V", "a", "", "frameTimeNanos", "b", "(J)V", "e", "J", "lastTime", "", "f", "Z", "springStarted", "g", "D", "springStiffness", "h", "springDamping", IntegerTokenConverter.CONVERTER_KEY, "springMass", "j", "initialVelocity", "k", "overshootClampingEnabled", "l", "Lcom/facebook/react/animated/r$b;", "currentState", "m", "startValue", "n", "endValue", "o", "restSpeedThreshold", "p", "displacementFromRestThreshold", "q", "timeAccumulator", "", "r", "I", "iterations", "s", "currentLoop", "t", "originalValue", "()Z", "isAtRest", "isOvershooting", "u", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean springStarted;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private double springStiffness;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private double springDamping;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private double springMass;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private double initialVelocity;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean overshootClampingEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final PhysicsState currentState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private double startValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private double endValue;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private double restSpeedThreshold;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private double displacementFromRestThreshold;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private double timeAccumulator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int iterations;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int currentLoop;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private double originalValue;

    /* JADX INFO: renamed from: com.facebook.react.animated.r$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/animated/r$b;", "", "", "position", "velocity", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "c", "(D)V", "b", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class PhysicsState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private double position;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private double velocity;

        public PhysicsState(double d11, double d12) {
            this.position = d11;
            this.velocity = d12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getVelocity() {
            return this.velocity;
        }

        public final void c(double d11) {
            this.position = d11;
        }

        public final void d(double d11) {
            this.velocity = d11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhysicsState)) {
                return false;
            }
            PhysicsState physicsState = (PhysicsState) other;
            return Double.compare(this.position, physicsState.position) == 0 && Double.compare(this.velocity, physicsState.velocity) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.position) * 31) + Double.hashCode(this.velocity);
        }

        public String toString() {
            return "PhysicsState(position=" + this.position + ", velocity=" + this.velocity + ")";
        }

        public /* synthetic */ PhysicsState(double d11, double d12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12);
        }
    }

    public r(ReadableMap config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        PhysicsState physicsState = new PhysicsState(0.0d, 0.0d, 3, null);
        this.currentState = physicsState;
        physicsState.d(config.getDouble("initialVelocity"));
        a(config);
    }

    private final void c(double realDeltaTime) {
        double dSin;
        double dSin2;
        if (e()) {
            return;
        }
        this.timeAccumulator += realDeltaTime <= 0.064d ? realDeltaTime : 0.064d;
        double d11 = this.springDamping;
        double d12 = this.springMass;
        double d13 = this.springStiffness;
        double d14 = -this.initialVelocity;
        double dSqrt = d11 / (((double) 2) * Math.sqrt(d13 * d12));
        double dSqrt2 = Math.sqrt(d13 / d12);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d15 = this.endValue - this.startValue;
        double d16 = this.timeAccumulator;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d16);
            double d17 = dSqrt2 * dSqrt;
            double d18 = d14 + (d17 * d15);
            double d19 = d16 * dSqrt3;
            dSin2 = this.endValue - ((((d18 / dSqrt3) * Math.sin(d19)) + (Math.cos(d19) * d15)) * dExp);
            dSin = ((d17 * dExp) * (((Math.sin(d19) * d18) / dSqrt3) + (Math.cos(d19) * d15))) - (dExp * ((Math.cos(d19) * d18) - ((dSqrt3 * d15) * Math.sin(d19))));
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d16);
            double d21 = this.endValue - (((((dSqrt2 * d15) + d14) * d16) + d15) * dExp2);
            dSin = dExp2 * ((d14 * ((d16 * dSqrt2) - ((double) 1))) + (d16 * d15 * dSqrt2 * dSqrt2));
            dSin2 = d21;
        }
        this.currentState.c(dSin2);
        this.currentState.d(dSin);
        if (e() || (this.overshootClampingEnabled && f())) {
            if (this.springStiffness > 0.0d) {
                double d22 = this.endValue;
                this.startValue = d22;
                this.currentState.c(d22);
            } else {
                double position = this.currentState.getPosition();
                this.endValue = position;
                this.startValue = position;
            }
            this.currentState.d(0.0d);
        }
    }

    private final double d(PhysicsState state) {
        return Math.abs(this.endValue - state.getPosition());
    }

    private final boolean e() {
        if (Math.abs(this.currentState.getVelocity()) <= this.restSpeedThreshold) {
            return d(this.currentState) <= this.displacementFromRestThreshold || this.springStiffness == 0.0d;
        }
        return false;
    }

    private final boolean f() {
        if (this.springStiffness <= 0.0d) {
            return false;
        }
        if (this.startValue >= this.endValue || this.currentState.getPosition() <= this.endValue) {
            return this.startValue > this.endValue && this.currentState.getPosition() < this.endValue;
        }
        return true;
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.springStiffness = config.getDouble("stiffness");
        this.springDamping = config.getDouble("damping");
        this.springMass = config.getDouble("mass");
        this.initialVelocity = this.currentState.getVelocity();
        this.endValue = config.getDouble("toValue");
        this.restSpeedThreshold = config.getDouble("restSpeedThreshold");
        this.displacementFromRestThreshold = config.getDouble("restDisplacementThreshold");
        this.overshootClampingEnabled = config.getBoolean("overshootClamping");
        int i11 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i11;
        this.hasFinished = i11 == 0;
        this.currentLoop = 0;
        this.timeAccumulator = 0.0d;
        this.springStarted = false;
    }

    @Override // com.facebook.react.animated.e
    public void b(long frameTimeNanos) {
        w wVar = this.animatedValue;
        if (wVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = frameTimeNanos / ((long) 1000000);
        if (!this.springStarted) {
            if (this.currentLoop == 0) {
                this.originalValue = wVar.nodeValue;
                this.currentLoop = 1;
            }
            this.currentState.c(wVar.nodeValue);
            this.startValue = this.currentState.getPosition();
            this.lastTime = j11;
            this.timeAccumulator = 0.0d;
            this.springStarted = true;
        }
        c((j11 - this.lastTime) / 1000.0d);
        this.lastTime = j11;
        wVar.nodeValue = this.currentState.getPosition();
        if (e()) {
            int i11 = this.iterations;
            if (i11 != -1 && this.currentLoop >= i11) {
                this.hasFinished = true;
                return;
            }
            this.springStarted = false;
            wVar.nodeValue = this.originalValue;
            this.currentLoop++;
        }
    }
}
