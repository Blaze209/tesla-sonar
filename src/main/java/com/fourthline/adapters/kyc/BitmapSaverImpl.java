package com.fourthline.adapters.kyc;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.core.ContextExtensionsKt;
import java.io.File;
import java.io.FileOutputStream;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/fourthline/adapters/kyc/BitmapSaverImpl;", "Lcom/fourthline/adapters/kyc/BitmapSaver;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "saveToFileSystem", "", "bitmap", "Landroid/graphics/Bitmap;", "fileName", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapSaverImpl implements BitmapSaver {
    private final Context context;

    public BitmapSaverImpl(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    @Override // com.fourthline.adapters.kyc.BitmapSaver
    public String saveToFileSystem(Bitmap bitmap, String fileName) {
        s.k(bitmap, "bitmap");
        s.k(fileName, "fileName");
        File file = new File(ContextExtensionsKt.getFourthlineDirectory(this.context).getPath(), fileName + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            b.a(fileOutputStream, null);
            String string = file.toURI().toString();
            s.j(string, "toString(...)");
            return string;
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
