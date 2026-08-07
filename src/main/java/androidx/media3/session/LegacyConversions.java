package androidx.media3.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import ch.qos.logback.core.FileAppender;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes3.dex */
class LegacyConversions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.common.collect.b0<String> f11446a = com.google.common.collect.b0.v("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");

    public static class ConversionException extends Exception {
        private ConversionException(String str) {
            super(str);
        }
    }

    public static p7.y A(ha.l.h hVar) {
        return x(hVar.c());
    }

    public static p7.y B(String str, ha.k kVar, int i11) {
        p7.y.c cVar = new p7.y.c();
        if (str != null) {
            cVar.c(str);
        }
        String strH = kVar.h("android.media.metadata.MEDIA_URI");
        if (strH != null) {
            cVar.e(new p7.y.i.a().f(Uri.parse(strH)).d());
        }
        cVar.d(F(kVar, i11));
        return cVar.a();
    }

    public static List<p7.y> C(p7.r0 r0Var) {
        ArrayList arrayList = new ArrayList();
        p7.r0.d dVar = new p7.r0.d();
        for (int i11 = 0; i11 < r0Var.t(); i11++) {
            arrayList.add(r0Var.r(i11, dVar).f101483c);
        }
        return arrayList;
    }

    public static p7.e0 D(ha.j jVar, int i11) {
        return E(jVar, i11, false, true);
    }

    private static p7.e0 E(ha.j jVar, int i11, boolean z11, boolean z12) {
        byte[] bArrH;
        if (jVar == null) {
            return p7.e0.K;
        }
        p7.e0.b bVar = new p7.e0.b();
        bVar.o0(jVar.i()).W(jVar.b()).S(jVar.e()).u0(U(ha.q.m(i11)));
        Bitmap bitmapD = jVar.d();
        if (bitmapD != null) {
            try {
                bArrH = h(bitmapD);
            } catch (IOException e11) {
                s7.t.j("LegacyConversions", "Failed to convert iconBitmap to artworkData", e11);
                bArrH = null;
            }
            bVar.R(bArrH, 3);
        }
        Bundle bundleC = jVar.c();
        Bundle bundle = bundleC != null ? new Bundle(bundleC) : null;
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            bVar.b0(Integer.valueOf(n(bundle.getLong("android.media.extra.BT_FOLDER_TYPE"))));
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        bVar.d0(Boolean.valueOf(z11));
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            bVar.f0(Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            bVar.p0(com.google.common.collect.x.n((Collection) s7.a.f(bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"))));
        }
        if (bundle == null || !bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            bVar.q0(jVar.j());
        } else {
            bVar.q0(bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title"));
            bVar.Y(jVar.j());
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle != null && !bundle.isEmpty()) {
            bVar.a0(bundle);
        }
        bVar.e0(Boolean.valueOf(z12));
        return bVar.J();
    }

    public static p7.e0 F(ha.k kVar, int i11) {
        CharSequence charSequenceI;
        CharSequence charSequenceI2;
        if (kVar == null) {
            return p7.e0.K;
        }
        p7.e0.b bVar = new p7.e0.b();
        CharSequence charSequenceI3 = kVar.i("android.media.metadata.DISPLAY_TITLE");
        if (charSequenceI3 != null) {
            charSequenceI2 = kVar.i("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceI = kVar.i("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i12 = 0;
            int i13 = 0;
            while (i12 < 3) {
                String[] strArr = ha.k.f72365d;
                if (i13 >= strArr.length) {
                    break;
                }
                int i14 = i13 + 1;
                CharSequence charSequenceI4 = kVar.i(strArr[i13]);
                if (!TextUtils.isEmpty(charSequenceI4)) {
                    charSequenceArr[i12] = charSequenceI4;
                    i12++;
                }
                i13 = i14;
            }
            CharSequence charSequence = charSequenceArr[0];
            CharSequence charSequence2 = charSequenceArr[1];
            charSequenceI = charSequenceArr[2];
            charSequenceI3 = charSequence;
            charSequenceI2 = charSequence2;
        }
        CharSequence charSequenceI5 = kVar.i("android.media.metadata.TITLE");
        if (charSequenceI5 == null) {
            charSequenceI5 = charSequenceI3;
        }
        bVar.q0(charSequenceI5).Y(charSequenceI3).o0(charSequenceI2).W(charSequenceI).Q(kVar.i("android.media.metadata.ARTIST")).P(kVar.i("android.media.metadata.ALBUM")).O(kVar.i("android.media.metadata.ALBUM_ARTIST")).g0(U(kVar.g("android.media.metadata.RATING")));
        if (kVar.a("android.media.metadata.DURATION")) {
            long jE = kVar.e("android.media.metadata.DURATION");
            if (jE >= 0) {
                bVar.Z(Long.valueOf(jE));
            }
        }
        p7.k0 k0VarU = U(kVar.g("android.media.metadata.USER_RATING"));
        if (k0VarU != null) {
            bVar.u0(k0VarU);
        } else {
            bVar.u0(U(ha.q.m(i11)));
        }
        if (kVar.a("android.media.metadata.YEAR")) {
            bVar.j0(Integer.valueOf((int) kVar.e("android.media.metadata.YEAR")));
        }
        String strI0 = i0(kVar, "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI");
        if (strI0 != null) {
            bVar.S(Uri.parse(strI0));
        }
        Bitmap bitmapH0 = h0(kVar, "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART");
        if (bitmapH0 != null) {
            try {
                bVar.R(h(bitmapH0), 3);
            } catch (IOException e11) {
                s7.t.j("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e11);
            }
        }
        boolean zA = kVar.a("android.media.metadata.BT_FOLDER_TYPE");
        bVar.d0(Boolean.valueOf(zA));
        if (zA) {
            bVar.b0(Integer.valueOf(n(kVar.e("android.media.metadata.BT_FOLDER_TYPE"))));
        }
        if (kVar.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            bVar.f0(Integer.valueOf((int) kVar.e("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")));
        }
        bVar.e0(Boolean.TRUE);
        Bundle bundleD = kVar.d();
        com.google.common.collect.d1<String> it = f11446a.iterator();
        while (it.hasNext()) {
            bundleD.remove(it.next());
        }
        if (!bundleD.isEmpty()) {
            bVar.a0(bundleD);
        }
        return bVar.J();
    }

    public static p7.e0 G(CharSequence charSequence) {
        return charSequence == null ? p7.e0.K : new p7.e0.b().q0(charSequence).J();
    }

    public static ha.k H(p7.e0 e0Var, String str, Uri uri, long j11, Bitmap bitmap) {
        Long l11;
        ha.k.b bVarE = new ha.k.b().e("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = e0Var.f101276a;
        if (charSequence != null) {
            bVarE.f("android.media.metadata.TITLE", charSequence);
        }
        CharSequence charSequence2 = e0Var.f101280e;
        if (charSequence2 != null) {
            bVarE.f("android.media.metadata.DISPLAY_TITLE", charSequence2);
        }
        CharSequence charSequence3 = e0Var.f101281f;
        if (charSequence3 != null) {
            bVarE.f("android.media.metadata.DISPLAY_SUBTITLE", charSequence3);
        }
        CharSequence charSequence4 = e0Var.f101282g;
        if (charSequence4 != null) {
            bVarE.f("android.media.metadata.DISPLAY_DESCRIPTION", charSequence4);
        }
        CharSequence charSequence5 = e0Var.f101277b;
        if (charSequence5 != null) {
            bVarE.f("android.media.metadata.ARTIST", charSequence5);
        }
        CharSequence charSequence6 = e0Var.f101278c;
        if (charSequence6 != null) {
            bVarE.f("android.media.metadata.ALBUM", charSequence6);
        }
        CharSequence charSequence7 = e0Var.f101279d;
        if (charSequence7 != null) {
            bVarE.f("android.media.metadata.ALBUM_ARTIST", charSequence7);
        }
        Integer num = e0Var.f101295t;
        if (num != null) {
            bVarE.c("android.media.metadata.YEAR", num.intValue());
        }
        if (uri != null) {
            bVarE.e("android.media.metadata.MEDIA_URI", uri.toString());
        }
        Uri uri2 = e0Var.f101288m;
        if (uri2 != null) {
            bVarE.e("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            bVarE.e("android.media.metadata.ALBUM_ART_URI", e0Var.f101288m.toString());
            bVarE.e("android.media.metadata.ART_URI", e0Var.f101288m.toString());
        }
        if (bitmap != null) {
            bVarE.b("android.media.metadata.DISPLAY_ICON", bitmap);
            bVarE.b("android.media.metadata.ALBUM_ART", bitmap);
        }
        Integer num2 = e0Var.f101291p;
        if (num2 != null && num2.intValue() != -1) {
            bVarE.c("android.media.metadata.BT_FOLDER_TYPE", m(e0Var.f101291p.intValue()));
        }
        if (j11 == -9223372036854775807L && (l11 = e0Var.f101283h) != null) {
            j11 = l11.longValue();
        }
        if (j11 == -9223372036854775807L) {
            j11 = -1;
        }
        bVarE.c("android.media.metadata.DURATION", j11);
        ha.q qVarV = V(e0Var.f101284i);
        if (qVarV != null) {
            bVarE.d("android.media.metadata.USER_RATING", qVarV);
        }
        ha.q qVarV2 = V(e0Var.f101285j);
        if (qVarV2 != null) {
            bVarE.d("android.media.metadata.RATING", qVarV2);
        }
        Integer num3 = e0Var.H;
        if (num3 != null) {
            bVarE.c("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num3.intValue());
        }
        Bundle bundle = e0Var.I;
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = e0Var.I.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    bVarE.f(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    bVarE.c(str2, ((Number) obj).longValue());
                }
            }
        }
        return bVarE.a();
    }

    public static p7.r0.b I(int i11) {
        p7.r0.b bVar = new p7.r0.b();
        bVar.v(null, null, i11, -9223372036854775807L, 0L, p7.b.f101195g, true);
        return bVar;
    }

    public static boolean J(ha.p pVar) {
        if (pVar == null) {
            return false;
        }
        switch (pVar.q()) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return true;
            case 7:
            case 8:
            default:
                return false;
        }
    }

    public static PlaybackException K(ha.p pVar, Context context) {
        if (pVar == null || pVar.q() != 7) {
            return null;
        }
        CharSequence charSequenceH = pVar.h();
        if (charSequenceH == null) {
            charSequenceH = m0(b0(pVar.g()), context);
        }
        Bundle bundleI = pVar.i();
        String string = charSequenceH != null ? charSequenceH.toString() : null;
        int iL = L(pVar.g());
        if (bundleI == null) {
            bundleI = Bundle.EMPTY;
        }
        return new PlaybackException(string, null, iL, bundleI);
    }

    private static int L(int i11) {
        int iB0 = b0(i11);
        if (iB0 == -5) {
            return 2000;
        }
        if (iB0 != -1) {
            return iB0;
        }
        return 1000;
    }

    public static p7.i0 M(ha.p pVar) {
        return pVar == null ? p7.i0.f101376d : new p7.i0(pVar.k());
    }

    public static int N(ha.p pVar, ha.k kVar, long j11) {
        if (pVar == null) {
            return 1;
        }
        boolean zP = p(pVar, kVar, j11);
        switch (pVar.q()) {
            case 1:
                if (zP) {
                    return 4;
                }
            case 0:
            case 7:
            case 8:
                return 1;
            case 2:
                return zP ? 4 : 3;
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return 2;
            default:
                throw new ConversionException("Invalid state of PlaybackStateCompat: " + pVar.q());
        }
    }

    public static int O(int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                s7.t.i("LegacyConversions", "Unrecognized RepeatMode: " + i11 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i12;
    }

    public static int P(boolean z11) {
        return z11 ? 1 : 0;
    }

    public static int Q(p7.j0 j0Var, boolean z11) {
        if (j0Var.a() != null) {
            return 7;
        }
        int iG = j0Var.g();
        if (iG == 1) {
            return 0;
        }
        if (iG == 2) {
            return z11 ? 2 : 6;
        }
        if (iG == 3) {
            return z11 ? 2 : 3;
        }
        if (iG == 4) {
            return 1;
        }
        throw new IllegalArgumentException("Unrecognized State: " + iG);
    }

    public static p7.j0.b R(ha.p pVar, int i11, long j11, boolean z11) {
        p7.j0.b.a aVar = new p7.j0.b.a();
        long jB = pVar == null ? 0L : pVar.b();
        boolean zJ = J(pVar);
        if ((o0(jB, 4L) && !zJ) || ((o0(jB, 2L) && zJ) || o0(jB, 512L))) {
            aVar.a(1);
        }
        if (o0(jB, Http2Stream.EMIT_BUFFER_SIZE)) {
            aVar.a(2);
        }
        if ((o0(jB, 32768L) && o0(jB, 1024L)) || ((o0(jB, 65536L) && o0(jB, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) || (o0(jB, 131072L) && o0(jB, FileAppender.DEFAULT_BUFFER_SIZE)))) {
            aVar.c(31, 2);
        }
        if (o0(jB, 8L)) {
            aVar.a(11);
        }
        if (o0(jB, 64L)) {
            aVar.a(12);
        }
        if (o0(jB, 256L)) {
            aVar.c(5, 4);
        }
        if (o0(jB, 32L)) {
            aVar.c(9, 8);
        }
        if (o0(jB, 16L)) {
            aVar.c(7, 6);
        }
        if (o0(jB, 4194304L)) {
            aVar.a(13);
        }
        if (o0(jB, 1L)) {
            aVar.a(3);
        }
        if (i11 == 1) {
            aVar.c(26, 34);
        } else if (i11 == 2) {
            aVar.c(26, 34, 25, 33);
        }
        aVar.c(23, 17, 18, 16, 21, 32);
        if ((j11 & 4) != 0) {
            aVar.a(20);
            if (o0(jB, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
                aVar.a(10);
            }
        }
        if (z11) {
            if (o0(jB, 262144L)) {
                aVar.a(15);
            }
            if (o0(jB, 2097152L)) {
                aVar.a(14);
            }
        }
        return aVar.f();
    }

    public static ha.l.h S(p7.y yVar, int i11, Bitmap bitmap) {
        return new ha.l.h(w(yVar, bitmap), T(i11));
    }

    public static long T(int i11) {
        if (i11 == -1) {
            return -1L;
        }
        return i11;
    }

    public static p7.k0 U(ha.q qVar) {
        if (qVar == null) {
            return null;
        }
        switch (qVar.d()) {
            case 1:
                return qVar.g() ? new p7.w(qVar.f()) : new p7.w();
            case 2:
                return qVar.g() ? new p7.o0(qVar.h()) : new p7.o0();
            case 3:
                return qVar.g() ? new p7.l0(3, qVar.e()) : new p7.l0(3);
            case 4:
                return qVar.g() ? new p7.l0(4, qVar.e()) : new p7.l0(4);
            case 5:
                return qVar.g() ? new p7.l0(5, qVar.e()) : new p7.l0(5);
            case 6:
                return qVar.g() ? new p7.h0(qVar.b()) : new p7.h0();
            default:
                return null;
        }
    }

    @SuppressLint({"WrongConstant"})
    public static ha.q V(p7.k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        int iL0 = l0(k0Var);
        if (!k0Var.b()) {
            return ha.q.m(iL0);
        }
        switch (iL0) {
            case 1:
                return ha.q.i(((p7.w) k0Var).e());
            case 2:
                return ha.q.l(((p7.o0) k0Var).e());
            case 3:
            case 4:
            case 5:
                return ha.q.k(iL0, ((p7.l0) k0Var).f());
            case 6:
                return ha.q.j(((p7.h0) k0Var).e());
            default:
                return null;
        }
    }

    public static int W(int i11) {
        if (i11 == -1 || i11 == 0) {
            return 0;
        }
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                s7.t.i("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i11 + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i12;
    }

    public static Bundle X(q6 q6Var) {
        if (q6Var == null) {
            return null;
        }
        Bundle bundle = new Bundle(q6Var.f12152a);
        if (q6Var.f12152a.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY")) {
            boolean z11 = q6Var.f12152a.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
            bundle.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
            bundle.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z11 ? 1 : 3);
        }
        bundle.putBoolean("android.service.media.extra.RECENT", q6Var.f12153b);
        bundle.putBoolean("android.service.media.extra.OFFLINE", q6Var.f12154c);
        bundle.putBoolean("android.service.media.extra.SUGGESTED", q6Var.f12155d);
        return bundle;
    }

    public static te Y(ha.p pVar, boolean z11) {
        te.b bVar = new te.b();
        bVar.c();
        if (!z11) {
            bVar.f(40010);
        }
        if (pVar != null) {
            for (ha.p.d dVar : pVar.f()) {
                String strB = dVar.b();
                Bundle bundleD = dVar.d();
                if (bundleD == null) {
                    bundleD = Bundle.EMPTY;
                }
                bVar.a(new se(strB, bundleD));
            }
        }
        return bVar.e();
    }

    static ga.u Z(int i11, int i12, CharSequence charSequence, Bundle bundle, Context context) {
        if (i11 == 7 || i12 == 0) {
            return null;
        }
        int iB0 = b0(i12);
        String string = charSequence != null ? charSequence.toString() : m0(iB0, context);
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new ga.u(iB0, string, bundle);
    }

    @SuppressLint({"WrongConstant"})
    public static p7.d a(ha.a aVar) {
        return aVar == null ? p7.d.f101231h : new p7.d.e().c(aVar.a()).d(aVar.b()).g(aVar.d()).a();
    }

    public static ga.u a0(ha.p pVar, Context context) {
        if (pVar == null) {
            return null;
        }
        return Z(pVar.q(), pVar.g(), pVar.h(), pVar.i(), context);
    }

    public static p7.d b(ha.i.e eVar) {
        return eVar == null ? p7.d.f101231h : a(eVar.a());
    }

    private static int b0(int i11) {
        switch (i11) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static ha.a c(p7.d dVar) {
        return new ha.a.d().b(dVar.f101238a).c(dVar.f101239b).d(dVar.f101240c).a();
    }

    public static boolean c0(int i11) {
        if (i11 == -1 || i11 == 0) {
            return false;
        }
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized ShuffleMode: " + i11);
    }

    public static ha.e.h d(p7.y yVar, Bitmap bitmap) {
        ha.j jVarW = w(yVar, bitmap);
        p7.e0 e0Var = yVar.f101685e;
        Boolean bool = e0Var.f101292q;
        int i11 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = e0Var.f101293r;
        if (bool2 != null && bool2.booleanValue()) {
            i11 |= 2;
        }
        return new ha.e.h(jVarW, i11);
    }

    public static long d0(ha.p pVar, ha.k kVar, long j11) {
        return f(pVar, kVar, j11) - i(pVar, kVar, j11);
    }

    public static int e(ha.p pVar, ha.k kVar, long j11) {
        return me.c(f(pVar, kVar, j11), l(kVar));
    }

    public static p7.r0.d e0(p7.y yVar, int i11) {
        p7.r0.d dVar = new p7.r0.d();
        dVar.h(0, yVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i11, i11, 0L);
        return dVar;
    }

    public static long f(ha.p pVar, ha.k kVar, long j11) {
        long jD = pVar == null ? 0L : pVar.d();
        long jI = i(pVar, kVar, j11);
        long jL = l(kVar);
        return jL == -9223372036854775807L ? Math.max(jI, jD) : s7.q0.s(jD, jI, jL);
    }

    public static int f0(Bundle bundle) {
        return Math.max(0, bundle.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
    }

    public static Bundle g(androidx.media3.session.a aVar) {
        Bundle bundle = new Bundle();
        se seVar = aVar.f11456a;
        if (seVar != null) {
            bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID", seVar.f12348b);
        }
        bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL", aVar.f11461f.toString());
        Uri uri = aVar.f11460e;
        if (uri != null) {
            bundle.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI", uri.toString());
        }
        if (!aVar.f11462g.isEmpty()) {
            bundle.putBundle("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS", aVar.f11462g);
        }
        return bundle;
    }

    private static long g0(ha.p pVar, long j11) {
        return pVar.e(j11 == -9223372036854775807L ? null : Long.valueOf(j11));
    }

    private static byte[] h(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static Bitmap h0(ha.k kVar, String... strArr) {
        for (String str : strArr) {
            if (kVar.a(str)) {
                return kVar.c(str);
            }
        }
        return null;
    }

    public static long i(ha.p pVar, ha.k kVar, long j11) {
        if (pVar == null) {
            return 0L;
        }
        long jG0 = pVar.q() == 3 ? g0(pVar, j11) : pVar.m();
        long jL = l(kVar);
        return jL == -9223372036854775807L ? Math.max(0L, jG0) : s7.q0.s(jG0, 0L, jL);
    }

    private static String i0(ha.k kVar, String... strArr) {
        for (String str : strArr) {
            if (kVar.a(str)) {
                return kVar.h(str);
            }
        }
        return null;
    }

    public static p7.m j(ha.i.e eVar, String str) {
        if (eVar == null) {
            return p7.m.f101411e;
        }
        return new p7.m.b(eVar.d() == 2 ? 1 : 0).f(eVar.c()).h(str).e();
    }

    public static <T> T j0(Future<T> future, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = false;
        long j12 = j11;
        while (true) {
            try {
                try {
                    T t11 = future.get(j12, TimeUnit.MILLISECONDS);
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    return t11;
                } catch (InterruptedException unused) {
                    z11 = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= j11) {
                        throw new TimeoutException();
                    }
                    j12 = j11 - jElapsedRealtime2;
                }
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
    }

    public static int k(ha.i.e eVar) {
        if (eVar == null) {
            return 0;
        }
        return eVar.b();
    }

    public static int k0(p7.d dVar) {
        int iC = c(dVar).c();
        if (iC == Integer.MIN_VALUE) {
            return 3;
        }
        return iC;
    }

    public static long l(ha.k kVar) {
        if (kVar == null || !kVar.a("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jE = kVar.e("android.media.metadata.DURATION");
        if (jE <= 0) {
            return -9223372036854775807L;
        }
        return jE;
    }

    public static int l0(p7.k0 k0Var) {
        if (k0Var instanceof p7.w) {
            return 1;
        }
        if (k0Var instanceof p7.o0) {
            return 2;
        }
        if (!(k0Var instanceof p7.l0)) {
            return k0Var instanceof p7.h0 ? 6 : 0;
        }
        int iE = ((p7.l0) k0Var).e();
        int i11 = 3;
        if (iE != 3) {
            i11 = 4;
            if (iE != 4) {
                i11 = 5;
                if (iE != 5) {
                    return 0;
                }
            }
        }
        return i11;
    }

    private static long m(int i11) {
        switch (i11) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException("Unrecognized FolderType: " + i11);
        }
    }

    private static String m0(int i11, Context context) {
        if (i11 == -100) {
            return context.getString(ga.t.f67757f);
        }
        if (i11 == 1) {
            return context.getString(ga.t.f67760i);
        }
        if (i11 == -6) {
            return context.getString(ga.t.f67764m);
        }
        if (i11 == -5) {
            return context.getString(ga.t.f67762k);
        }
        if (i11 == -4) {
            return context.getString(ga.t.f67766o);
        }
        if (i11 == -3) {
            return context.getString(ga.t.f67754c);
        }
        if (i11 == -2) {
            return context.getString(ga.t.f67761j);
        }
        switch (i11) {
            case -110:
                return context.getString(ga.t.f67756e);
            case -109:
                return context.getString(ga.t.f67758g);
            case -108:
                return context.getString(ga.t.f67768q);
            case -107:
                return context.getString(ga.t.f67769r);
            case -106:
                return context.getString(ga.t.f67763l);
            case -105:
                return context.getString(ga.t.f67765n);
            case -104:
                return context.getString(ga.t.f67755d);
            case -103:
                return context.getString(ga.t.f67767p);
            case -102:
                return context.getString(ga.t.f67753b);
            default:
                return context.getString(ga.t.f67759h);
        }
    }

    private static int n(long j11) {
        if (j11 == 0) {
            return 0;
        }
        if (j11 == 1) {
            return 1;
        }
        if (j11 == 2) {
            return 2;
        }
        if (j11 == 3) {
            return 3;
        }
        if (j11 == 4) {
            return 4;
        }
        if (j11 == 5) {
            return 5;
        }
        return j11 == 6 ? 6 : 0;
    }

    private static CharSequence n0(String str, p7.e0 e0Var) {
        str.getClass();
        switch (str) {
            case "android.media.metadata.ARTIST":
                return e0Var.f101277b;
            case "android.media.metadata.WRITER":
                return e0Var.f101301z;
            case "android.media.metadata.DISPLAY_SUBTITLE":
                return e0Var.f101281f;
            case "android.media.metadata.COMPOSER":
                return e0Var.A;
            case "android.media.metadata.ALBUM":
                return e0Var.f101278c;
            case "android.media.metadata.TITLE":
                return e0Var.f101276a;
            case "android.media.metadata.ALBUM_ARTIST":
                return e0Var.f101279d;
            default:
                return null;
        }
    }

    public static boolean o(ha.i.e eVar) {
        return eVar != null && eVar.b() == 0;
    }

    private static boolean o0(long j11, long j12) {
        return (j11 & j12) != 0;
    }

    private static boolean p(ha.p pVar, ha.k kVar, long j11) {
        long jL = l(kVar);
        return jL != -9223372036854775807L && i(pVar, kVar, j11) >= jL;
    }

    public static boolean q(ha.p pVar) {
        return pVar != null && pVar.q() == 3;
    }

    public static boolean r(ha.k kVar) {
        return (kVar == null || kVar.e("android.media.metadata.ADVERTISEMENT") == 0) ? false : true;
    }

    public static int s(int i11) {
        if (i11 == -110) {
            return 8;
        }
        if (i11 == -109) {
            return 11;
        }
        if (i11 == -6) {
            return 2;
        }
        if (i11 == -2) {
            return 1;
        }
        if (i11 == 1) {
            return 10;
        }
        switch (i11) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static int t(PlaybackException playbackException) {
        return s(playbackException.f9018a);
    }

    public static q6 u(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i11 = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i11 >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z11 = true;
                if (i11 != 1) {
                    z11 = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z11);
            }
            return new q6.a().b(bundle).d(bundle.getBoolean("android.service.media.extra.RECENT")).c(bundle.getBoolean("android.service.media.extra.OFFLINE")).e(bundle.getBoolean("android.service.media.extra.SUGGESTED")).a();
        } catch (Exception unused) {
            return new q6.a().b(bundle).a();
        }
    }

    public static com.google.common.collect.x<androidx.media3.session.a> v(ha.p pVar, p7.j0.b bVar, Bundle bundle) {
        if (pVar == null) {
            return com.google.common.collect.x.r();
        }
        List<ha.p.d> listF = pVar.f();
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        for (ha.p.d dVar : listF) {
            String strB = dVar.b();
            Bundle bundleD = dVar.d();
            androidx.media3.session.a.b bVarD = new androidx.media3.session.a.b(bundleD != null ? bundleD.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0) : 0, dVar.e()).i(new se(strB, bundleD == null ? Bundle.EMPTY : bundleD)).c(dVar.f()).d(true);
            String string = bundleD != null ? bundleD.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT") : null;
            if (string != null) {
                Uri uri = Uri.parse(string);
                String scheme = uri.getScheme();
                if (Objects.equals(scheme, "content") || Objects.equals(scheme, "android.resource")) {
                    bVarD.g(uri);
                }
            }
            aVar.a(bVarD.a());
        }
        return androidx.media3.session.a.i(aVar.k(), bVar, bundle);
    }

    public static ha.j w(p7.y yVar, Bitmap bitmap) {
        CharSequence charSequence;
        CharSequence charSequence2;
        ha.j.c cVarF = new ha.j.c().f(yVar.f101681a.equals("") ? null : yVar.f101681a);
        p7.e0 e0Var = yVar.f101685e;
        if (bitmap != null) {
            cVarF.d(bitmap);
        }
        Bundle bundle = e0Var.I;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        Integer num = e0Var.f101291p;
        boolean z11 = (num == null || num.intValue() == -1) ? false : true;
        boolean z12 = e0Var.H != null;
        if (z11 || z12) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z11) {
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", m(((Integer) s7.a.f(e0Var.f101291p)).intValue()));
            }
            if (z12) {
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", ((Integer) s7.a.f(e0Var.H)).intValue());
            }
        }
        if (!e0Var.J.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(e0Var.J));
        }
        CharSequence charSequence3 = e0Var.f101280e;
        if (charSequence3 != null) {
            charSequence = e0Var.f101281f;
            charSequence2 = e0Var.f101282g;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", e0Var.f101276a);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i11 = 0;
            int i12 = 0;
            while (i11 < 3) {
                String[] strArr = ha.k.f72365d;
                if (i12 >= strArr.length) {
                    break;
                }
                int i13 = i12 + 1;
                CharSequence charSequenceN0 = n0(strArr[i12], e0Var);
                if (!TextUtils.isEmpty(charSequenceN0)) {
                    charSequenceArr[i11] = charSequenceN0;
                    i11++;
                }
                i12 = i13;
            }
            charSequence3 = charSequenceArr[0];
            charSequence = charSequenceArr[1];
            charSequence2 = charSequenceArr[2];
        }
        return cVarF.i(charSequence3).h(charSequence).b(charSequence2).e(e0Var.f101288m).g(yVar.f101688h.f101797a).c(bundle).a();
    }

    public static p7.y x(ha.j jVar) {
        s7.a.f(jVar);
        return y(jVar, false, true);
    }

    private static p7.y y(ha.j jVar, boolean z11, boolean z12) {
        String strG = jVar.g();
        p7.y.c cVar = new p7.y.c();
        if (strG == null) {
            strG = "";
        }
        return cVar.c(strG).e(new p7.y.i.a().f(jVar.h()).d()).d(E(jVar, 0, z11, z12)).a();
    }

    public static p7.y z(ha.k kVar, int i11) {
        return B(kVar.h("android.media.metadata.MEDIA_ID"), kVar, i11);
    }
}
