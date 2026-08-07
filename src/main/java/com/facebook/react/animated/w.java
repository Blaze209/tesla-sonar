package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/facebook/react/animated/w;", "Lcom/facebook/react/animated/b;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "", "l", "()D", "", "k", "()Ljava/lang/Object;", "Ljn0/h0;", "j", "()V", IntegerTokenConverter.CONVERTER_KEY, "m", "Lcom/facebook/react/animated/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "n", "(Lcom/facebook/react/animated/c;)V", "", "e", "()Ljava/lang/String;", "f", "D", "nodeValue", "g", "offset", "h", "Lcom/facebook/react/animated/c;", "valueListener", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class w extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public double nodeValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public double offset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private c valueListener;

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.animated.b
    public String e() {
        return "ValueAnimatedNode[" + this.tag + "]: value: " + this.nodeValue + " offset: " + this.offset;
    }

    public final void i() {
        this.offset += this.nodeValue;
        this.nodeValue = 0.0d;
    }

    public final void j() {
        this.nodeValue += this.offset;
        this.offset = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.offset + this.nodeValue)) {
            h();
        }
        return this.offset + this.nodeValue;
    }

    public final void m() {
        c cVar = this.valueListener;
        if (cVar != null) {
            cVar.a(l());
        }
    }

    public final void n(c listener) {
        this.valueListener = listener;
    }

    public w(ReadableMap readableMap) {
        this.nodeValue = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.offset = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    public /* synthetic */ w(ReadableMap readableMap, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : readableMap);
    }
}
