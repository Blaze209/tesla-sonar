package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lq2/f;", "", "<init>", "()V", "Lq2/b;", "b", "Lq2/b;", "getDisabledIconColor", "()Lq2/b;", "DisabledIconColor", "Lw4/h;", "c", Gender.FEMALE, "a", "()F", "IconSize", DateTokenConverter.CONVERTER_KEY, "getSelectedFocusIconColor", "SelectedFocusIconColor", "e", "getSelectedHoverIconColor", "SelectedHoverIconColor", "f", "getSelectedIconColor", "SelectedIconColor", "g", "getSelectedPressedIconColor", "SelectedPressedIconColor", "Lq2/i;", "h", "Lq2/i;", "getStateLayerShape", "()Lq2/i;", "StateLayerShape", IntegerTokenConverter.CONVERTER_KEY, "getStateLayerSize-D9Ej5fM", "StateLayerSize", "j", "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "k", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", "l", "getUnselectedIconColor", "UnselectedIconColor", "m", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f104448a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledIconColor = b.OnSurface;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = w4.h.g((float) 24.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedFocusIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedHoverIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedPressedIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final i StateLayerShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float StateLayerSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedFocusIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedHoverIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedIconColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedPressedIconColor;

    static {
        b bVar = b.Primary;
        SelectedFocusIconColor = bVar;
        SelectedHoverIconColor = bVar;
        SelectedIconColor = bVar;
        SelectedPressedIconColor = bVar;
        StateLayerShape = i.CornerFull;
        StateLayerSize = w4.h.g((float) 40.0d);
        b bVar2 = b.OnSurfaceVariant;
        UnselectedFocusIconColor = bVar2;
        UnselectedHoverIconColor = bVar2;
        UnselectedIconColor = bVar2;
        UnselectedPressedIconColor = bVar2;
    }

    private f() {
    }

    public final float a() {
        return IconSize;
    }
}
