package vl;

import android.graphics.Bitmap;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvl/l;", "", "Ltk/a;", "Landroid/graphics/Bitmap;", "bitmapRef", "Lvl/l$a;", "type", "<init>", "(Ltk/a;Lvl/l$a;)V", "a", "Ltk/a;", "()Ltk/a;", "b", "Lvl/l$a;", "()Lvl/l$a;", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tk.a<Bitmap> bitmapRef;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lvl/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "NEAREST", "MISSING", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        SUCCESS,
        NEAREST,
        MISSING;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    public l(tk.a<Bitmap> aVar, a type) {
        s.k(type, "type");
        this.bitmapRef = aVar;
        this.type = type;
    }

    public final tk.a<Bitmap> a() {
        return this.bitmapRef;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getType() {
        return this.type;
    }
}
