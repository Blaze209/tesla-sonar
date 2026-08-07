package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lb4/u0;", "T", "", "Lt2/b;", "vector", "Lkotlin/Function0;", "Ljn0/h0;", "onVectorMutated", "<init>", "(Lt2/b;Lwn0/a;)V", "c", "()V", "", "index", "element", "a", "(ILjava/lang/Object;)V", "g", "(I)Ljava/lang/Object;", "", "b", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "Lt2/b;", "f", "()Lt2/b;", "Lwn0/a;", "getOnVectorMutated", "()Lwn0/a;", "e", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16288c = t2.b.f112081d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t2.b<T> vector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> onVectorMutated;

    public u0(t2.b<T> bVar, wn0.a<jn0.h0> aVar) {
        this.vector = bVar;
        this.onVectorMutated = aVar;
    }

    public final void a(int index, T element) {
        this.vector.a(index, element);
        this.onVectorMutated.invoke();
    }

    public final List<T> b() {
        return this.vector.g();
    }

    public final void c() {
        this.vector.h();
        this.onVectorMutated.invoke();
    }

    public final T d(int index) {
        return this.vector.m()[index];
    }

    public final int e() {
        return this.vector.getSize();
    }

    public final t2.b<T> f() {
        return this.vector;
    }

    public final T g(int index) {
        T tV = this.vector.v(index);
        this.onVectorMutated.invoke();
        return tV;
    }
}
