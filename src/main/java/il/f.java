package il;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f<INFO> implements d<INFO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d<? super INFO>> f78280a = new ArrayList(2);

    private synchronized void d(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    public synchronized void a(d<? super INFO> dVar) {
        this.f78280a.add(dVar);
    }

    public synchronized void b() {
        this.f78280a.clear();
    }

    @Override // il.d
    public void c(String str, INFO info) {
        int size = this.f78280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f78280a.get(i11);
                if (dVar != null) {
                    dVar.c(str, info);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onIntermediateImageSet", e11);
            }
        }
    }

    @Override // il.d
    public synchronized void e(String str) {
        int size = this.f78280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f78280a.get(i11);
                if (dVar != null) {
                    dVar.e(str);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onRelease", e11);
            }
        }
    }

    public synchronized void f(d<? super INFO> dVar) {
        int iIndexOf = this.f78280a.indexOf(dVar);
        if (iIndexOf != -1) {
            this.f78280a.set(iIndexOf, null);
        }
    }

    @Override // il.d
    public synchronized void l(String str, Object obj) {
        int size = this.f78280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f78280a.get(i11);
                if (dVar != null) {
                    dVar.l(str, obj);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onSubmit", e11);
            }
        }
    }

    @Override // il.d
    public synchronized void n(String str, Throwable th2) {
        int size = this.f78280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f78280a.get(i11);
                if (dVar != null) {
                    dVar.n(str, th2);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onFailure", e11);
            }
        }
    }

    @Override // il.d
    public synchronized void p(String str, INFO info, Animatable animatable) {
        int size = this.f78280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f78280a.get(i11);
                if (dVar != null) {
                    dVar.p(str, info, animatable);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onFinalImageSet", e11);
            }
        }
    }

    @Override // il.d
    public void r(String str, Throwable th2) {
        int size = this.f78280a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f78280a.get(i11);
                if (dVar != null) {
                    dVar.r(str, th2);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onIntermediateImageFailed", e11);
            }
        }
    }
}
