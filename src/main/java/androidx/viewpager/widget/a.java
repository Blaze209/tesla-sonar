package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataSetObservable f14306a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f14307b;

    public abstract void a(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj);

    @Deprecated
    public void b(@NonNull View view) {
    }

    public void c(@NonNull ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public int e(@NonNull Object obj) {
        return -1;
    }

    public float f(int i11) {
        return 1.0f;
    }

    @NonNull
    public abstract Object g(@NonNull ViewGroup viewGroup, int i11);

    public abstract boolean h(@NonNull View view, @NonNull Object obj);

    public void i() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f14307b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14306a.notifyChanged();
    }

    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable k() {
        return null;
    }

    @Deprecated
    public void l(@NonNull View view, int i11, @NonNull Object obj) {
    }

    public void m(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        l(viewGroup, i11, obj);
    }

    void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f14307b = dataSetObserver;
        }
    }

    @Deprecated
    public void o(@NonNull View view) {
    }

    public void p(@NonNull ViewGroup viewGroup) {
        o(viewGroup);
    }
}
