package sb0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tesla.dashcam_viewer.c0;
import com.tesla.dashcam_viewer.d0;
import com.tesla.dashcam_viewer.e0;
import com.tesla.dashcam_viewer.o1;
import com.tesla.dashcam_viewer.x;
import java.util.Locale;
import java.util.WeakHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(¨\u0006+"}, d2 = {"Lsb0/f;", "", "<init>", "()V", "Landroid/widget/LinearLayout;", "seiContainer", "Lsb0/f$b;", "c", "(Landroid/widget/LinearLayout;)Lsb0/f$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsb0/f$a;", "b", "(Landroid/content/Context;)Lsb0/f$a;", "Landroid/widget/ImageView;", "turnSignal", "", "isOn", "", "presentationTimeUs", "Ljn0/h0;", "g", "(Landroid/widget/ImageView;ZJ)V", "Landroid/view/View;", "fillView", "", "position", "isForEncoding", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;FZ)V", "speed", "useKph", "", "a", "(FZ)Ljava/lang/String;", "Lsb0/c;", "data", "e", "(Landroid/widget/LinearLayout;Lsb0/c;ZJ)V", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "viewCache", "colorCache", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f111040a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final WeakHashMap<LinearLayout, CachedViews> viewCache = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final WeakHashMap<Context, CachedColors> colorCache = new WeakHashMap<>();

    /* JADX INFO: renamed from: sb0.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0017"}, d2 = {"Lsb0/f$a;", "", "", "red", "grey", "text", "fsd", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", DateTokenConverter.CONVERTER_KEY, "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class CachedColors {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int red;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int grey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int text;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int fsd;

        public CachedColors(int i11, int i12, int i13, int i14) {
            this.red = i11;
            this.grey = i12;
            this.text = i13;
            this.fsd = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFsd() {
            return this.fsd;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getGrey() {
            return this.grey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getRed() {
            return this.red;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedColors)) {
                return false;
            }
            CachedColors cachedColors = (CachedColors) other;
            return this.red == cachedColors.red && this.grey == cachedColors.grey && this.text == cachedColors.text && this.fsd == cachedColors.fsd;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.red) * 31) + Integer.hashCode(this.grey)) * 31) + Integer.hashCode(this.text)) * 31) + Integer.hashCode(this.fsd);
        }

        public String toString() {
            return "CachedColors(red=" + this.red + ", grey=" + this.grey + ", text=" + this.text + ", fsd=" + this.fsd + ")";
        }
    }

    /* JADX INFO: renamed from: sb0.f$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006)"}, d2 = {"Lsb0/f$b;", "", "Landroid/widget/ImageView;", "brakePaddle", "Landroid/widget/TextView;", "gearText", "speedText", "fsdText", "turnSignalLeft", "turnSignalRight", "steeringWheel", "acceleratorPedal", "Landroid/view/View;", "acceleratorFill", "<init>", "(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/view/View;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/widget/ImageView;", "c", "()Landroid/widget/ImageView;", "b", "Landroid/widget/TextView;", "e", "()Landroid/widget/TextView;", "f", DateTokenConverter.CONVERTER_KEY, "h", IntegerTokenConverter.CONVERTER_KEY, "g", "Landroid/view/View;", "()Landroid/view/View;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class CachedViews {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageView brakePaddle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextView gearText;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextView speedText;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextView fsdText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageView turnSignalLeft;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageView turnSignalRight;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageView steeringWheel;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageView acceleratorPedal;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final View acceleratorFill;

        public CachedViews(ImageView brakePaddle, TextView gearText, TextView speedText, TextView fsdText, ImageView turnSignalLeft, ImageView turnSignalRight, ImageView steeringWheel, ImageView acceleratorPedal, View acceleratorFill) {
            s.k(brakePaddle, "brakePaddle");
            s.k(gearText, "gearText");
            s.k(speedText, "speedText");
            s.k(fsdText, "fsdText");
            s.k(turnSignalLeft, "turnSignalLeft");
            s.k(turnSignalRight, "turnSignalRight");
            s.k(steeringWheel, "steeringWheel");
            s.k(acceleratorPedal, "acceleratorPedal");
            s.k(acceleratorFill, "acceleratorFill");
            this.brakePaddle = brakePaddle;
            this.gearText = gearText;
            this.speedText = speedText;
            this.fsdText = fsdText;
            this.turnSignalLeft = turnSignalLeft;
            this.turnSignalRight = turnSignalRight;
            this.steeringWheel = steeringWheel;
            this.acceleratorPedal = acceleratorPedal;
            this.acceleratorFill = acceleratorFill;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final View getAcceleratorFill() {
            return this.acceleratorFill;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getAcceleratorPedal() {
            return this.acceleratorPedal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageView getBrakePaddle() {
            return this.brakePaddle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getFsdText() {
            return this.fsdText;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getGearText() {
            return this.gearText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedViews)) {
                return false;
            }
            CachedViews cachedViews = (CachedViews) other;
            return s.f(this.brakePaddle, cachedViews.brakePaddle) && s.f(this.gearText, cachedViews.gearText) && s.f(this.speedText, cachedViews.speedText) && s.f(this.fsdText, cachedViews.fsdText) && s.f(this.turnSignalLeft, cachedViews.turnSignalLeft) && s.f(this.turnSignalRight, cachedViews.turnSignalRight) && s.f(this.steeringWheel, cachedViews.steeringWheel) && s.f(this.acceleratorPedal, cachedViews.acceleratorPedal) && s.f(this.acceleratorFill, cachedViews.acceleratorFill);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getSpeedText() {
            return this.speedText;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ImageView getSteeringWheel() {
            return this.steeringWheel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ImageView getTurnSignalLeft() {
            return this.turnSignalLeft;
        }

        public int hashCode() {
            return (((((((((((((((this.brakePaddle.hashCode() * 31) + this.gearText.hashCode()) * 31) + this.speedText.hashCode()) * 31) + this.fsdText.hashCode()) * 31) + this.turnSignalLeft.hashCode()) * 31) + this.turnSignalRight.hashCode()) * 31) + this.steeringWheel.hashCode()) * 31) + this.acceleratorPedal.hashCode()) * 31) + this.acceleratorFill.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ImageView getTurnSignalRight() {
            return this.turnSignalRight;
        }

        public String toString() {
            return "CachedViews(brakePaddle=" + this.brakePaddle + ", gearText=" + this.gearText + ", speedText=" + this.speedText + ", fsdText=" + this.fsdText + ", turnSignalLeft=" + this.turnSignalLeft + ", turnSignalRight=" + this.turnSignalRight + ", steeringWheel=" + this.steeringWheel + ", acceleratorPedal=" + this.acceleratorPedal + ", acceleratorFill=" + this.acceleratorFill + ")";
        }
    }

    private f() {
    }

    private final String a(float speed, boolean useKph) {
        String str = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.SHORT).format(new Measure(Double.valueOf((int) speed), useKph ? MeasureUnit.KILOMETER_PER_HOUR : MeasureUnit.MILE_PER_HOUR));
        s.j(str, "format(...)");
        Locale locale = Locale.getDefault();
        s.j(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private final CachedColors b(Context context) {
        WeakHashMap<Context, CachedColors> weakHashMap = colorCache;
        CachedColors cachedColors = weakHashMap.get(context);
        if (cachedColors == null) {
            cachedColors = new CachedColors(androidx.core.content.b.getColor(context, c0.f55784c), androidx.core.content.b.getColor(context, c0.f55783b), androidx.core.content.b.getColor(context, c0.f55785d), androidx.core.content.b.getColor(context, c0.f55782a));
            weakHashMap.put(context, cachedColors);
        }
        return cachedColors;
    }

    private final CachedViews c(LinearLayout seiContainer) {
        WeakHashMap<LinearLayout, CachedViews> weakHashMap = viewCache;
        CachedViews cachedViews = weakHashMap.get(seiContainer);
        if (cachedViews == null) {
            View viewFindViewById = seiContainer.findViewById(e0.f55812d);
            s.j(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = seiContainer.findViewById(e0.f55814f);
            s.j(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = seiContainer.findViewById(e0.f55818j);
            s.j(viewFindViewById3, "findViewById(...)");
            View viewFindViewById4 = seiContainer.findViewById(e0.f55813e);
            s.j(viewFindViewById4, "findViewById(...)");
            View viewFindViewById5 = seiContainer.findViewById(e0.f55823o);
            s.j(viewFindViewById5, "findViewById(...)");
            View viewFindViewById6 = seiContainer.findViewById(e0.f55824p);
            s.j(viewFindViewById6, "findViewById(...)");
            View viewFindViewById7 = seiContainer.findViewById(e0.f55820l);
            s.j(viewFindViewById7, "findViewById(...)");
            View viewFindViewById8 = seiContainer.findViewById(e0.f55810b);
            s.j(viewFindViewById8, "findViewById(...)");
            View viewFindViewById9 = seiContainer.findViewById(e0.f55809a);
            s.j(viewFindViewById9, "findViewById(...)");
            CachedViews cachedViews2 = new CachedViews((ImageView) viewFindViewById, (TextView) viewFindViewById2, (TextView) viewFindViewById3, (TextView) viewFindViewById4, (ImageView) viewFindViewById5, (ImageView) viewFindViewById6, (ImageView) viewFindViewById7, (ImageView) viewFindViewById8, viewFindViewById9);
            weakHashMap.put(seiContainer, cachedViews2);
            cachedViews = cachedViews2;
        }
        return cachedViews;
    }

    private final void d(View fillView, float position, boolean isForEncoding) {
        float fM = n.m(position, BitmapDescriptorFactory.HUE_RED, 1.0f);
        int measuredHeight = isForEncoding ? fillView.getMeasuredHeight() : fillView.getHeight();
        fillView.setClipBounds(new Rect(0, measuredHeight - ((int) (measuredHeight * fM)), isForEncoding ? fillView.getMeasuredWidth() : fillView.getWidth(), measuredHeight));
    }

    public static /* synthetic */ void f(f fVar, LinearLayout linearLayout, SEIMetadataProcessed sEIMetadataProcessed, boolean z11, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            j11 = 0;
        }
        fVar.e(linearLayout, sEIMetadataProcessed, z12, j11);
    }

    private final void g(ImageView turnSignal, boolean isOn, long presentationTimeUs) {
        if (!isOn) {
            turnSignal.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            turnSignal.setAlpha(0.3f);
        } else {
            float f11 = (presentationTimeUs / ((long) 500000)) % ((long) 2) == 0 ? 1.0f : 0.55f;
            turnSignal.clearColorFilter();
            turnSignal.setAlpha(f11);
        }
    }

    public final void e(LinearLayout seiContainer, SEIMetadataProcessed data, boolean isForEncoding, long presentationTimeUs) {
        s.k(seiContainer, "seiContainer");
        s.k(data, "data");
        Context context = seiContainer.getContext();
        if (!isForEncoding && (!data.getHasData() || o1.f55932a.m())) {
            seiContainer.setVisibility(4);
            return;
        }
        if (!isForEncoding) {
            seiContainer.setVisibility(0);
        }
        CachedViews cachedViewsC = c(seiContainer);
        s.h(context);
        CachedColors cachedColorsB = b(context);
        cachedViewsC.getBrakePaddle().setImageResource(data.getBrakeApplied() ? d0.f55791c : d0.f55792d);
        Drawable background = cachedViewsC.getBrakePaddle().getBackground();
        Drawable drawableMutate = background != null ? background.mutate() : null;
        if (drawableMutate instanceof GradientDrawable) {
            ((GradientDrawable) drawableMutate).setColor(data.getBrakeApplied() ? cachedColorsB.getRed() : cachedColorsB.getGrey());
        }
        TextView gearText = cachedViewsC.getGearText();
        String gear = data.getGear();
        if (gear.length() == 0) {
            gear = "-";
        }
        gearText.setText(gear);
        cachedViewsC.getGearText().setTextColor(data.getSelfDriving() ? cachedColorsB.getFsd() : cachedColorsB.getText());
        x xVar = x.f56132a;
        cachedViewsC.getSpeedText().setText(a(xVar.e() ? data.getVehicleSpeedKph() : data.getVehicleSpeedMph(), xVar.e()));
        cachedViewsC.getFsdText().setVisibility(data.getSelfDriving() ? 0 : 8);
        if (data.getSelfDriving()) {
            cachedViewsC.getFsdText().setText(context.getString(bc0.a.J));
        }
        if (isForEncoding) {
            g(cachedViewsC.getTurnSignalLeft(), data.getBlinkerLeft(), presentationTimeUs);
            g(cachedViewsC.getTurnSignalRight(), data.getBlinkerRight(), presentationTimeUs);
        }
        cachedViewsC.getSteeringWheel().setRotation(data.getSteeringAngle());
        Drawable background2 = cachedViewsC.getSteeringWheel().getBackground();
        Drawable drawableMutate2 = background2 != null ? background2.mutate() : null;
        if (drawableMutate2 instanceof GradientDrawable) {
            ((GradientDrawable) drawableMutate2).setColor(data.getAutoSteer() ? cachedColorsB.getFsd() : cachedColorsB.getGrey());
        }
        cachedViewsC.getAcceleratorPedal().setImageResource(data.getPedalPosition() > BitmapDescriptorFactory.HUE_RED ? d0.f55789a : d0.f55790b);
        d(cachedViewsC.getAcceleratorFill(), data.getPedalPosition(), isForEncoding);
    }
}
