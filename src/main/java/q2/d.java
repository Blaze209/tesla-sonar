package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001d\u0010\u0011\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001d\u0010\u001a\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u001e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u0019\u0010\rR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010#\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b\u001b\u0010\rR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00100\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b\"\u0010\rR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010A\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\b\u001d\u0010\rR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Lq2/d;", "", "<init>", "()V", "Lq2/b;", "b", "Lq2/b;", "a", "()Lq2/b;", "ContainerColor", "Lw4/h;", "c", Gender.FEMALE, "()F", "ContainerElevation", DateTokenConverter.CONVERTER_KEY, "getContainerHeight-D9Ej5fM", "ContainerHeight", "Lq2/i;", "e", "Lq2/i;", "()Lq2/i;", "ContainerShape", "f", "DisabledContainerColor", "g", "DisabledContainerElevation", "h", "DisabledLabelTextColor", IntegerTokenConverter.CONVERTER_KEY, "FocusContainerElevation", "j", "getFocusLabelTextColor", "FocusLabelTextColor", "k", "HoverContainerElevation", "l", "getHoverLabelTextColor", "HoverLabelTextColor", "m", "LabelTextColor", "Lq2/o;", "n", "Lq2/o;", "getLabelTextFont", "()Lq2/o;", "LabelTextFont", "o", "PressedContainerElevation", "p", "getPressedLabelTextColor", "PressedLabelTextColor", "q", "getDisabledIconColor", "DisabledIconColor", "r", "getFocusIconColor", "FocusIconColor", "s", "getHoverIconColor", "HoverIconColor", "t", "getIconColor", "IconColor", "u", "IconSize", "v", "getPressedIconColor", "PressedIconColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f104412a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b ContainerColor = b.Primary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final i ContainerShape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float DisabledContainerElevation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledLabelTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float FocusContainerElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b FocusLabelTextColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float HoverContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b HoverLabelTextColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final b LabelTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final o LabelTextFont;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final float PressedContainerElevation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final b PressedLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final b FocusIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final b HoverIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final b IconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final b PressedIconColor;

    static {
        c cVar = c.f104405a;
        ContainerElevation = cVar.a();
        ContainerHeight = w4.h.g((float) 40.0d);
        ContainerShape = i.CornerFull;
        b bVar = b.OnSurface;
        DisabledContainerColor = bVar;
        DisabledContainerElevation = cVar.a();
        DisabledLabelTextColor = bVar;
        FocusContainerElevation = cVar.a();
        b bVar2 = b.OnPrimary;
        FocusLabelTextColor = bVar2;
        HoverContainerElevation = cVar.b();
        HoverLabelTextColor = bVar2;
        LabelTextColor = bVar2;
        LabelTextFont = o.LabelLarge;
        PressedContainerElevation = cVar.a();
        PressedLabelTextColor = bVar2;
        DisabledIconColor = bVar;
        FocusIconColor = bVar2;
        HoverIconColor = bVar2;
        IconColor = bVar2;
        IconSize = w4.h.g((float) 18.0d);
        PressedIconColor = bVar2;
    }

    private d() {
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

    public final b f() {
        return DisabledLabelTextColor;
    }

    public final float g() {
        return FocusContainerElevation;
    }

    public final float h() {
        return HoverContainerElevation;
    }

    public final float i() {
        return IconSize;
    }

    public final b j() {
        return LabelTextColor;
    }

    public final float k() {
        return PressedContainerElevation;
    }
}
