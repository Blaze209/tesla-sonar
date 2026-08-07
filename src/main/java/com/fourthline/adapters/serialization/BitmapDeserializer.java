package com.fourthline.adapters.serialization;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.io.FileInputStream;
import p013kotlin.Metadata;
import p013kotlin.io.NoSuchFileException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/adapters/serialization/BitmapDeserializer;", "", "<init>", "()V", "deserialize", "Landroid/graphics/Bitmap;", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapDeserializer {
    public final Bitmap deserialize(File file) throws NoSuchFileException {
        s.k(file, "file");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, null, 6, null);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(file));
        bitmapDecodeStream.getClass();
        return bitmapDecodeStream;
    }
}
