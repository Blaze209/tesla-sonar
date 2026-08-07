package l4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Ll4/l;", "Landroid/text/style/CharacterStyle;", "", "color", "", "offsetX", "offsetY", "radius", "<init>", "(IFFF)V", "Landroid/text/TextPaint;", "tp", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "I", "getColor", "()I", "b", Gender.FEMALE, "getOffsetX", "()F", "c", "getOffsetY", DateTokenConverter.CONVERTER_KEY, "getRadius", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float offsetX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float offsetY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    public l(int i11, float f11, float f12, float f13) {
        this.color = i11;
        this.offsetX = f11;
        this.offsetY = f12;
        this.radius = f13;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp2) {
        tp2.setShadowLayer(this.radius, this.offsetX, this.offsetY, this.color);
    }
}
