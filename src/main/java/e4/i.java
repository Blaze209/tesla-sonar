package e4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "id", "", "c", "(ILr2/l;I)Ljava/lang/String;", "", "", "formatArgs", DateTokenConverter.CONVERTER_KEY, "(I[Ljava/lang/Object;Lr2/l;I)Ljava/lang/String;", "count", "a", "(IILr2/l;I)Ljava/lang/String;", "b", "(II[Ljava/lang/Object;Lr2/l;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final String a(int i11, int i12, l lVar, int i13) {
        if (o.J()) {
            o.S(1784741530, i13, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = h.a(lVar, 0).getQuantityString(i11, i12);
        if (o.J()) {
            o.R();
        }
        return quantityString;
    }

    public static final String b(int i11, int i12, Object[] objArr, l lVar, int i13) {
        if (o.J()) {
            o.S(523207213, i13, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = h.a(lVar, 0).getQuantityString(i11, i12, Arrays.copyOf(objArr, objArr.length));
        if (o.J()) {
            o.R();
        }
        return quantityString;
    }

    public static final String c(int i11, l lVar, int i12) {
        if (o.J()) {
            o.S(1223887937, i12, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = h.a(lVar, 0).getString(i11);
        if (o.J()) {
            o.R();
        }
        return string;
    }

    public static final String d(int i11, Object[] objArr, l lVar, int i12) {
        if (o.J()) {
            o.S(2071230100, i12, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = h.a(lVar, 0).getString(i11, Arrays.copyOf(objArr, objArr.length));
        if (o.J()) {
            o.R();
        }
        return string;
    }
}
