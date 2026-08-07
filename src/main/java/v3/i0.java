package v3;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lv3/m;", "Lj3/g;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "Ljn0/h0;", "block", "c", "(Lv3/m;JLwn0/l;)V", "b", "", "nowMillis", "a", "(JLwn0/l;)V", "", "cancel", DateTokenConverter.CONVERTER_KEY, "(Lv3/m;JLwn0/l;Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {
    public static final void a(long j11, wn0.l<? super MotionEvent, jn0.h0> lVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j11, j11, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        motionEventObtain.setSource(0);
        lVar.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(m mVar, long j11, wn0.l<? super MotionEvent, jn0.h0> lVar) {
        d(mVar, j11, lVar, true);
    }

    public static final void c(m mVar, long j11, wn0.l<? super MotionEvent, jn0.h0> lVar) {
        d(mVar, j11, lVar, false);
    }

    private static final void d(m mVar, long j11, wn0.l<? super MotionEvent, jn0.h0> lVar, boolean z11) {
        MotionEvent motionEventE = mVar.e();
        if (motionEventE == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventE.getAction();
        if (z11) {
            motionEventE.setAction(3);
        }
        motionEventE.offsetLocation(-j3.g.m(j11), -j3.g.n(j11));
        lVar.invoke(motionEventE);
        motionEventE.offsetLocation(j3.g.m(j11), j3.g.n(j11));
        motionEventE.setAction(action);
    }
}
