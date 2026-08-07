package j4;

import android.text.Spanned;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\t\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "a", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "", "startInclusive", "endExclusive", "b", "(Landroid/text/Spanned;Ljava/lang/Class;II)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {
    public static final boolean a(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(Spanned spanned, Class<?> cls, int i11, int i12) {
        return spanned.nextSpanTransition(i11 - 1, i12, cls) != i12;
    }
}
