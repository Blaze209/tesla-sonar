package com.stripe.android.view;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b3\b\u0080\b\u0018\u0000 =2\u00020\u0001:\u00011B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010*\"\u0004\b4\u00105R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u0010*\"\u0004\b8\u00105R\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b:\u0010*\"\u0004\b;\u00105R\"\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b<\u0010*\"\u0004\b=\u00105R\"\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00102\u001a\u0004\b>\u0010*\"\u0004\b?\u00105R\"\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u0010*\"\u0004\bB\u00105R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\bC\u0010*\"\u0004\bD\u00105R\"\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00102\u001a\u0004\b@\u0010*\"\u0004\bE\u00105R\"\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u00102\u001a\u0004\bF\u0010*\"\u0004\bG\u00105R\"\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\bH\u0010*\"\u0004\bI\u00105R\"\u0010\r\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\bJ\u0010*\"\u0004\bK\u00105R\"\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bL\u0010*\"\u0004\bM\u00105R\"\u0010\u000f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\bN\u0010*\"\u0004\bO\u00105R\"\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u00102\u001a\u0004\bP\u0010*\"\u0004\bQ\u00105R\"\u0010\u0011\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u00102\u001a\u0004\bR\u0010*\"\u0004\bS\u00105R\"\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00102\u001a\u0004\bT\u0010*\"\u0004\bU\u00105R\u0014\u0010V\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010*R\u0014\u0010W\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010*R\u0014\u0010X\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010*¨\u0006Y"}, d2 = {"Lcom/stripe/android/view/n0;", "", "", "totalLengthInPixels", "cardWidth", "hiddenCardWidth", "peekCardWidth", "cardDateSeparation", "dateWidth", "dateCvcSeparation", "cvcWidth", "cvcPostalCodeSeparation", "postalCodeWidth", "cardTouchBufferLimit", "dateStartPosition", "dateEndTouchBufferLimit", "cvcStartPosition", "cvcEndTouchBufferLimit", "postalCodeStartPosition", "<init>", "(IIIIIIIIIIIIIIII)V", "", "isFullCard", "g", "(Z)I", "e", "k", "isShowingFullCard", "postalCodeEnabled", "frameStart", "frameWidth", "Ljn0/h0;", "u", "(ZZII)V", "touchX", "Lcom/stripe/android/view/m0$l;", IntegerTokenConverter.CONVERTER_KEY, "(IIZZ)Lcom/stripe/android/view/m0$l;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "value", "t", "(I)I", "a", "I", "getTotalLengthInPixels$payments_core_release", "s", "(I)V", "b", DateTokenConverter.CONVERTER_KEY, "m", "c", "j", "p", "getPeekCardWidth$payments_core_release", "q", "getCardDateSeparation$payments_core_release", "setCardDateSeparation$payments_core_release", "f", "h", "o", "getDateCvcSeparation$payments_core_release", "setDateCvcSeparation$payments_core_release", "n", "getCvcPostalCodeSeparation$payments_core_release", "setCvcPostalCodeSeparation$payments_core_release", "l", "r", "getCardTouchBufferLimit$payments_core_release", "setCardTouchBufferLimit$payments_core_release", "getDateStartPosition$payments_core_release", "setDateStartPosition$payments_core_release", "getDateEndTouchBufferLimit$payments_core_release", "setDateEndTouchBufferLimit$payments_core_release", "getCvcStartPosition$payments_core_release", "setCvcStartPosition$payments_core_release", "getCvcEndTouchBufferLimit$payments_core_release", "setCvcEndTouchBufferLimit$payments_core_release", "getPostalCodeStartPosition$payments_core_release", "setPostalCodeStartPosition$payments_core_release", "cardPeekDateStartMargin", "cardPeekCvcStartMargin", "cardPeekPostalCodeStartMargin", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f55081q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f55082r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int totalLengthInPixels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int cardWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int hiddenCardWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int peekCardWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int cardDateSeparation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int dateWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int dateCvcSeparation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int cvcWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int cvcPostalCodeSeparation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int postalCodeWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int cardTouchBufferLimit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int dateStartPosition;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int dateEndTouchBufferLimit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int cvcStartPosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int cvcEndTouchBufferLimit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int postalCodeStartPosition;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/n0$a;", "", "<init>", "()V", "", "MIN_SEPARATION_IN_PX", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n0(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        this.totalLengthInPixels = i11;
        this.cardWidth = i12;
        this.hiddenCardWidth = i13;
        this.peekCardWidth = i14;
        this.cardDateSeparation = i15;
        this.dateWidth = i16;
        this.dateCvcSeparation = i17;
        this.cvcWidth = i18;
        this.cvcPostalCodeSeparation = i19;
        this.postalCodeWidth = i21;
        this.cardTouchBufferLimit = i22;
        this.dateStartPosition = i23;
        this.dateEndTouchBufferLimit = i24;
        this.cvcStartPosition = i25;
        this.cvcEndTouchBufferLimit = i26;
        this.postalCodeStartPosition = i27;
    }

    private final /* synthetic */ int a() {
        return b() + this.dateWidth + this.dateCvcSeparation;
    }

    private final /* synthetic */ int b() {
        return this.peekCardWidth + this.cardDateSeparation;
    }

    private final /* synthetic */ int c() {
        return a() + this.cvcWidth + this.cvcPostalCodeSeparation;
    }

    private final int t(int value) {
        if (value >= 0) {
            return value;
        }
        return 10;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCardWidth() {
        return this.cardWidth;
    }

    public final /* synthetic */ int e(boolean isFullCard) {
        return isFullCard ? this.totalLengthInPixels : a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return this.totalLengthInPixels == n0Var.totalLengthInPixels && this.cardWidth == n0Var.cardWidth && this.hiddenCardWidth == n0Var.hiddenCardWidth && this.peekCardWidth == n0Var.peekCardWidth && this.cardDateSeparation == n0Var.cardDateSeparation && this.dateWidth == n0Var.dateWidth && this.dateCvcSeparation == n0Var.dateCvcSeparation && this.cvcWidth == n0Var.cvcWidth && this.cvcPostalCodeSeparation == n0Var.cvcPostalCodeSeparation && this.postalCodeWidth == n0Var.postalCodeWidth && this.cardTouchBufferLimit == n0Var.cardTouchBufferLimit && this.dateStartPosition == n0Var.dateStartPosition && this.dateEndTouchBufferLimit == n0Var.dateEndTouchBufferLimit && this.cvcStartPosition == n0Var.cvcStartPosition && this.cvcEndTouchBufferLimit == n0Var.cvcEndTouchBufferLimit && this.postalCodeStartPosition == n0Var.postalCodeStartPosition;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCvcWidth() {
        return this.cvcWidth;
    }

    public final /* synthetic */ int g(boolean isFullCard) {
        return isFullCard ? this.cardWidth + this.cardDateSeparation : b();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getDateWidth() {
        return this.dateWidth;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.totalLengthInPixels) * 31) + Integer.hashCode(this.cardWidth)) * 31) + Integer.hashCode(this.hiddenCardWidth)) * 31) + Integer.hashCode(this.peekCardWidth)) * 31) + Integer.hashCode(this.cardDateSeparation)) * 31) + Integer.hashCode(this.dateWidth)) * 31) + Integer.hashCode(this.dateCvcSeparation)) * 31) + Integer.hashCode(this.cvcWidth)) * 31) + Integer.hashCode(this.cvcPostalCodeSeparation)) * 31) + Integer.hashCode(this.postalCodeWidth)) * 31) + Integer.hashCode(this.cardTouchBufferLimit)) * 31) + Integer.hashCode(this.dateStartPosition)) * 31) + Integer.hashCode(this.dateEndTouchBufferLimit)) * 31) + Integer.hashCode(this.cvcStartPosition)) * 31) + Integer.hashCode(this.cvcEndTouchBufferLimit)) * 31) + Integer.hashCode(this.postalCodeStartPosition);
    }

    public final m0.l i(int touchX, int frameStart, boolean isShowingFullCard, boolean postalCodeEnabled) {
        if (isShowingFullCard) {
            if (touchX < frameStart + this.cardWidth) {
                return null;
            }
            if (touchX < this.cardTouchBufferLimit) {
                return m0.l.Number;
            }
            if (touchX < this.dateStartPosition) {
                return m0.l.Expiry;
            }
            return null;
        }
        if (!postalCodeEnabled) {
            if (touchX < frameStart + this.peekCardWidth) {
                return null;
            }
            if (touchX < this.cardTouchBufferLimit) {
                return m0.l.Number;
            }
            int i11 = this.dateStartPosition;
            if (touchX < i11) {
                return m0.l.Expiry;
            }
            if (touchX < i11 + this.dateWidth) {
                return null;
            }
            if (touchX < this.dateEndTouchBufferLimit) {
                return m0.l.Expiry;
            }
            if (touchX < this.cvcStartPosition) {
                return m0.l.Cvc;
            }
            return null;
        }
        if (touchX < frameStart + this.peekCardWidth) {
            return null;
        }
        if (touchX < this.cardTouchBufferLimit) {
            return m0.l.Number;
        }
        int i12 = this.dateStartPosition;
        if (touchX < i12) {
            return m0.l.Expiry;
        }
        if (touchX < i12 + this.dateWidth) {
            return null;
        }
        if (touchX < this.dateEndTouchBufferLimit) {
            return m0.l.Expiry;
        }
        int i13 = this.cvcStartPosition;
        if (touchX < i13) {
            return m0.l.Cvc;
        }
        if (touchX < i13 + this.cvcWidth) {
            return null;
        }
        if (touchX < this.cvcEndTouchBufferLimit) {
            return m0.l.Cvc;
        }
        if (touchX < this.postalCodeStartPosition) {
            return m0.l.PostalCode;
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getHiddenCardWidth() {
        return this.hiddenCardWidth;
    }

    public final /* synthetic */ int k(boolean isFullCard) {
        return isFullCard ? this.totalLengthInPixels : c();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPostalCodeWidth() {
        return this.postalCodeWidth;
    }

    public final void m(int i11) {
        this.cardWidth = i11;
    }

    public final void n(int i11) {
        this.cvcWidth = i11;
    }

    public final void o(int i11) {
        this.dateWidth = i11;
    }

    public final void p(int i11) {
        this.hiddenCardWidth = i11;
    }

    public final void q(int i11) {
        this.peekCardWidth = i11;
    }

    public final void r(int i11) {
        this.postalCodeWidth = i11;
    }

    public final void s(int i11) {
        this.totalLengthInPixels = i11;
    }

    public String toString() {
        String str = "\n            Touch Buffer Data:\n            CardTouchBufferLimit = " + this.cardTouchBufferLimit + "\n            DateStartPosition = " + this.dateStartPosition + "\n            DateEndTouchBufferLimit = " + this.dateEndTouchBufferLimit + "\n            CvcStartPosition = " + this.cvcStartPosition + "\n            CvcEndTouchBufferLimit = " + this.cvcEndTouchBufferLimit + "\n            PostalCodeStartPosition = " + this.postalCodeStartPosition + "\n            ";
        return ("\n            TotalLengthInPixels = " + this.totalLengthInPixels + "\n            CardWidth = " + this.cardWidth + "\n            HiddenCardWidth = " + this.hiddenCardWidth + "\n            PeekCardWidth = " + this.peekCardWidth + "\n            CardDateSeparation = " + this.cardDateSeparation + "\n            DateWidth = " + this.dateWidth + "\n            DateCvcSeparation = " + this.dateCvcSeparation + "\n            CvcWidth = " + this.cvcWidth + "\n            CvcPostalCodeSeparation = " + this.cvcPostalCodeSeparation + "\n            PostalCodeWidth: " + this.postalCodeWidth + "\n            ") + str;
    }

    public final /* synthetic */ void u(boolean isShowingFullCard, boolean postalCodeEnabled, int frameStart, int frameWidth) {
        if (isShowingFullCard) {
            int iT = t((frameWidth - this.cardWidth) - this.dateWidth);
            this.cardDateSeparation = iT;
            int i11 = this.cardWidth;
            this.cardTouchBufferLimit = frameStart + i11 + (iT / 2);
            this.dateStartPosition = frameStart + i11 + iT;
            return;
        }
        if (!postalCodeEnabled) {
            int iT2 = t(((frameWidth / 2) - this.peekCardWidth) - (this.dateWidth / 2));
            this.cardDateSeparation = iT2;
            int iT3 = t((((frameWidth - this.peekCardWidth) - iT2) - this.dateWidth) - this.cvcWidth);
            this.dateCvcSeparation = iT3;
            int i12 = this.peekCardWidth;
            int i13 = this.cardDateSeparation;
            this.cardTouchBufferLimit = frameStart + i12 + (i13 / 2);
            int i14 = frameStart + i12 + i13;
            this.dateStartPosition = i14;
            int i15 = this.dateWidth;
            this.dateEndTouchBufferLimit = i14 + i15 + (iT3 / 2);
            this.cvcStartPosition = i14 + i15 + iT3;
            return;
        }
        int i16 = frameWidth * 3;
        int iT4 = t(((i16 / 10) - this.peekCardWidth) - (this.dateWidth / 4));
        this.cardDateSeparation = iT4;
        int iT5 = t(((((i16 / 5) - this.peekCardWidth) - iT4) - this.dateWidth) - this.cvcWidth);
        this.dateCvcSeparation = iT5;
        int iT6 = t((((((frameWidth - this.peekCardWidth) - this.cardDateSeparation) - this.dateWidth) - this.cvcWidth) - iT5) - this.postalCodeWidth);
        this.cvcPostalCodeSeparation = iT6;
        int i17 = frameStart + this.peekCardWidth + this.cardDateSeparation;
        this.cardTouchBufferLimit = i17 / 3;
        this.dateStartPosition = i17;
        int i18 = i17 + this.dateWidth + this.dateCvcSeparation;
        this.dateEndTouchBufferLimit = i18 / 3;
        this.cvcStartPosition = i18;
        int i19 = i18 + this.cvcWidth + iT6;
        this.cvcEndTouchBufferLimit = i19 / 3;
        this.postalCodeStartPosition = i19;
    }

    public /* synthetic */ n0(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, DefaultConstructorMarker defaultConstructorMarker) {
        this((i28 & 1) != 0 ? 0 : i11, (i28 & 2) != 0 ? 0 : i12, (i28 & 4) != 0 ? 0 : i13, (i28 & 8) != 0 ? 0 : i14, (i28 & 16) != 0 ? 0 : i15, (i28 & 32) != 0 ? 0 : i16, (i28 & 64) != 0 ? 0 : i17, (i28 & 128) != 0 ? 0 : i18, (i28 & 256) != 0 ? 0 : i19, (i28 & 512) != 0 ? 0 : i21, (i28 & 1024) != 0 ? 0 : i22, (i28 & 2048) != 0 ? 0 : i23, (i28 & 4096) != 0 ? 0 : i24, (i28 & PKIFailureInfo.certRevoked) != 0 ? 0 : i25, (i28 & 16384) != 0 ? 0 : i26, (i28 & 32768) != 0 ? 0 : i27);
    }
}
