package p019p1;

import androidx.collection.c0;
import androidx.collection.p;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p019p1.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0001\u0001\u001b¨\u0006\u001c"}, d2 = {"Lp1/s0;", "T", "Lp1/q0;", "E", "", "<init>", "()V", "Lp1/d0;", "easing", "f", "(Lp1/q0;Lp1/d0;)Lp1/q0;", "", "<set-?>", "a", "I", "b", "()I", "e", "(I)V", "durationMillis", DateTokenConverter.CONVERTER_KEY, "delayMillis", "Landroidx/collection/c0;", "c", "Landroidx/collection/c0;", "()Landroidx/collection/c0;", "keyframes", "Lp1/r0$b;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class s0<T, E extends q0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int delayMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0<E> keyframes;

    public /* synthetic */ s0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final c0<E> c() {
        return this.keyframes;
    }

    public final void d(int i11) {
        this.delayMillis = i11;
    }

    public final void e(int i11) {
        this.durationMillis = i11;
    }

    public final E f(E e11, d0 d0Var) {
        e11.c(d0Var);
        return e11;
    }

    private s0() {
        this.durationMillis = 300;
        this.keyframes = p.b();
    }
}
