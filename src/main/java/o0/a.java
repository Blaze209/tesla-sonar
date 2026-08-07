package o0;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class a<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<T> f95558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f95559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b.a<T> f95560d;

    public a(int i11) {
        this(i11, null);
    }

    @Override // o0.b
    @NonNull
    public T a() {
        T tRemoveLast;
        synchronized (this.f95559c) {
            tRemoveLast = this.f95558b.removeLast();
        }
        return tRemoveLast;
    }

    @Override // o0.b
    public void b(@NonNull T t11) {
        T tA;
        synchronized (this.f95559c) {
            try {
                tA = this.f95558b.size() >= this.f95557a ? a() : null;
                this.f95558b.addFirst(t11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b.a<T> aVar = this.f95560d;
        if (aVar == null || tA == null) {
            return;
        }
        aVar.a(tA);
    }

    @Override // o0.b
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f95559c) {
            zIsEmpty = this.f95558b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i11, b.a<T> aVar) {
        this.f95559c = new Object();
        this.f95557a = i11;
        this.f95558b = new ArrayDeque<>(i11);
        this.f95560d = aVar;
    }
}
