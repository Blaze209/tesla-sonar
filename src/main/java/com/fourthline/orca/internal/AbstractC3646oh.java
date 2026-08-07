package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3646oh {
    public static final k3.i3 a(InterfaceC3903uh imageSource, p020r2.l lVar, int i11) {
        k3.i3 i3VarA;
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        lVar.o(-1474758806);
        if (p020r2.o.J()) {
            p020r2.o.S(-1474758806, i11, -1, "com.fourthline.orca.core.internal.composable.image.imageBitmap (ImageBitmap.kt:18)");
        }
        if (imageSource instanceof InterfaceC3903uh.a) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(((InterfaceC3903uh.a) imageSource).a().getAbsolutePath(), new BitmapFactory.Options());
            i3VarA = bitmapDecodeFile != null ? k3.n0.c(bitmapDecodeFile) : null;
        } else {
            if (!(imageSource instanceof InterfaceC3903uh.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i3VarA = e4.c.a(k3.i3.INSTANCE, ((InterfaceC3903uh.b) imageSource).a(), lVar, 6);
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return i3VarA;
    }
}
