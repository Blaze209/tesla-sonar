package p024x1;

import p013kotlin.Metadata;
import t2.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lt2/b;", "Lx1/d$a;", "", "itemIndex", "b", "(Lt2/b;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(b<d.a<T>> bVar, int i11) {
        int size = bVar.getSize() - 1;
        int i12 = 0;
        while (i12 < size) {
            int i13 = ((size - i12) / 2) + i12;
            int startIndex = bVar.m()[i13].getStartIndex();
            if (startIndex != i11) {
                if (startIndex < i11) {
                    i12 = i13 + 1;
                    if (i11 < bVar.m()[i12].getStartIndex()) {
                    }
                } else {
                    size = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }
}
