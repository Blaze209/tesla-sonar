package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/swmansion/gesturehandler/core/i;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "Ljn0/h0;", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "", "force", "l", "(Z)V", "o0", "t0", "Lcom/swmansion/gesturehandler/core/h;", Gender.OTHER, "Lcom/swmansion/gesturehandler/core/h;", "rotationGestureDetector", "", "value", "P", "D", "Y0", "()D", "rotation", "Q", "Z0", "velocity", "", "R", Gender.FEMALE, "W0", "()F", "anchorX", "S", "X0", "anchorY", "Lcom/swmansion/gesturehandler/core/h$a;", "T", "Lcom/swmansion/gesturehandler/core/h$a;", "gestureListener", Gender.UNKNOWN, "b", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends GestureHandler {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private h rotationGestureDetector;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private double rotation;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private double velocity;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private float anchorX = Float.NaN;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private float anchorY = Float.NaN;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final h.a gestureListener = new c();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/swmansion/gesturehandler/core/i$b;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/i;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/i;", "handler", "Lz90/i;", "h", "(Lcom/swmansion/gesturehandler/core/i;)Lz90/i;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends GestureHandler.b<i> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<i> type = i.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<i> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public i a(Context context) {
            return new i();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.i c(i handler) {
            s.k(handler, "handler");
            return new z90.i(handler);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/swmansion/gesturehandler/core/i$c", "Lcom/swmansion/gesturehandler/core/h$a;", "Lcom/swmansion/gesturehandler/core/h;", "detector", "", "b", "(Lcom/swmansion/gesturehandler/core/h;)Z", "a", "Ljn0/h0;", "c", "(Lcom/swmansion/gesturehandler/core/h;)V", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements h.a {
        c() {
        }

        @Override // com.swmansion.gesturehandler.core.h.a
        public boolean a(h detector) {
            s.k(detector, "detector");
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.h.a
        public boolean b(h detector) {
            s.k(detector, "detector");
            double rotation = i.this.getRotation();
            i iVar = i.this;
            iVar.rotation = iVar.getRotation() + detector.getRotation();
            long jE = detector.e();
            if (jE > 0) {
                i iVar2 = i.this;
                iVar2.velocity = (iVar2.getRotation() - rotation) / jE;
            }
            if (Math.abs(i.this.getRotation()) < 0.08726646259971647d || i.this.getState() != 2) {
                return true;
            }
            i.this.k();
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.h.a
        public void c(h detector) {
            s.k(detector, "detector");
            i.this.B();
        }
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final float getAnchorX() {
        return this.anchorX;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final float getAnchorY() {
        return this.anchorY;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final double getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
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
            t0();
            this.rotationGestureDetector = new h(this.gestureListener);
            this.anchorX = event.getX();
            this.anchorY = event.getY();
            p();
        }
        h hVar = this.rotationGestureDetector;
        if (hVar != null) {
            hVar.f(sourceEvent);
        }
        h hVar2 = this.rotationGestureDetector;
        if (hVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(hVar2.getAnchorX(), hVar2.getAnchorY()));
            this.anchorX = pointFQ0.x;
            this.anchorY = pointFQ0.y;
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
        this.rotationGestureDetector = null;
        this.anchorX = Float.NaN;
        this.anchorY = Float.NaN;
        t0();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void t0() {
        this.velocity = 0.0d;
        this.rotation = 0.0d;
    }
}
