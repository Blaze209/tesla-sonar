package p009i2;

import androidx.compose.foundation.layout.t;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import v1.y;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Li2/f;", "", "<init>", "()V", "Lw4/h;", "b", Gender.FEMALE, "()F", "TopAppBarElevation", "c", "getBottomAppBarElevation-D9Ej5fM", "BottomAppBarElevation", "Lv1/y;", DateTokenConverter.CONVERTER_KEY, "Lv1/y;", "a", "()Lv1/y;", "ContentPadding", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f74335a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TopAppBarElevation = h.g(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float BottomAppBarElevation = h.g(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final y ContentPadding = t.e(C4671g.f74342b, BitmapDescriptorFactory.HUE_RED, C4671g.f74342b, BitmapDescriptorFactory.HUE_RED, 10, null);

    private f() {
    }

    public final y a() {
        return ContentPadding;
    }

    public final float b() {
        return TopAppBarElevation;
    }
}
