package tl;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ltl/a;", "", "Ltl/b;", "bitmapFramePreparer", "Lrl/b;", "bitmapFrameCache", "Lql/a;", "animationBackend", "", "lastDrawnFrameNumber", "Lkotlin/Function0;", "Ljn0/h0;", "onAnimationLoaded", DateTokenConverter.CONVERTER_KEY, "(Ltl/b;Lrl/b;Lql/a;ILwn0/a;)V", "canvasWidth", "canvasHeight", "a", "(IILwn0/a;)V", "onStop", "()V", "c", "frameNumber", "Ltk/a;", "Landroid/graphics/Bitmap;", "b", "(III)Ltk/a;", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    void a(int canvasWidth, int canvasHeight, wn0.a<h0> onAnimationLoaded);

    tk.a<Bitmap> b(int frameNumber, int canvasWidth, int canvasHeight);

    void c();

    void d(b bitmapFramePreparer, rl.b bitmapFrameCache, ql.a animationBackend, int lastDrawnFrameNumber, wn0.a<h0> onAnimationLoaded);

    void onStop();

    /* JADX INFO: renamed from: tl.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C2455a {
        public static tk.a<Bitmap> b(a aVar, int i11, int i12, int i13) {
            return null;
        }

        public static void e(a aVar, b bitmapFramePreparer, rl.b bitmapFrameCache, ql.a animationBackend, int i11, wn0.a<h0> aVar2) {
            s.k(bitmapFramePreparer, "bitmapFramePreparer");
            s.k(bitmapFrameCache, "bitmapFrameCache");
            s.k(animationBackend, "animationBackend");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void f(a aVar, b bVar, rl.b bVar2, ql.a aVar2, int i11, wn0.a aVar3, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i12 & 16) != 0) {
                aVar3 = null;
            }
            aVar.d(bVar, bVar2, aVar2, i11, aVar3);
        }

        public static void a(a aVar) {
        }

        public static void c(a aVar) {
        }

        public static void d(a aVar, int i11, int i12, wn0.a<h0> aVar2) {
        }
    }
}
