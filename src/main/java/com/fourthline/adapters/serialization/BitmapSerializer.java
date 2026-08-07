package com.fourthline.adapters.serialization;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.core.ContextExtensionsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.b;
import zn0.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/fourthline/adapters/serialization/BitmapSerializer;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "serialize", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapSerializer {
    private final Context context;

    public BitmapSerializer(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    public final File serialize(Bitmap bitmap) throws IOException {
        s.k(bitmap, "bitmap");
        File file = new File(ContextExtensionsKt.getFourthlineDirectory(this.context).getPath());
        c.Companion companion = c.INSTANCE;
        File fileCreateTempFile = File.createTempFile(String.valueOf(companion.c()), String.valueOf(companion.c()), file);
        s.j(fileCreateTempFile, "createTempFile(...)");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            h0 h0Var = h0.f84049a;
            b.a(fileOutputStream, null);
            return fileCreateTempFile;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
