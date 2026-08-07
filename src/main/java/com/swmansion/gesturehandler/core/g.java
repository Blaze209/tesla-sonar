package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010*\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/swmansion/gesturehandler/core/g;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "Ljn0/h0;", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "", "force", "l", "(Z)V", "o0", "t0", "", "value", Gender.OTHER, "D", "b1", "()D", "scale", "P", "c1", "velocity", "", "Q", Gender.FEMALE, "Z0", "()F", "focalPointX", "R", "a1", "focalPointY", "Lcom/swmansion/gesturehandler/core/j;", "S", "Lcom/swmansion/gesturehandler/core/j;", "scaleGestureDetector", "T", "startingSpan", Gender.UNKNOWN, "spanSlop", "Lcom/swmansion/gesturehandler/core/j$b;", "V", "Lcom/swmansion/gesturehandler/core/j$b;", "gestureListener", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends GestureHandler {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private double scale;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private double velocity;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private j scaleGestureDetector;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private float startingSpan;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private float spanSlop;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private float focalPointX = Float.NaN;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private float focalPointY = Float.NaN;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final j.b gestureListener = new b();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/swmansion/gesturehandler/core/g$a;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/g;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/g;", "handler", "Lz90/h;", "h", "(Lcom/swmansion/gesturehandler/core/g;)Lz90/h;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends GestureHandler.b<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<g> type = g.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<g> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public g a(Context context) {
            return new g();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.h c(g handler) {
            s.k(handler, "handler");
            return new z90.h(handler);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/swmansion/gesturehandler/core/g$b", "Lcom/swmansion/gesturehandler/core/j$b;", "Lcom/swmansion/gesturehandler/core/j;", "detector", "", "b", "(Lcom/swmansion/gesturehandler/core/j;)Z", "c", "Ljn0/h0;", "a", "(Lcom/swmansion/gesturehandler/core/j;)V", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements j.b {
        b() {
        }

        @Override // com.swmansion.gesturehandler.core.j.b
        public void a(j detector) {
            s.k(detector, "detector");
        }

        @Override // com.swmansion.gesturehandler.core.j.b
        public boolean b(j detector) {
            s.k(detector, "detector");
            double scale = g.this.getScale();
            g gVar = g.this;
            gVar.scale = gVar.getScale() * ((double) detector.g());
            double dI = detector.i();
            if (dI > 0.0d) {
                g gVar2 = g.this;
                gVar2.velocity = (gVar2.getScale() - scale) / dI;
            }
            if (Math.abs(g.this.startingSpan - detector.d()) < g.this.spanSlop || g.this.getState() != 2) {
                return true;
            }
            g.this.k();
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.j.b
        public boolean c(j detector) {
            s.k(detector, "detector");
            g.this.startingSpan = detector.d();
            return true;
        }
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final float getFocalPointX() {
        return this.focalPointX;
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final float getFocalPointY() {
        return this.focalPointY;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final double getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void l(boolean force) {
        if (getState() != 4) {
            t0();
        }
        super.l(force);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            View view = getView();
            s.h(view);
            Context context = view.getContext();
            t0();
            this.scaleGestureDetector = new j(context, this.gestureListener);
            this.spanSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.focalPointX = event.getX();
            this.focalPointY = event.getY();
            p();
        }
        j jVar = this.scaleGestureDetector;
        if (jVar != null) {
            jVar.k(sourceEvent);
        }
        j jVar2 = this.scaleGestureDetector;
        if (jVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(jVar2.e(), jVar2.f()));
            this.focalPointX = pointFQ0.x;
            this.focalPointY = pointFQ0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (getState() == 4) {
                B();
            } else {
                D();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void o0() {
        this.scaleGestureDetector = null;
        this.focalPointX = Float.NaN;
        this.focalPointY = Float.NaN;
        t0();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void t0() {
        this.velocity = 0.0d;
        this.scale = 1.0d;
    }
}
