package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/animated/g;", "Lcom/facebook/react/animated/e;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Ljn0/h0;", "a", "", "frameTimeNanos", "b", "(J)V", "", "e", "D", "velocity", "f", "deceleration", "g", "J", "startFrameTimeMillis", "h", "fromValue", IntegerTokenConverter.CONVERTER_KEY, "lastValue", "", "j", "I", "iterations", "k", "currentLoop", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double velocity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double deceleration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long startFrameTimeMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private double fromValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private double lastValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int iterations;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int currentLoop;

    public g(ReadableMap config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.startFrameTimeMillis = -1L;
        this.iterations = 1;
        this.currentLoop = 1;
        a(config);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.velocity = config.getDouble("velocity");
        this.deceleration = config.getDouble("deceleration");
        this.startFrameTimeMillis = -1L;
        this.fromValue = 0.0d;
        this.lastValue = 0.0d;
        int i11 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i11;
        this.currentLoop = 1;
        this.hasFinished = i11 == 0;
    }

    @Override // com.facebook.react.animated.e
    public void b(long frameTimeNanos) {
        w wVar = this.animatedValue;
        if (wVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = frameTimeNanos / ((long) 1000000);
        if (this.startFrameTimeMillis == -1) {
            this.startFrameTimeMillis = j11 - ((long) 16);
            double d11 = this.fromValue;
            if (d11 == this.lastValue) {
                this.fromValue = wVar.nodeValue;
            } else {
                wVar.nodeValue = d11;
            }
            this.lastValue = wVar.nodeValue;
        }
        double d12 = this.fromValue;
        double d13 = this.velocity;
        double d14 = 1;
        double d15 = this.deceleration;
        double dExp = d12 + ((d13 / (d14 - d15)) * (d14 - Math.exp((-(d14 - d15)) * (j11 - this.startFrameTimeMillis))));
        if (Math.abs(this.lastValue - dExp) < 0.1d) {
            int i11 = this.iterations;
            if (i11 != -1 && this.currentLoop >= i11) {
                this.hasFinished = true;
                return;
            } else {
                this.startFrameTimeMillis = -1L;
                this.currentLoop++;
            }
        }
        this.lastValue = dExp;
        wVar.nodeValue = dExp;
    }
}
