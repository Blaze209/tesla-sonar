package com.facebook.react.modules.debug;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "eventArray", "startTime", "endTime", "", "f", "(Ljava/util/ArrayList;JJ)Z", "e", "(Ljava/util/ArrayList;JJ)J", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/ArrayList;J)V", "ReactAndroid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ArrayList<Long> arrayList, long j11) {
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (arrayList.get(i12).longValue() < j11) {
                i11++;
            }
        }
        if (i11 > 0) {
            int i13 = size - i11;
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.set(i14, arrayList.get(i14 + i11));
            }
            v.j0(arrayList, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(ArrayList<Long> arrayList, long j11, long j12) {
        Iterator<Long> it = arrayList.iterator();
        s.j(it, "iterator(...)");
        long j13 = -1;
        while (it.hasNext()) {
            Long next = it.next();
            s.j(next, "next(...)");
            long jLongValue = next.longValue();
            if (j11 <= jLongValue && jLongValue < j12) {
                j13 = jLongValue;
            } else if (jLongValue >= j12) {
                break;
            }
        }
        return j13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ArrayList<Long> arrayList, long j11, long j12) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (j11 <= jLongValue && jLongValue < j12) {
                return true;
            }
        }
        return false;
    }
}
