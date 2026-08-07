package d3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u0005\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\bR \u0010$\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"R \u0010(\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\"¨\u0006)"}, d2 = {"Ld3/a;", "", "<init>", "()V", "Ld3/c;", "b", "Ld3/c;", "a", "()Ld3/c;", "getTopLeft$annotations", "TopLeft", "c", "getTopRight$annotations", "TopRight", DateTokenConverter.CONVERTER_KEY, "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "e", "getCenterRight", "getCenterRight$annotations", "CenterRight", "f", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "g", "getBottomRight", "getBottomRight$annotations", "BottomRight", "Ld3/c$b;", "h", "Ld3/c$b;", "getLeft", "()Ld3/c$b;", "getLeft$annotations", "Left", IntegerTokenConverter.CONVERTER_KEY, "getRight", "getRight$annotations", "Right", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59254a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final c TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final c TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final c CenterLeft = new BiasAbsoluteAlignment(-1.0f, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final c CenterRight = new BiasAbsoluteAlignment(1.0f, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final c BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final c BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final c.b Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final c.b Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    private a() {
    }

    public final c a() {
        return TopLeft;
    }

    public final c b() {
        return TopRight;
    }
}
