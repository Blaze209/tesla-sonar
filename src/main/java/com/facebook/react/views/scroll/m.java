package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR$\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R$\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/scroll/m;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "ev", "Ljn0/h0;", "a", "(Landroid/view/MotionEvent;)V", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "velocityTracker", "", "value", "b", Gender.FEMALE, "()F", "xVelocity", "c", "yVelocity", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float xVelocity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float yVelocity;

    public final void a(MotionEvent ev2) {
        s.k(ev2, "ev");
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev2);
            int action = ev2.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.xVelocity = velocityTracker.getXVelocity();
                this.yVelocity = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getXVelocity() {
        return this.xVelocity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getYVelocity() {
        return this.yVelocity;
    }
}
