package p014n4;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n4.a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln4/a;", "Ln4/i;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ln4/f0;", "weight", "Ln4/b0;", "style", "Ln4/e0$d;", "variationSettings", "<init>", "(Ljava/io/File;Ln4/f0;ILn4/e0$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Typeface;", "f", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "toString", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/io/File;", "getFile", "()Ljava/io/File;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Font extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final File file;

    public /* synthetic */ Font(File file, FontWeight fontWeight, int i11, e0.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, fontWeight, i11, dVar);
    }

    @Override // p014n4.i
    public Typeface f(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? b1.f92887a.b(this.file, context, getVariationSettings()) : Typeface.createFromFile(this.file);
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) b0.h(getStyle())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private Font(File file, FontWeight fontWeight, int i11, e0.d dVar) {
        super(fontWeight, i11, dVar, null);
        this.file = file;
        h(f(null));
    }
}
