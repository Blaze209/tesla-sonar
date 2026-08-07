package i30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.h;
import com.stripe.android.paymentsheet.y;
import f90.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t*\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/y$b;", "", "", "", "b", "(Lcom/stripe/android/paymentsheet/y$b;)Ljava/util/Map;", "Lcom/stripe/android/paymentsheet/y$d;", "c", "(Lcom/stripe/android/paymentsheet/y$d;)Ljava/util/Map;", "", "Lcom/stripe/android/model/h;", "e", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/y$h;", "a", "(Lcom/stripe/android/paymentsheet/y$h;)Ljava/util/List;", "Lcom/stripe/android/paymentsheet/y$e;", "", "f", "(Lcom/stripe/android/paymentsheet/y$e;)Z", "Lcom/stripe/android/paymentsheet/y$o;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$o;)Ljava/lang/String;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: i30.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C1575a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75586a;

        static {
            int[] iArr = new int[y.o.values().length];
            try {
                iArr[y.o.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.o.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.o.Automatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75586a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/h;", "brand", "", "a", "(Lcom/stripe/android/model/h;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<h, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f75587c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(h brand) {
            s.k(brand, "brand");
            return brand.getCode();
        }
    }

    public static final List<String> a(y.Configuration configuration) {
        s.k(configuration, "<this>");
        List<String> listI = configuration.i();
        if (listI.isEmpty()) {
            listI = null;
        }
        if (listI != null) {
            return v.d1(listI, 10);
        }
        return null;
    }

    public static final Map<String, Object> b(y.Appearance appearance) {
        s.k(appearance, "<this>");
        y.PrimaryButton primaryButton = appearance.getPrimaryButton();
        y.PrimaryButtonColors colorsLight = appearance.getPrimaryButton().getColorsLight();
        y.PrimaryButtonColors.Companion companion = y.PrimaryButtonColors.INSTANCE;
        boolean z11 = true;
        Map mapM = v0.m(x.a("colorsLight", Boolean.valueOf(!s.f(colorsLight, companion.b()))), x.a("colorsDark", Boolean.valueOf(!s.f(appearance.getPrimaryButton().getColorsDark(), companion.a()))), x.a("corner_radius", Boolean.valueOf(primaryButton.getShape().getCornerRadiusDp() != null)), x.a("border_width", Boolean.valueOf(primaryButton.getShape().getBorderStrokeWidthDp() != null)), x.a("font", Boolean.valueOf(primaryButton.getTypography().getFontResId() != null)));
        y.Colors colorsLight2 = appearance.getColorsLight();
        y.Colors.Companion companion2 = y.Colors.INSTANCE;
        Pair pairA = x.a("colorsLight", Boolean.valueOf(!s.f(colorsLight2, companion2.b())));
        Pair pairA2 = x.a("colorsDark", Boolean.valueOf(!s.f(appearance.getColorsDark(), companion2.a())));
        float cornerRadiusDp = appearance.getShapes().getCornerRadiusDp();
        m mVar = m.f64661a;
        Map<String, Object> mapO = v0.o(pairA, pairA2, x.a("corner_radius", Boolean.valueOf(!(cornerRadiusDp == mVar.e().getCornerRadius()))), x.a("border_width", Boolean.valueOf(!(appearance.getShapes().getBorderStrokeWidthDp() == mVar.e().getBorderStrokeWidth()))), x.a("font", Boolean.valueOf(appearance.getTypography().getFontResId() != null)), x.a("size_scale_factor", Boolean.valueOf(!(appearance.getTypography().getSizeScaleFactor() == mVar.f().getFontSizeMultiplier()))), x.a("primary_button", mapM));
        boolean zContains = mapM.values().contains(Boolean.TRUE);
        Collection<Object> collectionValues = mapO.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof Boolean) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.contains(Boolean.TRUE) && !zContains) {
            z11 = false;
        }
        mapO.put("usage", Boolean.valueOf(z11));
        return mapO;
    }

    public static final Map<String, Object> c(y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
        s.k(billingDetailsCollectionConfiguration, "<this>");
        return v0.m(x.a("attach_defaults", Boolean.valueOf(billingDetailsCollectionConfiguration.getAttachDefaultsToPaymentMethod())), x.a("name", billingDetailsCollectionConfiguration.getName().name()), x.a(Scopes.EMAIL, billingDetailsCollectionConfiguration.getEmail().name()), x.a("phone", billingDetailsCollectionConfiguration.getPhone().name()), x.a(PlaceTypes.ADDRESS, billingDetailsCollectionConfiguration.getAddress().name()));
    }

    public static final String d(y.o oVar) {
        s.k(oVar, "<this>");
        int i11 = C1575a.f75586a[oVar.ordinal()];
        if (i11 == 1) {
            return "horizontal";
        }
        if (i11 == 2) {
            return "vertical";
        }
        if (i11 == 3) {
            return "automatic";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(List<? extends h> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return v.y0(list, null, null, null, 0, null, b.f75587c, 31, null);
        }
        return null;
    }

    public static final boolean f(y.e eVar) {
        s.k(eVar, "<this>");
        return !(eVar instanceof y.e.a);
    }
}
