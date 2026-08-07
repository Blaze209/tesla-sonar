package ap;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\u0014B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Lap/c;", "Landroid/text/style/MetricAffectingSpan;", "Lap/i;", "", "privateStyle", "privateWeight", "", "fontFeatureSettings", "fontFamily", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V", "Landroid/text/TextPaint;", "ds", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "paint", "updateMeasureState", "a", "I", "b", "c", "Ljava/lang/String;", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "Landroid/content/res/AssetManager;", "()I", "style", "weight", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends MetricAffectingSpan implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int privateStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int privateWeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String fontFeatureSettings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String fontFamily;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AssetManager assetManager;

    /* JADX INFO: renamed from: ap.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lap/c$a;", "", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "style", "weight", "", "fontFeatureSettingsParam", "family", "Landroid/content/res/AssetManager;", "assetManager", "Ljn0/h0;", "b", "(Landroid/graphics/Paint;IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Paint paint, int style, int weight, String fontFeatureSettingsParam, String family, AssetManager assetManager) {
            Typeface typefaceA = com.facebook.react.views.text.k.a(paint.getTypeface(), style, weight, family, assetManager);
            paint.setFontFeatureSettings(fontFeatureSettingsParam);
            paint.setTypeface(typefaceA);
            paint.setSubpixelText(true);
        }

        private Companion() {
        }
    }

    public c(int i11, int i12, String str, String str2, AssetManager assetManager) {
        s.k(assetManager, "assetManager");
        this.privateStyle = i11;
        this.privateWeight = i12;
        this.fontFeatureSettings = str;
        this.fontFamily = str2;
        this.assetManager = assetManager;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final int c() {
        int i11 = this.privateStyle;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    public final int d() {
        int i11 = this.privateWeight;
        if (i11 == -1) {
            return 400;
        }
        return i11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        s.k(ds2, "ds");
        INSTANCE.b(ds2, this.privateStyle, this.privateWeight, this.fontFeatureSettings, this.fontFamily, this.assetManager);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        s.k(paint, "paint");
        INSTANCE.b(paint, this.privateStyle, this.privateWeight, this.fontFeatureSettings, this.fontFamily, this.assetManager);
    }
}
