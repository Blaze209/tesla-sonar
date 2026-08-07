package vl;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvl/h;", "", "", "size", "<init>", "(I)V", "from", "target", "length", "", "c", "(III)Z", "a", "(I)I", "", DateTokenConverter.CONVERTER_KEY, "(II)Ljava/util/List;", "I", "b", "()I", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public h(int i11) {
        this.size = i11;
    }

    public final int a(int target) {
        int i11 = target % this.size;
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11 + this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean c(int from, int target, int length) {
        int iA = a(length + from);
        if (from < iA) {
            return from <= target && target <= iA;
        }
        return (from <= target && target <= this.size) || (target >= 0 && target <= iA);
    }

    public final List<Integer> d(int from, int length) {
        bo0.j jVarW = n.w(0, length);
        ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((s0) it).nextInt() + from)));
        }
        return arrayList;
    }
}
