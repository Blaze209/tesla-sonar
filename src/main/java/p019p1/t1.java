package p019p1;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp1/q;", "V", "Lp1/s1;", "", "playTimeMillis", "start", "end", "startVelocity", DateTokenConverter.CONVERTER_KEY, "(Lp1/s1;JLp1/q;Lp1/q;Lp1/q;)Lp1/q;", "Lp1/v1;", "playTime", "b", "(Lp1/v1;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lp1/s;", "c", "(Lp1/q;FF)Lp1/s;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t1 {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"p1/t1$a", "Lp1/s;", "", "index", "Lp1/j0;", "a", "(I)Lp1/j0;", "", "Ljava/util/List;", "anims", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<j0> anims;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(q qVar, float f11, float f12) {
            j jVarW = n.w(0, qVar.getSize());
            ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                arrayList.add(new j0(f11, f12, qVar.a(((s0) it).nextInt())));
            }
            this.anims = arrayList;
        }

        @Override // p019p1.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 get(int index) {
            return this.anims.get(index);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"p1/t1$b", "Lp1/s;", "", "index", "Lp1/j0;", "a", "(I)Lp1/j0;", "Lp1/j0;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j0 anim;

        b(float f11, float f12) {
            this.anim = new j0(f11, f12, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // p019p1.s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 get(int index) {
            return this.anim;
        }
    }

    public static final long b(v1<?> v1Var, long j11) {
        return n.p(j11 - ((long) v1Var.getDelayMillis()), 0L, v1Var.getDurationMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends q> s c(V v11, float f11, float f12) {
        return v11 != null ? new a(v11, f11, f12) : new b(f11, f12);
    }

    public static final <V extends q> V d(s1<V> s1Var, long j11, V v11, V v12, V v13) {
        return (V) s1Var.e(j11 * 1000000, v11, v12, v13);
    }
}
