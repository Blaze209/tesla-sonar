package ap;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lap/a;", "Landroid/text/style/MetricAffectingSpan;", "Lap/i;", "", "spacing", "<init>", "(F)V", "Landroid/text/TextPaint;", "paint", "Ljn0/h0;", "a", "(Landroid/text/TextPaint;)V", "updateDrawState", "updateMeasureState", Gender.FEMALE, "b", "()F", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends MetricAffectingSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float spacing;

    public a(float f11) {
        this.spacing = f11;
    }

    private final void a(TextPaint paint) {
        if (Float.isNaN(this.spacing)) {
            return;
        }
        paint.setLetterSpacing(this.spacing);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        s.k(paint, "paint");
        a(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        s.k(paint, "paint");
        a(paint);
    }
}
