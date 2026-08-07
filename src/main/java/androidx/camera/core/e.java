package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import c0.s0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final n f3034b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3033a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<a> f3035c = new HashSet();

    public interface a {
        void e(@NonNull n nVar);
    }

    protected e(@NonNull n nVar) {
        this.f3034b = nVar;
    }

    @Override // androidx.camera.core.n
    @NonNull
    public n.a[] N0() {
        return this.f3034b.N0();
    }

    public void c(@NonNull a aVar) {
        synchronized (this.f3033a) {
            this.f3035c.add(aVar);
        }
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f3034b.close();
        n();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f3034b.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f3034b.getHeight();
    }

    @Override // androidx.camera.core.n
    public Image getImage() {
        return this.f3034b.getImage();
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f3034b.getWidth();
    }

    protected void n() {
        HashSet hashSet;
        synchronized (this.f3033a) {
            hashSet = new HashSet(this.f3035c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).e(this);
        }
    }

    @Override // androidx.camera.core.n
    public void r2(Rect rect) {
        this.f3034b.r2(rect);
    }

    @Override // androidx.camera.core.n
    @NonNull
    public s0 z() {
        return this.f3034b.z();
    }
}
