package oi0;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.WriterException;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loi0/i4;", "Loi0/p5;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "config", "Landroid/widget/ImageView;", "b", "(Loi0/i4;Loi0/p5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;)Landroid/widget/ImageView;", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k4 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97654a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97654a = iArr;
        }
    }

    public static final ImageView b(QRCodeComponent qRCodeComponent, p5 uiComponentHelper, final QRCode config) {
        String value;
        p013kotlin.jvm.internal.s.k(qRCodeComponent, "<this>");
        p013kotlin.jvm.internal.s.k(uiComponentHelper, "uiComponentHelper");
        p013kotlin.jvm.internal.s.k(config, "config");
        QRCode.Attributes attributes = config.getAttributes();
        if (attributes != null && (value = attributes.getValue()) != null) {
            int width = qRCodeComponent.getWidth();
            HashMap map = new HashMap();
            map.put(com.google.zxing.b.MARGIN, 0);
            try {
                iy.b bVarA = new ky.a().a(value, com.google.zxing.a.QR_CODE, width, width, map);
                Integer strokeColor = config.getStrokeColor();
                int iIntValue = strokeColor != null ? strokeColor.intValue() : -16777216;
                Integer fillColor = config.getFillColor();
                int iIntValue2 = fillColor != null ? fillColor.intValue() : -1;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
                for (int i11 = 0; i11 < width; i11++) {
                    for (int i12 = 0; i12 < width; i12++) {
                        bitmapCreateBitmap.setPixel(i11, i12, bVarA.c(i11, i12) ? iIntValue : iIntValue2);
                    }
                }
                p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "also(...)");
                final ImageView imageView = new ImageView(uiComponentHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String());
                imageView.setImageBitmap(bitmapCreateBitmap);
                uiComponentHelper.d(new wn0.a() { // from class: oi0.j4
                    @Override // wn0.a
                    public final Object invoke() {
                        return k4.c(config, imageView);
                    }
                });
                return imageView;
            } catch (WriterException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(QRCode qRCode, ImageView imageView) {
        float f11;
        StyleElements.SizeSet margin = qRCode.getMargin();
        if (margin != null) {
            xi0.d.c(imageView, margin);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = qRCode.getJustification();
        if (justification != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = -2;
            int i11 = a.f97654a[justification.ordinal()];
            if (i11 == 1) {
                f11 = BitmapDescriptorFactory.HUE_RED;
            } else if (i11 == 2) {
                f11 = 0.5f;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            }
            bVar.G = f11;
        }
        imageView.setLayoutParams(layoutParams);
        return jn0.h0.f84049a;
    }
}
