package vo0;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "seen", "goldenMask", "Lto0/f;", "descriptor", "Ljn0/h0;", "b", "(IILto0/f;)V", "", "seenArray", "goldenMaskArray", "a", "([I[ILto0/f;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h1 {
    public static final void a(int[] seenArray, int[] goldenMaskArray, to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(seenArray, "seenArray");
        p013kotlin.jvm.internal.s.k(goldenMaskArray, "goldenMaskArray");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = goldenMaskArray[i11] & (~seenArray[i11]);
            if (i12 != 0) {
                for (int i13 = 0; i13 < 32; i13++) {
                    if ((i12 & 1) != 0) {
                        arrayList.add(descriptor.f((i11 * 32) + i13));
                    }
                    i12 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, descriptor.h());
    }

    public static final void b(int i11, int i12, to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(descriptor.f(i14));
            }
            i13 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.h());
    }
}
