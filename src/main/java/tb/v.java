package tb;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "a", "[I", "defaultCapabilities", "Landroid/net/NetworkRequest;", "c", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "b", "capabilitiesCompat", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f113102a = {13, 15, 14};

    public static final int[] b(NetworkRequest networkRequest) {
        p013kotlin.jvm.internal.s.k(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return t.f113098a.a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 30; i11++) {
            int i12 = iArr[i11];
            if (r.f113096a.c(networkRequest, i12)) {
                arrayList.add(Integer.valueOf(i12));
            }
        }
        return p013kotlin.collections.v.l1(arrayList);
    }

    public static final int[] c(NetworkRequest networkRequest) {
        p013kotlin.jvm.internal.s.k(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return t.f113098a.b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = iArr[i11];
            if (r.f113096a.d(networkRequest, i12)) {
                arrayList.add(Integer.valueOf(i12));
            }
        }
        return p013kotlin.collections.v.l1(arrayList);
    }
}
