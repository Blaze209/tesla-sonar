package p009i2;

import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p019p1.e1;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Li2/v1;", "", "<init>", "()V", "Lw4/h;", "b", Gender.FEMALE, "a", "()F", "StrokeWidth", "Lp1/e1;", "", "c", "Lp1/e1;", "getProgressAnimationSpec", "()Lp1/e1;", "ProgressAnimationSpec", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f75309a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float StrokeWidth = h.g(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final e1<Float> ProgressAnimationSpec = new e1<>(1.0f, 50.0f, Float.valueOf(0.001f));

    private v1() {
    }

    public final float a() {
        return StrokeWidth;
    }
}
