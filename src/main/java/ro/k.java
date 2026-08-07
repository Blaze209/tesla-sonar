package ro;

import android.view.View;
import android.view.animation.Animation;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lro/k;", "Lro/a;", "<init>", "()V", "", "h", "()Z", "Landroid/view/View;", "view", "", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "Landroid/view/animation/Animation;", "g", "(Landroid/view/View;IIII)Landroid/view/animation/Animation;", "f", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends ro.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f108649f = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lro/k$a;", "", "<init>", "()V", "", "USE_TRANSLATE_ANIMATION", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // ro.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Animation b(View view, int x11, int y11, int width, int height) {
        s.k(view, "view");
        boolean z11 = true;
        boolean z12 = (((int) view.getX()) == x11 && ((int) view.getY()) == y11) ? false : true;
        if (view.getWidth() == width && view.getHeight() == height) {
            z11 = false;
        }
        if (z12 || z11) {
            return new m(view, x11, y11, width, height);
        }
        return null;
    }

    @Override // ro.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean e() {
        return this.f108640d > 0;
    }
}
