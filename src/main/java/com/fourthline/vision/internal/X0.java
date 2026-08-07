package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X0 {
    public static final T0.d merged(List<T0.d> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<T0.a> lines = ((T0.d) it.next()).getLines();
            if (lines == null) {
                lines = p013kotlin.collections.v.m();
            }
            p013kotlin.collections.v.E(arrayList, lines);
        }
        return toText(arrayList);
    }

    public static final T0.b mrz(T0.d dVar, MrzInfo mrz) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(mrz, "mrz");
        return new T0.b(mrz, dVar);
    }

    public static final T0.d toText(List<T0.a> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        String strY0 = p013kotlin.collections.v.y0(list, "\n", null, null, 0, null, new wn0.l() { // from class: com.fourthline.vision.internal.t8
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return X0.toText$lambda$1((T0.a) obj);
            }
        }, 30, null);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((T0.a) it.next()).getBox());
        }
        return new T0.d(strY0, AbstractC4173d4.toBox(arrayList), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toText$lambda$1(T0.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.getText();
    }
}
