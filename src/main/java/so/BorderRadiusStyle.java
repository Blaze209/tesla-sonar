package so;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.LengthPercentage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: so.e, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b-\b\u0080\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J-\u0010(\u001a\u00020\u00162\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020$HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00106R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00102\u001a\u0004\b@\u00104\"\u0004\bA\u00106R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00102\u001a\u0004\bC\u00104\"\u0004\bD\u00106R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00102\u001a\u0004\bF\u00104\"\u0004\bG\u00106R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u00102\u001a\u0004\bL\u00104\"\u0004\bM\u00106R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00102\u001a\u0004\bO\u00104\"\u0004\bP\u00106R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00102\u001a\u0004\bR\u00104\"\u0004\bS\u00106R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106¨\u0006W"}, d2 = {"Lso/e;", "", "Lcom/facebook/react/uimanager/o;", "uniform", "topLeft", "topRight", "bottomLeft", "bottomRight", "topStart", "topEnd", "bottomStart", "bottomEnd", "startStart", "startEnd", "endStart", "endEnd", "<init>", "(Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;Lcom/facebook/react/uimanager/o;)V", "Lso/k;", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lso/j;", "a", "(Lso/k;Lso/k;Lso/k;Lso/k;FF)Lso/j;", "Lso/d;", "property", "value", "Ljn0/h0;", "e", "(Lso/d;Lcom/facebook/react/uimanager/o;)V", "b", "(Lso/d;)Lcom/facebook/react/uimanager/o;", "", "c", "()Z", "", "layoutDirection", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "(ILandroid/content/Context;FF)Lso/j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/facebook/react/uimanager/o;", "getUniform", "()Lcom/facebook/react/uimanager/o;", "setUniform", "(Lcom/facebook/react/uimanager/o;)V", "getTopLeft", "setTopLeft", "getTopRight", "setTopRight", "getBottomLeft", "setBottomLeft", "getBottomRight", "setBottomRight", "f", "getTopStart", "setTopStart", "g", "getTopEnd", "setTopEnd", "h", "getBottomStart", "setBottomStart", IntegerTokenConverter.CONVERTER_KEY, "getBottomEnd", "setBottomEnd", "j", "getStartStart", "setStartStart", "k", "getStartEnd", "setStartEnd", "l", "getEndStart", "setEndStart", "m", "getEndEnd", "setEndEnd", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BorderRadiusStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage uniform;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage topLeft;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage topRight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage bottomLeft;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage bottomRight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage topStart;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage topEnd;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage bottomStart;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage bottomEnd;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage startStart;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage startEnd;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage endStart;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private LengthPercentage endEnd;

    /* JADX INFO: renamed from: so.e$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111497a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f111497a = iArr;
        }
    }

    public BorderRadiusStyle() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    private final ComputedBorderRadius a(CornerRadii topLeft, CornerRadii topRight, CornerRadii bottomLeft, CornerRadii bottomRight, float width, float height) {
        float vertical = topLeft.getVertical() + bottomLeft.getVertical();
        float horizontal = topLeft.getHorizontal() + topRight.getHorizontal();
        float vertical2 = topRight.getVertical() + bottomRight.getVertical();
        float horizontal2 = bottomLeft.getHorizontal() + bottomRight.getHorizontal();
        float fMin = BitmapDescriptorFactory.HUE_RED;
        float fMin2 = vertical > BitmapDescriptorFactory.HUE_RED ? Math.min(height / vertical, 1.0f) : 0.0f;
        float fMin3 = horizontal > BitmapDescriptorFactory.HUE_RED ? Math.min(width / horizontal, 1.0f) : 0.0f;
        float fMin4 = vertical2 > BitmapDescriptorFactory.HUE_RED ? Math.min(height / vertical2, 1.0f) : 0.0f;
        if (horizontal2 > BitmapDescriptorFactory.HUE_RED) {
            fMin = Math.min(width / horizontal2, 1.0f);
        }
        return new ComputedBorderRadius(new CornerRadii(topLeft.getHorizontal() * Math.min(fMin3, fMin2), topLeft.getVertical() * Math.min(fMin3, fMin2)), new CornerRadii(topRight.getHorizontal() * Math.min(fMin4, fMin3), topRight.getVertical() * Math.min(fMin4, fMin3)), new CornerRadii(bottomLeft.getHorizontal() * Math.min(fMin, fMin2), bottomLeft.getVertical() * Math.min(fMin, fMin2)), new CornerRadii(bottomRight.getHorizontal() * Math.min(fMin, fMin4), bottomRight.getVertical() * Math.min(fMin, fMin4)));
    }

    public final LengthPercentage b(d property) {
        s.k(property, "property");
        switch (a.f111497a[property.ordinal()]) {
            case 1:
                return this.uniform;
            case 2:
                return this.topLeft;
            case 3:
                return this.topRight;
            case 4:
                return this.bottomLeft;
            case 5:
                return this.bottomRight;
            case 6:
                return this.topStart;
            case 7:
                return this.topEnd;
            case 8:
                return this.bottomStart;
            case 9:
                return this.bottomEnd;
            case 10:
                return this.startStart;
            case 11:
                return this.startEnd;
            case 12:
                return this.endStart;
            case 13:
                return this.endEnd;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean c() {
        return (this.uniform == null && this.topLeft == null && this.topRight == null && this.bottomLeft == null && this.bottomRight == null && this.topStart == null && this.topEnd == null && this.bottomStart == null && this.bottomEnd == null && this.startStart == null && this.startEnd == null && this.endStart == null && this.endEnd == null) ? false : true;
    }

    public final ComputedBorderRadius d(int layoutDirection, Context context, float width, float height) {
        CornerRadii cornerRadiiC;
        CornerRadii cornerRadiiC2;
        CornerRadii cornerRadiiC3;
        CornerRadii cornerRadiiC4;
        CornerRadii cornerRadiiC5;
        CornerRadii cornerRadiiC6;
        CornerRadii cornerRadiiC7;
        CornerRadii cornerRadiiC8;
        CornerRadii cornerRadiiC9;
        CornerRadii cornerRadiiC10;
        CornerRadii cornerRadiiC11;
        CornerRadii cornerRadiiC12;
        s.k(context, "context");
        CornerRadii cornerRadii = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (layoutDirection == 0) {
            LengthPercentage lengthPercentage = this.startStart;
            if (lengthPercentage == null && (lengthPercentage = this.topStart) == null && (lengthPercentage = this.topLeft) == null) {
                lengthPercentage = this.uniform;
            }
            if (lengthPercentage == null || (cornerRadiiC = lengthPercentage.c(width, height)) == null) {
                cornerRadiiC = cornerRadii;
            }
            LengthPercentage lengthPercentage2 = this.endStart;
            if (lengthPercentage2 == null && (lengthPercentage2 = this.topEnd) == null && (lengthPercentage2 = this.topRight) == null) {
                lengthPercentage2 = this.uniform;
            }
            CornerRadii cornerRadii2 = (lengthPercentage2 == null || (cornerRadiiC4 = lengthPercentage2.c(width, height)) == null) ? cornerRadii : cornerRadiiC4;
            LengthPercentage lengthPercentage3 = this.startEnd;
            if (lengthPercentage3 == null && (lengthPercentage3 = this.bottomStart) == null && (lengthPercentage3 = this.bottomLeft) == null) {
                lengthPercentage3 = this.uniform;
            }
            CornerRadii cornerRadii3 = (lengthPercentage3 == null || (cornerRadiiC3 = lengthPercentage3.c(width, height)) == null) ? cornerRadii : cornerRadiiC3;
            LengthPercentage lengthPercentage4 = this.endEnd;
            if (lengthPercentage4 == null && (lengthPercentage4 = this.bottomEnd) == null && (lengthPercentage4 = this.bottomRight) == null) {
                lengthPercentage4 = this.uniform;
            }
            return a(cornerRadiiC, cornerRadii2, cornerRadii3, (lengthPercentage4 == null || (cornerRadiiC2 = lengthPercentage4.c(width, height)) == null) ? cornerRadii : cornerRadiiC2, width, height);
        }
        if (layoutDirection != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.INSTANCE.a().d(context)) {
            LengthPercentage lengthPercentage5 = this.endStart;
            if (lengthPercentage5 == null && (lengthPercentage5 = this.topEnd) == null && (lengthPercentage5 = this.topRight) == null) {
                lengthPercentage5 = this.uniform;
            }
            CornerRadii cornerRadii4 = (lengthPercentage5 == null || (cornerRadiiC12 = lengthPercentage5.c(width, height)) == null) ? cornerRadii : cornerRadiiC12;
            LengthPercentage lengthPercentage6 = this.startStart;
            if (lengthPercentage6 == null && (lengthPercentage6 = this.topStart) == null && (lengthPercentage6 = this.topLeft) == null) {
                lengthPercentage6 = this.uniform;
            }
            CornerRadii cornerRadii5 = (lengthPercentage6 == null || (cornerRadiiC11 = lengthPercentage6.c(width, height)) == null) ? cornerRadii : cornerRadiiC11;
            LengthPercentage lengthPercentage7 = this.endEnd;
            if (lengthPercentage7 == null && (lengthPercentage7 = this.bottomEnd) == null && (lengthPercentage7 = this.bottomRight) == null) {
                lengthPercentage7 = this.uniform;
            }
            CornerRadii cornerRadii6 = (lengthPercentage7 == null || (cornerRadiiC10 = lengthPercentage7.c(width, height)) == null) ? cornerRadii : cornerRadiiC10;
            LengthPercentage lengthPercentage8 = this.startEnd;
            if (lengthPercentage8 == null && (lengthPercentage8 = this.bottomStart) == null && (lengthPercentage8 = this.bottomLeft) == null) {
                lengthPercentage8 = this.uniform;
            }
            return a(cornerRadii4, cornerRadii5, cornerRadii6, (lengthPercentage8 == null || (cornerRadiiC9 = lengthPercentage8.c(width, height)) == null) ? cornerRadii : cornerRadiiC9, width, height);
        }
        LengthPercentage lengthPercentage9 = this.endStart;
        if (lengthPercentage9 == null && (lengthPercentage9 = this.topEnd) == null && (lengthPercentage9 = this.topLeft) == null) {
            lengthPercentage9 = this.uniform;
        }
        if (lengthPercentage9 == null || (cornerRadiiC5 = lengthPercentage9.c(width, height)) == null) {
            cornerRadiiC5 = cornerRadii;
        }
        LengthPercentage lengthPercentage10 = this.startStart;
        if (lengthPercentage10 == null && (lengthPercentage10 = this.topStart) == null && (lengthPercentage10 = this.topRight) == null) {
            lengthPercentage10 = this.uniform;
        }
        CornerRadii cornerRadii7 = (lengthPercentage10 == null || (cornerRadiiC8 = lengthPercentage10.c(width, height)) == null) ? cornerRadii : cornerRadiiC8;
        LengthPercentage lengthPercentage11 = this.endEnd;
        if (lengthPercentage11 == null && (lengthPercentage11 = this.bottomStart) == null && (lengthPercentage11 = this.bottomLeft) == null) {
            lengthPercentage11 = this.uniform;
        }
        CornerRadii cornerRadii8 = (lengthPercentage11 == null || (cornerRadiiC7 = lengthPercentage11.c(width, height)) == null) ? cornerRadii : cornerRadiiC7;
        LengthPercentage lengthPercentage12 = this.startEnd;
        if (lengthPercentage12 == null && (lengthPercentage12 = this.bottomEnd) == null && (lengthPercentage12 = this.bottomRight) == null) {
            lengthPercentage12 = this.uniform;
        }
        return a(cornerRadiiC5, cornerRadii7, cornerRadii8, (lengthPercentage12 == null || (cornerRadiiC6 = lengthPercentage12.c(width, height)) == null) ? cornerRadii : cornerRadiiC6, width, height);
    }

    public final void e(d property, LengthPercentage value) {
        s.k(property, "property");
        switch (a.f111497a[property.ordinal()]) {
            case 1:
                this.uniform = value;
                return;
            case 2:
                this.topLeft = value;
                return;
            case 3:
                this.topRight = value;
                return;
            case 4:
                this.bottomLeft = value;
                return;
            case 5:
                this.bottomRight = value;
                return;
            case 6:
                this.topStart = value;
                return;
            case 7:
                this.topEnd = value;
                return;
            case 8:
                this.bottomStart = value;
                return;
            case 9:
                this.bottomEnd = value;
                return;
            case 10:
                this.startStart = value;
                return;
            case 11:
                this.startEnd = value;
                return;
            case 12:
                this.endStart = value;
                return;
            case 13:
                this.endEnd = value;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderRadiusStyle)) {
            return false;
        }
        BorderRadiusStyle borderRadiusStyle = (BorderRadiusStyle) other;
        return s.f(this.uniform, borderRadiusStyle.uniform) && s.f(this.topLeft, borderRadiusStyle.topLeft) && s.f(this.topRight, borderRadiusStyle.topRight) && s.f(this.bottomLeft, borderRadiusStyle.bottomLeft) && s.f(this.bottomRight, borderRadiusStyle.bottomRight) && s.f(this.topStart, borderRadiusStyle.topStart) && s.f(this.topEnd, borderRadiusStyle.topEnd) && s.f(this.bottomStart, borderRadiusStyle.bottomStart) && s.f(this.bottomEnd, borderRadiusStyle.bottomEnd) && s.f(this.startStart, borderRadiusStyle.startStart) && s.f(this.startEnd, borderRadiusStyle.startEnd) && s.f(this.endStart, borderRadiusStyle.endStart) && s.f(this.endEnd, borderRadiusStyle.endEnd);
    }

    public int hashCode() {
        LengthPercentage lengthPercentage = this.uniform;
        int iHashCode = (lengthPercentage == null ? 0 : lengthPercentage.hashCode()) * 31;
        LengthPercentage lengthPercentage2 = this.topLeft;
        int iHashCode2 = (iHashCode + (lengthPercentage2 == null ? 0 : lengthPercentage2.hashCode())) * 31;
        LengthPercentage lengthPercentage3 = this.topRight;
        int iHashCode3 = (iHashCode2 + (lengthPercentage3 == null ? 0 : lengthPercentage3.hashCode())) * 31;
        LengthPercentage lengthPercentage4 = this.bottomLeft;
        int iHashCode4 = (iHashCode3 + (lengthPercentage4 == null ? 0 : lengthPercentage4.hashCode())) * 31;
        LengthPercentage lengthPercentage5 = this.bottomRight;
        int iHashCode5 = (iHashCode4 + (lengthPercentage5 == null ? 0 : lengthPercentage5.hashCode())) * 31;
        LengthPercentage lengthPercentage6 = this.topStart;
        int iHashCode6 = (iHashCode5 + (lengthPercentage6 == null ? 0 : lengthPercentage6.hashCode())) * 31;
        LengthPercentage lengthPercentage7 = this.topEnd;
        int iHashCode7 = (iHashCode6 + (lengthPercentage7 == null ? 0 : lengthPercentage7.hashCode())) * 31;
        LengthPercentage lengthPercentage8 = this.bottomStart;
        int iHashCode8 = (iHashCode7 + (lengthPercentage8 == null ? 0 : lengthPercentage8.hashCode())) * 31;
        LengthPercentage lengthPercentage9 = this.bottomEnd;
        int iHashCode9 = (iHashCode8 + (lengthPercentage9 == null ? 0 : lengthPercentage9.hashCode())) * 31;
        LengthPercentage lengthPercentage10 = this.startStart;
        int iHashCode10 = (iHashCode9 + (lengthPercentage10 == null ? 0 : lengthPercentage10.hashCode())) * 31;
        LengthPercentage lengthPercentage11 = this.startEnd;
        int iHashCode11 = (iHashCode10 + (lengthPercentage11 == null ? 0 : lengthPercentage11.hashCode())) * 31;
        LengthPercentage lengthPercentage12 = this.endStart;
        int iHashCode12 = (iHashCode11 + (lengthPercentage12 == null ? 0 : lengthPercentage12.hashCode())) * 31;
        LengthPercentage lengthPercentage13 = this.endEnd;
        return iHashCode12 + (lengthPercentage13 != null ? lengthPercentage13.hashCode() : 0);
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.uniform + ", topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ", topStart=" + this.topStart + ", topEnd=" + this.topEnd + ", bottomStart=" + this.bottomStart + ", bottomEnd=" + this.bottomEnd + ", startStart=" + this.startStart + ", startEnd=" + this.startEnd + ", endStart=" + this.endStart + ", endEnd=" + this.endEnd + ")";
    }

    public BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13) {
        this.uniform = lengthPercentage;
        this.topLeft = lengthPercentage2;
        this.topRight = lengthPercentage3;
        this.bottomLeft = lengthPercentage4;
        this.bottomRight = lengthPercentage5;
        this.topStart = lengthPercentage6;
        this.topEnd = lengthPercentage7;
        this.bottomStart = lengthPercentage8;
        this.bottomEnd = lengthPercentage9;
        this.startStart = lengthPercentage10;
        this.startEnd = lengthPercentage11;
        this.endStart = lengthPercentage12;
        this.endEnd = lengthPercentage13;
    }

    public /* synthetic */ BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : lengthPercentage, (i11 & 2) != 0 ? null : lengthPercentage2, (i11 & 4) != 0 ? null : lengthPercentage3, (i11 & 8) != 0 ? null : lengthPercentage4, (i11 & 16) != 0 ? null : lengthPercentage5, (i11 & 32) != 0 ? null : lengthPercentage6, (i11 & 64) != 0 ? null : lengthPercentage7, (i11 & 128) != 0 ? null : lengthPercentage8, (i11 & 256) != 0 ? null : lengthPercentage9, (i11 & 512) != 0 ? null : lengthPercentage10, (i11 & 1024) != 0 ? null : lengthPercentage11, (i11 & 2048) != 0 ? null : lengthPercentage12, (i11 & 4096) != 0 ? null : lengthPercentage13);
    }
}
