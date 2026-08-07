package p019p1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.s;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001e"}, d2 = {"Lp1/x1;", "Lp1/q;", "V", "Lp1/w1;", "Lp1/s;", "anims", "<init>", "(Lp1/s;)V", "Lp1/h0;", "anim", "(Lp1/h0;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", DateTokenConverter.CONVERTER_KEY, "f", "(Lp1/q;Lp1/q;Lp1/q;)Lp1/q;", "b", "(Lp1/q;Lp1/q;Lp1/q;)J", "a", "Lp1/s;", "Lp1/q;", "valueVector", "c", "velocityVector", "endVelocityVector", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x1<V extends q> implements w1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s anims;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V endVelocityVector;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"p1/x1$a", "Lp1/s;", "", "index", "Lp1/h0;", "get", "(I)Lp1/h0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f100671a;

        a(h0 h0Var) {
            this.f100671a = h0Var;
        }

        @Override // p019p1.s
        public h0 get(int index) {
            return this.f100671a;
        }
    }

    public x1(s sVar) {
        this.anims = sVar;
    }

    @Override // p019p1.s1
    public long b(V initialValue, V targetValue, V initialVelocity) {
        Iterator<Integer> it = n.w(0, initialValue.getSize()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            jMax = Math.max(jMax, this.anims.get(iNextInt).c(initialValue.a(iNextInt), targetValue.a(iNextInt), initialVelocity.a(iNextInt)));
        }
        return jMax;
    }

    @Override // p019p1.s1
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) r.g(initialVelocity);
        }
        V v11 = this.velocityVector;
        if (v11 == null) {
            s.B("velocityVector");
            v11 = null;
        }
        int size = v11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v12 = this.velocityVector;
            if (v12 == null) {
                s.B("velocityVector");
                v12 = null;
            }
            v12.e(i11, this.anims.get(i11).b(playTimeNanos, initialValue.a(i11), targetValue.a(i11), initialVelocity.a(i11)));
        }
        V v13 = this.velocityVector;
        if (v13 != null) {
            return v13;
        }
        s.B("velocityVector");
        return null;
    }

    @Override // p019p1.s1
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) r.g(initialValue);
        }
        V v11 = this.valueVector;
        if (v11 == null) {
            s.B("valueVector");
            v11 = null;
        }
        int size = v11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v12 = this.valueVector;
            if (v12 == null) {
                s.B("valueVector");
                v12 = null;
            }
            v12.e(i11, this.anims.get(i11).e(playTimeNanos, initialValue.a(i11), targetValue.a(i11), initialVelocity.a(i11)));
        }
        V v13 = this.valueVector;
        if (v13 != null) {
            return v13;
        }
        s.B("valueVector");
        return null;
    }

    @Override // p019p1.s1
    public V f(V initialValue, V targetValue, V initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) r.g(initialVelocity);
        }
        V v11 = this.endVelocityVector;
        if (v11 == null) {
            s.B("endVelocityVector");
            v11 = null;
        }
        int size = v11.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            V v12 = this.endVelocityVector;
            if (v12 == null) {
                s.B("endVelocityVector");
                v12 = null;
            }
            v12.e(i11, this.anims.get(i11).d(initialValue.a(i11), targetValue.a(i11), initialVelocity.a(i11)));
        }
        V v13 = this.endVelocityVector;
        if (v13 != null) {
            return v13;
        }
        s.B("endVelocityVector");
        return null;
    }

    public x1(h0 h0Var) {
        this(new a(h0Var));
    }
}
