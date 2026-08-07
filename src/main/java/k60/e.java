package k60;

import a2.RoundedCornerShape;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.PlatformTextStyle;
import i4.TextStyle;
import k3.Shadow;
import k3.g4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.q;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;
import t4.j;
import t4.k;
import t4.l;
import t4.s;
import w4.h;
import w4.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0012¨\u0006\u0013"}, d2 = {"Lk60/e;", "", "<init>", "()V", "Lk3/g4;", "b", "()Lk3/g4;", "shape", "Landroidx/compose/ui/d;", "a", "()Landroidx/compose/ui/d;", "iconModifier", "c", "textModifier", "Li4/r0;", DateTokenConverter.CONVERTER_KEY, "()Li4/r0;", "textStyle", "Lk60/e$a;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Lk60/e$a;", "Lk60/e;", "<init>", "()V", "La2/f;", "b", "La2/f;", "e", "()La2/f;", "shape", "Landroidx/compose/ui/d;", "c", "Landroidx/compose/ui/d;", "a", "()Landroidx/compose/ui/d;", "iconModifier", DateTokenConverter.CONVERTER_KEY, "textModifier", "Li4/r0;", "Li4/r0;", "()Li4/r0;", "textStyle", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f85138a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final RoundedCornerShape shape = a2.g.c(h.g(8));

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final androidx.compose.ui.d iconModifier;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final androidx.compose.ui.d textModifier;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final TextStyle textStyle;

        static {
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f11 = 12;
            iconModifier = x.q(t.j(companion, h.g(10), h.g(f11)), h.g(20));
            textModifier = t.m(companion, BitmapDescriptorFactory.HUE_RED, h.g(f11), h.g(f11), h.g(f11), 1, null);
            textStyle = new TextStyle(0L, w.h(14), FontWeight.INSTANCE.d(), (b0) null, (c0) null, q.INSTANCE.a(), (String) null, 0L, (t4.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (m3.g) null, (j) null, (l) null, w.h(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (t4.f) null, (t4.e) null, (s) null, 16646105, (DefaultConstructorMarker) null);
        }

        private a() {
            super(null);
        }

        @Override // k60.e
        public androidx.compose.ui.d a() {
            return iconModifier;
        }

        @Override // k60.e
        public androidx.compose.ui.d c() {
            return textModifier;
        }

        @Override // k60.e
        public TextStyle d() {
            return textStyle;
        }

        @Override // k60.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public RoundedCornerShape b() {
            return shape;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract androidx.compose.ui.d a();

    public abstract g4 b();

    public abstract androidx.compose.ui.d c();

    public abstract TextStyle d();

    private e() {
    }
}
