package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0017\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00188\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\u001c\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\rR\u001d\u0010\u001e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001b\u0010\rR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010#\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b\u001d\u0010\rR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u001d\u0010)\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\rR\u001d\u0010+\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b\u001f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Lq2/e;", "", "<init>", "()V", "Lq2/b;", "b", "Lq2/b;", "a", "()Lq2/b;", "ContainerColor", "Lw4/h;", "c", Gender.FEMALE, "()F", "ContainerElevation", "Lq2/i;", DateTokenConverter.CONVERTER_KEY, "Lq2/i;", "()Lq2/i;", "ContainerShape", "e", "DisabledContainerColor", "f", "DisabledContainerElevation", "", "g", "DisabledContainerOpacity", "h", "DraggedContainerElevation", IntegerTokenConverter.CONVERTER_KEY, "FocusContainerElevation", "j", "getFocusIndicatorColor", "FocusIndicatorColor", "k", "HoverContainerElevation", "l", "getIconColor", "IconColor", "m", "getIconSize-D9Ej5fM", "IconSize", "n", "PressedContainerElevation", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f104434a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b ContainerColor = b.SurfaceContainerHighest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final i ContainerShape;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerOpacity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float DraggedContainerElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float FocusContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b FocusIndicatorColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float HoverContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b IconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float PressedContainerElevation;

    static {
        c cVar = c.f104405a;
        ContainerElevation = cVar.a();
        ContainerShape = i.CornerMedium;
        DisabledContainerColor = b.SurfaceVariant;
        DisabledContainerElevation = cVar.a();
        DisabledContainerOpacity = 0.38f;
        DraggedContainerElevation = cVar.c();
        FocusContainerElevation = cVar.a();
        FocusIndicatorColor = b.Secondary;
        HoverContainerElevation = cVar.b();
        IconColor = b.Primary;
        IconSize = w4.h.g((float) 24.0d);
        PressedContainerElevation = cVar.a();
    }

    private e() {
    }

    public final b a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerElevation;
    }

    public final i c() {
        return ContainerShape;
    }

    public final b d() {
        return DisabledContainerColor;
    }

    public final float e() {
        return DisabledContainerElevation;
    }

    public final float f() {
        return DisabledContainerOpacity;
    }

    public final float g() {
        return DraggedContainerElevation;
    }

    public final float h() {
        return FocusContainerElevation;
    }

    public final float i() {
        return HoverContainerElevation;
    }

    public final float j() {
        return PressedContainerElevation;
    }
}
