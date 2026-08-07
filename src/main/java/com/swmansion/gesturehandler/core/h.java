package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010!R$\u0010&\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0017\u0010%R$\u0010'\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b\u001a\u0010%R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u0011\u00100\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b \u0010/¨\u00061"}, d2 = {"Lcom/swmansion/gesturehandler/core/h;", "", "Lcom/swmansion/gesturehandler/core/h$a;", "gestureListener", "<init>", "(Lcom/swmansion/gesturehandler/core/h$a;)V", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/MotionEvent;)V", "g", "()V", "", "eventAngle", "h", "(D)V", "a", "", "f", "(Landroid/view/MotionEvent;)Z", "Lcom/swmansion/gesturehandler/core/h$a;", "", "b", "J", "currentTime", "c", "previousTime", DateTokenConverter.CONVERTER_KEY, "D", "previousAngle", "value", "e", "()D", "rotation", "", Gender.FEMALE, "()F", "anchorX", "anchorY", "Z", "isInProgress", "", "[I", "pointerIds", "j", "isPaused", "()J", "timeDelta", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a gestureListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long currentTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long previousTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private double previousAngle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double rotation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float anchorX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float anchorY;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInProgress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int[] pointerIds = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/gesturehandler/core/h$a;", "", "Lcom/swmansion/gesturehandler/core/h;", "detector", "", "b", "(Lcom/swmansion/gesturehandler/core/h;)Z", "a", "Ljn0/h0;", "c", "(Lcom/swmansion/gesturehandler/core/h;)V", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        boolean a(h detector);

        boolean b(h detector);

        void c(h detector);
    }

    public h(a aVar) {
        this.gestureListener = aVar;
    }

    private final void a() {
        if (this.isInProgress) {
            this.isPaused = false;
            this.isInProgress = false;
            a aVar = this.gestureListener;
            if (aVar != null) {
                aVar.c(this);
            }
        }
    }

    private final void g() {
        if (this.isPaused) {
            return;
        }
        this.isPaused = true;
    }

    private final void h(double eventAngle) {
        if (this.isPaused) {
            this.previousAngle = eventAngle;
            this.isPaused = false;
        }
    }

    private final void i(MotionEvent event) {
        this.previousTime = this.currentTime;
        this.currentTime = event.getEventTime();
        int iFindPointerIndex = event.findPointerIndex(this.pointerIds[0]);
        int iFindPointerIndex2 = event.findPointerIndex(this.pointerIds[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x11 = event.getX(iFindPointerIndex);
        float y11 = event.getY(iFindPointerIndex);
        float x12 = event.getX(iFindPointerIndex2);
        float y12 = event.getY(iFindPointerIndex2);
        this.anchorX = (x11 + x12) * 0.5f;
        this.anchorY = (y11 + y12) * 0.5f;
        double d11 = -Math.atan2(y12 - y11, x12 - x11);
        h(d11);
        double d12 = Double.isNaN(this.previousAngle) ? 0.0d : this.previousAngle - d11;
        this.rotation = d12;
        this.previousAngle = d11;
        if (d12 > 3.141592653589793d) {
            this.rotation = d12 - 3.141592653589793d;
        } else if (d12 < -3.141592653589793d) {
            this.rotation = d12 + 3.141592653589793d;
        }
        double d13 = this.rotation;
        if (d13 > 1.5707963267948966d) {
            this.rotation = d13 - 3.141592653589793d;
        } else if (d13 < -1.5707963267948966d) {
            this.rotation = d13 + 3.141592653589793d;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAnchorX() {
        return this.anchorX;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getAnchorY() {
        return this.anchorY;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getRotation() {
        return this.rotation;
    }

    public final long e() {
        return this.currentTime - this.previousTime;
    }

    public final boolean f(MotionEvent event) {
        a aVar;
        s.k(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.isInProgress = false;
            this.pointerIds[0] = event.getPointerId(event.getActionIndex());
            this.pointerIds[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.isInProgress || this.isPaused) {
                    this.pointerIds[1] = event.getPointerId(event.getActionIndex());
                    i(event);
                }
                if (!this.isInProgress) {
                    this.isInProgress = true;
                    this.previousTime = event.getEventTime();
                    this.previousAngle = Double.NaN;
                    a aVar2 = this.gestureListener;
                    if (aVar2 != null) {
                        aVar2.a(this);
                    }
                }
            } else if (actionMasked == 6 && this.isInProgress) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.pointerIds;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    g();
                }
            }
        } else if (this.isInProgress) {
            i(event);
            if (!this.isPaused && (aVar = this.gestureListener) != null) {
                aVar.b(this);
            }
        }
        return true;
    }
}
