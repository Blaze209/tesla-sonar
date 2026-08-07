package com.facebook.react.views.text;

import android.text.Spannable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001f\u0018\u0000 &2\u00020\u0001:\u0001\u0015BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006'"}, d2 = {"Lcom/facebook/react/views/text/g;", "", "Landroid/text/Spannable;", "text", "", "jsEventCounter", "", "containsImages", "", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "textAlign", "textBreakStrategy", "justificationMode", "<init>", "(Landroid/text/Spannable;IZFFFFIII)V", "(Landroid/text/Spannable;IZIII)V", "b", "()Z", "a", "Landroid/text/Spannable;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/text/Spannable;", "I", "c", "()I", "Z", "getContainsImages", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "f", "()F", "e", "h", "g", "j", "k", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Spannable text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int jsEventCounter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean containsImages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float paddingLeft;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float paddingTop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float paddingRight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float paddingBottom;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int textAlign;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int textBreakStrategy;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int justificationMode;

    /* JADX INFO: renamed from: com.facebook.react.views.text.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/text/g$a;", "", "<init>", "()V", "Landroid/text/Spannable;", "text", "", "jsEventCounter", "textAlign", "textBreakStrategy", "justificationMode", "Lcom/facebook/react/views/text/g;", "a", "(Landroid/text/Spannable;IIII)Lcom/facebook/react/views/text/g;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Spannable text, int jsEventCounter, int textAlign, int textBreakStrategy, int justificationMode) {
            s.k(text, "text");
            return new g(text, jsEventCounter, false, textAlign, textBreakStrategy, justificationMode);
        }

        private Companion() {
        }
    }

    public g(Spannable text, int i11, boolean z11, float f11, float f12, float f13, float f14, int i12, int i13, int i14) {
        s.k(text, "text");
        this.text = text;
        this.jsEventCounter = i11;
        this.containsImages = z11;
        this.paddingLeft = f11;
        this.paddingTop = f12;
        this.paddingRight = f13;
        this.paddingBottom = f14;
        this.textAlign = i12;
        this.textBreakStrategy = i13;
        this.justificationMode = i14;
    }

    public static final g a(Spannable spannable, int i11, int i12, int i13, int i14) {
        return INSTANCE.a(spannable, i11, i12, i13, i14);
    }

    @jn0.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getContainsImages() {
        return this.containsImages;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getJsEventCounter() {
        return this.jsEventCounter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getPaddingBottom() {
        return this.paddingBottom;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getPaddingLeft() {
        return this.paddingLeft;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getPaddingRight() {
        return this.paddingRight;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getPaddingTop() {
        return this.paddingTop;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Spannable getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTextBreakStrategy() {
        return this.textBreakStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Spannable text, int i11, boolean z11, int i12, int i13, int i14) {
        this(text, i11, z11, -1.0f, -1.0f, -1.0f, -1.0f, i12, i13, i14);
        s.k(text, "text");
    }
}
