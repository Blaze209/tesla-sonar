package tl;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltl/d;", "Ltl/a;", "", "framesToPrepare", "<init>", "(I)V", "Ltl/b;", "bitmapFramePreparer", "Lrl/b;", "bitmapFrameCache", "Lql/a;", "animationBackend", "lastDrawnFrameNumber", "Lkotlin/Function0;", "Ljn0/h0;", "onAnimationLoaded", DateTokenConverter.CONVERTER_KEY, "(Ltl/b;Lrl/b;Lql/a;ILwn0/a;)V", "a", "I", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "TAG", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int framesToPrepare;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Class<d> TAG;

    public d() {
        this(0, 1, null);
    }

    @Override // tl.a
    public void a(int i11, int i12, wn0.a<h0> aVar) {
        a.C2455a.d(this, i11, i12, aVar);
    }

    @Override // tl.a
    public tk.a<Bitmap> b(int i11, int i12, int i13) {
        return a.C2455a.b(this, i11, i12, i13);
    }

    @Override // tl.a
    public void c() {
        a.C2455a.a(this);
    }

    @Override // tl.a
    public void d(b bitmapFramePreparer, rl.b bitmapFrameCache, ql.a animationBackend, int lastDrawnFrameNumber, wn0.a<h0> onAnimationLoaded) {
        s.k(bitmapFramePreparer, "bitmapFramePreparer");
        s.k(bitmapFrameCache, "bitmapFrameCache");
        s.k(animationBackend, "animationBackend");
        int i11 = this.framesToPrepare;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iA = (lastDrawnFrameNumber + i12) % animationBackend.a();
                if (qk.a.w(2)) {
                    qk.a.z(this.TAG, "Preparing frame %d, last drawn: %d", Integer.valueOf(iA), Integer.valueOf(lastDrawnFrameNumber));
                }
                if (!bitmapFramePreparer.a(bitmapFrameCache, animationBackend, iA)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (onAnimationLoaded != null) {
            onAnimationLoaded.invoke();
        }
    }

    @Override // tl.a
    public void onStop() {
        a.C2455a.c(this);
    }

    public d(int i11) {
        this.framesToPrepare = i11;
        this.TAG = d.class;
    }

    public /* synthetic */ d(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 3 : i11);
    }
}
