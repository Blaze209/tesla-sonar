package androidx.collection;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "Landroidx/collection/y0;", "", Action.KEY_ATTRIBUTE, "c", "(Landroidx/collection/y0;I)Ljava/lang/Object;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/collection/y0;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3952a = new Object();

    public static final <E> E c(y0<E> y0Var, int i11) {
        E e11;
        p013kotlin.jvm.internal.s.k(y0Var, "<this>");
        int iA = n1.a.a(y0Var.f3949b, y0Var.f3951d, i11);
        if (iA < 0 || (e11 = (E) y0Var.f3950c[iA]) == f3952a) {
            return null;
        }
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void d(y0<E> y0Var) {
        int i11 = y0Var.f3951d;
        int[] iArr = y0Var.f3949b;
        Object[] objArr = y0Var.f3950c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f3952a) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        y0Var.f3948a = false;
        y0Var.f3951d = i12;
    }
}
