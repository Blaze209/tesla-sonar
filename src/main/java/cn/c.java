package cn;

import android.graphics.ColorSpace;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.OutputStream;
import p013kotlin.Metadata;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcn/c;", "", "Lum/k;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Lom/g;", "rotationOptions", "Lom/f;", "resizeOptions", "Lgm/c;", "outputFormat", "", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcn/b;", "c", "(Lum/k;Ljava/io/OutputStream;Lom/g;Lom/f;Lgm/c;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Lcn/b;", "", DateTokenConverter.CONVERTER_KEY, "(Lum/k;Lom/g;Lom/f;)Z", "imageFormat", "b", "(Lgm/c;)Z", "", "a", "()Ljava/lang/String;", "identifier", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c {
    String a();

    boolean b(gm.c imageFormat);

    b c(k encodedImage, OutputStream outputStream, om.g rotationOptions, om.f resizeOptions, gm.c outputFormat, Integer quality, ColorSpace colorSpace);

    boolean d(k encodedImage, om.g rotationOptions, om.f resizeOptions);
}
