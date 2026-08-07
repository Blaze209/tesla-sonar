package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/facebook/react/animated/j;", "Lcom/facebook/react/animated/e;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Ljn0/h0;", "a", "", "frameTimeNanos", "b", "(J)V", "e", "J", "startFrameTimeNanos", "", "f", "[D", "frames", "", "g", "D", "toValue", "h", "fromValue", "", IntegerTokenConverter.CONVERTER_KEY, "I", "iterations", "j", "currentLoop", "k", "logCount", "l", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long startFrameTimeNanos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double[] frames;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private double toValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private double fromValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int iterations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int currentLoop;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int logCount;

    public j(ReadableMap config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.startFrameTimeNanos = -1L;
        this.frames = new double[0];
        this.iterations = 1;
        this.currentLoop = 1;
        a(config);
    }

    @Override // com.facebook.react.animated.e
    public void a(ReadableMap config) {
        int size;
        p013kotlin.jvm.internal.s.k(config, "config");
        ReadableArray array = config.getArray("frames");
        if (array != null && this.frames.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = array.getDouble(i11);
            }
            this.frames = dArr;
        }
        this.toValue = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i12 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.iterations = i12;
        this.currentLoop = 1;
        this.hasFinished = i12 == 0;
        this.startFrameTimeNanos = -1L;
    }

    @Override // com.facebook.react.animated.e
    public void b(long frameTimeNanos) {
        double d11;
        w wVar = this.animatedValue;
        if (wVar == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.startFrameTimeNanos < 0) {
            this.startFrameTimeNanos = frameTimeNanos;
            if (this.currentLoop == 1) {
                this.fromValue = wVar.nodeValue;
            }
        }
        int iRound = (int) Math.round(((frameTimeNanos - this.startFrameTimeNanos) / ((long) 1000000)) / 16.666666666666668d);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + frameTimeNanos + " and mStartFrameTimeNanos " + this.startFrameTimeNanos;
            if (ln.a.DEBUG) {
                throw new IllegalStateException(str.toString());
            }
            if (this.logCount < 100) {
                qk.a.I("ReactNative", str);
                this.logCount++;
                return;
            }
            return;
        }
        if (this.hasFinished) {
            return;
        }
        double[] dArr = this.frames;
        if (iRound >= dArr.length - 1) {
            int i11 = this.iterations;
            if (i11 == -1 || this.currentLoop < i11) {
                double d12 = this.fromValue;
                d11 = d12 + (dArr[dArr.length - 1] * (this.toValue - d12));
                this.startFrameTimeNanos = -1L;
                this.currentLoop++;
            } else {
                d11 = this.toValue;
                this.hasFinished = true;
            }
        } else {
            double d13 = this.fromValue;
            d11 = d13 + (dArr[iRound] * (this.toValue - d13));
        }
        wVar.nodeValue = d11;
    }
}
