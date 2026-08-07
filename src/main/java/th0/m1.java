package th0;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzf0/t0;", "Lth0/a1$b;", DateTokenConverter.CONVERTER_KEY, "(Lzf0/t0;)Lth0/a1$b;", "", "a", "(Lth0/a1$b;)Ljava/lang/String;", "Lfi0/c;", "sdkFilesManager", "Ljn0/s;", "Lth0/a1;", "b", "(Lzf0/t0;Lfi0/c;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lth0/a1$b;", "selfie_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f114018b;

        static {
            int[] iArr = new int[a1.b.values().length];
            try {
                iArr[a1.b.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.b.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.b.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f114017a = iArr;
            int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
            try {
                iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f114018b = iArr2;
        }
    }

    public static final String a(a1.b bVar) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        int i11 = a.f114017a[bVar.ordinal()];
        if (i11 == 1) {
            return "center";
        }
        if (i11 == 2) {
            return "left";
        }
        if (i11 == 3) {
            return "right";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object b(zf0.t0 t0Var, fi0.c sdkFilesManager) {
        p013kotlin.jvm.internal.s.k(t0Var, "<this>");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File fileD = sdkFilesManager.d("jpg");
            Bitmap bitmap = t0Var.getBitmap();
            FileOutputStream fileOutputStream = new FileOutputStream(fileD);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                sn0.b.a(fileOutputStream, null);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                String absolutePath = fileD.getAbsolutePath();
                p013kotlin.jvm.internal.s.j(absolutePath, "getAbsolutePath(...)");
                return jn0.s.b(new a1.SelfieImage(absolutePath, a1.a.AUTO, d(t0Var), jCurrentTimeMillis));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e11) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(e11));
        }
    }

    public static final a1.b c(NextStep.Selfie.SelfiePose selfiePose) {
        p013kotlin.jvm.internal.s.k(selfiePose, "<this>");
        int i11 = a.f114018b[selfiePose.ordinal()];
        if (i11 == 1) {
            return a1.b.Center;
        }
        if (i11 == 2) {
            return a1.b.Left;
        }
        if (i11 == 3) {
            return a1.b.Right;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final a1.b d(zf0.t0 t0Var) {
        p013kotlin.jvm.internal.s.k(t0Var, "<this>");
        if (t0Var instanceof zf0.t0.a) {
            return a1.b.Center;
        }
        if (t0Var instanceof zf0.t0.b) {
            return a1.b.Left;
        }
        if (t0Var instanceof zf0.t0.c) {
            return a1.b.Right;
        }
        throw new NoWhenBranchMatchedException();
    }
}
