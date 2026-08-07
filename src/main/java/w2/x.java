package w2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"", "index", "shift", "f", "(II)I", "K", "V", "", "", "keyIndex", Action.KEY_ATTRIBUTE, "value", "g", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Lw2/t;", "newNode", "j", "([Ljava/lang/Object;IILw2/t;)[Ljava/lang/Object;", "k", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "h", "([Ljava/lang/Object;I)[Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {
    public static final int f(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i11, K k11, V v11) {
        Object[] objArr2 = new Object[objArr.length + 2];
        p013kotlin.collections.n.t(objArr, objArr2, 0, 0, i11, 6, null);
        p013kotlin.collections.n.p(objArr, objArr2, i11 + 2, i11, objArr.length);
        objArr2[i11] = k11;
        objArr2[i11 + 1] = v11;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 2];
        p013kotlin.collections.n.t(objArr, objArr2, 0, 0, i11, 6, null);
        p013kotlin.collections.n.p(objArr, objArr2, i11, i11 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p013kotlin.collections.n.t(objArr, objArr2, 0, 0, i11, 6, null);
        p013kotlin.collections.n.p(objArr, objArr2, i11, i11 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i11, int i12, t<?, ?> tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p013kotlin.collections.n.t(objArr, objArr2, 0, 0, i11, 6, null);
        p013kotlin.collections.n.p(objArr, objArr2, i11, i11 + 2, i12);
        objArr2[i12 - 2] = tVar;
        p013kotlin.collections.n.p(objArr, objArr2, i12 - 1, i12, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i11, int i12, K k11, V v11) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
        p013kotlin.collections.n.p(objArrCopyOf, objArrCopyOf, i11 + 2, i11 + 1, objArr.length);
        p013kotlin.collections.n.p(objArrCopyOf, objArrCopyOf, i12 + 2, i12, i11);
        objArrCopyOf[i12] = k11;
        objArrCopyOf[i12 + 1] = v11;
        return objArrCopyOf;
    }
}
