package pj;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j implements dj.j<InputStream, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f103123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj.j<ByteBuffer, c> f103124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj.b f103125c;

    public j(List<ImageHeaderParser> list, dj.j<ByteBuffer, c> jVar, gj.b bVar) {
        this.f103123a = list;
        this.f103124b = jVar;
        this.f103125c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (IOException e11) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e11);
            return null;
        }
    }

    @Override // dj.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj.c<c> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull dj.h hVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f103124b.a(ByteBuffer.wrap(bArrE), i11, i12, hVar);
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull dj.h hVar) {
        return !((Boolean) hVar.c(i.f103122b)).booleanValue() && com.bumptech.glide.load.a.f(this.f103123a, inputStream, this.f103125c) == ImageHeaderParser.ImageType.GIF;
    }
}
