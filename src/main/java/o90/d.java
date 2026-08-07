package o90;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lo90/d;", "", "", "", "suffixes", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "<init>", "(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V", "Ljava/util/List;", "getSuffixes", "()Ljava/util/List;", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "Companion", "a", "PNG", "WEBP", "JPEG", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum d {
    PNG(v.e("png"), Bitmap.CompressFormat.PNG),
    WEBP(v.e("webp"), Bitmap.CompressFormat.WEBP),
    JPEG(v.p("jpeg", "jpg"), Bitmap.CompressFormat.JPEG);

    private final Bitmap.CompressFormat compressFormat;
    private final List<String> suffixes;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o90.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo90/d$a;", "", "<init>", "()V", "", ImagesContract.URL, "Lo90/d;", "a", "(Ljava/lang/String;)Lo90/d;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String url) {
            d next;
            s.k(url, "url");
            Iterator<d> it = d.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                List<String> suffixes = next.getSuffixes();
                if (!(suffixes instanceof Collection) || !suffixes.isEmpty()) {
                    Iterator<T> it2 = suffixes.iterator();
                    while (it2.hasNext()) {
                        if (t.K(url, (String) it2.next(), true)) {
                            return next;
                        }
                    }
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    d(List list, Bitmap.CompressFormat compressFormat) {
        this.suffixes = list;
        this.compressFormat = compressFormat;
    }

    public static EnumEntries<d> getEntries() {
        return $ENTRIES;
    }

    public final Bitmap.CompressFormat getCompressFormat() {
        return this.compressFormat;
    }

    public final List<String> getSuffixes() {
        return this.suffixes;
    }
}
