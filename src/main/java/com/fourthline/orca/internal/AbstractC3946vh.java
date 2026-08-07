package com.fourthline.orca.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.util.Objects;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3946vh {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vh$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3689ph.b.values().length];
            try {
                iArr[EnumC3689ph.b.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3689ph.b.SVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3689ph.b.PNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final androidx.compose.ui.graphics.painter.b a(InterfaceC3903uh imageSource, p020r2.l lVar, int i11) {
        androidx.compose.ui.graphics.painter.b bVarC;
        androidx.compose.ui.graphics.painter.b bVar;
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        lVar.o(1476928365);
        if (p020r2.o.J()) {
            p020r2.o.S(1476928365, i11, -1, "com.fourthline.orca.core.internal.composable.image.imageSourcePainter (ImageSourcePainter.kt:26)");
        }
        if (!a(imageSource, (Context) lVar.U(AndroidCompositionLocals_androidKt.g()))) {
            InterfaceC3903uh.a aVar = imageSource instanceof InterfaceC3903uh.a ? (InterfaceC3903uh.a) imageSource : null;
            EnumC3689ph.b bVarB = aVar != null ? aVar.b() : null;
            Objects.toString(imageSource);
            Objects.toString(bVarB);
            bVarC = C2906Me.f26922a;
        } else if (imageSource instanceof InterfaceC3903uh.b) {
            lVar.o(-1101217779);
            bVarC = e4.e.c(((InterfaceC3903uh.b) imageSource).a(), lVar, 0);
            lVar.l();
        } else {
            if (!(imageSource instanceof InterfaceC3903uh.a)) {
                lVar.o(-1101219413);
                lVar.l();
                throw new NoWhenBranchMatchedException();
            }
            lVar.o(222075602);
            w4.d dVar = (w4.d) lVar.U(androidx.compose.ui.platform.z0.g());
            InterfaceC3903uh.a aVar2 = (InterfaceC3903uh.a) imageSource;
            int i12 = a.$EnumSwitchMapping$0[aVar2.b().ordinal()];
            if (i12 == 1) {
                lVar.o(222186892);
                lVar.o(-1101211338);
                boolean zN = lVar.n(aVar2);
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new Cp(aVar2.a(), dVar);
                    lVar.B(objI);
                }
                bVar = (Cp) objI;
                lVar.l();
                lVar.l();
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        lVar.o(-1101212772);
                        lVar.l();
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar.o(-1101204885);
                    lVar.l();
                    throw new IllegalStateException("FL Developer error. PNG painter is not supported yet!");
                }
                lVar.o(222287084);
                lVar.o(-1101208106);
                boolean zN2 = lVar.n(aVar2);
                Object objI2 = lVar.I();
                if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new GA(aVar2.a(), dVar);
                    lVar.B(objI2);
                }
                bVar = (GA) objI2;
                lVar.l();
                lVar.l();
            }
            bVarC = bVar;
            lVar.l();
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return bVarC;
    }

    private static final boolean a(InterfaceC3903uh interfaceC3903uh, Context context) {
        if (interfaceC3903uh instanceof InterfaceC3903uh.b) {
            return AbstractC3972w5.a(context, ((InterfaceC3903uh.b) interfaceC3903uh).a());
        }
        if (interfaceC3903uh instanceof InterfaceC3903uh.a) {
            return a(((InterfaceC3903uh.a) interfaceC3903uh).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean a(File file) {
        return (file.exists() && file.length() == 0) ? false : true;
    }
}
