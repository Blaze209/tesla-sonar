package net.time4j.engine;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.engine.a;
import net.time4j.engine.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b<U extends v, P extends a<U>> implements h0<U, P>, Comparator<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<U> f94115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94116b;

    protected b(boolean z11, U... uArr) {
        this(Arrays.asList(uArr), z11);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(U u11, U u12) {
        return Double.compare(u12.getLength(), u11.getLength());
    }

    private b(List<U> list, boolean z11) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing units.");
        }
        Collections.sort(list, this);
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            U u11 = list.get(i11);
            i11++;
            for (int i12 = i11; i12 < size; i12++) {
                if (u11.equals(list.get(i12))) {
                    throw new IllegalArgumentException("Duplicate unit: " + u11);
                }
            }
        }
        this.f94115a = Collections.unmodifiableList(list);
        this.f94116b = z11;
    }
}
