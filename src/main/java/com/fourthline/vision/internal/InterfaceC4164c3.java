package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.media.Image;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4164c3 {
    D3 toMlKitFrame(Bitmap bitmap);

    D3 toMlKitFrame(Image image);

    D3 toMlKitFrame(Image image, int i11, int i12, C4165c4 c4165c4);
}
