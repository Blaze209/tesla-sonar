package vl;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvl/j;", "", "", "frameNumber", Snapshot.WIDTH, Snapshot.HEIGHT, "Lvl/l;", "c", "(III)Lvl/l;", "Lkotlin/Function0;", "Ljn0/h0;", "onAnimationLoaded", "a", "(IILwn0/a;)V", "fps", "b", "(I)V", "onStop", "()V", "clear", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface j {
    void a(int width, int height, wn0.a<h0> onAnimationLoaded);

    void b(int fps);

    l c(int frameNumber, int width, int height);

    void clear();

    void onStop();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static void a(j jVar) {
        }
    }
}
