package ro;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<d, BaseInterpolator> f108636e = jn.c.g(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Interpolator f108637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f108638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b f108639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f108640d;

    a() {
    }

    private static Interpolator c(d dVar, ReadableMap readableMap) {
        BaseInterpolator nVar = dVar.equals(d.SPRING) ? new n(n.a(readableMap)) : f108636e.get(dVar);
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + dVar);
    }

    public final Animation a(View view, int i11, int i12, int i13, int i14) {
        if (!e()) {
            return null;
        }
        Animation animationB = b(view, i11, i12, i13, i14);
        if (animationB != null) {
            animationB.setDuration(this.f108640d);
            animationB.setStartOffset(this.f108638b);
            animationB.setInterpolator(this.f108637a);
        }
        return animationB;
    }

    abstract Animation b(View view, int i11, int i12, int i13, int i14);

    public void d(ReadableMap readableMap, int i11) {
        this.f108639c = readableMap.hasKey("property") ? b.fromString(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i11 = readableMap.getInt("duration");
        }
        this.f108640d = i11;
        this.f108638b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        this.f108637a = c(d.fromString(readableMap.getString("type")), readableMap);
        if (e()) {
            return;
        }
        throw new IllegalViewOperationException("Invalid layout animation : " + readableMap);
    }

    abstract boolean e();

    public void f() {
        this.f108639c = null;
        this.f108640d = 0;
        this.f108638b = 0;
        this.f108637a = null;
    }
}
