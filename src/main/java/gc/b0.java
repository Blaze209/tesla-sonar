package gc;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import okio.i0;
import p013kotlin.Metadata;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc/u;", "Lrc/n;", "options", "", "animated", "Landroid/graphics/ImageDecoder$Source;", "b", "(Lgc/u;Lrc/n;Z)Landroid/graphics/ImageDecoder$Source;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {
    public static final ImageDecoder.Source b(u uVar, Options options, boolean z11) {
        i0 i0VarY1;
        if (uVar.getFileSystem() == okio.o.f97987b && (i0VarY1 = uVar.y1()) != null) {
            return ImageDecoder.createSource(i0VarY1.toFile());
        }
        u.a metadata = uVar.getMetadata();
        if (metadata instanceof a) {
            return ImageDecoder.createSource(options.getContext().getAssets(), ((a) metadata).getFilePath());
        }
        if ((metadata instanceof g) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((g) metadata).getAssetFileDescriptor();
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: gc.a0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return b0.c(assetFileDescriptor);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof w) {
            w wVar = (w) metadata;
            if (p013kotlin.jvm.internal.s.f(wVar.getPackageName(), options.getContext().getPackageName())) {
                return ImageDecoder.createSource(options.getContext().getResources(), wVar.getResId());
            }
        }
        if (!(metadata instanceof f)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z11 || ((f) metadata).getByteBuffer().isDirect()) {
            return ImageDecoder.createSource(((f) metadata).getByteBuffer());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetFileDescriptor c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
