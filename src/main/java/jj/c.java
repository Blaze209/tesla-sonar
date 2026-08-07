package jj;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c implements dj.d<ByteBuffer> {
    @Override // dj.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull dj.h hVar) throws Throwable {
        try {
            xj.a.f(byteBuffer, file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e11);
            return false;
        }
    }
}
