package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010 \u001a\u00020\u001b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\n\u0010$R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u001d\u00103\u001a\u00020\u001b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001fR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u00108\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u0010\u0012\u001a\u0004\b7\u0010\u0014R\u001d\u0010;\u001a\u00020\u001b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010\u001fR\u001d\u0010>\u001a\u00020\u001b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Lq2/k;", "", "<init>", "()V", "Lq2/b;", "b", "Lq2/b;", "getActionFocusLabelTextColor", "()Lq2/b;", "ActionFocusLabelTextColor", "c", "getActionHoverLabelTextColor", "ActionHoverLabelTextColor", DateTokenConverter.CONVERTER_KEY, "a", "ActionLabelTextColor", "Lq2/o;", "e", "Lq2/o;", "getActionLabelTextFont", "()Lq2/o;", "ActionLabelTextFont", "f", "getActionPressedLabelTextColor", "ActionPressedLabelTextColor", "g", "ContainerColor", "Lw4/h;", "h", Gender.FEMALE, "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Lq2/i;", IntegerTokenConverter.CONVERTER_KEY, "Lq2/i;", "()Lq2/i;", "ContainerShape", "j", "IconColor", "k", "getFocusIconColor", "FocusIconColor", "l", "getHoverIconColor", "HoverIconColor", "m", "getPressedIconColor", "PressedIconColor", "n", "getIconSize-D9Ej5fM", "IconSize", "o", "SupportingTextColor", "p", "getSupportingTextFont", "SupportingTextFont", "q", "getSingleLineContainerHeight-D9Ej5fM", "SingleLineContainerHeight", "r", "getTwoLinesContainerHeight-D9Ej5fM", "TwoLinesContainerHeight", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f104558a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b ActionFocusLabelTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final b ActionHoverLabelTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final b ActionLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final o ActionLabelTextFont;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b ActionPressedLabelTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final b ContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final i ContainerShape;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b IconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final b FocusIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b HoverIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final b PressedIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final b SupportingTextColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final o SupportingTextFont;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final float SingleLineContainerHeight;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final float TwoLinesContainerHeight;

    static {
        b bVar = b.InversePrimary;
        ActionFocusLabelTextColor = bVar;
        ActionHoverLabelTextColor = bVar;
        ActionLabelTextColor = bVar;
        ActionLabelTextFont = o.LabelLarge;
        ActionPressedLabelTextColor = bVar;
        ContainerColor = b.InverseSurface;
        ContainerElevation = c.f104405a.c();
        ContainerShape = i.CornerExtraSmall;
        b bVar2 = b.InverseOnSurface;
        IconColor = bVar2;
        FocusIconColor = bVar2;
        HoverIconColor = bVar2;
        PressedIconColor = bVar2;
        IconSize = w4.h.g((float) 24.0d);
        SupportingTextColor = bVar2;
        SupportingTextFont = o.BodyMedium;
        SingleLineContainerHeight = w4.h.g((float) 48.0d);
        TwoLinesContainerHeight = w4.h.g((float) 68.0d);
    }

    private k() {
    }

    public final b a() {
        return ActionLabelTextColor;
    }

    public final b b() {
        return ContainerColor;
    }

    public final i c() {
        return ContainerShape;
    }

    public final b d() {
        return IconColor;
    }

    public final b e() {
        return SupportingTextColor;
    }
}
