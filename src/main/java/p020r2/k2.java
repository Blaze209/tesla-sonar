package p020r2;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"", "flags", "a", "(I)I", "", "Ljava/lang/Object;", "callbackLock", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f106606a = new Object();

    public static final int a(int i11) {
        int i12 = 306783378 & i11;
        int i13 = 613566756 & i11;
        return (i11 & (-920350135)) | (i13 >> 1) | i12 | ((i12 << 1) & i13);
    }
}
