package com.fourthline.vision.internal;

import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class K3 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f37809a = new StringBuilder();

    @Override // com.fourthline.vision.internal.W0
    public T0.c correct(T0.c source, Size detectionArea) {
        Integer num;
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(detectionArea, "detectionArea");
        Iterator<T> it = source.getTexts().iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(p013kotlin.text.t.V(((T0.d) it.next()).getText(), " ", "", false, 4, null).length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(p013kotlin.text.t.V(((T0.d) it.next()).getText(), " ", "", false, 4, null).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        List<T0.d> texts = source.getTexts();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(texts, 10));
        for (T0.d dVar : texts) {
            p013kotlin.text.t.q(this.f37809a);
            this.f37809a.append(dVar.getText());
            StringBuilder sb2 = this.f37809a;
            int i11 = 0;
            int i12 = 0;
            while (i11 < sb2.length()) {
                char cCharAt = sb2.charAt(i11);
                int i13 = i12 + 1;
                if (cCharAt == ' ') {
                    this.f37809a.replace(i12, i13, "");
                }
                if (cCharAt == 171) {
                    StringBuilder sb3 = this.f37809a;
                    sb3.replace(i12, i13, sb3.length() < iIntValue ? "<<" : "<");
                }
                while (this.f37809a.length() < iIntValue) {
                    this.f37809a.append('<');
                }
                i11++;
                i12 = i13;
            }
            String string = this.f37809a.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            arrayList.add(new T0.d(string, dVar.getBox(), dVar.getLines()));
        }
        return new T0.c(arrayList);
    }
}
