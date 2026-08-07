package net.time4j.engine;

import java.util.List;
import net.time4j.engine.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<U extends v> implements j0<U> {
    @Override // net.time4j.engine.j0
    public boolean isEmpty() {
        List<j0.a<U>> listA = a();
        int size = listA.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (listA.get(i11).a() > 0) {
                return false;
            }
        }
        return true;
    }
}
