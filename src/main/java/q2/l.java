package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0013R\u0017\u0010(\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0013R\u0017\u0010+\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0013R\u0017\u0010.\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0013R\u0017\u00101\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u0010\u0012\u001a\u0004\b0\u0010\u0013R\u001d\u00104\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00107\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lq2/l;", "", "<init>", "()V", "Lw4/h;", "b", Gender.FEMALE, "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Lq2/i;", "c", "Lq2/i;", "a", "()Lq2/i;", "ContainerShape", "Lq2/b;", DateTokenConverter.CONVERTER_KEY, "Lq2/b;", "()Lq2/b;", "DisabledLabelTextColor", "e", "getFocusLabelTextColor", "FocusLabelTextColor", "f", "getHoverLabelTextColor", "HoverLabelTextColor", "g", "LabelTextColor", "Lq2/o;", "h", "Lq2/o;", "getLabelTextFont", "()Lq2/o;", "LabelTextFont", IntegerTokenConverter.CONVERTER_KEY, "getPressedLabelTextColor", "PressedLabelTextColor", "j", "getDisabledIconColor", "DisabledIconColor", "k", "getFocusIconColor", "FocusIconColor", "l", "getHoverIconColor", "HoverIconColor", "m", "getIconColor", "IconColor", "n", "getIconSize-D9Ej5fM", "IconSize", "o", "getPressedIconColor", "PressedIconColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f104576a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerHeight = w4.h.g((float) 40.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final i ContainerShape = i.CornerFull;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final b FocusLabelTextColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b HoverLabelTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final b LabelTextColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final o LabelTextFont;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final b PressedLabelTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final b FocusIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b HoverIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final b IconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final b PressedIconColor;

    static {
        b bVar = b.OnSurface;
        DisabledLabelTextColor = bVar;
        b bVar2 = b.Primary;
        FocusLabelTextColor = bVar2;
        HoverLabelTextColor = bVar2;
        LabelTextColor = bVar2;
        LabelTextFont = o.LabelLarge;
        PressedLabelTextColor = bVar2;
        DisabledIconColor = bVar;
        FocusIconColor = bVar2;
        HoverIconColor = bVar2;
        IconColor = bVar2;
        IconSize = w4.h.g((float) 18.0d);
        PressedIconColor = bVar2;
    }

    private l() {
    }

    public final i a() {
        return ContainerShape;
    }

    public final b b() {
        return DisabledLabelTextColor;
    }

    public final b c() {
        return LabelTextColor;
    }
}
