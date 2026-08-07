package lh0;

import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "B", "T", "Lc30/c;", "baseScreen", "", "compatibilityKey", "Llh0/c;", "b", "(Lc30/c;Ljava/lang/Object;Ljava/lang/String;)Llh0/c;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Llh0/c;", "modal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final <B, T> c<B, T> a(T t11, B baseScreen, String compatibilityKey) {
        s.k(t11, "<this>");
        s.k(baseScreen, "baseScreen");
        s.k(compatibilityKey, "compatibilityKey");
        return b(new c30.c(t11, v.m()), baseScreen, compatibilityKey);
    }

    public static final <B, T> c<B, T> b(c30.c<T> cVar, B baseScreen, String compatibilityKey) {
        s.k(cVar, "<this>");
        s.k(baseScreen, "baseScreen");
        s.k(compatibilityKey, "compatibilityKey");
        return new c<>(baseScreen, v.e(cVar), compatibilityKey);
    }
}
