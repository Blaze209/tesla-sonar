package androidx.media3.exoplayer.drm;

import a8.o2;
import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import s7.c0;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m.c f9814d = new m.c() { // from class: e8.m
        @Override // androidx.media3.exoplayer.drm.m.c
        public final androidx.media3.exoplayer.drm.m a(UUID uuid) {
            return androidx.media3.exoplayer.drm.n.n(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f9815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f9816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9817c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i11) {
            return mediaDrm.requiresSecureDecoder(str, i11);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, o2 o2Var) {
            LogSessionId logSessionIdA = o2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            e8.o.a(s7.a.f(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private n(UUID uuid) {
        s7.a.f(uuid);
        s7.a.b(!p7.h.f101349b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f9815a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f9816b = mediaDrm;
        this.f9817c = 1;
        if (p7.h.f101351d.equals(uuid) && B()) {
            x(mediaDrm);
        }
    }

    private boolean A() {
        if (!this.f9815a.equals(p7.h.f101351d)) {
            return this.f9815a.equals(p7.h.f101350c);
        }
        String strY = y("version");
        return (strY.startsWith("v5.") || strY.startsWith("14.") || strY.startsWith("15.") || strY.startsWith("16.0")) ? false : true;
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static n C(UUID uuid) throws UnsupportedDrmException {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e11) {
            throw new UnsupportedDrmException(1, e11);
        } catch (Exception e12) {
            throw new UnsupportedDrmException(2, e12);
        }
    }

    public static /* synthetic */ m n(UUID uuid) {
        try {
            return C(uuid);
        } catch (UnsupportedDrmException unused) {
            t.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    public static /* synthetic */ void o(n nVar, m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
        nVar.getClass();
        bVar.a(nVar, bArr, i11, i12, bArr2);
    }

    private static byte[] p(byte[] bArr) {
        c0 c0Var = new c0(bArr);
        int iZ = c0Var.z();
        short sB = c0Var.B();
        short sB2 = c0Var.B();
        if (sB != 1 || sB2 != 1) {
            t.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sB3 = c0Var.B();
        Charset charset = StandardCharsets.UTF_16LE;
        String strK = c0Var.K(sB3, charset);
        if (strK.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strK.indexOf("</DATA>");
        if (iIndexOf == -1) {
            t.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strK.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strK.substring(iIndexOf);
        int i11 = iZ + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i11);
        byteBufferAllocate.putShort(sB);
        byteBufferAllocate.putShort(sB2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String strY = y("version");
            if (Objects.equals(strY, "1.2") || Objects.equals(strY, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return p7.h.f101350c.equals(uuid) ? androidx.media3.exoplayer.drm.a.a(bArr) : bArr;
    }

    private static byte[] s(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        q9.p.a aVarD;
        UUID uuid2 = p7.h.f101352e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = q9.p.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = q9.p.a(uuid2, p(bArr));
        }
        if (v(uuid) && (aVarD = q9.p.d(bArr)) != null) {
            bArr = q9.p.b(p7.h.f101349b, aVarD.f105065d, aVarD.f105064c);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (bArrE = q9.p.e(bArr, uuid)) != null) {
                return bArrE;
            }
        }
        return bArr;
    }

    private static String t(UUID uuid, String str) {
        return (Build.VERSION.SDK_INT < 26 && p7.h.f101350c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return v(uuid) ? p7.h.f101349b : uuid;
    }

    private static boolean v(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, p7.h.f101350c);
    }

    private static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static p7.n.b z(UUID uuid, List<p7.n.b> list) {
        if (!p7.h.f101351d.equals(uuid)) {
            return list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            p7.n.b bVar = list.get(0);
            int i11 = 0;
            int length = 0;
            while (true) {
                if (i11 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr2 = (byte[]) s7.a.f(list.get(i13).f101438e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i12, length2);
                        i12 += length2;
                    }
                    return bVar.b(bArr);
                }
                p7.n.b bVar2 = list.get(i11);
                byte[] bArr3 = (byte[]) s7.a.f(bVar2.f101438e);
                if (!Objects.equals(bVar2.f101437d, bVar.f101437d) || !Objects.equals(bVar2.f101436c, bVar.f101436c) || !q9.p.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i11++;
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            p7.n.b bVar3 = list.get(i14);
            if (q9.p.g((byte[]) s7.a.f(bVar3.f101438e)) == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    public void D(String str, String str2) {
        this.f9816b.setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        return this.f9816b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f9816b.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] c() {
        return this.f9816b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        this.f9816b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] e(byte[] bArr, byte[] bArr2) {
        if (p7.h.f101350c.equals(this.f9815a)) {
            bArr2 = androidx.media3.exoplayer.drm.a.b(bArr2);
        }
        return this.f9816b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void f(byte[] bArr) throws DeniedByServerException {
        this.f9816b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int g() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean i(byte[] bArr, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 31 && A()) {
            MediaDrm mediaDrm = this.f9816b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(u(this.f9815a), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z11 = !this.f9815a.equals(p7.h.f101350c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z11;
                } catch (Throwable th2) {
                    th = th2;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void j(byte[] bArr) {
        this.f9816b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    @SuppressLint({"WrongConstant"})
    public m.a k(byte[] bArr, List<p7.n.b> list, int i11, HashMap<String, String> map) throws NotProvisionedException {
        p7.n.b bVarZ;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarZ = z(this.f9815a, list);
            bArrS = s(this.f9815a, (byte[]) s7.a.f(bVarZ.f101438e));
            strT = t(this.f9815a, bVarZ.f101437d);
        } else {
            bVarZ = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f9816b.getKeyRequest(bArr, bArrS, strT, i11, map);
        byte[] bArrR = r(this.f9815a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarZ != null && !TextUtils.isEmpty(bVarZ.f101436c)) {
            strQ = bVarZ.f101436c;
        }
        return new m.a(bArrR, strQ, keyRequest.getRequestType());
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void l(byte[] bArr, o2 o2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.f9816b, bArr, o2Var);
            } catch (UnsupportedOperationException unused) {
                t.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void m(final m.b bVar) {
        this.f9816b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: e8.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
                androidx.media3.exoplayer.drm.n.o(this.f62233a, bVar, mediaDrm, bArr, i11, i12, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.m
    public synchronized void release() {
        int i11 = this.f9817c - 1;
        this.f9817c = i11;
        if (i11 == 0) {
            this.f9816b.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public e8.l h(byte[] bArr) {
        return new e8.l(u(this.f9815a), bArr);
    }

    public String y(String str) {
        return this.f9816b.getPropertyString(str);
    }
}
