package t2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "index", "Ljn0/h0;", "c", "(Ljava/util/List;I)V", "fromIndex", "toIndex", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;II)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List<?> list, int i11) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            throw new IndexOutOfBoundsException("Index " + i11 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i11, int i12) {
        int size = list.size();
        if (i11 > i12) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than 0.");
        }
        if (i12 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is more than than the list size (" + size + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
