package androidx.collection;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00020\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "", "elements", "Landroidx/collection/m;", "a", "([I)Landroidx/collection/m;", "Landroidx/collection/m;", "EmptyIntList", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f3884a = new b0(0);

    public static final m a(int... elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        b0 b0Var = new b0(elements.length);
        b0Var.j(elements);
        return b0Var;
    }
}
