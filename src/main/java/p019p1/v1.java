package p019p1;

import p013kotlin.Metadata;
import p019p1.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lp1/v1;", "Lp1/q;", "V", "Lp1/w1;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Lp1/q;Lp1/q;Lp1/q;)J", "", "c", "()I", "durationMillis", "g", "delayMillis", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface v1<V extends q> extends w1<V> {
    @Override // p019p1.s1
    default long b(V initialValue, V targetValue, V initialVelocity) {
        return ((long) (g() + c())) * 1000000;
    }

    int c();

    int g();
}
