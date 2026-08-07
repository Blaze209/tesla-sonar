package com.stripe.android.paymentsheet;

import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lcom/stripe/android/paymentsheet/t;", "Lw70/j;", "paymentSelection", "b", "(Ljava/util/List;Lw70/j;)Lcom/stripe/android/paymentsheet/t;", "c", "(Lcom/stripe/android/paymentsheet/t;)Lw70/j;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class w {
    /* JADX INFO: Access modifiers changed from: private */
    public static final t b(List<? extends t> list, w70.j jVar) {
        Object next;
        boolean zF;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            t tVar = (t) next;
            if (jVar instanceof w70.j.c) {
                zF = tVar instanceof t.b;
            } else if (jVar instanceof w70.j.d) {
                zF = tVar instanceof t.c;
            } else {
                if (jVar instanceof w70.j.Saved) {
                    if (tVar instanceof t.SavedPaymentMethod) {
                        zF = p013kotlin.jvm.internal.s.f(((w70.j.Saved) jVar).getPaymentMethod().id, ((t.SavedPaymentMethod) tVar).getPaymentMethod().id);
                    }
                } else if (!(jVar instanceof w70.j.e) && !(jVar instanceof w70.j.ExternalPaymentMethod)) {
                    throw new NoWhenBranchMatchedException();
                }
                zF = false;
            }
            if (zF) {
                return (t) next;
            }
        }
        next = null;
        return (t) next;
    }

    public static final w70.j c(t tVar) {
        p013kotlin.jvm.internal.s.k(tVar, "<this>");
        if (tVar instanceof t.a) {
            return null;
        }
        if (tVar instanceof t.b) {
            return w70.j.c.f121146b;
        }
        if (tVar instanceof t.c) {
            return w70.j.d.f121147b;
        }
        if (tVar instanceof t.SavedPaymentMethod) {
            return new w70.j.Saved(((t.SavedPaymentMethod) tVar).getPaymentMethod(), null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
