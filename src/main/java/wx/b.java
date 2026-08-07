package wx;

import android.media.Image;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Image f122419a;

    b(Image image) {
        this.f122419a = image;
    }

    final Image a() {
        return this.f122419a;
    }

    final Image.Plane[] b() {
        return this.f122419a.getPlanes();
    }
}
