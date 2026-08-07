package v3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0011"}, d2 = {"Lv3/j0;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int packedValue;

    private /* synthetic */ j0(int i11) {
        this.packedValue = i11;
    }

    public static final /* synthetic */ j0 a(int i11) {
        return new j0(i11);
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof j0) && i11 == ((j0) obj).getPackedValue();
    }

    public static int d(int i11) {
        return Integer.hashCode(i11);
    }

    public static String e(int i11) {
        return "PointerKeyboardModifiers(packedValue=" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return d(this.packedValue);
    }

    public String toString() {
        return e(this.packedValue);
    }

    public static int b(int i11) {
        return i11;
    }
}
