package com.facebook.react.views.scroll;

import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR$\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\n\u0010\u0012R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/scroll/c;", "", "<init>", "()V", "", "x", "y", "", "c", "(II)Z", "a", "I", "prevX", "b", "prevY", "", "value", Gender.FEMALE, "()F", "xFlingVelocity", DateTokenConverter.CONVERTER_KEY, "yFlingVelocity", "", "e", "J", "lastScrollEventTimeMs", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f23541f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float xFlingVelocity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float yFlingVelocity;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int prevX = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int prevY = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastScrollEventTimeMs = -11;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/views/scroll/c$a;", "", "<init>", "()V", "", "MIN_EVENT_SEPARATION_MS", "I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getXFlingVelocity() {
        return this.xFlingVelocity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getYFlingVelocity() {
        return this.yFlingVelocity;
    }

    public final boolean c(int x11, int y11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.lastScrollEventTimeMs;
        boolean z11 = (jUptimeMillis - j11 <= 10 && this.prevX == x11 && this.prevY == y11) ? false : true;
        if (jUptimeMillis - j11 != 0) {
            this.xFlingVelocity = (x11 - this.prevX) / (jUptimeMillis - j11);
            this.yFlingVelocity = (y11 - this.prevY) / (jUptimeMillis - j11);
        }
        this.lastScrollEventTimeMs = jUptimeMillis;
        this.prevX = x11;
        this.prevY = y11;
        return z11;
    }
}
