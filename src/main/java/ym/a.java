package ym;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lym/a;", "Lym/b;", "Lxm/d;", "bitmapPool", "Lu5/f;", "Ljava/nio/ByteBuffer;", "decodeBuffers", "Lym/f;", "platformDecoderOptions", "<init>", "(Lxm/d;Lu5/f;Lym/f;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Landroid/graphics/BitmapFactory$Options;", "options", DateTokenConverter.CONVERTER_KEY, "(IILandroid/graphics/BitmapFactory$Options;)I", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(21)
public final class a extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xm.d bitmapPool, u5.f<ByteBuffer> decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        s.k(bitmapPool, "bitmapPool");
        s.k(decodeBuffers, "decodeBuffers");
        s.k(platformDecoderOptions, "platformDecoderOptions");
    }

    @Override // ym.b
    public int d(int width, int height, BitmapFactory.Options options) {
        s.k(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return fn.c.i(width, height, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
