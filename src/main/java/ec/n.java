package ec;

import android.graphics.Canvas;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lec/n;", "", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;)V", "", "getSize", "()J", "size", "", "getWidth", "()I", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "", "b", "()Z", "shareable", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface n {
    void a(Canvas canvas);

    boolean b();

    int getHeight();

    long getSize();

    int getWidth();
}
