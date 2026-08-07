package vs;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f119857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f119858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f119859e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f119855a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f119856b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f119860f = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public m(Context context, a aVar, float f11) {
        this.f119857c = aVar;
        this.f119858d = f11;
        this.f119859e = new GestureDetector(context, this);
    }

    @Override // vs.d.a
    public void a(float[] fArr, float f11) {
        this.f119860f = -f11;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f119855a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        float x11 = (motionEvent2.getX() - this.f119855a.x) / this.f119858d;
        float y11 = motionEvent2.getY();
        PointF pointF = this.f119855a;
        float f13 = (y11 - pointF.y) / this.f119858d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d11 = this.f119860f;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        PointF pointF2 = this.f119856b;
        pointF2.x -= (fCos * x11) - (fSin * f13);
        float f14 = pointF2.y + (fSin * x11) + (fCos * f13);
        pointF2.y = f14;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f14));
        this.f119857c.b(this.f119856b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f119857c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f119859e.onTouchEvent(motionEvent);
    }
}
