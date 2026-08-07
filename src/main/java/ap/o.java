package ap;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lap/o;", "Landroid/text/style/CharacterStyle;", "Lap/i;", "", "dx", "dy", "radius", "", "color", "<init>", "(FFFI)V", "Landroid/text/TextPaint;", "textPaint", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", Gender.FEMALE, "b", "c", DateTokenConverter.CONVERTER_KEY, "I", "getColor", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends CharacterStyle implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dx;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float dy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int color;

    public o(float f11, float f12, float f13, int i11) {
        this.dx = f11;
        this.dy = f12;
        this.radius = f13;
        this.color = i11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        s.k(textPaint, "textPaint");
        textPaint.setShadowLayer(this.radius, this.dx, this.dy, this.color);
    }
}
