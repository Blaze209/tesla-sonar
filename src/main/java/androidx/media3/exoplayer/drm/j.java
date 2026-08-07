package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.util.List;
import java.util.Map;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    private static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(androidx.media3.datasource.a aVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        v7.o oVar = new v7.o(aVar);
        v7.j jVarA = new v7.j.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i11 = 0;
        v7.j jVarA2 = jVarA;
        while (true) {
            try {
                v7.h hVar = new v7.h(oVar, jVarA2);
                try {
                    byte[] bArrB = pu.a.b(hVar);
                    q0.p(hVar);
                    return bArrB;
                } catch (HttpDataSource$InvalidResponseCodeException e11) {
                    try {
                        String strC = c(e11, i11);
                        if (strC == null) {
                            throw e11;
                        }
                        i11++;
                        jVarA2 = jVarA2.a().j(strC).a();
                        q0.p(hVar);
                    } catch (Throwable th2) {
                        q0.p(hVar);
                        throw th2;
                    }
                }
            } catch (Exception e12) {
                throw new MediaDrmCallbackException(jVarA, oVar.p(), oVar.b(), oVar.o(), e12);
            }
        }
    }

    public static int b(Throwable th2, int i11) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return q0.i0(q0.j0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (a.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || d(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th2 instanceof KeysExpiredException) {
            return 6008;
        }
        if (i11 == 1) {
            return 6006;
        }
        if (i11 == 2) {
            return 6004;
        }
        if (i11 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i11) {
        Map<String, List<String>> map;
        List<String> list;
        int i12 = httpDataSource$InvalidResponseCodeException.f9128d;
        if ((i12 != 307 && i12 != 308) || i11 >= 5 || (map = httpDataSource$InvalidResponseCodeException.f9130f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
