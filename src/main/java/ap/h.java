package ap;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lap/h;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lap/i;", "", "opacity", "<init>", "(F)V", "Landroid/text/TextPaint;", "paint", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", Gender.FEMALE, "getOpacity", "()F", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends CharacterStyle implements UpdateAppearance, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float opacity;

    public h(float f11) {
        this.opacity = f11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        s.k(paint, "paint");
        paint.setAlpha(yn0.a.d(Color.alpha(paint.getColor()) * this.opacity));
        int i11 = paint.bgColor;
        if (i11 != 0) {
            paint.bgColor = Color.argb(yn0.a.d(Color.alpha(i11) * this.opacity), Color.red(paint.bgColor), Color.green(paint.bgColor), Color.blue(paint.bgColor));
        }
    }
}
