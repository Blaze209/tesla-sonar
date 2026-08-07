package f30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0014"}, d2 = {"Lf30/m;", "", "<init>", "()V", "", "borderWidth", "b", "(I)Lf30/m;", "", "hexColor", "a", "(Ljava/lang/String;)Lf30/m;", "cornerRadius", "c", DateTokenConverter.CONVERTER_KEY, OrcaFlavourKeys.FONT_SIZE, "e", "Lq80/o;", "Lq80/o;", "textBoxCustomization", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q80.o textBoxCustomization = new q80.i();

    public final m a(String hexColor) {
        p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
        this.textBoxCustomization.l(hexColor);
        return this;
    }

    public final m b(int borderWidth) {
        this.textBoxCustomization.m(borderWidth);
        return this;
    }

    public final m c(int cornerRadius) {
        this.textBoxCustomization.d(cornerRadius);
        return this;
    }

    public final m d(String hexColor) {
        p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
        this.textBoxCustomization.setTextColor(hexColor);
        return this;
    }

    public final m e(int fontSize) {
        this.textBoxCustomization.z(fontSize);
        return this;
    }
}
