package p016o2;

import androidx.compose.foundation.layout.t;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.i;
import k3.p1;
import k3.s1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import p2.j;
import v1.y;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR&\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\r\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u000fR&\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lo2/o0;", "", "<init>", "()V", "Lw4/h;", "start", "top", "end", "bottom", "Lv1/y;", "a", "(FFFF)Lv1/y;", "b", Gender.FEMALE, "getMinHeight-D9Ej5fM", "()F", "MinHeight", "c", "getMinWidth-D9Ej5fM", "MinWidth", DateTokenConverter.CONVERTER_KEY, "getUnfocusedIndicatorThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "e", "getFocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "f", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "UnfocusedBorderThickness", "g", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f96037a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight = h.g(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = h.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedIndicatorThickness;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedIndicatorThickness;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedBorderThickness;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a implements s1, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.a f96044a;

        a(wn0.a aVar) {
            this.f96044a = aVar;
        }

        @Override // k3.s1
        public final /* synthetic */ long a() {
            return ((p1) this.f96044a.invoke()).getValue();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof s1) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return this.f96044a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        float fG = h.g(1);
        UnfocusedIndicatorThickness = fG;
        float fG2 = h.g(2);
        FocusedIndicatorThickness = fG2;
        UnfocusedBorderThickness = fG;
        FocusedBorderThickness = fG2;
    }

    private o0() {
    }

    public static /* synthetic */ y b(o0 o0Var, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = j.r();
        }
        if ((i11 & 2) != 0) {
            f12 = j.q();
        }
        if ((i11 & 4) != 0) {
            f13 = j.r();
        }
        if ((i11 & 8) != 0) {
            f14 = h.g(0);
        }
        return o0Var.a(f11, f12, f13, f14);
    }

    public final y a(float start, float top, float end, float bottom) {
        return t.d(start, top, end, bottom);
    }
}
