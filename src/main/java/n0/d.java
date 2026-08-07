package n0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.r2;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f92626a;

    public d(@NonNull r2 r2Var) {
        this.f92626a = (IncorrectJpegMetadataQuirk) r2Var.b(IncorrectJpegMetadataQuirk.class);
    }

    @NonNull
    public byte[] a(@NonNull n nVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f92626a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.j(nVar);
        }
        ByteBuffer byteBufferL = nVar.N0()[0].l();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.rewind();
        byteBufferL.get(bArr);
        return bArr;
    }
}
