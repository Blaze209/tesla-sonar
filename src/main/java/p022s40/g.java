package p022s40;

import ezvcard.property.Gender;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import w4.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Ls40/g;", "", "Lw4/h;", "size", "paddedSize", "<init>", "(Ljava/lang/String;IFF)V", Gender.FEMALE, "getSize-D9Ej5fM", "()F", "getPaddedSize-D9Ej5fM", "Large", "Medium", "Small", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum g {
    Large(h.g(64), h.g(32)),
    Medium(h.g(56), h.g(20)),
    Small(h.g(24), h.g(12));

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final float paddedSize;
    private final float size;

    g(float f11, float f12) {
        this.size = f11;
        this.paddedSize = f12;
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getPaddedSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPaddedSize() {
        return this.paddedSize;
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }
}
